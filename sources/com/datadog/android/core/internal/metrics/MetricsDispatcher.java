package com.datadog.android.core.internal.metrics;

import java.io.File;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/core/internal/metrics/MetricsDispatcher;", "", "Ljava/io/File;", "batchFile", "Lcom/datadog/android/core/internal/metrics/RemovalReason;", "removalReason", "Lj6g;", "sendBatchDeletedMetric", "(Ljava/io/File;Lcom/datadog/android/core/internal/metrics/RemovalReason;)V", "Lcom/datadog/android/core/internal/metrics/BatchClosedMetadata;", "batchMetadata", "sendBatchClosedMetric", "(Ljava/io/File;Lcom/datadog/android/core/internal/metrics/BatchClosedMetadata;)V", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface MetricsDispatcher {
    void sendBatchClosedMetric(File batchFile, BatchClosedMetadata batchMetadata);

    void sendBatchDeletedMetric(File batchFile, RemovalReason removalReason);
}
