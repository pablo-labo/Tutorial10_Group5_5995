package com.datadog.android.rum.internal.instrumentation.gestures;

import android.content.Context;
import android.view.Window;
import com.datadog.android.api.SdkCore;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesTracker;", "", "Landroid/view/Window;", "window", "Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Lcom/datadog/android/api/SdkCore;", "sdkCore", "Lj6g;", "startTracking", "(Landroid/view/Window;Landroid/content/Context;Lcom/datadog/android/api/SdkCore;)V", "stopTracking", "(Landroid/view/Window;Landroid/content/Context;)V", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface GesturesTracker {
    void startTracking(Window window, Context context, SdkCore sdkCore);

    void stopTracking(Window window, Context context);
}
