package com.datadog.android.okhttp.trace;

import com.datadog.android.api.SdkCore;
import com.datadog.android.core.InternalSdkCore;
import defpackage.j6g;
import defpackage.mj8;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/datadog/android/api/SdkCore;", "it", "Lj6g;", "invoke", "(Lcom/datadog/android/api/SdkCore;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
public final class TracingInterceptor$sdkCoreReference$1 extends mj8 implements Function1<SdkCore, j6g> {
    final /* synthetic */ TracingInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TracingInterceptor$sdkCoreReference$1(TracingInterceptor tracingInterceptor) {
        super(1);
        this.this$0 = tracingInterceptor;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SdkCore sdkCore) {
        sdkCore.getClass();
        this.this$0.onSdkInstanceReady$dd_sdk_android_okhttp_release((InternalSdkCore) sdkCore);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ j6g invoke(SdkCore sdkCore) {
        invoke2(sdkCore);
        return j6g.a;
    }
}
