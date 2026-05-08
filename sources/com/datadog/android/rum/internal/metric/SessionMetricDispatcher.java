package com.datadog.android.rum.internal.metric;

import com.datadog.android.rum.internal.domain.scope.RumSessionScope;
import com.datadog.android.rum.internal.metric.SessionEndedMetric;
import com.datadog.android.rum.model.ViewEvent;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0006H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u001d\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;", "", "", RumSessionScope.RUM_SESSION_ID_BUS_MESSAGE_KEY, "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;", "startReason", "", "ntpOffsetAtStartMs", "", "backgroundEventTracking", "Lj6g;", "startMetric", "(Ljava/lang/String;Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;JZ)V", "ntpOffsetAtEndMs", "endMetric", "(Ljava/lang/String;J)V", "onSessionStopped", "(Ljava/lang/String;)V", "Lcom/datadog/android/rum/model/ViewEvent;", "viewEvent", "onViewTracked", "(Ljava/lang/String;Lcom/datadog/android/rum/model/ViewEvent;)V", "errorKind", "onSdkErrorTracked", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/datadog/android/rum/internal/metric/SessionEndedMetric$MissedEventType;", "missedEventType", "onMissedEventTracked", "(Ljava/lang/String;Lcom/datadog/android/rum/internal/metric/SessionEndedMetric$MissedEventType;)V", "onSessionReplaySkippedFrameTracked", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface SessionMetricDispatcher {
    void endMetric(String sessionId, long ntpOffsetAtEndMs);

    void onMissedEventTracked(String sessionId, SessionEndedMetric.MissedEventType missedEventType);

    void onSdkErrorTracked(String sessionId, String errorKind);

    void onSessionReplaySkippedFrameTracked(String sessionId);

    void onSessionStopped(String sessionId);

    void onViewTracked(String sessionId, ViewEvent viewEvent);

    void startMetric(String sessionId, RumSessionScope.StartReason startReason, long ntpOffsetAtStartMs, boolean backgroundEventTracking);
}
