package com.datadog.android.rum.internal;

import com.datadog.android.api.feature.FeatureSdkCore;
import com.datadog.android.core.InternalSdkCore;
import defpackage.gu5;
import defpackage.mj8;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/datadog/android/rum/internal/LateCrashReporter;", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class RumFeature$lateCrashEventHandler$2 extends mj8 implements gu5<LateCrashReporter> {
    final /* synthetic */ RumFeature this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RumFeature$lateCrashEventHandler$2(RumFeature rumFeature) {
        super(0);
        this.this$0 = rumFeature;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.gu5
    public final LateCrashReporter invoke() {
        Function1 function1 = this.this$0.lateCrashReporterFactory;
        FeatureSdkCore featureSdkCore = this.this$0.sdkCore;
        featureSdkCore.getClass();
        return (LateCrashReporter) function1.invoke((InternalSdkCore) featureSdkCore);
    }
}
