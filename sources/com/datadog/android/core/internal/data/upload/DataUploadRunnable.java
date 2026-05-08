package com.datadog.android.core.internal.data.upload;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.api.storage.RawBatchEvent;
import com.datadog.android.core.configuration.UploadSchedulerStrategy;
import com.datadog.android.core.internal.ContextProvider;
import com.datadog.android.core.internal.data.upload.UploadStatus;
import com.datadog.android.core.internal.metrics.RemovalReason;
import com.datadog.android.core.internal.net.info.NetworkInfoProvider;
import com.datadog.android.core.internal.persistence.BatchData;
import com.datadog.android.core.internal.persistence.BatchId;
import com.datadog.android.core.internal.persistence.Storage;
import com.datadog.android.core.internal.system.SystemInfo;
import com.datadog.android.core.internal.system.SystemInfoProvider;
import com.datadog.android.core.internal.utils.ConcurrencyExtKt;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import defpackage.t40;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0015\b\u0000\u0018\u0000 ?2\u00020\u0001:\u0001?BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010%J7\u0010-\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010'\u001a\u00020&2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(2\b\u0010,\u001a\u0004\u0018\u00010+H\u0003¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020#H\u0017¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00103R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00104R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00105R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00106R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00107R\u001a\u0010\u0011\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u0013\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010>¨\u0006@"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/DataUploadRunnable;", "Lcom/datadog/android/core/internal/data/upload/UploadRunnable;", "", "featureName", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "threadPoolExecutor", "Lcom/datadog/android/core/internal/persistence/Storage;", "storage", "Lcom/datadog/android/core/internal/data/upload/DataUploader;", "dataUploader", "Lcom/datadog/android/core/internal/ContextProvider;", "contextProvider", "Lcom/datadog/android/core/internal/net/info/NetworkInfoProvider;", "networkInfoProvider", "Lcom/datadog/android/core/internal/system/SystemInfoProvider;", "systemInfoProvider", "Lcom/datadog/android/core/configuration/UploadSchedulerStrategy;", "uploadSchedulerStrategy", "", "maxBatchesPerJob", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Ljava/lang/String;Ljava/util/concurrent/ScheduledThreadPoolExecutor;Lcom/datadog/android/core/internal/persistence/Storage;Lcom/datadog/android/core/internal/data/upload/DataUploader;Lcom/datadog/android/core/internal/ContextProvider;Lcom/datadog/android/core/internal/net/info/NetworkInfoProvider;Lcom/datadog/android/core/internal/system/SystemInfoProvider;Lcom/datadog/android/core/configuration/UploadSchedulerStrategy;ILcom/datadog/android/api/InternalLogger;)V", "Lcom/datadog/android/api/context/DatadogContext;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Lcom/datadog/android/core/internal/data/upload/UploadStatus;", "handleNextBatch", "(Lcom/datadog/android/api/context/DatadogContext;)Lcom/datadog/android/core/internal/data/upload/UploadStatus;", "", "isNetworkAvailable", "()Z", "isSystemReady", "", "delayMs", "Lj6g;", "scheduleNextUpload", "(J)V", "Lcom/datadog/android/core/internal/persistence/BatchId;", "batchId", "", "Lcom/datadog/android/api/storage/RawBatchEvent;", "batch", "", "batchMeta", "consumeBatch", "(Lcom/datadog/android/api/context/DatadogContext;Lcom/datadog/android/core/internal/persistence/BatchId;Ljava/util/List;[B)Lcom/datadog/android/core/internal/data/upload/UploadStatus;", "run", "()V", "Ljava/lang/String;", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "Lcom/datadog/android/core/internal/persistence/Storage;", "Lcom/datadog/android/core/internal/data/upload/DataUploader;", "Lcom/datadog/android/core/internal/ContextProvider;", "Lcom/datadog/android/core/internal/net/info/NetworkInfoProvider;", "Lcom/datadog/android/core/internal/system/SystemInfoProvider;", "Lcom/datadog/android/core/configuration/UploadSchedulerStrategy;", "getUploadSchedulerStrategy$dd_sdk_android_core_release", "()Lcom/datadog/android/core/configuration/UploadSchedulerStrategy;", "I", "getMaxBatchesPerJob$dd_sdk_android_core_release", "()I", "Lcom/datadog/android/api/InternalLogger;", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class DataUploadRunnable implements UploadRunnable {
    public static final int LOW_BATTERY_THRESHOLD = 10;
    private final ContextProvider contextProvider;
    private final DataUploader dataUploader;
    private final String featureName;
    private final InternalLogger internalLogger;
    private final int maxBatchesPerJob;
    private final NetworkInfoProvider networkInfoProvider;
    private final Storage storage;
    private final SystemInfoProvider systemInfoProvider;
    private final ScheduledThreadPoolExecutor threadPoolExecutor;
    private final UploadSchedulerStrategy uploadSchedulerStrategy;

    public DataUploadRunnable(String str, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, Storage storage, DataUploader dataUploader, ContextProvider contextProvider, NetworkInfoProvider networkInfoProvider, SystemInfoProvider systemInfoProvider, UploadSchedulerStrategy uploadSchedulerStrategy, int i, InternalLogger internalLogger) {
        str.getClass();
        scheduledThreadPoolExecutor.getClass();
        storage.getClass();
        dataUploader.getClass();
        contextProvider.getClass();
        networkInfoProvider.getClass();
        systemInfoProvider.getClass();
        uploadSchedulerStrategy.getClass();
        internalLogger.getClass();
        this.featureName = str;
        this.threadPoolExecutor = scheduledThreadPoolExecutor;
        this.storage = storage;
        this.dataUploader = dataUploader;
        this.contextProvider = contextProvider;
        this.networkInfoProvider = networkInfoProvider;
        this.systemInfoProvider = systemInfoProvider;
        this.uploadSchedulerStrategy = uploadSchedulerStrategy;
        this.maxBatchesPerJob = i;
        this.internalLogger = internalLogger;
    }

    private final UploadStatus consumeBatch(DatadogContext context, BatchId batchId, List<RawBatchEvent> batch, byte[] batchMeta) {
        UploadStatus uploadStatusUpload = this.dataUploader.upload(context, batch, batchMeta, batchId);
        this.storage.confirmBatchRead(batchId, uploadStatusUpload instanceof UploadStatus.RequestCreationError ? RemovalReason.Invalid.INSTANCE : new RemovalReason.IntakeCode(uploadStatusUpload.getCode()), !uploadStatusUpload.getShouldRetry());
        return uploadStatusUpload;
    }

    private final UploadStatus handleNextBatch(DatadogContext context) {
        BatchData nextBatch = this.storage.readNextBatch();
        if (nextBatch != null) {
            return consumeBatch(context, nextBatch.getId(), nextBatch.getData(), nextBatch.getMetadata());
        }
        return null;
    }

    private final boolean isNetworkAvailable() {
        return this.networkInfoProvider.getNetworkInfo().getConnectivity() != NetworkInfo.Connectivity.NETWORK_NOT_CONNECTED;
    }

    private final boolean isSystemReady() {
        SystemInfo latestSystemInfo = this.systemInfoProvider.getLatestSystemInfo();
        return (latestSystemInfo.getBatteryFullOrCharging() || latestSystemInfo.getOnExternalPowerSource() || latestSystemInfo.getBatteryLevel() > 10) && !latestSystemInfo.getPowerSaveMode();
    }

    private final void scheduleNextUpload(long delayMs) {
        this.threadPoolExecutor.remove(this);
        ConcurrencyExtKt.scheduleSafe(this.threadPoolExecutor, t40.k(this.featureName, ": data upload"), delayMs, TimeUnit.MILLISECONDS, this.internalLogger, this);
    }

    /* JADX INFO: renamed from: getMaxBatchesPerJob$dd_sdk_android_core_release, reason: from getter */
    public final int getMaxBatchesPerJob() {
        return this.maxBatchesPerJob;
    }

    /* JADX INFO: renamed from: getUploadSchedulerStrategy$dd_sdk_android_core_release, reason: from getter */
    public final UploadSchedulerStrategy getUploadSchedulerStrategy() {
        return this.uploadSchedulerStrategy;
    }

    @Override // java.lang.Runnable
    public void run() {
        UploadStatus uploadStatusHandleNextBatch;
        int i = 0;
        if (isNetworkAvailable() && isSystemReady()) {
            DatadogContext context = this.contextProvider.getContext();
            int i2 = this.maxBatchesPerJob;
            do {
                i2--;
                uploadStatusHandleNextBatch = handleNextBatch(context);
                if (uploadStatusHandleNextBatch != null) {
                    i++;
                }
                if (i2 <= 0) {
                    break;
                }
            } while (uploadStatusHandleNextBatch instanceof UploadStatus.Success);
        } else {
            uploadStatusHandleNextBatch = null;
        }
        scheduleNextUpload(this.uploadSchedulerStrategy.getMsDelayUntilNextUpload(this.featureName, i, uploadStatusHandleNextBatch != null ? Integer.valueOf(uploadStatusHandleNextBatch.getCode()) : null, uploadStatusHandleNextBatch != null ? uploadStatusHandleNextBatch.getThrowable() : null));
    }
}
