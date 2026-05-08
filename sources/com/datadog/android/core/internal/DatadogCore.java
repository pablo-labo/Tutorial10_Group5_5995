package com.datadog.android.core.internal;

import android.app.Application;
import android.content.Context;
import com.datadog.android.Datadog;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.api.context.TimeInfo;
import com.datadog.android.api.feature.Feature;
import com.datadog.android.api.feature.FeatureContextUpdateReceiver;
import com.datadog.android.api.feature.FeatureEventReceiver;
import com.datadog.android.api.feature.FeatureScope;
import com.datadog.android.api.feature.FeatureSdkCore;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.configuration.BatchSize;
import com.datadog.android.core.configuration.Configuration;
import com.datadog.android.core.configuration.UploadFrequency;
import com.datadog.android.core.internal.lifecycle.ProcessLifecycleCallback;
import com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor;
import com.datadog.android.core.internal.logger.SdkInternalLogger;
import com.datadog.android.core.internal.metrics.BatchMetricsDispatcher;
import com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver;
import com.datadog.android.core.internal.system.BuildSdkVersionProvider;
import com.datadog.android.core.internal.time.DefaultAppStartTimeProvider;
import com.datadog.android.core.internal.time.TimeProvider;
import com.datadog.android.core.internal.utils.ConcurrencyExtKt;
import com.datadog.android.core.thread.FlushableExecutorService;
import com.datadog.android.error.internal.CrashReportsFeature;
import com.datadog.android.internal.telemetry.InternalTelemetryEvent;
import com.datadog.android.ndk.internal.NdkCrashHandler;
import com.datadog.android.privacy.TrackingConsent;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import defpackage.ab8;
import defpackage.bs4;
import defpackage.gu5;
import defpackage.h50;
import defpackage.i50;
import defpackage.j6g;
import defpackage.l5;
import defpackage.mj8;
import defpackage.pxc;
import defpackage.wl7;
import defpackage.y71;
import defpackage.z92;
import defpackage.zve;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 ·\u00012\u00020\u0001:\u0002·\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b\u001c\u0010\u001dJC\u0010#\u001a\u00020\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u00042\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010!0 H\u0017¢\u0006\u0004\b#\u0010$J%\u0010%\u001a\u00020\u00132\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010!0 H\u0017¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0013H\u0017¢\u0006\u0004\b'\u0010(J9\u0010+\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00042 \u0010*\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010!0)\u0012\u0004\u0012\u00020\u00130\u0007H\u0016¢\u0006\u0004\b+\u0010,J%\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010!0 2\u0006\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u00101\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u001f\u00107\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b7\u00106J\u0017\u00108\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020;2\u0006\u0010:\u001a\u00020\u0004H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020>2\u0006\u0010:\u001a\u00020\u0004H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u00020\u00132\u0006\u0010E\u001a\u00020DH\u0017¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0013H\u0017¢\u0006\u0004\bH\u0010(J\u0017\u0010K\u001a\u00020\u00132\u0006\u0010J\u001a\u00020IH\u0017¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020;H\u0016¢\u0006\u0004\bM\u0010NJ\u0015\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00170OH\u0016¢\u0006\u0004\bP\u0010QJ\u0011\u0010S\u001a\u0004\u0018\u00010RH\u0016¢\u0006\u0004\bS\u0010TJ\u0017\u0010Y\u001a\u00020\u00132\u0006\u0010V\u001a\u00020UH\u0000¢\u0006\u0004\bW\u0010XJ\u000f\u0010[\u001a\u00020\u0013H\u0000¢\u0006\u0004\bZ\u0010(J\u000f\u0010]\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\\\u0010(J\u000f\u0010^\u001a\u00020\u0013H\u0002¢\u0006\u0004\b^\u0010(J\u0017\u0010_\u001a\u00020U2\u0006\u0010V\u001a\u00020UH\u0002¢\u0006\u0004\b_\u0010`J#\u0010b\u001a\u00020\u00132\u0012\u0010a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\bb\u0010&J\u0017\u0010d\u001a\u00020\u00132\u0006\u0010c\u001a\u00020\u0002H\u0002¢\u0006\u0004\bd\u0010eJ\u0017\u0010g\u001a\u00020A2\u0006\u0010f\u001a\u00020\u0004H\u0002¢\u0006\u0004\bg\u0010hJ\u0017\u0010i\u001a\u00020A2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020\u0013H\u0002¢\u0006\u0004\bk\u0010(J\u000f\u0010l\u001a\u00020\u0013H\u0002¢\u0006\u0004\bl\u0010(J\u0017\u0010m\u001a\u00020\u00132\u0006\u0010V\u001a\u00020UH\u0002¢\u0006\u0004\bm\u0010XR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010n\u001a\u0004\bo\u0010pR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010n\u001a\u0004\bq\u0010pR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010rR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010sR\"\u0010u\u001a\u00020t8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\u0016\u0010|\u001a\u00020{8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b|\u0010}R)\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020~0)8\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001d\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u0003\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001c\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001f\u0010\u0089\u0001\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R1\u0010\u008e\u0001\u001a\u00020A2\u0007\u0010\u008d\u0001\u001a\u00020A8\u0016@PX\u0096\u000e¢\u0006\u0017\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0005\b\u008e\u0001\u0010C\"\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001a\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0092\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0016\u0010\u0097\u0001\u001a\u00020A8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010CR\u0018\u0010\u009b\u0001\u001a\u00030\u0098\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0016\u0010\u009d\u0001\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010pR\u0018\u0010¡\u0001\u001a\u00030\u009e\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u0018\u0010¥\u0001\u001a\u00030¢\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b£\u0001\u0010¤\u0001R\u0017\u0010¨\u0001\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001R\u0018\u0010¬\u0001\u001a\u00030©\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001R\u001a\u0010°\u0001\u001a\u0005\u0018\u00010\u00ad\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\b®\u0001\u0010¯\u0001R\u0019\u0010³\u0001\u001a\u0004\u0018\u00010I8WX\u0096\u0004¢\u0006\b\u001a\u0006\b±\u0001\u0010²\u0001R\u0017\u0010¶\u0001\u001a\u00020I8VX\u0096\u0004¢\u0006\b\u001a\u0006\b´\u0001\u0010µ\u0001¨\u0006¸\u0001"}, d2 = {"Lcom/datadog/android/core/internal/DatadogCore;", "Lcom/datadog/android/core/InternalSdkCore;", "Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "", "instanceId", "name", "Lkotlin/Function1;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "Lcom/datadog/android/api/InternalLogger;", "internalLoggerProvider", "Lcom/datadog/android/core/thread/FlushableExecutorService$Factory;", "executorServiceFactory", "Lcom/datadog/android/core/internal/system/BuildSdkVersionProvider;", "buildSdkVersionProvider", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/datadog/android/core/thread/FlushableExecutorService$Factory;Lcom/datadog/android/core/internal/system/BuildSdkVersionProvider;)V", "Lcom/datadog/android/api/feature/Feature;", "feature", "Lj6g;", "registerFeature", "(Lcom/datadog/android/api/feature/Feature;)V", "featureName", "Lcom/datadog/android/api/feature/FeatureScope;", "getFeature", "(Ljava/lang/String;)Lcom/datadog/android/api/feature/FeatureScope;", "Lcom/datadog/android/privacy/TrackingConsent;", BatchMetricsDispatcher.TRACKING_CONSENT_KEY, "setTrackingConsent", "(Lcom/datadog/android/privacy/TrackingConsent;)V", "id", "email", "", "", "extraInfo", "setUserInfo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "addUserProperties", "(Ljava/util/Map;)V", "clearAllData", "()V", "", "updateCallback", "updateFeatureContext", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getFeatureContext", "(Ljava/lang/String;)Ljava/util/Map;", "Lcom/datadog/android/api/feature/FeatureEventReceiver;", "receiver", "setEventReceiver", "(Ljava/lang/String;Lcom/datadog/android/api/feature/FeatureEventReceiver;)V", "Lcom/datadog/android/api/feature/FeatureContextUpdateReceiver;", "listener", "setContextUpdateReceiver", "(Ljava/lang/String;Lcom/datadog/android/api/feature/FeatureContextUpdateReceiver;)V", "removeContextUpdateReceiver", "removeEventReceiver", "(Ljava/lang/String;)V", "executorContext", "Ljava/util/concurrent/ExecutorService;", "createSingleThreadExecutorService", "(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;", "Ljava/util/concurrent/ScheduledExecutorService;", "createScheduledExecutorService", "(Ljava/lang/String;)Ljava/util/concurrent/ScheduledExecutorService;", "", "isCoreActive", "()Z", "", "data", "writeLastViewEvent", "([B)V", "deleteLastViewEvent", "", "anrTimestamp", "writeLastFatalAnrSent", "(J)V", "getPersistenceExecutorService", "()Ljava/util/concurrent/ExecutorService;", "", "getAllFeatures", "()Ljava/util/List;", "Lcom/datadog/android/api/context/DatadogContext;", "getDatadogContext", "()Lcom/datadog/android/api/context/DatadogContext;", "Lcom/datadog/android/core/configuration/Configuration;", "configuration", "initialize$dd_sdk_android_core_release", "(Lcom/datadog/android/core/configuration/Configuration;)V", "initialize", "stop$dd_sdk_android_core_release", "stop", "flushStoredData$dd_sdk_android_core_release", "flushStoredData", "initializeCrashReportFeature", "modifyConfigurationForDeveloperDebug", "(Lcom/datadog/android/core/configuration/Configuration;)Lcom/datadog/android/core/configuration/Configuration;", "additionalConfiguration", "applyAdditionalConfiguration", "appContext", "setupLifecycleMonitorCallback", "(Landroid/content/Context;)V", "envName", "isEnvironmentNameValid", "(Ljava/lang/String;)Z", "isAppDebuggable", "(Landroid/content/Context;)Z", "setupShutdownHook", "removeShutdownHook", "sendCoreConfigurationTelemetryEvent", "Ljava/lang/String;", "getInstanceId$dd_sdk_android_core_release", "()Ljava/lang/String;", "getName", "Lcom/datadog/android/core/thread/FlushableExecutorService$Factory;", "Lcom/datadog/android/core/internal/system/BuildSdkVersionProvider;", "Lcom/datadog/android/core/internal/CoreFeature;", "coreFeature", "Lcom/datadog/android/core/internal/CoreFeature;", "getCoreFeature$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/CoreFeature;", "setCoreFeature$dd_sdk_android_core_release", "(Lcom/datadog/android/core/internal/CoreFeature;)V", "Ljava/lang/Thread;", "shutdownHook", "Ljava/lang/Thread;", "Lcom/datadog/android/core/internal/SdkFeature;", "features", "Ljava/util/Map;", "getFeatures$dd_sdk_android_core_release", "()Ljava/util/Map;", "Landroid/content/Context;", "getContext$dd_sdk_android_core_release", "()Landroid/content/Context;", "Lcom/datadog/android/core/internal/lifecycle/ProcessLifecycleMonitor;", "processLifecycleMonitor", "Lcom/datadog/android/core/internal/lifecycle/ProcessLifecycleMonitor;", "internalLogger", "Lcom/datadog/android/api/InternalLogger;", "getInternalLogger", "()Lcom/datadog/android/api/InternalLogger;", "<set-?>", "isDeveloperModeEnabled", "Z", "setDeveloperModeEnabled$dd_sdk_android_core_release", "(Z)V", "Lcom/datadog/android/core/internal/ContextProvider;", "getContextProvider$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/ContextProvider;", "contextProvider", "isActive$dd_sdk_android_core_release", "isActive", "Lcom/datadog/android/api/context/TimeInfo;", "getTime", "()Lcom/datadog/android/api/context/TimeInfo;", "time", "getService", "service", "Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "getFirstPartyHostResolver", "()Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "firstPartyHostResolver", "Lcom/datadog/android/api/context/NetworkInfo;", "getNetworkInfo", "()Lcom/datadog/android/api/context/NetworkInfo;", "networkInfo", "getTrackingConsent", "()Lcom/datadog/android/privacy/TrackingConsent;", "trackingConsent", "Ljava/io/File;", "getRootStorageDir", "()Ljava/io/File;", "rootStorageDir", "Lab8;", "getLastViewEvent", "()Lab8;", "lastViewEvent", "getLastFatalAnrSent", "()Ljava/lang/Long;", "lastFatalAnrSent", "getAppStartTimeNs", "()J", "appStartTimeNs", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class DatadogCore implements InternalSdkCore {
    public static final String ENV_NAME_VALIDATION_REG_EX = "[a-zA-Z0-9_:./-]{0,195}[a-zA-Z0-9_./-]";
    public static final String EVENT_RECEIVER_ALREADY_EXISTS = "Feature \"%s\" already has event receiver registered, overwriting it.";
    public static final String MESSAGE_ENV_NAME_NOT_VALID = "The environment name should contain maximum 196 of the following allowed characters [a-zA-Z0-9_:./-] and should never finish with a semicolon.In this case the Datadog SDK will not be initialised.";
    public static final String MISSING_FEATURE_FOR_CONTEXT_UPDATE_LISTENER = "Cannot add event listener for feature \"%s\", it is not registered.";
    public static final String MISSING_FEATURE_FOR_EVENT_RECEIVER = "Cannot add event receiver for feature \"%s\", it is not registered.";
    public static final String NO_NEED_TO_WRITE_LAST_VIEW_EVENT = "No need to write last RUM view event: NDK crash reports feature is not enabled and API is below 30.";
    public static final String SHUTDOWN_THREAD_NAME = "datadog_shutdown";
    private final BuildSdkVersionProvider buildSdkVersionProvider;
    private final Context context;
    public CoreFeature coreFeature;
    private final FlushableExecutorService.Factory executorServiceFactory;
    private final Map<String, SdkFeature> features;
    private final String instanceId;
    private final InternalLogger internalLogger;
    private boolean isDeveloperModeEnabled;
    private final String name;
    private ProcessLifecycleMonitor processLifecycleMonitor;
    private Thread shutdownHook;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long CONFIGURATION_TELEMETRY_DELAY_MS = 5000;
    private static final long startupTimeNs = System.nanoTime();

    /* JADX INFO: renamed from: com.datadog.android.core.internal.DatadogCore$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/datadog/android/core/internal/logger/SdkInternalLogger;", "it", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements Function1<FeatureSdkCore, SdkInternalLogger> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final SdkInternalLogger invoke(FeatureSdkCore featureSdkCore) {
            featureSdkCore.getClass();
            return new SdkInternalLogger(featureSdkCore, null, null, 6, null);
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.DatadogCore$setContextUpdateReceiver$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05061 extends mj8 implements gu5<String> {
        final /* synthetic */ String $featureName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05061(String str) {
            super(0);
            this.$featureName = str;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, DatadogCore.MISSING_FEATURE_FOR_CONTEXT_UPDATE_LISTENER, Arrays.copyOf(new Object[]{this.$featureName}, 1));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.DatadogCore$setEventReceiver$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05071 extends mj8 implements gu5<String> {
        final /* synthetic */ String $featureName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05071(String str) {
            super(0);
            this.$featureName = str;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, DatadogCore.MISSING_FEATURE_FOR_EVENT_RECEIVER, Arrays.copyOf(new Object[]{this.$featureName}, 1));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.DatadogCore$setEventReceiver$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05082 extends mj8 implements gu5<String> {
        final /* synthetic */ String $featureName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05082(String str) {
            super(0);
            this.$featureName = str;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, DatadogCore.EVENT_RECEIVER_ALREADY_EXISTS, Arrays.copyOf(new Object[]{this.$featureName}, 1));
        }
    }

    public DatadogCore(Context context, String str, String str2, Function1<? super FeatureSdkCore, ? extends InternalLogger> function1, FlushableExecutorService.Factory factory, BuildSdkVersionProvider buildSdkVersionProvider) {
        context.getClass();
        str.getClass();
        str2.getClass();
        function1.getClass();
        buildSdkVersionProvider.getClass();
        this.instanceId = str;
        this.name = str2;
        this.executorServiceFactory = factory;
        this.buildSdkVersionProvider = buildSdkVersionProvider;
        this.features = new ConcurrentHashMap();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.context = applicationContext;
        this.internalLogger = function1.invoke(this);
    }

    private final void applyAdditionalConfiguration(Map<String, ? extends Object> additionalConfiguration) {
        Object obj = additionalConfiguration.get(Datadog.DD_SOURCE_TAG);
        if (obj != null && (obj instanceof String) && !zve.U((CharSequence) obj)) {
            getCoreFeature$dd_sdk_android_core_release().setSourceName$dd_sdk_android_core_release((String) obj);
        }
        Object obj2 = additionalConfiguration.get(Datadog.DD_SDK_VERSION_TAG);
        if (obj2 != null && (obj2 instanceof String) && !zve.U((CharSequence) obj2)) {
            getCoreFeature$dd_sdk_android_core_release().setSdkVersion$dd_sdk_android_core_release((String) obj2);
        }
        Object obj3 = additionalConfiguration.get(Datadog.DD_APP_VERSION_TAG);
        if (obj3 == null || !(obj3 instanceof String) || zve.U((CharSequence) obj3)) {
            return;
        }
        getCoreFeature$dd_sdk_android_core_release().getPackageVersionProvider().setVersion((String) obj3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearAllData$lambda$2(DatadogCore datadogCore) {
        datadogCore.getClass();
        datadogCore.getCoreFeature$dd_sdk_android_core_release().deleteLastViewEvent$dd_sdk_android_core_release();
        datadogCore.getCoreFeature$dd_sdk_android_core_release().deleteLastFatalAnrSent$dd_sdk_android_core_release();
    }

    private final void initializeCrashReportFeature() {
        registerFeature(new CrashReportsFeature(this));
    }

    private final boolean isAppDebuggable(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    private final boolean isEnvironmentNameValid(String envName) {
        return new pxc(ENV_NAME_VALIDATION_REG_EX).d(envName);
    }

    private final Configuration modifyConfigurationForDeveloperDebug(Configuration configuration) {
        return Configuration.copy$default(configuration, Configuration.Core.copy$default(configuration.getCoreConfig$dd_sdk_android_core_release(), false, false, null, BatchSize.SMALL, UploadFrequency.FREQUENT, null, null, null, null, null, null, null, null, 8167, null), null, null, null, null, false, null, 126, null);
    }

    private final void removeShutdownHook() {
        if (this.shutdownHook != null) {
            try {
                Runtime runtime = Runtime.getRuntime();
                Thread thread = this.shutdownHook;
                if (thread != null) {
                    runtime.removeShutdownHook(thread);
                } else {
                    wl7.g("shutdownHook");
                    throw null;
                }
            } catch (IllegalStateException e) {
                InternalLogger.DefaultImpls.log$default(getInternalLogger(), InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, (gu5) C05051.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
            } catch (SecurityException e2) {
                InternalLogger.DefaultImpls.log$default(getInternalLogger(), InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, (gu5) AnonymousClass2.INSTANCE, (Throwable) e2, false, (Map) null, 48, (Object) null);
            }
        }
    }

    private final void sendCoreConfigurationTelemetryEvent(Configuration configuration) {
        ConcurrencyExtKt.scheduleSafe(getCoreFeature$dd_sdk_android_core_release().getUploadExecutorService$dd_sdk_android_core_release(), "Configuration telemetry", CONFIGURATION_TELEMETRY_DELAY_MS, TimeUnit.MILLISECONDS, getInternalLogger(), new y71(2, this, configuration));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendCoreConfigurationTelemetryEvent$lambda$11(DatadogCore datadogCore, Configuration configuration) {
        datadogCore.getClass();
        configuration.getClass();
        FeatureScope feature = datadogCore.getFeature("rum");
        if (feature == null) {
            return;
        }
        feature.sendEvent(new InternalTelemetryEvent.Configuration(configuration.getCrashReportsEnabled$dd_sdk_android_core_release(), configuration.getCoreConfig$dd_sdk_android_core_release().getBatchSize().getWindowDurationMs(), configuration.getCoreConfig$dd_sdk_android_core_release().getUploadFrequency().getBaseStepMs(), configuration.getCoreConfig$dd_sdk_android_core_release().getProxy() != null, configuration.getCoreConfig$dd_sdk_android_core_release().getEncryption() != null, configuration.getCoreConfig$dd_sdk_android_core_release().getBatchProcessingLevel().getMaxBatchesPerUploadJob()));
    }

    private final void setupLifecycleMonitorCallback(Context appContext) {
        if (appContext instanceof Application) {
            ProcessLifecycleMonitor processLifecycleMonitor = new ProcessLifecycleMonitor(new ProcessLifecycleCallback(appContext, getName(), getInternalLogger()));
            ((Application) appContext).registerActivityLifecycleCallbacks(processLifecycleMonitor);
            this.processLifecycleMonitor = processLifecycleMonitor;
        }
    }

    private final void setupShutdownHook() {
        try {
            this.shutdownHook = new Thread(new h50(this, 2), SHUTDOWN_THREAD_NAME);
            Runtime runtime = Runtime.getRuntime();
            Thread thread = this.shutdownHook;
            if (thread != null) {
                runtime.addShutdownHook(thread);
            } else {
                wl7.g("shutdownHook");
                throw null;
            }
        } catch (IllegalArgumentException e) {
            InternalLogger.DefaultImpls.log$default(getInternalLogger(), InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, (gu5) C05102.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
        } catch (IllegalStateException e2) {
            InternalLogger.DefaultImpls.log$default(getInternalLogger(), InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, (gu5) C05091.INSTANCE, (Throwable) e2, false, (Map) null, 48, (Object) null);
            stop$dd_sdk_android_core_release();
        } catch (SecurityException e3) {
            InternalLogger.DefaultImpls.log$default(getInternalLogger(), InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, (gu5) AnonymousClass3.INSTANCE, (Throwable) e3, false, (Map) null, 48, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupShutdownHook$lambda$10(DatadogCore datadogCore) {
        datadogCore.getClass();
        datadogCore.stop$dd_sdk_android_core_release();
    }

    @Override // com.datadog.android.api.SdkCore
    public void addUserProperties(Map<String, ? extends Object> extraInfo) {
        extraInfo.getClass();
        getCoreFeature$dd_sdk_android_core_release().getUserInfoProvider().addUserProperties(extraInfo);
    }

    @Override // com.datadog.android.api.SdkCore
    public void clearAllData() {
        Iterator<T> it = this.features.values().iterator();
        while (it.hasNext()) {
            ((SdkFeature) it.next()).clearAllData();
        }
        ConcurrencyExtKt.submitSafe(getPersistenceExecutorService(), "Clear all data", getInternalLogger(), new i50(this, 3));
    }

    @Override // com.datadog.android.api.feature.FeatureSdkCore
    public ScheduledExecutorService createScheduledExecutorService(String executorContext) {
        executorContext.getClass();
        return getCoreFeature$dd_sdk_android_core_release().createScheduledExecutorService(executorContext);
    }

    @Override // com.datadog.android.api.feature.FeatureSdkCore
    public ExecutorService createSingleThreadExecutorService(String executorContext) {
        executorContext.getClass();
        return getCoreFeature$dd_sdk_android_core_release().createExecutorService(executorContext);
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public void deleteLastViewEvent() {
        getCoreFeature$dd_sdk_android_core_release().deleteLastViewEvent$dd_sdk_android_core_release();
    }

    public final void flushStoredData$dd_sdk_android_core_release() throws InterruptedException {
        getCoreFeature$dd_sdk_android_core_release().drainAndShutdownExecutors();
        Iterator<T> it = this.features.values().iterator();
        while (it.hasNext()) {
            ((SdkFeature) it.next()).flushStoredData$dd_sdk_android_core_release();
        }
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public List<FeatureScope> getAllFeatures() {
        return z92.z1(this.features.values());
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public long getAppStartTimeNs() {
        return getCoreFeature$dd_sdk_android_core_release().getAppStartTimeNs$dd_sdk_android_core_release();
    }

    /* JADX INFO: renamed from: getContext$dd_sdk_android_core_release, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    public final ContextProvider getContextProvider$dd_sdk_android_core_release() {
        if (getCoreFeature$dd_sdk_android_core_release().getInitialized().get()) {
            return getCoreFeature$dd_sdk_android_core_release().getContextProvider();
        }
        return null;
    }

    public final CoreFeature getCoreFeature$dd_sdk_android_core_release() {
        CoreFeature coreFeature = this.coreFeature;
        if (coreFeature != null) {
            return coreFeature;
        }
        wl7.g("coreFeature");
        throw null;
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public DatadogContext getDatadogContext() {
        ContextProvider contextProvider$dd_sdk_android_core_release = getContextProvider$dd_sdk_android_core_release();
        if (contextProvider$dd_sdk_android_core_release != null) {
            return contextProvider$dd_sdk_android_core_release.getContext();
        }
        return null;
    }

    @Override // com.datadog.android.api.feature.FeatureSdkCore
    public FeatureScope getFeature(String featureName) {
        featureName.getClass();
        return this.features.get(featureName);
    }

    @Override // com.datadog.android.api.feature.FeatureSdkCore
    public Map<String, Object> getFeatureContext(String featureName) {
        Map<String, Object> featureContext;
        featureName.getClass();
        ContextProvider contextProvider$dd_sdk_android_core_release = getContextProvider$dd_sdk_android_core_release();
        return (contextProvider$dd_sdk_android_core_release == null || (featureContext = contextProvider$dd_sdk_android_core_release.getFeatureContext(featureName)) == null) ? bs4.a : featureContext;
    }

    public final Map<String, SdkFeature> getFeatures$dd_sdk_android_core_release() {
        return this.features;
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public FirstPartyHostHeaderTypeResolver getFirstPartyHostResolver() {
        return getCoreFeature$dd_sdk_android_core_release().getFirstPartyHostHeaderTypeResolver();
    }

    /* JADX INFO: renamed from: getInstanceId$dd_sdk_android_core_release, reason: from getter */
    public final String getInstanceId() {
        return this.instanceId;
    }

    @Override // com.datadog.android.api.feature.FeatureSdkCore
    public InternalLogger getInternalLogger() {
        return this.internalLogger;
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public Long getLastFatalAnrSent() {
        return getCoreFeature$dd_sdk_android_core_release().getLastFatalAnrSent$dd_sdk_android_core_release();
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public ab8 getLastViewEvent() {
        return getCoreFeature$dd_sdk_android_core_release().getLastViewEvent$dd_sdk_android_core_release();
    }

    @Override // com.datadog.android.api.SdkCore
    public String getName() {
        return this.name;
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public NetworkInfo getNetworkInfo() {
        return getCoreFeature$dd_sdk_android_core_release().getNetworkInfoProvider().getLastNetworkInfo();
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public ExecutorService getPersistenceExecutorService() {
        return getCoreFeature$dd_sdk_android_core_release().getPersistenceExecutorService$dd_sdk_android_core_release();
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public File getRootStorageDir() {
        return getCoreFeature$dd_sdk_android_core_release().getStorageDir$dd_sdk_android_core_release();
    }

    @Override // com.datadog.android.api.SdkCore
    public String getService() {
        return getCoreFeature$dd_sdk_android_core_release().getServiceName();
    }

    @Override // com.datadog.android.api.SdkCore
    public TimeInfo getTime() {
        TimeProvider timeProvider = getCoreFeature$dd_sdk_android_core_release().getTimeProvider();
        long deviceTimestamp = timeProvider.getDeviceTimestamp();
        long serverTimestamp = timeProvider.getServerTimestamp();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j = serverTimestamp - deviceTimestamp;
        return new TimeInfo(timeUnit.toNanos(deviceTimestamp), timeUnit.toNanos(serverTimestamp), timeUnit.toNanos(j), j);
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public TrackingConsent getTrackingConsent() {
        return getCoreFeature$dd_sdk_android_core_release().getTrackingConsentProvider().getConsent();
    }

    public final void initialize$dd_sdk_android_core_release(Configuration configuration) {
        Configuration configurationModifyConfigurationForDeveloperDebug;
        configuration.getClass();
        if (!isEnvironmentNameValid(configuration.getEnv$dd_sdk_android_core_release())) {
            l5.q(MESSAGE_ENV_NAME_NOT_VALID);
            return;
        }
        int i = 1;
        if (isAppDebuggable(this.context) && configuration.getCoreConfig$dd_sdk_android_core_release().getEnableDeveloperModeWhenDebuggable()) {
            configurationModifyConfigurationForDeveloperDebug = modifyConfigurationForDeveloperDebug(configuration);
            setDeveloperModeEnabled$dd_sdk_android_core_release(true);
            Datadog.setVerbosity(2);
        } else {
            configurationModifyConfigurationForDeveloperDebug = configuration;
        }
        FlushableExecutorService.Factory dEFAULT_FLUSHABLE_EXECUTOR_SERVICE_FACTORY$dd_sdk_android_core_release = this.executorServiceFactory;
        if (dEFAULT_FLUSHABLE_EXECUTOR_SERVICE_FACTORY$dd_sdk_android_core_release == null) {
            dEFAULT_FLUSHABLE_EXECUTOR_SERVICE_FACTORY$dd_sdk_android_core_release = CoreFeature.INSTANCE.getDEFAULT_FLUSHABLE_EXECUTOR_SERVICE_FACTORY$dd_sdk_android_core_release();
        }
        setCoreFeature$dd_sdk_android_core_release(new CoreFeature(getInternalLogger(), new DefaultAppStartTimeProvider(null, i, 0 == true ? 1 : 0), dEFAULT_FLUSHABLE_EXECUTOR_SERVICE_FACTORY$dd_sdk_android_core_release, CoreFeature.INSTANCE.getDEFAULT_SCHEDULED_EXECUTOR_SERVICE_FACTORY$dd_sdk_android_core_release()));
        getCoreFeature$dd_sdk_android_core_release().initialize(this.context, this.instanceId, configurationModifyConfigurationForDeveloperDebug, TrackingConsent.PENDING);
        applyAdditionalConfiguration(configurationModifyConfigurationForDeveloperDebug.getAdditionalConfig$dd_sdk_android_core_release());
        if (configurationModifyConfigurationForDeveloperDebug.getCrashReportsEnabled$dd_sdk_android_core_release()) {
            initializeCrashReportFeature();
        }
        setupLifecycleMonitorCallback(this.context);
        setupShutdownHook();
        sendCoreConfigurationTelemetryEvent(configuration);
    }

    public final boolean isActive$dd_sdk_android_core_release() {
        return getCoreFeature$dd_sdk_android_core_release().getInitialized().get();
    }

    @Override // com.datadog.android.api.SdkCore
    public boolean isCoreActive() {
        return isActive$dd_sdk_android_core_release();
    }

    @Override // com.datadog.android.core.InternalSdkCore
    /* JADX INFO: renamed from: isDeveloperModeEnabled, reason: from getter */
    public boolean getIsDeveloperModeEnabled() {
        return this.isDeveloperModeEnabled;
    }

    @Override // com.datadog.android.api.feature.FeatureSdkCore
    public void registerFeature(Feature feature) {
        feature.getClass();
        SdkFeature sdkFeature = new SdkFeature(getCoreFeature$dd_sdk_android_core_release(), feature, getInternalLogger());
        this.features.put(feature.getName(), sdkFeature);
        sdkFeature.initialize(this.context, this.instanceId);
        String name = feature.getName();
        if (wl7.b(name, "logs")) {
            getCoreFeature$dd_sdk_android_core_release().getNdkCrashHandler().handleNdkCrash(this, NdkCrashHandler.ReportTarget.LOGS);
        } else if (wl7.b(name, "rum")) {
            getCoreFeature$dd_sdk_android_core_release().getNdkCrashHandler().handleNdkCrash(this, NdkCrashHandler.ReportTarget.RUM);
        }
    }

    @Override // com.datadog.android.api.feature.FeatureSdkCore
    public void removeContextUpdateReceiver(String featureName, FeatureContextUpdateReceiver listener) {
        featureName.getClass();
        listener.getClass();
        SdkFeature sdkFeature = this.features.get(featureName);
        if (sdkFeature != null) {
            sdkFeature.removeContextUpdateListener$dd_sdk_android_core_release(listener);
        }
    }

    @Override // com.datadog.android.api.feature.FeatureSdkCore
    public void removeEventReceiver(String featureName) {
        AtomicReference<FeatureEventReceiver> eventReceiver$dd_sdk_android_core_release;
        featureName.getClass();
        SdkFeature sdkFeature = this.features.get(featureName);
        if (sdkFeature == null || (eventReceiver$dd_sdk_android_core_release = sdkFeature.getEventReceiver$dd_sdk_android_core_release()) == null) {
            return;
        }
        eventReceiver$dd_sdk_android_core_release.set(null);
    }

    @Override // com.datadog.android.api.feature.FeatureSdkCore
    public void setContextUpdateReceiver(String featureName, FeatureContextUpdateReceiver listener) {
        featureName.getClass();
        listener.getClass();
        SdkFeature sdkFeature = this.features.get(featureName);
        if (sdkFeature == null) {
            InternalLogger.DefaultImpls.log$default(getInternalLogger(), InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) new C05061(featureName), (Throwable) null, false, (Map) null, 56, (Object) null);
        } else {
            sdkFeature.setContextUpdateListener$dd_sdk_android_core_release(listener);
        }
    }

    public final void setCoreFeature$dd_sdk_android_core_release(CoreFeature coreFeature) {
        coreFeature.getClass();
        this.coreFeature = coreFeature;
    }

    public void setDeveloperModeEnabled$dd_sdk_android_core_release(boolean z) {
        this.isDeveloperModeEnabled = z;
    }

    @Override // com.datadog.android.api.feature.FeatureSdkCore
    public void setEventReceiver(String featureName, FeatureEventReceiver receiver) {
        featureName.getClass();
        receiver.getClass();
        SdkFeature sdkFeature = this.features.get(featureName);
        if (sdkFeature == null) {
            InternalLogger.DefaultImpls.log$default(getInternalLogger(), InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) new C05071(featureName), (Throwable) null, false, (Map) null, 56, (Object) null);
            return;
        }
        if (sdkFeature.getEventReceiver$dd_sdk_android_core_release().get() != null) {
            InternalLogger.DefaultImpls.log$default(getInternalLogger(), InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) new C05082(featureName), (Throwable) null, false, (Map) null, 56, (Object) null);
        }
        sdkFeature.getEventReceiver$dd_sdk_android_core_release().set(receiver);
    }

    @Override // com.datadog.android.api.SdkCore
    public void setTrackingConsent(TrackingConsent consent) {
        consent.getClass();
        getCoreFeature$dd_sdk_android_core_release().getTrackingConsentProvider().setConsent(consent);
    }

    @Override // com.datadog.android.api.SdkCore
    public void setUserInfo(String id, String name, String email, Map<String, ? extends Object> extraInfo) {
        extraInfo.getClass();
        getCoreFeature$dd_sdk_android_core_release().getUserInfoProvider().setUserInfo(id, name, email, extraInfo);
    }

    public final void stop$dd_sdk_android_core_release() {
        ProcessLifecycleMonitor processLifecycleMonitor;
        Iterator<Map.Entry<String, SdkFeature>> it = this.features.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().stop();
        }
        this.features.clear();
        Context context = this.context;
        if ((context instanceof Application) && (processLifecycleMonitor = this.processLifecycleMonitor) != null) {
            ((Application) context).unregisterActivityLifecycleCallbacks(processLifecycleMonitor);
        }
        getCoreFeature$dd_sdk_android_core_release().stop();
        setDeveloperModeEnabled$dd_sdk_android_core_release(false);
        removeShutdownHook();
    }

    @Override // com.datadog.android.api.feature.FeatureSdkCore
    public void updateFeatureContext(String featureName, Function1<? super Map<String, Object>, j6g> updateCallback) {
        ContextProvider contextProvider$dd_sdk_android_core_release;
        featureName.getClass();
        updateCallback.getClass();
        SdkFeature sdkFeature = this.features.get(featureName);
        if (sdkFeature == null || (contextProvider$dd_sdk_android_core_release = getContextProvider$dd_sdk_android_core_release()) == null) {
            return;
        }
        synchronized (sdkFeature) {
            try {
                HashMap map = new HashMap(contextProvider$dd_sdk_android_core_release.getFeatureContext(featureName));
                updateCallback.invoke(map);
                contextProvider$dd_sdk_android_core_release.setFeatureContext(featureName, map);
                for (Map.Entry<String, SdkFeature> entry : this.features.entrySet()) {
                    String key = entry.getKey();
                    SdkFeature value = entry.getValue();
                    if (!wl7.b(key, featureName)) {
                        value.notifyContextUpdated$dd_sdk_android_core_release(featureName, map);
                    }
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public void writeLastFatalAnrSent(long anrTimestamp) {
        getCoreFeature$dd_sdk_android_core_release().writeLastFatalAnrSent$dd_sdk_android_core_release(anrTimestamp);
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public void writeLastViewEvent(byte[] data) {
        data.getClass();
        if (this.buildSdkVersionProvider.getVersion() >= 30 || this.features.containsKey("ndk-crash-reporting")) {
            getCoreFeature$dd_sdk_android_core_release().writeLastViewEvent$dd_sdk_android_core_release(data);
        } else {
            InternalLogger.DefaultImpls.log$default(getInternalLogger(), InternalLogger.Level.INFO, InternalLogger.Target.MAINTAINER, (gu5) C05111.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/datadog/android/core/internal/DatadogCore$Companion;", "", "()V", "CONFIGURATION_TELEMETRY_DELAY_MS", "", "getCONFIGURATION_TELEMETRY_DELAY_MS$dd_sdk_android_core_release", "()J", "ENV_NAME_VALIDATION_REG_EX", "", "EVENT_RECEIVER_ALREADY_EXISTS", "MESSAGE_ENV_NAME_NOT_VALID", "MISSING_FEATURE_FOR_CONTEXT_UPDATE_LISTENER", "MISSING_FEATURE_FOR_EVENT_RECEIVER", "NO_NEED_TO_WRITE_LAST_VIEW_EVENT", "SHUTDOWN_THREAD_NAME", "startupTimeNs", "getStartupTimeNs$dd_sdk_android_core_release", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long getCONFIGURATION_TELEMETRY_DELAY_MS$dd_sdk_android_core_release() {
            return DatadogCore.CONFIGURATION_TELEMETRY_DELAY_MS;
        }

        public final long getStartupTimeNs$dd_sdk_android_core_release() {
            return DatadogCore.startupTimeNs;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.DatadogCore$removeShutdownHook$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05051 extends mj8 implements gu5<String> {
        public static final C05051 INSTANCE = new C05051();

        public C05051() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "Unable to remove shutdown hook, Runtime is already shutting down";
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.DatadogCore$removeShutdownHook$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements gu5<String> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "Security Manager denied removing shutdown hook ";
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.DatadogCore$setupShutdownHook$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05091 extends mj8 implements gu5<String> {
        public static final C05091 INSTANCE = new C05091();

        public C05091() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "Unable to add shutdown hook, Runtime is already shutting down";
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.DatadogCore$setupShutdownHook$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05102 extends mj8 implements gu5<String> {
        public static final C05102 INSTANCE = new C05102();

        public C05102() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "Shutdown hook was rejected";
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.DatadogCore$setupShutdownHook$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass3 extends mj8 implements gu5<String> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "Security Manager denied adding shutdown hook ";
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.DatadogCore$writeLastViewEvent$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05111 extends mj8 implements gu5<String> {
        public static final C05111 INSTANCE = new C05111();

        public C05111() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return DatadogCore.NO_NEED_TO_WRITE_LAST_VIEW_EVENT;
        }
    }

    public /* synthetic */ DatadogCore(Context context, String str, String str2, Function1 function1, FlushableExecutorService.Factory factory, BuildSdkVersionProvider buildSdkVersionProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2, (i & 8) != 0 ? AnonymousClass1.INSTANCE : function1, (i & 16) != 0 ? null : factory, (i & 32) != 0 ? BuildSdkVersionProvider.INSTANCE.getDEFAULT() : buildSdkVersionProvider);
    }
}
