package com.datadog.android.rum.internal.monitor;

import com.datadog.android.core.feature.event.ThreadDump;
import com.datadog.android.internal.telemetry.InternalTelemetryEvent;
import com.datadog.android.rum.RumErrorSource;
import com.datadog.android.rum.RumMonitor;
import com.datadog.android.rum.RumPerformanceMetric;
import com.datadog.android.rum.internal.RumFeature;
import com.datadog.android.rum.internal.debug.RumDebugListener;
import com.datadog.android.rum.internal.domain.event.RumEventMeta;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\ba\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0003H&¢\u0006\u0004\b\u0007\u0010\u0005J\u001f\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H&¢\u0006\u0004\b\u000e\u0010\u0005J5\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H&¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001e\u0010\u001dJ\u0019\u0010!\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u001fH&¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00032\u0006\u0010$\u001a\u00020#H&¢\u0006\u0004\b%\u0010&J\u001f\u0010+\u001a\u00020\u00032\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H&¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\n2\u0006\u0010.\u001a\u00020\nH&¢\u0006\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/datadog/android/rum/internal/monitor/AdvancedRumMonitor;", "Lcom/datadog/android/rum/RumMonitor;", "Lcom/datadog/android/rum/internal/monitor/AdvancedNetworkRumMonitor;", "Lj6g;", "resetSession", "()V", "start", "sendWebViewEvent", "", "durationNs", "", "target", "addLongTask", "(JLjava/lang/String;)V", "addSessionReplaySkippedFrame", "message", "Lcom/datadog/android/rum/RumErrorSource;", "source", "", RumFeature.EVENT_THROWABLE_PROPERTY, "", "Lcom/datadog/android/core/feature/event/ThreadDump;", "threads", "addCrash", "(Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Throwable;Ljava/util/List;)V", RumEventMeta.VIEW_ID_KEY, "Lcom/datadog/android/rum/internal/monitor/StorageEvent;", "event", "eventSent", "(Ljava/lang/String;Lcom/datadog/android/rum/internal/monitor/StorageEvent;)V", "eventDropped", "Lcom/datadog/android/rum/internal/debug/RumDebugListener;", "listener", "setDebugListener", "(Lcom/datadog/android/rum/internal/debug/RumDebugListener;)V", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;", "telemetryEvent", "sendTelemetryEvent", "(Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;)V", "Lcom/datadog/android/rum/RumPerformanceMetric;", "metric", "", "value", "updatePerformanceMetric", "(Lcom/datadog/android/rum/RumPerformanceMetric;D)V", "testId", "resultId", "setSyntheticsAttribute", "(Ljava/lang/String;Ljava/lang/String;)V", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface AdvancedRumMonitor extends RumMonitor, AdvancedNetworkRumMonitor {
    void addCrash(String message, RumErrorSource source, Throwable throwable, List<ThreadDump> threads);

    void addLongTask(long durationNs, String target);

    void addSessionReplaySkippedFrame();

    void eventDropped(String viewId, StorageEvent event);

    void eventSent(String viewId, StorageEvent event);

    void resetSession();

    void sendTelemetryEvent(InternalTelemetryEvent telemetryEvent);

    void sendWebViewEvent();

    void setDebugListener(RumDebugListener listener);

    void setSyntheticsAttribute(String testId, String resultId);

    void start();

    void updatePerformanceMetric(RumPerformanceMetric metric, double value);
}
