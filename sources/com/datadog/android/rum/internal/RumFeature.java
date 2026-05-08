package com.datadog.android.rum.internal;

import android.app.ActivityManager;
import android.app.Application;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.feature.FeatureEventReceiver;
import com.datadog.android.api.feature.FeatureSdkCore;
import com.datadog.android.api.feature.StorageBackedFeature;
import com.datadog.android.api.net.RequestFactory;
import com.datadog.android.api.storage.DataWriter;
import com.datadog.android.api.storage.FeatureStorageConfiguration;
import com.datadog.android.api.storage.NoOpDataWriter;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.feature.event.JvmCrash;
import com.datadog.android.core.internal.system.BuildSdkVersionProvider;
import com.datadog.android.core.internal.utils.ConcurrencyExtKt;
import com.datadog.android.event.EventMapper;
import com.datadog.android.event.MapperSerializer;
import com.datadog.android.event.NoOpEventMapper;
import com.datadog.android.internal.telemetry.InternalTelemetryEvent;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumErrorSource;
import com.datadog.android.rum.RumMonitor;
import com.datadog.android.rum.RumSessionListener;
import com.datadog.android.rum.configuration.VitalsUpdateFrequency;
import com.datadog.android.rum.internal.anr.ANRDetectorRunnable;
import com.datadog.android.rum.internal.debug.UiRumDebugListener;
import com.datadog.android.rum.internal.domain.RumDataWriter;
import com.datadog.android.rum.internal.domain.event.RumEventMapper;
import com.datadog.android.rum.internal.domain.event.RumEventMetaSerializer;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.datadog.android.rum.internal.instrumentation.MainLooperLongTaskStrategy;
import com.datadog.android.rum.internal.instrumentation.UserActionTrackingStrategyApi29;
import com.datadog.android.rum.internal.instrumentation.UserActionTrackingStrategyLegacy;
import com.datadog.android.rum.internal.instrumentation.gestures.DatadogGesturesTracker;
import com.datadog.android.rum.internal.monitor.AdvancedRumMonitor;
import com.datadog.android.rum.internal.monitor.DatadogRumMonitor;
import com.datadog.android.rum.internal.thread.NoOpScheduledExecutorService;
import com.datadog.android.rum.internal.tracking.JetpackViewAttributesProvider;
import com.datadog.android.rum.internal.tracking.NoOpInteractionPredicate;
import com.datadog.android.rum.internal.tracking.NoOpUserActionTrackingStrategy;
import com.datadog.android.rum.internal.tracking.UserActionTrackingStrategy;
import com.datadog.android.rum.internal.vitals.AggregatingVitalMonitor;
import com.datadog.android.rum.internal.vitals.CPUVitalReader;
import com.datadog.android.rum.internal.vitals.JankStatsActivityLifecycleListener;
import com.datadog.android.rum.internal.vitals.MemoryVitalReader;
import com.datadog.android.rum.internal.vitals.NoOpVitalMonitor;
import com.datadog.android.rum.internal.vitals.VitalMonitor;
import com.datadog.android.rum.internal.vitals.VitalObserver;
import com.datadog.android.rum.internal.vitals.VitalReader;
import com.datadog.android.rum.internal.vitals.VitalReaderRunnable;
import com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier;
import com.datadog.android.rum.metric.interactiontonextview.NoOpLastInteractionIdentifier;
import com.datadog.android.rum.metric.interactiontonextview.TimeBasedInteractionIdentifier;
import com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier;
import com.datadog.android.rum.metric.networksettled.NoOpInitialResourceIdentifier;
import com.datadog.android.rum.metric.networksettled.TimeBasedInitialResourceIdentifier;
import com.datadog.android.rum.model.ActionEvent;
import com.datadog.android.rum.model.ErrorEvent;
import com.datadog.android.rum.model.LongTaskEvent;
import com.datadog.android.rum.model.ResourceEvent;
import com.datadog.android.rum.model.ViewEvent;
import com.datadog.android.rum.tracking.ActivityViewTrackingStrategy;
import com.datadog.android.rum.tracking.InteractionPredicate;
import com.datadog.android.rum.tracking.NoOpTrackingStrategy;
import com.datadog.android.rum.tracking.NoOpViewTrackingStrategy;
import com.datadog.android.rum.tracking.TrackingStrategy;
import com.datadog.android.rum.tracking.ViewAttributesProvider;
import com.datadog.android.rum.tracking.ViewTrackingStrategy;
import com.datadog.android.telemetry.model.TelemetryConfigurationEvent;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.ab8;
import defpackage.b0;
import defpackage.bs4;
import defpackage.d2f;
import defpackage.gu5;
import defpackage.ia;
import defpackage.j6g;
import defpackage.k6;
import defpackage.mj8;
import defpackage.ny0;
import defpackage.p6;
import defpackage.pyd;
import defpackage.u63;
import defpackage.w20;
import defpackage.wl7;
import defpackage.zr4;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 Ü\u00012\u00020\u00012\u00020\u0002:\u0004Ü\u0001Ý\u0001B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010 \u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u001f\u0010\u0015J\u0017\u0010%\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!H\u0001¢\u0006\u0004\b#\u0010$J%\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00160&2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020\u00112\u000e\u0010\u0017\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030)H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b/\u0010\u0013J\u0019\u00100\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b0\u0010\u0013J\u0017\u00103\u001a\u00020\u00112\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\u00112\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108J'\u0010=\u001a\u00020\u00112\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;2\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0011H\u0002¢\u0006\u0004\b?\u0010\u0015J\u0017\u0010B\u001a\u00020\u00112\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bB\u0010CJ\u001f\u0010E\u001a\u00020\u00112\u000e\u0010D\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030)H\u0002¢\u0006\u0004\bE\u0010+J\u001f\u0010F\u001a\u00020\u00112\u000e\u0010D\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030)H\u0002¢\u0006\u0004\bF\u0010+J\u000f\u0010G\u001a\u00020\u0011H\u0002¢\u0006\u0004\bG\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010HR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010I\u001a\u0004\bJ\u0010KR\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010L\u001a\u0004\bM\u0010NR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010OR(\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00160&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u001a\u0010W\u001a\u00020V8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\"\u0010\\\u001a\u00020[8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010b\u001a\u00020[8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bb\u0010]\u001a\u0004\bc\u0010_\"\u0004\bd\u0010aR\"\u0010e\u001a\u00020[8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\be\u0010]\u001a\u0004\bf\u0010_\"\u0004\bg\u0010aR\"\u0010i\u001a\u00020h8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010o\u001a\u00020h8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bo\u0010j\u001a\u0004\bp\u0010l\"\u0004\bq\u0010nR\"\u0010s\u001a\u00020r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\"\u0010z\u001a\u00020y8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR*\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R*\u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R*\u0010\u008e\u0001\u001a\u00030\u0087\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u0089\u0001\u001a\u0006\b\u008f\u0001\u0010\u008b\u0001\"\u0006\b\u0090\u0001\u0010\u008d\u0001R*\u0010\u0091\u0001\u001a\u00030\u0087\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u0089\u0001\u001a\u0006\b\u0092\u0001\u0010\u008b\u0001\"\u0006\b\u0093\u0001\u0010\u008d\u0001R1\u0010\u0096\u0001\u001a\n\u0012\u0005\u0012\u00030\u0095\u00010\u0094\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R,\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u0095\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R*\u0010£\u0001\u001a\u00030¢\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R*\u0010ª\u0001\u001a\u00030©\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001R\u001b\u0010°\u0001\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R,\u0010³\u0001\u001a\u0005\u0018\u00010²\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b³\u0001\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u0006\b·\u0001\u0010¸\u0001R&\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u0080.¢\u0006\u0016\n\u0005\b\u0010\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001\"\u0005\b¼\u0001\u0010\u0013R*\u0010¾\u0001\u001a\u00030½\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0006\bÂ\u0001\u0010Ã\u0001R*\u0010Å\u0001\u001a\u00030Ä\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÅ\u0001\u0010Æ\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001\"\u0006\bÉ\u0001\u0010Ê\u0001R \u0010Ï\u0001\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bË\u0001\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001R\u001d\u0010Ð\u0001\u001a\u00020\u00058\u0016X\u0096D¢\u0006\u000e\n\u0005\bÐ\u0001\u0010I\u001a\u0005\bÑ\u0001\u0010KR!\u0010Ö\u0001\u001a\u00030Ò\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÓ\u0001\u0010Ì\u0001\u001a\u0006\bÔ\u0001\u0010Õ\u0001R \u0010Ø\u0001\u001a\u00030×\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bØ\u0001\u0010Ù\u0001\u001a\u0006\bÚ\u0001\u0010Û\u0001¨\u0006Þ\u0001"}, d2 = {"Lcom/datadog/android/rum/internal/RumFeature;", "Lcom/datadog/android/api/feature/StorageBackedFeature;", "Lcom/datadog/android/api/feature/FeatureEventReceiver;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "", "applicationId", "Lcom/datadog/android/rum/internal/RumFeature$Configuration;", "configuration", "Lkotlin/Function1;", "Lcom/datadog/android/core/InternalSdkCore;", "Lcom/datadog/android/rum/internal/LateCrashReporter;", "lateCrashReporterFactory", "<init>", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Ljava/lang/String;Lcom/datadog/android/rum/internal/RumFeature$Configuration;Lkotlin/jvm/functions/Function1;)V", "Landroid/content/Context;", "appContext", "Lj6g;", "onInitialize", "(Landroid/content/Context;)V", "onStop", "()V", "", "event", "onReceive", "(Ljava/lang/Object;)V", "Lcom/datadog/android/rum/internal/monitor/AdvancedRumMonitor;", "advancedRumMonitor", "enableDebugging$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/internal/monitor/AdvancedRumMonitor;)V", "enableDebugging", "disableDebugging$dd_sdk_android_rum_release", "disableDebugging", "Ljava/util/concurrent/ExecutorService;", "rumEventsExecutorService", "consumeLastFatalAnr$dd_sdk_android_rum_release", "(Ljava/util/concurrent/ExecutorService;)V", "consumeLastFatalAnr", "Lcom/datadog/android/api/storage/DataWriter;", "createDataWriter", "(Lcom/datadog/android/rum/internal/RumFeature$Configuration;Lcom/datadog/android/core/InternalSdkCore;)Lcom/datadog/android/api/storage/DataWriter;", "", "handleMapLikeEvent", "(Ljava/util/Map;)V", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;", "handleTelemetryEvent", "(Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;)V", "registerTrackingStrategies", "unregisterTrackingStrategies", "Lcom/datadog/android/rum/configuration/VitalsUpdateFrequency;", "frequency", "initializeVitalMonitors", "(Lcom/datadog/android/rum/configuration/VitalsUpdateFrequency;)V", "", "periodInMs", "initializeVitalReaders", "(J)V", "Lcom/datadog/android/rum/internal/vitals/VitalReader;", "vitalReader", "Lcom/datadog/android/rum/internal/vitals/VitalObserver;", "vitalObserver", "initializeVitalMonitor", "(Lcom/datadog/android/rum/internal/vitals/VitalReader;Lcom/datadog/android/rum/internal/vitals/VitalObserver;J)V", "initializeANRDetector", "Lcom/datadog/android/core/feature/event/JvmCrash$Rum;", "crashEvent", "addJvmCrash", "(Lcom/datadog/android/core/feature/event/JvmCrash$Rum;)V", "loggerErrorEvent", "addLoggerError", "addLoggerErrorWithStacktrace", "addSessionReplaySkippedFrame", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "Ljava/lang/String;", "getApplicationId$dd_sdk_android_rum_release", "()Ljava/lang/String;", "Lcom/datadog/android/rum/internal/RumFeature$Configuration;", "getConfiguration$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/RumFeature$Configuration;", "Lkotlin/jvm/functions/Function1;", "dataWriter", "Lcom/datadog/android/api/storage/DataWriter;", "getDataWriter$dd_sdk_android_rum_release", "()Lcom/datadog/android/api/storage/DataWriter;", "setDataWriter$dd_sdk_android_rum_release", "(Lcom/datadog/android/api/storage/DataWriter;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getInitialized$dd_sdk_android_rum_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "", "sampleRate", "F", "getSampleRate$dd_sdk_android_rum_release", "()F", "setSampleRate$dd_sdk_android_rum_release", "(F)V", "telemetrySampleRate", "getTelemetrySampleRate$dd_sdk_android_rum_release", "setTelemetrySampleRate$dd_sdk_android_rum_release", "telemetryConfigurationSampleRate", "getTelemetryConfigurationSampleRate$dd_sdk_android_rum_release", "setTelemetryConfigurationSampleRate$dd_sdk_android_rum_release", "", "backgroundEventTracking", "Z", "getBackgroundEventTracking$dd_sdk_android_rum_release", "()Z", "setBackgroundEventTracking$dd_sdk_android_rum_release", "(Z)V", "trackFrustrations", "getTrackFrustrations$dd_sdk_android_rum_release", "setTrackFrustrations$dd_sdk_android_rum_release", "Lcom/datadog/android/rum/tracking/ViewTrackingStrategy;", "viewTrackingStrategy", "Lcom/datadog/android/rum/tracking/ViewTrackingStrategy;", "getViewTrackingStrategy$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/tracking/ViewTrackingStrategy;", "setViewTrackingStrategy$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/tracking/ViewTrackingStrategy;)V", "Lcom/datadog/android/rum/internal/tracking/UserActionTrackingStrategy;", "actionTrackingStrategy", "Lcom/datadog/android/rum/internal/tracking/UserActionTrackingStrategy;", "getActionTrackingStrategy$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/tracking/UserActionTrackingStrategy;", "setActionTrackingStrategy$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/internal/tracking/UserActionTrackingStrategy;)V", "Lcom/datadog/android/rum/tracking/TrackingStrategy;", "longTaskTrackingStrategy", "Lcom/datadog/android/rum/tracking/TrackingStrategy;", "getLongTaskTrackingStrategy$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/tracking/TrackingStrategy;", "setLongTaskTrackingStrategy$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/tracking/TrackingStrategy;)V", "Lcom/datadog/android/rum/internal/vitals/VitalMonitor;", "cpuVitalMonitor", "Lcom/datadog/android/rum/internal/vitals/VitalMonitor;", "getCpuVitalMonitor$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/vitals/VitalMonitor;", "setCpuVitalMonitor$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/internal/vitals/VitalMonitor;)V", "memoryVitalMonitor", "getMemoryVitalMonitor$dd_sdk_android_rum_release", "setMemoryVitalMonitor$dd_sdk_android_rum_release", "frameRateVitalMonitor", "getFrameRateVitalMonitor$dd_sdk_android_rum_release", "setFrameRateVitalMonitor$dd_sdk_android_rum_release", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "debugActivityLifecycleListener", "Ljava/util/concurrent/atomic/AtomicReference;", "getDebugActivityLifecycleListener$dd_sdk_android_rum_release", "()Ljava/util/concurrent/atomic/AtomicReference;", "setDebugActivityLifecycleListener$dd_sdk_android_rum_release", "(Ljava/util/concurrent/atomic/AtomicReference;)V", "jankStatsActivityLifecycleListener", "Landroid/app/Application$ActivityLifecycleCallbacks;", "getJankStatsActivityLifecycleListener$dd_sdk_android_rum_release", "()Landroid/app/Application$ActivityLifecycleCallbacks;", "setJankStatsActivityLifecycleListener$dd_sdk_android_rum_release", "(Landroid/app/Application$ActivityLifecycleCallbacks;)V", "Lcom/datadog/android/rum/RumSessionListener;", "sessionListener", "Lcom/datadog/android/rum/RumSessionListener;", "getSessionListener$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/RumSessionListener;", "setSessionListener$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/RumSessionListener;)V", "Ljava/util/concurrent/ScheduledExecutorService;", "vitalExecutorService", "Ljava/util/concurrent/ScheduledExecutorService;", "getVitalExecutorService$dd_sdk_android_rum_release", "()Ljava/util/concurrent/ScheduledExecutorService;", "setVitalExecutorService$dd_sdk_android_rum_release", "(Ljava/util/concurrent/ScheduledExecutorService;)V", "anrDetectorExecutorService", "Ljava/util/concurrent/ExecutorService;", "Lcom/datadog/android/rum/internal/anr/ANRDetectorRunnable;", "anrDetectorRunnable", "Lcom/datadog/android/rum/internal/anr/ANRDetectorRunnable;", "getAnrDetectorRunnable$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/anr/ANRDetectorRunnable;", "setAnrDetectorRunnable$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/internal/anr/ANRDetectorRunnable;)V", "Landroid/content/Context;", "getAppContext$dd_sdk_android_rum_release", "()Landroid/content/Context;", "setAppContext$dd_sdk_android_rum_release", "Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;", "initialResourceIdentifier", "Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;", "getInitialResourceIdentifier$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;", "setInitialResourceIdentifier$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;)V", "Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;", "lastInteractionIdentifier", "Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;", "getLastInteractionIdentifier$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;", "setLastInteractionIdentifier$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;)V", "lateCrashEventHandler$delegate", "Lkotlin/Lazy;", "getLateCrashEventHandler", "()Lcom/datadog/android/rum/internal/LateCrashReporter;", "lateCrashEventHandler", "name", "getName", "Lcom/datadog/android/api/net/RequestFactory;", "requestFactory$delegate", "getRequestFactory", "()Lcom/datadog/android/api/net/RequestFactory;", "requestFactory", "Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "storageConfiguration", "Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "getStorageConfiguration", "()Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "Companion", "Configuration", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class RumFeature implements StorageBackedFeature, FeatureEventReceiver {
    public static final float ALL_IN_SAMPLE_RATE = 100.0f;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final String DD_TELEMETRY_CONFIG_SAMPLE_RATE_TAG = "_dd.telemetry.configuration_sample_rate";
    public static final long DEFAULT_LONG_TASK_THRESHOLD_MS = 100;
    private static final Configuration DEFAULT_RUM_CONFIG;
    public static final float DEFAULT_SAMPLE_RATE = 100.0f;
    public static final float DEFAULT_TELEMETRY_CONFIGURATION_SAMPLE_RATE = 20.0f;
    public static final float DEFAULT_TELEMETRY_SAMPLE_RATE = 20.0f;
    public static final String DEVELOPER_MODE_SAMPLE_RATE_CHANGED_MESSAGE = "Developer mode enabled, setting RUM sample rate to 100%.";
    public static final String EVENT_ATTRIBUTES_PROPERTY = "attributes";
    public static final String EVENT_MESSAGE_PROPERTY = "message";
    public static final String EVENT_STACKTRACE_PROPERTY = "stacktrace";
    public static final String EVENT_THROWABLE_PROPERTY = "throwable";
    public static final String FAILED_TO_GET_HISTORICAL_EXIT_REASONS = "Couldn't get historical exit reasons";
    public static final String FLUSH_AND_STOP_MONITOR_MESSAGE_TYPE = "flush_and_stop_monitor";
    public static final String LOGGER_ERROR_BUS_MESSAGE_TYPE = "logger_error";
    public static final String LOGGER_ERROR_WITH_STACK_TRACE_MESSAGE_TYPE = "logger_error_with_stacktrace";
    public static final String LOG_ERROR_EVENT_MISSING_MANDATORY_FIELDS = "RUM feature received a log event where mandatory message field is either missing or has a wrong type.";
    public static final String LOG_ERROR_WITH_STACKTRACE_EVENT_MISSING_MANDATORY_FIELDS = "RUM feature received a log event with stacktrace where mandatory message field is either missing or has a wrong type.";
    public static final String NDK_CRASH_BUS_MESSAGE_TYPE = "ndk_crash";
    public static final String NO_LAST_RUM_VIEW_EVENT_AVAILABLE = "No last known RUM view event found, skipping fatal ANR reporting.";
    public static final String RUM_FEATURE_NOT_YET_INITIALIZED = "RUM feature is not initialized yet, you need to register it with a SDK instance by calling SdkCore#registerFeature method.";
    public static final String TELEMETRY_SESSION_REPLAY_SKIP_FRAME = "sr_skipped_frame";
    public static final String UNKNOWN_EVENT_TYPE_PROPERTY_VALUE = "RUM feature received an event with unknown value of \"type\" property=%s.";
    public static final String UNSUPPORTED_EVENT_TYPE = "RUM feature receive an event of unsupported type=%s.";
    public static final String WEB_VIEW_INGESTED_NOTIFICATION_MESSAGE_TYPE = "web_view_ingested_notification";
    private UserActionTrackingStrategy actionTrackingStrategy;
    private ExecutorService anrDetectorExecutorService;
    private ANRDetectorRunnable anrDetectorRunnable;
    public Context appContext;
    private final String applicationId;
    private boolean backgroundEventTracking;
    private final Configuration configuration;
    private VitalMonitor cpuVitalMonitor;
    private DataWriter<Object> dataWriter;
    private AtomicReference<Application.ActivityLifecycleCallbacks> debugActivityLifecycleListener;
    private VitalMonitor frameRateVitalMonitor;
    private InitialResourceIdentifier initialResourceIdentifier;
    private final AtomicBoolean initialized;
    private Application.ActivityLifecycleCallbacks jankStatsActivityLifecycleListener;
    private LastInteractionIdentifier lastInteractionIdentifier;

    /* JADX INFO: renamed from: lateCrashEventHandler$delegate, reason: from kotlin metadata */
    private final Lazy lateCrashEventHandler;
    private final Function1<InternalSdkCore, LateCrashReporter> lateCrashReporterFactory;
    private TrackingStrategy longTaskTrackingStrategy;
    private VitalMonitor memoryVitalMonitor;
    private final String name;

    /* JADX INFO: renamed from: requestFactory$delegate, reason: from kotlin metadata */
    private final Lazy requestFactory;
    private float sampleRate;
    private final FeatureSdkCore sdkCore;
    private RumSessionListener sessionListener;
    private final FeatureStorageConfiguration storageConfiguration;
    private float telemetryConfigurationSampleRate;
    private float telemetrySampleRate;
    private boolean trackFrustrations;
    private ViewTrackingStrategy viewTrackingStrategy;
    private ScheduledExecutorService vitalExecutorService;

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.RumFeature$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/datadog/android/rum/internal/DatadogLateCrashReporter;", "it", "Lcom/datadog/android/core/InternalSdkCore;", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements Function1<InternalSdkCore, DatadogLateCrashReporter> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final DatadogLateCrashReporter invoke(InternalSdkCore internalSdkCore) {
            internalSdkCore.getClass();
            return new DatadogLateCrashReporter(internalSdkCore, null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b@\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001Bù\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0014\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0014\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0014\u0012\u0006\u0010 \u001a\u00020\t\u0012\u0006\u0010!\u001a\u00020\t\u0012\u0006\u0010\"\u001a\u00020\t\u0012\u0006\u0010#\u001a\u00020$\u0012\u0006\u0010%\u001a\u00020&\u0012\u0006\u0010'\u001a\u00020(\u0012\u0006\u0010)\u001a\u00020*\u0012\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010,¢\u0006\u0002\u0010-J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003J\u000f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014HÆ\u0003J\u000f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00190\u0014HÆ\u0003J\u000f\u0010V\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014HÆ\u0003J\u000f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0014HÆ\u0003J\u000f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0014HÆ\u0003J\t\u0010Y\u001a\u00020\tHÆ\u0003J\t\u0010Z\u001a\u00020\tHÆ\u0003J\t\u0010[\u001a\u00020\tHÆ\u0003J\t\u0010\\\u001a\u00020$HÆ\u0003J\t\u0010]\u001a\u00020\u0005HÆ\u0003J\t\u0010^\u001a\u00020&HÆ\u0003J\t\u0010_\u001a\u00020(HÆ\u0003J\t\u0010`\u001a\u00020*HÆ\u0003J\u0015\u0010a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010,HÆ\u0003J\t\u0010b\u001a\u00020\u0005HÆ\u0003J\t\u0010c\u001a\u00020\u0005HÆ\u0003J\t\u0010d\u001a\u00020\tHÆ\u0003J\u000f\u0010e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\t\u0010f\u001a\u00020\u000eHÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0012HÆ\u0003J«\u0002\u0010i\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00142\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00142\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00142\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00142\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00142\b\b\u0002\u0010 \u001a\u00020\t2\b\b\u0002\u0010!\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020\t2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*2\u0014\b\u0002\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010,HÆ\u0001J\u0013\u0010j\u001a\u00020\t2\b\u0010k\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010l\u001a\u00020mHÖ\u0001J\t\u0010n\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u001d\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010,¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010 \u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014¢\u0006\b\n\u0000\u001a\u0004\b6\u0010/R\u0011\u0010'\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010)\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0014¢\u0006\b\n\u0000\u001a\u0004\b=\u0010/R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0014¢\u0006\b\n\u0000\u001a\u0004\b@\u0010/R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0014¢\u0006\b\n\u0000\u001a\u0004\bE\u0010/R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bF\u0010BR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bG\u0010BR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0011\u0010!\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bJ\u00103R\u0011\u0010\"\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bK\u00103R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bL\u00103R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\bM\u0010/R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0011\u0010#\u001a\u00020$¢\u0006\b\n\u0000\u001a\u0004\bP\u0010Q¨\u0006o"}, d2 = {"Lcom/datadog/android/rum/internal/RumFeature$Configuration;", "", "customEndpointUrl", "", "sampleRate", "", "telemetrySampleRate", "telemetryConfigurationSampleRate", "userActionTracking", "", "touchTargetExtraAttributesProviders", "", "Lcom/datadog/android/rum/tracking/ViewAttributesProvider;", "interactionPredicate", "Lcom/datadog/android/rum/tracking/InteractionPredicate;", "viewTrackingStrategy", "Lcom/datadog/android/rum/tracking/ViewTrackingStrategy;", "longTaskTrackingStrategy", "Lcom/datadog/android/rum/tracking/TrackingStrategy;", "viewEventMapper", "Lcom/datadog/android/event/EventMapper;", "Lcom/datadog/android/rum/model/ViewEvent;", "errorEventMapper", "Lcom/datadog/android/rum/model/ErrorEvent;", "resourceEventMapper", "Lcom/datadog/android/rum/model/ResourceEvent;", "actionEventMapper", "Lcom/datadog/android/rum/model/ActionEvent;", "longTaskEventMapper", "Lcom/datadog/android/rum/model/LongTaskEvent;", "telemetryConfigurationMapper", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent;", "backgroundEventTracking", "trackFrustrations", "trackNonFatalAnrs", "vitalsMonitorUpdateFrequency", "Lcom/datadog/android/rum/configuration/VitalsUpdateFrequency;", "sessionListener", "Lcom/datadog/android/rum/RumSessionListener;", "initialResourceIdentifier", "Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;", "lastInteractionIdentifier", "Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;", "additionalConfig", "", "(Ljava/lang/String;FFFZLjava/util/List;Lcom/datadog/android/rum/tracking/InteractionPredicate;Lcom/datadog/android/rum/tracking/ViewTrackingStrategy;Lcom/datadog/android/rum/tracking/TrackingStrategy;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/event/EventMapper;ZZZLcom/datadog/android/rum/configuration/VitalsUpdateFrequency;Lcom/datadog/android/rum/RumSessionListener;Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;Ljava/util/Map;)V", "getActionEventMapper", "()Lcom/datadog/android/event/EventMapper;", "getAdditionalConfig", "()Ljava/util/Map;", "getBackgroundEventTracking", "()Z", "getCustomEndpointUrl", "()Ljava/lang/String;", "getErrorEventMapper", "getInitialResourceIdentifier", "()Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;", "getInteractionPredicate", "()Lcom/datadog/android/rum/tracking/InteractionPredicate;", "getLastInteractionIdentifier", "()Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;", "getLongTaskEventMapper", "getLongTaskTrackingStrategy", "()Lcom/datadog/android/rum/tracking/TrackingStrategy;", "getResourceEventMapper", "getSampleRate", "()F", "getSessionListener", "()Lcom/datadog/android/rum/RumSessionListener;", "getTelemetryConfigurationMapper", "getTelemetryConfigurationSampleRate", "getTelemetrySampleRate", "getTouchTargetExtraAttributesProviders", "()Ljava/util/List;", "getTrackFrustrations", "getTrackNonFatalAnrs", "getUserActionTracking", "getViewEventMapper", "getViewTrackingStrategy", "()Lcom/datadog/android/rum/tracking/ViewTrackingStrategy;", "getVitalsMonitorUpdateFrequency", "()Lcom/datadog/android/rum/configuration/VitalsUpdateFrequency;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Configuration {
        private final EventMapper<ActionEvent> actionEventMapper;
        private final Map<String, Object> additionalConfig;
        private final boolean backgroundEventTracking;
        private final String customEndpointUrl;
        private final EventMapper<ErrorEvent> errorEventMapper;
        private final InitialResourceIdentifier initialResourceIdentifier;
        private final InteractionPredicate interactionPredicate;
        private final LastInteractionIdentifier lastInteractionIdentifier;
        private final EventMapper<LongTaskEvent> longTaskEventMapper;
        private final TrackingStrategy longTaskTrackingStrategy;
        private final EventMapper<ResourceEvent> resourceEventMapper;
        private final float sampleRate;
        private final RumSessionListener sessionListener;
        private final EventMapper<TelemetryConfigurationEvent> telemetryConfigurationMapper;
        private final float telemetryConfigurationSampleRate;
        private final float telemetrySampleRate;
        private final List<ViewAttributesProvider> touchTargetExtraAttributesProviders;
        private final boolean trackFrustrations;
        private final boolean trackNonFatalAnrs;
        private final boolean userActionTracking;
        private final EventMapper<ViewEvent> viewEventMapper;
        private final ViewTrackingStrategy viewTrackingStrategy;
        private final VitalsUpdateFrequency vitalsMonitorUpdateFrequency;

        /* JADX WARN: Multi-variable type inference failed */
        public Configuration(String str, float f, float f2, float f3, boolean z, List<? extends ViewAttributesProvider> list, InteractionPredicate interactionPredicate, ViewTrackingStrategy viewTrackingStrategy, TrackingStrategy trackingStrategy, EventMapper<ViewEvent> eventMapper, EventMapper<ErrorEvent> eventMapper2, EventMapper<ResourceEvent> eventMapper3, EventMapper<ActionEvent> eventMapper4, EventMapper<LongTaskEvent> eventMapper5, EventMapper<TelemetryConfigurationEvent> eventMapper6, boolean z2, boolean z3, boolean z4, VitalsUpdateFrequency vitalsUpdateFrequency, RumSessionListener rumSessionListener, InitialResourceIdentifier initialResourceIdentifier, LastInteractionIdentifier lastInteractionIdentifier, Map<String, ? extends Object> map) {
            list.getClass();
            interactionPredicate.getClass();
            eventMapper.getClass();
            eventMapper2.getClass();
            eventMapper3.getClass();
            eventMapper4.getClass();
            eventMapper5.getClass();
            eventMapper6.getClass();
            vitalsUpdateFrequency.getClass();
            rumSessionListener.getClass();
            initialResourceIdentifier.getClass();
            lastInteractionIdentifier.getClass();
            map.getClass();
            this.customEndpointUrl = str;
            this.sampleRate = f;
            this.telemetrySampleRate = f2;
            this.telemetryConfigurationSampleRate = f3;
            this.userActionTracking = z;
            this.touchTargetExtraAttributesProviders = list;
            this.interactionPredicate = interactionPredicate;
            this.viewTrackingStrategy = viewTrackingStrategy;
            this.longTaskTrackingStrategy = trackingStrategy;
            this.viewEventMapper = eventMapper;
            this.errorEventMapper = eventMapper2;
            this.resourceEventMapper = eventMapper3;
            this.actionEventMapper = eventMapper4;
            this.longTaskEventMapper = eventMapper5;
            this.telemetryConfigurationMapper = eventMapper6;
            this.backgroundEventTracking = z2;
            this.trackFrustrations = z3;
            this.trackNonFatalAnrs = z4;
            this.vitalsMonitorUpdateFrequency = vitalsUpdateFrequency;
            this.sessionListener = rumSessionListener;
            this.initialResourceIdentifier = initialResourceIdentifier;
            this.lastInteractionIdentifier = lastInteractionIdentifier;
            this.additionalConfig = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Configuration copy$default(Configuration configuration, String str, float f, float f2, float f3, boolean z, List list, InteractionPredicate interactionPredicate, ViewTrackingStrategy viewTrackingStrategy, TrackingStrategy trackingStrategy, EventMapper eventMapper, EventMapper eventMapper2, EventMapper eventMapper3, EventMapper eventMapper4, EventMapper eventMapper5, EventMapper eventMapper6, boolean z2, boolean z3, boolean z4, VitalsUpdateFrequency vitalsUpdateFrequency, RumSessionListener rumSessionListener, InitialResourceIdentifier initialResourceIdentifier, LastInteractionIdentifier lastInteractionIdentifier, Map map, int i, Object obj) {
            Map map2;
            LastInteractionIdentifier lastInteractionIdentifier2;
            String str2 = (i & 1) != 0 ? configuration.customEndpointUrl : str;
            float f4 = (i & 2) != 0 ? configuration.sampleRate : f;
            float f5 = (i & 4) != 0 ? configuration.telemetrySampleRate : f2;
            float f6 = (i & 8) != 0 ? configuration.telemetryConfigurationSampleRate : f3;
            boolean z5 = (i & 16) != 0 ? configuration.userActionTracking : z;
            List list2 = (i & 32) != 0 ? configuration.touchTargetExtraAttributesProviders : list;
            InteractionPredicate interactionPredicate2 = (i & 64) != 0 ? configuration.interactionPredicate : interactionPredicate;
            ViewTrackingStrategy viewTrackingStrategy2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? configuration.viewTrackingStrategy : viewTrackingStrategy;
            TrackingStrategy trackingStrategy2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? configuration.longTaskTrackingStrategy : trackingStrategy;
            EventMapper eventMapper7 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? configuration.viewEventMapper : eventMapper;
            EventMapper eventMapper8 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? configuration.errorEventMapper : eventMapper2;
            EventMapper eventMapper9 = (i & 2048) != 0 ? configuration.resourceEventMapper : eventMapper3;
            EventMapper eventMapper10 = (i & 4096) != 0 ? configuration.actionEventMapper : eventMapper4;
            EventMapper eventMapper11 = (i & 8192) != 0 ? configuration.longTaskEventMapper : eventMapper5;
            String str3 = str2;
            EventMapper eventMapper12 = (i & 16384) != 0 ? configuration.telemetryConfigurationMapper : eventMapper6;
            boolean z6 = (i & 32768) != 0 ? configuration.backgroundEventTracking : z2;
            boolean z7 = (i & 65536) != 0 ? configuration.trackFrustrations : z3;
            boolean z8 = (i & 131072) != 0 ? configuration.trackNonFatalAnrs : z4;
            VitalsUpdateFrequency vitalsUpdateFrequency2 = (i & 262144) != 0 ? configuration.vitalsMonitorUpdateFrequency : vitalsUpdateFrequency;
            RumSessionListener rumSessionListener2 = (i & 524288) != 0 ? configuration.sessionListener : rumSessionListener;
            InitialResourceIdentifier initialResourceIdentifier2 = (i & 1048576) != 0 ? configuration.initialResourceIdentifier : initialResourceIdentifier;
            LastInteractionIdentifier lastInteractionIdentifier3 = (i & 2097152) != 0 ? configuration.lastInteractionIdentifier : lastInteractionIdentifier;
            if ((i & 4194304) != 0) {
                lastInteractionIdentifier2 = lastInteractionIdentifier3;
                map2 = configuration.additionalConfig;
            } else {
                map2 = map;
                lastInteractionIdentifier2 = lastInteractionIdentifier3;
            }
            return configuration.copy(str3, f4, f5, f6, z5, list2, interactionPredicate2, viewTrackingStrategy2, trackingStrategy2, eventMapper7, eventMapper8, eventMapper9, eventMapper10, eventMapper11, eventMapper12, z6, z7, z8, vitalsUpdateFrequency2, rumSessionListener2, initialResourceIdentifier2, lastInteractionIdentifier2, map2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCustomEndpointUrl() {
            return this.customEndpointUrl;
        }

        public final EventMapper<ViewEvent> component10() {
            return this.viewEventMapper;
        }

        public final EventMapper<ErrorEvent> component11() {
            return this.errorEventMapper;
        }

        public final EventMapper<ResourceEvent> component12() {
            return this.resourceEventMapper;
        }

        public final EventMapper<ActionEvent> component13() {
            return this.actionEventMapper;
        }

        public final EventMapper<LongTaskEvent> component14() {
            return this.longTaskEventMapper;
        }

        public final EventMapper<TelemetryConfigurationEvent> component15() {
            return this.telemetryConfigurationMapper;
        }

        /* JADX INFO: renamed from: component16, reason: from getter */
        public final boolean getBackgroundEventTracking() {
            return this.backgroundEventTracking;
        }

        /* JADX INFO: renamed from: component17, reason: from getter */
        public final boolean getTrackFrustrations() {
            return this.trackFrustrations;
        }

        /* JADX INFO: renamed from: component18, reason: from getter */
        public final boolean getTrackNonFatalAnrs() {
            return this.trackNonFatalAnrs;
        }

        /* JADX INFO: renamed from: component19, reason: from getter */
        public final VitalsUpdateFrequency getVitalsMonitorUpdateFrequency() {
            return this.vitalsMonitorUpdateFrequency;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getSampleRate() {
            return this.sampleRate;
        }

        /* JADX INFO: renamed from: component20, reason: from getter */
        public final RumSessionListener getSessionListener() {
            return this.sessionListener;
        }

        /* JADX INFO: renamed from: component21, reason: from getter */
        public final InitialResourceIdentifier getInitialResourceIdentifier() {
            return this.initialResourceIdentifier;
        }

        /* JADX INFO: renamed from: component22, reason: from getter */
        public final LastInteractionIdentifier getLastInteractionIdentifier() {
            return this.lastInteractionIdentifier;
        }

        public final Map<String, Object> component23() {
            return this.additionalConfig;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getTelemetrySampleRate() {
            return this.telemetrySampleRate;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getTelemetryConfigurationSampleRate() {
            return this.telemetryConfigurationSampleRate;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getUserActionTracking() {
            return this.userActionTracking;
        }

        public final List<ViewAttributesProvider> component6() {
            return this.touchTargetExtraAttributesProviders;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final InteractionPredicate getInteractionPredicate() {
            return this.interactionPredicate;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final ViewTrackingStrategy getViewTrackingStrategy() {
            return this.viewTrackingStrategy;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final TrackingStrategy getLongTaskTrackingStrategy() {
            return this.longTaskTrackingStrategy;
        }

        public final Configuration copy(String customEndpointUrl, float sampleRate, float telemetrySampleRate, float telemetryConfigurationSampleRate, boolean userActionTracking, List<? extends ViewAttributesProvider> touchTargetExtraAttributesProviders, InteractionPredicate interactionPredicate, ViewTrackingStrategy viewTrackingStrategy, TrackingStrategy longTaskTrackingStrategy, EventMapper<ViewEvent> viewEventMapper, EventMapper<ErrorEvent> errorEventMapper, EventMapper<ResourceEvent> resourceEventMapper, EventMapper<ActionEvent> actionEventMapper, EventMapper<LongTaskEvent> longTaskEventMapper, EventMapper<TelemetryConfigurationEvent> telemetryConfigurationMapper, boolean backgroundEventTracking, boolean trackFrustrations, boolean trackNonFatalAnrs, VitalsUpdateFrequency vitalsMonitorUpdateFrequency, RumSessionListener sessionListener, InitialResourceIdentifier initialResourceIdentifier, LastInteractionIdentifier lastInteractionIdentifier, Map<String, ? extends Object> additionalConfig) {
            touchTargetExtraAttributesProviders.getClass();
            interactionPredicate.getClass();
            viewEventMapper.getClass();
            errorEventMapper.getClass();
            resourceEventMapper.getClass();
            actionEventMapper.getClass();
            longTaskEventMapper.getClass();
            telemetryConfigurationMapper.getClass();
            vitalsMonitorUpdateFrequency.getClass();
            sessionListener.getClass();
            initialResourceIdentifier.getClass();
            lastInteractionIdentifier.getClass();
            additionalConfig.getClass();
            return new Configuration(customEndpointUrl, sampleRate, telemetrySampleRate, telemetryConfigurationSampleRate, userActionTracking, touchTargetExtraAttributesProviders, interactionPredicate, viewTrackingStrategy, longTaskTrackingStrategy, viewEventMapper, errorEventMapper, resourceEventMapper, actionEventMapper, longTaskEventMapper, telemetryConfigurationMapper, backgroundEventTracking, trackFrustrations, trackNonFatalAnrs, vitalsMonitorUpdateFrequency, sessionListener, initialResourceIdentifier, lastInteractionIdentifier, additionalConfig);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) other;
            return wl7.b(this.customEndpointUrl, configuration.customEndpointUrl) && Float.compare(this.sampleRate, configuration.sampleRate) == 0 && Float.compare(this.telemetrySampleRate, configuration.telemetrySampleRate) == 0 && Float.compare(this.telemetryConfigurationSampleRate, configuration.telemetryConfigurationSampleRate) == 0 && this.userActionTracking == configuration.userActionTracking && wl7.b(this.touchTargetExtraAttributesProviders, configuration.touchTargetExtraAttributesProviders) && wl7.b(this.interactionPredicate, configuration.interactionPredicate) && wl7.b(this.viewTrackingStrategy, configuration.viewTrackingStrategy) && wl7.b(this.longTaskTrackingStrategy, configuration.longTaskTrackingStrategy) && wl7.b(this.viewEventMapper, configuration.viewEventMapper) && wl7.b(this.errorEventMapper, configuration.errorEventMapper) && wl7.b(this.resourceEventMapper, configuration.resourceEventMapper) && wl7.b(this.actionEventMapper, configuration.actionEventMapper) && wl7.b(this.longTaskEventMapper, configuration.longTaskEventMapper) && wl7.b(this.telemetryConfigurationMapper, configuration.telemetryConfigurationMapper) && this.backgroundEventTracking == configuration.backgroundEventTracking && this.trackFrustrations == configuration.trackFrustrations && this.trackNonFatalAnrs == configuration.trackNonFatalAnrs && this.vitalsMonitorUpdateFrequency == configuration.vitalsMonitorUpdateFrequency && wl7.b(this.sessionListener, configuration.sessionListener) && wl7.b(this.initialResourceIdentifier, configuration.initialResourceIdentifier) && wl7.b(this.lastInteractionIdentifier, configuration.lastInteractionIdentifier) && wl7.b(this.additionalConfig, configuration.additionalConfig);
        }

        public final EventMapper<ActionEvent> getActionEventMapper() {
            return this.actionEventMapper;
        }

        public final Map<String, Object> getAdditionalConfig() {
            return this.additionalConfig;
        }

        public final boolean getBackgroundEventTracking() {
            return this.backgroundEventTracking;
        }

        public final String getCustomEndpointUrl() {
            return this.customEndpointUrl;
        }

        public final EventMapper<ErrorEvent> getErrorEventMapper() {
            return this.errorEventMapper;
        }

        public final InitialResourceIdentifier getInitialResourceIdentifier() {
            return this.initialResourceIdentifier;
        }

        public final InteractionPredicate getInteractionPredicate() {
            return this.interactionPredicate;
        }

        public final LastInteractionIdentifier getLastInteractionIdentifier() {
            return this.lastInteractionIdentifier;
        }

        public final EventMapper<LongTaskEvent> getLongTaskEventMapper() {
            return this.longTaskEventMapper;
        }

        public final TrackingStrategy getLongTaskTrackingStrategy() {
            return this.longTaskTrackingStrategy;
        }

        public final EventMapper<ResourceEvent> getResourceEventMapper() {
            return this.resourceEventMapper;
        }

        public final float getSampleRate() {
            return this.sampleRate;
        }

        public final RumSessionListener getSessionListener() {
            return this.sessionListener;
        }

        public final EventMapper<TelemetryConfigurationEvent> getTelemetryConfigurationMapper() {
            return this.telemetryConfigurationMapper;
        }

        public final float getTelemetryConfigurationSampleRate() {
            return this.telemetryConfigurationSampleRate;
        }

        public final float getTelemetrySampleRate() {
            return this.telemetrySampleRate;
        }

        public final List<ViewAttributesProvider> getTouchTargetExtraAttributesProviders() {
            return this.touchTargetExtraAttributesProviders;
        }

        public final boolean getTrackFrustrations() {
            return this.trackFrustrations;
        }

        public final boolean getTrackNonFatalAnrs() {
            return this.trackNonFatalAnrs;
        }

        public final boolean getUserActionTracking() {
            return this.userActionTracking;
        }

        public final EventMapper<ViewEvent> getViewEventMapper() {
            return this.viewEventMapper;
        }

        public final ViewTrackingStrategy getViewTrackingStrategy() {
            return this.viewTrackingStrategy;
        }

        public final VitalsUpdateFrequency getVitalsMonitorUpdateFrequency() {
            return this.vitalsMonitorUpdateFrequency;
        }

        public int hashCode() {
            String str = this.customEndpointUrl;
            int iHashCode = (this.interactionPredicate.hashCode() + ia.g(this.touchTargetExtraAttributesProviders, ia.f(k6.c(k6.c(k6.c((str == null ? 0 : str.hashCode()) * 31, this.sampleRate, 31), this.telemetrySampleRate, 31), this.telemetryConfigurationSampleRate, 31), 31, this.userActionTracking), 31)) * 31;
            ViewTrackingStrategy viewTrackingStrategy = this.viewTrackingStrategy;
            int iHashCode2 = (iHashCode + (viewTrackingStrategy == null ? 0 : viewTrackingStrategy.hashCode())) * 31;
            TrackingStrategy trackingStrategy = this.longTaskTrackingStrategy;
            return this.additionalConfig.hashCode() + ((this.lastInteractionIdentifier.hashCode() + ((this.initialResourceIdentifier.hashCode() + ((this.sessionListener.hashCode() + ((this.vitalsMonitorUpdateFrequency.hashCode() + ia.f(ia.f(ia.f((this.telemetryConfigurationMapper.hashCode() + ((this.longTaskEventMapper.hashCode() + ((this.actionEventMapper.hashCode() + ((this.resourceEventMapper.hashCode() + ((this.errorEventMapper.hashCode() + ((this.viewEventMapper.hashCode() + ((iHashCode2 + (trackingStrategy != null ? trackingStrategy.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.backgroundEventTracking), 31, this.trackFrustrations), 31, this.trackNonFatalAnrs)) * 31)) * 31)) * 31)) * 31);
        }

        public String toString() {
            String str = this.customEndpointUrl;
            float f = this.sampleRate;
            float f2 = this.telemetrySampleRate;
            float f3 = this.telemetryConfigurationSampleRate;
            boolean z = this.userActionTracking;
            List<ViewAttributesProvider> list = this.touchTargetExtraAttributesProviders;
            InteractionPredicate interactionPredicate = this.interactionPredicate;
            ViewTrackingStrategy viewTrackingStrategy = this.viewTrackingStrategy;
            TrackingStrategy trackingStrategy = this.longTaskTrackingStrategy;
            EventMapper<ViewEvent> eventMapper = this.viewEventMapper;
            EventMapper<ErrorEvent> eventMapper2 = this.errorEventMapper;
            EventMapper<ResourceEvent> eventMapper3 = this.resourceEventMapper;
            EventMapper<ActionEvent> eventMapper4 = this.actionEventMapper;
            EventMapper<LongTaskEvent> eventMapper5 = this.longTaskEventMapper;
            EventMapper<TelemetryConfigurationEvent> eventMapper6 = this.telemetryConfigurationMapper;
            boolean z2 = this.backgroundEventTracking;
            boolean z3 = this.trackFrustrations;
            boolean z4 = this.trackNonFatalAnrs;
            VitalsUpdateFrequency vitalsUpdateFrequency = this.vitalsMonitorUpdateFrequency;
            RumSessionListener rumSessionListener = this.sessionListener;
            InitialResourceIdentifier initialResourceIdentifier = this.initialResourceIdentifier;
            LastInteractionIdentifier lastInteractionIdentifier = this.lastInteractionIdentifier;
            Map<String, Object> map = this.additionalConfig;
            StringBuilder sb = new StringBuilder("Configuration(customEndpointUrl=");
            sb.append(str);
            sb.append(", sampleRate=");
            sb.append(f);
            sb.append(", telemetrySampleRate=");
            sb.append(f2);
            sb.append(", telemetryConfigurationSampleRate=");
            sb.append(f3);
            sb.append(", userActionTracking=");
            sb.append(z);
            sb.append(", touchTargetExtraAttributesProviders=");
            sb.append(list);
            sb.append(", interactionPredicate=");
            sb.append(interactionPredicate);
            sb.append(", viewTrackingStrategy=");
            sb.append(viewTrackingStrategy);
            sb.append(", longTaskTrackingStrategy=");
            sb.append(trackingStrategy);
            sb.append(", viewEventMapper=");
            sb.append(eventMapper);
            sb.append(", errorEventMapper=");
            sb.append(eventMapper2);
            sb.append(", resourceEventMapper=");
            sb.append(eventMapper3);
            sb.append(", actionEventMapper=");
            sb.append(eventMapper4);
            sb.append(", longTaskEventMapper=");
            sb.append(eventMapper5);
            sb.append(", telemetryConfigurationMapper=");
            sb.append(eventMapper6);
            sb.append(", backgroundEventTracking=");
            sb.append(z2);
            sb.append(", trackFrustrations=");
            p6.j(sb, z3, ", trackNonFatalAnrs=", z4, ", vitalsMonitorUpdateFrequency=");
            sb.append(vitalsUpdateFrequency);
            sb.append(", sessionListener=");
            sb.append(rumSessionListener);
            sb.append(", initialResourceIdentifier=");
            sb.append(initialResourceIdentifier);
            sb.append(", lastInteractionIdentifier=");
            sb.append(lastInteractionIdentifier);
            sb.append(", additionalConfig=");
            return b0.k(sb, map, ")");
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.RumFeature$handleMapLikeEvent$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements gu5<String> {
        final /* synthetic */ Map<?, ?> $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Map<?, ?> map) {
            super(0);
            this.$event = map;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, RumFeature.UNKNOWN_EVENT_TYPE_PROPERTY_VALUE, Arrays.copyOf(new Object[]{this.$event.get("type")}, 1));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.RumFeature$onReceive$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05821 extends mj8 implements gu5<String> {
        final /* synthetic */ Object $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05821(Object obj) {
            super(0);
            this.$event = obj;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, RumFeature.UNSUPPORTED_EVENT_TYPE, Arrays.copyOf(new Object[]{this.$event.getClass().getCanonicalName()}, 1));
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        DEFAULT_RUM_CONFIG = new Configuration(null, 100.0f, 20.0f, 20.0f, true, zr4.a, new NoOpInteractionPredicate(), new ActivityViewTrackingStrategy(false, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0), new MainLooperLongTaskStrategy(100L), new NoOpEventMapper(), new NoOpEventMapper(), new NoOpEventMapper(), new NoOpEventMapper(), new NoOpEventMapper(), new NoOpEventMapper(), false, true, Companion.isTrackNonFatalAnrsEnabledByDefault$dd_sdk_android_rum_release$default(companion, null, 1, null), VitalsUpdateFrequency.AVERAGE, new NoOpRumSessionListener(), new TimeBasedInitialResourceIdentifier(0L, 1, null), new TimeBasedInteractionIdentifier(0L, 1, null), bs4.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RumFeature(FeatureSdkCore featureSdkCore, String str, Configuration configuration, Function1<? super InternalSdkCore, ? extends LateCrashReporter> function1) {
        featureSdkCore.getClass();
        str.getClass();
        configuration.getClass();
        function1.getClass();
        this.sdkCore = featureSdkCore;
        this.applicationId = str;
        this.configuration = configuration;
        this.lateCrashReporterFactory = function1;
        this.dataWriter = new NoOpDataWriter();
        this.initialized = new AtomicBoolean(false);
        this.viewTrackingStrategy = new NoOpViewTrackingStrategy();
        this.actionTrackingStrategy = new NoOpUserActionTrackingStrategy();
        this.longTaskTrackingStrategy = new NoOpTrackingStrategy();
        this.cpuVitalMonitor = new NoOpVitalMonitor();
        this.memoryVitalMonitor = new NoOpVitalMonitor();
        this.frameRateVitalMonitor = new NoOpVitalMonitor();
        this.debugActivityLifecycleListener = new AtomicReference<>(null);
        this.sessionListener = new NoOpRumSessionListener();
        this.vitalExecutorService = new NoOpScheduledExecutorService();
        this.initialResourceIdentifier = new NoOpInitialResourceIdentifier();
        this.lastInteractionIdentifier = new NoOpLastInteractionIdentifier();
        this.lateCrashEventHandler = new d2f(new RumFeature$lateCrashEventHandler$2(this));
        this.name = "rum";
        this.requestFactory = new d2f(new RumFeature$requestFactory$2(this));
        this.storageConfiguration = FeatureStorageConfiguration.INSTANCE.getDEFAULT();
    }

    private final void addJvmCrash(JvmCrash.Rum crashEvent) {
        RumMonitor rumMonitor = GlobalRumMonitor.get(this.sdkCore);
        AdvancedRumMonitor advancedRumMonitor = rumMonitor instanceof AdvancedRumMonitor ? (AdvancedRumMonitor) rumMonitor : null;
        if (advancedRumMonitor != null) {
            advancedRumMonitor.addCrash(crashEvent.getMessage(), RumErrorSource.SOURCE, crashEvent.getThrowable(), crashEvent.getThreads());
        }
    }

    private final void addLoggerError(Map<?, ?> loggerErrorEvent) {
        Object obj = loggerErrorEvent.get(EVENT_THROWABLE_PROPERTY);
        Throwable th = obj instanceof Throwable ? (Throwable) obj : null;
        Object obj2 = loggerErrorEvent.get("message");
        String str = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = loggerErrorEvent.get(EVENT_ATTRIBUTES_PROPERTY);
        Map<String, ? extends Object> map = obj3 instanceof Map ? (Map) obj3 : null;
        FeatureSdkCore featureSdkCore = this.sdkCore;
        if (str == null) {
            InternalLogger.DefaultImpls.log$default(featureSdkCore.getInternalLogger(), InternalLogger.Level.WARN, u63.a0(InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY), (gu5) C05791.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
            return;
        }
        RumMonitor rumMonitor = GlobalRumMonitor.get(featureSdkCore);
        AdvancedRumMonitor advancedRumMonitor = rumMonitor instanceof AdvancedRumMonitor ? (AdvancedRumMonitor) rumMonitor : null;
        if (advancedRumMonitor != null) {
            RumErrorSource rumErrorSource = RumErrorSource.LOGGER;
            if (map == null) {
                map = bs4.a;
            }
            advancedRumMonitor.addError(str, rumErrorSource, th, map);
        }
    }

    private final void addLoggerErrorWithStacktrace(Map<?, ?> loggerErrorEvent) {
        Object obj = loggerErrorEvent.get("stacktrace");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = loggerErrorEvent.get("message");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = loggerErrorEvent.get(EVENT_ATTRIBUTES_PROPERTY);
        Map<String, ? extends Object> map = obj3 instanceof Map ? (Map) obj3 : null;
        FeatureSdkCore featureSdkCore = this.sdkCore;
        if (str2 == null) {
            InternalLogger.DefaultImpls.log$default(featureSdkCore.getInternalLogger(), InternalLogger.Level.WARN, u63.a0(InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY), (gu5) C05801.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
            return;
        }
        RumMonitor rumMonitor = GlobalRumMonitor.get(featureSdkCore);
        AdvancedRumMonitor advancedRumMonitor = rumMonitor instanceof AdvancedRumMonitor ? (AdvancedRumMonitor) rumMonitor : null;
        if (advancedRumMonitor != null) {
            RumErrorSource rumErrorSource = RumErrorSource.LOGGER;
            if (map == null) {
                map = bs4.a;
            }
            advancedRumMonitor.addErrorWithStacktrace(str2, rumErrorSource, str, map);
        }
    }

    private final void addSessionReplaySkippedFrame() {
        RumMonitor rumMonitor = GlobalRumMonitor.get(this.sdkCore);
        AdvancedRumMonitor advancedRumMonitor = rumMonitor instanceof AdvancedRumMonitor ? (AdvancedRumMonitor) rumMonitor : null;
        if (advancedRumMonitor != null) {
            advancedRumMonitor.addSessionReplaySkippedFrame();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void consumeLastFatalAnr$lambda$6(RumFeature rumFeature, ApplicationExitInfo applicationExitInfo) {
        rumFeature.getClass();
        applicationExitInfo.getClass();
        FeatureSdkCore featureSdkCore = rumFeature.sdkCore;
        featureSdkCore.getClass();
        ab8 lastViewEvent = ((InternalSdkCore) featureSdkCore).getLastViewEvent();
        if (lastViewEvent != null) {
            rumFeature.getLateCrashEventHandler().handleAnrCrash(applicationExitInfo, lastViewEvent, rumFeature.dataWriter);
        } else {
            InternalLogger.DefaultImpls.log$default(rumFeature.sdkCore.getInternalLogger(), InternalLogger.Level.INFO, InternalLogger.Target.USER, (gu5) RumFeature$consumeLastFatalAnr$1$1.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
        }
    }

    private final DataWriter<Object> createDataWriter(Configuration configuration, InternalSdkCore sdkCore) {
        return new RumDataWriter(new MapperSerializer(new RumEventMapper(configuration.getViewEventMapper(), configuration.getErrorEventMapper(), configuration.getResourceEventMapper(), configuration.getActionEventMapper(), configuration.getLongTaskEventMapper(), configuration.getTelemetryConfigurationMapper(), sdkCore.getInternalLogger()), new RumEventSerializer(sdkCore.getInternalLogger(), null, 2, 0 == true ? 1 : 0)), new RumEventMetaSerializer(), sdkCore);
    }

    private final LateCrashReporter getLateCrashEventHandler() {
        return (LateCrashReporter) this.lateCrashEventHandler.getValue();
    }

    private final void handleMapLikeEvent(Map<?, ?> event) throws InterruptedException {
        Object obj = event.get("type");
        if (wl7.b(obj, "ndk_crash")) {
            getLateCrashEventHandler().handleNdkCrashEvent(event, this.dataWriter);
            return;
        }
        if (wl7.b(obj, LOGGER_ERROR_BUS_MESSAGE_TYPE)) {
            addLoggerError(event);
            return;
        }
        if (wl7.b(obj, LOGGER_ERROR_WITH_STACK_TRACE_MESSAGE_TYPE)) {
            addLoggerErrorWithStacktrace(event);
            return;
        }
        if (wl7.b(obj, WEB_VIEW_INGESTED_NOTIFICATION_MESSAGE_TYPE)) {
            RumMonitor rumMonitor = GlobalRumMonitor.get(this.sdkCore);
            AdvancedRumMonitor advancedRumMonitor = rumMonitor instanceof AdvancedRumMonitor ? (AdvancedRumMonitor) rumMonitor : null;
            if (advancedRumMonitor != null) {
                advancedRumMonitor.sendWebViewEvent();
                return;
            }
            return;
        }
        if (wl7.b(obj, TELEMETRY_SESSION_REPLAY_SKIP_FRAME)) {
            addSessionReplaySkippedFrame();
            return;
        }
        boolean zB = wl7.b(obj, FLUSH_AND_STOP_MONITOR_MESSAGE_TYPE);
        FeatureSdkCore featureSdkCore = this.sdkCore;
        if (!zB) {
            InternalLogger.DefaultImpls.log$default(featureSdkCore.getInternalLogger(), InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) new AnonymousClass2(event), (Throwable) null, false, (Map) null, 56, (Object) null);
            return;
        }
        RumMonitor rumMonitor2 = GlobalRumMonitor.get(featureSdkCore);
        DatadogRumMonitor datadogRumMonitor = rumMonitor2 instanceof DatadogRumMonitor ? (DatadogRumMonitor) rumMonitor2 : null;
        if (datadogRumMonitor != null) {
            datadogRumMonitor.stopKeepAliveCallback$dd_sdk_android_rum_release();
            datadogRumMonitor.drainExecutorService$dd_sdk_android_rum_release();
        }
    }

    private final void handleTelemetryEvent(InternalTelemetryEvent event) {
        RumMonitor rumMonitor = GlobalRumMonitor.get(this.sdkCore);
        AdvancedRumMonitor advancedRumMonitor = rumMonitor instanceof AdvancedRumMonitor ? (AdvancedRumMonitor) rumMonitor : null;
        if (advancedRumMonitor == null) {
            return;
        }
        advancedRumMonitor.sendTelemetryEvent(event);
    }

    private final void initializeANRDetector() {
        ANRDetectorRunnable aNRDetectorRunnable = new ANRDetectorRunnable(this.sdkCore, new Handler(Looper.getMainLooper()), 0L, 0L, 12, null);
        ExecutorService executorServiceCreateSingleThreadExecutorService = this.sdkCore.createSingleThreadExecutorService("rum-anr-detection");
        this.anrDetectorExecutorService = executorServiceCreateSingleThreadExecutorService;
        if (executorServiceCreateSingleThreadExecutorService != null) {
            ConcurrencyExtKt.executeSafe(executorServiceCreateSingleThreadExecutorService, "ANR detection", this.sdkCore.getInternalLogger(), aNRDetectorRunnable);
        }
        this.anrDetectorRunnable = aNRDetectorRunnable;
    }

    private final void initializeVitalMonitor(VitalReader vitalReader, VitalObserver vitalObserver, long periodInMs) {
        VitalReaderRunnable vitalReaderRunnable = new VitalReaderRunnable(this.sdkCore, vitalReader, vitalObserver, this.vitalExecutorService, periodInMs);
        ConcurrencyExtKt.scheduleSafe(this.vitalExecutorService, "Vitals monitoring", periodInMs, TimeUnit.MILLISECONDS, this.sdkCore.getInternalLogger(), vitalReaderRunnable);
    }

    private final void initializeVitalMonitors(VitalsUpdateFrequency frequency) {
        if (frequency == VitalsUpdateFrequency.NEVER) {
            return;
        }
        this.cpuVitalMonitor = new AggregatingVitalMonitor();
        this.memoryVitalMonitor = new AggregatingVitalMonitor();
        this.frameRateVitalMonitor = new AggregatingVitalMonitor();
        initializeVitalReaders(frequency.getPeriodInMs());
    }

    private final void initializeVitalReaders(long periodInMs) {
        this.vitalExecutorService = this.sdkCore.createScheduledExecutorService("rum-vital");
        int i = 1;
        initializeVitalMonitor(new CPUVitalReader(0 == true ? 1 : 0, this.sdkCore.getInternalLogger(), i, 0 == true ? 1 : 0), this.cpuVitalMonitor, periodInMs);
        initializeVitalMonitor(new MemoryVitalReader(0 == true ? 1 : 0, this.sdkCore.getInternalLogger(), i, 0 == true ? 1 : 0), this.memoryVitalMonitor, periodInMs);
        this.jankStatsActivityLifecycleListener = new JankStatsActivityLifecycleListener(this.frameRateVitalMonitor, this.sdkCore.getInternalLogger(), null, 0.0d, null, 28, null);
        Context appContext$dd_sdk_android_rum_release = getAppContext$dd_sdk_android_rum_release();
        Application application = appContext$dd_sdk_android_rum_release instanceof Application ? (Application) appContext$dd_sdk_android_rum_release : null;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(this.jankStatsActivityLifecycleListener);
        }
    }

    private final void registerTrackingStrategies(Context appContext) {
        this.actionTrackingStrategy.register(this.sdkCore, appContext);
        this.viewTrackingStrategy.register(this.sdkCore, appContext);
        this.longTaskTrackingStrategy.register(this.sdkCore, appContext);
    }

    private final void unregisterTrackingStrategies(Context appContext) {
        this.actionTrackingStrategy.unregister(appContext);
        this.viewTrackingStrategy.unregister(appContext);
        this.longTaskTrackingStrategy.unregister(appContext);
    }

    public final void consumeLastFatalAnr$dd_sdk_android_rum_release(ExecutorService rumEventsExecutorService) {
        Object next;
        rumEventsExecutorService.getClass();
        Object systemService = getAppContext$dd_sdk_android_rum_release().getSystemService("activity");
        systemService.getClass();
        ApplicationExitInfo applicationExitInfoI = null;
        try {
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) systemService).getHistoricalProcessExitReasons(null, 0, 0);
            historicalProcessExitReasons.getClass();
            Iterator<T> it = historicalProcessExitReasons.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (w20.i(next).getReason() == 6) {
                        break;
                    }
                }
            }
            applicationExitInfoI = w20.i(next);
        } catch (RuntimeException e) {
            InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, (gu5) RumFeature$consumeLastFatalAnr$lastKnownAnr$2.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
        }
        if (applicationExitInfoI == null) {
            return;
        }
        ConcurrencyExtKt.submitSafe(rumEventsExecutorService, "Send fatal ANR", this.sdkCore.getInternalLogger(), new ny0(3, this, applicationExitInfoI));
    }

    public final void disableDebugging$dd_sdk_android_rum_release() {
        Context appContext$dd_sdk_android_rum_release = getAppContext$dd_sdk_android_rum_release();
        synchronized (this.debugActivityLifecycleListener) {
            try {
                if (this.debugActivityLifecycleListener.get() != null && (appContext$dd_sdk_android_rum_release instanceof Application)) {
                    ((Application) appContext$dd_sdk_android_rum_release).unregisterActivityLifecycleCallbacks(this.debugActivityLifecycleListener.get());
                    this.debugActivityLifecycleListener.set(null);
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void enableDebugging$dd_sdk_android_rum_release(AdvancedRumMonitor advancedRumMonitor) {
        advancedRumMonitor.getClass();
        if (!this.initialized.get()) {
            InternalLogger.DefaultImpls.log$default(InternalLogger.INSTANCE.getUNBOUND(), InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) RumFeature$enableDebugging$1.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
            return;
        }
        Context appContext$dd_sdk_android_rum_release = getAppContext$dd_sdk_android_rum_release();
        synchronized (this.debugActivityLifecycleListener) {
            try {
                if ((appContext$dd_sdk_android_rum_release instanceof Application) && this.debugActivityLifecycleListener.get() == null) {
                    UiRumDebugListener uiRumDebugListener = new UiRumDebugListener(this.sdkCore, advancedRumMonitor);
                    this.debugActivityLifecycleListener.set(uiRumDebugListener);
                    ((Application) appContext$dd_sdk_android_rum_release).registerActivityLifecycleCallbacks(uiRumDebugListener);
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: getActionTrackingStrategy$dd_sdk_android_rum_release, reason: from getter */
    public final UserActionTrackingStrategy getActionTrackingStrategy() {
        return this.actionTrackingStrategy;
    }

    /* JADX INFO: renamed from: getAnrDetectorRunnable$dd_sdk_android_rum_release, reason: from getter */
    public final ANRDetectorRunnable getAnrDetectorRunnable() {
        return this.anrDetectorRunnable;
    }

    public final Context getAppContext$dd_sdk_android_rum_release() {
        Context context = this.appContext;
        if (context != null) {
            return context;
        }
        wl7.g("appContext");
        throw null;
    }

    /* JADX INFO: renamed from: getApplicationId$dd_sdk_android_rum_release, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    /* JADX INFO: renamed from: getBackgroundEventTracking$dd_sdk_android_rum_release, reason: from getter */
    public final boolean getBackgroundEventTracking() {
        return this.backgroundEventTracking;
    }

    /* JADX INFO: renamed from: getConfiguration$dd_sdk_android_rum_release, reason: from getter */
    public final Configuration getConfiguration() {
        return this.configuration;
    }

    /* JADX INFO: renamed from: getCpuVitalMonitor$dd_sdk_android_rum_release, reason: from getter */
    public final VitalMonitor getCpuVitalMonitor() {
        return this.cpuVitalMonitor;
    }

    public final DataWriter<Object> getDataWriter$dd_sdk_android_rum_release() {
        return this.dataWriter;
    }

    public final AtomicReference<Application.ActivityLifecycleCallbacks> getDebugActivityLifecycleListener$dd_sdk_android_rum_release() {
        return this.debugActivityLifecycleListener;
    }

    /* JADX INFO: renamed from: getFrameRateVitalMonitor$dd_sdk_android_rum_release, reason: from getter */
    public final VitalMonitor getFrameRateVitalMonitor() {
        return this.frameRateVitalMonitor;
    }

    /* JADX INFO: renamed from: getInitialResourceIdentifier$dd_sdk_android_rum_release, reason: from getter */
    public final InitialResourceIdentifier getInitialResourceIdentifier() {
        return this.initialResourceIdentifier;
    }

    /* JADX INFO: renamed from: getInitialized$dd_sdk_android_rum_release, reason: from getter */
    public final AtomicBoolean getInitialized() {
        return this.initialized;
    }

    /* JADX INFO: renamed from: getJankStatsActivityLifecycleListener$dd_sdk_android_rum_release, reason: from getter */
    public final Application.ActivityLifecycleCallbacks getJankStatsActivityLifecycleListener() {
        return this.jankStatsActivityLifecycleListener;
    }

    /* JADX INFO: renamed from: getLastInteractionIdentifier$dd_sdk_android_rum_release, reason: from getter */
    public final LastInteractionIdentifier getLastInteractionIdentifier() {
        return this.lastInteractionIdentifier;
    }

    /* JADX INFO: renamed from: getLongTaskTrackingStrategy$dd_sdk_android_rum_release, reason: from getter */
    public final TrackingStrategy getLongTaskTrackingStrategy() {
        return this.longTaskTrackingStrategy;
    }

    /* JADX INFO: renamed from: getMemoryVitalMonitor$dd_sdk_android_rum_release, reason: from getter */
    public final VitalMonitor getMemoryVitalMonitor() {
        return this.memoryVitalMonitor;
    }

    @Override // com.datadog.android.api.feature.Feature
    public String getName() {
        return this.name;
    }

    @Override // com.datadog.android.api.feature.StorageBackedFeature
    public RequestFactory getRequestFactory() {
        return (RequestFactory) this.requestFactory.getValue();
    }

    /* JADX INFO: renamed from: getSampleRate$dd_sdk_android_rum_release, reason: from getter */
    public final float getSampleRate() {
        return this.sampleRate;
    }

    /* JADX INFO: renamed from: getSessionListener$dd_sdk_android_rum_release, reason: from getter */
    public final RumSessionListener getSessionListener() {
        return this.sessionListener;
    }

    @Override // com.datadog.android.api.feature.StorageBackedFeature
    public FeatureStorageConfiguration getStorageConfiguration() {
        return this.storageConfiguration;
    }

    /* JADX INFO: renamed from: getTelemetryConfigurationSampleRate$dd_sdk_android_rum_release, reason: from getter */
    public final float getTelemetryConfigurationSampleRate() {
        return this.telemetryConfigurationSampleRate;
    }

    /* JADX INFO: renamed from: getTelemetrySampleRate$dd_sdk_android_rum_release, reason: from getter */
    public final float getTelemetrySampleRate() {
        return this.telemetrySampleRate;
    }

    /* JADX INFO: renamed from: getTrackFrustrations$dd_sdk_android_rum_release, reason: from getter */
    public final boolean getTrackFrustrations() {
        return this.trackFrustrations;
    }

    /* JADX INFO: renamed from: getViewTrackingStrategy$dd_sdk_android_rum_release, reason: from getter */
    public final ViewTrackingStrategy getViewTrackingStrategy() {
        return this.viewTrackingStrategy;
    }

    /* JADX INFO: renamed from: getVitalExecutorService$dd_sdk_android_rum_release, reason: from getter */
    public final ScheduledExecutorService getVitalExecutorService() {
        return this.vitalExecutorService;
    }

    @Override // com.datadog.android.api.feature.Feature
    public void onInitialize(Context appContext) {
        float sampleRate;
        appContext.getClass();
        setAppContext$dd_sdk_android_rum_release(appContext);
        this.initialResourceIdentifier = this.configuration.getInitialResourceIdentifier();
        this.lastInteractionIdentifier = this.configuration.getLastInteractionIdentifier();
        Configuration configuration = this.configuration;
        FeatureSdkCore featureSdkCore = this.sdkCore;
        featureSdkCore.getClass();
        this.dataWriter = createDataWriter(configuration, (InternalSdkCore) featureSdkCore);
        if (((InternalSdkCore) this.sdkCore).getIsDeveloperModeEnabled()) {
            InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.INFO, InternalLogger.Target.USER, (gu5) C05811.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
            sampleRate = 100.0f;
        } else {
            sampleRate = this.configuration.getSampleRate();
        }
        this.sampleRate = sampleRate;
        this.telemetrySampleRate = this.configuration.getTelemetrySampleRate();
        this.telemetryConfigurationSampleRate = this.configuration.getTelemetryConfigurationSampleRate();
        this.backgroundEventTracking = this.configuration.getBackgroundEventTracking();
        this.trackFrustrations = this.configuration.getTrackFrustrations();
        ViewTrackingStrategy viewTrackingStrategy = this.configuration.getViewTrackingStrategy();
        if (viewTrackingStrategy != null) {
            this.viewTrackingStrategy = viewTrackingStrategy;
        }
        this.actionTrackingStrategy = this.configuration.getUserActionTracking() ? INSTANCE.provideUserTrackingStrategy((ViewAttributesProvider[]) this.configuration.getTouchTargetExtraAttributesProviders().toArray(new ViewAttributesProvider[0]), this.configuration.getInteractionPredicate(), this.sdkCore.getInternalLogger()) : new NoOpUserActionTrackingStrategy();
        TrackingStrategy longTaskTrackingStrategy = this.configuration.getLongTaskTrackingStrategy();
        if (longTaskTrackingStrategy != null) {
            this.longTaskTrackingStrategy = longTaskTrackingStrategy;
        }
        initializeVitalMonitors(this.configuration.getVitalsMonitorUpdateFrequency());
        if (this.configuration.getTrackNonFatalAnrs()) {
            initializeANRDetector();
        }
        registerTrackingStrategies(appContext);
        this.sessionListener = this.configuration.getSessionListener();
        this.sdkCore.setEventReceiver(getName(), this);
        this.initialized.set(true);
    }

    @Override // com.datadog.android.api.feature.FeatureEventReceiver
    public void onReceive(Object event) throws InterruptedException {
        event.getClass();
        if (event instanceof Map) {
            handleMapLikeEvent((Map) event);
            return;
        }
        if (event instanceof JvmCrash.Rum) {
            addJvmCrash((JvmCrash.Rum) event);
        } else if (event instanceof InternalTelemetryEvent) {
            handleTelemetryEvent((InternalTelemetryEvent) event);
        } else {
            InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) new C05821(event), (Throwable) null, false, (Map) null, 56, (Object) null);
        }
    }

    @Override // com.datadog.android.api.feature.Feature
    public void onStop() {
        this.sdkCore.removeEventReceiver(getName());
        unregisterTrackingStrategies(getAppContext$dd_sdk_android_rum_release());
        this.dataWriter = new NoOpDataWriter();
        this.viewTrackingStrategy = new NoOpViewTrackingStrategy();
        this.actionTrackingStrategy = new NoOpUserActionTrackingStrategy();
        this.longTaskTrackingStrategy = new NoOpTrackingStrategy();
        this.cpuVitalMonitor = new NoOpVitalMonitor();
        this.memoryVitalMonitor = new NoOpVitalMonitor();
        this.frameRateVitalMonitor = new NoOpVitalMonitor();
        this.vitalExecutorService.shutdownNow();
        ExecutorService executorService = this.anrDetectorExecutorService;
        if (executorService != null) {
            executorService.shutdownNow();
        }
        ANRDetectorRunnable aNRDetectorRunnable = this.anrDetectorRunnable;
        if (aNRDetectorRunnable != null) {
            aNRDetectorRunnable.stop();
        }
        this.vitalExecutorService = new NoOpScheduledExecutorService();
        this.sessionListener = new NoOpRumSessionListener();
        GlobalRumMonitor.INSTANCE.unregister$dd_sdk_android_rum_release(this.sdkCore);
    }

    public final void setActionTrackingStrategy$dd_sdk_android_rum_release(UserActionTrackingStrategy userActionTrackingStrategy) {
        userActionTrackingStrategy.getClass();
        this.actionTrackingStrategy = userActionTrackingStrategy;
    }

    public final void setAnrDetectorRunnable$dd_sdk_android_rum_release(ANRDetectorRunnable aNRDetectorRunnable) {
        this.anrDetectorRunnable = aNRDetectorRunnable;
    }

    public final void setAppContext$dd_sdk_android_rum_release(Context context) {
        context.getClass();
        this.appContext = context;
    }

    public final void setBackgroundEventTracking$dd_sdk_android_rum_release(boolean z) {
        this.backgroundEventTracking = z;
    }

    public final void setCpuVitalMonitor$dd_sdk_android_rum_release(VitalMonitor vitalMonitor) {
        vitalMonitor.getClass();
        this.cpuVitalMonitor = vitalMonitor;
    }

    public final void setDataWriter$dd_sdk_android_rum_release(DataWriter<Object> dataWriter) {
        dataWriter.getClass();
        this.dataWriter = dataWriter;
    }

    public final void setDebugActivityLifecycleListener$dd_sdk_android_rum_release(AtomicReference<Application.ActivityLifecycleCallbacks> atomicReference) {
        atomicReference.getClass();
        this.debugActivityLifecycleListener = atomicReference;
    }

    public final void setFrameRateVitalMonitor$dd_sdk_android_rum_release(VitalMonitor vitalMonitor) {
        vitalMonitor.getClass();
        this.frameRateVitalMonitor = vitalMonitor;
    }

    public final void setInitialResourceIdentifier$dd_sdk_android_rum_release(InitialResourceIdentifier initialResourceIdentifier) {
        initialResourceIdentifier.getClass();
        this.initialResourceIdentifier = initialResourceIdentifier;
    }

    public final void setJankStatsActivityLifecycleListener$dd_sdk_android_rum_release(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.jankStatsActivityLifecycleListener = activityLifecycleCallbacks;
    }

    public final void setLastInteractionIdentifier$dd_sdk_android_rum_release(LastInteractionIdentifier lastInteractionIdentifier) {
        lastInteractionIdentifier.getClass();
        this.lastInteractionIdentifier = lastInteractionIdentifier;
    }

    public final void setLongTaskTrackingStrategy$dd_sdk_android_rum_release(TrackingStrategy trackingStrategy) {
        trackingStrategy.getClass();
        this.longTaskTrackingStrategy = trackingStrategy;
    }

    public final void setMemoryVitalMonitor$dd_sdk_android_rum_release(VitalMonitor vitalMonitor) {
        vitalMonitor.getClass();
        this.memoryVitalMonitor = vitalMonitor;
    }

    public final void setSampleRate$dd_sdk_android_rum_release(float f) {
        this.sampleRate = f;
    }

    public final void setSessionListener$dd_sdk_android_rum_release(RumSessionListener rumSessionListener) {
        rumSessionListener.getClass();
        this.sessionListener = rumSessionListener;
    }

    public final void setTelemetryConfigurationSampleRate$dd_sdk_android_rum_release(float f) {
        this.telemetryConfigurationSampleRate = f;
    }

    public final void setTelemetrySampleRate$dd_sdk_android_rum_release(float f) {
        this.telemetrySampleRate = f;
    }

    public final void setTrackFrustrations$dd_sdk_android_rum_release(boolean z) {
        this.trackFrustrations = z;
    }

    public final void setViewTrackingStrategy$dd_sdk_android_rum_release(ViewTrackingStrategy viewTrackingStrategy) {
        viewTrackingStrategy.getClass();
        this.viewTrackingStrategy = viewTrackingStrategy;
    }

    public final void setVitalExecutorService$dd_sdk_android_rum_release(ScheduledExecutorService scheduledExecutorService) {
        scheduledExecutorService.getClass();
        this.vitalExecutorService = scheduledExecutorService;
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%H\u0000¢\u0006\u0002\b&J+\u0010'\u001a\u00020(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0002¢\u0006\u0002\u00100J+\u00101\u001a\u0002022\f\u00103\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0002¢\u0006\u0002\u00104R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/datadog/android/rum/internal/RumFeature$Companion;", "", "()V", "ALL_IN_SAMPLE_RATE", "", "DD_TELEMETRY_CONFIG_SAMPLE_RATE_TAG", "", "DEFAULT_LONG_TASK_THRESHOLD_MS", "", "DEFAULT_RUM_CONFIG", "Lcom/datadog/android/rum/internal/RumFeature$Configuration;", "getDEFAULT_RUM_CONFIG$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/RumFeature$Configuration;", "DEFAULT_SAMPLE_RATE", "DEFAULT_TELEMETRY_CONFIGURATION_SAMPLE_RATE", "DEFAULT_TELEMETRY_SAMPLE_RATE", "DEVELOPER_MODE_SAMPLE_RATE_CHANGED_MESSAGE", "EVENT_ATTRIBUTES_PROPERTY", "EVENT_MESSAGE_PROPERTY", "EVENT_STACKTRACE_PROPERTY", "EVENT_THROWABLE_PROPERTY", "FAILED_TO_GET_HISTORICAL_EXIT_REASONS", "FLUSH_AND_STOP_MONITOR_MESSAGE_TYPE", "LOGGER_ERROR_BUS_MESSAGE_TYPE", "LOGGER_ERROR_WITH_STACK_TRACE_MESSAGE_TYPE", "LOG_ERROR_EVENT_MISSING_MANDATORY_FIELDS", "LOG_ERROR_WITH_STACKTRACE_EVENT_MISSING_MANDATORY_FIELDS", "NDK_CRASH_BUS_MESSAGE_TYPE", "NO_LAST_RUM_VIEW_EVENT_AVAILABLE", "RUM_FEATURE_NOT_YET_INITIALIZED", "TELEMETRY_SESSION_REPLAY_SKIP_FRAME", "UNKNOWN_EVENT_TYPE_PROPERTY_VALUE", "UNSUPPORTED_EVENT_TYPE", "WEB_VIEW_INGESTED_NOTIFICATION_MESSAGE_TYPE", "isTrackNonFatalAnrsEnabledByDefault", "", "buildSdkVersionProvider", "Lcom/datadog/android/core/internal/system/BuildSdkVersionProvider;", "isTrackNonFatalAnrsEnabledByDefault$dd_sdk_android_rum_release", "provideGestureTracker", "Lcom/datadog/android/rum/internal/instrumentation/gestures/DatadogGesturesTracker;", "customProviders", "", "Lcom/datadog/android/rum/tracking/ViewAttributesProvider;", "interactionPredicate", "Lcom/datadog/android/rum/tracking/InteractionPredicate;", "internalLogger", "Lcom/datadog/android/api/InternalLogger;", "([Lcom/datadog/android/rum/tracking/ViewAttributesProvider;Lcom/datadog/android/rum/tracking/InteractionPredicate;Lcom/datadog/android/api/InternalLogger;)Lcom/datadog/android/rum/internal/instrumentation/gestures/DatadogGesturesTracker;", "provideUserTrackingStrategy", "Lcom/datadog/android/rum/internal/tracking/UserActionTrackingStrategy;", "touchTargetExtraAttributesProviders", "([Lcom/datadog/android/rum/tracking/ViewAttributesProvider;Lcom/datadog/android/rum/tracking/InteractionPredicate;Lcom/datadog/android/api/InternalLogger;)Lcom/datadog/android/rum/internal/tracking/UserActionTrackingStrategy;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ boolean isTrackNonFatalAnrsEnabledByDefault$dd_sdk_android_rum_release$default(Companion companion, BuildSdkVersionProvider buildSdkVersionProvider, int i, Object obj) {
            if ((i & 1) != 0) {
                buildSdkVersionProvider = BuildSdkVersionProvider.INSTANCE.getDEFAULT();
            }
            return companion.isTrackNonFatalAnrsEnabledByDefault$dd_sdk_android_rum_release(buildSdkVersionProvider);
        }

        private final DatadogGesturesTracker provideGestureTracker(ViewAttributesProvider[] customProviders, InteractionPredicate interactionPredicate, InternalLogger internalLogger) {
            return new DatadogGesturesTracker((ViewAttributesProvider[]) pyd.K(customProviders, new JetpackViewAttributesProvider[]{new JetpackViewAttributesProvider()}), interactionPredicate, internalLogger);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final UserActionTrackingStrategy provideUserTrackingStrategy(ViewAttributesProvider[] touchTargetExtraAttributesProviders, InteractionPredicate interactionPredicate, InternalLogger internalLogger) {
            DatadogGesturesTracker datadogGesturesTrackerProvideGestureTracker = provideGestureTracker(touchTargetExtraAttributesProviders, interactionPredicate, internalLogger);
            return Build.VERSION.SDK_INT >= 29 ? new UserActionTrackingStrategyApi29(datadogGesturesTrackerProvideGestureTracker) : new UserActionTrackingStrategyLegacy(datadogGesturesTrackerProvideGestureTracker);
        }

        public final Configuration getDEFAULT_RUM_CONFIG$dd_sdk_android_rum_release() {
            return RumFeature.DEFAULT_RUM_CONFIG;
        }

        public final boolean isTrackNonFatalAnrsEnabledByDefault$dd_sdk_android_rum_release(BuildSdkVersionProvider buildSdkVersionProvider) {
            buildSdkVersionProvider.getClass();
            return buildSdkVersionProvider.getVersion() < 30;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.RumFeature$addLoggerError$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05791 extends mj8 implements gu5<String> {
        public static final C05791 INSTANCE = new C05791();

        public C05791() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return RumFeature.LOG_ERROR_EVENT_MISSING_MANDATORY_FIELDS;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.RumFeature$addLoggerErrorWithStacktrace$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05801 extends mj8 implements gu5<String> {
        public static final C05801 INSTANCE = new C05801();

        public C05801() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return RumFeature.LOG_ERROR_WITH_STACKTRACE_EVENT_MISSING_MANDATORY_FIELDS;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.RumFeature$onInitialize$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05811 extends mj8 implements gu5<String> {
        public static final C05811 INSTANCE = new C05811();

        public C05811() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return RumFeature.DEVELOPER_MODE_SAMPLE_RATE_CHANGED_MESSAGE;
        }
    }

    public /* synthetic */ RumFeature(FeatureSdkCore featureSdkCore, String str, Configuration configuration, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(featureSdkCore, str, configuration, (i & 8) != 0 ? AnonymousClass1.INSTANCE : function1);
    }
}
