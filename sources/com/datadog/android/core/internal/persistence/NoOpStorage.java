package com.datadog.android.core.internal.persistence;

import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.storage.EventBatchWriter;
import com.datadog.android.core.internal.metrics.RemovalReason;
import defpackage.j6g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0003¨\u0006\u0019"}, d2 = {"Lcom/datadog/android/core/internal/persistence/NoOpStorage;", "Lcom/datadog/android/core/internal/persistence/Storage;", "<init>", "()V", "Lcom/datadog/android/api/context/DatadogContext;", "datadogContext", "", "forceNewBatch", "Lkotlin/Function1;", "Lcom/datadog/android/api/storage/EventBatchWriter;", "Lj6g;", "callback", "writeCurrentBatch", "(Lcom/datadog/android/api/context/DatadogContext;ZLkotlin/jvm/functions/Function1;)V", "Lcom/datadog/android/core/internal/persistence/BatchData;", "readNextBatch", "()Lcom/datadog/android/core/internal/persistence/BatchData;", "Lcom/datadog/android/core/internal/persistence/BatchId;", "batchId", "Lcom/datadog/android/core/internal/metrics/RemovalReason;", "removalReason", "deleteBatch", "confirmBatchRead", "(Lcom/datadog/android/core/internal/persistence/BatchId;Lcom/datadog/android/core/internal/metrics/RemovalReason;Z)V", "dropAll", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class NoOpStorage implements Storage {
    @Override // com.datadog.android.core.internal.persistence.Storage
    public void confirmBatchRead(BatchId batchId, RemovalReason removalReason, boolean deleteBatch) {
        batchId.getClass();
        removalReason.getClass();
    }

    @Override // com.datadog.android.core.internal.persistence.Storage
    public void dropAll() {
    }

    @Override // com.datadog.android.core.internal.persistence.Storage
    public BatchData readNextBatch() {
        return null;
    }

    @Override // com.datadog.android.core.internal.persistence.Storage
    public void writeCurrentBatch(DatadogContext datadogContext, boolean forceNewBatch, Function1<? super EventBatchWriter, j6g> callback) {
        datadogContext.getClass();
        callback.getClass();
    }
}
