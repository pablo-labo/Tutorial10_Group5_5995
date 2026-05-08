package com.datadog.android.okhttp.trace;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.SdkCore;
import com.datadog.android.api.feature.FeatureSdkCore;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.SdkReference;
import com.datadog.android.core.configuration.HostsSanitizer;
import com.datadog.android.core.internal.net.DefaultFirstPartyHostHeaderTypeResolver;
import com.datadog.android.core.sampling.Sampler;
import com.datadog.android.internal.utils.ThrowableExtKt;
import com.datadog.android.log.LogAttributes;
import com.datadog.android.okhttp.TraceContext;
import com.datadog.android.okhttp.TraceContextInjection;
import com.datadog.android.okhttp.internal.otel.TraceContextExtKt;
import com.datadog.android.okhttp.internal.utils.SpanContextExtKt;
import com.datadog.android.okhttp.trace.TracingInterceptor;
import com.datadog.android.rum.internal.RumFeature;
import com.datadog.android.trace.TracingHeaderType;
import defpackage.bbe;
import defpackage.bs4;
import defpackage.doe;
import defpackage.eoe;
import defpackage.f4a;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.kc9;
import defpackage.l55;
import defpackage.lc9;
import defpackage.mj8;
import defpackage.np5;
import defpackage.ppf;
import defpackage.rc3;
import defpackage.sc3;
import defpackage.spf;
import defpackage.sy3;
import defpackage.t92;
import defpackage.tif;
import defpackage.u63;
import defpackage.uc3;
import defpackage.uif;
import defpackage.ut0;
import defpackage.z3;
import defpackage.z92;
import defpackage.zve;
import io.opentracing.util.GlobalTracer;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 \u0084\u00012\u00020\u0001:\u0006\u0085\u0001\u0086\u0001\u0084\u0001B}\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u001e\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0004\b\u0016\u0010\u0017B=\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0016\u0010\u0019BI\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0016\u0010\u001bB/\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0016\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J=\u0010+\u001a\u00020*2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010\f2\b\u0010'\u001a\u0004\u0018\u00010\u001f2\b\u0010)\u001a\u0004\u0018\u00010(H\u0014¢\u0006\u0004\b+\u0010,J\u000f\u0010/\u001a\u00020\u0010H\u0010¢\u0006\u0004\b-\u0010.J\u0017\u00103\u001a\u00020*2\u0006\u0010#\u001a\u000200H\u0010¢\u0006\u0004\b1\u00102J\u001f\u00104\u001a\u00020\u00102\u0006\u0010#\u001a\u0002002\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b4\u00105J/\u00107\u001a\u00020\u001f2\u0006\u0010#\u001a\u0002002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020$2\u0006\u00106\u001a\u00020\u0014H\u0002¢\u0006\u0004\b7\u00108J'\u0010 \u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b \u00109J\u0019\u0010:\u001a\u0004\u0018\u00010\u00142\u0006\u0010#\u001a\u000200H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u00142\u0006\u0010#\u001a\u000200H\u0002¢\u0006\u0004\b<\u0010;J\u001f\u0010=\u001a\u00020\f2\u0006\u00106\u001a\u00020\u00142\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b=\u0010>J!\u0010?\u001a\u0004\u0018\u00010\u00102\u0006\u00106\u001a\u00020\u00142\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b?\u0010@J\u0019\u0010A\u001a\u0004\u0018\u00010\u00102\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\bA\u0010BJ!\u0010D\u001a\u0004\u0018\u00010C2\u0006\u00106\u001a\u00020\u00142\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\bD\u0010EJ5\u0010I\u001a\u00020*2\u0006\u0010G\u001a\u00020F2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010&\u001a\u00020\f2\u0006\u00106\u001a\u00020\u0014H\u0002¢\u0006\u0004\bI\u0010JJ'\u0010K\u001a\u00020*2\u0006\u0010G\u001a\u00020F2\u0006\u0010&\u001a\u00020\f2\u0006\u00106\u001a\u00020\u0014H\u0002¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020*2\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010O\u001a\u00020*2\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bO\u0010NJ\u001f\u0010P\u001a\u00020*2\u0006\u0010&\u001a\u00020\f2\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bP\u0010QJ\u0017\u0010R\u001a\u00020*2\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bR\u0010NJ\u0017\u0010S\u001a\u00020*2\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bS\u0010NJ\u0017\u0010T\u001a\u00020*2\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bT\u0010NJ7\u0010V\u001a\u00020F2\u0006\u0010#\u001a\u0002002\u0006\u0010%\u001a\u00020$2\u0006\u00106\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\f2\u0006\u0010U\u001a\u00020\u0010H\u0002¢\u0006\u0004\bV\u0010WJ7\u0010X\u001a\u00020*2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\f2\u0006\u0010U\u001a\u00020\u0010H\u0002¢\u0006\u0004\bX\u0010YJ7\u0010Z\u001a\u00020*2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020\f2\u0006\u0010U\u001a\u00020\u0010H\u0002¢\u0006\u0004\bZ\u0010[J\u001b\u0010\\\u001a\u00020**\u00020\f2\u0006\u0010U\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\\\u0010]J\u0015\u0010^\u001a\u0004\u0018\u00010**\u00020\fH\u0002¢\u0006\u0004\b^\u0010_J#\u0010`\u001a\u00020\u0010*\u00020\f2\u0006\u00106\u001a\u00020\u00142\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b`\u0010aR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010b\u001a\u0004\bc\u0010dR,\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010e\u001a\u0004\bf\u0010gR\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010h\u001a\u0004\bi\u0010jR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010b\u001a\u0004\bk\u0010dR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010l\u001a\u0004\bm\u0010nR\u001a\u0010\u000f\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010o\u001a\u0004\bp\u0010qR\u001a\u0010\u0011\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010r\u001a\u0004\bs\u0010.R2\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00140\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010t\u001a\u0004\bu\u0010vR\u001a\u0010x\u001a\b\u0012\u0004\u0012\u00020\u00140w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u001a\u0010z\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010}\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u001f\u0010\u0080\u0001\u001a\u00020\u007f8\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001¨\u0006\u0087\u0001"}, d2 = {"Lcom/datadog/android/okhttp/trace/TracingInterceptor;", "Lokhttp3/Interceptor;", "", "sdkInstanceName", "", "", "Lcom/datadog/android/trace/TracingHeaderType;", "tracedHosts", "Lcom/datadog/android/okhttp/trace/TracedRequestListener;", "tracedRequestListener", "traceOrigin", "Lcom/datadog/android/core/sampling/Sampler;", "Ldoe;", "traceSampler", "Lcom/datadog/android/okhttp/TraceContextInjection;", "traceContextInjection", "", "redacted404ResourceName", "Lkotlin/Function2;", "Lcom/datadog/android/api/SdkCore;", "Lppf;", "localTracerFactory", "<init>", "(Ljava/lang/String;Ljava/util/Map;Lcom/datadog/android/okhttp/trace/TracedRequestListener;Ljava/lang/String;Lcom/datadog/android/core/sampling/Sampler;Lcom/datadog/android/okhttp/TraceContextInjection;ZLkotlin/jvm/functions/Function2;)V", "", "(Ljava/lang/String;Ljava/util/List;Lcom/datadog/android/okhttp/trace/TracedRequestListener;Lcom/datadog/android/core/sampling/Sampler;)V", "tracedHostsWithHeaderType", "(Ljava/lang/String;Ljava/util/Map;Lcom/datadog/android/okhttp/trace/TracedRequestListener;Lcom/datadog/android/core/sampling/Sampler;)V", "(Ljava/lang/String;Lcom/datadog/android/okhttp/trace/TracedRequestListener;Lcom/datadog/android/core/sampling/Sampler;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "Lokhttp3/Request;", "request", "span", "response", "", RumFeature.EVENT_THROWABLE_PROPERTY, "Lj6g;", "onRequestIntercepted", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Lokhttp3/Request;Ldoe;Lokhttp3/Response;Ljava/lang/Throwable;)V", "canSendSpan$dd_sdk_android_okhttp_release", "()Z", "canSendSpan", "Lcom/datadog/android/core/InternalSdkCore;", "onSdkInstanceReady$dd_sdk_android_okhttp_release", "(Lcom/datadog/android/core/InternalSdkCore;)V", "onSdkInstanceReady", "isRequestTraceable", "(Lcom/datadog/android/core/InternalSdkCore;Lokhttp3/Request;)Z", "tracer", "interceptAndTrace", "(Lcom/datadog/android/core/InternalSdkCore;Lokhttp3/Interceptor$Chain;Lokhttp3/Request;Lppf;)Lokhttp3/Response;", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Lokhttp3/Interceptor$Chain;Lokhttp3/Request;)Lokhttp3/Response;", "resolveTracer", "(Lcom/datadog/android/core/InternalSdkCore;)Lppf;", "resolveLocalTracer", "buildSpan", "(Lppf;Lokhttp3/Request;)Ldoe;", "extractSamplingDecision", "(Lppf;Lokhttp3/Request;)Ljava/lang/Boolean;", "extractSamplingDecisionFromHeader", "(Lokhttp3/Request;)Ljava/lang/Boolean;", "Leoe;", "extractParentContext", "(Lppf;Lokhttp3/Request;)Leoe;", "Lokhttp3/Request$Builder;", "requestBuilder", "tracingHeaderTypes", "setSampledOutHeaders", "(Lokhttp3/Request$Builder;Ljava/util/Set;Ldoe;Lppf;)V", "handleDatadogSampledOutHeaders", "(Lokhttp3/Request$Builder;Ldoe;Lppf;)V", "handleB3SampledOutHeaders", "(Lokhttp3/Request$Builder;)V", "handleB3MultiNotSampledHeaders", "handleW3CNotSampledHeaders", "(Ldoe;Lokhttp3/Request$Builder;)V", "removeW3CHeaders", "removeB3MultiHeaders", "removeDatadogHeaders", "isSampled", "updateRequest", "(Lcom/datadog/android/core/InternalSdkCore;Lokhttp3/Request;Lppf;Ldoe;Z)Lokhttp3/Request$Builder;", "handleResponse", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Lokhttp3/Request;Lokhttp3/Response;Ldoe;Z)V", "handleThrowable", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Lokhttp3/Request;Ljava/lang/Throwable;Ldoe;Z)V", "finishRumAware", "(Ldoe;Z)V", "drop", "(Ldoe;)Lj6g;", "sample", "(Ldoe;Lppf;Lokhttp3/Request;)Z", "Ljava/lang/String;", "getSdkInstanceName$dd_sdk_android_okhttp_release", "()Ljava/lang/String;", "Ljava/util/Map;", "getTracedHosts$dd_sdk_android_okhttp_release", "()Ljava/util/Map;", "Lcom/datadog/android/okhttp/trace/TracedRequestListener;", "getTracedRequestListener$dd_sdk_android_okhttp_release", "()Lcom/datadog/android/okhttp/trace/TracedRequestListener;", "getTraceOrigin$dd_sdk_android_okhttp_release", "Lcom/datadog/android/core/sampling/Sampler;", "getTraceSampler$dd_sdk_android_okhttp_release", "()Lcom/datadog/android/core/sampling/Sampler;", "Lcom/datadog/android/okhttp/TraceContextInjection;", "getTraceContextInjection$dd_sdk_android_okhttp_release", "()Lcom/datadog/android/okhttp/TraceContextInjection;", "Z", "getRedacted404ResourceName$dd_sdk_android_okhttp_release", "Lkotlin/jvm/functions/Function2;", "getLocalTracerFactory$dd_sdk_android_okhttp_release", "()Lkotlin/jvm/functions/Function2;", "Ljava/util/concurrent/atomic/AtomicReference;", "localTracerReference", "Ljava/util/concurrent/atomic/AtomicReference;", "sanitizedHosts", "Ljava/util/List;", "Lcom/datadog/android/core/internal/net/DefaultFirstPartyHostHeaderTypeResolver;", "localFirstPartyHostHeaderTypeResolver", "Lcom/datadog/android/core/internal/net/DefaultFirstPartyHostHeaderTypeResolver;", "Lcom/datadog/android/core/SdkReference;", "sdkCoreReference", "Lcom/datadog/android/core/SdkReference;", "getSdkCoreReference$dd_sdk_android_okhttp_release", "()Lcom/datadog/android/core/SdkReference;", "Companion", "BaseBuilder", "Builder", "dd-sdk-android-okhttp_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public class TracingInterceptor implements Interceptor {
    private static final String AGENT_PSR_ATTRIBUTE = "_dd.agent_psr";
    public static final double ALL_IN_SAMPLE_RATE = 100.0d;
    public static final String B3M_DROP_SAMPLING_DECISION = "0";
    public static final String B3M_SAMPLING_PRIORITY_KEY = "X-B3-Sampled";
    public static final String B3M_SPAN_ID_KEY = "X-B3-SpanId";
    public static final String B3M_TRACE_ID_KEY = "X-B3-TraceId";
    public static final String B3_DROP_SAMPLING_DECISION = "0";
    public static final String B3_HEADER_KEY = "b3";
    public static final int B3_SAMPLING_DECISION_INDEX = 2;
    public static final String DATADOG_DROP_SAMPLING_DECISION = "0";
    public static final String DATADOG_LEAST_SIGNIFICANT_64_BITS_TRACE_ID_HEADER = "x-datadog-trace-id";
    public static final String DATADOG_ORIGIN_HEADER = "x-datadog-origin";
    public static final String DATADOG_SAMPLING_PRIORITY_HEADER = "x-datadog-sampling-priority";
    public static final String DATADOG_SPAN_ID_HEADER = "x-datadog-parent-id";
    public static final String DATADOG_TAGS_HEADER = "x-datadog-tags";
    public static final float DEFAULT_TRACE_SAMPLE_RATE = 20.0f;
    public static final String HEADER_CT = "Content-Type";
    public static final String NETWORK_REQUESTS_TRACKING_FEATURE_NAME = "Network Requests";
    public static final String RESOURCE_NAME_404 = "404";
    public static final String SPAN_NAME = "okhttp.request";
    public static final char URL_QUERY_PARAMS_BLOCK_SEPARATOR = '?';
    public static final int W3C_PARENT_ID_LENGTH = 16;
    public static final int W3C_SAMPLING_DECISION_INDEX = 3;
    public static final String W3C_TRACEPARENT_DROP_SAMPLING_DECISION = "00-%s-%s-00";
    public static final String W3C_TRACEPARENT_KEY = "traceparent";
    public static final String W3C_TRACESTATE_DROP_SAMPLING_DECISION = "dd=p:%s;s:0";
    public static final String W3C_TRACESTATE_KEY = "tracestate";
    public static final int W3C_TRACE_ID_LENGTH = 32;
    public static final String WARNING_DEFAULT_TRACER = "You added a TracingInterceptor to your OkHttpClient, but you didn't register any Tracer. We automatically created a local tracer for you.";
    public static final String WARNING_TRACING_DISABLED = "You added a TracingInterceptor to your OkHttpClient, but you did not enable the TracingFeature. Your requests won't be traced.";
    public static final String WARNING_TRACING_NO_HOSTS = "You added a TracingInterceptor to your OkHttpClient, but you did not specify any first party hosts. Your requests won't be traced.\nTo set a list of known hosts, you can use the Configuration.Builder::setFirstPartyHosts() method.";
    public static final float ZERO_SAMPLE_RATE = 0.0f;
    private final DefaultFirstPartyHostHeaderTypeResolver localFirstPartyHostHeaderTypeResolver;
    private final Function2<SdkCore, Set<? extends TracingHeaderType>, ppf> localTracerFactory;
    private final AtomicReference<ppf> localTracerReference;
    private final boolean redacted404ResourceName;
    private final List<String> sanitizedHosts;
    private final SdkReference sdkCoreReference;
    private final String sdkInstanceName;
    private final TraceContextInjection traceContextInjection;
    private final String traceOrigin;
    private final Sampler<doe> traceSampler;
    private final Map<String, Set<TracingHeaderType>> tracedHosts;
    private final TracedRequestListener tracedRequestListener;
    private static final Function2<SdkCore, Set<? extends TracingHeaderType>, ppf> DEFAULT_LOCAL_TRACER_FACTORY = TracingInterceptor$Companion$DEFAULT_LOCAL_TRACER_FACTORY$1.INSTANCE;

    @Metadata(k = 3, mv = {1, 7, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TracingHeaderType.values().length];
            try {
                iArr[TracingHeaderType.DATADOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TracingHeaderType.B3.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TracingHeaderType.B3MULTI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TracingHeaderType.TRACECONTEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.okhttp.trace.TracingInterceptor$intercept$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        final /* synthetic */ Interceptor.Chain $chain;
        final /* synthetic */ String $prefix;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Interceptor.Chain chain) {
            super(0);
            this.$prefix = str;
            this.$chain = chain;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return this.$prefix + " for OkHttp instrumentation is not found, skipping tracking of request with url=" + this.$chain.getE().a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TracingInterceptor(String str, Map<String, ? extends Set<? extends TracingHeaderType>> map, TracedRequestListener tracedRequestListener, String str2, Sampler<doe> sampler, TraceContextInjection traceContextInjection, boolean z, Function2<? super SdkCore, ? super Set<? extends TracingHeaderType>, ? extends ppf> function2) {
        map.getClass();
        tracedRequestListener.getClass();
        sampler.getClass();
        traceContextInjection.getClass();
        function2.getClass();
        this.sdkInstanceName = str;
        this.tracedHosts = map;
        this.tracedRequestListener = tracedRequestListener;
        this.traceOrigin = str2;
        this.traceSampler = sampler;
        this.traceContextInjection = traceContextInjection;
        this.redacted404ResourceName = z;
        this.localTracerFactory = function2;
        this.localTracerReference = new AtomicReference<>();
        this.sanitizedHosts = new HostsSanitizer().sanitizeHosts(z92.z1(map.keySet()), NETWORK_REQUESTS_TRACKING_FEATURE_NAME);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (this.sanitizedHosts.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.localFirstPartyHostHeaderTypeResolver = new DefaultFirstPartyHostHeaderTypeResolver(linkedHashMap);
        this.sdkCoreReference = new SdkReference(this.sdkInstanceName, new TracingInterceptor$sdkCoreReference$1(this));
    }

    private final doe buildSpan(ppf tracer, Request request) {
        eoe eoeVarExtractParentContext = extractParentContext(tracer, request);
        String str = request.a.i;
        ppf.a aVarBuildSpan = tracer.buildSpan(SPAN_NAME);
        uc3.b bVar = aVarBuildSpan instanceof uc3.b ? (uc3.b) aVarBuildSpan : null;
        if (bVar != null) {
            bVar.g = this.traceOrigin;
        }
        doe doeVarStart = aVarBuildSpan.a(eoeVarExtractParentContext).start();
        f4a f4aVar = doeVarStart instanceof f4a ? (f4a) doeVarStart : null;
        if (f4aVar != null) {
            f4aVar.h(zve.p0(str, URL_QUERY_PARAMS_BLOCK_SEPARATOR));
        }
        doeVarStart.c(LogAttributes.HTTP_URL, str);
        doeVarStart.c(LogAttributes.HTTP_METHOD, request.b);
        doeVarStart.d();
        return doeVarStart;
    }

    private final j6g drop(doe doeVar) {
        f4a f4aVar = doeVar instanceof f4a ? (f4a) doeVar : null;
        if (f4aVar == null) {
            return null;
        }
        f4aVar.a();
        return j6g.a;
    }

    private final eoe extractParentContext(ppf tracer, Request request) {
        eoe openTracingContext;
        Map<Class<?>, Object> map = request.e;
        Map<Class<?>, Object> map2 = request.e;
        doe doeVar = (doe) doe.class.cast(map.get(doe.class));
        if (doeVar == null || (openTracingContext = doeVar.f()) == null) {
            TraceContext traceContext = (TraceContext) TraceContext.class.cast(map2.get(TraceContext.class));
            openTracingContext = traceContext != null ? TraceContextExtKt.toOpenTracingContext(traceContext) : null;
        }
        Object objCast = (doe) doe.class.cast(map2.get(doe.class));
        if (objCast == null) {
            objCast = TraceContext.class.cast(map2.get(TraceContext.class));
        }
        boolean z = objCast != null;
        TreeMap treeMapF = request.c.f();
        ArrayList arrayList = new ArrayList(treeMapF.size());
        for (Map.Entry entry : treeMapF.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), z92.W0((Iterable) entry.getValue(), ";", null, null, null, 62)));
        }
        eoe eoeVarExtract = tracer.extract(np5.a.c, new tif(lc9.f0(arrayList)));
        if (eoeVarExtract instanceof l55) {
            return eoeVarExtract;
        }
        if (z) {
            return openTracingContext;
        }
        return null;
    }

    private final Boolean extractSamplingDecision(ppf tracer, Request request) {
        Boolean boolExtractSamplingDecisionFromHeader = extractSamplingDecisionFromHeader(request);
        if (boolExtractSamplingDecisionFromHeader != null) {
            return boolExtractSamplingDecisionFromHeader;
        }
        doe doeVar = (doe) doe.class.cast(request.e.get(doe.class));
        if (doeVar == null || !(doeVar.f() instanceof sc3)) {
            TraceContext traceContext = (TraceContext) TraceContext.class.cast(request.e.get(TraceContext.class));
            if (traceContext != null && traceContext.getSamplingPriority() != Integer.MIN_VALUE) {
                return Boolean.valueOf(traceContext.getSamplingPriority() > 0);
            }
        } else {
            tracer.inject(doeVar.f(), np5.a.b, new spf());
            eoe eoeVarF = doeVar.f();
            sc3 sc3Var = eoeVarF instanceof sc3 ? (sc3) eoeVarF : null;
            if (sc3Var != null && sc3Var.c() != Integer.MIN_VALUE) {
                return Boolean.valueOf(sc3Var.c() > 0);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void extractSamplingDecision$lambda$2(String str, String str2) {
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Boolean extractSamplingDecisionFromHeader(okhttp3.Request r10) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.okhttp.trace.TracingInterceptor.extractSamplingDecisionFromHeader(okhttp3.Request):java.lang.Boolean");
    }

    private final void finishRumAware(doe doeVar, boolean z) {
        if (!canSendSpan$dd_sdk_android_okhttp_release()) {
            drop(doeVar);
        } else if (z) {
            doeVar.b();
        } else {
            drop(doeVar);
        }
    }

    private final void handleB3MultiNotSampledHeaders(Request.Builder requestBuilder) {
        if (this.traceContextInjection == TraceContextInjection.All) {
            requestBuilder.a(B3M_SAMPLING_PRIORITY_KEY, "0");
        }
    }

    private final void handleB3SampledOutHeaders(Request.Builder requestBuilder) {
        if (this.traceContextInjection == TraceContextInjection.All) {
            requestBuilder.a(B3_HEADER_KEY, "0");
        }
    }

    private final void handleDatadogSampledOutHeaders(final Request.Builder requestBuilder, doe span, ppf tracer) {
        if (this.traceContextInjection == TraceContextInjection.All) {
            tracer.inject(span.f(), np5.a.b, new uif() { // from class: qpf
                @Override // defpackage.uif
                public final void a(String str, String str2) {
                    TracingInterceptor.handleDatadogSampledOutHeaders$lambda$5(requestBuilder, str, str2);
                }
            });
            requestBuilder.a(DATADOG_SAMPLING_PRIORITY_HEADER, "0");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void handleDatadogSampledOutHeaders$lambda$5(Request.Builder builder, String str, String str2) {
        builder.getClass();
        str.getClass();
        builder.c.g(str);
        switch (str.hashCode()) {
            case -1682961930:
                if (!str.equals(DATADOG_ORIGIN_HEADER)) {
                    return;
                }
                break;
            case 304080974:
                if (!str.equals(DATADOG_SPAN_ID_HEADER)) {
                    return;
                }
                break;
            case 1316815593:
                if (!str.equals(DATADOG_TAGS_HEADER)) {
                    return;
                }
                break;
            case 1767467379:
                if (!str.equals(DATADOG_LEAST_SIGNIFICANT_64_BITS_TRACE_ID_HEADER)) {
                    return;
                }
                break;
            default:
                return;
        }
        str2.getClass();
        builder.a(str, str2);
    }

    private final void handleResponse(FeatureSdkCore sdkCore, Request request, Response response, doe span, boolean isSampled) {
        if (isSampled) {
            int i = response.d;
            span.g(Integer.valueOf(i));
            if (400 <= i && i < 500) {
                f4a f4aVar = span instanceof f4a ? (f4a) span : null;
                if (f4aVar != null) {
                    f4aVar.e();
                }
            }
            if (i == 404 && this.redacted404ResourceName) {
                f4a f4aVar2 = span instanceof f4a ? (f4a) span : null;
                if (f4aVar2 != null) {
                    f4aVar2.h(RESOURCE_NAME_404);
                }
            }
            onRequestIntercepted(sdkCore, request, span, response, null);
        } else {
            onRequestIntercepted(sdkCore, request, null, response, null);
        }
        finishRumAware(span, isSampled);
    }

    private final void handleThrowable(FeatureSdkCore sdkCore, Request request, Throwable throwable, doe span, boolean isSampled) {
        if (isSampled) {
            f4a f4aVar = span instanceof f4a ? (f4a) span : null;
            if (f4aVar != null) {
                f4aVar.e();
            }
            span.c("error.msg", throwable.getMessage());
            span.c("error.type", throwable.getClass().getName());
            span.c(LogAttributes.ERROR_STACK, ThrowableExtKt.loggableStackTrace(throwable));
            onRequestIntercepted(sdkCore, request, span, null, throwable);
        } else {
            onRequestIntercepted(sdkCore, request, null, null, throwable);
        }
        finishRumAware(span, isSampled);
    }

    private final void handleW3CNotSampledHeaders(doe span, Request.Builder requestBuilder) {
        if (this.traceContextInjection == TraceContextInjection.All) {
            eoe eoeVarF = span.f();
            eoeVarF.getClass();
            String strTraceIdAsHexString = SpanContextExtKt.traceIdAsHexString(eoeVarF);
            String strB = span.f().b();
            String strZ = zve.Z(32, strTraceIdAsHexString);
            strB.getClass();
            requestBuilder.a(W3C_TRACEPARENT_KEY, String.format(W3C_TRACEPARENT_DROP_SAMPLING_DECISION, Arrays.copyOf(new Object[]{strZ, zve.Z(16, strB)}, 2)));
            String strM = String.format(W3C_TRACESTATE_DROP_SAMPLING_DECISION, Arrays.copyOf(new Object[]{zve.Z(16, strB)}, 1));
            String str = this.traceOrigin;
            if (str != null) {
                strM = z3.m(strM, ";o:", str);
            }
            requestBuilder.a(W3C_TRACESTATE_KEY, strM);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final Response interceptAndTrace(InternalSdkCore sdkCore, Interceptor.Chain chain, Request request, ppf tracer) {
        Request requestB;
        doe doeVarBuildSpan = buildSpan(tracer, request);
        boolean zSample = sample(doeVarBuildSpan, tracer, request);
        if (doeVarBuildSpan instanceof rc3) {
            sc3 sc3Var = ((rc3) doeVarBuildSpan).b;
            if (BigInteger.ZERO.equals(sc3Var.f) && sc3Var.f(zSample ? 1 : 0)) {
                Float sampleRate = this.traceSampler.getSampleRate();
                sc3Var.e(Double.valueOf(((double) (sampleRate != null ? sampleRate.floatValue() : 0.0f)) / 100.0d), AGENT_PSR_ATTRIBUTE);
            }
        }
        try {
            requestB = updateRequest(sdkCore, request, tracer, doeVarBuildSpan, zSample).b();
        } catch (IllegalStateException e) {
            InternalLogger.DefaultImpls.log$default(sdkCore.getInternalLogger(), InternalLogger.Level.WARN, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) TracingInterceptor$interceptAndTrace$updatedRequest$1.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
            requestB = request;
        }
        try {
            Response responseB = chain.b(requestB);
            handleResponse(sdkCore, request, responseB, doeVarBuildSpan, zSample);
            return responseB;
        } catch (Throwable th) {
            handleThrowable(sdkCore, request, th, doeVarBuildSpan, zSample);
            throw th;
        }
    }

    private final boolean isRequestTraceable(InternalSdkCore sdkCore, Request request) {
        HttpUrl httpUrl = request.a;
        return sdkCore.getFirstPartyHostResolver().isFirstPartyUrl(httpUrl) || this.localFirstPartyHostHeaderTypeResolver.isFirstPartyUrl(httpUrl);
    }

    private final void removeB3MultiHeaders(Request.Builder requestBuilder) {
        for (String str : u63.a0(B3M_TRACE_ID_KEY, B3M_SPAN_ID_KEY, B3M_SAMPLING_PRIORITY_KEY)) {
            requestBuilder.getClass();
            str.getClass();
            requestBuilder.c.g(str);
        }
    }

    private final void removeDatadogHeaders(Request.Builder requestBuilder) {
        for (String str : u63.a0(DATADOG_SAMPLING_PRIORITY_HEADER, DATADOG_LEAST_SIGNIFICANT_64_BITS_TRACE_ID_HEADER, DATADOG_TAGS_HEADER, DATADOG_SPAN_ID_HEADER, DATADOG_ORIGIN_HEADER)) {
            requestBuilder.getClass();
            str.getClass();
            requestBuilder.c.g(str);
        }
    }

    private final void removeW3CHeaders(Request.Builder requestBuilder) {
        requestBuilder.getClass();
        requestBuilder.c.g(W3C_TRACEPARENT_KEY);
        requestBuilder.c.g(W3C_TRACESTATE_KEY);
    }

    private final ppf resolveLocalTracer(InternalSdkCore sdkCore) {
        if (this.localTracerReference.get() == null) {
            LinkedHashSet linkedHashSetO = bbe.o(this.localFirstPartyHostHeaderTypeResolver.getAllHeaderTypes(), sdkCore.getFirstPartyHostResolver().getAllHeaderTypes());
            AtomicReference<ppf> atomicReference = this.localTracerReference;
            ppf ppfVarInvoke = this.localTracerFactory.invoke(sdkCore, linkedHashSetO);
            while (!atomicReference.compareAndSet(null, ppfVarInvoke) && atomicReference.get() == null) {
            }
            InternalLogger.DefaultImpls.log$default(sdkCore.getInternalLogger(), InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) C05731.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
        }
        ppf ppfVar = this.localTracerReference.get();
        ppfVar.getClass();
        return ppfVar;
    }

    private final synchronized ppf resolveTracer(InternalSdkCore sdkCore) {
        ppf ppfVarResolveLocalTracer;
        try {
            ppfVarResolveLocalTracer = null;
            if (sdkCore.getFeature("tracing") == null) {
                InternalLogger.DefaultImpls.log$default(sdkCore.getInternalLogger(), InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) C05741.INSTANCE, (Throwable) null, true, (Map) null, 40, (Object) null);
            } else if (GlobalTracer.isRegistered()) {
                this.localTracerReference.set(null);
                ppfVarResolveLocalTracer = GlobalTracer.a;
            } else {
                ppfVarResolveLocalTracer = resolveLocalTracer(sdkCore);
            }
        } catch (Throwable th) {
            throw th;
        }
        return ppfVarResolveLocalTracer;
    }

    private final boolean sample(doe doeVar, ppf ppfVar, Request request) {
        if (doeVar instanceof rc3) {
            rc3 rc3Var = (rc3) doeVar;
            if (rc3Var.k() != null) {
                Integer numK = rc3Var.k();
                numK.getClass();
                return numK.intValue() > 0;
            }
        }
        Boolean boolExtractSamplingDecision = extractSamplingDecision(ppfVar, request);
        return boolExtractSamplingDecision != null ? boolExtractSamplingDecision.booleanValue() : this.traceSampler.sample(doeVar);
    }

    private final void setSampledOutHeaders(Request.Builder requestBuilder, Set<? extends TracingHeaderType> tracingHeaderTypes, doe span, ppf tracer) {
        Iterator<? extends TracingHeaderType> it = tracingHeaderTypes.iterator();
        while (it.hasNext()) {
            int i = WhenMappings.$EnumSwitchMapping$0[it.next().ordinal()];
            if (i == 1) {
                removeDatadogHeaders(requestBuilder);
                handleDatadogSampledOutHeaders(requestBuilder, span, tracer);
            } else if (i == 2) {
                requestBuilder.getClass();
                requestBuilder.c.g(B3_HEADER_KEY);
                handleB3SampledOutHeaders(requestBuilder);
            } else if (i == 3) {
                removeB3MultiHeaders(requestBuilder);
                handleB3MultiNotSampledHeaders(requestBuilder);
            } else if (i == 4) {
                removeW3CHeaders(requestBuilder);
                handleW3CNotSampledHeaders(span, requestBuilder);
            }
        }
    }

    private final Request.Builder updateRequest(InternalSdkCore sdkCore, Request request, ppf tracer, doe span, boolean isSampled) {
        final Request.Builder builderB = request.b();
        DefaultFirstPartyHostHeaderTypeResolver defaultFirstPartyHostHeaderTypeResolver = this.localFirstPartyHostHeaderTypeResolver;
        HttpUrl httpUrl = request.a;
        Set<TracingHeaderType> setHeaderTypesForUrl = defaultFirstPartyHostHeaderTypeResolver.headerTypesForUrl(httpUrl);
        if (setHeaderTypesForUrl.isEmpty()) {
            setHeaderTypesForUrl = sdkCore.getFirstPartyHostResolver().headerTypesForUrl(httpUrl);
        }
        final Set<TracingHeaderType> set = setHeaderTypesForUrl;
        if (!isSampled) {
            setSampledOutHeaders(builderB, set, span, tracer);
            return builderB;
        }
        tracer.inject(span.f(), np5.a.b, new uif() { // from class: rpf
            @Override // defpackage.uif
            public final void a(String str, String str2) {
                TracingInterceptor.updateRequest$lambda$9(builderB, set, str, str2);
            }
        });
        return builderB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r3.equals(com.datadog.android.okhttp.trace.TracingInterceptor.DATADOG_TAGS_HEADER) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        if (r3.equals(com.datadog.android.okhttp.trace.TracingInterceptor.W3C_TRACEPARENT_KEY) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if (r3.equals(com.datadog.android.okhttp.trace.TracingInterceptor.W3C_TRACESTATE_KEY) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (r2.contains(com.datadog.android.trace.TracingHeaderType.TRACECONTEXT) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        r4.getClass();
        r1.a(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        if (r3.equals(com.datadog.android.okhttp.trace.TracingInterceptor.DATADOG_SAMPLING_PRIORITY_HEADER) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        if (r3.equals(com.datadog.android.okhttp.trace.TracingInterceptor.DATADOG_SPAN_ID_HEADER) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0087, code lost:
    
        if (r3.equals(com.datadog.android.okhttp.trace.TracingInterceptor.B3M_SPAN_ID_KEY) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0090, code lost:
    
        if (r3.equals(com.datadog.android.okhttp.trace.TracingInterceptor.B3M_TRACE_ID_KEY) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0099, code lost:
    
        if (r2.contains(com.datadog.android.trace.TracingHeaderType.B3MULTI) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
    
        r4.getClass();
        r1.a(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a8, code lost:
    
        if (r3.equals(com.datadog.android.okhttp.trace.TracingInterceptor.DATADOG_ORIGIN_HEADER) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b7, code lost:
    
        if (r2.contains(com.datadog.android.trace.TracingHeaderType.DATADOG) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b9, code lost:
    
        r4.getClass();
        r1.a(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r3.equals(com.datadog.android.okhttp.trace.TracingInterceptor.B3M_SAMPLING_PRIORITY_KEY) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r3.equals(com.datadog.android.okhttp.trace.TracingInterceptor.DATADOG_LEAST_SIGNIFICANT_64_BITS_TRACE_ID_HEADER) == false) goto L49;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void updateRequest$lambda$9(okhttp3.Request.Builder r1, java.util.Set r2, java.lang.String r3, java.lang.String r4) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.okhttp.trace.TracingInterceptor.updateRequest$lambda$9(okhttp3.Request$Builder, java.util.Set, java.lang.String, java.lang.String):void");
    }

    public boolean canSendSpan$dd_sdk_android_okhttp_release() {
        return true;
    }

    public final Function2<SdkCore, Set<? extends TracingHeaderType>, ppf> getLocalTracerFactory$dd_sdk_android_okhttp_release() {
        return this.localTracerFactory;
    }

    /* JADX INFO: renamed from: getRedacted404ResourceName$dd_sdk_android_okhttp_release, reason: from getter */
    public final boolean getRedacted404ResourceName() {
        return this.redacted404ResourceName;
    }

    /* JADX INFO: renamed from: getSdkCoreReference$dd_sdk_android_okhttp_release, reason: from getter */
    public final SdkReference getSdkCoreReference() {
        return this.sdkCoreReference;
    }

    /* JADX INFO: renamed from: getSdkInstanceName$dd_sdk_android_okhttp_release, reason: from getter */
    public final String getSdkInstanceName() {
        return this.sdkInstanceName;
    }

    /* JADX INFO: renamed from: getTraceContextInjection$dd_sdk_android_okhttp_release, reason: from getter */
    public final TraceContextInjection getTraceContextInjection() {
        return this.traceContextInjection;
    }

    /* JADX INFO: renamed from: getTraceOrigin$dd_sdk_android_okhttp_release, reason: from getter */
    public final String getTraceOrigin() {
        return this.traceOrigin;
    }

    public final Sampler<doe> getTraceSampler$dd_sdk_android_okhttp_release() {
        return this.traceSampler;
    }

    public final Map<String, Set<TracingHeaderType>> getTracedHosts$dd_sdk_android_okhttp_release() {
        return this.tracedHosts;
    }

    /* JADX INFO: renamed from: getTracedRequestListener$dd_sdk_android_okhttp_release, reason: from getter */
    public final TracedRequestListener getTracedRequestListener() {
        return this.tracedRequestListener;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        chain.getClass();
        SdkCore sdkCore = this.sdkCoreReference.get();
        if (sdkCore == null) {
            String str = this.sdkInstanceName;
            InternalLogger.DefaultImpls.log$default(InternalLogger.INSTANCE.getUNBOUND(), InternalLogger.Level.INFO, InternalLogger.Target.USER, (gu5) new AnonymousClass1(str == null ? "Default SDK instance" : "SDK instance with name=".concat(str), chain), (Throwable) null, false, (Map) null, 56, (Object) null);
            return chain.b(chain.getE());
        }
        InternalSdkCore internalSdkCore = (InternalSdkCore) sdkCore;
        ppf ppfVarResolveTracer = resolveTracer(internalSdkCore);
        Request e = chain.getE();
        return (ppfVarResolveTracer == null || !isRequestTraceable(internalSdkCore, e)) ? intercept(internalSdkCore, chain, e) : interceptAndTrace(internalSdkCore, chain, e, ppfVarResolveTracer);
    }

    public void onRequestIntercepted(FeatureSdkCore sdkCore, Request request, doe span, Response response, Throwable throwable) {
        sdkCore.getClass();
        request.getClass();
        if (span != null) {
            this.tracedRequestListener.onRequestIntercepted(request, span, response, throwable);
        }
    }

    public void onSdkInstanceReady$dd_sdk_android_okhttp_release(InternalSdkCore sdkCore) {
        sdkCore.getClass();
        if (this.localFirstPartyHostHeaderTypeResolver.isEmpty() && sdkCore.getFirstPartyHostResolver().isEmpty()) {
            InternalLogger.DefaultImpls.log$default(sdkCore.getInternalLogger(), InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) TracingInterceptor$onSdkInstanceReady$1.INSTANCE, (Throwable) null, true, (Map) null, 40, (Object) null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0015\b\u0016\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006B\u001f\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\r\u0010\r\u001a\u00020\u0000H\u0010¢\u0006\u0002\b\u000eJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0005¨\u0006\u0011"}, d2 = {"Lcom/datadog/android/okhttp/trace/TracingInterceptor$Builder;", "Lcom/datadog/android/okhttp/trace/TracingInterceptor$BaseBuilder;", "Lcom/datadog/android/okhttp/trace/TracingInterceptor;", "tracedHosts", "", "", "(Ljava/util/List;)V", "tracedHostsWithHeaderType", "", "", "Lcom/datadog/android/trace/TracingHeaderType;", "(Ljava/util/Map;)V", "build", "getThis", "getThis$dd_sdk_android_okhttp_release", "setTraceOrigin", "traceOrigin", "dd-sdk-android-okhttp_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Builder extends BaseBuilder<TracingInterceptor, Builder> {
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
        public TracingInterceptor build() {
            return new TracingInterceptor(getSdkInstanceName(), getTracedHostsWithHeaderType$dd_sdk_android_okhttp_release(), getTracedRequestListener(), getTraceOrigin(), getTraceSampler$dd_sdk_android_okhttp_release(), getTraceContextInjection(), getRedacted404ResourceName(), getLocalTracerFactory$dd_sdk_android_okhttp_release());
        }

        public final Builder setTraceOrigin(String traceOrigin) {
            traceOrigin.getClass();
            setTraceOrigin$dd_sdk_android_okhttp_release(traceOrigin);
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
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.okhttp.trace.TracingInterceptor$resolveLocalTracer$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05731 extends mj8 implements gu5<String> {
        public static final C05731 INSTANCE = new C05731();

        public C05731() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return TracingInterceptor.WARNING_DEFAULT_TRACER;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.okhttp.trace.TracingInterceptor$resolveTracer$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05741 extends mj8 implements gu5<String> {
        public static final C05741 INSTANCE = new C05741();

        public C05741() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return TracingInterceptor.WARNING_TRACING_DISABLED;
        }
    }

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b/\b&\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u0001*\u0016\b\u0001\u0010\u0003 \u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u00020\u0004B!\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00028\u00012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00028\u00012\b\b\u0001\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u001a\u001a\u00028\u00012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00028\u00012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J/\u0010*\u001a\u00028\u00012\u001e\u0010'\u001a\u001a\u0012\u0004\u0012\u00020%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020&0$H\u0000¢\u0006\u0004\b(\u0010)J\u000f\u0010-\u001a\u00028\u0001H ¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00028\u0000H&¢\u0006\u0004\b.\u0010/R,\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u00102R$\u0010\f\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010=\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u00103\u001a\u0004\b>\u00105\"\u0004\b?\u00107R(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR:\u0010E\u001a\u001a\u0012\u0004\u0012\u00020%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020&0$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\b(\u0010IR\"\u0010\u001d\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010O\u001a\u00020 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010T¨\u0006U"}, d2 = {"Lcom/datadog/android/okhttp/trace/TracingInterceptor$BaseBuilder;", "Lcom/datadog/android/okhttp/trace/TracingInterceptor;", "T", "R", "", "", "", "", "Lcom/datadog/android/trace/TracingHeaderType;", "tracedHostsWithHeaderType", "<init>", "(Ljava/util/Map;)V", "sdkInstanceName", "setSdkInstanceName", "(Ljava/lang/String;)Lcom/datadog/android/okhttp/trace/TracingInterceptor$BaseBuilder;", "Lcom/datadog/android/okhttp/trace/TracedRequestListener;", "tracedRequestListener", "setTracedRequestListener", "(Lcom/datadog/android/okhttp/trace/TracedRequestListener;)Lcom/datadog/android/okhttp/trace/TracingInterceptor$BaseBuilder;", "", "sampleRate", "setTraceSampleRate", "(F)Lcom/datadog/android/okhttp/trace/TracingInterceptor$BaseBuilder;", "Lcom/datadog/android/core/sampling/Sampler;", "Ldoe;", "traceSampler", "setTraceSampler", "(Lcom/datadog/android/core/sampling/Sampler;)Lcom/datadog/android/okhttp/trace/TracingInterceptor$BaseBuilder;", "Lcom/datadog/android/okhttp/TraceContextInjection;", "traceContextInjection", "setTraceContextInjection", "(Lcom/datadog/android/okhttp/TraceContextInjection;)Lcom/datadog/android/okhttp/trace/TracingInterceptor$BaseBuilder;", "", "redacted", "set404ResourcesRedacted", "(Z)Lcom/datadog/android/okhttp/trace/TracingInterceptor$BaseBuilder;", "Lkotlin/Function2;", "Lcom/datadog/android/api/SdkCore;", "Lppf;", "factory", "setLocalTracerFactory$dd_sdk_android_okhttp_release", "(Lkotlin/jvm/functions/Function2;)Lcom/datadog/android/okhttp/trace/TracingInterceptor$BaseBuilder;", "setLocalTracerFactory", "getThis$dd_sdk_android_okhttp_release", "()Lcom/datadog/android/okhttp/trace/TracingInterceptor$BaseBuilder;", "getThis", "build", "()Lcom/datadog/android/okhttp/trace/TracingInterceptor;", "Ljava/util/Map;", "getTracedHostsWithHeaderType$dd_sdk_android_okhttp_release", "()Ljava/util/Map;", "Ljava/lang/String;", "getSdkInstanceName$dd_sdk_android_okhttp_release", "()Ljava/lang/String;", "setSdkInstanceName$dd_sdk_android_okhttp_release", "(Ljava/lang/String;)V", "Lcom/datadog/android/okhttp/trace/TracedRequestListener;", "getTracedRequestListener$dd_sdk_android_okhttp_release", "()Lcom/datadog/android/okhttp/trace/TracedRequestListener;", "setTracedRequestListener$dd_sdk_android_okhttp_release", "(Lcom/datadog/android/okhttp/trace/TracedRequestListener;)V", "traceOrigin", "getTraceOrigin$dd_sdk_android_okhttp_release", "setTraceOrigin$dd_sdk_android_okhttp_release", "Lcom/datadog/android/core/sampling/Sampler;", "getTraceSampler$dd_sdk_android_okhttp_release", "()Lcom/datadog/android/core/sampling/Sampler;", "setTraceSampler$dd_sdk_android_okhttp_release", "(Lcom/datadog/android/core/sampling/Sampler;)V", "localTracerFactory", "Lkotlin/jvm/functions/Function2;", "getLocalTracerFactory$dd_sdk_android_okhttp_release", "()Lkotlin/jvm/functions/Function2;", "(Lkotlin/jvm/functions/Function2;)V", "Lcom/datadog/android/okhttp/TraceContextInjection;", "getTraceContextInjection$dd_sdk_android_okhttp_release", "()Lcom/datadog/android/okhttp/TraceContextInjection;", "setTraceContextInjection$dd_sdk_android_okhttp_release", "(Lcom/datadog/android/okhttp/TraceContextInjection;)V", "redacted404ResourceName", "Z", "getRedacted404ResourceName$dd_sdk_android_okhttp_release", "()Z", "setRedacted404ResourceName$dd_sdk_android_okhttp_release", "(Z)V", "dd-sdk-android-okhttp_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static abstract class BaseBuilder<T extends TracingInterceptor, R extends BaseBuilder<? extends T, ? extends R>> {
        private Function2<? super SdkCore, ? super Set<? extends TracingHeaderType>, ? extends ppf> localTracerFactory;
        private boolean redacted404ResourceName;
        private String sdkInstanceName;
        private TraceContextInjection traceContextInjection;
        private String traceOrigin;
        private Sampler<doe> traceSampler;
        private final Map<String, Set<TracingHeaderType>> tracedHostsWithHeaderType;
        private TracedRequestListener tracedRequestListener;

        /* JADX WARN: Multi-variable type inference failed */
        public BaseBuilder(Map<String, ? extends Set<? extends TracingHeaderType>> map) {
            map.getClass();
            this.tracedHostsWithHeaderType = map;
            this.tracedRequestListener = new NoOpTracedRequestListener();
            this.traceSampler = new DeterministicTraceSampler(20.0f);
            this.localTracerFactory = TracingInterceptor.DEFAULT_LOCAL_TRACER_FACTORY;
            this.traceContextInjection = TraceContextInjection.All;
            this.redacted404ResourceName = true;
        }

        public abstract T build();

        public final Function2<SdkCore, Set<? extends TracingHeaderType>, ppf> getLocalTracerFactory$dd_sdk_android_okhttp_release() {
            return this.localTracerFactory;
        }

        /* JADX INFO: renamed from: getRedacted404ResourceName$dd_sdk_android_okhttp_release, reason: from getter */
        public final boolean getRedacted404ResourceName() {
            return this.redacted404ResourceName;
        }

        /* JADX INFO: renamed from: getSdkInstanceName$dd_sdk_android_okhttp_release, reason: from getter */
        public final String getSdkInstanceName() {
            return this.sdkInstanceName;
        }

        public abstract R getThis$dd_sdk_android_okhttp_release();

        /* JADX INFO: renamed from: getTraceContextInjection$dd_sdk_android_okhttp_release, reason: from getter */
        public final TraceContextInjection getTraceContextInjection() {
            return this.traceContextInjection;
        }

        /* JADX INFO: renamed from: getTraceOrigin$dd_sdk_android_okhttp_release, reason: from getter */
        public final String getTraceOrigin() {
            return this.traceOrigin;
        }

        public final Sampler<doe> getTraceSampler$dd_sdk_android_okhttp_release() {
            return this.traceSampler;
        }

        public final Map<String, Set<TracingHeaderType>> getTracedHostsWithHeaderType$dd_sdk_android_okhttp_release() {
            return this.tracedHostsWithHeaderType;
        }

        /* JADX INFO: renamed from: getTracedRequestListener$dd_sdk_android_okhttp_release, reason: from getter */
        public final TracedRequestListener getTracedRequestListener() {
            return this.tracedRequestListener;
        }

        public final R set404ResourcesRedacted(boolean redacted) {
            this.redacted404ResourceName = redacted;
            return (R) getThis$dd_sdk_android_okhttp_release();
        }

        public final R setLocalTracerFactory$dd_sdk_android_okhttp_release(Function2<? super SdkCore, ? super Set<? extends TracingHeaderType>, ? extends ppf> factory) {
            factory.getClass();
            this.localTracerFactory = factory;
            return (R) getThis$dd_sdk_android_okhttp_release();
        }

        public final void setRedacted404ResourceName$dd_sdk_android_okhttp_release(boolean z) {
            this.redacted404ResourceName = z;
        }

        public final R setSdkInstanceName(String sdkInstanceName) {
            sdkInstanceName.getClass();
            this.sdkInstanceName = sdkInstanceName;
            return (R) getThis$dd_sdk_android_okhttp_release();
        }

        public final void setSdkInstanceName$dd_sdk_android_okhttp_release(String str) {
            this.sdkInstanceName = str;
        }

        public final R setTraceContextInjection(TraceContextInjection traceContextInjection) {
            traceContextInjection.getClass();
            this.traceContextInjection = traceContextInjection;
            return (R) getThis$dd_sdk_android_okhttp_release();
        }

        public final void setTraceContextInjection$dd_sdk_android_okhttp_release(TraceContextInjection traceContextInjection) {
            traceContextInjection.getClass();
            this.traceContextInjection = traceContextInjection;
        }

        public final void setTraceOrigin$dd_sdk_android_okhttp_release(String str) {
            this.traceOrigin = str;
        }

        public final R setTraceSampleRate(float sampleRate) {
            this.traceSampler = new DeterministicTraceSampler(sampleRate);
            return (R) getThis$dd_sdk_android_okhttp_release();
        }

        public final R setTraceSampler(Sampler<doe> traceSampler) {
            traceSampler.getClass();
            this.traceSampler = traceSampler;
            return (R) getThis$dd_sdk_android_okhttp_release();
        }

        public final void setTraceSampler$dd_sdk_android_okhttp_release(Sampler<doe> sampler) {
            sampler.getClass();
            this.traceSampler = sampler;
        }

        public final R setTracedRequestListener(TracedRequestListener tracedRequestListener) {
            tracedRequestListener.getClass();
            this.tracedRequestListener = tracedRequestListener;
            return (R) getThis$dd_sdk_android_okhttp_release();
        }

        public final void setTracedRequestListener$dd_sdk_android_okhttp_release(TracedRequestListener tracedRequestListener) {
            tracedRequestListener.getClass();
            this.tracedRequestListener = tracedRequestListener;
        }

        /* JADX INFO: renamed from: setLocalTracerFactory$dd_sdk_android_okhttp_release, reason: collision with other method in class */
        public final void m20setLocalTracerFactory$dd_sdk_android_okhttp_release(Function2<? super SdkCore, ? super Set<? extends TracingHeaderType>, ? extends ppf> function2) {
            function2.getClass();
            this.localTracerFactory = function2;
        }
    }

    private final Response intercept(FeatureSdkCore sdkCore, Interceptor.Chain chain, Request request) throws Throwable {
        TracingInterceptor tracingInterceptor;
        FeatureSdkCore featureSdkCore;
        Request request2;
        try {
            Response responseB = chain.b(request);
            tracingInterceptor = this;
            featureSdkCore = sdkCore;
            request2 = request;
            try {
                tracingInterceptor.onRequestIntercepted(featureSdkCore, request2, null, responseB, null);
                return responseB;
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                tracingInterceptor.onRequestIntercepted(featureSdkCore, request2, null, null, th2);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            tracingInterceptor = this;
            featureSdkCore = sdkCore;
            request2 = request;
        }
    }

    @sy3
    public TracingInterceptor(String str) {
        this(str, null, null, 6, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @sy3
    public TracingInterceptor(String str, TracedRequestListener tracedRequestListener) {
        this(str, tracedRequestListener, null, 4, null);
        tracedRequestListener.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @sy3
    public TracingInterceptor(String str, List<String> list) {
        this(str, list, (TracedRequestListener) null, (Sampler) null, 12, (DefaultConstructorMarker) null);
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @sy3
    public TracingInterceptor(String str, List<String> list, TracedRequestListener tracedRequestListener) {
        this(str, list, tracedRequestListener, (Sampler) null, 8, (DefaultConstructorMarker) null);
        list.getClass();
        tracedRequestListener.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @sy3
    public TracingInterceptor(String str, Map<String, ? extends Set<? extends TracingHeaderType>> map) {
        this(str, map, (TracedRequestListener) null, (Sampler) null, 12, (DefaultConstructorMarker) null);
        map.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @sy3
    public TracingInterceptor(String str, Map<String, ? extends Set<? extends TracingHeaderType>> map, TracedRequestListener tracedRequestListener) {
        this(str, map, tracedRequestListener, (Sampler) null, 8, (DefaultConstructorMarker) null);
        map.getClass();
        tracedRequestListener.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @sy3
    public TracingInterceptor(List<String> list) {
        this((String) null, list, (TracedRequestListener) null, (Sampler) null, 13, (DefaultConstructorMarker) null);
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @sy3
    public TracingInterceptor(Map<String, ? extends Set<? extends TracingHeaderType>> map) {
        this((String) null, map, (TracedRequestListener) null, (Sampler) null, 13, (DefaultConstructorMarker) null);
        map.getClass();
    }

    @sy3
    public TracingInterceptor() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ TracingInterceptor(String str, List list, TracedRequestListener tracedRequestListener, Sampler sampler, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (List<String>) list, (i & 4) != 0 ? new NoOpTracedRequestListener() : tracedRequestListener, (Sampler<doe>) ((i & 8) != 0 ? new DeterministicTraceSampler(20.0f) : sampler));
    }

    @sy3
    public TracingInterceptor(String str, List<String> list, TracedRequestListener tracedRequestListener, Sampler<doe> sampler) {
        list.getClass();
        tracedRequestListener.getClass();
        sampler.getClass();
        List<String> list2 = list;
        int iV = kc9.V(t92.r0(list2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iV < 16 ? 16 : iV);
        for (Object obj : list2) {
            linkedHashMap.put(obj, ut0.I0(new TracingHeaderType[]{TracingHeaderType.DATADOG, TracingHeaderType.TRACECONTEXT}));
        }
        this(str, linkedHashMap, tracedRequestListener, null, sampler, TraceContextInjection.All, true, DEFAULT_LOCAL_TRACER_FACTORY);
    }

    public /* synthetic */ TracingInterceptor(String str, Map map, TracedRequestListener tracedRequestListener, Sampler sampler, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (Map<String, ? extends Set<? extends TracingHeaderType>>) map, (i & 4) != 0 ? new NoOpTracedRequestListener() : tracedRequestListener, (Sampler<doe>) ((i & 8) != 0 ? new DeterministicTraceSampler(20.0f) : sampler));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @sy3
    public TracingInterceptor(String str, Map<String, ? extends Set<? extends TracingHeaderType>> map, TracedRequestListener tracedRequestListener, Sampler<doe> sampler) {
        this(str, map, tracedRequestListener, null, sampler, TraceContextInjection.All, true, DEFAULT_LOCAL_TRACER_FACTORY);
        map.getClass();
        tracedRequestListener.getClass();
        sampler.getClass();
    }

    public /* synthetic */ TracingInterceptor(String str, TracedRequestListener tracedRequestListener, Sampler sampler, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new NoOpTracedRequestListener() : tracedRequestListener, (Sampler<doe>) ((i & 4) != 0 ? new DeterministicTraceSampler(20.0f) : sampler));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @sy3
    public TracingInterceptor(String str, TracedRequestListener tracedRequestListener, Sampler<doe> sampler) {
        this(str, bs4.a, tracedRequestListener, null, sampler, TraceContextInjection.All, true, DEFAULT_LOCAL_TRACER_FACTORY);
        tracedRequestListener.getClass();
        sampler.getClass();
    }
}
