package com.datadog.android.rum.internal.instrumentation.gestures;

import android.content.Context;
import android.view.Window;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.SdkCore;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.datadog.android.rum.tracking.InteractionPredicate;
import com.datadog.android.rum.tracking.ViewAttributesProvider;
import defpackage.l5;
import defpackage.ut0;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0012\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J'\u0010$\u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\"\u0010#R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010+¨\u0006,"}, d2 = {"Lcom/datadog/android/rum/internal/instrumentation/gestures/DatadogGesturesTracker;", "Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesTracker;", "", "Lcom/datadog/android/rum/tracking/ViewAttributesProvider;", "targetAttributesProviders", "Lcom/datadog/android/rum/tracking/InteractionPredicate;", "interactionPredicate", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "([Lcom/datadog/android/rum/tracking/ViewAttributesProvider;Lcom/datadog/android/rum/tracking/InteractionPredicate;Lcom/datadog/android/api/InternalLogger;)V", "Landroid/view/Window;", "window", "Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Lcom/datadog/android/api/SdkCore;", "sdkCore", "Lj6g;", "startTracking", "(Landroid/view/Window;Landroid/content/Context;Lcom/datadog/android/api/SdkCore;)V", "stopTracking", "(Landroid/view/Window;Landroid/content/Context;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesDetectorWrapper;", "generateGestureDetector$dd_sdk_android_rum_release", "(Landroid/content/Context;Landroid/view/Window;Lcom/datadog/android/api/SdkCore;)Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesDetectorWrapper;", "generateGestureDetector", "[Lcom/datadog/android/rum/tracking/ViewAttributesProvider;", "getTargetAttributesProviders$dd_sdk_android_rum_release", "()[Lcom/datadog/android/rum/tracking/ViewAttributesProvider;", "Lcom/datadog/android/rum/tracking/InteractionPredicate;", "getInteractionPredicate$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/tracking/InteractionPredicate;", "Lcom/datadog/android/api/InternalLogger;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class DatadogGesturesTracker implements GesturesTracker {
    private final InteractionPredicate interactionPredicate;
    private final InternalLogger internalLogger;
    private final ViewAttributesProvider[] targetAttributesProviders;

    public DatadogGesturesTracker(ViewAttributesProvider[] viewAttributesProviderArr, InteractionPredicate interactionPredicate, InternalLogger internalLogger) {
        viewAttributesProviderArr.getClass();
        interactionPredicate.getClass();
        internalLogger.getClass();
        this.targetAttributesProviders = viewAttributesProviderArr;
        this.interactionPredicate = interactionPredicate;
        this.internalLogger = internalLogger;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!DatadogGesturesTracker.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        DatadogGesturesTracker datadogGesturesTracker = (DatadogGesturesTracker) other;
        return Arrays.equals(this.targetAttributesProviders, datadogGesturesTracker.targetAttributesProviders) && this.interactionPredicate.getClass().equals(datadogGesturesTracker.interactionPredicate.getClass());
    }

    public final GesturesDetectorWrapper generateGestureDetector$dd_sdk_android_rum_release(Context context, Window window, SdkCore sdkCore) {
        context.getClass();
        window.getClass();
        sdkCore.getClass();
        return new GesturesDetectorWrapper(context, new GesturesListener(sdkCore, new WeakReference(window), this.targetAttributesProviders, this.interactionPredicate, new WeakReference(context), this.internalLogger));
    }

    /* JADX INFO: renamed from: getInteractionPredicate$dd_sdk_android_rum_release, reason: from getter */
    public final InteractionPredicate getInteractionPredicate() {
        return this.interactionPredicate;
    }

    /* JADX INFO: renamed from: getTargetAttributesProviders$dd_sdk_android_rum_release, reason: from getter */
    public final ViewAttributesProvider[] getTargetAttributesProviders() {
        return this.targetAttributesProviders;
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.targetAttributesProviders) + 544;
        return this.interactionPredicate.getClass().hashCode() + (iHashCode * 31) + iHashCode;
    }

    @Override // com.datadog.android.rum.internal.instrumentation.gestures.GesturesTracker
    public void startTracking(Window window, Context context, SdkCore sdkCore) {
        context.getClass();
        sdkCore.getClass();
        if (window == null) {
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback == null) {
            callback = new NoOpWindowCallback();
        }
        window.setCallback(new WindowCallbackWrapper(window, sdkCore, callback, generateGestureDetector$dd_sdk_android_rum_release(context, window, sdkCore), this.interactionPredicate, null, this.targetAttributesProviders, this.internalLogger, 32, null));
    }

    @Override // com.datadog.android.rum.internal.instrumentation.gestures.GesturesTracker
    public void stopTracking(Window window, Context context) {
        context.getClass();
        if (window == null) {
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof WindowCallbackWrapper) {
            WindowCallbackWrapper windowCallbackWrapper = (WindowCallbackWrapper) callback;
            if (windowCallbackWrapper.getWrappedCallback() instanceof NoOpWindowCallback) {
                window.setCallback(null);
            } else {
                window.setCallback(windowCallbackWrapper.getWrappedCallback());
            }
        }
    }

    public String toString() {
        return l5.m("DatadogGesturesTracker(", ut0.t0(this.targetAttributesProviders, null, null, null, null, 63), ")");
    }
}
