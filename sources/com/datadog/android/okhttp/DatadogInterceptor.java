package com.datadog.android.okhttp;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.SdkCore;
import com.datadog.android.api.feature.FeatureSdkCore;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.sampling.Sampler;
import com.datadog.android.okhttp.internal.rum.NoOpRumResourceAttributesProvider;
import com.datadog.android.okhttp.internal.rum.RequestExtKt;
import com.datadog.android.okhttp.internal.utils.SpanContextExtKt;
import com.datadog.android.okhttp.trace.DeterministicTraceSampler;
import com.datadog.android.okhttp.trace.NoOpTracedRequestListener;
import com.datadog.android.okhttp.trace.TracedRequestListener;
import com.datadog.android.okhttp.trace.TracingInterceptor;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumAttributes;
import com.datadog.android.rum.RumErrorSource;
import com.datadog.android.rum.RumMonitor;
import com.datadog.android.rum.RumResourceAttributesProvider;
import com.datadog.android.rum.RumResourceKind;
import com.datadog.android.rum.RumResourceMethod;
import com.datadog.android.rum.internal.RumFeature;
import com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor;
import com.datadog.android.rum.resource.ResourceId;
import com.datadog.android.trace.AndroidTracer;
import com.datadog.android.trace.TracingHeaderType;
import defpackage.bs4;
import defpackage.doe;
import defpackage.eoe;
import defpackage.gu5;
import defpackage.kc9;
import defpackage.l5;
import defpackage.lc9;
import defpackage.mj8;
import defpackage.ppf;
import defpackage.sy3;
import defpackage.t92;
import defpackage.u63;
import defpackage.ut0;
import defpackage.z92;
import defpackage.zve;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 J2\u00020\u0001:\u0002KJB{\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u001e\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0004\b\u0017\u0010\u0018BS\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0017\u0010\u001aBG\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0017\u0010\u001dB9\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0017\u0010\u001eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J=\u0010-\u001a\u00020,2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010\r2\b\u0010)\u001a\u0004\u0018\u00010!2\b\u0010+\u001a\u0004\u0018\u00010*H\u0014¢\u0006\u0004\b-\u0010.J\u000f\u00101\u001a\u00020\u0011H\u0010¢\u0006\u0004\b/\u00100J\u0017\u00105\u001a\u00020,2\u0006\u0010%\u001a\u000202H\u0010¢\u0006\u0004\b3\u00104J9\u00107\u001a\u00020,2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020!2\b\u0010(\u001a\u0004\u0018\u00010\r2\u0006\u00106\u001a\u00020\u0011H\u0002¢\u0006\u0004\b7\u00108J'\u00109\u001a\u00020,2\u0006\u0010%\u001a\u00020\u00142\u0006\u0010'\u001a\u00020&2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b9\u0010:J!\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010)\u001a\u00020!2\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b>\u0010?J\u001f\u0010B\u001a\u00020A2\u0006\u0010@\u001a\u00020\u00022\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\bB\u0010CJ\u0015\u0010E\u001a\u0004\u0018\u00010=*\u00020DH\u0002¢\u0006\u0004\bE\u0010FR\u001a\u0010\u000b\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010G\u001a\u0004\bH\u0010I¨\u0006L"}, d2 = {"Lcom/datadog/android/okhttp/DatadogInterceptor;", "Lcom/datadog/android/okhttp/trace/TracingInterceptor;", "", "sdkInstanceName", "", "", "Lcom/datadog/android/trace/TracingHeaderType;", "tracedHosts", "Lcom/datadog/android/okhttp/trace/TracedRequestListener;", "tracedRequestListener", "Lcom/datadog/android/rum/RumResourceAttributesProvider;", "rumResourceAttributesProvider", "Lcom/datadog/android/core/sampling/Sampler;", "Ldoe;", "traceSampler", "Lcom/datadog/android/okhttp/TraceContextInjection;", "traceContextInjection", "", "redacted404ResourceName", "Lkotlin/Function2;", "Lcom/datadog/android/api/SdkCore;", "Lppf;", "localTracerFactory", "<init>", "(Ljava/lang/String;Ljava/util/Map;Lcom/datadog/android/okhttp/trace/TracedRequestListener;Lcom/datadog/android/rum/RumResourceAttributesProvider;Lcom/datadog/android/core/sampling/Sampler;Lcom/datadog/android/okhttp/TraceContextInjection;ZLkotlin/jvm/functions/Function2;)V", "firstPartyHostsWithHeaderType", "(Ljava/lang/String;Ljava/util/Map;Lcom/datadog/android/okhttp/trace/TracedRequestListener;Lcom/datadog/android/rum/RumResourceAttributesProvider;Lcom/datadog/android/core/sampling/Sampler;)V", "", "firstPartyHosts", "(Ljava/lang/String;Ljava/util/List;Lcom/datadog/android/okhttp/trace/TracedRequestListener;Lcom/datadog/android/rum/RumResourceAttributesProvider;Lcom/datadog/android/core/sampling/Sampler;)V", "(Ljava/lang/String;Lcom/datadog/android/okhttp/trace/TracedRequestListener;Lcom/datadog/android/rum/RumResourceAttributesProvider;Lcom/datadog/android/core/sampling/Sampler;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "Lokhttp3/Request;", "request", "span", "response", "", RumFeature.EVENT_THROWABLE_PROPERTY, "Lj6g;", "onRequestIntercepted", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Lokhttp3/Request;Ldoe;Lokhttp3/Response;Ljava/lang/Throwable;)V", "canSendSpan$dd_sdk_android_okhttp_release", "()Z", "canSendSpan", "Lcom/datadog/android/core/InternalSdkCore;", "onSdkInstanceReady$dd_sdk_android_okhttp_release", "(Lcom/datadog/android/core/InternalSdkCore;)V", "onSdkInstanceReady", "isSampled", "handleResponse", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Lokhttp3/Request;Lokhttp3/Response;Ldoe;Z)V", "handleThrowable", "(Lcom/datadog/android/api/SdkCore;Lokhttp3/Request;Ljava/lang/Throwable;)V", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "", "getBodyLength", "(Lokhttp3/Response;Lcom/datadog/android/api/InternalLogger;)Ljava/lang/Long;", "method", "Lcom/datadog/android/rum/RumResourceMethod;", "toHttpMethod", "(Ljava/lang/String;Lcom/datadog/android/api/InternalLogger;)Lcom/datadog/android/rum/RumResourceMethod;", "Lokhttp3/ResponseBody;", "contentLengthOrNull", "(Lokhttp3/ResponseBody;)Ljava/lang/Long;", "Lcom/datadog/android/rum/RumResourceAttributesProvider;", "getRumResourceAttributesProvider$dd_sdk_android_okhttp_release", "()Lcom/datadog/android/rum/RumResourceAttributesProvider;", "Companion", "Builder", "dd-sdk-android-okhttp_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public class DatadogInterceptor extends TracingInterceptor {
    private static final float ALL_IN_SAMPLE_RATE = 100.0f;
    public static final String ERROR_MSG_FORMAT = "OkHttp request error %s %s";
    public static final String ERROR_NO_RESPONSE = "The request ended with no response nor any exception.";
    public static final String ERROR_PEEK_BODY = "Unable to peek response body.";
    private static final long MAX_BODY_PEEK = 33554432;
    public static final String ORIGIN_RUM = "rum";
    public static final String UNSUPPORTED_HTTP_METHOD = "Unsupported HTTP method %s reported by OkHttp instrumentation, using GET instead";
    public static final String WARN_RUM_DISABLED = "You set up a DatadogInterceptor for %s, but RUM features are disabled. Make sure you initialized the Datadog SDK with a valid Application Id, and that RUM features are enabled.";
    public static final String WEBSOCKET_ACCEPT_HEADER = "Sec-WebSocket-Accept";
    private static final float ZERO_SAMPLE_RATE = 0.0f;
    private final RumResourceAttributesProvider rumResourceAttributesProvider;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Set<String> STREAM_CONTENT_TYPES = ut0.I0(new String[]{"text/event-stream", "application/grpc", "application/grpc+proto", "application/grpc+json"});

    /* JADX INFO: renamed from: com.datadog.android.okhttp.DatadogInterceptor$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/datadog/android/api/SdkCore;", "sdkCore", "", "Lcom/datadog/android/trace/TracingHeaderType;", "tracingHeaderTypes", "Lppf;", "invoke", "(Lcom/datadog/android/api/SdkCore;Ljava/util/Set;)Lppf;", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class AnonymousClass1 extends mj8 implements Function2<SdkCore, Set<? extends TracingHeaderType>, ppf> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final ppf invoke(SdkCore sdkCore, Set<? extends TracingHeaderType> set) {
            sdkCore.getClass();
            set.getClass();
            return new AndroidTracer.Builder(sdkCore).setTracingHeaderTypes(set).build();
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.okhttp.DatadogInterceptor$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/datadog/android/api/SdkCore;", "sdkCore", "", "Lcom/datadog/android/trace/TracingHeaderType;", "tracingHeaderTypes", "Lppf;", "invoke", "(Lcom/datadog/android/api/SdkCore;Ljava/util/Set;)Lppf;", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class AnonymousClass3 extends mj8 implements Function2<SdkCore, Set<? extends TracingHeaderType>, ppf> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final ppf invoke(SdkCore sdkCore, Set<? extends TracingHeaderType> set) {
            sdkCore.getClass();
            set.getClass();
            return new AndroidTracer.Builder(sdkCore).setTracingHeaderTypes(set).build();
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.okhttp.DatadogInterceptor$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/datadog/android/api/SdkCore;", "sdkCore", "", "Lcom/datadog/android/trace/TracingHeaderType;", "tracingHeaderTypes", "Lppf;", "invoke", "(Lcom/datadog/android/api/SdkCore;Ljava/util/Set;)Lppf;", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class AnonymousClass4 extends mj8 implements Function2<SdkCore, Set<? extends TracingHeaderType>, ppf> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final ppf invoke(SdkCore sdkCore, Set<? extends TracingHeaderType> set) {
            sdkCore.getClass();
            set.getClass();
            return new AndroidTracer.Builder(sdkCore).setTracingHeaderTypes(set).build();
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.okhttp.DatadogInterceptor$intercept$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05711 extends mj8 implements gu5<String> {
        final /* synthetic */ String $prefix;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05711(String str) {
            super(0);
            this.$prefix = str;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, DatadogInterceptor.WARN_RUM_DISABLED, Arrays.copyOf(new Object[]{this.$prefix}, 1));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.okhttp.DatadogInterceptor$toHttpMethod$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05721 extends mj8 implements gu5<String> {
        final /* synthetic */ String $method;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05721(String str) {
            super(0);
            this.$method = str;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, DatadogInterceptor.UNSUPPORTED_HTTP_METHOD, Arrays.copyOf(new Object[]{this.$method}, 1));
        }
    }

    @sy3
    public DatadogInterceptor(String str, List<String> list, TracedRequestListener tracedRequestListener, RumResourceAttributesProvider rumResourceAttributesProvider, Sampler<doe> sampler) {
        list.getClass();
        tracedRequestListener.getClass();
        rumResourceAttributesProvider.getClass();
        sampler.getClass();
        List<String> list2 = list;
        int iV = kc9.V(t92.r0(list2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iV < 16 ? 16 : iV);
        for (Object obj : list2) {
            linkedHashMap.put(obj, ut0.I0(new TracingHeaderType[]{TracingHeaderType.DATADOG, TracingHeaderType.TRACECONTEXT}));
        }
        this(str, linkedHashMap, tracedRequestListener, rumResourceAttributesProvider, sampler, TraceContextInjection.All, true, AnonymousClass3.INSTANCE);
    }

    private final Long contentLengthOrNull(ResponseBody responseBody) {
        long d = responseBody.getD();
        if (d <= 0) {
            return null;
        }
        return Long.valueOf(d);
    }

    private final Long getBodyLength(Response response, InternalLogger internalLogger) {
        String str;
        MediaType c;
        try {
            ResponseBody responseBody = response.V;
            if (responseBody == null || (c = responseBody.getC()) == null) {
                str = null;
            } else {
                str = c.b + "/" + c.c;
            }
            boolean zI0 = z92.I0(STREAM_CONTENT_TYPES, str);
            String strA = response.f.a(WEBSOCKET_ACCEPT_HEADER);
            if (strA == null) {
                strA = null;
            }
            boolean z = strA == null || zve.U(strA);
            if (responseBody != null && !zI0 && z) {
                Long lContentLengthOrNull = contentLengthOrNull(responseBody);
                return lContentLengthOrNull == null ? contentLengthOrNull(response.s()) : lContentLengthOrNull;
            }
        } catch (IOException e) {
            InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, (gu5) C05691.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
        } catch (IllegalArgumentException e2) {
            InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) C05703.INSTANCE, (Throwable) e2, false, (Map) null, 48, (Object) null);
        } catch (IllegalStateException e3) {
            InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, (gu5) AnonymousClass2.INSTANCE, (Throwable) e3, false, (Map) null, 48, (Object) null);
        }
        return null;
    }

    private final void handleResponse(FeatureSdkCore sdkCore, Request request, Response response, doe span, boolean isSampled) {
        Map mapA0;
        ResourceId resourceIdBuildResourceId = RequestExtKt.buildResourceId(request, false);
        int i = response.d;
        String strA = response.f.a(TracingInterceptor.HEADER_CT);
        if (strA == null) {
            strA = null;
        }
        RumResourceKind rumResourceKindFromMimeType = strA == null ? RumResourceKind.NATIVE : RumResourceKind.INSTANCE.fromMimeType(strA);
        if (!isSampled || span == null) {
            mapA0 = bs4.a;
        } else {
            eoe eoeVarF = span.f();
            eoeVarF.getClass();
            Pair pair = new Pair(RumAttributes.TRACE_ID, SpanContextExtKt.traceIdAsHexString(eoeVarF));
            Pair pair2 = new Pair(RumAttributes.SPAN_ID, span.f().b());
            Float sampleRate = getTraceSampler$dd_sdk_android_okhttp_release().getSampleRate();
            mapA0 = lc9.a0(pair, pair2, new Pair(RumAttributes.RULE_PSR, Float.valueOf((sampleRate != null ? sampleRate.floatValue() : 0.0f) / 100.0f)));
        }
        RumMonitor rumMonitor = GlobalRumMonitor.get(sdkCore);
        AdvancedNetworkRumMonitor advancedNetworkRumMonitor = rumMonitor instanceof AdvancedNetworkRumMonitor ? (AdvancedNetworkRumMonitor) rumMonitor : null;
        if (advancedNetworkRumMonitor != null) {
            advancedNetworkRumMonitor.stopResource(resourceIdBuildResourceId, Integer.valueOf(i), getBodyLength(response, sdkCore.getInternalLogger()), rumResourceKindFromMimeType, lc9.c0(mapA0, this.rumResourceAttributesProvider.onProvideAttributes(request, response, null)));
        }
    }

    private final void handleThrowable(SdkCore sdkCore, Request request, Throwable throwable) {
        ResourceId resourceIdBuildResourceId = RequestExtKt.buildResourceId(request, false);
        String str = request.b;
        String str2 = request.a.i;
        RumMonitor rumMonitor = GlobalRumMonitor.get(sdkCore);
        AdvancedNetworkRumMonitor advancedNetworkRumMonitor = rumMonitor instanceof AdvancedNetworkRumMonitor ? (AdvancedNetworkRumMonitor) rumMonitor : null;
        if (advancedNetworkRumMonitor != null) {
            advancedNetworkRumMonitor.stopResourceWithError(resourceIdBuildResourceId, (Integer) null, String.format(Locale.US, ERROR_MSG_FORMAT, Arrays.copyOf(new Object[]{str, str2}, 2)), RumErrorSource.NETWORK, throwable, (Map<String, ? extends Object>) this.rumResourceAttributesProvider.onProvideAttributes(request, null, throwable));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final RumResourceMethod toHttpMethod(String method, InternalLogger internalLogger) {
        Locale locale = Locale.US;
        locale.getClass();
        String upperCase = method.toUpperCase(locale);
        upperCase.getClass();
        switch (upperCase.hashCode()) {
            case -531492226:
                if (upperCase.equals("OPTIONS")) {
                    return RumResourceMethod.OPTIONS;
                }
                break;
            case 70454:
                if (upperCase.equals("GET")) {
                    return RumResourceMethod.GET;
                }
                break;
            case 79599:
                if (upperCase.equals("PUT")) {
                    return RumResourceMethod.PUT;
                }
                break;
            case 2213344:
                if (upperCase.equals("HEAD")) {
                    return RumResourceMethod.HEAD;
                }
                break;
            case 2461856:
                if (upperCase.equals("POST")) {
                    return RumResourceMethod.POST;
                }
                break;
            case 75900968:
                if (upperCase.equals("PATCH")) {
                    return RumResourceMethod.PATCH;
                }
                break;
            case 80083237:
                if (upperCase.equals("TRACE")) {
                    return RumResourceMethod.TRACE;
                }
                break;
            case 1669334218:
                if (upperCase.equals("CONNECT")) {
                    return RumResourceMethod.CONNECT;
                }
                break;
            case 2012838315:
                if (upperCase.equals("DELETE")) {
                    return RumResourceMethod.DELETE;
                }
                break;
        }
        InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.WARN, u63.a0(InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY), (gu5) new C05721(method), (Throwable) null, false, (Map) null, 56, (Object) null);
        return RumResourceMethod.GET;
    }

    @Override // com.datadog.android.okhttp.trace.TracingInterceptor
    public boolean canSendSpan$dd_sdk_android_okhttp_release() {
        SdkCore sdkCore = getSdkCoreReference().get();
        FeatureSdkCore featureSdkCore = sdkCore instanceof FeatureSdkCore ? (FeatureSdkCore) sdkCore : null;
        return (featureSdkCore != null ? featureSdkCore.getFeature("rum") : null) == null;
    }

    /* JADX INFO: renamed from: getRumResourceAttributesProvider$dd_sdk_android_okhttp_release, reason: from getter */
    public final RumResourceAttributesProvider getRumResourceAttributesProvider() {
        return this.rumResourceAttributesProvider;
    }

    @Override // com.datadog.android.okhttp.trace.TracingInterceptor, okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        InternalLogger unbound;
        chain.getClass();
        SdkCore sdkCore = getSdkCoreReference().get();
        FeatureSdkCore featureSdkCore = sdkCore instanceof FeatureSdkCore ? (FeatureSdkCore) sdkCore : null;
        if ((featureSdkCore != null ? featureSdkCore.getFeature("rum") : null) != null) {
            Request e = chain.getE();
            String str = e.a.i;
            RumResourceMethod httpMethod = toHttpMethod(e.b, featureSdkCore.getInternalLogger());
            ResourceId resourceIdBuildResourceId = RequestExtKt.buildResourceId(e, true);
            RumMonitor rumMonitor = GlobalRumMonitor.get(featureSdkCore);
            AdvancedNetworkRumMonitor advancedNetworkRumMonitor = rumMonitor instanceof AdvancedNetworkRumMonitor ? (AdvancedNetworkRumMonitor) rumMonitor : null;
            if (advancedNetworkRumMonitor != null) {
                AdvancedNetworkRumMonitor.DefaultImpls.startResource$default(advancedNetworkRumMonitor, resourceIdBuildResourceId, httpMethod, str, null, 8, null);
            }
        } else {
            String strL = getSdkInstanceName() == null ? "Default SDK instance" : l5.l("SDK instance with name=", getSdkInstanceName());
            if (featureSdkCore == null || (unbound = featureSdkCore.getInternalLogger()) == null) {
                unbound = InternalLogger.INSTANCE.getUNBOUND();
            }
            InternalLogger.DefaultImpls.log$default(unbound, InternalLogger.Level.INFO, InternalLogger.Target.USER, (gu5) new C05711(strL), (Throwable) null, false, (Map) null, 56, (Object) null);
        }
        return super.intercept(chain);
    }

    @Override // com.datadog.android.okhttp.trace.TracingInterceptor
    public void onRequestIntercepted(FeatureSdkCore sdkCore, Request request, doe span, Response response, Throwable throwable) {
        sdkCore.getClass();
        request.getClass();
        super.onRequestIntercepted(sdkCore, request, span, response, throwable);
        if (sdkCore.getFeature("rum") != null) {
            if (response != null) {
                handleResponse(sdkCore, request, response, span, span != null);
                return;
            }
            if (throwable == null) {
                throwable = new IllegalStateException(ERROR_NO_RESPONSE);
            }
            handleThrowable(sdkCore, request, throwable);
        }
    }

    @Override // com.datadog.android.okhttp.trace.TracingInterceptor
    public void onSdkInstanceReady$dd_sdk_android_okhttp_release(InternalSdkCore sdkCore) {
        sdkCore.getClass();
        super.onSdkInstanceReady$dd_sdk_android_okhttp_release(sdkCore);
        RumMonitor rumMonitor = GlobalRumMonitor.get(sdkCore);
        AdvancedNetworkRumMonitor advancedNetworkRumMonitor = rumMonitor instanceof AdvancedNetworkRumMonitor ? (AdvancedNetworkRumMonitor) rumMonitor : null;
        if (advancedNetworkRumMonitor != null) {
            advancedNetworkRumMonitor.notifyInterceptorInstantiated();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/datadog/android/okhttp/DatadogInterceptor$Companion;", "", "()V", "ALL_IN_SAMPLE_RATE", "", "ERROR_MSG_FORMAT", "", "ERROR_NO_RESPONSE", "ERROR_PEEK_BODY", "MAX_BODY_PEEK", "", "ORIGIN_RUM", "STREAM_CONTENT_TYPES", "", "getSTREAM_CONTENT_TYPES$dd_sdk_android_okhttp_release", "()Ljava/util/Set;", "UNSUPPORTED_HTTP_METHOD", "WARN_RUM_DISABLED", "WEBSOCKET_ACCEPT_HEADER", "ZERO_SAMPLE_RATE", "dd-sdk-android-okhttp_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set<String> getSTREAM_CONTENT_TYPES$dd_sdk_android_okhttp_release() {
            return DatadogInterceptor.STREAM_CONTENT_TYPES;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0015\b\u0016\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006B\u001f\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\u0002\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J\r\u0010\u000f\u001a\u00020\u0000H\u0010¢\u0006\u0002\b\u0010J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/okhttp/DatadogInterceptor$Builder;", "Lcom/datadog/android/okhttp/trace/TracingInterceptor$BaseBuilder;", "Lcom/datadog/android/okhttp/DatadogInterceptor;", "tracedHosts", "", "", "(Ljava/util/List;)V", "tracedHostsWithHeaderType", "", "", "Lcom/datadog/android/trace/TracingHeaderType;", "(Ljava/util/Map;)V", "rumResourceAttributesProvider", "Lcom/datadog/android/rum/RumResourceAttributesProvider;", "build", "getThis", "getThis$dd_sdk_android_okhttp_release", "setRumResourceAttributesProvider", "dd-sdk-android-okhttp_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Builder extends TracingInterceptor.BaseBuilder<DatadogInterceptor, Builder> {
        private RumResourceAttributesProvider rumResourceAttributesProvider;

        public Builder(List<String> list) {
            list.getClass();
            List<String> list2 = list;
            int iV = kc9.V(t92.r0(list2, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iV < 16 ? 16 : iV);
            for (Object obj : list2) {
                linkedHashMap.put(obj, ut0.I0(new TracingHeaderType[]{TracingHeaderType.DATADOG, TracingHeaderType.TRACECONTEXT}));
            }
            this(linkedHashMap);
        }

        @Override // com.datadog.android.okhttp.trace.TracingInterceptor.BaseBuilder
        public DatadogInterceptor build() {
            return new DatadogInterceptor(getSdkInstanceName(), getTracedHostsWithHeaderType$dd_sdk_android_okhttp_release(), getTracedRequestListener(), this.rumResourceAttributesProvider, getTraceSampler$dd_sdk_android_okhttp_release(), getTraceContextInjection(), getRedacted404ResourceName(), getLocalTracerFactory$dd_sdk_android_okhttp_release());
        }

        public final Builder setRumResourceAttributesProvider(RumResourceAttributesProvider rumResourceAttributesProvider) {
            rumResourceAttributesProvider.getClass();
            this.rumResourceAttributesProvider = rumResourceAttributesProvider;
            return this;
        }

        @Override // com.datadog.android.okhttp.trace.TracingInterceptor.BaseBuilder
        public Builder getThis$dd_sdk_android_okhttp_release() {
            return this;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(Map<String, ? extends Set<? extends TracingHeaderType>> map) {
            super(map);
            map.getClass();
            this.rumResourceAttributesProvider = new NoOpRumResourceAttributesProvider();
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.okhttp.DatadogInterceptor$getBodyLength$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05691 extends mj8 implements gu5<String> {
        public static final C05691 INSTANCE = new C05691();

        public C05691() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return DatadogInterceptor.ERROR_PEEK_BODY;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.okhttp.DatadogInterceptor$getBodyLength$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements gu5<String> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return DatadogInterceptor.ERROR_PEEK_BODY;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.okhttp.DatadogInterceptor$getBodyLength$3, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05703 extends mj8 implements gu5<String> {
        public static final C05703 INSTANCE = new C05703();

        public C05703() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return DatadogInterceptor.ERROR_PEEK_BODY;
        }
    }

    @sy3
    public DatadogInterceptor(String str) {
        this(str, null, null, null, 14, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @sy3
    public DatadogInterceptor(String str, TracedRequestListener tracedRequestListener) {
        this(str, tracedRequestListener, null, null, 12, null);
        tracedRequestListener.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @sy3
    public DatadogInterceptor(String str, TracedRequestListener tracedRequestListener, RumResourceAttributesProvider rumResourceAttributesProvider) {
        this(str, tracedRequestListener, rumResourceAttributesProvider, null, 8, null);
        tracedRequestListener.getClass();
        rumResourceAttributesProvider.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @sy3
    public DatadogInterceptor(String str, List<String> list) {
        this(str, list, (TracedRequestListener) null, (RumResourceAttributesProvider) null, (Sampler) null, 28, (DefaultConstructorMarker) null);
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @sy3
    public DatadogInterceptor(String str, List<String> list, TracedRequestListener tracedRequestListener) {
        this(str, list, tracedRequestListener, (RumResourceAttributesProvider) null, (Sampler) null, 24, (DefaultConstructorMarker) null);
        list.getClass();
        tracedRequestListener.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @sy3
    public DatadogInterceptor(String str, List<String> list, TracedRequestListener tracedRequestListener, RumResourceAttributesProvider rumResourceAttributesProvider) {
        this(str, list, tracedRequestListener, rumResourceAttributesProvider, (Sampler) null, 16, (DefaultConstructorMarker) null);
        list.getClass();
        tracedRequestListener.getClass();
        rumResourceAttributesProvider.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @sy3
    public DatadogInterceptor(String str, Map<String, ? extends Set<? extends TracingHeaderType>> map) {
        this(str, map, (TracedRequestListener) null, (RumResourceAttributesProvider) null, (Sampler) null, 28, (DefaultConstructorMarker) null);
        map.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @sy3
    public DatadogInterceptor(String str, Map<String, ? extends Set<? extends TracingHeaderType>> map, TracedRequestListener tracedRequestListener) {
        this(str, map, tracedRequestListener, (RumResourceAttributesProvider) null, (Sampler) null, 24, (DefaultConstructorMarker) null);
        map.getClass();
        tracedRequestListener.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @sy3
    public DatadogInterceptor(String str, Map<String, ? extends Set<? extends TracingHeaderType>> map, TracedRequestListener tracedRequestListener, RumResourceAttributesProvider rumResourceAttributesProvider) {
        this(str, map, tracedRequestListener, rumResourceAttributesProvider, (Sampler) null, 16, (DefaultConstructorMarker) null);
        map.getClass();
        tracedRequestListener.getClass();
        rumResourceAttributesProvider.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @sy3
    public DatadogInterceptor(List<String> list) {
        this((String) null, list, (TracedRequestListener) null, (RumResourceAttributesProvider) null, (Sampler) null, 29, (DefaultConstructorMarker) null);
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @sy3
    public DatadogInterceptor(Map<String, ? extends Set<? extends TracingHeaderType>> map) {
        this((String) null, map, (TracedRequestListener) null, (RumResourceAttributesProvider) null, (Sampler) null, 29, (DefaultConstructorMarker) null);
        map.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatadogInterceptor(String str, Map<String, ? extends Set<? extends TracingHeaderType>> map, TracedRequestListener tracedRequestListener, RumResourceAttributesProvider rumResourceAttributesProvider, Sampler<doe> sampler, TraceContextInjection traceContextInjection, boolean z, Function2<? super SdkCore, ? super Set<? extends TracingHeaderType>, ? extends ppf> function2) {
        super(str, map, tracedRequestListener, "rum", sampler, traceContextInjection, z, function2);
        map.getClass();
        tracedRequestListener.getClass();
        rumResourceAttributesProvider.getClass();
        sampler.getClass();
        traceContextInjection.getClass();
        function2.getClass();
        this.rumResourceAttributesProvider = rumResourceAttributesProvider;
    }

    public /* synthetic */ DatadogInterceptor(String str, Map map, TracedRequestListener tracedRequestListener, RumResourceAttributesProvider rumResourceAttributesProvider, Sampler sampler, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (Map<String, ? extends Set<? extends TracingHeaderType>>) map, (i & 4) != 0 ? new NoOpTracedRequestListener() : tracedRequestListener, (i & 8) != 0 ? new NoOpRumResourceAttributesProvider() : rumResourceAttributesProvider, (Sampler<doe>) ((i & 16) != 0 ? new DeterministicTraceSampler(20.0f) : sampler));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @sy3
    public DatadogInterceptor(String str, Map<String, ? extends Set<? extends TracingHeaderType>> map, TracedRequestListener tracedRequestListener, RumResourceAttributesProvider rumResourceAttributesProvider, Sampler<doe> sampler) {
        this(str, map, tracedRequestListener, rumResourceAttributesProvider, sampler, TraceContextInjection.All, true, AnonymousClass1.INSTANCE);
        map.getClass();
        tracedRequestListener.getClass();
        rumResourceAttributesProvider.getClass();
        sampler.getClass();
    }

    public /* synthetic */ DatadogInterceptor(String str, List list, TracedRequestListener tracedRequestListener, RumResourceAttributesProvider rumResourceAttributesProvider, Sampler sampler, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (List<String>) list, (i & 4) != 0 ? new NoOpTracedRequestListener() : tracedRequestListener, (i & 8) != 0 ? new NoOpRumResourceAttributesProvider() : rumResourceAttributesProvider, (Sampler<doe>) ((i & 16) != 0 ? new DeterministicTraceSampler(20.0f) : sampler));
    }

    @sy3
    public DatadogInterceptor() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ DatadogInterceptor(String str, TracedRequestListener tracedRequestListener, RumResourceAttributesProvider rumResourceAttributesProvider, Sampler sampler, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new NoOpTracedRequestListener() : tracedRequestListener, (i & 4) != 0 ? new NoOpRumResourceAttributesProvider() : rumResourceAttributesProvider, (Sampler<doe>) ((i & 8) != 0 ? new DeterministicTraceSampler(20.0f) : sampler));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @sy3
    public DatadogInterceptor(String str, TracedRequestListener tracedRequestListener, RumResourceAttributesProvider rumResourceAttributesProvider, Sampler<doe> sampler) {
        this(str, bs4.a, tracedRequestListener, rumResourceAttributesProvider, sampler, TraceContextInjection.All, true, AnonymousClass4.INSTANCE);
        tracedRequestListener.getClass();
        rumResourceAttributesProvider.getClass();
        sampler.getClass();
    }
}
