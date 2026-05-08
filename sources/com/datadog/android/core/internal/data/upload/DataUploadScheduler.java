package com.datadog.android.core.internal.data.upload;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.configuration.UploadSchedulerStrategy;
import com.datadog.android.core.internal.ContextProvider;
import com.datadog.android.core.internal.net.info.NetworkInfoProvider;
import com.datadog.android.core.internal.persistence.Storage;
import com.datadog.android.core.internal.system.SystemInfoProvider;
import com.datadog.android.core.internal.utils.ConcurrencyExtKt;
import defpackage.t40;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u001a\u0010 \u001a\u00020\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/DataUploadScheduler;", "Lcom/datadog/android/core/internal/data/upload/UploadScheduler;", "", "featureName", "Lcom/datadog/android/core/internal/persistence/Storage;", "storage", "Lcom/datadog/android/core/internal/data/upload/DataUploader;", "dataUploader", "Lcom/datadog/android/core/internal/ContextProvider;", "contextProvider", "Lcom/datadog/android/core/internal/net/info/NetworkInfoProvider;", "networkInfoProvider", "Lcom/datadog/android/core/internal/system/SystemInfoProvider;", "systemInfoProvider", "Lcom/datadog/android/core/configuration/UploadSchedulerStrategy;", "uploadSchedulerStrategy", "", "maxBatchesPerJob", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "scheduledThreadPoolExecutor", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Ljava/lang/String;Lcom/datadog/android/core/internal/persistence/Storage;Lcom/datadog/android/core/internal/data/upload/DataUploader;Lcom/datadog/android/core/internal/ContextProvider;Lcom/datadog/android/core/internal/net/info/NetworkInfoProvider;Lcom/datadog/android/core/internal/system/SystemInfoProvider;Lcom/datadog/android/core/configuration/UploadSchedulerStrategy;ILjava/util/concurrent/ScheduledThreadPoolExecutor;Lcom/datadog/android/api/InternalLogger;)V", "Lj6g;", "startScheduling", "()V", "stopScheduling", "Ljava/lang/String;", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "Lcom/datadog/android/api/InternalLogger;", "Lcom/datadog/android/core/internal/data/upload/DataUploadRunnable;", "runnable", "Lcom/datadog/android/core/internal/data/upload/DataUploadRunnable;", "getRunnable$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/data/upload/DataUploadRunnable;", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class DataUploadScheduler implements UploadScheduler {
    private final String featureName;
    private final InternalLogger internalLogger;
    private final DataUploadRunnable runnable;
    private final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;

    public DataUploadScheduler(String str, Storage storage, DataUploader dataUploader, ContextProvider contextProvider, NetworkInfoProvider networkInfoProvider, SystemInfoProvider systemInfoProvider, UploadSchedulerStrategy uploadSchedulerStrategy, int i, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, InternalLogger internalLogger) {
        str.getClass();
        storage.getClass();
        dataUploader.getClass();
        contextProvider.getClass();
        networkInfoProvider.getClass();
        systemInfoProvider.getClass();
        uploadSchedulerStrategy.getClass();
        scheduledThreadPoolExecutor.getClass();
        internalLogger.getClass();
        this.featureName = str;
        this.scheduledThreadPoolExecutor = scheduledThreadPoolExecutor;
        this.internalLogger = internalLogger;
        this.runnable = new DataUploadRunnable(str, scheduledThreadPoolExecutor, storage, dataUploader, contextProvider, networkInfoProvider, systemInfoProvider, uploadSchedulerStrategy, i, internalLogger);
    }

    /* JADX INFO: renamed from: getRunnable$dd_sdk_android_core_release, reason: from getter */
    public final DataUploadRunnable getRunnable() {
        return this.runnable;
    }

    @Override // com.datadog.android.core.internal.data.upload.UploadScheduler
    public void startScheduling() {
        ConcurrencyExtKt.executeSafe(this.scheduledThreadPoolExecutor, t40.k(this.featureName, ": data upload"), this.internalLogger, this.runnable);
    }

    @Override // com.datadog.android.core.internal.data.upload.UploadScheduler
    public void stopScheduling() {
        this.scheduledThreadPoolExecutor.remove(this.runnable);
    }
}
