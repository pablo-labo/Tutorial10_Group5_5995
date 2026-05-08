package com.datadog.android.rum.tracking;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.g;
import com.datadog.android.rum.RumMonitor;
import com.datadog.android.rum.internal.RumFeature;
import com.datadog.android.rum.internal.tracking.AndroidXFragmentLifecycleCallbacks;
import com.datadog.android.rum.internal.tracking.FragmentLifecycleCallbacks;
import com.datadog.android.rum.internal.tracking.NoOpFragmentLifecycleCallbacks;
import defpackage.bs4;
import defpackage.gu5;
import defpackage.mj8;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/datadog/android/rum/internal/tracking/FragmentLifecycleCallbacks;", "Landroidx/fragment/app/g;", "invoke", "()Lcom/datadog/android/rum/internal/tracking/FragmentLifecycleCallbacks;", "<anonymous>"}, k = 3, mv = {1, 7, 0})
public final class FragmentViewTrackingStrategy$androidXLifecycleCallbacks$2 extends mj8 implements gu5<FragmentLifecycleCallbacks<g>> {
    final /* synthetic */ FragmentViewTrackingStrategy this$0;

    /* JADX INFO: renamed from: com.datadog.android.rum.tracking.FragmentViewTrackingStrategy$androidXLifecycleCallbacks$2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "", "", "it", "Landroidx/fragment/app/Fragment;", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements Function1<Fragment, Map<String, ? extends Object>> {
        final /* synthetic */ FragmentViewTrackingStrategy this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FragmentViewTrackingStrategy fragmentViewTrackingStrategy) {
            super(1);
            this.this$0 = fragmentViewTrackingStrategy;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Map<String, Object> invoke(Fragment fragment) {
            fragment.getClass();
            return this.this$0.getTrackArguments() ? BundleExtKt.convertToRumViewAttributes(fragment.getArguments()) : bs4.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentViewTrackingStrategy$androidXLifecycleCallbacks$2(FragmentViewTrackingStrategy fragmentViewTrackingStrategy) {
        super(0);
        this.this$0 = fragmentViewTrackingStrategy;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.gu5
    public final FragmentLifecycleCallbacks<g> invoke() {
        RumFeature rumFeature = (RumFeature) this.this$0.withSdkCore(FragmentViewTrackingStrategy$androidXLifecycleCallbacks$2$rumFeature$1.INSTANCE);
        RumMonitor rumMonitor = (RumMonitor) this.this$0.withSdkCore(FragmentViewTrackingStrategy$androidXLifecycleCallbacks$2$rumMonitor$1.INSTANCE);
        if (rumFeature == null || rumMonitor == null) {
            return new NoOpFragmentLifecycleCallbacks();
        }
        return new AndroidXFragmentLifecycleCallbacks(new AnonymousClass1(this.this$0), this.this$0.getSupportFragmentComponentPredicate$dd_sdk_android_rum_release(), rumFeature, rumMonitor);
    }
}
