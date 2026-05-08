package com.datadog.android.core.internal.persistence.file.batch;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.storage.RawBatchEvent;
import com.datadog.android.core.internal.persistence.file.FileExtKt;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.l5;
import defpackage.mj8;
import defpackage.u63;
import defpackage.w20;
import defpackage.w40;
import defpackage.zr4;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\n\b\u0000\u0018\u0000 )2\u00020\u0001:\u0003*+)B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010#\u001a\u00020 *\u00020 2\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J'\u0010%\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b'\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(¨\u0006,"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/batch/PlainBatchFileReaderWriter;", "Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileReaderWriter;", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/api/InternalLogger;)V", "Ljava/io/File;", "file", "", "append", "Lcom/datadog/android/api/storage/RawBatchEvent;", "data", "Lj6g;", "lockFileAndWriteData", "(Ljava/io/File;ZLcom/datadog/android/api/storage/RawBatchEvent;)V", "", "readFileData", "(Ljava/io/File;)Ljava/util/List;", "Ljava/io/InputStream;", "stream", "Lcom/datadog/android/core/internal/persistence/file/batch/PlainBatchFileReaderWriter$BlockType;", "expectedBlockType", "Lcom/datadog/android/core/internal/persistence/file/batch/PlainBatchFileReaderWriter$BlockReadResult;", "readBlock", "(Ljava/io/InputStream;Lcom/datadog/android/core/internal/persistence/file/batch/PlainBatchFileReaderWriter$BlockType;)Lcom/datadog/android/core/internal/persistence/file/batch/PlainBatchFileReaderWriter$BlockReadResult;", "", "expected", "actual", "", "operation", "checkReadExpected", "(IILjava/lang/String;)Z", "Ljava/nio/ByteBuffer;", "blockType", "", "putAsTlv", "(Ljava/nio/ByteBuffer;Lcom/datadog/android/core/internal/persistence/file/batch/PlainBatchFileReaderWriter$BlockType;[B)Ljava/nio/ByteBuffer;", "writeData", "(Ljava/io/File;Lcom/datadog/android/api/storage/RawBatchEvent;Z)Z", "readData", "Lcom/datadog/android/api/InternalLogger;", "Companion", "BlockReadResult", "BlockType", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class PlainBatchFileReaderWriter implements BatchFileReaderWriter {
    public static final String ERROR_READ = "Unable to read data from file: %s";
    public static final String ERROR_WRITE = "Unable to write data to file: %s";
    public static final int HEADER_SIZE_BYTES = 6;
    public static final int LENGTH_SIZE_BYTES = 4;
    public static final int TYPE_SIZE_BYTES = 2;
    public static final String WARNING_NOT_ALL_DATA_READ = "File %s is probably corrupted, not all content was read.";
    private final InternalLogger internalLogger;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/batch/PlainBatchFileReaderWriter$BlockReadResult;", "", "data", "", "bytesRead", "", "([BI)V", "getBytesRead", "()I", "getData", "()[B", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class BlockReadResult {
        private final int bytesRead;
        private final byte[] data;

        public BlockReadResult(byte[] bArr, int i) {
            this.data = bArr;
            this.bytesRead = i;
        }

        public final int getBytesRead() {
            return this.bytesRead;
        }

        public final byte[] getData() {
            return this.data;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\n\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/batch/PlainBatchFileReaderWriter$BlockType;", "", "identifier", "", "(Ljava/lang/String;IS)V", "getIdentifier", "()S", "EVENT", "META", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum BlockType {
        EVENT(0),
        META(1);

        private final short identifier;

        BlockType(short s) {
            this.identifier = s;
        }

        public final short getIdentifier() {
            return this.identifier;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter$checkReadExpected$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        final /* synthetic */ int $actual;
        final /* synthetic */ int $expected;
        final /* synthetic */ String $operation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, int i, int i2) {
            super(0);
            this.$operation = str;
            this.$expected = i;
            this.$actual = i2;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            String str = this.$operation;
            int i = this.$expected;
            int i2 = this.$actual;
            StringBuilder sbH = w40.h(i, "Number of bytes read for operation='", str, "' doesn't match with expected: expected=", ", actual=");
            sbH.append(i2);
            return sbH.toString();
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter$checkReadExpected$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements gu5<String> {
        final /* synthetic */ String $operation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str) {
            super(0);
            this.$operation = str;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return l5.l("Unexpected EOF at the operation=", this.$operation);
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter$readBlock$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05431 extends mj8 implements gu5<String> {
        final /* synthetic */ short $blockType;
        final /* synthetic */ BlockType $expectedBlockType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05431(short s, BlockType blockType) {
            super(0);
            this.$blockType = s;
            this.$expectedBlockType = blockType;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            short s = this.$blockType;
            BlockType blockType = this.$expectedBlockType;
            short identifier = blockType.getIdentifier();
            StringBuilder sb = new StringBuilder("Unexpected block type identifier=");
            sb.append((int) s);
            sb.append(" met, was expecting ");
            sb.append(blockType);
            sb.append("(");
            return w20.k(sb, identifier, ")");
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter$readData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05441 extends mj8 implements gu5<String> {
        final /* synthetic */ File $file;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05441(File file) {
            super(0);
            this.$file = file;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, "Unable to read data from file: %s", Arrays.copyOf(new Object[]{this.$file.getPath()}, 1));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter$readFileData$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05462 extends mj8 implements gu5<String> {
        final /* synthetic */ File $file;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05462(File file) {
            super(0);
            this.$file = file;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, PlainBatchFileReaderWriter.WARNING_NOT_ALL_DATA_READ, Arrays.copyOf(new Object[]{this.$file.getPath()}, 1));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter$writeData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05471 extends mj8 implements gu5<String> {
        final /* synthetic */ File $file;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05471(File file) {
            super(0);
            this.$file = file;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, "Unable to write data to file: %s", Arrays.copyOf(new Object[]{this.$file.getPath()}, 1));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter$writeData$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05482 extends mj8 implements gu5<String> {
        final /* synthetic */ File $file;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05482(File file) {
            super(0);
            this.$file = file;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, "Unable to write data to file: %s", Arrays.copyOf(new Object[]{this.$file.getPath()}, 1));
        }
    }

    public PlainBatchFileReaderWriter(InternalLogger internalLogger) {
        internalLogger.getClass();
        this.internalLogger = internalLogger;
    }

    private final boolean checkReadExpected(int expected, int actual, String operation) {
        if (expected == actual) {
            return true;
        }
        InternalLogger internalLogger = this.internalLogger;
        if (actual != -1) {
            InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, (gu5) new AnonymousClass1(operation, expected, actual), (Throwable) null, false, (Map) null, 56, (Object) null);
            return false;
        }
        InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, (gu5) new AnonymousClass2(operation), (Throwable) null, false, (Map) null, 56, (Object) null);
        return false;
    }

    private final void lockFileAndWriteData(File file, boolean append, RawBatchEvent data) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file, append);
        try {
            FileLock fileLockLock = fileOutputStream.getChannel().lock();
            fileLockLock.getClass();
            try {
                byte[] metadata = data.getMetadata();
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(data.getData().length + 6 + metadata.length + 6);
                byteBufferAllocate.getClass();
                fileOutputStream.write(putAsTlv(putAsTlv(byteBufferAllocate, BlockType.META, metadata), BlockType.EVENT, data.getData()).array());
                j6g j6gVar = j6g.a;
                fileOutputStream.close();
            } finally {
                fileLockLock.release();
            }
        } finally {
        }
    }

    private final ByteBuffer putAsTlv(ByteBuffer byteBuffer, BlockType blockType, byte[] bArr) {
        ByteBuffer byteBufferPut = byteBuffer.putShort(blockType.getIdentifier()).putInt(bArr.length).put(bArr);
        byteBufferPut.getClass();
        return byteBufferPut;
    }

    private final BlockReadResult readBlock(InputStream stream, BlockType expectedBlockType) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        int i = stream.read(byteBufferAllocate.array());
        if (!checkReadExpected(6, i, l5.m("Block(", expectedBlockType.name(), "): Header read"))) {
            return new BlockReadResult(null, Math.max(0, i));
        }
        short s = byteBufferAllocate.getShort();
        if (s != expectedBlockType.getIdentifier()) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, (gu5) new C05431(s, expectedBlockType), (Throwable) null, false, (Map) null, 56, (Object) null);
            return new BlockReadResult(null, i);
        }
        int i2 = byteBufferAllocate.getInt();
        byte[] bArr = new byte[i2];
        int i3 = stream.read(bArr);
        return checkReadExpected(i2, i3, l5.m("Block(", expectedBlockType.name(), "):Data read")) ? new BlockReadResult(bArr, i + i3) : new BlockReadResult(null, Math.max(0, i3) + i);
    }

    private final List<RawBatchEvent> readFileData(File file) throws IOException {
        int iLengthSafe = (int) FileExtKt.lengthSafe(file, this.internalLogger);
        ArrayList arrayList = new ArrayList();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 8192);
        int bytesRead = iLengthSafe;
        while (true) {
            if (bytesRead <= 0) {
                break;
            }
            try {
                BlockReadResult block = readBlock(bufferedInputStream, BlockType.META);
                if (block.getData() != null) {
                    BlockReadResult block2 = readBlock(bufferedInputStream, BlockType.EVENT);
                    bytesRead -= block.getBytesRead() + block2.getBytesRead();
                    if (block2.getData() == null) {
                        break;
                    }
                    arrayList.add(new RawBatchEvent(block2.getData(), block.getData()));
                } else {
                    bytesRead -= block.getBytesRead();
                    break;
                }
            } finally {
            }
        }
        j6g j6gVar = j6g.a;
        bufferedInputStream.close();
        if (bytesRead == 0 && (iLengthSafe <= 0 || !arrayList.isEmpty())) {
            return arrayList;
        }
        InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY), (gu5) new C05462(file), (Throwable) null, false, (Map) null, 56, (Object) null);
        return arrayList;
    }

    @Override // com.datadog.android.core.internal.persistence.file.batch.BatchFileReader
    public List<RawBatchEvent> readData(File file) {
        file.getClass();
        try {
            return readFileData(file);
        } catch (IOException e) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) new C05441(file), (Throwable) e, false, (Map) null, 48, (Object) null);
            return zr4.a;
        } catch (SecurityException e2) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) C05452.INSTANCE, (Throwable) e2, false, (Map) null, 48, (Object) null);
            return zr4.a;
        }
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileWriter
    public boolean writeData(File file, RawBatchEvent data, boolean append) {
        file.getClass();
        data.getClass();
        try {
            lockFileAndWriteData(file, append, data);
            return true;
        } catch (IOException e) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) new C05471(file), (Throwable) e, false, (Map) null, 48, (Object) null);
            return false;
        } catch (SecurityException e2) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) new C05482(file), (Throwable) e2, false, (Map) null, 48, (Object) null);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter$readData$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05452 extends mj8 implements gu5<String> {
        public static final C05452 INSTANCE = new C05452();

        public C05452() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "ERROR_READ.format(Locale.US, file.path)";
        }
    }
}
