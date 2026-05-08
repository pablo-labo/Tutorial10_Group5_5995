package com.datadog.android.rum.internal.metric;

import com.datadog.android.rum.internal.domain.scope.RumSessionScope;
import com.datadog.android.rum.internal.metric.SessionEndedMetric;
import com.datadog.android.rum.model.ViewEvent;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010\u0013¨\u0006 "}, d2 = {"Lcom/datadog/android/rum/internal/metric/NoOpSessionMetricDispatcher;", "Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;", "<init>", "()V", "", RumSessionScope.RUM_SESSION_ID_BUS_MESSAGE_KEY, "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;", "startReason", "", "ntpOffsetAtStartMs", "", "backgroundEventTracking", "Lj6g;", "startMetric", "(Ljava/lang/String;Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;JZ)V", "ntpOffsetAtEndMs", "endMetric", "(Ljava/lang/String;J)V", "onSessionStopped", "(Ljava/lang/String;)V", "Lcom/datadog/android/rum/model/ViewEvent;", "viewEvent", "onViewTracked", "(Ljava/lang/String;Lcom/datadog/android/rum/model/ViewEvent;)V", "errorKind", "onSdkErrorTracked", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/datadog/android/rum/internal/metric/SessionEndedMetric$MissedEventType;", "missedEventType", "onMissedEventTracked", "(Ljava/lang/String;Lcom/datadog/android/rum/internal/metric/SessionEndedMetric$MissedEventType;)V", "onSessionReplaySkippedFrameTracked", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class NoOpSessionMetricDispatcher implements SessionMetricDispatcher {
    @Override // com.datadog.android.rum.internal.metric.SessionMetricDispatcher
    public void endMetric(String sessionId, long ntpOffsetAtEndMs) {
        sessionId.getClass();
    }

    @Override // com.datadog.android.rum.internal.metric.SessionMetricDispatcher
    public void onMissedEventTracked(String sessionId, SessionEndedMetric.MissedEventType missedEventType) {
        sessionId.getClass();
        missedEventType.getClass();
    }

    @Override // com.datadog.android.rum.internal.metric.SessionMetricDispatcher
    public void onSdkErrorTracked(String sessionId, String errorKind) {
        sessionId.getClass();
    }

    @Override // com.datadog.android.rum.internal.metric.SessionMetricDispatcher
    public void onSessionReplaySkippedFrameTracked(String sessionId) {
        sessionId.getClass();
    }

    @Override // com.datadog.android.rum.internal.metric.SessionMetricDispatcher
    public void onSessionStopped(String sessionId) {
        sessionId.getClass();
    }

    @Override // com.datadog.android.rum.internal.metric.SessionMetricDispatcher
    public void onViewTracked(String sessionId, ViewEvent viewEvent) {
        sessionId.getClass();
        viewEvent.getClass();
    }

    @Override // com.datadog.android.rum.internal.metric.SessionMetricDispatcher
    public void startMetric(String sessionId, RumSessionScope.StartReason startReason, long ntpOffsetAtStartMs, boolean backgroundEventTracking) {
        sessionId.getClass();
        startReason.getClass();
    }
}
