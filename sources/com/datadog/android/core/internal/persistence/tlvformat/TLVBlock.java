package com.datadog.android.core.internal.persistence.tlvformat;

import com.datadog.android.api.InternalLogger;
import defpackage.gu5;
import defpackage.mj8;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/datadog/android/core/internal/persistence/tlvformat/TLVBlock;", "", "Lcom/datadog/android/core/internal/persistence/tlvformat/TLVBlockType;", "type", "", "data", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/core/internal/persistence/tlvformat/TLVBlockType;[BLcom/datadog/android/api/InternalLogger;)V", "", "entrySize", "maxEntrySize", "Lj6g;", "logEntrySizeExceededError", "(II)V", "serialize$dd_sdk_android_core_release", "(I)[B", "serialize", "Lcom/datadog/android/core/internal/persistence/tlvformat/TLVBlockType;", "getType", "()Lcom/datadog/android/core/internal/persistence/tlvformat/TLVBlockType;", "[B", "getData", "()[B", "Lcom/datadog/android/api/InternalLogger;", "getInternalLogger", "()Lcom/datadog/android/api/InternalLogger;", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class TLVBlock {
    public static final String BYTE_LENGTH_EXCEEDED_ERROR = "DataBlock length exceeds limit of %s bytes, was %s";
    private static final int MAXIMUM_DATA_SIZE_MB = 10485760;
    private final byte[] data;
    private final InternalLogger internalLogger;
    private final TLVBlockType type;

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.tlvformat.TLVBlock$logEntrySizeExceededError$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        final /* synthetic */ int $entrySize;
        final /* synthetic */ int $maxEntrySize;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, int i2) {
            super(0);
            this.$maxEntrySize = i;
            this.$entrySize = i2;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, TLVBlock.BYTE_LENGTH_EXCEEDED_ERROR, Arrays.copyOf(new Object[]{Integer.valueOf(this.$maxEntrySize), Integer.valueOf(this.$entrySize)}, 2));
        }
    }

    public TLVBlock(TLVBlockType tLVBlockType, byte[] bArr, InternalLogger internalLogger) {
        tLVBlockType.getClass();
        bArr.getClass();
        internalLogger.getClass();
        this.type = tLVBlockType;
        this.data = bArr;
        this.internalLogger = internalLogger;
    }

    private final void logEntrySizeExceededError(int entrySize, int maxEntrySize) {
        InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, (gu5) new AnonymousClass1(maxEntrySize, entrySize), (Throwable) null, false, (Map) null, 56, (Object) null);
    }

    public static /* synthetic */ byte[] serialize$dd_sdk_android_core_release$default(TLVBlock tLVBlock, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = MAXIMUM_DATA_SIZE_MB;
        }
        return tLVBlock.serialize$dd_sdk_android_core_release(i);
    }

    public final byte[] getData() {
        return this.data;
    }

    public final InternalLogger getInternalLogger() {
        return this.internalLogger;
    }

    public final TLVBlockType getType() {
        return this.type;
    }

    public final byte[] serialize$dd_sdk_android_core_release(int maxEntrySize) {
        byte[] bArr = this.data;
        if (bArr.length == 0) {
            return null;
        }
        int length = bArr.length;
        int i = 6 + length;
        if (i > maxEntrySize) {
            logEntrySizeExceededError(i, maxEntrySize);
            return null;
        }
        return ByteBuffer.allocate(i).putShort(this.type.getRawValue()).putInt(length).put(this.data).array();
    }
}
