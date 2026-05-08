package com.datadog.android.ndk.internal;

import com.datadog.android.api.feature.FeatureSdkCore;
import com.datadog.android.ndk.internal.NdkCrashHandler;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/datadog/android/ndk/internal/NoOpNdkCrashHandler;", "Lcom/datadog/android/ndk/internal/NdkCrashHandler;", "<init>", "()V", "Lj6g;", "prepareData", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "Lcom/datadog/android/ndk/internal/NdkCrashHandler$ReportTarget;", "reportTarget", "handleNdkCrash", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Lcom/datadog/android/ndk/internal/NdkCrashHandler$ReportTarget;)V", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class NoOpNdkCrashHandler implements NdkCrashHandler {
    @Override // com.datadog.android.ndk.internal.NdkCrashHandler
    public void handleNdkCrash(FeatureSdkCore sdkCore, NdkCrashHandler.ReportTarget reportTarget) {
        sdkCore.getClass();
        reportTarget.getClass();
    }

    @Override // com.datadog.android.ndk.internal.NdkCrashHandler
    public void prepareData() {
    }
}
