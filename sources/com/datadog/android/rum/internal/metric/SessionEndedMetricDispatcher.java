package com.datadog.android.rum.internal.metric;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.rum.internal.domain.scope.RumSessionScope;
import com.datadog.android.rum.internal.domain.scope.RumViewManagerScope;
import com.datadog.android.rum.internal.metric.SessionEndedMetric;
import com.datadog.android.rum.model.ViewEvent;
import defpackage.akb;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.mj8;
import defpackage.t40;
import defpackage.wl7;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b%\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/datadog/android/rum/internal/metric/SessionEndedMetricDispatcher;", "Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/api/InternalLogger;)V", "", RumSessionScope.RUM_SESSION_ID_BUS_MESSAGE_KEY, "errorKind", "buildSdkErrorTrackError", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lcom/datadog/android/rum/model/ViewEvent;", "viewEvent", "buildViewTrackError", "(Ljava/lang/String;Lcom/datadog/android/rum/model/ViewEvent;)Ljava/lang/String;", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;", "startReason", "", "ntpOffsetAtStartMs", "", "backgroundEventTracking", "Lj6g;", "startMetric", "(Ljava/lang/String;Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;JZ)V", "ntpOffsetAtEndMs", "endMetric", "(Ljava/lang/String;J)V", "onSessionStopped", "(Ljava/lang/String;)V", "onViewTracked", "(Ljava/lang/String;Lcom/datadog/android/rum/model/ViewEvent;)V", "onSdkErrorTracked", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/datadog/android/rum/internal/metric/SessionEndedMetric$MissedEventType;", "missedEventType", "onMissedEventTracked", "(Ljava/lang/String;Lcom/datadog/android/rum/internal/metric/SessionEndedMetric$MissedEventType;)V", "onSessionReplaySkippedFrameTracked", "Lcom/datadog/android/api/InternalLogger;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/datadog/android/rum/internal/metric/SessionEndedMetric;", "metricsBySessionId", "Ljava/util/concurrent/ConcurrentHashMap;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class SessionEndedMetricDispatcher implements SessionMetricDispatcher {
    private final InternalLogger internalLogger;
    private final ConcurrentHashMap<String, SessionEndedMetric> metricsBySessionId;

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.metric.SessionEndedMetricDispatcher$onSdkErrorTracked$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        final /* synthetic */ String $errorKind;
        final /* synthetic */ String $sessionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2) {
            super(0);
            this.$sessionId = str;
            this.$errorKind = str2;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return SessionEndedMetricDispatcher.this.buildSdkErrorTrackError(this.$sessionId, this.$errorKind);
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.metric.SessionEndedMetricDispatcher$onViewTracked$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C06111 extends mj8 implements gu5<String> {
        final /* synthetic */ String $sessionId;
        final /* synthetic */ ViewEvent $viewEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06111(String str, ViewEvent viewEvent) {
            super(0);
            this.$sessionId = str;
            this.$viewEvent = viewEvent;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return SessionEndedMetricDispatcher.this.buildViewTrackError(this.$sessionId, this.$viewEvent);
        }
    }

    public SessionEndedMetricDispatcher(InternalLogger internalLogger) {
        internalLogger.getClass();
        this.internalLogger = internalLogger;
        this.metricsBySessionId = new ConcurrentHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String buildSdkErrorTrackError(String sessionId, String errorKind) {
        return akb.k("Failed to track ", errorKind, " error, session ", sessionId, " has ended");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String buildViewTrackError(String sessionId, ViewEvent viewEvent) {
        String url = viewEvent.getView().getUrl();
        return t40.l("Failed to track ", wl7.b(url, RumViewManagerScope.RUM_APP_LAUNCH_VIEW_URL) ? "AppLaunch" : wl7.b(url, RumViewManagerScope.RUM_BACKGROUND_VIEW_URL) ? RumViewManagerScope.RUM_BACKGROUND_VIEW_NAME : "Custom", " view in session with different UUID ", sessionId);
    }

    @Override // com.datadog.android.rum.internal.metric.SessionMetricDispatcher
    public void endMetric(String sessionId, long ntpOffsetAtEndMs) {
        sessionId.getClass();
        SessionEndedMetric sessionEndedMetricRemove = this.metricsBySessionId.remove(sessionId);
        if (sessionEndedMetricRemove != null) {
            InternalLogger.DefaultImpls.logMetric$default(this.internalLogger, SessionEndedMetricDispatcher$endMetric$1$1.INSTANCE, sessionEndedMetricRemove.toMetricAttributes(ntpOffsetAtEndMs), 15.0f, null, 8, null);
        }
    }

    @Override // com.datadog.android.rum.internal.metric.SessionMetricDispatcher
    public void onMissedEventTracked(String sessionId, SessionEndedMetric.MissedEventType missedEventType) {
        sessionId.getClass();
        missedEventType.getClass();
        SessionEndedMetric sessionEndedMetric = this.metricsBySessionId.get(sessionId);
        if (sessionEndedMetric != null) {
            sessionEndedMetric.onMissedEventTracked(missedEventType);
        }
    }

    @Override // com.datadog.android.rum.internal.metric.SessionMetricDispatcher
    public void onSdkErrorTracked(String sessionId, String errorKind) {
        j6g j6gVar;
        sessionId.getClass();
        SessionEndedMetric sessionEndedMetric = this.metricsBySessionId.get(sessionId);
        if (sessionEndedMetric != null) {
            sessionEndedMetric.onErrorTracked(errorKind);
            j6gVar = j6g.a;
        } else {
            j6gVar = null;
        }
        if (j6gVar == null) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.INFO, InternalLogger.Target.MAINTAINER, (gu5) new AnonymousClass1(sessionId, errorKind), (Throwable) null, false, (Map) null, 56, (Object) null);
        }
    }

    @Override // com.datadog.android.rum.internal.metric.SessionMetricDispatcher
    public void onSessionReplaySkippedFrameTracked(String sessionId) {
        sessionId.getClass();
        SessionEndedMetric sessionEndedMetric = this.metricsBySessionId.get(sessionId);
        if (sessionEndedMetric != null) {
            sessionEndedMetric.onSessionReplaySkippedFrameTracked();
        }
    }

    @Override // com.datadog.android.rum.internal.metric.SessionMetricDispatcher
    public void onSessionStopped(String sessionId) {
        sessionId.getClass();
        SessionEndedMetric sessionEndedMetric = this.metricsBySessionId.get(sessionId);
        if (sessionEndedMetric != null) {
            sessionEndedMetric.onSessionStopped();
        }
    }

    @Override // com.datadog.android.rum.internal.metric.SessionMetricDispatcher
    public void onViewTracked(String sessionId, ViewEvent viewEvent) {
        sessionId.getClass();
        viewEvent.getClass();
        SessionEndedMetric sessionEndedMetric = this.metricsBySessionId.get(sessionId);
        if (sessionEndedMetric != null ? sessionEndedMetric.onViewTracked(viewEvent) : false) {
            return;
        }
        InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.INFO, InternalLogger.Target.MAINTAINER, (gu5) new C06111(sessionId, viewEvent), (Throwable) null, false, (Map) null, 56, (Object) null);
    }

    @Override // com.datadog.android.rum.internal.metric.SessionMetricDispatcher
    public void startMetric(String sessionId, RumSessionScope.StartReason startReason, long ntpOffsetAtStartMs, boolean backgroundEventTracking) {
        sessionId.getClass();
        startReason.getClass();
        this.metricsBySessionId.put(sessionId, new SessionEndedMetric(sessionId, startReason, ntpOffsetAtStartMs, backgroundEventTracking));
    }
}
