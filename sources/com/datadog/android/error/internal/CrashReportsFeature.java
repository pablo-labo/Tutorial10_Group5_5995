package com.datadog.android.error.internal;

import android.content.Context;
import com.datadog.android.api.feature.Feature;
import com.datadog.android.api.feature.FeatureSdkCore;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R*\u0010\u0017\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/datadog/android/error/internal/CrashReportsFeature;", "Lcom/datadog/android/api/feature/Feature;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "<init>", "(Lcom/datadog/android/api/feature/FeatureSdkCore;)V", "Landroid/content/Context;", "appContext", "Lj6g;", "setupExceptionHandler", "(Landroid/content/Context;)V", "resetOriginalExceptionHandler", "()V", "onInitialize", "onStop", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getInitialized$dd_sdk_android_core_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "kotlin.jvm.PlatformType", "originalUncaughtExceptionHandler", "Ljava/lang/Thread$UncaughtExceptionHandler;", "getOriginalUncaughtExceptionHandler$dd_sdk_android_core_release", "()Ljava/lang/Thread$UncaughtExceptionHandler;", "setOriginalUncaughtExceptionHandler$dd_sdk_android_core_release", "(Ljava/lang/Thread$UncaughtExceptionHandler;)V", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class CrashReportsFeature implements Feature {
    public static final String CRASH_FEATURE_NAME = "crash";
    private final AtomicBoolean initialized;
    private final String name;
    private Thread.UncaughtExceptionHandler originalUncaughtExceptionHandler;
    private final FeatureSdkCore sdkCore;

    public CrashReportsFeature(FeatureSdkCore featureSdkCore) {
        featureSdkCore.getClass();
        this.sdkCore = featureSdkCore;
        this.initialized = new AtomicBoolean(false);
        this.originalUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        this.name = "crash";
    }

    private final void resetOriginalExceptionHandler() {
        Thread.setDefaultUncaughtExceptionHandler(this.originalUncaughtExceptionHandler);
    }

    private final void setupExceptionHandler(Context appContext) {
        this.originalUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        new DatadogExceptionHandler(this.sdkCore, appContext).register();
    }

    /* JADX INFO: renamed from: getInitialized$dd_sdk_android_core_release, reason: from getter */
    public final AtomicBoolean getInitialized() {
        return this.initialized;
    }

    @Override // com.datadog.android.api.feature.Feature
    public String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: getOriginalUncaughtExceptionHandler$dd_sdk_android_core_release, reason: from getter */
    public final Thread.UncaughtExceptionHandler getOriginalUncaughtExceptionHandler() {
        return this.originalUncaughtExceptionHandler;
    }

    @Override // com.datadog.android.api.feature.Feature
    public void onInitialize(Context appContext) {
        appContext.getClass();
        setupExceptionHandler(appContext);
        this.initialized.set(true);
    }

    @Override // com.datadog.android.api.feature.Feature
    public void onStop() {
        resetOriginalExceptionHandler();
        this.initialized.set(false);
    }

    public final void setOriginalUncaughtExceptionHandler$dd_sdk_android_core_release(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.originalUncaughtExceptionHandler = uncaughtExceptionHandler;
    }
}
