package com.datadog.android.okhttp.trace;

import com.datadog.android.api.SdkCore;
import com.datadog.android.trace.AndroidTracer;
import com.datadog.android.trace.TracingHeaderType;
import defpackage.mj8;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/datadog/android/trace/AndroidTracer;", "sdkCore", "Lcom/datadog/android/api/SdkCore;", "tracingHeaderTypes", "", "Lcom/datadog/android/trace/TracingHeaderType;", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class TracingInterceptor$Companion$DEFAULT_LOCAL_TRACER_FACTORY$1 extends mj8 implements Function2<SdkCore, Set<? extends TracingHeaderType>, AndroidTracer> {
    public static final TracingInterceptor$Companion$DEFAULT_LOCAL_TRACER_FACTORY$1 INSTANCE = new TracingInterceptor$Companion$DEFAULT_LOCAL_TRACER_FACTORY$1();

    public TracingInterceptor$Companion$DEFAULT_LOCAL_TRACER_FACTORY$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final AndroidTracer invoke(SdkCore sdkCore, Set<? extends TracingHeaderType> set) {
        sdkCore.getClass();
        set.getClass();
        return new AndroidTracer.Builder(sdkCore).setSampleRate(100.0d).setTracingHeaderTypes(set).build();
    }
}
