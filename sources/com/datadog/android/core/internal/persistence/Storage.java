package com.datadog.android.core.internal.persistence;

import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.storage.EventBatchWriter;
import com.datadog.android.core.internal.metrics.RemovalReason;
import defpackage.j6g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\ba\u0018\u00002\u00020\u0001J3\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H'¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH'¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0004H'¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH'¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/core/internal/persistence/Storage;", "", "Lcom/datadog/android/api/context/DatadogContext;", "datadogContext", "", "forceNewBatch", "Lkotlin/Function1;", "Lcom/datadog/android/api/storage/EventBatchWriter;", "Lj6g;", "callback", "writeCurrentBatch", "(Lcom/datadog/android/api/context/DatadogContext;ZLkotlin/jvm/functions/Function1;)V", "Lcom/datadog/android/core/internal/persistence/BatchData;", "readNextBatch", "()Lcom/datadog/android/core/internal/persistence/BatchData;", "Lcom/datadog/android/core/internal/persistence/BatchId;", "batchId", "Lcom/datadog/android/core/internal/metrics/RemovalReason;", "removalReason", "deleteBatch", "confirmBatchRead", "(Lcom/datadog/android/core/internal/persistence/BatchId;Lcom/datadog/android/core/internal/metrics/RemovalReason;Z)V", "dropAll", "()V", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface Storage {
    void confirmBatchRead(BatchId batchId, RemovalReason removalReason, boolean deleteBatch);

    void dropAll();

    BatchData readNextBatch();

    void writeCurrentBatch(DatadogContext datadogContext, boolean forceNewBatch, Function1<? super EventBatchWriter, j6g> callback);
}
