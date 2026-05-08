package com.datadog.android.rum.internal.domain.scope;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.storage.DataWriter;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver;
import com.datadog.android.core.metrics.MethodCallSamplingRate;
import com.datadog.android.internal.telemetry.InternalTelemetryEvent;
import com.datadog.android.rum.DdRumContentProvider;
import com.datadog.android.rum.internal.anr.ANRException;
import com.datadog.android.rum.internal.domain.RumContext;
import com.datadog.android.rum.internal.domain.Time;
import com.datadog.android.rum.internal.domain.scope.RumRawEvent;
import com.datadog.android.rum.internal.domain.scope.RumViewScope;
import com.datadog.android.rum.internal.metric.SessionEndedMetric;
import com.datadog.android.rum.internal.metric.SessionMetricDispatcher;
import com.datadog.android.rum.internal.metric.interactiontonextview.InteractionToNextViewMetricResolver;
import com.datadog.android.rum.internal.metric.networksettled.NetworkSettledMetricResolver;
import com.datadog.android.rum.internal.vitals.NoOpVitalMonitor;
import com.datadog.android.rum.internal.vitals.VitalMonitor;
import com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier;
import com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier;
import defpackage.bs4;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.kc9;
import defpackage.mj8;
import defpackage.u63;
import defpackage.ut0;
import defpackage.wl7;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u000b\b\u0000\u0018\u0000 Y2\u00020\u0001:\u0001YBy\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010#\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0003¢\u0006\u0004\b#\u0010$J%\u0010&\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020%2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0003¢\u0006\u0004\b&\u0010'J%\u0010(\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020%2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0003¢\u0006\u0004\b(\u0010'J%\u0010*\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020)2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0003¢\u0006\u0004\b*\u0010+J%\u0010,\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020%2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0003¢\u0006\u0004\b,\u0010'J\u0017\u0010.\u001a\u00020-2\u0006\u0010\u001e\u001a\u00020%H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020-2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J'\u00104\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001e\u001a\u00020%2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0017¢\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0007H\u0016¢\u0006\u0004\b9\u0010\u001cR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010:R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010;R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010<R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010=R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010=R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010>R\u001a\u0010\r\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010BR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010BR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010BR\"\u0010\u0012\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010=\u001a\u0004\bC\u0010\u001c\"\u0004\bD\u0010ER\u001a\u0010\u0014\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010F\u001a\u0004\bG\u0010HR\u001a\u0010\u0016\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010I\u001a\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR \u0010P\u001a\b\u0012\u0004\u0012\u00020\u00010O8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\"\u0010T\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bT\u0010=\u001a\u0004\bU\u0010\u001c\"\u0004\bV\u0010ER\u0018\u0010W\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010X¨\u0006Z"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumViewManagerScope;", "Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "parentScope", "Lcom/datadog/android/core/InternalSdkCore;", "sdkCore", "Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;", "sessionEndedMetricDispatcher", "", "backgroundTrackingEnabled", "trackFrustrations", "Lcom/datadog/android/rum/internal/domain/scope/RumViewChangedListener;", "viewChangedListener", "Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "firstPartyHostHeaderTypeResolver", "Lcom/datadog/android/rum/internal/vitals/VitalMonitor;", "cpuVitalMonitor", "memoryVitalMonitor", "frameRateVitalMonitor", "applicationDisplayed", "", "sampleRate", "Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;", "initialResourceIdentifier", "Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;", "lastInteractionIdentifier", "<init>", "(Lcom/datadog/android/rum/internal/domain/scope/RumScope;Lcom/datadog/android/core/InternalSdkCore;Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;ZZLcom/datadog/android/rum/internal/domain/scope/RumViewChangedListener;Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;Lcom/datadog/android/rum/internal/vitals/VitalMonitor;Lcom/datadog/android/rum/internal/vitals/VitalMonitor;Lcom/datadog/android/rum/internal/vitals/VitalMonitor;ZFLcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;)V", "isViewManagerComplete", "()Z", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ApplicationStarted;", "event", "Lcom/datadog/android/api/storage/DataWriter;", "", "writer", "Lj6g;", "startApplicationLaunchView", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ApplicationStarted;Lcom/datadog/android/api/storage/DataWriter;)V", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "delegateToChildren", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;Lcom/datadog/android/api/storage/DataWriter;)V", "handleOrphanEvent", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartView;", "startForegroundView", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartView;Lcom/datadog/android/api/storage/DataWriter;)V", "handleBackgroundEvent", "Lcom/datadog/android/rum/internal/domain/scope/RumViewScope;", "createBackgroundViewScope", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;)Lcom/datadog/android/rum/internal/domain/scope/RumViewScope;", "Lcom/datadog/android/rum/internal/domain/Time;", "time", "createAppLaunchViewScope", "(Lcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumViewScope;", "handleEvent", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;Lcom/datadog/android/api/storage/DataWriter;)Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "Lcom/datadog/android/rum/internal/domain/RumContext;", "getRumContext", "()Lcom/datadog/android/rum/internal/domain/RumContext;", "isActive", "Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "Lcom/datadog/android/core/InternalSdkCore;", "Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;", "Z", "Lcom/datadog/android/rum/internal/domain/scope/RumViewChangedListener;", "Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "getFirstPartyHostHeaderTypeResolver$dd_sdk_android_rum_release", "()Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "Lcom/datadog/android/rum/internal/vitals/VitalMonitor;", "getApplicationDisplayed$dd_sdk_android_rum_release", "setApplicationDisplayed$dd_sdk_android_rum_release", "(Z)V", "F", "getSampleRate$dd_sdk_android_rum_release", "()F", "Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;", "getInitialResourceIdentifier$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;", "Lcom/datadog/android/rum/internal/metric/interactiontonextview/InteractionToNextViewMetricResolver;", "interactionToNextViewMetricResolver", "Lcom/datadog/android/rum/internal/metric/interactiontonextview/InteractionToNextViewMetricResolver;", "", "childrenScopes", "Ljava/util/List;", "getChildrenScopes$dd_sdk_android_rum_release", "()Ljava/util/List;", "stopped", "getStopped$dd_sdk_android_rum_release", "setStopped$dd_sdk_android_rum_release", "lastStoppedViewTime", "Lcom/datadog/android/rum/internal/domain/Time;", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class RumViewManagerScope implements RumScope {
    public static final String ATTR_GAP_BETWEEN_VIEWS = "view_gap";
    private static final String MESSAGE_GAP_BETWEEN_VIEWS = "[Mobile Metric] Gap between views";
    public static final String MESSAGE_MISSING_VIEW = "A RUM event was detected, but no view is active. To track views automatically, try calling the RumConfiguration.Builder.useViewTrackingStrategy() method.\nYou can also track views manually using the RumMonitor.startView() and RumMonitor.stopView() methods.";
    private static final String MESSAGE_NEG_GAP_BETWEEN_VIEWS = "[Mobile Metric] Negative gap between views";
    public static final String MESSAGE_UNKNOWN_MISSED_TYPE = "An RUM event was detected, but no view is active, its missed type is unknown";
    public static final String NO_ACTIVE_VIEW_FOR_LOADING_TIME_WARNING_MESSAGE = "No active view found to add the loading time.";
    public static final String RUM_APP_LAUNCH_VIEW_ID = "com.datadog.application-launch.view";
    public static final String RUM_APP_LAUNCH_VIEW_NAME = "ApplicationLaunch";
    public static final String RUM_APP_LAUNCH_VIEW_URL = "com/datadog/application-launch/view";
    public static final String RUM_BACKGROUND_VIEW_ID = "com.datadog.background.view";
    public static final String RUM_BACKGROUND_VIEW_NAME = "Background";
    public static final String RUM_BACKGROUND_VIEW_URL = "com/datadog/background/view";
    private boolean applicationDisplayed;
    private final boolean backgroundTrackingEnabled;
    private final List<RumScope> childrenScopes;
    private final VitalMonitor cpuVitalMonitor;
    private final FirstPartyHostHeaderTypeResolver firstPartyHostHeaderTypeResolver;
    private final VitalMonitor frameRateVitalMonitor;
    private final InitialResourceIdentifier initialResourceIdentifier;
    private final InteractionToNextViewMetricResolver interactionToNextViewMetricResolver;
    private Time lastStoppedViewTime;
    private final VitalMonitor memoryVitalMonitor;
    private final RumScope parentScope;
    private final float sampleRate;
    private final InternalSdkCore sdkCore;
    private final SessionMetricDispatcher sessionEndedMetricDispatcher;
    private boolean stopped;
    private final boolean trackFrustrations;
    private final RumViewChangedListener viewChangedListener;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Class<?>[] validBackgroundEventTypes = {RumRawEvent.AddError.class, RumRawEvent.StartAction.class, RumRawEvent.StartResource.class};
    private static final Class<?>[] silentOrphanEventTypes = {RumRawEvent.ApplicationStarted.class, RumRawEvent.KeepAlive.class, RumRawEvent.ResetSession.class, RumRawEvent.StopView.class, RumRawEvent.ActionDropped.class, RumRawEvent.ActionSent.class, RumRawEvent.ErrorDropped.class, RumRawEvent.ErrorSent.class, RumRawEvent.LongTaskDropped.class, RumRawEvent.LongTaskSent.class, RumRawEvent.ResourceDropped.class, RumRawEvent.ResourceSent.class, RumRawEvent.UpdatePerformanceMetric.class};
    private static final long THREE_SECONDS_GAP_NS = 3000000000L;

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumViewManagerScope$delegateToChildren$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage;", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements gu5<InternalTelemetryEvent.ApiUsage> {
        final /* synthetic */ RumRawEvent $event;
        final /* synthetic */ boolean $hasNoView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(RumRawEvent rumRawEvent, boolean z) {
            super(0);
            this.$event = rumRawEvent;
            this.$hasNoView = z;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // defpackage.gu5
        public final InternalTelemetryEvent.ApiUsage invoke() {
            boolean overwrite = ((RumRawEvent.AddViewLoadingTime) this.$event).getOverwrite();
            boolean z = this.$hasNoView;
            return new InternalTelemetryEvent.ApiUsage.AddViewLoadingTime(overwrite, z, !z, null, 8, null);
        }
    }

    public RumViewManagerScope(RumScope rumScope, InternalSdkCore internalSdkCore, SessionMetricDispatcher sessionMetricDispatcher, boolean z, boolean z2, RumViewChangedListener rumViewChangedListener, FirstPartyHostHeaderTypeResolver firstPartyHostHeaderTypeResolver, VitalMonitor vitalMonitor, VitalMonitor vitalMonitor2, VitalMonitor vitalMonitor3, boolean z3, float f, InitialResourceIdentifier initialResourceIdentifier, LastInteractionIdentifier lastInteractionIdentifier) {
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
        this.backgroundTrackingEnabled = z;
        this.trackFrustrations = z2;
        this.viewChangedListener = rumViewChangedListener;
        this.firstPartyHostHeaderTypeResolver = firstPartyHostHeaderTypeResolver;
        this.cpuVitalMonitor = vitalMonitor;
        this.memoryVitalMonitor = vitalMonitor2;
        this.frameRateVitalMonitor = vitalMonitor3;
        this.applicationDisplayed = z3;
        this.sampleRate = f;
        this.initialResourceIdentifier = initialResourceIdentifier;
        this.interactionToNextViewMetricResolver = new InteractionToNextViewMetricResolver(internalSdkCore.getInternalLogger(), null, lastInteractionIdentifier, 2, null);
        this.childrenScopes = new ArrayList();
    }

    private final RumViewScope createAppLaunchViewScope(Time time) {
        return new RumViewScope(this, this.sdkCore, this.sessionEndedMetricDispatcher, new RumScopeKey(RUM_APP_LAUNCH_VIEW_ID, RUM_APP_LAUNCH_VIEW_URL, RUM_APP_LAUNCH_VIEW_NAME), time, bs4.a, this.viewChangedListener, this.firstPartyHostHeaderTypeResolver, new NoOpVitalMonitor(), new NoOpVitalMonitor(), new NoOpVitalMonitor(), null, RumViewScope.RumViewType.APPLICATION_LAUNCH, this.trackFrustrations, this.sampleRate, this.interactionToNextViewMetricResolver, new NetworkSettledMetricResolver(this.initialResourceIdentifier, this.sdkCore.getInternalLogger()), 2048, null);
    }

    private final RumViewScope createBackgroundViewScope(RumRawEvent event) {
        return new RumViewScope(this, this.sdkCore, this.sessionEndedMetricDispatcher, new RumScopeKey(RUM_BACKGROUND_VIEW_ID, RUM_BACKGROUND_VIEW_URL, RUM_BACKGROUND_VIEW_NAME), event.getEventTime(), bs4.a, this.viewChangedListener, this.firstPartyHostHeaderTypeResolver, new NoOpVitalMonitor(), new NoOpVitalMonitor(), new NoOpVitalMonitor(), null, RumViewScope.RumViewType.BACKGROUND, this.trackFrustrations, this.sampleRate, this.interactionToNextViewMetricResolver, new NetworkSettledMetricResolver(this.initialResourceIdentifier, this.sdkCore.getInternalLogger()), 2048, null);
    }

    private final void delegateToChildren(RumRawEvent event, DataWriter<Object> writer) {
        RumScopeKey key$dd_sdk_android_rum_release;
        boolean zIsEmpty = this.childrenScopes.isEmpty();
        Iterator<RumScope> it = this.childrenScopes.iterator();
        boolean isActive = false;
        while (true) {
            String id = null;
            if (!it.hasNext()) {
                break;
            }
            RumScope next = it.next();
            isActive |= next.getIsActive();
            if ((event instanceof RumRawEvent.StopView) && next.getIsActive()) {
                RumViewScope rumViewScope = next instanceof RumViewScope ? (RumViewScope) next : null;
                if (rumViewScope != null && (key$dd_sdk_android_rum_release = rumViewScope.getKey()) != null) {
                    id = key$dd_sdk_android_rum_release.getId();
                }
                if (wl7.b(id, ((RumRawEvent.StopView) event).getKey().getId())) {
                    this.lastStoppedViewTime = event.getEventTime();
                }
            }
            if (next.handleEvent(event, writer) == null) {
                it.remove();
            }
        }
        if (!(event instanceof RumRawEvent.AddViewLoadingTime) || isActive) {
            return;
        }
        InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) AnonymousClass1.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
        InternalLogger.DefaultImpls.logApiUsage$default(this.sdkCore.getInternalLogger(), 0.0f, new AnonymousClass2(event, zIsEmpty), 1, null);
    }

    private final void handleBackgroundEvent(RumRawEvent event, DataWriter<Object> writer) {
        if ((event instanceof RumRawEvent.AddError) && (((RumRawEvent.AddError) event).getThrowable() instanceof ANRException)) {
            return;
        }
        boolean zF0 = ut0.f0(event.getClass(), validBackgroundEventTypes);
        boolean zF02 = ut0.f0(event.getClass(), silentOrphanEventTypes);
        if (!zF0 || !this.backgroundTrackingEnabled) {
            if (zF02) {
                return;
            }
            InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) C05921.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
        } else {
            RumViewScope rumViewScopeCreateBackgroundViewScope = createBackgroundViewScope(event);
            rumViewScopeCreateBackgroundViewScope.handleEvent(event, writer);
            this.childrenScopes.add(rumViewScopeCreateBackgroundViewScope);
            this.lastStoppedViewTime = null;
        }
    }

    private final void handleOrphanEvent(RumRawEvent event, DataWriter<Object> writer) {
        j6g j6gVar;
        boolean z = DdRumContentProvider.INSTANCE.getProcessImportance$dd_sdk_android_rum_release() == 100;
        if (event instanceof RumRawEvent.AddViewLoadingTime) {
            InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) C05931.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
            return;
        }
        if (this.applicationDisplayed || !z) {
            handleBackgroundEvent(event, writer);
        } else {
            if (!ut0.f0(event.getClass(), silentOrphanEventTypes)) {
                InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) C05942.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
            }
        }
        SessionEndedMetric.MissedEventType missedEventTypeFromRawEvent = SessionEndedMetric.MissedEventType.INSTANCE.fromRawEvent(event);
        if (missedEventTypeFromRawEvent != null) {
            this.sessionEndedMetricDispatcher.onMissedEventTracked(this.parentScope.getRumContext().getSessionId(), missedEventTypeFromRawEvent);
            j6gVar = j6g.a;
        } else {
            j6gVar = null;
        }
        if (j6gVar == null) {
            InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.INFO, InternalLogger.Target.MAINTAINER, (gu5) AnonymousClass4.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
        }
    }

    private final boolean isViewManagerComplete() {
        return this.stopped && this.childrenScopes.isEmpty();
    }

    private final void startApplicationLaunchView(RumRawEvent.ApplicationStarted event, DataWriter<Object> writer) {
        RumViewScope rumViewScopeCreateAppLaunchViewScope = createAppLaunchViewScope(event.getEventTime());
        this.applicationDisplayed = true;
        rumViewScopeCreateAppLaunchViewScope.handleEvent(event, writer);
        this.childrenScopes.add(rumViewScopeCreateAppLaunchViewScope);
    }

    private final void startForegroundView(RumRawEvent.StartView event, DataWriter<Object> writer) {
        RumViewScope rumViewScopeFromEvent$dd_sdk_android_rum_release = RumViewScope.INSTANCE.fromEvent$dd_sdk_android_rum_release(this, this.sessionEndedMetricDispatcher, this.sdkCore, event, this.viewChangedListener, this.firstPartyHostHeaderTypeResolver, this.cpuVitalMonitor, this.memoryVitalMonitor, this.frameRateVitalMonitor, this.trackFrustrations, this.sampleRate, this.interactionToNextViewMetricResolver, this.initialResourceIdentifier);
        this.applicationDisplayed = true;
        this.childrenScopes.add(rumViewScopeFromEvent$dd_sdk_android_rum_release);
        rumViewScopeFromEvent$dd_sdk_android_rum_release.handleEvent(new RumRawEvent.KeepAlive(null, 1, null), writer);
        RumViewChangedListener rumViewChangedListener = this.viewChangedListener;
        if (rumViewChangedListener != null) {
            rumViewChangedListener.onViewChanged(new RumViewInfo(event.getKey(), event.getAttributes(), true));
        }
    }

    /* JADX INFO: renamed from: getApplicationDisplayed$dd_sdk_android_rum_release, reason: from getter */
    public final boolean getApplicationDisplayed() {
        return this.applicationDisplayed;
    }

    public final List<RumScope> getChildrenScopes$dd_sdk_android_rum_release() {
        return this.childrenScopes;
    }

    /* JADX INFO: renamed from: getFirstPartyHostHeaderTypeResolver$dd_sdk_android_rum_release, reason: from getter */
    public final FirstPartyHostHeaderTypeResolver getFirstPartyHostHeaderTypeResolver() {
        return this.firstPartyHostHeaderTypeResolver;
    }

    /* JADX INFO: renamed from: getInitialResourceIdentifier$dd_sdk_android_rum_release, reason: from getter */
    public final InitialResourceIdentifier getInitialResourceIdentifier() {
        return this.initialResourceIdentifier;
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public RumContext getRumContext() {
        return this.parentScope.getRumContext();
    }

    /* JADX INFO: renamed from: getSampleRate$dd_sdk_android_rum_release, reason: from getter */
    public final float getSampleRate() {
        return this.sampleRate;
    }

    /* JADX INFO: renamed from: getStopped$dd_sdk_android_rum_release, reason: from getter */
    public final boolean getStopped() {
        return this.stopped;
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public RumScope handleEvent(RumRawEvent event, DataWriter<Object> writer) {
        event.getClass();
        writer.getClass();
        if ((event instanceof RumRawEvent.ApplicationStarted) && !this.applicationDisplayed && !this.stopped) {
            startApplicationLaunchView((RumRawEvent.ApplicationStarted) event, writer);
            return this;
        }
        delegateToChildren(event, writer);
        if ((event instanceof RumRawEvent.StartView) && !this.stopped) {
            startForegroundView((RumRawEvent.StartView) event, writer);
            Time time = this.lastStoppedViewTime;
            if (time != null) {
                long nanoTime = event.getEventTime().getNanoTime() - time.getNanoTime();
                if (1 <= nanoTime && nanoTime < THREE_SECONDS_GAP_NS) {
                    InternalLogger.DefaultImpls.logMetric$default(this.sdkCore.getInternalLogger(), new RumViewManagerScope$handleEvent$1$1(nanoTime), kc9.W(new Pair(ATTR_GAP_BETWEEN_VIEWS, Long.valueOf(nanoTime))), MethodCallSamplingRate.MEDIUM.getRate(), null, 8, null);
                } else if (nanoTime < 0) {
                    InternalLogger.DefaultImpls.logMetric$default(this.sdkCore.getInternalLogger(), new RumViewManagerScope$handleEvent$1$2(nanoTime), kc9.W(new Pair(ATTR_GAP_BETWEEN_VIEWS, Long.valueOf(nanoTime))), MethodCallSamplingRate.MEDIUM.getRate(), null, 8, null);
                }
            }
            this.lastStoppedViewTime = null;
        } else if (event instanceof RumRawEvent.StopSession) {
            this.stopped = true;
        } else {
            List<RumScope> list = this.childrenScopes;
            int i = 0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((RumScope) it.next()).getIsActive() && (i = i + 1) < 0) {
                        u63.n0();
                        throw null;
                    }
                }
            }
            if (i == 0) {
                handleOrphanEvent(event, writer);
            }
        }
        if (isViewManagerComplete()) {
            return null;
        }
        return this;
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    /* JADX INFO: renamed from: isActive */
    public boolean getIsActive() {
        return !this.stopped;
    }

    public final void setApplicationDisplayed$dd_sdk_android_rum_release(boolean z) {
        this.applicationDisplayed = z;
    }

    public final void setStopped$dd_sdk_android_rum_release(boolean z) {
        this.stopped = z;
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00160\u0015X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R \u0010\u001a\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00160\u0015X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumViewManagerScope$Companion;", "", "()V", "ATTR_GAP_BETWEEN_VIEWS", "", "MESSAGE_GAP_BETWEEN_VIEWS", "MESSAGE_MISSING_VIEW", "MESSAGE_NEG_GAP_BETWEEN_VIEWS", "MESSAGE_UNKNOWN_MISSED_TYPE", "NO_ACTIVE_VIEW_FOR_LOADING_TIME_WARNING_MESSAGE", "RUM_APP_LAUNCH_VIEW_ID", "RUM_APP_LAUNCH_VIEW_NAME", "RUM_APP_LAUNCH_VIEW_URL", "RUM_BACKGROUND_VIEW_ID", "RUM_BACKGROUND_VIEW_NAME", "RUM_BACKGROUND_VIEW_URL", "THREE_SECONDS_GAP_NS", "", "getTHREE_SECONDS_GAP_NS$dd_sdk_android_rum_release", "()J", "silentOrphanEventTypes", "", "Ljava/lang/Class;", "getSilentOrphanEventTypes$dd_sdk_android_rum_release", "()[Ljava/lang/Class;", "[Ljava/lang/Class;", "validBackgroundEventTypes", "getValidBackgroundEventTypes$dd_sdk_android_rum_release", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Class<?>[] getSilentOrphanEventTypes$dd_sdk_android_rum_release() {
            return RumViewManagerScope.silentOrphanEventTypes;
        }

        public final long getTHREE_SECONDS_GAP_NS$dd_sdk_android_rum_release() {
            return RumViewManagerScope.THREE_SECONDS_GAP_NS;
        }

        public final Class<?>[] getValidBackgroundEventTypes$dd_sdk_android_rum_release() {
            return RumViewManagerScope.validBackgroundEventTypes;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumViewManagerScope$delegateToChildren$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return RumViewManagerScope.NO_ACTIVE_VIEW_FOR_LOADING_TIME_WARNING_MESSAGE;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumViewManagerScope$handleBackgroundEvent$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05921 extends mj8 implements gu5<String> {
        public static final C05921 INSTANCE = new C05921();

        public C05921() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return RumViewManagerScope.MESSAGE_MISSING_VIEW;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumViewManagerScope$handleOrphanEvent$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05931 extends mj8 implements gu5<String> {
        public static final C05931 INSTANCE = new C05931();

        public C05931() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return RumViewManagerScope.MESSAGE_MISSING_VIEW;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumViewManagerScope$handleOrphanEvent$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05942 extends mj8 implements gu5<String> {
        public static final C05942 INSTANCE = new C05942();

        public C05942() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return RumViewManagerScope.MESSAGE_MISSING_VIEW;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumViewManagerScope$handleOrphanEvent$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass4 extends mj8 implements gu5<String> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return RumViewManagerScope.MESSAGE_UNKNOWN_MISSED_TYPE;
        }
    }
}
