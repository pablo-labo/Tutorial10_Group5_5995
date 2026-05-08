package com.datadog.android.rum.internal.domain.scope;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.storage.DataWriter;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver;
import com.datadog.android.rum.DdRumContentProvider;
import com.datadog.android.rum.RumSessionListener;
import com.datadog.android.rum.internal.domain.RumContext;
import com.datadog.android.rum.internal.domain.Time;
import com.datadog.android.rum.internal.domain.scope.RumRawEvent;
import com.datadog.android.rum.internal.metric.SessionMetricDispatcher;
import com.datadog.android.rum.internal.vitals.VitalMonitor;
import com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier;
import com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.mj8;
import defpackage.u63;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010!\n\u0002\b\f\b\u0000\u0018\u0000 R2\u00020\u00012\u00020\u0002:\u0001RBq\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\"\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0003¢\u0006\u0004\b\"\u0010#J%\u0010$\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0003¢\u0006\u0004\b$\u0010#J%\u0010'\u001a\u00020!2\u0006\u0010&\u001a\u00020%2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0003¢\u0006\u0004\b'\u0010(J%\u0010)\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0017¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\tH\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020!2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00104R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u00107R\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b9\u0010,R\u001a\u0010\u000b\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b:\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010;R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010<R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010<R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010<R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010=R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010>R\u001a\u0010\u0017\u001a\u00020\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010\u0019\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010B\u001a\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR \u0010H\u001a\b\u0012\u0004\u0012\u00020\u00010G8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0018\u0010L\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010N\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u00108R\u0013\u0010Q\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006S"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumApplicationScope;", "Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "Lcom/datadog/android/rum/internal/domain/scope/RumViewChangedListener;", "", "applicationId", "Lcom/datadog/android/core/InternalSdkCore;", "sdkCore", "", "sampleRate", "", "backgroundTrackingEnabled", "trackFrustrations", "Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "firstPartyHostHeaderTypeResolver", "Lcom/datadog/android/rum/internal/vitals/VitalMonitor;", "cpuVitalMonitor", "memoryVitalMonitor", "frameRateVitalMonitor", "Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;", "sessionEndedMetricDispatcher", "Lcom/datadog/android/rum/RumSessionListener;", "sessionListener", "Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;", "initialResourceIdentifier", "Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;", "lastInteractionIdentifier", "<init>", "(Ljava/lang/String;Lcom/datadog/android/core/InternalSdkCore;FZZLcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;Lcom/datadog/android/rum/internal/vitals/VitalMonitor;Lcom/datadog/android/rum/internal/vitals/VitalMonitor;Lcom/datadog/android/rum/internal/vitals/VitalMonitor;Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;Lcom/datadog/android/rum/RumSessionListener;Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;)V", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "event", "Lcom/datadog/android/api/storage/DataWriter;", "", "writer", "Lj6g;", "delegateToChildren", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;Lcom/datadog/android/api/storage/DataWriter;)V", "startNewSession", "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "sendApplicationStartEvent", "(Lcom/datadog/android/rum/internal/domain/Time;Lcom/datadog/android/api/storage/DataWriter;)V", "handleEvent", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;Lcom/datadog/android/api/storage/DataWriter;)Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "isActive", "()Z", "Lcom/datadog/android/rum/internal/domain/RumContext;", "getRumContext", "()Lcom/datadog/android/rum/internal/domain/RumContext;", "Lcom/datadog/android/rum/internal/domain/scope/RumViewInfo;", "viewInfo", "onViewChanged", "(Lcom/datadog/android/rum/internal/domain/scope/RumViewInfo;)V", "Lcom/datadog/android/core/InternalSdkCore;", "F", "getSampleRate$dd_sdk_android_rum_release", "()F", "Z", "getBackgroundTrackingEnabled$dd_sdk_android_rum_release", "getTrackFrustrations$dd_sdk_android_rum_release", "Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "Lcom/datadog/android/rum/internal/vitals/VitalMonitor;", "Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;", "Lcom/datadog/android/rum/RumSessionListener;", "Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;", "getInitialResourceIdentifier$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;", "Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;", "getLastInteractionIdentifier$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;", "rumContext", "Lcom/datadog/android/rum/internal/domain/RumContext;", "", "childScopes", "Ljava/util/List;", "getChildScopes$dd_sdk_android_rum_release", "()Ljava/util/List;", "lastActiveViewInfo", "Lcom/datadog/android/rum/internal/domain/scope/RumViewInfo;", "isAppStartedEventSent", "getActiveSession", "()Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "activeSession", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class RumApplicationScope implements RumScope, RumViewChangedListener {
    public static final String MULTIPLE_ACTIVE_SESSIONS_ERROR = "Application has multiple active sessions when starting a new session";
    private final boolean backgroundTrackingEnabled;
    private final List<RumScope> childScopes;
    private final VitalMonitor cpuVitalMonitor;
    private final FirstPartyHostHeaderTypeResolver firstPartyHostHeaderTypeResolver;
    private final VitalMonitor frameRateVitalMonitor;
    private final InitialResourceIdentifier initialResourceIdentifier;
    private boolean isAppStartedEventSent;
    private RumViewInfo lastActiveViewInfo;
    private final LastInteractionIdentifier lastInteractionIdentifier;
    private final VitalMonitor memoryVitalMonitor;
    private RumContext rumContext;
    private final float sampleRate;
    private final InternalSdkCore sdkCore;
    private final SessionMetricDispatcher sessionEndedMetricDispatcher;
    private final RumSessionListener sessionListener;
    private final boolean trackFrustrations;

    public RumApplicationScope(String str, InternalSdkCore internalSdkCore, float f, boolean z, boolean z2, FirstPartyHostHeaderTypeResolver firstPartyHostHeaderTypeResolver, VitalMonitor vitalMonitor, VitalMonitor vitalMonitor2, VitalMonitor vitalMonitor3, SessionMetricDispatcher sessionMetricDispatcher, RumSessionListener rumSessionListener, InitialResourceIdentifier initialResourceIdentifier, LastInteractionIdentifier lastInteractionIdentifier) {
        str.getClass();
        internalSdkCore.getClass();
        firstPartyHostHeaderTypeResolver.getClass();
        vitalMonitor.getClass();
        vitalMonitor2.getClass();
        vitalMonitor3.getClass();
        sessionMetricDispatcher.getClass();
        initialResourceIdentifier.getClass();
        lastInteractionIdentifier.getClass();
        this.sdkCore = internalSdkCore;
        this.sampleRate = f;
        this.backgroundTrackingEnabled = z;
        this.trackFrustrations = z2;
        this.firstPartyHostHeaderTypeResolver = firstPartyHostHeaderTypeResolver;
        this.cpuVitalMonitor = vitalMonitor;
        this.memoryVitalMonitor = vitalMonitor2;
        this.frameRateVitalMonitor = vitalMonitor3;
        this.sessionEndedMetricDispatcher = sessionMetricDispatcher;
        this.sessionListener = rumSessionListener;
        this.initialResourceIdentifier = initialResourceIdentifier;
        this.lastInteractionIdentifier = lastInteractionIdentifier;
        this.rumContext = new RumContext(str, null, false, null, null, null, null, null, null, null, null, null, 0L, 0L, false, 32766, null);
        this.childScopes = u63.d0(new RumSessionScope(this, internalSdkCore, sessionMetricDispatcher, f, z, z2, this, firstPartyHostHeaderTypeResolver, vitalMonitor, vitalMonitor2, vitalMonitor3, rumSessionListener, false, initialResourceIdentifier, lastInteractionIdentifier, 0L, 0L, 98304, null));
    }

    private final void delegateToChildren(RumRawEvent event, DataWriter<Object> writer) {
        Iterator<RumScope> it = this.childScopes.iterator();
        while (it.hasNext()) {
            if (it.next().handleEvent(event, writer) == null) {
                it.remove();
            }
        }
    }

    private final void sendApplicationStartEvent(Time eventTime, DataWriter<Object> writer) {
        if (DdRumContentProvider.INSTANCE.getProcessImportance$dd_sdk_android_rum_release() == 100) {
            long appStartTimeNs = this.sdkCore.getAppStartTimeNs();
            delegateToChildren(new RumRawEvent.ApplicationStarted(new Time(((TimeUnit.MILLISECONDS.toNanos(eventTime.getTimestamp()) - eventTime.getNanoTime()) + appStartTimeNs) / 1000000, appStartTimeNs), eventTime.getNanoTime() - appStartTimeNs), writer);
            this.isAppStartedEventSent = true;
        }
    }

    private final void startNewSession(RumRawEvent event, DataWriter<Object> writer) {
        RumViewInfo rumViewInfo;
        RumSessionScope rumSessionScope = new RumSessionScope(this, this.sdkCore, this.sessionEndedMetricDispatcher, this.sampleRate, this.backgroundTrackingEnabled, this.trackFrustrations, this, this.firstPartyHostHeaderTypeResolver, this.cpuVitalMonitor, this.memoryVitalMonitor, this.frameRateVitalMonitor, this.sessionListener, true, this.initialResourceIdentifier, this.lastInteractionIdentifier, 0L, 0L, 98304, null);
        this.childScopes.add(rumSessionScope);
        if (!(event instanceof RumRawEvent.StartView) && (rumViewInfo = this.lastActiveViewInfo) != null) {
            rumSessionScope.handleEvent(new RumRawEvent.StartView(rumViewInfo.getKey(), rumViewInfo.getAttributes(), null, 4, null), writer);
        }
        List<RumScope> list = this.childScopes;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((RumScope) obj).getIsActive()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() > 1) {
            InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.ERROR, InternalLogger.Target.TELEMETRY, (gu5) AnonymousClass3.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
        }
    }

    public final RumScope getActiveSession() {
        Object next;
        Iterator<T> it = this.childScopes.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((RumScope) next).getIsActive()) {
                break;
            }
        }
        return (RumScope) next;
    }

    /* JADX INFO: renamed from: getBackgroundTrackingEnabled$dd_sdk_android_rum_release, reason: from getter */
    public final boolean getBackgroundTrackingEnabled() {
        return this.backgroundTrackingEnabled;
    }

    public final List<RumScope> getChildScopes$dd_sdk_android_rum_release() {
        return this.childScopes;
    }

    /* JADX INFO: renamed from: getInitialResourceIdentifier$dd_sdk_android_rum_release, reason: from getter */
    public final InitialResourceIdentifier getInitialResourceIdentifier() {
        return this.initialResourceIdentifier;
    }

    /* JADX INFO: renamed from: getLastInteractionIdentifier$dd_sdk_android_rum_release, reason: from getter */
    public final LastInteractionIdentifier getLastInteractionIdentifier() {
        return this.lastInteractionIdentifier;
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public RumContext getRumContext() {
        return this.rumContext;
    }

    /* JADX INFO: renamed from: getSampleRate$dd_sdk_android_rum_release, reason: from getter */
    public final float getSampleRate() {
        return this.sampleRate;
    }

    /* JADX INFO: renamed from: getTrackFrustrations$dd_sdk_android_rum_release, reason: from getter */
    public final boolean getTrackFrustrations() {
        return this.trackFrustrations;
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public RumScope handleEvent(RumRawEvent event, DataWriter<Object> writer) {
        event.getClass();
        writer.getClass();
        if (event instanceof RumRawEvent.SetSyntheticsTestAttribute) {
            RumContext rumContext = this.rumContext;
            RumRawEvent.SetSyntheticsTestAttribute setSyntheticsTestAttribute = (RumRawEvent.SetSyntheticsTestAttribute) event;
            this.rumContext = rumContext.copy((32377 & 1) != 0 ? rumContext.applicationId : null, (32377 & 2) != 0 ? rumContext.sessionId : null, (32377 & 4) != 0 ? rumContext.isSessionActive : false, (32377 & 8) != 0 ? rumContext.viewId : null, (32377 & 16) != 0 ? rumContext.viewName : null, (32377 & 32) != 0 ? rumContext.viewUrl : null, (32377 & 64) != 0 ? rumContext.actionId : null, (32377 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? rumContext.sessionState : null, (32377 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? rumContext.sessionStartReason : null, (32377 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? rumContext.viewType : null, (32377 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? rumContext.syntheticsTestId : setSyntheticsTestAttribute.getTestId(), (32377 & 2048) != 0 ? rumContext.syntheticsResultId : setSyntheticsTestAttribute.getResultId(), (32377 & 4096) != 0 ? rumContext.viewTimestamp : 0L, (32377 & 8192) != 0 ? rumContext.viewTimestampOffset : 0L, (32377 & 16384) != 0 ? rumContext.hasReplay : false);
        }
        boolean z = (event instanceof RumRawEvent.StartView) || (event instanceof RumRawEvent.StartAction);
        if (getActiveSession() == null && z) {
            startNewSession(event, writer);
        } else if (event instanceof RumRawEvent.StopSession) {
            this.sdkCore.updateFeatureContext("rum", new AnonymousClass1());
        }
        if (!(event instanceof RumRawEvent.SdkInit) && !this.isAppStartedEventSent) {
            sendApplicationStartEvent(event.getEventTime(), writer);
        }
        delegateToChildren(event, writer);
        return this;
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    /* JADX INFO: renamed from: isActive */
    public boolean getIsActive() {
        return true;
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumViewChangedListener
    public void onViewChanged(RumViewInfo viewInfo) {
        viewInfo.getClass();
        if (viewInfo.isActive()) {
            this.lastActiveViewInfo = viewInfo;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumApplicationScope$startNewSession$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass3 extends mj8 implements gu5<String> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return RumApplicationScope.MULTIPLE_ACTIVE_SESSIONS_ERROR;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumApplicationScope$handleEvent$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "", "it", "Lj6g;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class AnonymousClass1 extends mj8 implements Function1<Map<String, Object>, j6g> {
        public AnonymousClass1() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Map<String, Object> map) {
            map.getClass();
            map.putAll(RumApplicationScope.this.getRumContext().toMap());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ j6g invoke(Map<String, Object> map) {
            invoke2(map);
            return j6g.a;
        }
    }
}
