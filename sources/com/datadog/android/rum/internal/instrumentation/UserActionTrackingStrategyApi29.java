package com.datadog.android.rum.internal.instrumentation;

import android.app.Activity;
import android.os.Bundle;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\b¨\u0006\u001d"}, d2 = {"Lcom/datadog/android/rum/internal/instrumentation/UserActionTrackingStrategyApi29;", "Lcom/datadog/android/rum/tracking/ActivityLifecycleTrackingStrategy;", "Lcom/datadog/android/rum/internal/tracking/UserActionTrackingStrategy;", "Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesTracker;", "gesturesTracker", "<init>", "(Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesTracker;)V", "getGesturesTracker", "()Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesTracker;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "Lj6g;", "onActivityPreCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesTracker;", "getGesturesTracker$dd_sdk_android_rum_release", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class UserActionTrackingStrategyApi29 extends ActivityLifecycleTrackingStrategy implements UserActionTrackingStrategy {
    private final GesturesTracker gesturesTracker;

    public UserActionTrackingStrategyApi29(GesturesTracker gesturesTracker) {
        gesturesTracker.getClass();
        this.gesturesTracker = gesturesTracker;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!UserActionTrackingStrategyApi29.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        return wl7.b(this.gesturesTracker, ((UserActionTrackingStrategyApi29) other).gesturesTracker);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle savedInstanceState) {
        activity.getClass();
        withSdkCore(new AnonymousClass1(activity));
        super.onActivityPreCreated(activity, savedInstanceState);
    }

    public String toString() {
        return "UserActionTrackingStrategyApi29(" + this.gesturesTracker + ")";
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.instrumentation.UserActionTrackingStrategyApi29$onActivityPreCreated$1, reason: invalid class name */
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
            UserActionTrackingStrategyApi29.this.getGesturesTracker$dd_sdk_android_rum_release().startTracking(this.$activity.getWindow(), this.$activity, featureSdkCore);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ j6g invoke(FeatureSdkCore featureSdkCore) {
            invoke2(featureSdkCore);
            return j6g.a;
        }
    }
}
