package com.datadog.android.telemetry.internal;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.feature.FeatureScope;
import com.datadog.android.api.storage.DataWriter;
import com.datadog.android.api.storage.EventBatchWriter;
import com.datadog.android.api.storage.EventType;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.sampling.RateBasedSampler;
import com.datadog.android.core.sampling.Sampler;
import com.datadog.android.internal.telemetry.InternalTelemetryEvent;
import com.datadog.android.ndk.internal.NdkCrashLog;
import com.datadog.android.rum.RumSessionListener;
import com.datadog.android.rum.internal.RumFeature;
import com.datadog.android.rum.internal.domain.RumContext;
import com.datadog.android.rum.internal.domain.scope.RumRawEvent;
import com.datadog.android.rum.internal.domain.scope.RumSessionScope;
import com.datadog.android.rum.internal.metric.SessionMetricDispatcher;
import com.datadog.android.rum.internal.utils.NumberExtKt;
import com.datadog.android.telemetry.model.TelemetryDebugEvent;
import com.datadog.android.telemetry.model.TelemetryErrorEvent;
import com.datadog.android.telemetry.model.TelemetryUsageEvent;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.bs4;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.l;
import defpackage.lc9;
import defpackage.mj8;
import io.opentracing.util.GlobalTracer;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\b\r\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 e2\u00020\u0001:\u0002efB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001f\u0010\u001eJG\u0010*\u001a\u00020)2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00162\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010%2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b*\u0010+J[\u0010/\u001a\u00020.2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00162\b\u0010,\u001a\u0004\u0018\u00010\u00162\b\u0010-\u001a\u0004\u0018\u00010\u00162\u0006\u0010(\u001a\u00020'2\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010%H\u0002¢\u0006\u0004\b/\u00100J/\u00103\u001a\u0002022\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u001c\u001a\u0002012\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b3\u00104J/\u00107\u001a\u0002062\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u001c\u001a\u0002052\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0018H\u0002¢\u0006\u0004\b9\u0010:J%\u0010<\u001a\u00020\u00182\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00110%H\u0002¢\u0006\u0004\b<\u0010=J'\u0010?\u001a\u0004\u0018\u00010>2\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00110%H\u0002¢\u0006\u0004\b?\u0010@J1\u0010B\u001a\u0004\u0018\u00010\u00162\b\u0010A\u001a\u0004\u0018\u00010>2\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00110%H\u0002¢\u0006\u0004\bB\u0010CJ\u0013\u0010E\u001a\u00020D*\u00020 H\u0002¢\u0006\u0004\bE\u0010FJ5\u0010I\u001a\u00020'2\u0018\b\u0002\u0010G\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010%2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\bI\u0010JJ+\u0010L\u001a\u0004\u0018\u00010'*\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00110%2\u0006\u0010K\u001a\u00020\u0016H\u0002¢\u0006\u0004\bL\u0010MJ/\u0010O\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00110N*\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00110%H\u0002¢\u0006\u0004\bO\u0010PR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010Q\u001a\u0004\bR\u0010SR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010T\u001a\u0004\bU\u0010VR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010T\u001a\u0004\bW\u0010VR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010XR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010YR\u0016\u0010Z\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020]0\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010`\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010YR\u0016\u0010d\u001a\u0004\u0018\u00010a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bb\u0010c¨\u0006g"}, d2 = {"Lcom/datadog/android/telemetry/internal/TelemetryEventHandler;", "Lcom/datadog/android/rum/RumSessionListener;", "Lcom/datadog/android/core/InternalSdkCore;", "sdkCore", "Lcom/datadog/android/core/sampling/Sampler;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;", "eventSampler", "configurationExtraSampler", "Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;", "sessionEndedMetricDispatcher", "", "maxEventCountPerSession", "<init>", "(Lcom/datadog/android/core/InternalSdkCore;Lcom/datadog/android/core/sampling/Sampler;Lcom/datadog/android/core/sampling/Sampler;Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;I)V", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$TelemetryEventWrapper;", "wrappedEvent", "Lcom/datadog/android/api/storage/DataWriter;", "", "writer", "Lj6g;", "handleEvent", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$TelemetryEventWrapper;Lcom/datadog/android/api/storage/DataWriter;)V", "", RumSessionScope.RUM_SESSION_ID_BUS_MESSAGE_KEY, "", "isDiscarded", "onSessionStarted", "(Ljava/lang/String;Z)V", "event", "canWrite", "(Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;)Z", "isLog", "Lcom/datadog/android/api/context/DatadogContext;", "datadogContext", "", NdkCrashLog.TIMESTAMP_KEY_NAME, "message", "", "additionalProperties", "", "effectiveSampleRate", "Lcom/datadog/android/telemetry/model/TelemetryDebugEvent;", "createDebugEvent", "(Lcom/datadog/android/api/context/DatadogContext;JLjava/lang/String;Ljava/util/Map;F)Lcom/datadog/android/telemetry/model/TelemetryDebugEvent;", "stack", "kind", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent;", "createErrorEvent", "(Lcom/datadog/android/api/context/DatadogContext;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;FLjava/util/Map;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$Configuration;", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent;", "createConfigurationEvent", "(Lcom/datadog/android/api/context/DatadogContext;JLcom/datadog/android/internal/telemetry/InternalTelemetryEvent$Configuration;F)Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage;", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent;", "createApiUsageEvent", "(Lcom/datadog/android/api/context/DatadogContext;JLcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage;F)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent;", "isGlobalTracerRegistered", "()Z", "traceContext", "isOpenTelemetryRegistered", "(Ljava/util/Map;)Z", "Lcom/datadog/android/telemetry/internal/TelemetryEventHandler$TracerApi;", "resolveTracerApi", "(Ljava/util/Map;)Lcom/datadog/android/telemetry/internal/TelemetryEventHandler$TracerApi;", "tracerApi", "resolveOpenTelemetryApiVersion", "(Lcom/datadog/android/telemetry/internal/TelemetryEventHandler$TracerApi;Ljava/util/Map;)Ljava/lang/String;", "Lcom/datadog/android/rum/internal/domain/RumContext;", "rumContext", "(Lcom/datadog/android/api/context/DatadogContext;)Lcom/datadog/android/rum/internal/domain/RumContext;", "properties", "eventSpecificSamplingRate", "computeEffectiveSampleRate", "(Ljava/util/Map;Ljava/lang/Float;)F", "key", "getFloat", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Float;", "", "cleanUpInternalAttributes", "(Ljava/util/Map;)Ljava/util/Map;", "Lcom/datadog/android/core/InternalSdkCore;", "getSdkCore$dd_sdk_android_rum_release", "()Lcom/datadog/android/core/InternalSdkCore;", "Lcom/datadog/android/core/sampling/Sampler;", "getEventSampler$dd_sdk_android_rum_release", "()Lcom/datadog/android/core/sampling/Sampler;", "getConfigurationExtraSampler$dd_sdk_android_rum_release", "Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;", "I", "trackNetworkRequests", "Z", "", "Lcom/datadog/android/telemetry/internal/TelemetryEventId;", "eventIDsSeenInCurrentSession", "Ljava/util/Set;", "totalEventsSeenInCurrentSession", "Lcom/datadog/android/rum/internal/RumFeature$Configuration;", "getRumConfig", "()Lcom/datadog/android/rum/internal/RumFeature$Configuration;", "rumConfig", "Companion", "TracerApi", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class TelemetryEventHandler implements RumSessionListener {
    public static final String ALREADY_SEEN_EVENT_MESSAGE = "Already seen telemetry event with identity=%s, rejecting.";
    public static final float DEFAULT_CONFIGURATION_SAMPLE_RATE = 20.0f;
    public static final String IS_OPENTELEMETRY_ENABLED_CONTEXT_KEY = "is_opentelemetry_enabled";
    public static final int MAX_EVENTS_PER_SESSION = 100;
    public static final String MAX_EVENT_NUMBER_REACHED_MESSAGE = "Max number of telemetry events per session reached, rejecting.";
    public static final String OPENTELEMETRY_API_VERSION_CONTEXT_KEY = "opentelemetry_api_version";
    public static final String SESSION_REPLAY_IMAGE_PRIVACY_KEY = "session_replay_image_privacy";
    public static final String SESSION_REPLAY_SAMPLE_RATE_KEY = "session_replay_sample_rate";
    public static final String SESSION_REPLAY_START_IMMEDIATE_RECORDING_KEY = "session_replay_start_immediate_recording";
    public static final String SESSION_REPLAY_TEXT_AND_INPUT_PRIVACY_KEY = "session_replay_text_and_input_privacy";
    public static final String SESSION_REPLAY_TOUCH_PRIVACY_KEY = "session_replay_touch_privacy";
    public static final String TELEMETRY_SERVICE_NAME = "dd-sdk-android";
    private final Sampler<InternalTelemetryEvent> configurationExtraSampler;
    private final Set<TelemetryEventId> eventIDsSeenInCurrentSession;
    private final Sampler<InternalTelemetryEvent> eventSampler;
    private final int maxEventCountPerSession;
    private final InternalSdkCore sdkCore;
    private final SessionMetricDispatcher sessionEndedMetricDispatcher;
    private int totalEventsSeenInCurrentSession;
    private boolean trackNetworkRequests;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/datadog/android/telemetry/internal/TelemetryEventHandler$TracerApi;", "", "(Ljava/lang/String;I)V", "OpenTelemetry", "OpenTracing", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum TracerApi {
        OpenTelemetry,
        OpenTracing
    }

    /* JADX INFO: renamed from: com.datadog.android.telemetry.internal.TelemetryEventHandler$canWrite$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        final /* synthetic */ TelemetryEventId $eventIdentity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TelemetryEventId telemetryEventId) {
            super(0);
            this.$eventIdentity = telemetryEventId;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, TelemetryEventHandler.ALREADY_SEEN_EVENT_MESSAGE, Arrays.copyOf(new Object[]{this.$eventIdentity}, 1));
        }
    }

    public TelemetryEventHandler(InternalSdkCore internalSdkCore, Sampler<InternalTelemetryEvent> sampler, Sampler<InternalTelemetryEvent> sampler2, SessionMetricDispatcher sessionMetricDispatcher, int i) {
        internalSdkCore.getClass();
        sampler.getClass();
        sampler2.getClass();
        sessionMetricDispatcher.getClass();
        this.sdkCore = internalSdkCore;
        this.eventSampler = sampler;
        this.configurationExtraSampler = sampler2;
        this.sessionEndedMetricDispatcher = sessionMetricDispatcher;
        this.maxEventCountPerSession = i;
        this.eventIDsSeenInCurrentSession = new LinkedHashSet();
    }

    private final boolean canWrite(InternalTelemetryEvent event) {
        if (!this.eventSampler.sample(event)) {
            return false;
        }
        if ((event instanceof InternalTelemetryEvent.Configuration) && !this.configurationExtraSampler.sample(event)) {
            return false;
        }
        TelemetryEventId identity = TelemetryEventIdKt.getIdentity(event);
        if (isLog(event) && this.eventIDsSeenInCurrentSession.contains(identity)) {
            InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.INFO, InternalLogger.Target.MAINTAINER, (gu5) new AnonymousClass1(identity), (Throwable) null, false, (Map) null, 56, (Object) null);
            return false;
        }
        if (this.totalEventsSeenInCurrentSession < this.maxEventCountPerSession) {
            return true;
        }
        InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.INFO, InternalLogger.Target.MAINTAINER, (gu5) AnonymousClass2.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
        return false;
    }

    private final Map<String, Object> cleanUpInternalAttributes(Map<String, ? extends Object> map) {
        LinkedHashMap linkedHashMapI0 = lc9.i0(map);
        linkedHashMapI0.remove(InternalTelemetryEvent.REPORTING_SAMPLING_RATE_KEY);
        linkedHashMapI0.remove(InternalTelemetryEvent.CREATION_SAMPLING_RATE_KEY);
        return linkedHashMapI0;
    }

    private final float computeEffectiveSampleRate(Map<String, ? extends Object> properties, Float eventSpecificSamplingRate) {
        Float f;
        Float f2;
        RumFeature.Configuration rumConfig = getRumConfig();
        if (rumConfig == null) {
            return 0.0f;
        }
        double dPercent = NumberExtKt.percent(rumConfig.getTelemetrySampleRate());
        double dPercent2 = (properties == null || (f2 = getFloat(properties, InternalTelemetryEvent.CREATION_SAMPLING_RATE_KEY)) == null) ? 1.0d : NumberExtKt.percent(f2.floatValue());
        return (float) (dPercent * dPercent2 * ((properties == null || (f = getFloat(properties, InternalTelemetryEvent.REPORTING_SAMPLING_RATE_KEY)) == null) ? 1.0d : NumberExtKt.percent(f.floatValue())) * (eventSpecificSamplingRate != null ? NumberExtKt.percent(eventSpecificSamplingRate.floatValue()) : 1.0d) * 100.0d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ float computeEffectiveSampleRate$default(TelemetryEventHandler telemetryEventHandler, Map map, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            map = null;
        }
        if ((i & 2) != 0) {
            f = null;
        }
        return telemetryEventHandler.computeEffectiveSampleRate(map, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TelemetryUsageEvent createApiUsageEvent(DatadogContext datadogContext, long timestamp, InternalTelemetryEvent.ApiUsage event, float effectiveSampleRate) {
        RumContext rumContext = rumContext(datadogContext);
        if (!(event instanceof InternalTelemetryEvent.ApiUsage.AddViewLoadingTime)) {
            l.g();
            return null;
        }
        Map<String, Object> mapCleanUpInternalAttributes = cleanUpInternalAttributes(event.getAdditionalProperties());
        TelemetryUsageEvent.Dd dd = new TelemetryUsageEvent.Dd();
        TelemetryUsageEvent.Source sourceTryFromSource = TelemetryEventExtKt.tryFromSource(TelemetryUsageEvent.Source.INSTANCE, datadogContext.getSource(), this.sdkCore.getInternalLogger());
        if (sourceTryFromSource == null) {
            sourceTryFromSource = TelemetryUsageEvent.Source.ANDROID;
        }
        TelemetryUsageEvent.Source source = sourceTryFromSource;
        String sdkVersion = datadogContext.getSdkVersion();
        TelemetryUsageEvent.Application application = new TelemetryUsageEvent.Application(rumContext.getApplicationId());
        TelemetryUsageEvent.Session session = new TelemetryUsageEvent.Session(rumContext.getSessionId());
        String viewId = rumContext.getViewId();
        TelemetryUsageEvent.View view = viewId != null ? new TelemetryUsageEvent.View(viewId) : null;
        String actionId = rumContext.getActionId();
        InternalTelemetryEvent.ApiUsage.AddViewLoadingTime addViewLoadingTime = (InternalTelemetryEvent.ApiUsage.AddViewLoadingTime) event;
        return new TelemetryUsageEvent(dd, timestamp, TELEMETRY_SERVICE_NAME, source, sdkVersion, application, session, view, actionId != null ? new TelemetryUsageEvent.Action(actionId) : null, Float.valueOf(effectiveSampleRate), null, new TelemetryUsageEvent.Telemetry(new TelemetryUsageEvent.Device(datadogContext.getDeviceInfo().getArchitecture(), datadogContext.getDeviceInfo().getDeviceBrand(), datadogContext.getDeviceInfo().getDeviceModel()), new TelemetryUsageEvent.Os(datadogContext.getDeviceInfo().getDeviceBuildId(), datadogContext.getDeviceInfo().getOsName(), datadogContext.getDeviceInfo().getOsVersion()), new TelemetryUsageEvent.Usage.AddViewLoadingTime(addViewLoadingTime.getNoView(), addViewLoadingTime.getNoActiveView(), addViewLoadingTime.getOverwrite()), mapCleanUpInternalAttributes), IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.datadog.android.telemetry.model.TelemetryConfigurationEvent createConfigurationEvent(com.datadog.android.api.context.DatadogContext r93, long r94, com.datadog.android.internal.telemetry.InternalTelemetryEvent.Configuration r96, float r97) {
        /*
            Method dump skipped, instruction units count: 700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.telemetry.internal.TelemetryEventHandler.createConfigurationEvent(com.datadog.android.api.context.DatadogContext, long, com.datadog.android.internal.telemetry.InternalTelemetryEvent$Configuration, float):com.datadog.android.telemetry.model.TelemetryConfigurationEvent");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TelemetryDebugEvent createDebugEvent(DatadogContext datadogContext, long timestamp, String message, Map<String, ? extends Object> additionalProperties, float effectiveSampleRate) {
        RumContext rumContext = rumContext(datadogContext);
        Map<String, Object> mapCleanUpInternalAttributes = cleanUpInternalAttributes(new LinkedHashMap(additionalProperties == null ? bs4.a : additionalProperties));
        TelemetryDebugEvent.Dd dd = new TelemetryDebugEvent.Dd();
        TelemetryDebugEvent.Source sourceTryFromSource = TelemetryEventExtKt.tryFromSource(TelemetryDebugEvent.Source.INSTANCE, datadogContext.getSource(), this.sdkCore.getInternalLogger());
        if (sourceTryFromSource == null) {
            sourceTryFromSource = TelemetryDebugEvent.Source.ANDROID;
        }
        TelemetryDebugEvent.Source source = sourceTryFromSource;
        String sdkVersion = datadogContext.getSdkVersion();
        TelemetryDebugEvent.Application application = new TelemetryDebugEvent.Application(rumContext.getApplicationId());
        TelemetryDebugEvent.Session session = new TelemetryDebugEvent.Session(rumContext.getSessionId());
        String viewId = rumContext.getViewId();
        TelemetryDebugEvent.View view = viewId != null ? new TelemetryDebugEvent.View(viewId) : null;
        String actionId = rumContext.getActionId();
        return new TelemetryDebugEvent(dd, timestamp, TELEMETRY_SERVICE_NAME, source, sdkVersion, application, session, view, actionId != null ? new TelemetryDebugEvent.Action(actionId) : null, Float.valueOf(effectiveSampleRate), null, new TelemetryDebugEvent.Telemetry(new TelemetryDebugEvent.Device(datadogContext.getDeviceInfo().getArchitecture(), datadogContext.getDeviceInfo().getDeviceBrand(), datadogContext.getDeviceInfo().getDeviceModel()), new TelemetryDebugEvent.Os(datadogContext.getDeviceInfo().getDeviceBuildId(), datadogContext.getDeviceInfo().getOsName(), datadogContext.getDeviceInfo().getOsVersion()), message, mapCleanUpInternalAttributes), IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TelemetryErrorEvent createErrorEvent(DatadogContext datadogContext, long timestamp, String message, String stack, String kind, float effectiveSampleRate, Map<String, ? extends Object> additionalProperties) {
        RumContext rumContext = rumContext(datadogContext);
        Map<String, Object> mapCleanUpInternalAttributes = cleanUpInternalAttributes(new LinkedHashMap(additionalProperties == null ? bs4.a : additionalProperties));
        TelemetryErrorEvent.Dd dd = new TelemetryErrorEvent.Dd();
        TelemetryErrorEvent.Source sourceTryFromSource = TelemetryEventExtKt.tryFromSource(TelemetryErrorEvent.Source.INSTANCE, datadogContext.getSource(), this.sdkCore.getInternalLogger());
        if (sourceTryFromSource == null) {
            sourceTryFromSource = TelemetryErrorEvent.Source.ANDROID;
        }
        TelemetryErrorEvent.Source source = sourceTryFromSource;
        String sdkVersion = datadogContext.getSdkVersion();
        TelemetryErrorEvent.Application application = new TelemetryErrorEvent.Application(rumContext.getApplicationId());
        TelemetryErrorEvent.Session session = new TelemetryErrorEvent.Session(rumContext.getSessionId());
        String viewId = rumContext.getViewId();
        TelemetryErrorEvent.View view = viewId != null ? new TelemetryErrorEvent.View(viewId) : null;
        String actionId = rumContext.getActionId();
        return new TelemetryErrorEvent(dd, timestamp, TELEMETRY_SERVICE_NAME, source, sdkVersion, application, session, view, actionId != null ? new TelemetryErrorEvent.Action(actionId) : null, Float.valueOf(effectiveSampleRate), null, new TelemetryErrorEvent.Telemetry(new TelemetryErrorEvent.Device(datadogContext.getDeviceInfo().getArchitecture(), datadogContext.getDeviceInfo().getDeviceBrand(), datadogContext.getDeviceInfo().getDeviceModel()), new TelemetryErrorEvent.Os(datadogContext.getDeviceInfo().getDeviceBuildId(), datadogContext.getDeviceInfo().getOsName(), datadogContext.getDeviceInfo().getOsVersion()), message, (stack == null && kind == null) ? null : new TelemetryErrorEvent.Error(stack, kind), mapCleanUpInternalAttributes), IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, null);
    }

    private final Float getFloat(Map<String, ? extends Object> map, String str) {
        Object obj = map.get(str);
        if (obj instanceof Float) {
            return (Float) obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RumFeature.Configuration getRumConfig() {
        RumFeature rumFeature;
        FeatureScope feature = this.sdkCore.getFeature("rum");
        if (feature == null || (rumFeature = (RumFeature) feature.unwrap()) == null) {
            return null;
        }
        return rumFeature.getConfiguration();
    }

    private final boolean isGlobalTracerRegistered() {
        try {
            GlobalTracer globalTracer = GlobalTracer.a;
            try {
                Object objInvoke = GlobalTracer.class.getMethod("isRegistered", null).invoke(null, null);
                objInvoke.getClass();
                return ((Boolean) objInvoke).booleanValue();
            } catch (Throwable th) {
                InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.ERROR, InternalLogger.Target.TELEMETRY, (gu5) C06261.INSTANCE, th, false, (Map) null, 48, (Object) null);
                return false;
            }
        } catch (Throwable unused) {
        }
    }

    private final boolean isLog(InternalTelemetryEvent event) {
        return event instanceof InternalTelemetryEvent.Log;
    }

    private final boolean isOpenTelemetryRegistered(Map<String, ? extends Object> traceContext) {
        Object obj = traceContext.get("is_opentelemetry_enabled");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final String resolveOpenTelemetryApiVersion(TracerApi tracerApi, Map<String, ? extends Object> traceContext) {
        if (tracerApi == TracerApi.OpenTelemetry) {
            Object obj = traceContext.get("opentelemetry_api_version");
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        return null;
    }

    private final TracerApi resolveTracerApi(Map<String, ? extends Object> traceContext) {
        if (isOpenTelemetryRegistered(traceContext)) {
            return TracerApi.OpenTelemetry;
        }
        if (isGlobalTracerRegistered()) {
            return TracerApi.OpenTracing;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RumContext rumContext(DatadogContext datadogContext) {
        Map<String, ? extends Object> map = datadogContext.getFeaturesContext().get("rum");
        if (map == null) {
            map = bs4.a;
        }
        return RumContext.INSTANCE.fromFeatureContext(map);
    }

    public final Sampler<InternalTelemetryEvent> getConfigurationExtraSampler$dd_sdk_android_rum_release() {
        return this.configurationExtraSampler;
    }

    public final Sampler<InternalTelemetryEvent> getEventSampler$dd_sdk_android_rum_release() {
        return this.eventSampler;
    }

    /* JADX INFO: renamed from: getSdkCore$dd_sdk_android_rum_release, reason: from getter */
    public final InternalSdkCore getSdkCore() {
        return this.sdkCore;
    }

    public final void handleEvent(RumRawEvent.TelemetryEventWrapper wrappedEvent, DataWriter<Object> writer) {
        wrappedEvent.getClass();
        writer.getClass();
        InternalTelemetryEvent event = wrappedEvent.getEvent();
        if (canWrite(event)) {
            this.eventIDsSeenInCurrentSession.add(TelemetryEventIdKt.getIdentity(event));
            this.totalEventsSeenInCurrentSession++;
            FeatureScope feature = this.sdkCore.getFeature("rum");
            if (feature != null) {
                FeatureScope.DefaultImpls.withWriteContext$default(feature, false, new C06251(wrappedEvent, event, this, writer), 1, null);
            }
        }
    }

    @Override // com.datadog.android.rum.RumSessionListener
    public void onSessionStarted(String sessionId, boolean isDiscarded) {
        sessionId.getClass();
        this.eventIDsSeenInCurrentSession.clear();
        this.totalEventsSeenInCurrentSession = 0;
    }

    /* JADX INFO: renamed from: com.datadog.android.telemetry.internal.TelemetryEventHandler$canWrite$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements gu5<String> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return TelemetryEventHandler.MAX_EVENT_NUMBER_REACHED_MESSAGE;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.telemetry.internal.TelemetryEventHandler$isGlobalTracerRegistered$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C06261 extends mj8 implements gu5<String> {
        public static final C06261 INSTANCE = new C06261();

        public C06261() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "GlobalTracer class exists in the runtime classpath, but there is an error invoking isRegistered method";
        }
    }

    public /* synthetic */ TelemetryEventHandler(InternalSdkCore internalSdkCore, Sampler sampler, Sampler sampler2, SessionMetricDispatcher sessionMetricDispatcher, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(internalSdkCore, sampler, (i2 & 4) != 0 ? new RateBasedSampler(20.0f) : sampler2, sessionMetricDispatcher, (i2 & 16) != 0 ? 100 : i);
    }

    /* JADX INFO: renamed from: com.datadog.android.telemetry.internal.TelemetryEventHandler$handleEvent$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/datadog/android/api/context/DatadogContext;", "datadogContext", "Lcom/datadog/android/api/storage/EventBatchWriter;", "eventBatchWriter", "Lj6g;", "invoke", "(Lcom/datadog/android/api/context/DatadogContext;Lcom/datadog/android/api/storage/EventBatchWriter;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class C06251 extends mj8 implements Function2<DatadogContext, EventBatchWriter, j6g> {
        final /* synthetic */ InternalTelemetryEvent $event;
        final /* synthetic */ RumRawEvent.TelemetryEventWrapper $wrappedEvent;
        final /* synthetic */ DataWriter<Object> $writer;
        final /* synthetic */ TelemetryEventHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06251(RumRawEvent.TelemetryEventWrapper telemetryEventWrapper, InternalTelemetryEvent internalTelemetryEvent, TelemetryEventHandler telemetryEventHandler, DataWriter<Object> dataWriter) {
            super(2);
            this.$wrappedEvent = telemetryEventWrapper;
            this.$event = internalTelemetryEvent;
            this.this$0 = telemetryEventHandler;
            this.$writer = dataWriter;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DatadogContext datadogContext, EventBatchWriter eventBatchWriter) {
            datadogContext.getClass();
            eventBatchWriter.getClass();
            long serverTimeOffsetMs = datadogContext.getTime().getServerTimeOffsetMs() + this.$wrappedEvent.getEventTime().getTimestamp();
            InternalTelemetryEvent internalTelemetryEvent = this.$event;
            Object objCreateApiUsageEvent = null;
            if (internalTelemetryEvent instanceof InternalTelemetryEvent.Log.Debug) {
                objCreateApiUsageEvent = this.this$0.createDebugEvent(datadogContext, serverTimeOffsetMs, ((InternalTelemetryEvent.Log.Debug) internalTelemetryEvent).getMessage(), ((InternalTelemetryEvent.Log.Debug) this.$event).getAdditionalProperties(), TelemetryEventHandler.computeEffectiveSampleRate$default(this.this$0, ((InternalTelemetryEvent.Log.Debug) this.$event).getAdditionalProperties(), null, 2, null));
            } else if (internalTelemetryEvent instanceof InternalTelemetryEvent.Metric) {
                objCreateApiUsageEvent = this.this$0.createDebugEvent(datadogContext, serverTimeOffsetMs, ((InternalTelemetryEvent.Metric) internalTelemetryEvent).getMessage(), ((InternalTelemetryEvent.Metric) this.$event).getAdditionalProperties(), TelemetryEventHandler.computeEffectiveSampleRate$default(this.this$0, ((InternalTelemetryEvent.Metric) this.$event).getAdditionalProperties(), null, 2, null));
            } else if (internalTelemetryEvent instanceof InternalTelemetryEvent.Log.Error) {
                this.this$0.sessionEndedMetricDispatcher.onSdkErrorTracked(this.this$0.rumContext(datadogContext).getSessionId(), ((InternalTelemetryEvent.Log.Error) this.$event).getKind());
                objCreateApiUsageEvent = this.this$0.createErrorEvent(datadogContext, serverTimeOffsetMs, ((InternalTelemetryEvent.Log.Error) this.$event).getMessage(), ((InternalTelemetryEvent.Log.Error) this.$event).resolveStacktrace(), ((InternalTelemetryEvent.Log.Error) this.$event).resolveKind(), TelemetryEventHandler.computeEffectiveSampleRate$default(this.this$0, ((InternalTelemetryEvent.Log.Error) this.$event).getAdditionalProperties(), null, 2, null), ((InternalTelemetryEvent.Log.Error) this.$event).getAdditionalProperties());
            } else if (internalTelemetryEvent instanceof InternalTelemetryEvent.Configuration) {
                TelemetryEventHandler telemetryEventHandler = this.this$0;
                InternalTelemetryEvent.Configuration configuration = (InternalTelemetryEvent.Configuration) internalTelemetryEvent;
                RumFeature.Configuration rumConfig = telemetryEventHandler.getRumConfig();
                objCreateApiUsageEvent = telemetryEventHandler.createConfigurationEvent(datadogContext, serverTimeOffsetMs, configuration, TelemetryEventHandler.computeEffectiveSampleRate$default(telemetryEventHandler, null, rumConfig != null ? Float.valueOf(rumConfig.getTelemetryConfigurationSampleRate()) : null, 1, null));
            } else if (internalTelemetryEvent instanceof InternalTelemetryEvent.ApiUsage) {
                TelemetryEventHandler telemetryEventHandler2 = this.this$0;
                objCreateApiUsageEvent = telemetryEventHandler2.createApiUsageEvent(datadogContext, serverTimeOffsetMs, (InternalTelemetryEvent.ApiUsage) internalTelemetryEvent, TelemetryEventHandler.computeEffectiveSampleRate$default(telemetryEventHandler2, ((InternalTelemetryEvent.ApiUsage) internalTelemetryEvent).getAdditionalProperties(), null, 2, null));
            } else {
                if (!(internalTelemetryEvent instanceof InternalTelemetryEvent.InterceptorInstantiated)) {
                    l.g();
                    return;
                }
                this.this$0.trackNetworkRequests = true;
            }
            if (objCreateApiUsageEvent != null) {
                this.$writer.write(eventBatchWriter, objCreateApiUsageEvent, EventType.TELEMETRY);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ j6g invoke(DatadogContext datadogContext, EventBatchWriter eventBatchWriter) {
            invoke2(datadogContext, eventBatchWriter);
            return j6g.a;
        }
    }
}
