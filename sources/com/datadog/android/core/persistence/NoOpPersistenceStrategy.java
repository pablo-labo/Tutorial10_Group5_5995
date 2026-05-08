package com.datadog.android.core.persistence;

import com.datadog.android.api.storage.EventType;
import com.datadog.android.api.storage.RawBatchEvent;
import com.datadog.android.core.persistence.PersistenceStrategy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0003J\u0017\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/datadog/android/core/persistence/NoOpPersistenceStrategy;", "Lcom/datadog/android/core/persistence/PersistenceStrategy;", "<init>", "()V", "", "currentMetadata", "()[B", "Lcom/datadog/android/api/storage/RawBatchEvent;", "event", "batchMetadata", "Lcom/datadog/android/api/storage/EventType;", "eventType", "", "write", "(Lcom/datadog/android/api/storage/RawBatchEvent;[BLcom/datadog/android/api/storage/EventType;)Z", "Lcom/datadog/android/core/persistence/PersistenceStrategy$Batch;", "lockAndReadNext", "()Lcom/datadog/android/core/persistence/PersistenceStrategy$Batch;", "", "batchId", "Lj6g;", "unlockAndKeep", "(Ljava/lang/String;)V", "unlockAndDelete", "dropAll", "targetStrategy", "migrateData", "(Lcom/datadog/android/core/persistence/PersistenceStrategy;)V", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class NoOpPersistenceStrategy implements PersistenceStrategy {
    @Override // com.datadog.android.core.persistence.PersistenceStrategy
    public byte[] currentMetadata() {
        return null;
    }

    @Override // com.datadog.android.core.persistence.PersistenceStrategy
    public void dropAll() {
    }

    @Override // com.datadog.android.core.persistence.PersistenceStrategy
    public PersistenceStrategy.Batch lockAndReadNext() {
        return null;
    }

    @Override // com.datadog.android.core.persistence.PersistenceStrategy
    public void migrateData(PersistenceStrategy targetStrategy) {
        targetStrategy.getClass();
    }

    @Override // com.datadog.android.core.persistence.PersistenceStrategy
    public void unlockAndDelete(String batchId) {
        batchId.getClass();
    }

    @Override // com.datadog.android.core.persistence.PersistenceStrategy
    public void unlockAndKeep(String batchId) {
        batchId.getClass();
    }

    @Override // com.datadog.android.core.persistence.PersistenceStrategy
    public boolean write(RawBatchEvent event, byte[] batchMetadata, EventType eventType) {
        event.getClass();
        eventType.getClass();
        return false;
    }
}
