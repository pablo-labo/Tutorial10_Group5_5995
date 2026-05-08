package com.datadog.android.core.internal.persistence.datastore;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.storage.datastore.DataStoreReadCallback;
import com.datadog.android.core.internal.persistence.Deserializer;
import com.datadog.android.core.internal.persistence.file.FileExtKt;
import com.datadog.android.core.internal.persistence.tlvformat.TLVBlock;
import com.datadog.android.core.internal.persistence.tlvformat.TLVBlockFileReader;
import com.datadog.android.core.internal.persistence.tlvformat.TLVBlockType;
import com.datadog.android.core.internal.utils.ByteArrayExtKt;
import com.datadog.android.core.persistence.datastore.DataStoreContent;
import defpackage.a32;
import defpackage.gu5;
import defpackage.mj8;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u0000 /2\u00020\u0001:\u0001/B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJU\u0010\u0017\u001a\u00020\u0016\"\b\b\u0000\u0010\u000e*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00062\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018JC\u0010\u001d\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001c\"\b\b\u0000\u0010\u000e*\u00020\u00012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00102\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0012H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0016H\u0002¢\u0006\u0004\b#\u0010$JO\u0010)\u001a\u00020\u0016\"\b\b\u0000\u0010\u000e*\u00020\u00012\u0006\u0010%\u001a\u00020\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00102\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0001¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010-R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010.¨\u00060"}, d2 = {"Lcom/datadog/android/core/internal/persistence/datastore/DatastoreFileReader;", "", "Lcom/datadog/android/core/internal/persistence/datastore/DataStoreFileHelper;", "dataStoreFileHelper", "", "featureName", "Ljava/io/File;", "storageDir", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/core/internal/persistence/tlvformat/TLVBlockFileReader;", "tlvBlockFileReader", "<init>", "(Lcom/datadog/android/core/internal/persistence/datastore/DataStoreFileHelper;Ljava/lang/String;Ljava/io/File;Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/core/internal/persistence/tlvformat/TLVBlockFileReader;)V", "T", "datastoreFile", "Lcom/datadog/android/core/internal/persistence/Deserializer;", "deserializer", "", "requestedVersion", "Lcom/datadog/android/api/storage/datastore/DataStoreReadCallback;", "callback", "Lj6g;", "readFromDataStoreFile", "(Ljava/io/File;Lcom/datadog/android/core/internal/persistence/Deserializer;Lcom/datadog/android/core/internal/persistence/tlvformat/TLVBlockFileReader;Ljava/lang/Integer;Lcom/datadog/android/api/storage/datastore/DataStoreReadCallback;)V", "", "Lcom/datadog/android/core/internal/persistence/tlvformat/TLVBlock;", "tlvBlocks", "Lcom/datadog/android/core/persistence/datastore/DataStoreContent;", "mapToDataStoreContents", "(Lcom/datadog/android/core/internal/persistence/Deserializer;Ljava/util/List;)Lcom/datadog/android/core/persistence/datastore/DataStoreContent;", "numberBlocksFound", "numberBlocksExpected", "logInvalidNumberOfBlocksError", "(II)V", "logBlocksInUnexpectedBlocksOrderError", "()V", "key", "version", "read$dd_sdk_android_core_release", "(Ljava/lang/String;Lcom/datadog/android/core/internal/persistence/Deserializer;Ljava/lang/Integer;Lcom/datadog/android/api/storage/datastore/DataStoreReadCallback;)V", "read", "Lcom/datadog/android/core/internal/persistence/datastore/DataStoreFileHelper;", "Ljava/lang/String;", "Ljava/io/File;", "Lcom/datadog/android/api/InternalLogger;", "Lcom/datadog/android/core/internal/persistence/tlvformat/TLVBlockFileReader;", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class DatastoreFileReader {
    public static final String INVALID_NUMBER_OF_BLOCKS_ERROR = "Read error - datastore entry has invalid number of blocks. Was: %d, expected: %d";
    public static final String UNEXPECTED_BLOCKS_ORDER_ERROR = "Read error - blocks are in an unexpected order";
    private final DataStoreFileHelper dataStoreFileHelper;
    private final String featureName;
    private final InternalLogger internalLogger;
    private final File storageDir;
    private final TLVBlockFileReader tlvBlockFileReader;

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.datastore.DatastoreFileReader$logInvalidNumberOfBlocksError$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05191 extends mj8 implements gu5<String> {
        final /* synthetic */ int $numberBlocksExpected;
        final /* synthetic */ int $numberBlocksFound;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05191(int i, int i2) {
            super(0);
            this.$numberBlocksFound = i;
            this.$numberBlocksExpected = i2;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, DatastoreFileReader.INVALID_NUMBER_OF_BLOCKS_ERROR, Arrays.copyOf(new Object[]{Integer.valueOf(this.$numberBlocksFound), Integer.valueOf(this.$numberBlocksExpected)}, 2));
        }
    }

    public DatastoreFileReader(DataStoreFileHelper dataStoreFileHelper, String str, File file, InternalLogger internalLogger, TLVBlockFileReader tLVBlockFileReader) {
        dataStoreFileHelper.getClass();
        str.getClass();
        file.getClass();
        internalLogger.getClass();
        tLVBlockFileReader.getClass();
        this.dataStoreFileHelper = dataStoreFileHelper;
        this.featureName = str;
        this.storageDir = file;
        this.internalLogger = internalLogger;
        this.tlvBlockFileReader = tLVBlockFileReader;
    }

    private final void logBlocksInUnexpectedBlocksOrderError() {
        InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, (gu5) AnonymousClass1.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
    }

    private final void logInvalidNumberOfBlocksError(int numberBlocksFound, int numberBlocksExpected) {
        InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, (gu5) new C05191(numberBlocksFound, numberBlocksExpected), (Throwable) null, false, (Map) null, 56, (Object) null);
    }

    private final <T> DataStoreContent<T> mapToDataStoreContents(Deserializer<String, T> deserializer, List<TLVBlock> tlvBlocks) {
        if (tlvBlocks.get(0).getType() != TLVBlockType.VERSION_CODE && tlvBlocks.get(1).getType() != TLVBlockType.DATA) {
            logBlocksInUnexpectedBlocksOrderError();
            return null;
        }
        return new DataStoreContent<>(ByteArrayExtKt.toInt(tlvBlocks.get(0).getData()), deserializer.deserialize(new String(tlvBlocks.get(1).getData(), a32.b)));
    }

    public static /* synthetic */ void read$dd_sdk_android_core_release$default(DatastoreFileReader datastoreFileReader, String str, Deserializer deserializer, Integer num, DataStoreReadCallback dataStoreReadCallback, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        datastoreFileReader.read$dd_sdk_android_core_release(str, deserializer, num, dataStoreReadCallback);
    }

    private final <T> void readFromDataStoreFile(File datastoreFile, Deserializer<String, T> deserializer, TLVBlockFileReader tlvBlockFileReader, Integer requestedVersion, DataStoreReadCallback<T> callback) {
        List<TLVBlock> list = tlvBlockFileReader.read$dd_sdk_android_core_release(datastoreFile);
        int size = list.size();
        int length = TLVBlockType.values().length;
        if (size != length) {
            logInvalidNumberOfBlocksError(size, length);
            callback.onFailure();
            return;
        }
        DataStoreContent<T> dataStoreContentMapToDataStoreContents = mapToDataStoreContents(deserializer, list);
        if (dataStoreContentMapToDataStoreContents == null) {
            callback.onFailure();
            return;
        }
        if (requestedVersion != null) {
            if (requestedVersion.intValue() != dataStoreContentMapToDataStoreContents.getVersionCode()) {
                callback.onSuccess(null);
                return;
            }
        }
        callback.onSuccess(dataStoreContentMapToDataStoreContents);
    }

    public final <T> void read$dd_sdk_android_core_release(String key, Deserializer<String, T> deserializer, Integer version, DataStoreReadCallback<T> callback) {
        key.getClass();
        deserializer.getClass();
        callback.getClass();
        File dataStoreFile$dd_sdk_android_core_release = this.dataStoreFileHelper.getDataStoreFile$dd_sdk_android_core_release(this.storageDir, this.featureName, key);
        if (FileExtKt.existsSafe(dataStoreFile$dd_sdk_android_core_release, this.internalLogger)) {
            readFromDataStoreFile(dataStoreFile$dd_sdk_android_core_release, deserializer, this.tlvBlockFileReader, version, callback);
        } else {
            callback.onSuccess(null);
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.datastore.DatastoreFileReader$logBlocksInUnexpectedBlocksOrderError$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return DatastoreFileReader.UNEXPECTED_BLOCKS_ORDER_ERROR;
        }
    }
}
