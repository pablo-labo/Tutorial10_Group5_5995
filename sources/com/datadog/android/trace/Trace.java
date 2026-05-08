package com.datadog.android.trace;

import com.datadog.android.Datadog;
import com.datadog.android.api.SdkCore;
import com.datadog.android.api.feature.FeatureSdkCore;
import com.datadog.android.trace.internal.TracingFeature;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/datadog/android/trace/Trace;", "", "<init>", "()V", "Lcom/datadog/android/trace/TraceConfiguration;", "traceConfiguration", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "Lj6g;", "enable", "(Lcom/datadog/android/trace/TraceConfiguration;Lcom/datadog/android/api/SdkCore;)V", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class Trace {
    public static final Trace INSTANCE = new Trace();

    private Trace() {
    }

    public static final void enable(TraceConfiguration traceConfiguration, SdkCore sdkCore) {
        traceConfiguration.getClass();
        sdkCore.getClass();
        FeatureSdkCore featureSdkCore = (FeatureSdkCore) sdkCore;
        featureSdkCore.registerFeature(new TracingFeature(featureSdkCore, traceConfiguration.getCustomEndpointUrl$dd_sdk_android_trace_release(), traceConfiguration.getEventMapper$dd_sdk_android_trace_release(), traceConfiguration.getNetworkInfoEnabled$dd_sdk_android_trace_release()));
    }

    public static /* synthetic */ void enable$default(TraceConfiguration traceConfiguration, SdkCore sdkCore, int i, Object obj) {
        if ((i & 2) != 0) {
            sdkCore = Datadog.getInstance$default(null, 1, null);
        }
        enable(traceConfiguration, sdkCore);
    }

    public static final void enable(TraceConfiguration traceConfiguration) {
        traceConfiguration.getClass();
        enable$default(traceConfiguration, null, 2, null);
    }
}
