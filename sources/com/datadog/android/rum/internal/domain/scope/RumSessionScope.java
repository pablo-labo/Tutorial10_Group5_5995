package com.datadog.android.rum.internal.domain.scope;

import com.datadog.android.api.feature.FeatureScope;
import com.datadog.android.api.storage.DataWriter;
import com.datadog.android.api.storage.NoOpDataWriter;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver;
import com.datadog.android.rum.RumSessionListener;
import com.datadog.android.rum.internal.domain.RumContext;
import com.datadog.android.rum.internal.domain.scope.RumRawEvent;
import com.datadog.android.rum.internal.metric.SessionMetricDispatcher;
import com.datadog.android.rum.internal.utils.NumberExtKt;
import com.datadog.android.rum.internal.vitals.VitalMonitor;
import com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier;
import com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.j6g;
import defpackage.lc9;
import defpackage.mj8;
import defpackage.t40;
import defpackage.ut0;
import defpackage.wl7;
import java.security.SecureRandom;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 k2\u00020\u0001:\u0003klmB\u0097\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\tH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020 2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010,\u001a\u00020 2\u0006\u0010)\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u001f\u00102\u001a\u00020 2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J'\u00107\u001a\u0004\u0018\u00010\u00012\u0006\u0010&\u001a\u00020%2\f\u00106\u001a\b\u0012\u0004\u0012\u00020504H\u0017¢\u0006\u0004\b7\u00108J\u000f\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\tH\u0016¢\u0006\u0004\b<\u0010$R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010=R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010>R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010?R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010C\u001a\u0004\bD\u0010$R\u001a\u0010\u000b\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\bE\u0010$R\u001a\u0010\u000f\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010F\u001a\u0004\bG\u0010HR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010IR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010JR\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010JR\"\u00101\u001a\u0002008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010P\u001a\u00020.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u0016\u0010V\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\"\u0010<\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010C\u001a\u0004\bX\u0010$\"\u0004\bY\u0010ZR\u0014\u0010\\\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010^\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010]R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u001a\u0010c\u001a\b\u0012\u0004\u0012\u0002050b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR*\u0010e\u001a\u0004\u0018\u00010\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0004\be\u0010=\u0012\u0004\bj\u0010\"\u001a\u0004\bf\u0010g\"\u0004\bh\u0010i¨\u0006n"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope;", "Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "parentScope", "Lcom/datadog/android/core/InternalSdkCore;", "sdkCore", "Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;", "sessionEndedMetricDispatcher", "", "sampleRate", "", "backgroundTrackingEnabled", "trackFrustrations", "Lcom/datadog/android/rum/internal/domain/scope/RumViewChangedListener;", "viewChangedListener", "Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "firstPartyHostHeaderTypeResolver", "Lcom/datadog/android/rum/internal/vitals/VitalMonitor;", "cpuVitalMonitor", "memoryVitalMonitor", "frameRateVitalMonitor", "Lcom/datadog/android/rum/RumSessionListener;", "sessionListener", "applicationDisplayed", "Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;", "networkSettledResourceIdentifier", "Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;", "lastInteractionIdentifier", "", "sessionInactivityNanos", "sessionMaxDurationNanos", "<init>", "(Lcom/datadog/android/rum/internal/domain/scope/RumScope;Lcom/datadog/android/core/InternalSdkCore;Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;FZZLcom/datadog/android/rum/internal/domain/scope/RumViewChangedListener;Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;Lcom/datadog/android/rum/internal/vitals/VitalMonitor;Lcom/datadog/android/rum/internal/vitals/VitalMonitor;Lcom/datadog/android/rum/internal/vitals/VitalMonitor;Lcom/datadog/android/rum/RumSessionListener;ZLcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;JJ)V", "Lj6g;", "stopSession", "()V", "isSessionComplete", "()Z", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "event", "updateSession", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;)V", "nanoTime", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;", "reason", "renewSession", "(JLcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;)V", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$State;", "state", "", RumSessionScope.RUM_SESSION_ID_BUS_MESSAGE_KEY, "updateSessionStateForSessionReplay", "(Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$State;Ljava/lang/String;)V", "Lcom/datadog/android/api/storage/DataWriter;", "", "writer", "handleEvent", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;Lcom/datadog/android/api/storage/DataWriter;)Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "Lcom/datadog/android/rum/internal/domain/RumContext;", "getRumContext", "()Lcom/datadog/android/rum/internal/domain/RumContext;", "isActive", "Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "Lcom/datadog/android/core/InternalSdkCore;", "Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;", "F", "getSampleRate$dd_sdk_android_rum_release", "()F", "Z", "getBackgroundTrackingEnabled$dd_sdk_android_rum_release", "getTrackFrustrations$dd_sdk_android_rum_release", "Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "getFirstPartyHostHeaderTypeResolver$dd_sdk_android_rum_release", "()Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "Lcom/datadog/android/rum/RumSessionListener;", "J", "Ljava/lang/String;", "getSessionId$dd_sdk_android_rum_release", "()Ljava/lang/String;", "setSessionId$dd_sdk_android_rum_release", "(Ljava/lang/String;)V", "sessionState", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$State;", "getSessionState$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$State;", "setSessionState$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$State;)V", "startReason", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;", "isActive$dd_sdk_android_rum_release", "setActive$dd_sdk_android_rum_release", "(Z)V", "Ljava/util/concurrent/atomic/AtomicLong;", "sessionStartNs", "Ljava/util/concurrent/atomic/AtomicLong;", "lastUserInteractionNs", "Ljava/security/SecureRandom;", "random", "Ljava/security/SecureRandom;", "Lcom/datadog/android/api/storage/NoOpDataWriter;", "noOpWriter", "Lcom/datadog/android/api/storage/NoOpDataWriter;", "childScope", "getChildScope$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "setChildScope$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/internal/domain/scope/RumScope;)V", "getChildScope$dd_sdk_android_rum_release$annotations", "Companion", "StartReason", "State", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class RumSessionScope implements RumScope {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long DEFAULT_SESSION_INACTIVITY_NS = 900000000000L;
    private static final long DEFAULT_SESSION_MAX_DURATION_NS = 14400000000000L;
    public static final String RUM_KEEP_SESSION_BUS_MESSAGE_KEY = "keepSession";
    public static final String RUM_SESSION_ID_BUS_MESSAGE_KEY = "sessionId";
    public static final String RUM_SESSION_RENEWED_BUS_MESSAGE = "rum_session_renewed";
    public static final String SESSION_REPLAY_BUS_MESSAGE_TYPE_KEY = "type";
    private final boolean backgroundTrackingEnabled;
    private RumScope childScope;
    private final FirstPartyHostHeaderTypeResolver firstPartyHostHeaderTypeResolver;
    private boolean isActive;
    private final AtomicLong lastUserInteractionNs;
    private final NoOpDataWriter<Object> noOpWriter;
    private final RumScope parentScope;
    private final SecureRandom random;
    private final float sampleRate;
    private final InternalSdkCore sdkCore;
    private final SessionMetricDispatcher sessionEndedMetricDispatcher;
    private String sessionId;
    private final long sessionInactivityNanos;
    private final RumSessionListener sessionListener;
    private final long sessionMaxDurationNanos;
    private final AtomicLong sessionStartNs;
    private State sessionState;
    private StartReason startReason;
    private final boolean trackFrustrations;

    public RumSessionScope(RumScope rumScope, InternalSdkCore internalSdkCore, SessionMetricDispatcher sessionMetricDispatcher, float f, boolean z, boolean z2, RumViewChangedListener rumViewChangedListener, FirstPartyHostHeaderTypeResolver firstPartyHostHeaderTypeResolver, VitalMonitor vitalMonitor, VitalMonitor vitalMonitor2, VitalMonitor vitalMonitor3, RumSessionListener rumSessionListener, boolean z3, InitialResourceIdentifier initialResourceIdentifier, LastInteractionIdentifier lastInteractionIdentifier, long j, long j2) {
        rumScope.getClass();
        internalSdkCore.getClass();
        sessionMetricDispatcher.getClass();
        firstPartyHostHeaderTypeResolver.getClass();
        vitalMonitor.getClass();
        vitalMonitor2.getClass();
        vitalMonitor3.getClass();
        initialResourceIdentifier.getClass();
        lastInteractionIdentifier.getClass();
        this.parentScope = rumScope;
        this.sdkCore = internalSdkCore;
        this.sessionEndedMetricDispatcher = sessionMetricDispatcher;
        this.sampleRate = f;
        this.backgroundTrackingEnabled = z;
        this.trackFrustrations = z2;
        this.firstPartyHostHeaderTypeResolver = firstPartyHostHeaderTypeResolver;
        this.sessionListener = rumSessionListener;
        this.sessionInactivityNanos = j;
        this.sessionMaxDurationNanos = j2;
        this.sessionId = RumContext.INSTANCE.getNULL_UUID();
        this.sessionState = State.NOT_TRACKED;
        this.startReason = StartReason.USER_APP_LAUNCH;
        this.isActive = true;
        this.sessionStartNs = new AtomicLong(System.nanoTime());
        this.lastUserInteractionNs = new AtomicLong(0L);
        this.random = new SecureRandom();
        this.noOpWriter = new NoOpDataWriter<>();
        this.childScope = new RumViewManagerScope(this, internalSdkCore, sessionMetricDispatcher, z, z2, rumViewChangedListener, firstPartyHostHeaderTypeResolver, vitalMonitor, vitalMonitor2, vitalMonitor3, z3, f, initialResourceIdentifier, lastInteractionIdentifier);
        internalSdkCore.updateFeatureContext("rum", new AnonymousClass1());
    }

    public static /* synthetic */ void getChildScope$dd_sdk_android_rum_release$annotations() {
    }

    private final boolean isSessionComplete() {
        return !this.isActive && this.childScope == null;
    }

    private final void renewSession(long nanoTime, StartReason reason) {
        boolean z = ((double) this.random.nextFloat()) < NumberExtKt.percent(this.sampleRate);
        this.startReason = reason;
        this.sessionState = z ? State.TRACKED : State.NOT_TRACKED;
        this.sessionId = t40.h();
        this.sessionStartNs.set(nanoTime);
        if (z) {
            this.sessionEndedMetricDispatcher.startMetric(this.sessionId, reason, this.sdkCore.getTime().getServerTimeOffsetMs(), this.backgroundTrackingEnabled);
        }
        RumSessionListener rumSessionListener = this.sessionListener;
        if (rumSessionListener != null) {
            rumSessionListener.onSessionStarted(this.sessionId, !z);
        }
    }

    private final void stopSession() {
        this.isActive = false;
        this.sessionEndedMetricDispatcher.onSessionStopped(this.sessionId);
    }

    private final void updateSession(RumRawEvent event) {
        long jNanoTime = System.nanoTime();
        boolean zB = wl7.b(this.sessionId, RumContext.INSTANCE.getNULL_UUID());
        boolean z = false;
        boolean z2 = jNanoTime - this.lastUserInteractionNs.get() >= this.sessionInactivityNanos;
        boolean z3 = jNanoTime - this.sessionStartNs.get() >= this.sessionMaxDurationNanos;
        boolean z4 = (event instanceof RumRawEvent.StartView) || (event instanceof RumRawEvent.StartAction);
        boolean zF0 = ut0.f0(event.getClass(), RumViewManagerScope.INSTANCE.getValidBackgroundEventTypes$dd_sdk_android_rum_release());
        boolean z5 = event instanceof RumRawEvent.SdkInit;
        boolean z6 = z5 && ((RumRawEvent.SdkInit) event).isAppInForeground();
        if (z5 && !((RumRawEvent.SdkInit) event).isAppInForeground()) {
            z = true;
        }
        if (z2 || z3 || !this.isActive) {
            this.sessionEndedMetricDispatcher.endMetric(this.sessionId, this.sdkCore.getTime().getServerTimeOffsetMs());
        }
        if (z4 || z6) {
            if (zB || z2 || z3) {
                renewSession(jNanoTime, zB ? StartReason.USER_APP_LAUNCH : z2 ? StartReason.INACTIVITY_TIMEOUT : StartReason.MAX_DURATION);
            }
            this.lastUserInteractionNs.set(jNanoTime);
        } else if (z2) {
            if (this.backgroundTrackingEnabled && (zF0 || z)) {
                renewSession(jNanoTime, StartReason.INACTIVITY_TIMEOUT);
                this.lastUserInteractionNs.set(jNanoTime);
            } else {
                this.sessionState = State.EXPIRED;
            }
        } else if (z3) {
            renewSession(jNanoTime, StartReason.MAX_DURATION);
        }
        updateSessionStateForSessionReplay(this.sessionState, this.sessionId);
    }

    private final void updateSessionStateForSessionReplay(State state, String sessionId) {
        boolean z = state == State.TRACKED;
        FeatureScope feature = this.sdkCore.getFeature("session-replay");
        if (feature != null) {
            feature.sendEvent(lc9.a0(new Pair("type", RUM_SESSION_RENEWED_BUS_MESSAGE), new Pair(RUM_KEEP_SESSION_BUS_MESSAGE_KEY, Boolean.valueOf(z)), new Pair(RUM_SESSION_ID_BUS_MESSAGE_KEY, sessionId)));
        }
    }

    /* JADX INFO: renamed from: getBackgroundTrackingEnabled$dd_sdk_android_rum_release, reason: from getter */
    public final boolean getBackgroundTrackingEnabled() {
        return this.backgroundTrackingEnabled;
    }

    /* JADX INFO: renamed from: getChildScope$dd_sdk_android_rum_release, reason: from getter */
    public final RumScope getChildScope() {
        return this.childScope;
    }

    /* JADX INFO: renamed from: getFirstPartyHostHeaderTypeResolver$dd_sdk_android_rum_release, reason: from getter */
    public final FirstPartyHostHeaderTypeResolver getFirstPartyHostHeaderTypeResolver() {
        return this.firstPartyHostHeaderTypeResolver;
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public RumContext getRumContext() {
        RumContext rumContext = this.parentScope.getRumContext();
        return rumContext.copy((32377 & 1) != 0 ? rumContext.applicationId : null, (32377 & 2) != 0 ? rumContext.sessionId : this.sessionId, (32377 & 4) != 0 ? rumContext.isSessionActive : this.isActive, (32377 & 8) != 0 ? rumContext.viewId : null, (32377 & 16) != 0 ? rumContext.viewName : null, (32377 & 32) != 0 ? rumContext.viewUrl : null, (32377 & 64) != 0 ? rumContext.actionId : null, (32377 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? rumContext.sessionState : this.sessionState, (32377 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? rumContext.sessionStartReason : this.startReason, (32377 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? rumContext.viewType : null, (32377 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? rumContext.syntheticsTestId : null, (32377 & 2048) != 0 ? rumContext.syntheticsResultId : null, (32377 & 4096) != 0 ? rumContext.viewTimestamp : 0L, (32377 & 8192) != 0 ? rumContext.viewTimestampOffset : 0L, (32377 & 16384) != 0 ? rumContext.hasReplay : false);
    }

    /* JADX INFO: renamed from: getSampleRate$dd_sdk_android_rum_release, reason: from getter */
    public final float getSampleRate() {
        return this.sampleRate;
    }

    /* JADX INFO: renamed from: getSessionId$dd_sdk_android_rum_release, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: getSessionState$dd_sdk_android_rum_release, reason: from getter */
    public final State getSessionState() {
        return this.sessionState;
    }

    /* JADX INFO: renamed from: getTrackFrustrations$dd_sdk_android_rum_release, reason: from getter */
    public final boolean getTrackFrustrations() {
        return this.trackFrustrations;
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public RumScope handleEvent(RumRawEvent event, DataWriter<Object> writer) {
        event.getClass();
        writer.getClass();
        if (event instanceof RumRawEvent.ResetSession) {
            renewSession(System.nanoTime(), StartReason.EXPLICIT_STOP);
        } else if (event instanceof RumRawEvent.StopSession) {
            stopSession();
        }
        updateSession(event);
        if (this.sessionState != State.TRACKED) {
            writer = this.noOpWriter;
        }
        if (!(event instanceof RumRawEvent.SdkInit)) {
            RumScope rumScope = this.childScope;
            this.childScope = rumScope != null ? rumScope.handleEvent(event, writer) : null;
        }
        if (isSessionComplete()) {
            return null;
        }
        return this;
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    /* JADX INFO: renamed from: isActive, reason: from getter */
    public boolean getIsActive() {
        return this.isActive;
    }

    public final boolean isActive$dd_sdk_android_rum_release() {
        return this.isActive;
    }

    public final void setActive$dd_sdk_android_rum_release(boolean z) {
        this.isActive = z;
    }

    public final void setChildScope$dd_sdk_android_rum_release(RumScope rumScope) {
        this.childScope = rumScope;
    }

    public final void setSessionId$dd_sdk_android_rum_release(String str) {
        str.getClass();
        this.sessionId = str;
    }

    public final void setSessionState$dd_sdk_android_rum_release(State state) {
        state.getClass();
        this.sessionState = state;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;", "", "asString", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getAsString", "()Ljava/lang/String;", "USER_APP_LAUNCH", "INACTIVITY_TIMEOUT", "MAX_DURATION", "BACKGROUND_LAUNCH", "PREWARM", "FROM_NON_INTERACTIVE_SESSION", "EXPLICIT_STOP", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum StartReason {
        USER_APP_LAUNCH("user_app_launch"),
        INACTIVITY_TIMEOUT("inactivity_timeout"),
        MAX_DURATION("max_duration"),
        BACKGROUND_LAUNCH("background_launch"),
        PREWARM("prewarm"),
        FROM_NON_INTERACTIVE_SESSION("from_non_interactive_session"),
        EXPLICIT_STOP("explicit_stop");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String asString;

        StartReason(String str) {
            this.asString = str;
        }

        public final String getAsString() {
            return this.asString;
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason$Companion;", "", "()V", "fromString", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;", "string", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final StartReason fromString(String string) {
                for (StartReason startReason : StartReason.values()) {
                    if (wl7.b(startReason.getAsString(), string)) {
                        return startReason;
                    }
                }
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$State;", "", "asString", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getAsString", "()Ljava/lang/String;", "NOT_TRACKED", "TRACKED", "EXPIRED", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum State {
        NOT_TRACKED("NOT_TRACKED"),
        TRACKED("TRACKED"),
        EXPIRED("EXPIRED");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String asString;

        State(String str) {
            this.asString = str;
        }

        public final String getAsString() {
            return this.asString;
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$State$Companion;", "", "()V", "fromString", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$State;", "string", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final State fromString(String string) {
                for (State state : State.values()) {
                    if (wl7.b(state.getAsString(), string)) {
                        return state;
                    }
                }
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$Companion;", "", "()V", "DEFAULT_SESSION_INACTIVITY_NS", "", "getDEFAULT_SESSION_INACTIVITY_NS$dd_sdk_android_rum_release", "()J", "DEFAULT_SESSION_MAX_DURATION_NS", "getDEFAULT_SESSION_MAX_DURATION_NS$dd_sdk_android_rum_release", "RUM_KEEP_SESSION_BUS_MESSAGE_KEY", "", "RUM_SESSION_ID_BUS_MESSAGE_KEY", "RUM_SESSION_RENEWED_BUS_MESSAGE", "SESSION_REPLAY_BUS_MESSAGE_TYPE_KEY", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long getDEFAULT_SESSION_INACTIVITY_NS$dd_sdk_android_rum_release() {
            return RumSessionScope.DEFAULT_SESSION_INACTIVITY_NS;
        }

        public final long getDEFAULT_SESSION_MAX_DURATION_NS$dd_sdk_android_rum_release() {
            return RumSessionScope.DEFAULT_SESSION_MAX_DURATION_NS;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumSessionScope$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "", "it", "Lj6g;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class AnonymousClass1 extends mj8 implements Function1<Map<String, Object>, j6g> {
        public AnonymousClass1() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Map<String, Object> map) {
            map.getClass();
            map.putAll(RumSessionScope.this.getRumContext().toMap());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ j6g invoke(Map<String, Object> map) {
            invoke2(map);
            return j6g.a;
        }
    }

    public /* synthetic */ RumSessionScope(RumScope rumScope, InternalSdkCore internalSdkCore, SessionMetricDispatcher sessionMetricDispatcher, float f, boolean z, boolean z2, RumViewChangedListener rumViewChangedListener, FirstPartyHostHeaderTypeResolver firstPartyHostHeaderTypeResolver, VitalMonitor vitalMonitor, VitalMonitor vitalMonitor2, VitalMonitor vitalMonitor3, RumSessionListener rumSessionListener, boolean z3, InitialResourceIdentifier initialResourceIdentifier, LastInteractionIdentifier lastInteractionIdentifier, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(rumScope, internalSdkCore, sessionMetricDispatcher, f, z, z2, rumViewChangedListener, firstPartyHostHeaderTypeResolver, vitalMonitor, vitalMonitor2, vitalMonitor3, rumSessionListener, z3, initialResourceIdentifier, lastInteractionIdentifier, (i & 32768) != 0 ? DEFAULT_SESSION_INACTIVITY_NS : j, (i & 65536) != 0 ? DEFAULT_SESSION_MAX_DURATION_NS : j2);
    }
}
