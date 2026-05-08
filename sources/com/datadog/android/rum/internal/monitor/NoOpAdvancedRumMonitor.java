package com.datadog.android.rum.internal.monitor;

import com.datadog.android.core.feature.event.ThreadDump;
import com.datadog.android.internal.telemetry.InternalTelemetryEvent;
import com.datadog.android.rum.RumActionType;
import com.datadog.android.rum.RumErrorSource;
import com.datadog.android.rum.RumPerformanceMetric;
import com.datadog.android.rum.RumResourceKind;
import com.datadog.android.rum.RumResourceMethod;
import com.datadog.android.rum._RumInternalProxy;
import com.datadog.android.rum.internal.RumFeature;
import com.datadog.android.rum.internal.debug.RumDebugListener;
import com.datadog.android.rum.internal.domain.event.ResourceTiming;
import com.datadog.android.rum.internal.domain.event.RumEventDeserializer;
import com.datadog.android.rum.internal.domain.event.RumEventMeta;
import com.datadog.android.rum.resource.ResourceId;
import defpackage.bs4;
import defpackage.j6g;
import defpackage.sy3;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0003J\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u0003J5\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u0019\u0010!\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010+\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\n2\u0006\u0010.\u001a\u00020\nH\u0016¢\u0006\u0004\b/\u00100J%\u00103\u001a\u00020\u00042\u0014\u00102\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000401H\u0016¢\u0006\u0004\b3\u00104J5\u0010:\u001a\u00020\u00042\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020\n2\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010508H\u0016¢\u0006\u0004\b:\u0010;J-\u0010<\u001a\u00020\u00042\u0006\u00106\u001a\u0002052\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010508H\u0016¢\u0006\u0004\b<\u0010=J5\u0010@\u001a\u00020\u00042\u0006\u0010?\u001a\u00020>2\u0006\u00107\u001a\u00020\n2\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010508H\u0016¢\u0006\u0004\b@\u0010AJ5\u0010B\u001a\u00020\u00042\u0006\u0010?\u001a\u00020>2\u0006\u00107\u001a\u00020\n2\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010508H\u0016¢\u0006\u0004\bB\u0010AJ5\u0010C\u001a\u00020\u00042\u0006\u0010?\u001a\u00020>2\u0006\u00107\u001a\u00020\n2\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010508H\u0016¢\u0006\u0004\bC\u0010AJ=\u0010F\u001a\u00020\u00042\u0006\u00106\u001a\u00020\n2\u0006\u0010D\u001a\u00020\n2\u0006\u0010E\u001a\u00020\n2\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010508H\u0017¢\u0006\u0004\bF\u0010GJ=\u0010F\u001a\u00020\u00042\u0006\u00106\u001a\u00020\n2\u0006\u0010D\u001a\u00020H2\u0006\u0010E\u001a\u00020\n2\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010508H\u0016¢\u0006\u0004\bF\u0010IJ=\u0010F\u001a\u00020\u00042\u0006\u00106\u001a\u00020J2\u0006\u0010D\u001a\u00020H2\u0006\u0010E\u001a\u00020\n2\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010508H\u0016¢\u0006\u0004\bF\u0010KJI\u0010Q\u001a\u00020\u00042\u0006\u00106\u001a\u00020\n2\b\u0010M\u001a\u0004\u0018\u00010L2\b\u0010N\u001a\u0004\u0018\u00010\b2\u0006\u0010P\u001a\u00020O2\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010508H\u0016¢\u0006\u0004\bQ\u0010RJI\u0010Q\u001a\u00020\u00042\u0006\u00106\u001a\u00020J2\b\u0010M\u001a\u0004\u0018\u00010L2\b\u0010N\u001a\u0004\u0018\u00010\b2\u0006\u0010P\u001a\u00020O2\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010508H\u0016¢\u0006\u0004\bQ\u0010SJO\u0010T\u001a\u00020\u00042\u0006\u00106\u001a\u00020\n2\b\u0010M\u001a\u0004\u0018\u00010L2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010508H\u0016¢\u0006\u0004\bT\u0010UJY\u0010T\u001a\u00020\u00042\u0006\u00106\u001a\u00020\n2\b\u0010M\u001a\u0004\u0018\u00010L2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010V\u001a\u00020\n2\b\u0010W\u001a\u0004\u0018\u00010\n2\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010508H\u0016¢\u0006\u0004\bT\u0010XJO\u0010T\u001a\u00020\u00042\u0006\u00106\u001a\u00020J2\b\u0010M\u001a\u0004\u0018\u00010L2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010508H\u0016¢\u0006\u0004\bT\u0010YJY\u0010T\u001a\u00020\u00042\u0006\u00106\u001a\u00020J2\b\u0010M\u001a\u0004\u0018\u00010L2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010V\u001a\u00020\n2\b\u0010W\u001a\u0004\u0018\u00010\n2\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010508H\u0016¢\u0006\u0004\bT\u0010ZJ?\u0010[\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010508H\u0016¢\u0006\u0004\b[\u0010\\J?\u0010^\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010]\u001a\u0004\u0018\u00010\n2\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010508H\u0016¢\u0006\u0004\b^\u0010_J\u0017\u0010`\u001a\u00020\u00042\u0006\u00107\u001a\u00020\nH\u0016¢\u0006\u0004\b`\u0010aJ\u001f\u0010b\u001a\u00020\u00042\u0006\u00107\u001a\u00020\n2\u0006\u0010*\u001a\u000205H\u0016¢\u0006\u0004\bb\u0010cJ#\u0010e\u001a\u00020\u00042\u0012\u0010d\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020508H\u0016¢\u0006\u0004\be\u0010fJ!\u0010g\u001a\u00020\u00042\u0006\u00106\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\bg\u0010cJ\u0017\u0010h\u001a\u00020\u00042\u0006\u00106\u001a\u00020\nH\u0016¢\u0006\u0004\bh\u0010aJ\u001d\u0010i\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010508H\u0016¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020\u0004H\u0016¢\u0006\u0004\bk\u0010\u0003J\u000f\u0010l\u001a\u00020\u0004H\u0016¢\u0006\u0004\bl\u0010\u0003J\u0017\u0010o\u001a\u00020\u00042\u0006\u0010n\u001a\u00020mH\u0016¢\u0006\u0004\bo\u0010pJ\u0011\u0010r\u001a\u0004\u0018\u00010qH\u0016¢\u0006\u0004\br\u0010sJ\u0017\u0010t\u001a\u00020\u00042\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\bt\u0010uJ\u001f\u0010x\u001a\u00020\u00042\u0006\u00106\u001a\u0002052\u0006\u0010w\u001a\u00020vH\u0016¢\u0006\u0004\bx\u0010yJ\u000f\u0010z\u001a\u00020\u0004H\u0016¢\u0006\u0004\bz\u0010\u0003R\"\u0010{\u001a\u00020m8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0004\b\u007f\u0010p¨\u0006\u0080\u0001"}, d2 = {"Lcom/datadog/android/rum/internal/monitor/NoOpAdvancedRumMonitor;", "Lcom/datadog/android/rum/internal/monitor/AdvancedRumMonitor;", "<init>", "()V", "Lj6g;", "resetSession", "start", "sendWebViewEvent", "", "durationNs", "", "target", "addLongTask", "(JLjava/lang/String;)V", "addSessionReplaySkippedFrame", "message", "Lcom/datadog/android/rum/RumErrorSource;", "source", "", RumFeature.EVENT_THROWABLE_PROPERTY, "", "Lcom/datadog/android/core/feature/event/ThreadDump;", "threads", "addCrash", "(Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Throwable;Ljava/util/List;)V", RumEventMeta.VIEW_ID_KEY, "Lcom/datadog/android/rum/internal/monitor/StorageEvent;", "event", "eventSent", "(Ljava/lang/String;Lcom/datadog/android/rum/internal/monitor/StorageEvent;)V", "eventDropped", "Lcom/datadog/android/rum/internal/debug/RumDebugListener;", "listener", "setDebugListener", "(Lcom/datadog/android/rum/internal/debug/RumDebugListener;)V", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;", "telemetryEvent", "sendTelemetryEvent", "(Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;)V", "Lcom/datadog/android/rum/RumPerformanceMetric;", "metric", "", "value", "updatePerformanceMetric", "(Lcom/datadog/android/rum/RumPerformanceMetric;D)V", "testId", "resultId", "setSyntheticsAttribute", "(Ljava/lang/String;Ljava/lang/String;)V", "Lkotlin/Function1;", "callback", "getCurrentSessionId", "(Lkotlin/jvm/functions/Function1;)V", "", "key", "name", "", RumFeature.EVENT_ATTRIBUTES_PROPERTY, "startView", "(Ljava/lang/Object;Ljava/lang/String;Ljava/util/Map;)V", "stopView", "(Ljava/lang/Object;Ljava/util/Map;)V", "Lcom/datadog/android/rum/RumActionType;", "type", "addAction", "(Lcom/datadog/android/rum/RumActionType;Ljava/lang/String;Ljava/util/Map;)V", "startAction", "stopAction", "method", "url", "startResource", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lcom/datadog/android/rum/RumResourceMethod;", "(Ljava/lang/String;Lcom/datadog/android/rum/RumResourceMethod;Ljava/lang/String;Ljava/util/Map;)V", "Lcom/datadog/android/rum/resource/ResourceId;", "(Lcom/datadog/android/rum/resource/ResourceId;Lcom/datadog/android/rum/RumResourceMethod;Ljava/lang/String;Ljava/util/Map;)V", "", "statusCode", "size", "Lcom/datadog/android/rum/RumResourceKind;", "kind", "stopResource", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Lcom/datadog/android/rum/RumResourceKind;Ljava/util/Map;)V", "(Lcom/datadog/android/rum/resource/ResourceId;Ljava/lang/Integer;Ljava/lang/Long;Lcom/datadog/android/rum/RumResourceKind;Ljava/util/Map;)V", "stopResourceWithError", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Throwable;Ljava/util/Map;)V", "stackTrace", "errorType", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "(Lcom/datadog/android/rum/resource/ResourceId;Ljava/lang/Integer;Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Throwable;Ljava/util/Map;)V", "(Lcom/datadog/android/rum/resource/ResourceId;Ljava/lang/Integer;Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "addError", "(Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Throwable;Ljava/util/Map;)V", "stacktrace", "addErrorWithStacktrace", "(Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/String;Ljava/util/Map;)V", "addTiming", "(Ljava/lang/String;)V", "addFeatureFlagEvaluation", "(Ljava/lang/String;Ljava/lang/Object;)V", "featureFlags", "addFeatureFlagEvaluations", "(Ljava/util/Map;)V", "addAttribute", "removeAttribute", "getAttributes", "()Ljava/util/Map;", "clearAttributes", "stopSession", "", "overwrite", "addViewLoadingTime", "(Z)V", "Lcom/datadog/android/rum/_RumInternalProxy;", "_getInternal", "()Lcom/datadog/android/rum/_RumInternalProxy;", "waitForResourceTiming", "(Ljava/lang/Object;)V", "Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;", "timing", "addResourceTiming", "(Ljava/lang/Object;Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;)V", "notifyInterceptorInstantiated", RumEventDeserializer.TELEMETRY_TYPE_DEBUG, "Z", "getDebug", "()Z", "setDebug", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class NoOpAdvancedRumMonitor implements AdvancedRumMonitor {
    private boolean debug;

    @Override // com.datadog.android.rum.RumMonitor
    /* JADX INFO: renamed from: _getInternal */
    public _RumInternalProxy getInternalProxy() {
        return null;
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void addAction(RumActionType type, String name, Map<String, ? extends Object> attributes) {
        type.getClass();
        name.getClass();
        attributes.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void addAttribute(String key, Object value) {
        key.getClass();
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public void addCrash(String message, RumErrorSource source, Throwable throwable, List<ThreadDump> threads) {
        message.getClass();
        source.getClass();
        throwable.getClass();
        threads.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void addError(String message, RumErrorSource source, Throwable throwable, Map<String, ? extends Object> attributes) {
        message.getClass();
        source.getClass();
        attributes.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void addErrorWithStacktrace(String message, RumErrorSource source, String stacktrace, Map<String, ? extends Object> attributes) {
        message.getClass();
        source.getClass();
        attributes.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void addFeatureFlagEvaluation(String name, Object value) {
        name.getClass();
        value.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void addFeatureFlagEvaluations(Map<String, ? extends Object> featureFlags) {
        featureFlags.getClass();
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public void addLongTask(long durationNs, String target) {
        target.getClass();
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor
    public void addResourceTiming(Object key, ResourceTiming timing) {
        key.getClass();
        timing.getClass();
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public void addSessionReplaySkippedFrame() {
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void addTiming(String name) {
        name.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void addViewLoadingTime(boolean overwrite) {
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void clearAttributes() {
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public void eventDropped(String viewId, StorageEvent event) {
        viewId.getClass();
        event.getClass();
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public void eventSent(String viewId, StorageEvent event) {
        viewId.getClass();
        event.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public Map<String, Object> getAttributes() {
        return bs4.a;
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void getCurrentSessionId(Function1<? super String, j6g> callback) {
        callback.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public boolean getDebug() {
        return this.debug;
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor
    public void notifyInterceptorInstantiated() {
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void removeAttribute(String key) {
        key.getClass();
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public void resetSession() {
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public void sendTelemetryEvent(InternalTelemetryEvent telemetryEvent) {
        telemetryEvent.getClass();
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public void sendWebViewEvent() {
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void setDebug(boolean z) {
        this.debug = z;
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public void setDebugListener(RumDebugListener listener) {
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public void setSyntheticsAttribute(String testId, String resultId) {
        testId.getClass();
        resultId.getClass();
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public void start() {
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void startAction(RumActionType type, String name, Map<String, ? extends Object> attributes) {
        type.getClass();
        name.getClass();
        attributes.getClass();
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor
    public void startResource(ResourceId key, RumResourceMethod method, String url, Map<String, ? extends Object> attributes) {
        key.getClass();
        method.getClass();
        url.getClass();
        attributes.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void startView(Object key, String name, Map<String, ? extends Object> attributes) {
        key.getClass();
        name.getClass();
        attributes.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void stopAction(RumActionType type, String name, Map<String, ? extends Object> attributes) {
        type.getClass();
        name.getClass();
        attributes.getClass();
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor
    public void stopResource(ResourceId key, Integer statusCode, Long size, RumResourceKind kind, Map<String, ? extends Object> attributes) {
        key.getClass();
        kind.getClass();
        attributes.getClass();
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor
    public void stopResourceWithError(ResourceId key, Integer statusCode, String message, RumErrorSource source, String stackTrace, String errorType, Map<String, ? extends Object> attributes) {
        key.getClass();
        message.getClass();
        source.getClass();
        stackTrace.getClass();
        attributes.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void stopSession() {
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void stopView(Object key, Map<String, ? extends Object> attributes) {
        key.getClass();
        attributes.getClass();
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public void updatePerformanceMetric(RumPerformanceMetric metric, double value) {
        metric.getClass();
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor
    public void waitForResourceTiming(Object key) {
        key.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void stopResource(String key, Integer statusCode, Long size, RumResourceKind kind, Map<String, ? extends Object> attributes) {
        key.getClass();
        kind.getClass();
        attributes.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void startResource(String key, RumResourceMethod method, String url, Map<String, ? extends Object> attributes) {
        key.getClass();
        method.getClass();
        url.getClass();
        attributes.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    @sy3
    public void startResource(String key, String method, String url, Map<String, ? extends Object> attributes) {
        key.getClass();
        method.getClass();
        url.getClass();
        attributes.getClass();
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor
    public void stopResourceWithError(ResourceId key, Integer statusCode, String message, RumErrorSource source, Throwable throwable, Map<String, ? extends Object> attributes) {
        key.getClass();
        message.getClass();
        source.getClass();
        throwable.getClass();
        attributes.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void stopResourceWithError(String key, Integer statusCode, String message, RumErrorSource source, String stackTrace, String errorType, Map<String, ? extends Object> attributes) {
        key.getClass();
        message.getClass();
        source.getClass();
        stackTrace.getClass();
        attributes.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void stopResourceWithError(String key, Integer statusCode, String message, RumErrorSource source, Throwable throwable, Map<String, ? extends Object> attributes) {
        key.getClass();
        message.getClass();
        source.getClass();
        throwable.getClass();
        attributes.getClass();
    }
}
