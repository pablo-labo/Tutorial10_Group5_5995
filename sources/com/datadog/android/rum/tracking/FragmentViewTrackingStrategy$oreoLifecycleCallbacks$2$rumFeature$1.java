package com.datadog.android.rum.tracking;

import com.datadog.android.api.feature.FeatureScope;
import com.datadog.android.api.feature.FeatureSdkCore;
import com.datadog.android.rum.internal.RumFeature;
import defpackage.mj8;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/datadog/android/rum/internal/RumFeature;", "it", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class FragmentViewTrackingStrategy$oreoLifecycleCallbacks$2$rumFeature$1 extends mj8 implements Function1<FeatureSdkCore, RumFeature> {
    public static final FragmentViewTrackingStrategy$oreoLifecycleCallbacks$2$rumFeature$1 INSTANCE = new FragmentViewTrackingStrategy$oreoLifecycleCallbacks$2$rumFeature$1();

    public FragmentViewTrackingStrategy$oreoLifecycleCallbacks$2$rumFeature$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final RumFeature invoke(FeatureSdkCore featureSdkCore) {
        featureSdkCore.getClass();
        FeatureScope feature = featureSdkCore.getFeature("rum");
        if (feature != null) {
            return (RumFeature) feature.unwrap();
        }
        return null;
    }
}
