package com.datadog.android.rum.internal.domain.scope;

import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.api.context.UserInfo;
import com.datadog.android.api.storage.DataWriter;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumActionType;
import com.datadog.android.rum.internal.FeaturesContextResolver;
import com.datadog.android.rum.internal.RumFeature;
import com.datadog.android.rum.internal.domain.RumContext;
import com.datadog.android.rum.internal.domain.Time;
import com.datadog.android.rum.internal.domain.scope.RumRawEvent;
import com.datadog.android.rum.internal.monitor.StorageEvent;
import com.datadog.android.rum.internal.utils.RuntimeUtilsKt;
import com.datadog.android.rum.internal.utils.SdkCoreExtKt;
import com.datadog.android.rum.internal.utils.WriteOperation;
import com.datadog.android.rum.model.ActionEvent;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.lc9;
import defpackage.mj8;
import defpackage.t40;
import defpackage.w92;
import defpackage.wl7;
import defpackage.zve;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u0000 \u0080\u00012\u00020\u0001:\u0002\u0080\u0001B\u0083\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001dH\u0017¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0005H\u0016¢\u0006\u0004\b$\u0010%J%\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020\u00102\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001dH\u0003¢\u0006\u0004\b(\u0010)J%\u0010*\u001a\u00020'2\u0006\u0010&\u001a\u00020\u00102\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001dH\u0003¢\u0006\u0004\b*\u0010)J%\u0010+\u001a\u00020'2\u0006\u0010&\u001a\u00020\u00102\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001dH\u0003¢\u0006\u0004\b+\u0010)J\u001f\u0010-\u001a\u00020'2\u0006\u0010\u001c\u001a\u00020,2\u0006\u0010&\u001a\u00020\u0010H\u0002¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u00020'2\u0006\u0010\u001c\u001a\u00020/2\u0006\u0010&\u001a\u00020\u0010H\u0002¢\u0006\u0004\b0\u00101J\u001f\u00103\u001a\u00020'2\u0006\u0010\u001c\u001a\u0002022\u0006\u0010&\u001a\u00020\u0010H\u0002¢\u0006\u0004\b3\u00104J-\u00106\u001a\u00020'2\u0006\u0010\u001c\u001a\u0002052\u0006\u0010&\u001a\u00020\u00102\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001dH\u0003¢\u0006\u0004\b6\u00107J\u001f\u00109\u001a\u00020'2\u0006\u00108\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u0010H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020'2\u0006\u0010&\u001a\u00020\u0010H\u0002¢\u0006\u0004\b;\u0010<J%\u0010>\u001a\u00020'2\u0006\u0010=\u001a\u00020\u00102\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001dH\u0002¢\u0006\u0004\b>\u0010)R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010BR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010C\u001a\u0004\bD\u0010%R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010ER\u0014\u0010\u0016\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010CR\u001a\u0010\u0018\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010F\u001a\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010JR\u001a\u0010L\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\bL\u0010J\u001a\u0004\bM\u0010NR\u001a\u0010O\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\"\u0010S\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010Y\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bY\u0010P\u001a\u0004\bZ\u0010R\"\u0004\b[\u0010\\R\u001a\u0010]\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b]\u0010J\u001a\u0004\b^\u0010NR\"\u0010_\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b_\u0010J\u001a\u0004\b`\u0010N\"\u0004\ba\u0010<R\u0016\u0010b\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010JR\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR(\u0010g\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000e0f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR \u0010m\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0l0k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\"\u0010o\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bo\u0010J\u001a\u0004\bp\u0010N\"\u0004\bq\u0010<R\"\u0010r\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\br\u0010J\u001a\u0004\bs\u0010N\"\u0004\bt\u0010<R\"\u0010u\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bu\u0010J\u001a\u0004\bv\u0010N\"\u0004\bw\u0010<R\"\u0010x\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bx\u0010J\u001a\u0004\by\u0010N\"\u0004\bz\u0010<R\u0016\u0010{\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010CR\"\u0010|\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b|\u0010C\u001a\u0004\b}\u0010%\"\u0004\b~\u0010\u007f¨\u0006\u0081\u0001"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumActionScope;", "Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "parentScope", "Lcom/datadog/android/core/InternalSdkCore;", "sdkCore", "", "waitForStop", "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "Lcom/datadog/android/rum/RumActionType;", "initialType", "", "initialName", "", "", "initialAttributes", "", "serverTimeOffsetInMs", "inactivityThresholdMs", "maxDurationMs", "Lcom/datadog/android/rum/internal/FeaturesContextResolver;", "featuresContextResolver", "trackFrustrations", "", "sampleRate", "<init>", "(Lcom/datadog/android/rum/internal/domain/scope/RumScope;Lcom/datadog/android/core/InternalSdkCore;ZLcom/datadog/android/rum/internal/domain/Time;Lcom/datadog/android/rum/RumActionType;Ljava/lang/String;Ljava/util/Map;JJJLcom/datadog/android/rum/internal/FeaturesContextResolver;ZF)V", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "event", "Lcom/datadog/android/api/storage/DataWriter;", "writer", "handleEvent", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;Lcom/datadog/android/api/storage/DataWriter;)Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "Lcom/datadog/android/rum/internal/domain/RumContext;", "getRumContext", "()Lcom/datadog/android/rum/internal/domain/RumContext;", "isActive", "()Z", "now", "Lj6g;", "onStartView", "(JLcom/datadog/android/api/storage/DataWriter;)V", "onStopView", "onStopSession", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopAction;", "onStopAction", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopAction;J)V", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartResource;", "onStartResource", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartResource;J)V", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopResource;", "onStopResource", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopResource;J)V", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddError;", "onError", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddError;JLcom/datadog/android/api/storage/DataWriter;)V", "eventKey", "onResourceError", "(Ljava/lang/Object;J)V", "onLongTask", "(J)V", "endNanos", "sendAction", "Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "getParentScope", "()Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "Lcom/datadog/android/core/InternalSdkCore;", "Z", "getWaitForStop", "Lcom/datadog/android/rum/internal/FeaturesContextResolver;", "F", "getSampleRate$dd_sdk_android_rum_release", "()F", "inactivityThresholdNs", "J", "maxDurationNs", "eventTimestamp", "getEventTimestamp$dd_sdk_android_rum_release", "()J", "actionId", "Ljava/lang/String;", "getActionId$dd_sdk_android_rum_release", "()Ljava/lang/String;", "type", "Lcom/datadog/android/rum/RumActionType;", "getType$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/RumActionType;", "setType$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/RumActionType;)V", "name", "getName$dd_sdk_android_rum_release", "setName$dd_sdk_android_rum_release", "(Ljava/lang/String;)V", "startedNanos", "getStartedNanos$dd_sdk_android_rum_release", "stoppedNanos", "getStoppedNanos$dd_sdk_android_rum_release", "setStoppedNanos$dd_sdk_android_rum_release", "lastInteractionNanos", "Lcom/datadog/android/api/context/NetworkInfo;", "networkInfo", "Lcom/datadog/android/api/context/NetworkInfo;", "", RumFeature.EVENT_ATTRIBUTES_PROPERTY, "Ljava/util/Map;", "getAttributes$dd_sdk_android_rum_release", "()Ljava/util/Map;", "", "Ljava/lang/ref/WeakReference;", "ongoingResourceKeys", "Ljava/util/List;", "resourceCount", "getResourceCount$dd_sdk_android_rum_release", "setResourceCount$dd_sdk_android_rum_release", "errorCount", "getErrorCount$dd_sdk_android_rum_release", "setErrorCount$dd_sdk_android_rum_release", "crashCount", "getCrashCount$dd_sdk_android_rum_release", "setCrashCount$dd_sdk_android_rum_release", "longTaskCount", "getLongTaskCount$dd_sdk_android_rum_release", "setLongTaskCount$dd_sdk_android_rum_release", "sent", "stopped", "getStopped$dd_sdk_android_rum_release", "setStopped$dd_sdk_android_rum_release", "(Z)V", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class RumActionScope implements RumScope {
    public static final long ACTION_INACTIVITY_MS = 100;
    public static final long ACTION_MAX_DURATION_MS = 5000;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String actionId;
    private final Map<String, Object> attributes;
    private long crashCount;
    private long errorCount;
    private final long eventTimestamp;
    private final FeaturesContextResolver featuresContextResolver;
    private final long inactivityThresholdNs;
    private long lastInteractionNanos;
    private long longTaskCount;
    private final long maxDurationNs;
    private String name;
    private final NetworkInfo networkInfo;
    private final List<WeakReference<Object>> ongoingResourceKeys;
    private final RumScope parentScope;
    private long resourceCount;
    private final float sampleRate;
    private final InternalSdkCore sdkCore;
    private boolean sent;
    private final long startedNanos;
    private boolean stopped;
    private long stoppedNanos;
    private final boolean trackFrustrations;
    private RumActionType type;
    private final boolean waitForStop;

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumActionScope$handleEvent$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/ref/WeakReference;", "", "invoke", "(Ljava/lang/ref/WeakReference;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements Function1<WeakReference<Object>, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(WeakReference<Object> weakReference) {
            weakReference.getClass();
            return Boolean.valueOf(weakReference.get() == null);
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumActionScope$sendAction$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "datadogContext", "Lcom/datadog/android/api/context/DatadogContext;", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05861 extends mj8 implements Function1<DatadogContext, Object> {
        final /* synthetic */ RumActionType $actualType;
        final /* synthetic */ Map<String, Object> $eventAttributes;
        final /* synthetic */ long $eventCrashCount;
        final /* synthetic */ long $eventErrorCount;
        final /* synthetic */ long $eventLongTaskCount;
        final /* synthetic */ String $eventName;
        final /* synthetic */ long $eventResourceCount;
        final /* synthetic */ List<ActionEvent.Type> $frustrations;
        final /* synthetic */ long $loadingTime;
        final /* synthetic */ RumContext $rumContext;
        final /* synthetic */ ActionEvent.ActionEventSessionType $sessionType;
        final /* synthetic */ ActionEvent.Synthetics $syntheticsAttribute;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05861(RumContext rumContext, RumActionType rumActionType, String str, long j, long j2, long j3, long j4, List<ActionEvent.Type> list, long j5, ActionEvent.ActionEventSessionType actionEventSessionType, Map<String, Object> map, ActionEvent.Synthetics synthetics) {
            super(1);
            this.$rumContext = rumContext;
            this.$actualType = rumActionType;
            this.$eventName = str;
            this.$eventErrorCount = j;
            this.$eventCrashCount = j2;
            this.$eventLongTaskCount = j3;
            this.$eventResourceCount = j4;
            this.$frustrations = list;
            this.$loadingTime = j5;
            this.$sessionType = actionEventSessionType;
            this.$eventAttributes = map;
            this.$syntheticsAttribute = synthetics;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(DatadogContext datadogContext) {
            datadogContext.getClass();
            UserInfo userInfo = datadogContext.getUserInfo();
            FeaturesContextResolver featuresContextResolver = RumActionScope.this.featuresContextResolver;
            String viewId = this.$rumContext.getViewId();
            if (viewId == null) {
                viewId = "";
            }
            boolean zResolveViewHasReplay = featuresContextResolver.resolveViewHasReplay(datadogContext, viewId);
            long eventTimestamp = RumActionScope.this.getEventTimestamp();
            ActionEvent.ActionEventAction actionEventAction = new ActionEvent.ActionEventAction(RumEventExtKt.toSchemaType(this.$actualType), RumActionScope.this.getActionId(), Long.valueOf(this.$loadingTime), new ActionEvent.ActionEventActionTarget(this.$eventName), !this.$frustrations.isEmpty() ? new ActionEvent.Frustration(this.$frustrations) : null, new ActionEvent.Error(this.$eventErrorCount), new ActionEvent.Crash(this.$eventCrashCount), new ActionEvent.LongTask(this.$eventLongTaskCount), new ActionEvent.Resource(this.$eventResourceCount));
            String viewId2 = this.$rumContext.getViewId();
            String str = viewId2 == null ? "" : viewId2;
            String viewName = this.$rumContext.getViewName();
            String viewUrl = this.$rumContext.getViewUrl();
            ActionEvent.ActionEventView actionEventView = new ActionEvent.ActionEventView(str, null, viewUrl == null ? "" : viewUrl, viewName, null, 18, null);
            ActionEvent.Application application = new ActionEvent.Application(this.$rumContext.getApplicationId());
            ActionEvent.ActionEventSession actionEventSession = new ActionEvent.ActionEventSession(this.$rumContext.getSessionId(), this.$sessionType, Boolean.valueOf(zResolveViewHasReplay));
            ActionEvent.ActionEventSource actionEventSourceTryFromSource = RumEventExtKt.tryFromSource(ActionEvent.ActionEventSource.INSTANCE, datadogContext.getSource(), RumActionScope.this.sdkCore.getInternalLogger());
            ActionEvent.Usr usr = RuntimeUtilsKt.hasUserData(userInfo) ? new ActionEvent.Usr(userInfo.getId(), userInfo.getName(), userInfo.getEmail(), null, lc9.i0(userInfo.getAdditionalProperties()), 8, null) : null;
            ActionEvent.Os os = new ActionEvent.Os(datadogContext.getDeviceInfo().getOsName(), datadogContext.getDeviceInfo().getOsVersion(), null, datadogContext.getDeviceInfo().getOsMajorVersion(), 4, null);
            ActionEvent.Device device = new ActionEvent.Device(RumEventExtKt.toActionSchemaType(datadogContext.getDeviceInfo().getDeviceType()), datadogContext.getDeviceInfo().getDeviceName(), datadogContext.getDeviceInfo().getDeviceModel(), datadogContext.getDeviceInfo().getDeviceBrand(), datadogContext.getDeviceInfo().getArchitecture());
            ActionEvent.Context context = new ActionEvent.Context(this.$eventAttributes);
            return new ActionEvent(eventTimestamp, application, datadogContext.getService(), datadogContext.getVersion(), null, null, actionEventSession, actionEventSourceTryFromSource, actionEventView, usr, null, RumEventExtKt.toActionConnectivity(RumActionScope.this.networkInfo), null, this.$syntheticsAttribute, null, os, device, new ActionEvent.Dd(new ActionEvent.DdSession(null, RumEventExtKt.toActionSessionPrecondition(this.$rumContext.getSessionStartReason()), 1, null), new ActionEvent.Configuration(Float.valueOf(RumActionScope.this.getSampleRate()), null, 2, null), null, null, 12, null), context, null, actionEventAction, 545840, null);
        }
    }

    public RumActionScope(RumScope rumScope, InternalSdkCore internalSdkCore, boolean z, Time time, RumActionType rumActionType, String str, Map<String, ? extends Object> map, long j, long j2, long j3, FeaturesContextResolver featuresContextResolver, boolean z2, float f) {
        rumScope.getClass();
        internalSdkCore.getClass();
        time.getClass();
        rumActionType.getClass();
        str.getClass();
        map.getClass();
        featuresContextResolver.getClass();
        this.parentScope = rumScope;
        this.sdkCore = internalSdkCore;
        this.waitForStop = z;
        this.featuresContextResolver = featuresContextResolver;
        this.trackFrustrations = z2;
        this.sampleRate = f;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.inactivityThresholdNs = timeUnit.toNanos(j2);
        this.maxDurationNs = timeUnit.toNanos(j3);
        this.eventTimestamp = time.getTimestamp() + j;
        this.actionId = t40.h();
        this.type = rumActionType;
        this.name = str;
        long nanoTime = time.getNanoTime();
        this.startedNanos = nanoTime;
        this.stoppedNanos = nanoTime;
        this.lastInteractionNanos = nanoTime;
        this.networkInfo = internalSdkCore.getNetworkInfo();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(GlobalRumMonitor.get(internalSdkCore).getAttributes());
        this.attributes = linkedHashMap;
        this.ongoingResourceKeys = new ArrayList();
    }

    private final void onError(RumRawEvent.AddError event, long now, DataWriter<Object> writer) {
        this.lastInteractionNanos = now;
        this.errorCount++;
        if (event.isFatal()) {
            this.crashCount++;
            sendAction(now, writer);
        }
    }

    private final void onLongTask(long now) {
        this.lastInteractionNanos = now;
        this.longTaskCount++;
    }

    private final void onResourceError(Object eventKey, long now) {
        Object next;
        Iterator<T> it = this.ongoingResourceKeys.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (wl7.b(((WeakReference) next).get(), eventKey)) {
                    break;
                }
            }
        }
        WeakReference weakReference = (WeakReference) next;
        if (weakReference != null) {
            this.ongoingResourceKeys.remove(weakReference);
            this.lastInteractionNanos = now;
            this.resourceCount--;
            this.errorCount++;
        }
    }

    private final void onStartResource(RumRawEvent.StartResource event, long now) {
        this.lastInteractionNanos = now;
        this.resourceCount++;
        this.ongoingResourceKeys.add(new WeakReference<>(event.getKey()));
    }

    private final void onStartView(long now, DataWriter<Object> writer) {
        this.ongoingResourceKeys.clear();
        sendAction(now, writer);
    }

    private final void onStopAction(RumRawEvent.StopAction event, long now) {
        RumActionType type = event.getType();
        if (type != null) {
            this.type = type;
        }
        String name = event.getName();
        if (name != null) {
            this.name = name;
        }
        this.attributes.putAll(event.getAttributes());
        this.stopped = true;
        this.stoppedNanos = now;
        this.lastInteractionNanos = now;
    }

    private final void onStopResource(RumRawEvent.StopResource event, long now) {
        Object next;
        Iterator<T> it = this.ongoingResourceKeys.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (wl7.b(((WeakReference) next).get(), event.getKey())) {
                    break;
                }
            }
        }
        WeakReference weakReference = (WeakReference) next;
        if (weakReference != null) {
            this.ongoingResourceKeys.remove(weakReference);
            this.lastInteractionNanos = now;
        }
    }

    private final void onStopSession(long now, DataWriter<Object> writer) {
        this.ongoingResourceKeys.clear();
        sendAction(now, writer);
    }

    private final void onStopView(long now, DataWriter<Object> writer) {
        this.ongoingResourceKeys.clear();
        sendAction(now, writer);
    }

    private final void sendAction(long endNanos, DataWriter<Object> writer) {
        String syntheticsResultId;
        if (this.sent) {
            return;
        }
        RumActionType rumActionType = this.type;
        this.attributes.putAll(GlobalRumMonitor.get(this.sdkCore).getAttributes());
        LinkedHashMap linkedHashMapI0 = lc9.i0(this.attributes);
        RumContext rumContext = getInitialContext();
        String str = this.name;
        long j = this.errorCount;
        long j2 = this.crashCount;
        long j3 = this.longTaskCount;
        long j4 = this.resourceCount;
        long jMax = Math.max(endNanos - this.startedNanos, 1L);
        String syntheticsTestId = rumContext.getSyntheticsTestId();
        ActionEvent.Synthetics synthetics = (syntheticsTestId == null || zve.U(syntheticsTestId) || (syntheticsResultId = rumContext.getSyntheticsResultId()) == null || zve.U(syntheticsResultId)) ? null : new ActionEvent.Synthetics(rumContext.getSyntheticsTestId(), rumContext.getSyntheticsResultId(), null, 4, null);
        ActionEvent.ActionEventSessionType actionEventSessionType = synthetics == null ? ActionEvent.ActionEventSessionType.USER : ActionEvent.ActionEventSessionType.SYNTHETICS;
        ArrayList arrayList = new ArrayList();
        if (this.trackFrustrations && j > 0 && rumActionType == RumActionType.TAP) {
            arrayList.add(ActionEvent.Type.ERROR_TAP);
        }
        WriteOperation writeOperationNewRumEventWriteOperation$default = SdkCoreExtKt.newRumEventWriteOperation$default(this.sdkCore, writer, null, new C05861(rumContext, rumActionType, str, j, j2, j3, j4, arrayList, jMax, actionEventSessionType, linkedHashMapI0, synthetics), 2, null);
        StorageEvent.Action action = new StorageEvent.Action(arrayList.size(), RumEventExtKt.toSchemaType(rumActionType), this.stoppedNanos);
        writeOperationNewRumEventWriteOperation$default.onError(new RumActionScope$sendAction$2$1(rumContext, action));
        writeOperationNewRumEventWriteOperation$default.onSuccess(new RumActionScope$sendAction$2$2(rumContext, action));
        writeOperationNewRumEventWriteOperation$default.submit();
        this.sent = true;
    }

    /* JADX INFO: renamed from: getActionId$dd_sdk_android_rum_release, reason: from getter */
    public final String getActionId() {
        return this.actionId;
    }

    public final Map<String, Object> getAttributes$dd_sdk_android_rum_release() {
        return this.attributes;
    }

    /* JADX INFO: renamed from: getCrashCount$dd_sdk_android_rum_release, reason: from getter */
    public final long getCrashCount() {
        return this.crashCount;
    }

    /* JADX INFO: renamed from: getErrorCount$dd_sdk_android_rum_release, reason: from getter */
    public final long getErrorCount() {
        return this.errorCount;
    }

    /* JADX INFO: renamed from: getEventTimestamp$dd_sdk_android_rum_release, reason: from getter */
    public final long getEventTimestamp() {
        return this.eventTimestamp;
    }

    /* JADX INFO: renamed from: getLongTaskCount$dd_sdk_android_rum_release, reason: from getter */
    public final long getLongTaskCount() {
        return this.longTaskCount;
    }

    /* JADX INFO: renamed from: getName$dd_sdk_android_rum_release, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final RumScope getParentScope() {
        return this.parentScope;
    }

    /* JADX INFO: renamed from: getResourceCount$dd_sdk_android_rum_release, reason: from getter */
    public final long getResourceCount() {
        return this.resourceCount;
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    /* JADX INFO: renamed from: getRumContext */
    public RumContext getInitialContext() {
        return this.parentScope.getInitialContext();
    }

    /* JADX INFO: renamed from: getSampleRate$dd_sdk_android_rum_release, reason: from getter */
    public final float getSampleRate() {
        return this.sampleRate;
    }

    /* JADX INFO: renamed from: getStartedNanos$dd_sdk_android_rum_release, reason: from getter */
    public final long getStartedNanos() {
        return this.startedNanos;
    }

    /* JADX INFO: renamed from: getStopped$dd_sdk_android_rum_release, reason: from getter */
    public final boolean getStopped() {
        return this.stopped;
    }

    /* JADX INFO: renamed from: getStoppedNanos$dd_sdk_android_rum_release, reason: from getter */
    public final long getStoppedNanos() {
        return this.stoppedNanos;
    }

    /* JADX INFO: renamed from: getType$dd_sdk_android_rum_release, reason: from getter */
    public final RumActionType getType() {
        return this.type;
    }

    public final boolean getWaitForStop() {
        return this.waitForStop;
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public RumScope handleEvent(RumRawEvent event, DataWriter<Object> writer) {
        event.getClass();
        writer.getClass();
        long nanoTime = event.getEventTime().getNanoTime();
        boolean z = false;
        boolean z2 = nanoTime - this.lastInteractionNanos > this.inactivityThresholdNs;
        boolean z3 = nanoTime - this.startedNanos > this.maxDurationNs;
        w92.B0(this.ongoingResourceKeys, AnonymousClass1.INSTANCE);
        if (this.waitForStop && !this.stopped) {
            z = true;
        }
        if (z2 && this.ongoingResourceKeys.isEmpty() && !z) {
            sendAction(this.lastInteractionNanos, writer);
        } else if (z3) {
            sendAction(nanoTime, writer);
        } else if (event instanceof RumRawEvent.SendCustomActionNow) {
            sendAction(this.lastInteractionNanos, writer);
        } else if (event instanceof RumRawEvent.StartView) {
            onStartView(nanoTime, writer);
        } else if (event instanceof RumRawEvent.StopView) {
            onStopView(nanoTime, writer);
        } else if (event instanceof RumRawEvent.StopSession) {
            onStopSession(nanoTime, writer);
        } else if (event instanceof RumRawEvent.StopAction) {
            onStopAction((RumRawEvent.StopAction) event, nanoTime);
        } else if (event instanceof RumRawEvent.StartResource) {
            onStartResource((RumRawEvent.StartResource) event, nanoTime);
        } else if (event instanceof RumRawEvent.StopResource) {
            onStopResource((RumRawEvent.StopResource) event, nanoTime);
        } else if (event instanceof RumRawEvent.AddError) {
            onError((RumRawEvent.AddError) event, nanoTime, writer);
        } else if (event instanceof RumRawEvent.StopResourceWithError) {
            onResourceError(((RumRawEvent.StopResourceWithError) event).getKey(), nanoTime);
        } else if (event instanceof RumRawEvent.StopResourceWithStackTrace) {
            onResourceError(((RumRawEvent.StopResourceWithStackTrace) event).getKey(), nanoTime);
        } else if (event instanceof RumRawEvent.AddLongTask) {
            onLongTask(nanoTime);
        }
        if (this.sent) {
            return null;
        }
        return this;
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    /* JADX INFO: renamed from: isActive */
    public boolean getIsActive() {
        return !this.stopped;
    }

    public final void setCrashCount$dd_sdk_android_rum_release(long j) {
        this.crashCount = j;
    }

    public final void setErrorCount$dd_sdk_android_rum_release(long j) {
        this.errorCount = j;
    }

    public final void setLongTaskCount$dd_sdk_android_rum_release(long j) {
        this.longTaskCount = j;
    }

    public final void setName$dd_sdk_android_rum_release(String str) {
        str.getClass();
        this.name = str;
    }

    public final void setResourceCount$dd_sdk_android_rum_release(long j) {
        this.resourceCount = j;
    }

    public final void setStopped$dd_sdk_android_rum_release(boolean z) {
        this.stopped = z;
    }

    public final void setStoppedNanos$dd_sdk_android_rum_release(long j) {
        this.stoppedNanos = j;
    }

    public final void setType$dd_sdk_android_rum_release(RumActionType rumActionType) {
        rumActionType.getClass();
        this.type = rumActionType;
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J>\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumActionScope$Companion;", "", "()V", "ACTION_INACTIVITY_MS", "", "ACTION_MAX_DURATION_MS", "fromEvent", "Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "parentScope", "sdkCore", "Lcom/datadog/android/core/InternalSdkCore;", "event", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartAction;", "timestampOffset", "featuresContextResolver", "Lcom/datadog/android/rum/internal/FeaturesContextResolver;", "trackFrustrations", "", "sampleRate", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RumScope fromEvent(RumScope parentScope, InternalSdkCore sdkCore, RumRawEvent.StartAction event, long timestampOffset, FeaturesContextResolver featuresContextResolver, boolean trackFrustrations, float sampleRate) {
            parentScope.getClass();
            sdkCore.getClass();
            event.getClass();
            featuresContextResolver.getClass();
            return new RumActionScope(parentScope, sdkCore, event.getWaitForStop(), event.getEventTime(), event.getType(), event.getName(), event.getAttributes(), timestampOffset, 0L, 0L, featuresContextResolver, trackFrustrations, sampleRate, 768, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ RumActionScope(RumScope rumScope, InternalSdkCore internalSdkCore, boolean z, Time time, RumActionType rumActionType, String str, Map map, long j, long j2, long j3, FeaturesContextResolver featuresContextResolver, boolean z2, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(rumScope, internalSdkCore, z, time, rumActionType, str, map, j, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? 100L : j2, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? 5000L : j3, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? new FeaturesContextResolver() : featuresContextResolver, z2, f);
    }
}
