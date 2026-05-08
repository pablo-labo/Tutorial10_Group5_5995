package com.datadog.android.rum.tracking;

import com.datadog.android.api.feature.FeatureSdkCore;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumMonitor;
import defpackage.mj8;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/datadog/android/rum/RumMonitor;", "it", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class FragmentViewTrackingStrategy$oreoLifecycleCallbacks$2$rumMonitor$1 extends mj8 implements Function1<FeatureSdkCore, RumMonitor> {
    public static final FragmentViewTrackingStrategy$oreoLifecycleCallbacks$2$rumMonitor$1 INSTANCE = new FragmentViewTrackingStrategy$oreoLifecycleCallbacks$2$rumMonitor$1();

    public FragmentViewTrackingStrategy$oreoLifecycleCallbacks$2$rumMonitor$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final RumMonitor invoke(FeatureSdkCore featureSdkCore) {
        featureSdkCore.getClass();
        return GlobalRumMonitor.get(featureSdkCore);
    }
}
