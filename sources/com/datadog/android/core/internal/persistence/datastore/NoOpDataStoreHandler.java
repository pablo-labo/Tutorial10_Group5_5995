package com.datadog.android.core.internal.persistence.datastore;

import com.datadog.android.api.storage.datastore.DataStoreHandler;
import com.datadog.android.api.storage.datastore.DataStoreReadCallback;
import com.datadog.android.api.storage.datastore.DataStoreWriteCallback;
import com.datadog.android.core.internal.persistence.Deserializer;
import com.datadog.android.core.persistence.Serializer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u0010\u001a\u00020\u000f\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011JM\u0010\u0015\u001a\u00020\u000f\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u0003¨\u0006\u001a"}, d2 = {"Lcom/datadog/android/core/internal/persistence/datastore/NoOpDataStoreHandler;", "Lcom/datadog/android/api/storage/datastore/DataStoreHandler;", "<init>", "()V", "", "T", "", "key", "data", "", "version", "Lcom/datadog/android/api/storage/datastore/DataStoreWriteCallback;", "callback", "Lcom/datadog/android/core/persistence/Serializer;", "serializer", "Lj6g;", "setValue", "(Ljava/lang/String;Ljava/lang/Object;ILcom/datadog/android/api/storage/datastore/DataStoreWriteCallback;Lcom/datadog/android/core/persistence/Serializer;)V", "Lcom/datadog/android/api/storage/datastore/DataStoreReadCallback;", "Lcom/datadog/android/core/internal/persistence/Deserializer;", "deserializer", "value", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/datadog/android/api/storage/datastore/DataStoreReadCallback;Lcom/datadog/android/core/internal/persistence/Deserializer;)V", "removeValue", "(Ljava/lang/String;Lcom/datadog/android/api/storage/datastore/DataStoreWriteCallback;)V", "clearAllData", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class NoOpDataStoreHandler implements DataStoreHandler {
    @Override // com.datadog.android.api.storage.datastore.DataStoreHandler
    public void clearAllData() {
    }

    @Override // com.datadog.android.api.storage.datastore.DataStoreHandler
    public void removeValue(String key, DataStoreWriteCallback callback) {
        key.getClass();
    }

    @Override // com.datadog.android.api.storage.datastore.DataStoreHandler
    public <T> void setValue(String key, T data, int version, DataStoreWriteCallback callback, Serializer<T> serializer) {
        key.getClass();
        data.getClass();
        serializer.getClass();
    }

    @Override // com.datadog.android.api.storage.datastore.DataStoreHandler
    public <T> void value(String key, Integer version, DataStoreReadCallback<T> callback, Deserializer<String, T> deserializer) {
        key.getClass();
        callback.getClass();
        deserializer.getClass();
    }
}
