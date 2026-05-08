package com.datadog.android.rum.internal.monitor;

import android.os.Handler;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.feature.FeatureScope;
import com.datadog.android.api.storage.DataWriter;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.feature.event.ThreadDump;
import com.datadog.android.core.internal.CoreFeature;
import com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver;
import com.datadog.android.core.internal.utils.ConcurrencyExtKt;
import com.datadog.android.internal.telemetry.InternalTelemetryEvent;
import com.datadog.android.rum.DdRumContentProvider;
import com.datadog.android.rum.ExperimentalRumApi;
import com.datadog.android.rum.RumActionType;
import com.datadog.android.rum.RumAttributes;
import com.datadog.android.rum.RumErrorSource;
import com.datadog.android.rum.RumMonitor;
import com.datadog.android.rum.RumPerformanceMetric;
import com.datadog.android.rum.RumResourceKind;
import com.datadog.android.rum.RumResourceMethod;
import com.datadog.android.rum.RumSessionListener;
import com.datadog.android.rum._RumInternalProxy;
import com.datadog.android.rum.internal.CombinedRumSessionListener;
import com.datadog.android.rum.internal.RumErrorSourceType;
import com.datadog.android.rum.internal.RumFeature;
import com.datadog.android.rum.internal.debug.RumDebugListener;
import com.datadog.android.rum.internal.domain.RumContext;
import com.datadog.android.rum.internal.domain.Time;
import com.datadog.android.rum.internal.domain.TimeKt;
import com.datadog.android.rum.internal.domain.event.ResourceTiming;
import com.datadog.android.rum.internal.domain.event.RumEventDeserializer;
import com.datadog.android.rum.internal.domain.event.RumEventMeta;
import com.datadog.android.rum.internal.domain.scope.RumApplicationScope;
import com.datadog.android.rum.internal.domain.scope.RumRawEvent;
import com.datadog.android.rum.internal.domain.scope.RumScope;
import com.datadog.android.rum.internal.domain.scope.RumScopeKey;
import com.datadog.android.rum.internal.domain.scope.RumSessionScope;
import com.datadog.android.rum.internal.domain.scope.RumViewManagerScope;
import com.datadog.android.rum.internal.domain.scope.RumViewScope;
import com.datadog.android.rum.internal.metric.SessionMetricDispatcher;
import com.datadog.android.rum.internal.monitor.StorageEvent;
import com.datadog.android.rum.internal.vitals.VitalMonitor;
import com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier;
import com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier;
import com.datadog.android.rum.resource.ResourceId;
import com.datadog.android.telemetry.internal.TelemetryEventHandler;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.bs4;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.lc9;
import defpackage.mj8;
import defpackage.p9;
import defpackage.r6;
import defpackage.wl7;
import defpackage.xf3;
import defpackage.yf3;
import defpackage.zf3;
import defpackage.zr4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000°\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 Ü\u00012\u00020\u00012\u00020\u0002:\u0002Ü\u0001B\u0095\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J%\u0010(\u001a\u00020&2\u0014\u0010'\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020&0%H\u0016¢\u0006\u0004\b(\u0010)J5\u0010.\u001a\u00020&2\u0006\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\u00032\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0,H\u0016¢\u0006\u0004\b.\u0010/J-\u00100\u001a\u00020&2\u0006\u0010*\u001a\u00020\r2\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0,H\u0016¢\u0006\u0004\b0\u00101J5\u00104\u001a\u00020&2\u0006\u00103\u001a\u0002022\u0006\u0010+\u001a\u00020\u00032\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0,H\u0016¢\u0006\u0004\b4\u00105J5\u00106\u001a\u00020&2\u0006\u00103\u001a\u0002022\u0006\u0010+\u001a\u00020\u00032\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0,H\u0016¢\u0006\u0004\b6\u00105J5\u00107\u001a\u00020&2\u0006\u00103\u001a\u0002022\u0006\u0010+\u001a\u00020\u00032\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0,H\u0016¢\u0006\u0004\b7\u00105J=\u0010:\u001a\u00020&2\u0006\u0010*\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u00032\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0,H\u0017¢\u0006\u0004\b:\u0010;J=\u0010:\u001a\u00020&2\u0006\u0010*\u001a\u00020\u00032\u0006\u00108\u001a\u00020<2\u0006\u00109\u001a\u00020\u00032\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0,H\u0016¢\u0006\u0004\b:\u0010=JI\u0010D\u001a\u00020&2\u0006\u0010*\u001a\u00020\u00032\b\u0010?\u001a\u0004\u0018\u00010>2\b\u0010A\u001a\u0004\u0018\u00010@2\u0006\u0010C\u001a\u00020B2\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0,H\u0016¢\u0006\u0004\bD\u0010EJO\u0010K\u001a\u00020&2\u0006\u0010*\u001a\u00020\u00032\b\u0010?\u001a\u0004\u0018\u00010>2\u0006\u0010F\u001a\u00020\u00032\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020I2\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0,H\u0016¢\u0006\u0004\bK\u0010LJY\u0010K\u001a\u00020&2\u0006\u0010*\u001a\u00020\u00032\b\u0010?\u001a\u0004\u0018\u00010>2\u0006\u0010F\u001a\u00020\u00032\u0006\u0010H\u001a\u00020G2\u0006\u0010M\u001a\u00020\u00032\b\u0010N\u001a\u0004\u0018\u00010\u00032\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0,H\u0016¢\u0006\u0004\bK\u0010OJ=\u0010:\u001a\u00020&2\u0006\u0010*\u001a\u00020P2\u0006\u00108\u001a\u00020<2\u0006\u00109\u001a\u00020\u00032\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0,H\u0016¢\u0006\u0004\b:\u0010QJI\u0010D\u001a\u00020&2\u0006\u0010*\u001a\u00020P2\b\u0010?\u001a\u0004\u0018\u00010>2\b\u0010A\u001a\u0004\u0018\u00010@2\u0006\u0010C\u001a\u00020B2\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0,H\u0016¢\u0006\u0004\bD\u0010RJO\u0010K\u001a\u00020&2\u0006\u0010*\u001a\u00020P2\b\u0010?\u001a\u0004\u0018\u00010>2\u0006\u0010F\u001a\u00020\u00032\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020I2\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0,H\u0016¢\u0006\u0004\bK\u0010SJY\u0010K\u001a\u00020&2\u0006\u0010*\u001a\u00020P2\b\u0010?\u001a\u0004\u0018\u00010>2\u0006\u0010F\u001a\u00020\u00032\u0006\u0010H\u001a\u00020G2\u0006\u0010M\u001a\u00020\u00032\b\u0010N\u001a\u0004\u0018\u00010\u00032\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0,H\u0016¢\u0006\u0004\bK\u0010TJ?\u0010U\u001a\u00020&2\u0006\u0010F\u001a\u00020\u00032\u0006\u0010H\u001a\u00020G2\b\u0010J\u001a\u0004\u0018\u00010I2\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0,H\u0016¢\u0006\u0004\bU\u0010VJ?\u0010X\u001a\u00020&2\u0006\u0010F\u001a\u00020\u00032\u0006\u0010H\u001a\u00020G2\b\u0010W\u001a\u0004\u0018\u00010\u00032\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0,H\u0016¢\u0006\u0004\bX\u0010YJ\u001f\u0010[\u001a\u00020&2\u0006\u0010+\u001a\u00020\u00032\u0006\u0010Z\u001a\u00020\rH\u0016¢\u0006\u0004\b[\u0010\\J#\u0010^\u001a\u00020&2\u0012\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0,H\u0016¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020&H\u0016¢\u0006\u0004\b`\u0010aJ!\u0010b\u001a\u00020&2\u0006\u0010*\u001a\u00020\u00032\b\u0010Z\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\bb\u0010\\J\u0017\u0010c\u001a\u00020&2\u0006\u0010*\u001a\u00020\u0003H\u0016¢\u0006\u0004\bc\u0010dJ\u001d\u0010e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0,H\u0016¢\u0006\u0004\be\u0010fJ\u000f\u0010g\u001a\u00020&H\u0016¢\u0006\u0004\bg\u0010aJ\u000f\u0010h\u001a\u00020&H\u0016¢\u0006\u0004\bh\u0010aJ\u000f\u0010i\u001a\u00020&H\u0016¢\u0006\u0004\bi\u0010aJ\u000f\u0010j\u001a\u00020&H\u0016¢\u0006\u0004\bj\u0010aJ\u0017\u0010k\u001a\u00020&2\u0006\u0010*\u001a\u00020\rH\u0016¢\u0006\u0004\bk\u0010lJ\u001f\u0010o\u001a\u00020&2\u0006\u0010*\u001a\u00020\r2\u0006\u0010n\u001a\u00020mH\u0016¢\u0006\u0004\bo\u0010pJ5\u0010t\u001a\u00020&2\u0006\u0010F\u001a\u00020\u00032\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020I2\f\u0010s\u001a\b\u0012\u0004\u0012\u00020r0qH\u0016¢\u0006\u0004\bt\u0010uJ\u0017\u0010v\u001a\u00020&2\u0006\u0010+\u001a\u00020\u0003H\u0016¢\u0006\u0004\bv\u0010dJ\u0017\u0010x\u001a\u00020&2\u0006\u0010w\u001a\u00020\tH\u0017¢\u0006\u0004\bx\u0010yJ\u001f\u0010|\u001a\u00020&2\u0006\u0010z\u001a\u00020@2\u0006\u0010{\u001a\u00020\u0003H\u0016¢\u0006\u0004\b|\u0010}J#\u0010\u0081\u0001\u001a\u00020&2\u0006\u0010~\u001a\u00020\u00032\u0007\u0010\u0080\u0001\u001a\u00020\u007fH\u0016¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J#\u0010\u0083\u0001\u001a\u00020&2\u0006\u0010~\u001a\u00020\u00032\u0007\u0010\u0080\u0001\u001a\u00020\u007fH\u0016¢\u0006\u0006\b\u0083\u0001\u0010\u0082\u0001J\u001e\u0010\u0086\u0001\u001a\u00020&2\n\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u0001H\u0016¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0011\u0010\u0088\u0001\u001a\u00020&H\u0016¢\u0006\u0005\b\u0088\u0001\u0010aJ\u0011\u0010\u0089\u0001\u001a\u00020&H\u0016¢\u0006\u0005\b\u0089\u0001\u0010aJ%\u0010\u008d\u0001\u001a\u00020&2\b\u0010\u008b\u0001\u001a\u00030\u008a\u00012\u0007\u0010Z\u001a\u00030\u008c\u0001H\u0016¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J$\u0010\u0091\u0001\u001a\u00020&2\u0007\u0010\u008f\u0001\u001a\u00020\u00032\u0007\u0010\u0090\u0001\u001a\u00020\u0003H\u0016¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u0013\u0010\u0094\u0001\u001a\u00030\u0093\u0001H\u0016¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u001c\u0010\u0098\u0001\u001a\u00020&2\b\u0010\u0097\u0001\u001a\u00030\u0096\u0001H\u0016¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u0011\u0010\u009b\u0001\u001a\u00020&H\u0000¢\u0006\u0005\b\u009a\u0001\u0010aJ\u001c\u0010\u009f\u0001\u001a\u00020&2\b\u0010\u0080\u0001\u001a\u00030\u009c\u0001H\u0000¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u0011\u0010¡\u0001\u001a\u00020&H\u0000¢\u0006\u0005\b \u0001\u0010aJ\u0011\u0010£\u0001\u001a\u00020&H\u0000¢\u0006\u0005\b¢\u0001\u0010aJ\u0011\u0010¤\u0001\u001a\u00020&H\u0002¢\u0006\u0005\b¤\u0001\u0010aJ)\u0010¦\u0001\u001a\u00030¥\u00012\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0,H\u0002¢\u0006\u0006\b¦\u0001\u0010§\u0001J*\u0010¨\u0001\u001a\u0004\u0018\u00010\u00032\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0,H\u0002¢\u0006\u0006\b¨\u0001\u0010©\u0001J)\u0010«\u0001\u001a\u00030ª\u00012\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0,H\u0002¢\u0006\u0006\b«\u0001\u0010¬\u0001R\u0015\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0006\u0010\u00ad\u0001R\u001d\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\b\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001R\u001d\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\n\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001R\u001d\u0010\u000b\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u000b\u0010±\u0001\u001a\u0006\b´\u0001\u0010³\u0001R\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000e\u0010µ\u0001R\u001d\u0010\u0010\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u0010\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001R\u001d\u0010\u0012\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u0012\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001R\u0015\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0014\u0010¼\u0001R\u001d\u0010\u001e\u001a\u00020\u001d8\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u001e\u0010½\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001R*\u0010Á\u0001\u001a\u00030À\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÁ\u0001\u0010Â\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001\"\u0006\bÅ\u0001\u0010Æ\u0001R \u0010È\u0001\u001a\u00030Ç\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÈ\u0001\u0010É\u0001\u001a\u0006\bÊ\u0001\u0010Ë\u0001R,\u0010Ì\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÌ\u0001\u0010Í\u0001\u001a\u0006\bÎ\u0001\u0010Ï\u0001\"\u0006\bÐ\u0001\u0010\u0087\u0001R\u0018\u0010Ñ\u0001\u001a\u00030\u0093\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÑ\u0001\u0010Ò\u0001R&\u0010Ô\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0Ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÔ\u0001\u0010Õ\u0001R\u0018\u0010×\u0001\u001a\u00030Ö\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b×\u0001\u0010Ø\u0001R(\u0010Û\u0001\u001a\u00020\t2\u0006\u0010Z\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\bÙ\u0001\u0010³\u0001\"\u0005\bÚ\u0001\u0010y¨\u0006Ý\u0001"}, d2 = {"Lcom/datadog/android/rum/internal/monitor/DatadogRumMonitor;", "Lcom/datadog/android/rum/RumMonitor;", "Lcom/datadog/android/rum/internal/monitor/AdvancedRumMonitor;", "", "applicationId", "Lcom/datadog/android/core/InternalSdkCore;", "sdkCore", "", "sampleRate", "", "backgroundTrackingEnabled", "trackFrustrations", "Lcom/datadog/android/api/storage/DataWriter;", "", "writer", "Landroid/os/Handler;", "handler", "Lcom/datadog/android/telemetry/internal/TelemetryEventHandler;", "telemetryEventHandler", "Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;", "sessionEndedMetricDispatcher", "Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "firstPartyHostHeaderTypeResolver", "Lcom/datadog/android/rum/internal/vitals/VitalMonitor;", "cpuVitalMonitor", "memoryVitalMonitor", "frameRateVitalMonitor", "Lcom/datadog/android/rum/RumSessionListener;", "sessionListener", "Ljava/util/concurrent/ExecutorService;", "executorService", "Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;", "initialResourceIdentifier", "Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;", "lastInteractionIdentifier", "<init>", "(Ljava/lang/String;Lcom/datadog/android/core/InternalSdkCore;FZZLcom/datadog/android/api/storage/DataWriter;Landroid/os/Handler;Lcom/datadog/android/telemetry/internal/TelemetryEventHandler;Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;Lcom/datadog/android/rum/internal/vitals/VitalMonitor;Lcom/datadog/android/rum/internal/vitals/VitalMonitor;Lcom/datadog/android/rum/internal/vitals/VitalMonitor;Lcom/datadog/android/rum/RumSessionListener;Ljava/util/concurrent/ExecutorService;Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;)V", "Lkotlin/Function1;", "Lj6g;", "callback", "getCurrentSessionId", "(Lkotlin/jvm/functions/Function1;)V", "key", "name", "", RumFeature.EVENT_ATTRIBUTES_PROPERTY, "startView", "(Ljava/lang/Object;Ljava/lang/String;Ljava/util/Map;)V", "stopView", "(Ljava/lang/Object;Ljava/util/Map;)V", "Lcom/datadog/android/rum/RumActionType;", "type", "addAction", "(Lcom/datadog/android/rum/RumActionType;Ljava/lang/String;Ljava/util/Map;)V", "startAction", "stopAction", "method", "url", "startResource", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lcom/datadog/android/rum/RumResourceMethod;", "(Ljava/lang/String;Lcom/datadog/android/rum/RumResourceMethod;Ljava/lang/String;Ljava/util/Map;)V", "", "statusCode", "", "size", "Lcom/datadog/android/rum/RumResourceKind;", "kind", "stopResource", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Lcom/datadog/android/rum/RumResourceKind;Ljava/util/Map;)V", "message", "Lcom/datadog/android/rum/RumErrorSource;", "source", "", RumFeature.EVENT_THROWABLE_PROPERTY, "stopResourceWithError", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Throwable;Ljava/util/Map;)V", "stackTrace", "errorType", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lcom/datadog/android/rum/resource/ResourceId;", "(Lcom/datadog/android/rum/resource/ResourceId;Lcom/datadog/android/rum/RumResourceMethod;Ljava/lang/String;Ljava/util/Map;)V", "(Lcom/datadog/android/rum/resource/ResourceId;Ljava/lang/Integer;Ljava/lang/Long;Lcom/datadog/android/rum/RumResourceKind;Ljava/util/Map;)V", "(Lcom/datadog/android/rum/resource/ResourceId;Ljava/lang/Integer;Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Throwable;Ljava/util/Map;)V", "(Lcom/datadog/android/rum/resource/ResourceId;Ljava/lang/Integer;Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "addError", "(Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Throwable;Ljava/util/Map;)V", "stacktrace", "addErrorWithStacktrace", "(Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/String;Ljava/util/Map;)V", "value", "addFeatureFlagEvaluation", "(Ljava/lang/String;Ljava/lang/Object;)V", "featureFlags", "addFeatureFlagEvaluations", "(Ljava/util/Map;)V", "stopSession", "()V", "addAttribute", "removeAttribute", "(Ljava/lang/String;)V", "getAttributes", "()Ljava/util/Map;", "clearAttributes", "sendWebViewEvent", "resetSession", "start", "waitForResourceTiming", "(Ljava/lang/Object;)V", "Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;", "timing", "addResourceTiming", "(Ljava/lang/Object;Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;)V", "", "Lcom/datadog/android/core/feature/event/ThreadDump;", "threads", "addCrash", "(Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Throwable;Ljava/util/List;)V", "addTiming", "overwrite", "addViewLoadingTime", "(Z)V", "durationNs", "target", "addLongTask", "(JLjava/lang/String;)V", RumEventMeta.VIEW_ID_KEY, "Lcom/datadog/android/rum/internal/monitor/StorageEvent;", "event", "eventSent", "(Ljava/lang/String;Lcom/datadog/android/rum/internal/monitor/StorageEvent;)V", "eventDropped", "Lcom/datadog/android/rum/internal/debug/RumDebugListener;", "listener", "setDebugListener", "(Lcom/datadog/android/rum/internal/debug/RumDebugListener;)V", "addSessionReplaySkippedFrame", "notifyInterceptorInstantiated", "Lcom/datadog/android/rum/RumPerformanceMetric;", "metric", "", "updatePerformanceMetric", "(Lcom/datadog/android/rum/RumPerformanceMetric;D)V", "testId", "resultId", "setSyntheticsAttribute", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/datadog/android/rum/_RumInternalProxy;", "_getInternal", "()Lcom/datadog/android/rum/_RumInternalProxy;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;", "telemetryEvent", "sendTelemetryEvent", "(Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;)V", "drainExecutorService$dd_sdk_android_rum_release", "drainExecutorService", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "handleEvent$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;)V", "handleEvent", "stopKeepAliveCallback$dd_sdk_android_rum_release", "stopKeepAliveCallback", "notifyDebugListenerWithState$dd_sdk_android_rum_release", "notifyDebugListenerWithState", "waitForPendingEvents", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime", "(Ljava/util/Map;)Lcom/datadog/android/rum/internal/domain/Time;", "getErrorType", "(Ljava/util/Map;)Ljava/lang/String;", "Lcom/datadog/android/rum/internal/RumErrorSourceType;", "getErrorSourceType", "(Ljava/util/Map;)Lcom/datadog/android/rum/internal/RumErrorSourceType;", "Lcom/datadog/android/core/InternalSdkCore;", "F", "getSampleRate$dd_sdk_android_rum_release", "()F", "Z", "getBackgroundTrackingEnabled$dd_sdk_android_rum_release", "()Z", "getTrackFrustrations$dd_sdk_android_rum_release", "Lcom/datadog/android/api/storage/DataWriter;", "Landroid/os/Handler;", "getHandler$dd_sdk_android_rum_release", "()Landroid/os/Handler;", "Lcom/datadog/android/telemetry/internal/TelemetryEventHandler;", "getTelemetryEventHandler$dd_sdk_android_rum_release", "()Lcom/datadog/android/telemetry/internal/TelemetryEventHandler;", "Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;", "Ljava/util/concurrent/ExecutorService;", "getExecutorService$dd_sdk_android_rum_release", "()Ljava/util/concurrent/ExecutorService;", "Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "rootScope", "Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "getRootScope$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "setRootScope$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/internal/domain/scope/RumScope;)V", "Ljava/lang/Runnable;", "keepAliveRunnable", "Ljava/lang/Runnable;", "getKeepAliveRunnable$dd_sdk_android_rum_release", "()Ljava/lang/Runnable;", "debugListener", "Lcom/datadog/android/rum/internal/debug/RumDebugListener;", "getDebugListener$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/debug/RumDebugListener;", "setDebugListener$dd_sdk_android_rum_release", "internalProxy", "Lcom/datadog/android/rum/_RumInternalProxy;", "", "globalAttributes", "Ljava/util/Map;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isDebugEnabled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getDebug", "setDebug", RumEventDeserializer.TELEMETRY_TYPE_DEBUG, "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class DatadogRumMonitor implements RumMonitor, AdvancedRumMonitor {
    public static final long DRAIN_WAIT_SECONDS = 10;
    public static final String RUM_DEBUG_RUM_NOT_ENABLED_WARNING = "Cannot switch RUM debugging, because RUM feature is not enabled.";
    private final boolean backgroundTrackingEnabled;
    private RumDebugListener debugListener;
    private final ExecutorService executorService;
    private final Map<String, Object> globalAttributes;
    private final Handler handler;
    private final _RumInternalProxy internalProxy;
    private final AtomicBoolean isDebugEnabled;
    private final Runnable keepAliveRunnable;
    private RumScope rootScope;
    private final float sampleRate;
    private final InternalSdkCore sdkCore;
    private final SessionMetricDispatcher sessionEndedMetricDispatcher;
    private final TelemetryEventHandler telemetryEventHandler;
    private final boolean trackFrustrations;
    private final DataWriter<Object> writer;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long KEEP_ALIVE_MS = 300000;

    public DatadogRumMonitor(String str, InternalSdkCore internalSdkCore, float f, boolean z, boolean z2, DataWriter<Object> dataWriter, Handler handler, TelemetryEventHandler telemetryEventHandler, SessionMetricDispatcher sessionMetricDispatcher, FirstPartyHostHeaderTypeResolver firstPartyHostHeaderTypeResolver, VitalMonitor vitalMonitor, VitalMonitor vitalMonitor2, VitalMonitor vitalMonitor3, RumSessionListener rumSessionListener, ExecutorService executorService, InitialResourceIdentifier initialResourceIdentifier, LastInteractionIdentifier lastInteractionIdentifier) {
        str.getClass();
        internalSdkCore.getClass();
        dataWriter.getClass();
        handler.getClass();
        telemetryEventHandler.getClass();
        sessionMetricDispatcher.getClass();
        firstPartyHostHeaderTypeResolver.getClass();
        vitalMonitor.getClass();
        vitalMonitor2.getClass();
        vitalMonitor3.getClass();
        rumSessionListener.getClass();
        executorService.getClass();
        initialResourceIdentifier.getClass();
        lastInteractionIdentifier.getClass();
        this.sdkCore = internalSdkCore;
        this.sampleRate = f;
        this.backgroundTrackingEnabled = z;
        this.trackFrustrations = z2;
        this.writer = dataWriter;
        this.handler = handler;
        this.telemetryEventHandler = telemetryEventHandler;
        this.sessionEndedMetricDispatcher = sessionMetricDispatcher;
        this.executorService = executorService;
        this.rootScope = new RumApplicationScope(str, internalSdkCore, f, z, z2, firstPartyHostHeaderTypeResolver, vitalMonitor, vitalMonitor2, vitalMonitor3, sessionMetricDispatcher, new CombinedRumSessionListener(rumSessionListener, telemetryEventHandler), initialResourceIdentifier, lastInteractionIdentifier);
        zf3 zf3Var = new zf3(this, 0);
        this.keepAliveRunnable = zf3Var;
        this.internalProxy = new _RumInternalProxy(this);
        handler.postDelayed(zf3Var, KEEP_ALIVE_MS);
        this.globalAttributes = new ConcurrentHashMap();
        this.isDebugEnabled = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrentSessionId$lambda$2(DatadogRumMonitor datadogRumMonitor, Function1 function1) {
        RumScope activeSession;
        RumContext rumContext;
        datadogRumMonitor.getClass();
        function1.getClass();
        RumScope rumScope = datadogRumMonitor.rootScope;
        String str = null;
        RumApplicationScope rumApplicationScope = rumScope instanceof RumApplicationScope ? (RumApplicationScope) rumScope : null;
        if (rumApplicationScope != null && (activeSession = rumApplicationScope.getActiveSession()) != null && (rumContext = activeSession.getRumContext()) != null) {
            String sessionId = rumContext.getSessionId();
            if (rumContext.getSessionState() != RumSessionScope.State.NOT_TRACKED && !wl7.b(sessionId, RumContext.INSTANCE.getNULL_UUID())) {
                str = sessionId;
            }
        }
        function1.invoke(str);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final RumErrorSourceType getErrorSourceType(Map<String, ? extends Object> attributes) {
        Object obj = attributes.get("_dd.error.source_type");
        String strF = null;
        String str = obj instanceof String ? (String) obj : null;
        if (str != null) {
            Locale locale = Locale.US;
            strF = r6.f(locale, str, locale);
        }
        if (strF != null) {
            switch (strF.hashCode()) {
                case -861391249:
                    if (strF.equals(CoreFeature.DEFAULT_SOURCE_NAME)) {
                        return RumErrorSourceType.ANDROID;
                    }
                    break;
                case -760334308:
                    if (strF.equals("flutter")) {
                        return RumErrorSourceType.FLUTTER;
                    }
                    break;
                case -380982102:
                    if (strF.equals("ndk+il2cpp")) {
                        return RumErrorSourceType.NDK_IL2CPP;
                    }
                    break;
                case 108917:
                    if (strF.equals("ndk")) {
                        return RumErrorSourceType.NDK;
                    }
                    break;
                case 150940456:
                    if (strF.equals("browser")) {
                        return RumErrorSourceType.BROWSER;
                    }
                    break;
                case 828638245:
                    if (strF.equals("react-native")) {
                        return RumErrorSourceType.REACT_NATIVE;
                    }
                    break;
            }
        }
        return RumErrorSourceType.ANDROID;
    }

    private final String getErrorType(Map<String, ? extends Object> attributes) {
        Object obj = attributes.get(RumAttributes.INTERNAL_ERROR_TYPE);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    private final Time getEventTime(Map<String, ? extends Object> attributes) {
        Time timeAsTime;
        Object obj = attributes.get(RumAttributes.INTERNAL_TIMESTAMP);
        Long l = obj instanceof Long ? (Long) obj : null;
        return (l == null || (timeAsTime = TimeKt.asTime(l.longValue())) == null) ? new Time(0L, 0L, 3, null) : timeAsTime;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleEvent$lambda$6(DatadogRumMonitor datadogRumMonitor, RumRawEvent rumRawEvent) {
        datadogRumMonitor.getClass();
        rumRawEvent.getClass();
        synchronized (datadogRumMonitor.rootScope) {
            datadogRumMonitor.rootScope.handleEvent(rumRawEvent, datadogRumMonitor.writer);
            datadogRumMonitor.notifyDebugListenerWithState$dd_sdk_android_rum_release();
            j6g j6gVar = j6g.a;
        }
        datadogRumMonitor.handler.postDelayed(datadogRumMonitor.keepAliveRunnable, KEEP_ALIVE_MS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void keepAliveRunnable$lambda$0(DatadogRumMonitor datadogRumMonitor) {
        datadogRumMonitor.getClass();
        datadogRumMonitor.handleEvent$dd_sdk_android_rum_release(new RumRawEvent.KeepAlive(null, 1, 0 == true ? 1 : 0));
    }

    private final void waitForPendingEvents() {
        if (this.executorService.isShutdown()) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ConcurrencyExtKt.submitSafe(this.executorService, "pending event waiting", this.sdkCore.getInternalLogger(), new yf3(countDownLatch, 0));
        try {
            countDownLatch.await(1L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, (gu5) AnonymousClass2.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void waitForPendingEvents$lambda$7(CountDownLatch countDownLatch) {
        countDownLatch.getClass();
        countDownLatch.countDown();
    }

    @Override // com.datadog.android.rum.RumMonitor
    /* JADX INFO: renamed from: _getInternal, reason: from getter */
    public _RumInternalProxy getInternalProxy() {
        return this.internalProxy;
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void addAction(RumActionType type, String name, Map<String, ? extends Object> attributes) {
        type.getClass();
        name.getClass();
        attributes.getClass();
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.StartAction(type, name, false, lc9.g0(attributes), getEventTime(attributes)));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void addAttribute(String key, Object value) {
        key.getClass();
        Map<String, Object> map = this.globalAttributes;
        if (value == null) {
            map.remove(key);
        } else {
            map.put(key, value);
        }
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public void addCrash(String message, RumErrorSource source, Throwable throwable, List<ThreadDump> threads) {
        message.getClass();
        source.getClass();
        throwable.getClass();
        threads.getClass();
        Time time = new Time(0L, 0L, 3, null);
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.AddError(message, source, throwable, null, true, bs4.a, time, null, null, threads, Long.valueOf(time.getNanoTime() - this.sdkCore.getAppStartTimeNs()), 384, null));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void addError(String message, RumErrorSource source, Throwable throwable, Map<String, ? extends Object> attributes) {
        message.getClass();
        source.getClass();
        attributes.getClass();
        Time eventTime = getEventTime(attributes);
        String errorType = getErrorType(attributes);
        LinkedHashMap linkedHashMap = new LinkedHashMap(attributes);
        Object objRemove = linkedHashMap.remove(RumAttributes.INTERNAL_ALL_THREADS);
        List list = objRemove instanceof List ? (List) objRemove : null;
        if (list == null) {
            list = zr4.a;
        }
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.AddError(message, source, throwable, null, false, linkedHashMap, eventTime, errorType, null, list, null, 1280, null));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void addErrorWithStacktrace(String message, RumErrorSource source, String stacktrace, Map<String, ? extends Object> attributes) {
        message.getClass();
        source.getClass();
        attributes.getClass();
        Throwable th = null;
        boolean z = false;
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.AddError(message, source, th, stacktrace, z, lc9.g0(attributes), getEventTime(attributes), getErrorType(attributes), getErrorSourceType(attributes), zr4.a, null, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, null));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void addFeatureFlagEvaluation(String name, Object value) {
        name.getClass();
        value.getClass();
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.AddFeatureFlagEvaluation(name, value, null, 4, null));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void addFeatureFlagEvaluations(Map<String, ? extends Object> featureFlags) {
        featureFlags.getClass();
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.AddFeatureFlagEvaluations(featureFlags, null, 2, 0 == true ? 1 : 0));
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public void addLongTask(long durationNs, String target) {
        target.getClass();
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.AddLongTask(durationNs, target, null, 4, null));
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor
    public void addResourceTiming(Object key, ResourceTiming timing) {
        key.getClass();
        timing.getClass();
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.AddResourceTiming(key, timing, null, 4, null));
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public void addSessionReplaySkippedFrame() {
        getCurrentSessionId(new AnonymousClass1());
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void addTiming(String name) {
        name.getClass();
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.AddCustomTiming(name, null, 2, 0 == true ? 1 : 0));
    }

    @Override // com.datadog.android.rum.RumMonitor
    @ExperimentalRumApi
    public void addViewLoadingTime(boolean overwrite) {
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.AddViewLoadingTime(overwrite, null, 2, 0 == true ? 1 : 0));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void clearAttributes() {
        this.globalAttributes.clear();
    }

    public final void drainExecutorService$dd_sdk_android_rum_release() throws InterruptedException {
        BlockingQueue<Runnable> queue;
        ArrayList arrayList = new ArrayList();
        ExecutorService executorService = this.executorService;
        ThreadPoolExecutor threadPoolExecutor = executorService instanceof ThreadPoolExecutor ? (ThreadPoolExecutor) executorService : null;
        if (threadPoolExecutor != null && (queue = threadPoolExecutor.getQueue()) != null) {
            queue.drainTo(arrayList);
        }
        this.executorService.shutdown();
        this.executorService.awaitTermination(10L, TimeUnit.SECONDS);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public void eventDropped(String viewId, StorageEvent event) {
        viewId.getClass();
        event.getClass();
        if (event instanceof StorageEvent.Action) {
            handleEvent$dd_sdk_android_rum_release(new RumRawEvent.ActionDropped(viewId, null, 2, 0 == true ? 1 : 0));
            return;
        }
        if (event instanceof StorageEvent.Resource) {
            handleEvent$dd_sdk_android_rum_release(new RumRawEvent.ResourceDropped(viewId, ((StorageEvent.Resource) event).getResourceId(), null, 4, null));
            return;
        }
        if (event instanceof StorageEvent.Error) {
            handleEvent$dd_sdk_android_rum_release(new RumRawEvent.ErrorDropped(viewId, ((StorageEvent.Error) event).getResourceId(), null, 4, null));
        } else if (event instanceof StorageEvent.LongTask) {
            handleEvent$dd_sdk_android_rum_release(new RumRawEvent.LongTaskDropped(viewId, false, null, 4, null));
        } else if (event instanceof StorageEvent.FrozenFrame) {
            handleEvent$dd_sdk_android_rum_release(new RumRawEvent.LongTaskDropped(viewId, true, null, 4, null));
        }
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public void eventSent(String viewId, StorageEvent event) {
        viewId.getClass();
        event.getClass();
        if (event instanceof StorageEvent.Action) {
            StorageEvent.Action action = (StorageEvent.Action) event;
            handleEvent$dd_sdk_android_rum_release(new RumRawEvent.ActionSent(viewId, action.getFrustrationCount(), action.getType(), action.getEventEndTimestampInNanos(), null, 16, null));
            return;
        }
        if (event instanceof StorageEvent.Resource) {
            StorageEvent.Resource resource = (StorageEvent.Resource) event;
            handleEvent$dd_sdk_android_rum_release(new RumRawEvent.ResourceSent(viewId, resource.getResourceId(), resource.getResourceStopTimestampInNanos(), null, 8, null));
            return;
        }
        if (event instanceof StorageEvent.Error) {
            StorageEvent.Error error = (StorageEvent.Error) event;
            handleEvent$dd_sdk_android_rum_release(new RumRawEvent.ErrorSent(viewId, error.getResourceId(), error.getResourceStopTimestampInNanos(), null, 8, null));
        } else if (event instanceof StorageEvent.LongTask) {
            handleEvent$dd_sdk_android_rum_release(new RumRawEvent.LongTaskSent(viewId, false, null, 4, null));
        } else if (event instanceof StorageEvent.FrozenFrame) {
            handleEvent$dd_sdk_android_rum_release(new RumRawEvent.LongTaskSent(viewId, true, null, 4, null));
        }
    }

    @Override // com.datadog.android.rum.RumMonitor
    public Map<String, Object> getAttributes() {
        return this.globalAttributes;
    }

    /* JADX INFO: renamed from: getBackgroundTrackingEnabled$dd_sdk_android_rum_release, reason: from getter */
    public final boolean getBackgroundTrackingEnabled() {
        return this.backgroundTrackingEnabled;
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void getCurrentSessionId(Function1<? super String, j6g> callback) {
        callback.getClass();
        ConcurrencyExtKt.submitSafe(this.executorService, "Get current session ID", this.sdkCore.getInternalLogger(), new p9(2, this, callback));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public boolean getDebug() {
        return this.isDebugEnabled.get();
    }

    /* JADX INFO: renamed from: getDebugListener$dd_sdk_android_rum_release, reason: from getter */
    public final RumDebugListener getDebugListener() {
        return this.debugListener;
    }

    /* JADX INFO: renamed from: getExecutorService$dd_sdk_android_rum_release, reason: from getter */
    public final ExecutorService getExecutorService() {
        return this.executorService;
    }

    /* JADX INFO: renamed from: getHandler$dd_sdk_android_rum_release, reason: from getter */
    public final Handler getHandler() {
        return this.handler;
    }

    /* JADX INFO: renamed from: getKeepAliveRunnable$dd_sdk_android_rum_release, reason: from getter */
    public final Runnable getKeepAliveRunnable() {
        return this.keepAliveRunnable;
    }

    /* JADX INFO: renamed from: getRootScope$dd_sdk_android_rum_release, reason: from getter */
    public final RumScope getRootScope() {
        return this.rootScope;
    }

    /* JADX INFO: renamed from: getSampleRate$dd_sdk_android_rum_release, reason: from getter */
    public final float getSampleRate() {
        return this.sampleRate;
    }

    /* JADX INFO: renamed from: getTelemetryEventHandler$dd_sdk_android_rum_release, reason: from getter */
    public final TelemetryEventHandler getTelemetryEventHandler() {
        return this.telemetryEventHandler;
    }

    /* JADX INFO: renamed from: getTrackFrustrations$dd_sdk_android_rum_release, reason: from getter */
    public final boolean getTrackFrustrations() {
        return this.trackFrustrations;
    }

    public final void handleEvent$dd_sdk_android_rum_release(RumRawEvent event) {
        event.getClass();
        if ((event instanceof RumRawEvent.AddError) && ((RumRawEvent.AddError) event).isFatal()) {
            synchronized (this.rootScope) {
                this.rootScope.handleEvent(event, this.writer);
            }
        } else {
            if (event instanceof RumRawEvent.TelemetryEventWrapper) {
                this.telemetryEventHandler.handleEvent((RumRawEvent.TelemetryEventWrapper) event, this.writer);
                return;
            }
            this.handler.removeCallbacks(this.keepAliveRunnable);
            if (this.executorService.isShutdown()) {
                return;
            }
            ConcurrencyExtKt.submitSafe(this.executorService, "Rum event handling", this.sdkCore.getInternalLogger(), new xf3(0, this, event));
        }
    }

    public final void notifyDebugListenerWithState$dd_sdk_android_rum_release() {
        RumDebugListener rumDebugListener = this.debugListener;
        if (rumDebugListener != null) {
            RumScope rumScope = this.rootScope;
            RumApplicationScope rumApplicationScope = rumScope instanceof RumApplicationScope ? (RumApplicationScope) rumScope : null;
            RumScope activeSession = rumApplicationScope != null ? rumApplicationScope.getActiveSession() : null;
            RumSessionScope rumSessionScope = activeSession instanceof RumSessionScope ? (RumSessionScope) activeSession : null;
            RumScope childScope$dd_sdk_android_rum_release = rumSessionScope != null ? rumSessionScope.getChildScope() : null;
            RumViewManagerScope rumViewManagerScope = childScope$dd_sdk_android_rum_release instanceof RumViewManagerScope ? (RumViewManagerScope) childScope$dd_sdk_android_rum_release : null;
            if (rumViewManagerScope != null) {
                List<RumScope> childrenScopes$dd_sdk_android_rum_release = rumViewManagerScope.getChildrenScopes$dd_sdk_android_rum_release();
                ArrayList arrayList = new ArrayList();
                for (Object obj : childrenScopes$dd_sdk_android_rum_release) {
                    if (obj instanceof RumViewScope) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (((RumViewScope) obj2).getIsActive()) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    String viewName = ((RumViewScope) it.next()).getRumContext().getViewName();
                    if (viewName != null) {
                        arrayList3.add(viewName);
                    }
                }
                rumDebugListener.onReceiveRumActiveViews(arrayList3);
            }
        }
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor
    public void notifyInterceptorInstantiated() {
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.TelemetryEventWrapper(InternalTelemetryEvent.InterceptorInstantiated.INSTANCE, null, 2, 0 == true ? 1 : 0));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void removeAttribute(String key) {
        key.getClass();
        this.globalAttributes.remove(key);
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public void resetSession() {
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.ResetSession(null, 1, 0 == true ? 1 : 0));
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public void sendTelemetryEvent(InternalTelemetryEvent telemetryEvent) {
        telemetryEvent.getClass();
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.TelemetryEventWrapper(telemetryEvent, null, 2, 0 == true ? 1 : 0));
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public void sendWebViewEvent() {
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.WebViewEvent(null, 1, 0 == true ? 1 : 0));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void setDebug(boolean z) {
        if (z == this.isDebugEnabled.get()) {
            return;
        }
        FeatureScope feature = this.sdkCore.getFeature("rum");
        RumFeature rumFeature = feature != null ? (RumFeature) feature.unwrap() : null;
        if (rumFeature == null) {
            InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) DatadogRumMonitor$debug$1.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
            return;
        }
        if (z) {
            rumFeature.enableDebugging$dd_sdk_android_rum_release(this);
        } else {
            rumFeature.disableDebugging$dd_sdk_android_rum_release();
        }
        this.isDebugEnabled.set(z);
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public void setDebugListener(RumDebugListener listener) {
        this.debugListener = listener;
    }

    public final void setDebugListener$dd_sdk_android_rum_release(RumDebugListener rumDebugListener) {
        this.debugListener = rumDebugListener;
    }

    public final void setRootScope$dd_sdk_android_rum_release(RumScope rumScope) {
        rumScope.getClass();
        this.rootScope = rumScope;
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public void setSyntheticsAttribute(String testId, String resultId) {
        testId.getClass();
        resultId.getClass();
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.SetSyntheticsTestAttribute(testId, resultId, null, 4, null));
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public void start() {
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.SdkInit(DdRumContentProvider.INSTANCE.getProcessImportance$dd_sdk_android_rum_release() == 100, null, 2, 0 == true ? 1 : 0));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void startAction(RumActionType type, String name, Map<String, ? extends Object> attributes) {
        type.getClass();
        name.getClass();
        attributes.getClass();
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.StartAction(type, name, true, lc9.g0(attributes), getEventTime(attributes)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    @Override // com.datadog.android.rum.RumMonitor
    @defpackage.sy3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void startResource(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.util.Map<java.lang.String, ? extends java.lang.Object> r14) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.internal.monitor.DatadogRumMonitor.startResource(java.lang.String, java.lang.String, java.lang.String, java.util.Map):void");
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void startView(Object key, String name, Map<String, ? extends Object> attributes) {
        key.getClass();
        name.getClass();
        attributes.getClass();
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.StartView(RumScopeKey.INSTANCE.from(key, name), lc9.g0(attributes), getEventTime(attributes)));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void stopAction(RumActionType type, String name, Map<String, ? extends Object> attributes) {
        type.getClass();
        name.getClass();
        attributes.getClass();
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.StopAction(type, name, lc9.g0(attributes), getEventTime(attributes)));
    }

    public final void stopKeepAliveCallback$dd_sdk_android_rum_release() {
        this.handler.removeCallbacks(this.keepAliveRunnable);
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void stopResource(String key, Integer statusCode, Long size, RumResourceKind kind, Map<String, ? extends Object> attributes) {
        key.getClass();
        kind.getClass();
        attributes.getClass();
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.StopResource(key, statusCode != null ? Long.valueOf(statusCode.intValue()) : null, size, kind, lc9.g0(attributes), getEventTime(attributes)));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void stopResourceWithError(String key, Integer statusCode, String message, RumErrorSource source, String stackTrace, String errorType, Map<String, ? extends Object> attributes) {
        key.getClass();
        message.getClass();
        source.getClass();
        stackTrace.getClass();
        attributes.getClass();
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.StopResourceWithStackTrace(key, statusCode != null ? Long.valueOf(statusCode.intValue()) : null, message, source, stackTrace, errorType, lc9.g0(attributes), null, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, null));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void stopSession() {
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.StopSession(null, 1, 0 == true ? 1 : 0));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void stopView(Object key, Map<String, ? extends Object> attributes) {
        key.getClass();
        attributes.getClass();
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.StopView(RumScopeKey.Companion.from$default(RumScopeKey.INSTANCE, key, null, 2, null), lc9.g0(attributes), getEventTime(attributes)));
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public void updatePerformanceMetric(RumPerformanceMetric metric, double value) {
        metric.getClass();
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.UpdatePerformanceMetric(metric, value, null, 4, null));
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor
    public void waitForResourceTiming(Object key) {
        key.getClass();
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.WaitForResourceTiming(key, null, 2, 0 == true ? 1 : 0));
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/datadog/android/rum/internal/monitor/DatadogRumMonitor$Companion;", "", "()V", "DRAIN_WAIT_SECONDS", "", "KEEP_ALIVE_MS", "getKEEP_ALIVE_MS$dd_sdk_android_rum_release", "()J", "RUM_DEBUG_RUM_NOT_ENABLED_WARNING", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long getKEEP_ALIVE_MS$dd_sdk_android_rum_release() {
            return DatadogRumMonitor.KEEP_ALIVE_MS;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.monitor.DatadogRumMonitor$waitForPendingEvents$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements gu5<String> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "Waiting for pending RUM events was interrupted";
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.monitor.DatadogRumMonitor$addSessionReplaySkippedFrame$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", RumSessionScope.RUM_SESSION_ID_BUS_MESSAGE_KEY, "Lj6g;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class AnonymousClass1 extends mj8 implements Function1<String, j6g> {
        public AnonymousClass1() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            if (str != null) {
                DatadogRumMonitor.this.sessionEndedMetricDispatcher.onSessionReplaySkippedFrameTracked(str);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ j6g invoke(String str) {
            invoke2(str);
            return j6g.a;
        }
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor
    public void stopResource(ResourceId key, Integer statusCode, Long size, RumResourceKind kind, Map<String, ? extends Object> attributes) {
        key.getClass();
        kind.getClass();
        attributes.getClass();
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.StopResource(key, statusCode != null ? Long.valueOf(statusCode.intValue()) : null, size, kind, lc9.g0(attributes), getEventTime(attributes)));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void stopResourceWithError(String key, Integer statusCode, String message, RumErrorSource source, Throwable throwable, Map<String, ? extends Object> attributes) {
        key.getClass();
        message.getClass();
        source.getClass();
        throwable.getClass();
        attributes.getClass();
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.StopResourceWithError(key, statusCode != null ? Long.valueOf(statusCode.intValue()) : null, message, source, throwable, lc9.g0(attributes), null, 64, null));
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor
    public void stopResourceWithError(ResourceId key, Integer statusCode, String message, RumErrorSource source, Throwable throwable, Map<String, ? extends Object> attributes) {
        key.getClass();
        message.getClass();
        source.getClass();
        throwable.getClass();
        attributes.getClass();
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.StopResourceWithError(key, statusCode != null ? Long.valueOf(statusCode.intValue()) : null, message, source, throwable, lc9.g0(attributes), null, 64, null));
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor
    public void stopResourceWithError(ResourceId key, Integer statusCode, String message, RumErrorSource source, String stackTrace, String errorType, Map<String, ? extends Object> attributes) {
        key.getClass();
        message.getClass();
        source.getClass();
        stackTrace.getClass();
        attributes.getClass();
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.StopResourceWithStackTrace(key, statusCode != null ? Long.valueOf(statusCode.intValue()) : null, message, source, stackTrace, errorType, lc9.g0(attributes), null, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, null));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void startResource(String key, RumResourceMethod method, String url, Map<String, ? extends Object> attributes) {
        key.getClass();
        method.getClass();
        url.getClass();
        attributes.getClass();
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.StartResource(key, url, method, lc9.g0(attributes), getEventTime(attributes)));
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor
    public void startResource(ResourceId key, RumResourceMethod method, String url, Map<String, ? extends Object> attributes) {
        key.getClass();
        method.getClass();
        url.getClass();
        attributes.getClass();
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.StartResource(key, url, method, lc9.g0(attributes), getEventTime(attributes)));
    }
}
