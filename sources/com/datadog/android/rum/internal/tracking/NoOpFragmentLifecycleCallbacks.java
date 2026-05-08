package com.datadog.android.rum.internal.tracking;

import android.app.Activity;
import com.datadog.android.api.SdkCore;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/datadog/android/rum/internal/tracking/NoOpFragmentLifecycleCallbacks;", "Landroid/app/Activity;", "T", "Lcom/datadog/android/rum/internal/tracking/FragmentLifecycleCallbacks;", "<init>", "()V", "activity", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "Lj6g;", "register", "(Landroid/app/Activity;Lcom/datadog/android/api/SdkCore;)V", "unregister", "(Landroid/app/Activity;)V", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class NoOpFragmentLifecycleCallbacks<T extends Activity> implements FragmentLifecycleCallbacks<T> {
    @Override // com.datadog.android.rum.internal.tracking.FragmentLifecycleCallbacks
    public void register(T activity, SdkCore sdkCore) {
        activity.getClass();
        sdkCore.getClass();
    }

    @Override // com.datadog.android.rum.internal.tracking.FragmentLifecycleCallbacks
    public void unregister(T activity) {
        activity.getClass();
    }
}
