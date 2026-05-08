package com.datadog.android.rum.internal.domain.scope;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.api.context.UserInfo;
import com.datadog.android.api.storage.DataWriter;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver;
import com.datadog.android.internal.utils.ThrowableExtKt;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumAttributes;
import com.datadog.android.rum.RumErrorSource;
import com.datadog.android.rum.RumResourceKind;
import com.datadog.android.rum.RumResourceMethod;
import com.datadog.android.rum.internal.FeaturesContextResolver;
import com.datadog.android.rum.internal.RumFeature;
import com.datadog.android.rum.internal.domain.RumContext;
import com.datadog.android.rum.internal.domain.Time;
import com.datadog.android.rum.internal.domain.event.ResourceTiming;
import com.datadog.android.rum.internal.domain.scope.RumRawEvent;
import com.datadog.android.rum.internal.metric.networksettled.InternalResourceContext;
import com.datadog.android.rum.internal.metric.networksettled.NetworkSettledMetricResolver;
import com.datadog.android.rum.internal.monitor.AdvancedRumMonitor;
import com.datadog.android.rum.internal.monitor.StorageEvent;
import com.datadog.android.rum.internal.utils.RuntimeUtilsKt;
import com.datadog.android.rum.internal.utils.SdkCoreExtKt;
import com.datadog.android.rum.model.ErrorEvent;
import com.datadog.android.rum.model.ResourceEvent;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.lc9;
import defpackage.mj8;
import defpackage.t40;
import defpackage.u63;
import defpackage.wl7;
import defpackage.zve;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 \u008b\u00012\u00020\u0001:\u0002\u008b\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t0\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001dH\u0017¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J%\u0010)\u001a\u00020(2\u0006\u0010\u001c\u001a\u00020'2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001dH\u0003¢\u0006\u0004\b)\u0010*J%\u0010,\u001a\u00020(2\u0006\u0010\u001c\u001a\u00020+2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001dH\u0003¢\u0006\u0004\b,\u0010-J%\u0010/\u001a\u00020(2\u0006\u0010\u001c\u001a\u00020.2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001dH\u0003¢\u0006\u0004\b/\u00100J%\u00102\u001a\u00020(2\u0006\u0010\u001c\u001a\u0002012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001dH\u0003¢\u0006\u0004\b2\u00103JA\u00108\u001a\u00020(2\u0006\u00105\u001a\u0002042\b\u00106\u001a\u0004\u0018\u00010\u000f2\b\u00107\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001dH\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b:\u0010;J\u0011\u0010=\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\b=\u0010>J]\u0010G\u001a\u00020(2\u0006\u0010?\u001a\u00020\u00052\u0006\u0010A\u001a\u00020@2\b\u00106\u001a\u0004\u0018\u00010\u000f2\b\u0010B\u001a\u0004\u0018\u00010\u00052\b\u0010C\u001a\u0004\u0018\u00010\u00052\b\u0010E\u001a\u0004\u0018\u00010D2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001d2\u0006\u0010F\u001a\u00020\u000fH\u0002¢\u0006\u0004\bG\u0010HJ\u0011\u0010J\u001a\u0004\u0018\u00010IH\u0002¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\bL\u0010MJ9\u0010S\u001a\u0004\u0018\u00010R2\b\u0010N\u001a\u0004\u0018\u00010\u00052\b\u0010O\u001a\u0004\u0018\u00010\u00052\b\u0010P\u001a\u0004\u0018\u00010\u00052\b\u0010Q\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\bS\u0010TR\u001a\u0010\u0002\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010U\u001a\u0004\bV\u0010WR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010X\u001a\u0004\bY\u0010ZR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010[\u001a\u0004\b\\\u0010]R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010^\u001a\u0004\b_\u0010`R\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010a\u001a\u0004\bb\u0010cR\u001a\u0010\u0012\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010d\u001a\u0004\be\u0010fR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010gR\u001a\u0010\u0016\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010h\u001a\u0004\bi\u0010jR\u001a\u0010\u0018\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010k\u001a\u0004\bl\u0010mR\u001a\u0010n\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\bn\u0010[\u001a\u0004\bo\u0010]R(\u0010q\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t0p8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR\u0018\u0010v\u001a\u0004\u0018\u00010u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010x\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u001a\u0010z\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R\u0014\u0010~\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010{R\u0017\u0010\u0080\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0019\u0010\u0082\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0019\u0010\u0084\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0083\u0001R(\u0010\u0085\u0001\u001a\u00020$8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0085\u0001\u0010\u0083\u0001\u001a\u0005\b\u0086\u0001\u0010&\"\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0017\u00105\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b5\u0010\u0089\u0001R\u0019\u00106\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b6\u0010\u008a\u0001R\u0019\u00107\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b7\u0010\u008a\u0001¨\u0006\u008c\u0001"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumResourceScope;", "Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "parentScope", "Lcom/datadog/android/core/InternalSdkCore;", "sdkCore", "", "url", "Lcom/datadog/android/rum/RumResourceMethod;", "method", "", "key", "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "", "initialAttributes", "", "serverTimeOffsetInMs", "Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "firstPartyHostHeaderTypeResolver", "Lcom/datadog/android/rum/internal/FeaturesContextResolver;", "featuresContextResolver", "", "sampleRate", "Lcom/datadog/android/rum/internal/metric/networksettled/NetworkSettledMetricResolver;", "networkSettledMetricResolver", "<init>", "(Lcom/datadog/android/rum/internal/domain/scope/RumScope;Lcom/datadog/android/core/InternalSdkCore;Ljava/lang/String;Lcom/datadog/android/rum/RumResourceMethod;Ljava/lang/Object;Lcom/datadog/android/rum/internal/domain/Time;Ljava/util/Map;JLcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;Lcom/datadog/android/rum/internal/FeaturesContextResolver;FLcom/datadog/android/rum/internal/metric/networksettled/NetworkSettledMetricResolver;)V", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "event", "Lcom/datadog/android/api/storage/DataWriter;", "writer", "handleEvent", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;Lcom/datadog/android/api/storage/DataWriter;)Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "Lcom/datadog/android/rum/internal/domain/RumContext;", "getRumContext", "()Lcom/datadog/android/rum/internal/domain/RumContext;", "", "isActive", "()Z", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopResource;", "Lj6g;", "onStopResource", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopResource;Lcom/datadog/android/api/storage/DataWriter;)V", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddResourceTiming;", "onAddResourceTiming", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddResourceTiming;Lcom/datadog/android/api/storage/DataWriter;)V", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopResourceWithError;", "onStopResourceWithError", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopResourceWithError;Lcom/datadog/android/api/storage/DataWriter;)V", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopResourceWithStackTrace;", "onStopResourceWithStackTrace", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopResourceWithStackTrace;Lcom/datadog/android/api/storage/DataWriter;)V", "Lcom/datadog/android/rum/RumResourceKind;", "kind", "statusCode", "size", "sendResource", "(Lcom/datadog/android/rum/RumResourceKind;Ljava/lang/Long;Ljava/lang/Long;Lcom/datadog/android/rum/internal/domain/Time;Lcom/datadog/android/api/storage/DataWriter;)V", "resolveResourceDuration", "(Lcom/datadog/android/rum/internal/domain/Time;)J", "Lcom/datadog/android/rum/model/ResourceEvent$Provider;", "resolveResourceProvider", "()Lcom/datadog/android/rum/model/ResourceEvent$Provider;", "message", "Lcom/datadog/android/rum/RumErrorSource;", "source", "stackTrace", "errorType", "Lcom/datadog/android/rum/model/ErrorEvent$Category;", "errorCategory", "resourceStopTimestampInNanos", "sendError", "(Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/ErrorEvent$Category;Lcom/datadog/android/api/storage/DataWriter;J)V", "Lcom/datadog/android/rum/model/ErrorEvent$Provider;", "resolveErrorProvider", "()Lcom/datadog/android/rum/model/ErrorEvent$Provider;", "resolveDomain", "(Ljava/lang/String;)Ljava/lang/String;", "operationType", "operationName", "payload", "variables", "Lcom/datadog/android/rum/model/ResourceEvent$Graphql;", "resolveGraphQLAttributes", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Graphql;", "Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "getParentScope$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "Lcom/datadog/android/core/InternalSdkCore;", "getSdkCore$dd_sdk_android_rum_release", "()Lcom/datadog/android/core/InternalSdkCore;", "Ljava/lang/String;", "getUrl$dd_sdk_android_rum_release", "()Ljava/lang/String;", "Lcom/datadog/android/rum/RumResourceMethod;", "getMethod$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/RumResourceMethod;", "Ljava/lang/Object;", "getKey$dd_sdk_android_rum_release", "()Ljava/lang/Object;", "Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "getFirstPartyHostHeaderTypeResolver$dd_sdk_android_rum_release", "()Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "Lcom/datadog/android/rum/internal/FeaturesContextResolver;", "F", "getSampleRate$dd_sdk_android_rum_release", "()F", "Lcom/datadog/android/rum/internal/metric/networksettled/NetworkSettledMetricResolver;", "getNetworkSettledMetricResolver$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/metric/networksettled/NetworkSettledMetricResolver;", "resourceId", "getResourceId$dd_sdk_android_rum_release", "", RumFeature.EVENT_ATTRIBUTES_PROPERTY, "Ljava/util/Map;", "getAttributes$dd_sdk_android_rum_release", "()Ljava/util/Map;", "Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;", "timing", "Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;", "initialContext", "Lcom/datadog/android/rum/internal/domain/RumContext;", "eventTimestamp", "J", "getEventTimestamp$dd_sdk_android_rum_release", "()J", "startedNanos", "Lcom/datadog/android/api/context/NetworkInfo;", "networkInfo", "Lcom/datadog/android/api/context/NetworkInfo;", "sent", "Z", "waitForTiming", "stopped", "getStopped$dd_sdk_android_rum_release", "setStopped$dd_sdk_android_rum_release", "(Z)V", "Lcom/datadog/android/rum/RumResourceKind;", "Ljava/lang/Long;", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class RumResourceScope implements RumScope {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String NEGATIVE_DURATION_WARNING_MESSAGE = "The computed duration for your resource: %s was 0 or negative. In order to keep the resource event we forced it to 1ns.";
    private final Map<String, Object> attributes;
    private final long eventTimestamp;
    private final FeaturesContextResolver featuresContextResolver;
    private final FirstPartyHostHeaderTypeResolver firstPartyHostHeaderTypeResolver;
    private final RumContext initialContext;
    private final Object key;
    private RumResourceKind kind;
    private final RumResourceMethod method;
    private final NetworkInfo networkInfo;
    private final NetworkSettledMetricResolver networkSettledMetricResolver;
    private final RumScope parentScope;
    private final String resourceId;
    private final float sampleRate;
    private final InternalSdkCore sdkCore;
    private boolean sent;
    private Long size;
    private final long startedNanos;
    private Long statusCode;
    private boolean stopped;
    private ResourceTiming timing;
    private final String url;
    private boolean waitForTiming;

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumResourceScope$resolveResourceDuration$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, RumResourceScope.NEGATIVE_DURATION_WARNING_MESSAGE, Arrays.copyOf(new Object[]{RumResourceScope.this.getUrl()}, 1));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumResourceScope$sendError$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "datadogContext", "Lcom/datadog/android/api/context/DatadogContext;", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05881 extends mj8 implements Function1<DatadogContext, Object> {
        final /* synthetic */ ErrorEvent.Category $errorCategory;
        final /* synthetic */ String $errorFingerprint;
        final /* synthetic */ String $errorType;
        final /* synthetic */ Map<String, Object> $eventAttributes;
        final /* synthetic */ String $message;
        final /* synthetic */ RumContext $rumContext;
        final /* synthetic */ ErrorEvent.ErrorEventSessionType $sessionType;
        final /* synthetic */ RumErrorSource $source;
        final /* synthetic */ String $stackTrace;
        final /* synthetic */ Long $statusCode;
        final /* synthetic */ ErrorEvent.Synthetics $syntheticsAttribute;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05881(RumContext rumContext, RumErrorSource rumErrorSource, Long l, String str, String str2, String str3, String str4, ErrorEvent.Category category, ErrorEvent.ErrorEventSessionType errorEventSessionType, Map<String, Object> map, ErrorEvent.Synthetics synthetics) {
            super(1);
            this.$rumContext = rumContext;
            this.$source = rumErrorSource;
            this.$statusCode = l;
            this.$message = str;
            this.$stackTrace = str2;
            this.$errorFingerprint = str3;
            this.$errorType = str4;
            this.$errorCategory = category;
            this.$sessionType = errorEventSessionType;
            this.$eventAttributes = map;
            this.$syntheticsAttribute = synthetics;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(DatadogContext datadogContext) {
            datadogContext.getClass();
            UserInfo userInfo = datadogContext.getUserInfo();
            FeaturesContextResolver featuresContextResolver = RumResourceScope.this.featuresContextResolver;
            String viewId = this.$rumContext.getViewId();
            if (viewId == null) {
                viewId = "";
            }
            boolean zResolveViewHasReplay = featuresContextResolver.resolveViewHasReplay(datadogContext, viewId);
            String appBuildId = datadogContext.getAppBuildId();
            long eventTimestamp = RumResourceScope.this.getEventTimestamp();
            ErrorEvent.ErrorSource schemaSource = RumEventExtKt.toSchemaSource(this.$source);
            String url = RumResourceScope.this.getUrl();
            ErrorEvent.Method errorMethod = RumEventExtKt.toErrorMethod(RumResourceScope.this.getMethod());
            Long l = this.$statusCode;
            ErrorEvent.Error error = new ErrorEvent.Error(null, this.$message, schemaSource, this.$stackTrace, null, Boolean.FALSE, this.$errorFingerprint, this.$errorType, this.$errorCategory, null, null, ErrorEvent.SourceType.ANDROID, new ErrorEvent.Resource(errorMethod, l != null ? l.longValue() : 0L, url, RumResourceScope.this.resolveErrorProvider()), null, null, null, null, null, null, 517649, null);
            String actionId = this.$rumContext.getActionId();
            ErrorEvent.Plan plan = null;
            byte b = 0;
            byte b2 = 0;
            byte b3 = 0;
            ErrorEvent.Action action = actionId != null ? new ErrorEvent.Action(u63.Z(actionId)) : null;
            String viewId2 = this.$rumContext.getViewId();
            String str = viewId2 == null ? "" : viewId2;
            String viewName = this.$rumContext.getViewName();
            String viewUrl = this.$rumContext.getViewUrl();
            return new ErrorEvent(eventTimestamp, new ErrorEvent.Application(this.$rumContext.getApplicationId()), datadogContext.getService(), datadogContext.getVersion(), null, appBuildId, new ErrorEvent.ErrorEventSession(this.$rumContext.getSessionId(), this.$sessionType, Boolean.valueOf(zResolveViewHasReplay)), RumEventExtKt.tryFromSource(ErrorEvent.ErrorEventSource.INSTANCE, datadogContext.getSource(), RumResourceScope.this.getSdkCore().getInternalLogger()), new ErrorEvent.ErrorEventView(str, null, viewUrl == null ? "" : viewUrl, viewName, null, 18, null), RuntimeUtilsKt.hasUserData(userInfo) ? new ErrorEvent.Usr(userInfo.getId(), userInfo.getName(), userInfo.getEmail(), null, lc9.i0(userInfo.getAdditionalProperties()), 8, null) : null, null, RumEventExtKt.toErrorConnectivity(RumResourceScope.this.networkInfo), null, this.$syntheticsAttribute, null, new ErrorEvent.Os(datadogContext.getDeviceInfo().getOsName(), datadogContext.getDeviceInfo().getOsVersion(), null, datadogContext.getDeviceInfo().getOsMajorVersion(), 4, null), new ErrorEvent.Device(RumEventExtKt.toErrorSchemaType(datadogContext.getDeviceInfo().getDeviceType()), datadogContext.getDeviceInfo().getDeviceName(), datadogContext.getDeviceInfo().getDeviceModel(), datadogContext.getDeviceInfo().getDeviceBrand(), datadogContext.getDeviceInfo().getArchitecture()), new ErrorEvent.Dd(new ErrorEvent.DdSession(plan, RumEventExtKt.toErrorSessionPrecondition(this.$rumContext.getSessionStartReason()), 1, b3 == true ? 1 : 0), new ErrorEvent.Configuration(Float.valueOf(RumResourceScope.this.getSampleRate()), b2 == true ? 1 : 0, 2, b == true ? 1 : 0), null, 4, null), new ErrorEvent.Context(this.$eventAttributes), action, null, error, null, null, 13653008, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumResourceScope$sendResource$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "datadogContext", "Lcom/datadog/android/api/context/DatadogContext;", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05891 extends mj8 implements Function1<DatadogContext, Object> {
        final /* synthetic */ Map<String, Object> $eventAttributes;
        final /* synthetic */ Time $eventTime;
        final /* synthetic */ ResourceTiming $finalTiming;
        final /* synthetic */ ResourceEvent.Graphql $graphql;
        final /* synthetic */ RumResourceKind $kind;
        final /* synthetic */ Number $rulePsr;
        final /* synthetic */ RumContext $rumContext;
        final /* synthetic */ ResourceEvent.ResourceEventSessionType $sessionType;
        final /* synthetic */ Long $size;
        final /* synthetic */ String $spanId;
        final /* synthetic */ Long $statusCode;
        final /* synthetic */ ResourceEvent.Synthetics $syntheticsAttribute;
        final /* synthetic */ String $traceId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05891(RumContext rumContext, Time time, RumResourceKind rumResourceKind, ResourceTiming resourceTiming, Long l, Long l2, ResourceEvent.Graphql graphql, ResourceEvent.ResourceEventSessionType resourceEventSessionType, Map<String, Object> map, String str, String str2, Number number, ResourceEvent.Synthetics synthetics) {
            super(1);
            this.$rumContext = rumContext;
            this.$eventTime = time;
            this.$kind = rumResourceKind;
            this.$finalTiming = resourceTiming;
            this.$statusCode = l;
            this.$size = l2;
            this.$graphql = graphql;
            this.$sessionType = resourceEventSessionType;
            this.$eventAttributes = map;
            this.$spanId = str;
            this.$traceId = str2;
            this.$rulePsr = number;
            this.$syntheticsAttribute = synthetics;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(DatadogContext datadogContext) {
            datadogContext.getClass();
            UserInfo userInfo = datadogContext.getUserInfo();
            FeaturesContextResolver featuresContextResolver = RumResourceScope.this.featuresContextResolver;
            String viewId = this.$rumContext.getViewId();
            if (viewId == null) {
                viewId = "";
            }
            boolean zResolveViewHasReplay = featuresContextResolver.resolveViewHasReplay(datadogContext, viewId);
            long jResolveResourceDuration = RumResourceScope.this.resolveResourceDuration(this.$eventTime);
            long eventTimestamp = RumResourceScope.this.getEventTimestamp();
            String resourceId = RumResourceScope.this.getResourceId();
            ResourceEvent.ResourceType schemaType = RumEventExtKt.toSchemaType(this.$kind);
            String url = RumResourceScope.this.getUrl();
            ResourceEvent.Method resourceMethod = RumEventExtKt.toResourceMethod(RumResourceScope.this.getMethod());
            ResourceTiming resourceTiming = this.$finalTiming;
            ResourceEvent.Plan plan = null;
            byte b = 0;
            byte b2 = 0;
            byte b3 = 0;
            ResourceEvent.Dns dns = resourceTiming != null ? RumEventExtKt.dns(resourceTiming) : null;
            ResourceTiming resourceTiming2 = this.$finalTiming;
            ResourceEvent.Connect connect = resourceTiming2 != null ? RumEventExtKt.connect(resourceTiming2) : null;
            ResourceTiming resourceTiming3 = this.$finalTiming;
            ResourceEvent.Ssl ssl = resourceTiming3 != null ? RumEventExtKt.ssl(resourceTiming3) : null;
            ResourceTiming resourceTiming4 = this.$finalTiming;
            ResourceEvent.FirstByte firstByte = resourceTiming4 != null ? RumEventExtKt.firstByte(resourceTiming4) : null;
            ResourceTiming resourceTiming5 = this.$finalTiming;
            ResourceEvent.Resource resource = new ResourceEvent.Resource(resourceId, schemaType, resourceMethod, url, this.$statusCode, Long.valueOf(jResolveResourceDuration), this.$size, null, null, null, null, null, null, dns, connect, ssl, firstByte, resourceTiming5 != null ? RumEventExtKt.download(resourceTiming5) : null, null, null, RumResourceScope.this.resolveResourceProvider(), this.$graphql, 794496, null);
            String actionId = this.$rumContext.getActionId();
            ResourceEvent.Action action = actionId != null ? new ResourceEvent.Action(u63.Z(actionId)) : null;
            String viewId2 = this.$rumContext.getViewId();
            String str = viewId2 == null ? "" : viewId2;
            String viewName = this.$rumContext.getViewName();
            String viewUrl = this.$rumContext.getViewUrl();
            return new ResourceEvent(eventTimestamp, new ResourceEvent.Application(this.$rumContext.getApplicationId()), datadogContext.getService(), datadogContext.getVersion(), null, null, new ResourceEvent.ResourceEventSession(this.$rumContext.getSessionId(), this.$sessionType, Boolean.valueOf(zResolveViewHasReplay)), RumEventExtKt.tryFromSource(ResourceEvent.ResourceEventSource.INSTANCE, datadogContext.getSource(), RumResourceScope.this.getSdkCore().getInternalLogger()), new ResourceEvent.ResourceEventView(str, null, viewUrl == null ? "" : viewUrl, viewName, 2, null), RuntimeUtilsKt.hasUserData(userInfo) ? new ResourceEvent.Usr(userInfo.getId(), userInfo.getName(), userInfo.getEmail(), null, lc9.i0(userInfo.getAdditionalProperties()), 8, null) : null, null, RumEventExtKt.toResourceConnectivity(RumResourceScope.this.networkInfo), null, this.$syntheticsAttribute, null, new ResourceEvent.Os(datadogContext.getDeviceInfo().getOsName(), datadogContext.getDeviceInfo().getOsVersion(), null, datadogContext.getDeviceInfo().getOsMajorVersion(), 4, null), new ResourceEvent.Device(RumEventExtKt.toResourceSchemaType(datadogContext.getDeviceInfo().getDeviceType()), datadogContext.getDeviceInfo().getDeviceName(), datadogContext.getDeviceInfo().getDeviceModel(), datadogContext.getDeviceInfo().getDeviceBrand(), datadogContext.getDeviceInfo().getArchitecture()), new ResourceEvent.Dd(new ResourceEvent.DdSession(plan, RumEventExtKt.toResourceSessionPrecondition(this.$rumContext.getSessionStartReason()), 1, b3 == true ? 1 : 0), new ResourceEvent.Configuration(Float.valueOf(RumResourceScope.this.getSampleRate()), b2 == true ? 1 : 0, 2, b == true ? 1 : 0), null, this.$spanId, this.$traceId, this.$rulePsr, null, 68, null), new ResourceEvent.Context(this.$eventAttributes), action, null, resource, 1070128, null);
        }
    }

    public RumResourceScope(RumScope rumScope, InternalSdkCore internalSdkCore, String str, RumResourceMethod rumResourceMethod, Object obj, Time time, Map<String, ? extends Object> map, long j, FirstPartyHostHeaderTypeResolver firstPartyHostHeaderTypeResolver, FeaturesContextResolver featuresContextResolver, float f, NetworkSettledMetricResolver networkSettledMetricResolver) {
        rumScope.getClass();
        internalSdkCore.getClass();
        str.getClass();
        rumResourceMethod.getClass();
        obj.getClass();
        time.getClass();
        map.getClass();
        firstPartyHostHeaderTypeResolver.getClass();
        featuresContextResolver.getClass();
        networkSettledMetricResolver.getClass();
        this.parentScope = rumScope;
        this.sdkCore = internalSdkCore;
        this.url = str;
        this.method = rumResourceMethod;
        this.key = obj;
        this.firstPartyHostHeaderTypeResolver = firstPartyHostHeaderTypeResolver;
        this.featuresContextResolver = featuresContextResolver;
        this.sampleRate = f;
        this.networkSettledMetricResolver = networkSettledMetricResolver;
        String strH = t40.h();
        this.resourceId = strH;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(GlobalRumMonitor.get(internalSdkCore).getAttributes());
        this.attributes = linkedHashMap;
        this.initialContext = rumScope.getRumContext();
        this.eventTimestamp = time.getTimestamp() + j;
        this.startedNanos = time.getNanoTime();
        this.networkInfo = internalSdkCore.getNetworkInfo();
        this.kind = RumResourceKind.UNKNOWN;
        networkSettledMetricResolver.resourceWasStarted(new InternalResourceContext(strH, time.getNanoTime()));
    }

    private final void onAddResourceTiming(RumRawEvent.AddResourceTiming event, DataWriter<Object> writer) {
        if (wl7.b(this.key, event.getKey())) {
            this.timing = event.getTiming();
            if (!this.stopped || this.sent) {
                return;
            }
            sendResource(this.kind, this.statusCode, this.size, event.getEventTime(), writer);
        }
    }

    private final void onStopResource(RumRawEvent.StopResource event, DataWriter<Object> writer) {
        if (wl7.b(this.key, event.getKey())) {
            this.stopped = true;
            this.attributes.putAll(event.getAttributes());
            this.kind = event.getKind();
            this.statusCode = event.getStatusCode();
            this.size = event.getSize();
            if (this.waitForTiming && this.timing == null) {
                return;
            }
            sendResource(this.kind, event.getStatusCode(), event.getSize(), event.getEventTime(), writer);
        }
    }

    private final void onStopResourceWithError(RumRawEvent.StopResourceWithError event, DataWriter<Object> writer) {
        if (wl7.b(this.key, event.getKey())) {
            this.attributes.putAll(event.getAttributes());
            sendError(event.getMessage(), event.getSource(), event.getStatusCode(), ThrowableExtKt.loggableStackTrace(event.getThrowable()), event.getThrowable().getClass().getCanonicalName(), ErrorEvent.Category.EXCEPTION, writer, event.getEventTime().getNanoTime());
        }
    }

    private final void onStopResourceWithStackTrace(RumRawEvent.StopResourceWithStackTrace event, DataWriter<Object> writer) {
        if (wl7.b(this.key, event.getKey())) {
            this.attributes.putAll(event.getAttributes());
            sendError(event.getMessage(), event.getSource(), event.getStatusCode(), event.getStackTrace(), event.getErrorType(), event.getStackTrace().length() > 0 ? ErrorEvent.Category.EXCEPTION : null, writer, event.getEventTime().getNanoTime());
        }
    }

    private final String resolveDomain(String url) {
        try {
            String host = new URL(url).getHost();
            host.getClass();
            return host;
        } catch (MalformedURLException unused) {
            return url;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ErrorEvent.Provider resolveErrorProvider() {
        if (!this.firstPartyHostHeaderTypeResolver.isFirstPartyUrl(this.url)) {
            return null;
        }
        return new ErrorEvent.Provider(resolveDomain(this.url), null, ErrorEvent.ProviderType.FIRST_PARTY, 2, null);
    }

    private final ResourceEvent.Graphql resolveGraphQLAttributes(String operationType, String operationName, String payload, String variables) {
        ResourceEvent.OperationType operationType2;
        if (operationType == null || (operationType2 = RumEventExtKt.toOperationType(operationType, this.sdkCore.getInternalLogger())) == null) {
            return null;
        }
        return new ResourceEvent.Graphql(operationType2, operationName, payload, variables);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long resolveResourceDuration(Time eventTime) {
        long nanoTime = eventTime.getNanoTime() - this.startedNanos;
        if (nanoTime > 0) {
            return nanoTime;
        }
        InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) new AnonymousClass1(), (Throwable) null, false, (Map) null, 56, (Object) null);
        return 1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ResourceEvent.Provider resolveResourceProvider() {
        if (!this.firstPartyHostHeaderTypeResolver.isFirstPartyUrl(this.url)) {
            return null;
        }
        return new ResourceEvent.Provider(resolveDomain(this.url), null, ResourceEvent.ProviderType.FIRST_PARTY, 2, null);
    }

    private final void sendError(String message, RumErrorSource source, Long statusCode, String stackTrace, String errorType, ErrorEvent.Category errorCategory, DataWriter<Object> writer, long resourceStopTimestampInNanos) {
        String syntheticsResultId;
        this.attributes.putAll(GlobalRumMonitor.get(this.sdkCore).getAttributes());
        Object objRemove = this.attributes.remove("_dd.error.fingerprint");
        String str = objRemove instanceof String ? (String) objRemove : null;
        RumContext initialContext = getRumContext();
        LinkedHashMap linkedHashMapI0 = lc9.i0(this.attributes);
        String syntheticsTestId = initialContext.getSyntheticsTestId();
        ErrorEvent.Synthetics synthetics = (syntheticsTestId == null || zve.U(syntheticsTestId) || (syntheticsResultId = initialContext.getSyntheticsResultId()) == null || zve.U(syntheticsResultId)) ? null : new ErrorEvent.Synthetics(initialContext.getSyntheticsTestId(), initialContext.getSyntheticsResultId(), null, 4, null);
        SdkCoreExtKt.newRumEventWriteOperation$default(this.sdkCore, writer, null, new C05881(initialContext, source, statusCode, message, stackTrace, str, errorType, errorCategory, synthetics == null ? ErrorEvent.ErrorEventSessionType.USER : ErrorEvent.ErrorEventSessionType.SYNTHETICS, linkedHashMapI0, synthetics), 2, null).onError(new AnonymousClass2(initialContext, this, resourceStopTimestampInNanos)).onSuccess(new AnonymousClass3(initialContext, this, resourceStopTimestampInNanos)).submit();
        this.sent = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [com.datadog.android.rum.model.ResourceEvent$Synthetics] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v24 */
    private final void sendResource(RumResourceKind kind, Long statusCode, Long size, Time eventTime, DataWriter<Object> writer) {
        String str;
        Number number;
        String syntheticsResultId;
        this.attributes.putAll(GlobalRumMonitor.get(this.sdkCore).getAttributes());
        Object objRemove = this.attributes.remove(RumAttributes.TRACE_ID);
        String string = objRemove != null ? objRemove.toString() : null;
        Object objRemove2 = this.attributes.remove(RumAttributes.SPAN_ID);
        String string2 = objRemove2 != null ? objRemove2.toString() : null;
        Object objRemove3 = this.attributes.remove(RumAttributes.RULE_PSR);
        if (objRemove3 instanceof Number) {
            number = (Number) objRemove3;
            str = null;
        } else {
            str = null;
            number = null;
        }
        RumContext initialContext = getRumContext();
        String syntheticsTestId = initialContext.getSyntheticsTestId();
        ?? synthetics = (syntheticsTestId == null || zve.U(syntheticsTestId) || (syntheticsResultId = initialContext.getSyntheticsResultId()) == null || zve.U(syntheticsResultId)) ? str : new ResourceEvent.Synthetics(initialContext.getSyntheticsTestId(), initialContext.getSyntheticsResultId(), null, 4, null);
        ResourceEvent.ResourceEventSessionType resourceEventSessionType = synthetics == 0 ? ResourceEvent.ResourceEventSessionType.USER : ResourceEvent.ResourceEventSessionType.SYNTHETICS;
        ResourceTiming resourceTimingExtractResourceTiming = this.timing;
        if (resourceTimingExtractResourceTiming == null) {
            Object objRemove4 = this.attributes.remove(RumAttributes.RESOURCE_TIMINGS);
            resourceTimingExtractResourceTiming = ExternalResourceTimingsKt.extractResourceTiming(objRemove4 instanceof Map ? (Map) objRemove4 : str);
        }
        ResourceTiming resourceTiming = resourceTimingExtractResourceTiming;
        Object objRemove5 = this.attributes.remove(RumAttributes.GRAPHQL_OPERATION_TYPE);
        String str2 = objRemove5 instanceof String ? (String) objRemove5 : str;
        Object objRemove6 = this.attributes.remove(RumAttributes.GRAPHQL_OPERATION_NAME);
        String str3 = objRemove6 instanceof String ? (String) objRemove6 : str;
        Object objRemove7 = this.attributes.remove(RumAttributes.GRAPHQL_PAYLOAD);
        String str4 = objRemove7 instanceof String ? (String) objRemove7 : str;
        Object objRemove8 = this.attributes.remove(RumAttributes.GRAPHQL_VARIABLES);
        if (objRemove8 instanceof String) {
            str = (String) objRemove8;
        }
        SdkCoreExtKt.newRumEventWriteOperation$default(this.sdkCore, writer, null, new C05891(initialContext, eventTime, kind, resourceTiming, statusCode, size, resolveGraphQLAttributes(str2, str3, str4, str), resourceEventSessionType, lc9.i0(this.attributes), string2, string, number, synthetics), 2, null).onError(new C05902(initialContext, this, eventTime)).onSuccess(new C05913(initialContext, this, eventTime)).submit();
        this.sent = true;
    }

    public final Map<String, Object> getAttributes$dd_sdk_android_rum_release() {
        return this.attributes;
    }

    /* JADX INFO: renamed from: getEventTimestamp$dd_sdk_android_rum_release, reason: from getter */
    public final long getEventTimestamp() {
        return this.eventTimestamp;
    }

    /* JADX INFO: renamed from: getFirstPartyHostHeaderTypeResolver$dd_sdk_android_rum_release, reason: from getter */
    public final FirstPartyHostHeaderTypeResolver getFirstPartyHostHeaderTypeResolver() {
        return this.firstPartyHostHeaderTypeResolver;
    }

    /* JADX INFO: renamed from: getKey$dd_sdk_android_rum_release, reason: from getter */
    public final Object getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: getMethod$dd_sdk_android_rum_release, reason: from getter */
    public final RumResourceMethod getMethod() {
        return this.method;
    }

    /* JADX INFO: renamed from: getNetworkSettledMetricResolver$dd_sdk_android_rum_release, reason: from getter */
    public final NetworkSettledMetricResolver getNetworkSettledMetricResolver() {
        return this.networkSettledMetricResolver;
    }

    /* JADX INFO: renamed from: getParentScope$dd_sdk_android_rum_release, reason: from getter */
    public final RumScope getParentScope() {
        return this.parentScope;
    }

    /* JADX INFO: renamed from: getResourceId$dd_sdk_android_rum_release, reason: from getter */
    public final String getResourceId() {
        return this.resourceId;
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public RumContext getRumContext() {
        return this.initialContext;
    }

    /* JADX INFO: renamed from: getSampleRate$dd_sdk_android_rum_release, reason: from getter */
    public final float getSampleRate() {
        return this.sampleRate;
    }

    /* JADX INFO: renamed from: getSdkCore$dd_sdk_android_rum_release, reason: from getter */
    public final InternalSdkCore getSdkCore() {
        return this.sdkCore;
    }

    /* JADX INFO: renamed from: getStopped$dd_sdk_android_rum_release, reason: from getter */
    public final boolean getStopped() {
        return this.stopped;
    }

    /* JADX INFO: renamed from: getUrl$dd_sdk_android_rum_release, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public RumScope handleEvent(RumRawEvent event, DataWriter<Object> writer) {
        event.getClass();
        writer.getClass();
        if (event instanceof RumRawEvent.WaitForResourceTiming) {
            if (wl7.b(this.key, ((RumRawEvent.WaitForResourceTiming) event).getKey())) {
                this.waitForTiming = true;
            }
        } else if (event instanceof RumRawEvent.AddResourceTiming) {
            onAddResourceTiming((RumRawEvent.AddResourceTiming) event, writer);
        } else if (event instanceof RumRawEvent.StopResource) {
            onStopResource((RumRawEvent.StopResource) event, writer);
        } else if (event instanceof RumRawEvent.StopResourceWithError) {
            onStopResourceWithError((RumRawEvent.StopResourceWithError) event, writer);
        } else if (event instanceof RumRawEvent.StopResourceWithStackTrace) {
            onStopResourceWithStackTrace((RumRawEvent.StopResourceWithStackTrace) event, writer);
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

    public final void setStopped$dd_sdk_android_rum_release(boolean z) {
        this.stopped = z;
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JF\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumResourceScope$Companion;", "", "()V", "NEGATIVE_DURATION_WARNING_MESSAGE", "", "fromEvent", "Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "parentScope", "sdkCore", "Lcom/datadog/android/core/InternalSdkCore;", "event", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartResource;", "firstPartyHostHeaderTypeResolver", "Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "timestampOffset", "", "featuresContextResolver", "Lcom/datadog/android/rum/internal/FeaturesContextResolver;", "sampleRate", "", "networkSettledMetricResolver", "Lcom/datadog/android/rum/internal/metric/networksettled/NetworkSettledMetricResolver;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RumScope fromEvent(RumScope parentScope, InternalSdkCore sdkCore, RumRawEvent.StartResource event, FirstPartyHostHeaderTypeResolver firstPartyHostHeaderTypeResolver, long timestampOffset, FeaturesContextResolver featuresContextResolver, float sampleRate, NetworkSettledMetricResolver networkSettledMetricResolver) {
            parentScope.getClass();
            sdkCore.getClass();
            event.getClass();
            firstPartyHostHeaderTypeResolver.getClass();
            featuresContextResolver.getClass();
            networkSettledMetricResolver.getClass();
            return new RumResourceScope(parentScope, sdkCore, event.getUrl(), event.getMethod(), event.getKey(), event.getEventTime(), event.getAttributes(), timestampOffset, firstPartyHostHeaderTypeResolver, featuresContextResolver, sampleRate, networkSettledMetricResolver);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumResourceScope$sendError$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/datadog/android/rum/internal/monitor/AdvancedRumMonitor;", "it", "Lj6g;", "invoke", "(Lcom/datadog/android/rum/internal/monitor/AdvancedRumMonitor;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class AnonymousClass2 extends mj8 implements Function1<AdvancedRumMonitor, j6g> {
        final /* synthetic */ long $resourceStopTimestampInNanos;
        final /* synthetic */ RumContext $rumContext;
        final /* synthetic */ RumResourceScope this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(RumContext rumContext, RumResourceScope rumResourceScope, long j) {
            super(1);
            this.$rumContext = rumContext;
            this.this$0 = rumResourceScope;
            this.$resourceStopTimestampInNanos = j;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AdvancedRumMonitor advancedRumMonitor) {
            advancedRumMonitor.getClass();
            String viewId = this.$rumContext.getViewId();
            if (viewId == null) {
                viewId = "";
            }
            advancedRumMonitor.eventDropped(viewId, new StorageEvent.Error(this.this$0.getResourceId(), Long.valueOf(this.$resourceStopTimestampInNanos)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ j6g invoke(AdvancedRumMonitor advancedRumMonitor) {
            invoke2(advancedRumMonitor);
            return j6g.a;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumResourceScope$sendError$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/datadog/android/rum/internal/monitor/AdvancedRumMonitor;", "it", "Lj6g;", "invoke", "(Lcom/datadog/android/rum/internal/monitor/AdvancedRumMonitor;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class AnonymousClass3 extends mj8 implements Function1<AdvancedRumMonitor, j6g> {
        final /* synthetic */ long $resourceStopTimestampInNanos;
        final /* synthetic */ RumContext $rumContext;
        final /* synthetic */ RumResourceScope this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(RumContext rumContext, RumResourceScope rumResourceScope, long j) {
            super(1);
            this.$rumContext = rumContext;
            this.this$0 = rumResourceScope;
            this.$resourceStopTimestampInNanos = j;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AdvancedRumMonitor advancedRumMonitor) {
            advancedRumMonitor.getClass();
            String viewId = this.$rumContext.getViewId();
            if (viewId == null) {
                viewId = "";
            }
            advancedRumMonitor.eventSent(viewId, new StorageEvent.Error(this.this$0.getResourceId(), Long.valueOf(this.$resourceStopTimestampInNanos)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ j6g invoke(AdvancedRumMonitor advancedRumMonitor) {
            invoke2(advancedRumMonitor);
            return j6g.a;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumResourceScope$sendResource$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/datadog/android/rum/internal/monitor/AdvancedRumMonitor;", "it", "Lj6g;", "invoke", "(Lcom/datadog/android/rum/internal/monitor/AdvancedRumMonitor;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class C05902 extends mj8 implements Function1<AdvancedRumMonitor, j6g> {
        final /* synthetic */ Time $eventTime;
        final /* synthetic */ RumContext $rumContext;
        final /* synthetic */ RumResourceScope this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05902(RumContext rumContext, RumResourceScope rumResourceScope, Time time) {
            super(1);
            this.$rumContext = rumContext;
            this.this$0 = rumResourceScope;
            this.$eventTime = time;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AdvancedRumMonitor advancedRumMonitor) {
            advancedRumMonitor.getClass();
            String viewId = this.$rumContext.getViewId();
            if (viewId == null) {
                viewId = "";
            }
            advancedRumMonitor.eventDropped(viewId, new StorageEvent.Resource(this.this$0.getResourceId(), this.$eventTime.getNanoTime()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ j6g invoke(AdvancedRumMonitor advancedRumMonitor) {
            invoke2(advancedRumMonitor);
            return j6g.a;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumResourceScope$sendResource$3, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/datadog/android/rum/internal/monitor/AdvancedRumMonitor;", "it", "Lj6g;", "invoke", "(Lcom/datadog/android/rum/internal/monitor/AdvancedRumMonitor;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class C05913 extends mj8 implements Function1<AdvancedRumMonitor, j6g> {
        final /* synthetic */ Time $eventTime;
        final /* synthetic */ RumContext $rumContext;
        final /* synthetic */ RumResourceScope this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05913(RumContext rumContext, RumResourceScope rumResourceScope, Time time) {
            super(1);
            this.$rumContext = rumContext;
            this.this$0 = rumResourceScope;
            this.$eventTime = time;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AdvancedRumMonitor advancedRumMonitor) {
            advancedRumMonitor.getClass();
            String viewId = this.$rumContext.getViewId();
            if (viewId == null) {
                viewId = "";
            }
            advancedRumMonitor.eventSent(viewId, new StorageEvent.Resource(this.this$0.getResourceId(), this.$eventTime.getNanoTime()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ j6g invoke(AdvancedRumMonitor advancedRumMonitor) {
            invoke2(advancedRumMonitor);
            return j6g.a;
        }
    }
}
