package com.datadog.android.core.internal.persistence;

import com.datadog.android.api.storage.EventBatchWriter;
import com.datadog.android.api.storage.EventType;
import com.datadog.android.api.storage.RawBatchEvent;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/datadog/android/core/internal/persistence/NoOpEventBatchWriter;", "Lcom/datadog/android/api/storage/EventBatchWriter;", "()V", "currentMetadata", "", "write", "", "event", "Lcom/datadog/android/api/storage/RawBatchEvent;", "batchMetadata", "eventType", "Lcom/datadog/android/api/storage/EventType;", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class NoOpEventBatchWriter implements EventBatchWriter {
    @Override // com.datadog.android.api.storage.EventBatchWriter
    public byte[] currentMetadata() {
        return null;
    }

    @Override // com.datadog.android.api.storage.EventBatchWriter
    public boolean write(RawBatchEvent event, byte[] batchMetadata, EventType eventType) {
        event.getClass();
        eventType.getClass();
        return true;
    }
}
