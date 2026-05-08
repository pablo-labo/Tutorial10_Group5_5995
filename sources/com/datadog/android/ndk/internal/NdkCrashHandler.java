package com.datadog.android.ndk.internal;

import com.datadog.android.api.feature.FeatureSdkCore;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u00002\u00020\u0001:\u0001\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/datadog/android/ndk/internal/NdkCrashHandler;", "", "Lj6g;", "prepareData", "()V", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "Lcom/datadog/android/ndk/internal/NdkCrashHandler$ReportTarget;", "reportTarget", "handleNdkCrash", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Lcom/datadog/android/ndk/internal/NdkCrashHandler$ReportTarget;)V", "ReportTarget", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface NdkCrashHandler {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/datadog/android/ndk/internal/NdkCrashHandler$ReportTarget;", "", "(Ljava/lang/String;I)V", "RUM", "LOGS", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum ReportTarget {
        RUM,
        LOGS
    }

    void handleNdkCrash(FeatureSdkCore sdkCore, ReportTarget reportTarget);

    void prepareData();
}
