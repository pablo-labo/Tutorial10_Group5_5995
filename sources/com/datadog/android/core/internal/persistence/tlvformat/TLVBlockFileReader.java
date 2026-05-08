package com.datadog.android.core.internal.persistence.tlvformat;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.persistence.file.FileReaderWriter;
import com.datadog.android.core.internal.utils.ByteArrayExtKt;
import defpackage.gu5;
import defpackage.mj8;
import defpackage.wl7;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\f\b\u0000\u0018\u0000 &2\u00020\u0001:\u0002&'B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/datadog/android/core/internal/persistence/tlvformat/TLVBlockFileReader;", "", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/core/internal/persistence/file/FileReaderWriter;", "fileReaderWriter", "<init>", "(Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/core/internal/persistence/file/FileReaderWriter;)V", "", "inputArray", "", "currentIndex", "Lcom/datadog/android/core/internal/persistence/tlvformat/TLVBlockFileReader$TLVResult;", "Lcom/datadog/android/core/internal/persistence/tlvformat/TLVBlock;", "readBlock", "([BI)Lcom/datadog/android/core/internal/persistence/tlvformat/TLVBlockFileReader$TLVResult;", "Lcom/datadog/android/core/internal/persistence/tlvformat/TLVBlockType;", "readType", "readData", "", "shortValue", "Lj6g;", "logTypeCorruptionError", "(S)V", "logFailedToDeserializeError", "()V", "Ljava/io/File;", "file", "", "read$dd_sdk_android_core_release", "(Ljava/io/File;)Ljava/util/List;", "read", "Lcom/datadog/android/api/InternalLogger;", "getInternalLogger", "()Lcom/datadog/android/api/InternalLogger;", "Lcom/datadog/android/core/internal/persistence/file/FileReaderWriter;", "getFileReaderWriter", "()Lcom/datadog/android/core/internal/persistence/file/FileReaderWriter;", "Companion", "TLVResult", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class TLVBlockFileReader {
    public static final String CORRUPT_TLV_HEADER_TYPE_ERROR = "TLV header corrupt. Invalid type %s";
    public static final String FAILED_TO_DESERIALIZE_ERROR = "Failed to deserialize TLV data length";
    private final FileReaderWriter fileReaderWriter;
    private final InternalLogger internalLogger;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0005HÆ\u0003J(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/datadog/android/core/internal/persistence/tlvformat/TLVBlockFileReader$TLVResult;", "T", "", "data", "newIndex", "", "(Ljava/lang/Object;I)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getNewIndex", "()I", "component1", "component2", "copy", "(Ljava/lang/Object;I)Lcom/datadog/android/core/internal/persistence/tlvformat/TLVBlockFileReader$TLVResult;", "equals", "", "other", "hashCode", "toString", "", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class TLVResult<T> {
        private final T data;
        private final int newIndex;

        public TLVResult(T t, int i) {
            t.getClass();
            this.data = t;
            this.newIndex = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TLVResult copy$default(TLVResult tLVResult, Object obj, int i, int i2, Object obj2) {
            if ((i2 & 1) != 0) {
                obj = tLVResult.data;
            }
            if ((i2 & 2) != 0) {
                i = tLVResult.newIndex;
            }
            return tLVResult.copy(obj, i);
        }

        public final T component1() {
            return this.data;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getNewIndex() {
            return this.newIndex;
        }

        public final TLVResult<T> copy(T data, int newIndex) {
            data.getClass();
            return new TLVResult<>(data, newIndex);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TLVResult)) {
                return false;
            }
            TLVResult tLVResult = (TLVResult) other;
            return wl7.b(this.data, tLVResult.data) && this.newIndex == tLVResult.newIndex;
        }

        public final T getData() {
            return this.data;
        }

        public final int getNewIndex() {
            return this.newIndex;
        }

        public int hashCode() {
            return Integer.hashCode(this.newIndex) + (this.data.hashCode() * 31);
        }

        public String toString() {
            return "TLVResult(data=" + this.data + ", newIndex=" + this.newIndex + ")";
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.tlvformat.TLVBlockFileReader$logTypeCorruptionError$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05491 extends mj8 implements gu5<String> {
        final /* synthetic */ short $shortValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05491(short s) {
            super(0);
            this.$shortValue = s;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, TLVBlockFileReader.CORRUPT_TLV_HEADER_TYPE_ERROR, Arrays.copyOf(new Object[]{Short.valueOf(this.$shortValue)}, 1));
        }
    }

    public TLVBlockFileReader(InternalLogger internalLogger, FileReaderWriter fileReaderWriter) {
        internalLogger.getClass();
        fileReaderWriter.getClass();
        this.internalLogger = internalLogger;
        this.fileReaderWriter = fileReaderWriter;
    }

    private final void logFailedToDeserializeError() {
        InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, (gu5) AnonymousClass1.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
    }

    private final void logTypeCorruptionError(short shortValue) {
        InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, (gu5) new C05491(shortValue), (Throwable) null, false, (Map) null, 56, (Object) null);
    }

    private final TLVResult<TLVBlock> readBlock(byte[] inputArray, int currentIndex) {
        TLVResult<byte[]> data;
        TLVResult<TLVBlockType> type = readType(inputArray, currentIndex);
        if (type == null || (data = readData(inputArray, type.getNewIndex())) == null) {
            return null;
        }
        return new TLVResult<>(new TLVBlock(type.getData(), data.getData(), this.internalLogger), data.getNewIndex());
    }

    private final TLVResult<byte[]> readData(byte[] inputArray, int currentIndex) {
        int i = currentIndex + 4;
        if (i > inputArray.length) {
            logFailedToDeserializeError();
            return null;
        }
        int i2 = ByteArrayExtKt.toInt(ByteArrayExtKt.copyOfRangeSafe(inputArray, currentIndex, i)) + i;
        return new TLVResult<>(ByteArrayExtKt.copyOfRangeSafe(inputArray, i, i2), i2);
    }

    private final TLVResult<TLVBlockType> readType(byte[] inputArray, int currentIndex) {
        int i = currentIndex + 2;
        if (i > inputArray.length) {
            logFailedToDeserializeError();
            return null;
        }
        short s = ByteArrayExtKt.toShort(ByteArrayExtKt.copyOfRangeSafe(inputArray, currentIndex, i));
        TLVBlockType tLVBlockTypeM18fromValuexj2QHRw = TLVBlockType.INSTANCE.m18fromValuexj2QHRw(s);
        if (tLVBlockTypeM18fromValuexj2QHRw != null) {
            return new TLVResult<>(tLVBlockTypeM18fromValuexj2QHRw, i);
        }
        logTypeCorruptionError(s);
        return null;
    }

    public final FileReaderWriter getFileReaderWriter() {
        return this.fileReaderWriter;
    }

    public final InternalLogger getInternalLogger() {
        return this.internalLogger;
    }

    public final List<TLVBlock> read$dd_sdk_android_core_release(File file) {
        TLVResult<TLVBlock> block;
        file.getClass();
        byte[] data = this.fileReaderWriter.readData(file);
        ArrayList arrayList = new ArrayList();
        int newIndex = 0;
        while (newIndex < data.length && (block = readBlock(data, newIndex)) != null) {
            arrayList.add(block.getData());
            newIndex = block.getNewIndex();
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.tlvformat.TLVBlockFileReader$logFailedToDeserializeError$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return TLVBlockFileReader.FAILED_TO_DESERIALIZE_ERROR;
        }
    }
}
