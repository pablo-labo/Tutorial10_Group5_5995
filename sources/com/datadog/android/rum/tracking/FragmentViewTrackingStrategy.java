package com.datadog.android.rum.tracking;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import androidx.fragment.app.g;
import com.datadog.android.api.feature.FeatureSdkCore;
import com.datadog.android.core.internal.system.BuildSdkVersionProvider;
import com.datadog.android.rum.internal.tracking.FragmentLifecycleCallbacks;
import defpackage.d2f;
import defpackage.j6g;
import defpackage.mj8;
import defpackage.wl7;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B5\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB1\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0014\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b\"\u0010!R\u001a\u0010\u000b\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R!\u0010,\u001a\b\u0012\u0004\u0012\u00020'0&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R!\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000f0&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010+¨\u00060"}, d2 = {"Lcom/datadog/android/rum/tracking/FragmentViewTrackingStrategy;", "Lcom/datadog/android/rum/tracking/ActivityLifecycleTrackingStrategy;", "Lcom/datadog/android/rum/tracking/ViewTrackingStrategy;", "", "trackArguments", "Lcom/datadog/android/rum/tracking/ComponentPredicate;", "Landroidx/fragment/app/Fragment;", "supportFragmentComponentPredicate", "Landroid/app/Fragment;", "defaultFragmentComponentPredicate", "Lcom/datadog/android/core/internal/system/BuildSdkVersionProvider;", "buildSdkVersionProvider", "<init>", "(ZLcom/datadog/android/rum/tracking/ComponentPredicate;Lcom/datadog/android/rum/tracking/ComponentPredicate;Lcom/datadog/android/core/internal/system/BuildSdkVersionProvider;)V", "(ZLcom/datadog/android/rum/tracking/ComponentPredicate;Lcom/datadog/android/rum/tracking/ComponentPredicate;)V", "Landroid/app/Activity;", "activity", "Lj6g;", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityStopped", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Z", "getTrackArguments$dd_sdk_android_rum_release", "()Z", "Lcom/datadog/android/rum/tracking/ComponentPredicate;", "getSupportFragmentComponentPredicate$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/tracking/ComponentPredicate;", "getDefaultFragmentComponentPredicate$dd_sdk_android_rum_release", "Lcom/datadog/android/core/internal/system/BuildSdkVersionProvider;", "getBuildSdkVersionProvider$dd_sdk_android_rum_release", "()Lcom/datadog/android/core/internal/system/BuildSdkVersionProvider;", "Lcom/datadog/android/rum/internal/tracking/FragmentLifecycleCallbacks;", "Landroidx/fragment/app/g;", "androidXLifecycleCallbacks$delegate", "Lkotlin/Lazy;", "getAndroidXLifecycleCallbacks", "()Lcom/datadog/android/rum/internal/tracking/FragmentLifecycleCallbacks;", "androidXLifecycleCallbacks", "oreoLifecycleCallbacks$delegate", "getOreoLifecycleCallbacks", "oreoLifecycleCallbacks", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
@SuppressLint({"NewApi"})
public final class FragmentViewTrackingStrategy extends ActivityLifecycleTrackingStrategy implements ViewTrackingStrategy {

    /* JADX INFO: renamed from: androidXLifecycleCallbacks$delegate, reason: from kotlin metadata */
    private final Lazy androidXLifecycleCallbacks;
    private final BuildSdkVersionProvider buildSdkVersionProvider;
    private final ComponentPredicate<Fragment> defaultFragmentComponentPredicate;

    /* JADX INFO: renamed from: oreoLifecycleCallbacks$delegate, reason: from kotlin metadata */
    private final Lazy oreoLifecycleCallbacks;
    private final ComponentPredicate<androidx.fragment.app.Fragment> supportFragmentComponentPredicate;
    private final boolean trackArguments;

    public FragmentViewTrackingStrategy(boolean z, ComponentPredicate<androidx.fragment.app.Fragment> componentPredicate, ComponentPredicate<Fragment> componentPredicate2, BuildSdkVersionProvider buildSdkVersionProvider) {
        componentPredicate.getClass();
        componentPredicate2.getClass();
        buildSdkVersionProvider.getClass();
        this.trackArguments = z;
        this.supportFragmentComponentPredicate = componentPredicate;
        this.defaultFragmentComponentPredicate = componentPredicate2;
        this.buildSdkVersionProvider = buildSdkVersionProvider;
        this.androidXLifecycleCallbacks = new d2f(new FragmentViewTrackingStrategy$androidXLifecycleCallbacks$2(this));
        this.oreoLifecycleCallbacks = new d2f(new FragmentViewTrackingStrategy$oreoLifecycleCallbacks$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentLifecycleCallbacks<g> getAndroidXLifecycleCallbacks() {
        return (FragmentLifecycleCallbacks) this.androidXLifecycleCallbacks.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentLifecycleCallbacks<Activity> getOreoLifecycleCallbacks() {
        return (FragmentLifecycleCallbacks) this.oreoLifecycleCallbacks.getValue();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!FragmentViewTrackingStrategy.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        FragmentViewTrackingStrategy fragmentViewTrackingStrategy = (FragmentViewTrackingStrategy) other;
        return this.trackArguments == fragmentViewTrackingStrategy.trackArguments && wl7.b(this.supportFragmentComponentPredicate, fragmentViewTrackingStrategy.supportFragmentComponentPredicate) && wl7.b(this.defaultFragmentComponentPredicate, fragmentViewTrackingStrategy.defaultFragmentComponentPredicate);
    }

    /* JADX INFO: renamed from: getBuildSdkVersionProvider$dd_sdk_android_rum_release, reason: from getter */
    public final BuildSdkVersionProvider getBuildSdkVersionProvider() {
        return this.buildSdkVersionProvider;
    }

    public final ComponentPredicate<Fragment> getDefaultFragmentComponentPredicate$dd_sdk_android_rum_release() {
        return this.defaultFragmentComponentPredicate;
    }

    public final ComponentPredicate<androidx.fragment.app.Fragment> getSupportFragmentComponentPredicate$dd_sdk_android_rum_release() {
        return this.supportFragmentComponentPredicate;
    }

    /* JADX INFO: renamed from: getTrackArguments$dd_sdk_android_rum_release, reason: from getter */
    public final boolean getTrackArguments() {
        return this.trackArguments;
    }

    public int hashCode() {
        return this.defaultFragmentComponentPredicate.hashCode() + ((this.supportFragmentComponentPredicate.hashCode() + (Boolean.hashCode(this.trackArguments) * 31)) * 31);
    }

    @Override // com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        activity.getClass();
        super.onActivityStarted(activity);
        withSdkCore(new AnonymousClass1(activity, this));
    }

    @Override // com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        super.onActivityStopped(activity);
        if (g.class.isAssignableFrom(activity.getClass())) {
            getAndroidXLifecycleCallbacks().unregister((g) activity);
        } else {
            getOreoLifecycleCallbacks().unregister(activity);
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.tracking.FragmentViewTrackingStrategy$onActivityStarted$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "Lj6g;", "invoke", "(Lcom/datadog/android/api/feature/FeatureSdkCore;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class AnonymousClass1 extends mj8 implements Function1<FeatureSdkCore, j6g> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ FragmentViewTrackingStrategy this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Activity activity, FragmentViewTrackingStrategy fragmentViewTrackingStrategy) {
            super(1);
            this.$activity = activity;
            this.this$0 = fragmentViewTrackingStrategy;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FeatureSdkCore featureSdkCore) {
            featureSdkCore.getClass();
            boolean zIsAssignableFrom = g.class.isAssignableFrom(this.$activity.getClass());
            FragmentViewTrackingStrategy fragmentViewTrackingStrategy = this.this$0;
            if (!zIsAssignableFrom) {
                fragmentViewTrackingStrategy.getOreoLifecycleCallbacks().register(this.$activity, featureSdkCore);
                return;
            }
            FragmentLifecycleCallbacks androidXLifecycleCallbacks = fragmentViewTrackingStrategy.getAndroidXLifecycleCallbacks();
            Activity activity = this.$activity;
            activity.getClass();
            androidXLifecycleCallbacks.register((g) activity, featureSdkCore);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ j6g invoke(FeatureSdkCore featureSdkCore) {
            invoke2(featureSdkCore);
            return j6g.a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentViewTrackingStrategy(boolean z, ComponentPredicate<androidx.fragment.app.Fragment> componentPredicate) {
        this(z, componentPredicate, null, 4, null);
        componentPredicate.getClass();
    }

    public FragmentViewTrackingStrategy(boolean z) {
        this(z, null, null, 6, null);
    }

    public /* synthetic */ FragmentViewTrackingStrategy(boolean z, ComponentPredicate componentPredicate, ComponentPredicate componentPredicate2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? new AcceptAllSupportFragments() : componentPredicate, (i & 4) != 0 ? new AcceptAllDefaultFragment() : componentPredicate2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentViewTrackingStrategy(boolean z, ComponentPredicate<androidx.fragment.app.Fragment> componentPredicate, ComponentPredicate<Fragment> componentPredicate2) {
        this(z, componentPredicate, componentPredicate2, BuildSdkVersionProvider.INSTANCE.getDEFAULT());
        componentPredicate.getClass();
        componentPredicate2.getClass();
    }
}
