package com.datadog.android.rum.internal.instrumentation;

import android.app.Activity;
import com.datadog.android.api.feature.FeatureSdkCore;
import com.datadog.android.rum.internal.instrumentation.gestures.GesturesTracker;
import com.datadog.android.rum.internal.tracking.UserActionTrackingStrategy;
import com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy;
import defpackage.j6g;
import defpackage.mj8;
import defpackage.wl7;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000e\u0010\rJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/datadog/android/rum/internal/instrumentation/UserActionTrackingStrategyLegacy;", "Lcom/datadog/android/rum/tracking/ActivityLifecycleTrackingStrategy;", "Lcom/datadog/android/rum/internal/tracking/UserActionTrackingStrategy;", "Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesTracker;", "gesturesTracker", "<init>", "(Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesTracker;)V", "getGesturesTracker", "()Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesTracker;", "Landroid/app/Activity;", "activity", "Lj6g;", "onActivityResumed", "(Landroid/app/Activity;)V", "onActivityPaused", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesTracker;", "getGesturesTracker$dd_sdk_android_rum_release", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class UserActionTrackingStrategyLegacy extends ActivityLifecycleTrackingStrategy implements UserActionTrackingStrategy {
    private final GesturesTracker gesturesTracker;

    public UserActionTrackingStrategyLegacy(GesturesTracker gesturesTracker) {
        gesturesTracker.getClass();
        this.gesturesTracker = gesturesTracker;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!UserActionTrackingStrategyLegacy.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        return wl7.b(this.gesturesTracker, ((UserActionTrackingStrategyLegacy) other).gesturesTracker);
    }

    @Override // com.datadog.android.rum.internal.tracking.UserActionTrackingStrategy
    public GesturesTracker getGesturesTracker() {
        return this.gesturesTracker;
    }

    public final GesturesTracker getGesturesTracker$dd_sdk_android_rum_release() {
        return this.gesturesTracker;
    }

    public int hashCode() {
        return this.gesturesTracker.hashCode();
    }

    @Override // com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        super.onActivityPaused(activity);
        this.gesturesTracker.stopTracking(activity.getWindow(), activity);
    }

    @Override // com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        activity.getClass();
        super.onActivityResumed(activity);
        withSdkCore(new AnonymousClass1(activity));
    }

    public String toString() {
        return "UserActionTrackingStrategyLegacy(" + this.gesturesTracker + ")";
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.instrumentation.UserActionTrackingStrategyLegacy$onActivityResumed$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/datadog/android/api/feature/FeatureSdkCore;", "it", "Lj6g;", "invoke", "(Lcom/datadog/android/api/feature/FeatureSdkCore;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class AnonymousClass1 extends mj8 implements Function1<FeatureSdkCore, j6g> {
        final /* synthetic */ Activity $activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Activity activity) {
            super(1);
            this.$activity = activity;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FeatureSdkCore featureSdkCore) {
            featureSdkCore.getClass();
            UserActionTrackingStrategyLegacy.this.getGesturesTracker$dd_sdk_android_rum_release().startTracking(this.$activity.getWindow(), this.$activity, featureSdkCore);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ j6g invoke(FeatureSdkCore featureSdkCore) {
            invoke2(featureSdkCore);
            return j6g.a;
        }
    }
}
