package com.datadog.android.rum.tracking;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.datadog.android.api.SdkCore;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import defpackage.wl7;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bBA\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b¢\u0006\u0004\b\u0007\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/datadog/android/rum/tracking/MixedViewTrackingStrategy;", "Lcom/datadog/android/rum/tracking/ActivityLifecycleTrackingStrategy;", "Lcom/datadog/android/rum/tracking/ViewTrackingStrategy;", "Lcom/datadog/android/rum/tracking/ActivityViewTrackingStrategy;", "activityViewTrackingStrategy", "Lcom/datadog/android/rum/tracking/FragmentViewTrackingStrategy;", "fragmentViewTrackingStrategy", "<init>", "(Lcom/datadog/android/rum/tracking/ActivityViewTrackingStrategy;Lcom/datadog/android/rum/tracking/FragmentViewTrackingStrategy;)V", "", "trackExtras", "Lcom/datadog/android/rum/tracking/ComponentPredicate;", "Landroid/app/Activity;", "componentPredicate", "Landroidx/fragment/app/Fragment;", "supportFragmentComponentPredicate", "Landroid/app/Fragment;", "defaultFragmentComponentPredicate", "(ZLcom/datadog/android/rum/tracking/ComponentPredicate;Lcom/datadog/android/rum/tracking/ComponentPredicate;Lcom/datadog/android/rum/tracking/ComponentPredicate;)V", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Lj6g;", "register", "(Lcom/datadog/android/api/SdkCore;Landroid/content/Context;)V", "unregister", "(Landroid/content/Context;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/datadog/android/rum/tracking/ActivityViewTrackingStrategy;", "getActivityViewTrackingStrategy$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/tracking/ActivityViewTrackingStrategy;", "Lcom/datadog/android/rum/tracking/FragmentViewTrackingStrategy;", "getFragmentViewTrackingStrategy$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/tracking/FragmentViewTrackingStrategy;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class MixedViewTrackingStrategy extends ActivityLifecycleTrackingStrategy implements ViewTrackingStrategy {
    private final ActivityViewTrackingStrategy activityViewTrackingStrategy;
    private final FragmentViewTrackingStrategy fragmentViewTrackingStrategy;

    public /* synthetic */ MixedViewTrackingStrategy(boolean z, ComponentPredicate componentPredicate, ComponentPredicate componentPredicate2, ComponentPredicate componentPredicate3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? new AcceptAllActivities() : componentPredicate, (i & 4) != 0 ? new AcceptAllSupportFragments() : componentPredicate2, (i & 8) != 0 ? new AcceptAllDefaultFragment() : componentPredicate3);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!MixedViewTrackingStrategy.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        MixedViewTrackingStrategy mixedViewTrackingStrategy = (MixedViewTrackingStrategy) other;
        return wl7.b(this.activityViewTrackingStrategy, mixedViewTrackingStrategy.activityViewTrackingStrategy) && wl7.b(this.fragmentViewTrackingStrategy, mixedViewTrackingStrategy.fragmentViewTrackingStrategy);
    }

    /* JADX INFO: renamed from: getActivityViewTrackingStrategy$dd_sdk_android_rum_release, reason: from getter */
    public final ActivityViewTrackingStrategy getActivityViewTrackingStrategy() {
        return this.activityViewTrackingStrategy;
    }

    /* JADX INFO: renamed from: getFragmentViewTrackingStrategy$dd_sdk_android_rum_release, reason: from getter */
    public final FragmentViewTrackingStrategy getFragmentViewTrackingStrategy() {
        return this.fragmentViewTrackingStrategy;
    }

    public int hashCode() {
        return this.fragmentViewTrackingStrategy.hashCode() + (this.activityViewTrackingStrategy.hashCode() * 31);
    }

    @Override // com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy, com.datadog.android.rum.tracking.TrackingStrategy
    public void register(SdkCore sdkCore, Context context) {
        sdkCore.getClass();
        context.getClass();
        super.register(sdkCore, context);
        this.activityViewTrackingStrategy.register(sdkCore, context);
        this.fragmentViewTrackingStrategy.register(sdkCore, context);
    }

    @Override // com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy, com.datadog.android.rum.tracking.TrackingStrategy
    public void unregister(Context context) {
        this.activityViewTrackingStrategy.unregister(context);
        this.fragmentViewTrackingStrategy.unregister(context);
        super.unregister(context);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MixedViewTrackingStrategy(boolean z, ComponentPredicate<Activity> componentPredicate) {
        this(z, componentPredicate, null, null, 12, null);
        componentPredicate.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MixedViewTrackingStrategy(boolean z, ComponentPredicate<Activity> componentPredicate, ComponentPredicate<Fragment> componentPredicate2) {
        this(z, componentPredicate, componentPredicate2, null, 8, null);
        componentPredicate.getClass();
        componentPredicate2.getClass();
    }

    public MixedViewTrackingStrategy(ActivityViewTrackingStrategy activityViewTrackingStrategy, FragmentViewTrackingStrategy fragmentViewTrackingStrategy) {
        activityViewTrackingStrategy.getClass();
        fragmentViewTrackingStrategy.getClass();
        this.activityViewTrackingStrategy = activityViewTrackingStrategy;
        this.fragmentViewTrackingStrategy = fragmentViewTrackingStrategy;
    }

    public MixedViewTrackingStrategy(boolean z) {
        this(z, null, null, null, 14, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MixedViewTrackingStrategy(boolean z, ComponentPredicate<Activity> componentPredicate, ComponentPredicate<Fragment> componentPredicate2, ComponentPredicate<android.app.Fragment> componentPredicate3) {
        this(new ActivityViewTrackingStrategy(z, componentPredicate), new FragmentViewTrackingStrategy(z, componentPredicate2, componentPredicate3));
        componentPredicate.getClass();
        componentPredicate2.getClass();
        componentPredicate3.getClass();
    }
}
