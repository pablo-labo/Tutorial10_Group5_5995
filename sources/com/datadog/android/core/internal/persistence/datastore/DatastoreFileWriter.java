package com.datadog.android.core.internal.persistence.datastore;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.storage.datastore.DataStoreWriteCallback;
import com.datadog.android.core.internal.persistence.file.FileExtKt;
import com.datadog.android.core.internal.persistence.file.FileReaderWriter;
import com.datadog.android.core.internal.persistence.tlvformat.TLVBlock;
import com.datadog.android.core.internal.persistence.tlvformat.TLVBlockType;
import com.datadog.android.core.internal.utils.ByteArrayExtKt;
import com.datadog.android.core.internal.utils.NumberExtKt;
import com.datadog.android.core.persistence.Serializer;
import defpackage.a32;
import defpackage.gu5;
import defpackage.mj8;
import defpackage.u63;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0001,B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0013\u001a\u0004\u0018\u00010\u0012\"\b\b\u0000\u0010\u000e*\u00020\u00012\u0006\u0010\u000f\u001a\u00028\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJI\u0010!\u001a\u00020\u0019\"\b\b\u0000\u0010\u000e*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u001f\u0010 J!\u0010$\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0001¢\u0006\u0004\b\"\u0010#J\u000f\u0010&\u001a\u00020\u0019H\u0001¢\u0006\u0004\b%\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010+¨\u0006-"}, d2 = {"Lcom/datadog/android/core/internal/persistence/datastore/DatastoreFileWriter;", "", "Lcom/datadog/android/core/internal/persistence/datastore/DataStoreFileHelper;", "dataStoreFileHelper", "", "featureName", "Ljava/io/File;", "storageDir", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/core/internal/persistence/file/FileReaderWriter;", "fileReaderWriter", "<init>", "(Lcom/datadog/android/core/internal/persistence/datastore/DataStoreFileHelper;Ljava/lang/String;Ljava/io/File;Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/core/internal/persistence/file/FileReaderWriter;)V", "T", "data", "Lcom/datadog/android/core/persistence/Serializer;", "serializer", "", "getDataBlock", "(Ljava/lang/Object;Lcom/datadog/android/core/persistence/Serializer;)[B", "", "version", "getVersionCodeBlock", "(I)[B", "Lj6g;", "logFailedToSerializeDataError", "()V", "key", "Lcom/datadog/android/api/storage/datastore/DataStoreWriteCallback;", "callback", "write$dd_sdk_android_core_release", "(Ljava/lang/String;Ljava/lang/Object;Lcom/datadog/android/core/persistence/Serializer;Lcom/datadog/android/api/storage/datastore/DataStoreWriteCallback;I)V", "write", "delete$dd_sdk_android_core_release", "(Ljava/lang/String;Lcom/datadog/android/api/storage/datastore/DataStoreWriteCallback;)V", "delete", "clearAllData$dd_sdk_android_core_release", "clearAllData", "Lcom/datadog/android/core/internal/persistence/datastore/DataStoreFileHelper;", "Ljava/lang/String;", "Ljava/io/File;", "Lcom/datadog/android/api/InternalLogger;", "Lcom/datadog/android/core/internal/persistence/file/FileReaderWriter;", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class DatastoreFileWriter {
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    public static final String FAILED_TO_SERIALIZE_DATA_ERROR = "Write error - Failed to serialize data for the datastore";
    private final DataStoreFileHelper dataStoreFileHelper;
    private final String featureName;
    private final FileReaderWriter fileReaderWriter;
    private final InternalLogger internalLogger;
    private final File storageDir;

    public DatastoreFileWriter(DataStoreFileHelper dataStoreFileHelper, String str, File file, InternalLogger internalLogger, FileReaderWriter fileReaderWriter) {
        dataStoreFileHelper.getClass();
        str.getClass();
        file.getClass();
        internalLogger.getClass();
        fileReaderWriter.getClass();
        this.dataStoreFileHelper = dataStoreFileHelper;
        this.featureName = str;
        this.storageDir = file;
        this.internalLogger = internalLogger;
        this.fileReaderWriter = fileReaderWriter;
    }

    private final <T> byte[] getDataBlock(T data, Serializer<T> serializer) {
        byte[] bytes;
        String strSerialize = serializer.serialize(data);
        if (strSerialize != null) {
            bytes = strSerialize.getBytes(a32.b);
            bytes.getClass();
        } else {
            bytes = null;
        }
        if (bytes != null) {
            return TLVBlock.serialize$dd_sdk_android_core_release$default(new TLVBlock(TLVBlockType.DATA, bytes, this.internalLogger), 0, 1, null);
        }
        logFailedToSerializeDataError();
        return null;
    }

    private final byte[] getVersionCodeBlock(int version) {
        return TLVBlock.serialize$dd_sdk_android_core_release$default(new TLVBlock(TLVBlockType.VERSION_CODE, NumberExtKt.toByteArray(version), this.internalLogger), 0, 1, null);
    }

    private final void logFailedToSerializeDataError() {
        InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, (gu5) AnonymousClass1.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
    }

    public final void clearAllData$dd_sdk_android_core_release() {
        File dataStoreDirectory$dd_sdk_android_core_release = this.dataStoreFileHelper.getDataStoreDirectory$dd_sdk_android_core_release(this.storageDir, this.featureName);
        if (FileExtKt.existsSafe(dataStoreDirectory$dd_sdk_android_core_release, this.internalLogger)) {
            FileExtKt.deleteDirectoryContentsSafe(dataStoreDirectory$dd_sdk_android_core_release, this.internalLogger);
        }
    }

    public final void delete$dd_sdk_android_core_release(String key, DataStoreWriteCallback callback) {
        key.getClass();
        File dataStoreFile$dd_sdk_android_core_release = this.dataStoreFileHelper.getDataStoreFile$dd_sdk_android_core_release(this.storageDir, this.featureName, key);
        if (FileExtKt.existsSafe(dataStoreFile$dd_sdk_android_core_release, this.internalLogger)) {
            if (FileExtKt.deleteSafe(dataStoreFile$dd_sdk_android_core_release, this.internalLogger)) {
                if (callback != null) {
                    callback.onSuccess();
                }
            } else if (callback != null) {
                callback.onFailure();
            }
        }
    }

    public final <T> void write$dd_sdk_android_core_release(String key, T data, Serializer<T> serializer, DataStoreWriteCallback callback, int version) {
        key.getClass();
        data.getClass();
        serializer.getClass();
        File dataStoreFile$dd_sdk_android_core_release = this.dataStoreFileHelper.getDataStoreFile$dd_sdk_android_core_release(this.storageDir, this.featureName, key);
        byte[] versionCodeBlock = getVersionCodeBlock(version);
        byte[] dataBlock = getDataBlock(data, serializer);
        if (versionCodeBlock == null || dataBlock == null) {
            if (callback != null) {
                callback.onFailure();
                return;
            }
            return;
        }
        if (this.fileReaderWriter.writeData(dataStoreFile$dd_sdk_android_core_release, ByteArrayExtKt.join$default(u63.a0(versionCodeBlock, dataBlock), EMPTY_BYTE_ARRAY, null, null, this.internalLogger, 6, null), false)) {
            if (callback != null) {
                callback.onSuccess();
            }
        } else if (callback != null) {
            callback.onFailure();
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.datastore.DatastoreFileWriter$logFailedToSerializeDataError$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return DatastoreFileWriter.FAILED_TO_SERIALIZE_DATA_ERROR;
        }
    }
}
