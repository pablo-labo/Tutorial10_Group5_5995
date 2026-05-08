package com.datadog.android.core.internal.persistence.datastore;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.storage.datastore.DataStoreHandler;
import com.datadog.android.api.storage.datastore.DataStoreReadCallback;
import com.datadog.android.api.storage.datastore.DataStoreWriteCallback;
import com.datadog.android.core.internal.persistence.Deserializer;
import com.datadog.android.core.internal.persistence.datastore.DataStoreFileHandler;
import com.datadog.android.core.internal.utils.ConcurrencyExtKt;
import com.datadog.android.core.persistence.Serializer;
import defpackage.my1;
import defpackage.qd1;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJI\u0010\u0018\u001a\u00020\u0017\"\b\b\u0000\u0010\r*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJM\u0010!\u001a\u00020\u0017\"\b\b\u0000\u0010\r*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u00000\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&¨\u0006'"}, d2 = {"Lcom/datadog/android/core/internal/persistence/datastore/DataStoreFileHandler;", "Lcom/datadog/android/api/storage/datastore/DataStoreHandler;", "Ljava/util/concurrent/ExecutorService;", "executorService", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/core/internal/persistence/datastore/DatastoreFileReader;", "dataStoreFileReader", "Lcom/datadog/android/core/internal/persistence/datastore/DatastoreFileWriter;", "datastoreFileWriter", "<init>", "(Ljava/util/concurrent/ExecutorService;Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/core/internal/persistence/datastore/DatastoreFileReader;Lcom/datadog/android/core/internal/persistence/datastore/DatastoreFileWriter;)V", "", "T", "", "key", "data", "", "version", "Lcom/datadog/android/api/storage/datastore/DataStoreWriteCallback;", "callback", "Lcom/datadog/android/core/persistence/Serializer;", "serializer", "Lj6g;", "setValue", "(Ljava/lang/String;Ljava/lang/Object;ILcom/datadog/android/api/storage/datastore/DataStoreWriteCallback;Lcom/datadog/android/core/persistence/Serializer;)V", "removeValue", "(Ljava/lang/String;Lcom/datadog/android/api/storage/datastore/DataStoreWriteCallback;)V", "clearAllData", "()V", "Lcom/datadog/android/api/storage/datastore/DataStoreReadCallback;", "Lcom/datadog/android/core/internal/persistence/Deserializer;", "deserializer", "value", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/datadog/android/api/storage/datastore/DataStoreReadCallback;Lcom/datadog/android/core/internal/persistence/Deserializer;)V", "Ljava/util/concurrent/ExecutorService;", "Lcom/datadog/android/api/InternalLogger;", "Lcom/datadog/android/core/internal/persistence/datastore/DatastoreFileReader;", "Lcom/datadog/android/core/internal/persistence/datastore/DatastoreFileWriter;", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class DataStoreFileHandler implements DataStoreHandler {
    private final DatastoreFileReader dataStoreFileReader;
    private final DatastoreFileWriter datastoreFileWriter;
    private final ExecutorService executorService;
    private final InternalLogger internalLogger;

    public DataStoreFileHandler(ExecutorService executorService, InternalLogger internalLogger, DatastoreFileReader datastoreFileReader, DatastoreFileWriter datastoreFileWriter) {
        executorService.getClass();
        internalLogger.getClass();
        datastoreFileReader.getClass();
        datastoreFileWriter.getClass();
        this.executorService = executorService;
        this.internalLogger = internalLogger;
        this.dataStoreFileReader = datastoreFileReader;
        this.datastoreFileWriter = datastoreFileWriter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearAllData$lambda$2(DataStoreFileHandler dataStoreFileHandler) {
        dataStoreFileHandler.getClass();
        dataStoreFileHandler.datastoreFileWriter.clearAllData$dd_sdk_android_core_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeValue$lambda$1(DataStoreFileHandler dataStoreFileHandler, String str, DataStoreWriteCallback dataStoreWriteCallback) {
        dataStoreFileHandler.getClass();
        str.getClass();
        dataStoreFileHandler.datastoreFileWriter.delete$dd_sdk_android_core_release(str, dataStoreWriteCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setValue$lambda$0(DataStoreFileHandler dataStoreFileHandler, String str, Object obj, Serializer serializer, DataStoreWriteCallback dataStoreWriteCallback, int i) {
        dataStoreFileHandler.getClass();
        str.getClass();
        obj.getClass();
        serializer.getClass();
        dataStoreFileHandler.datastoreFileWriter.write$dd_sdk_android_core_release(str, obj, serializer, dataStoreWriteCallback, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void value$lambda$3(DataStoreFileHandler dataStoreFileHandler, String str, Deserializer deserializer, Integer num, DataStoreReadCallback dataStoreReadCallback) {
        dataStoreFileHandler.getClass();
        str.getClass();
        deserializer.getClass();
        dataStoreReadCallback.getClass();
        dataStoreFileHandler.dataStoreFileReader.read$dd_sdk_android_core_release(str, deserializer, num, dataStoreReadCallback);
    }

    @Override // com.datadog.android.api.storage.datastore.DataStoreHandler
    public void clearAllData() {
        ConcurrencyExtKt.executeSafe(this.executorService, "dataStoreClearAllData", this.internalLogger, new my1(this, 2));
    }

    @Override // com.datadog.android.api.storage.datastore.DataStoreHandler
    public void removeValue(final String key, final DataStoreWriteCallback callback) {
        key.getClass();
        ConcurrencyExtKt.executeSafe(this.executorService, "dataStoreRemove", this.internalLogger, new Runnable() { // from class: kf3
            @Override // java.lang.Runnable
            public final void run() {
                DataStoreFileHandler.removeValue$lambda$1(this.a, key, callback);
            }
        });
    }

    @Override // com.datadog.android.api.storage.datastore.DataStoreHandler
    public <T> void setValue(final String key, final T data, final int version, final DataStoreWriteCallback callback, final Serializer<T> serializer) {
        key.getClass();
        data.getClass();
        serializer.getClass();
        ConcurrencyExtKt.executeSafe(this.executorService, "dataStoreWrite", this.internalLogger, new Runnable() { // from class: jf3
            @Override // java.lang.Runnable
            public final void run() {
                DataStoreFileHandler.setValue$lambda$0(this.a, key, data, serializer, callback, version);
            }
        });
    }

    @Override // com.datadog.android.api.storage.datastore.DataStoreHandler
    public <T> void value(String key, Integer version, DataStoreReadCallback<T> callback, Deserializer<String, T> deserializer) {
        key.getClass();
        callback.getClass();
        deserializer.getClass();
        ConcurrencyExtKt.executeSafe(this.executorService, "dataStoreRead", this.internalLogger, new qd1(this, key, deserializer, version, callback));
    }
}
