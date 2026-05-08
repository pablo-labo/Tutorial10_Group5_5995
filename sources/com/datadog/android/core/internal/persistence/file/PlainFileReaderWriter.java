package com.datadog.android.core.internal.persistence.file;

import com.datadog.android.api.InternalLogger;
import defpackage.gu5;
import defpackage.hb5;
import defpackage.j6g;
import defpackage.mj8;
import defpackage.u63;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/PlainFileReaderWriter;", "Lcom/datadog/android/core/internal/persistence/file/FileReaderWriter;", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/api/InternalLogger;)V", "Ljava/io/File;", "file", "", "append", "", "data", "Lj6g;", "lockFileAndWriteData", "(Ljava/io/File;Z[B)V", "writeData", "(Ljava/io/File;[BZ)Z", "readData", "(Ljava/io/File;)[B", "Lcom/datadog/android/api/InternalLogger;", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class PlainFileReaderWriter implements FileReaderWriter {
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    public static final String ERROR_READ = "Unable to read data from file: %s";
    public static final String ERROR_WRITE = "Unable to write data to file: %s";
    private final InternalLogger internalLogger;

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.PlainFileReaderWriter$readData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        final /* synthetic */ File $file;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(File file) {
            super(0);
            this.$file = file;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, "Unable to read data from file: %s", Arrays.copyOf(new Object[]{this.$file.getPath()}, 1));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.PlainFileReaderWriter$readData$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements gu5<String> {
        final /* synthetic */ File $file;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(File file) {
            super(0);
            this.$file = file;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, "Unable to read data from file: %s", Arrays.copyOf(new Object[]{this.$file.getPath()}, 1));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.PlainFileReaderWriter$readData$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass3 extends mj8 implements gu5<String> {
        final /* synthetic */ File $file;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(File file) {
            super(0);
            this.$file = file;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, "Unable to read data from file: %s", Arrays.copyOf(new Object[]{this.$file.getPath()}, 1));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.PlainFileReaderWriter$readData$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass4 extends mj8 implements gu5<String> {
        final /* synthetic */ File $file;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(File file) {
            super(0);
            this.$file = file;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, "Unable to read data from file: %s", Arrays.copyOf(new Object[]{this.$file.getPath()}, 1));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.PlainFileReaderWriter$writeData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05371 extends mj8 implements gu5<String> {
        final /* synthetic */ File $file;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05371(File file) {
            super(0);
            this.$file = file;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, "Unable to write data to file: %s", Arrays.copyOf(new Object[]{this.$file.getPath()}, 1));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.PlainFileReaderWriter$writeData$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05382 extends mj8 implements gu5<String> {
        final /* synthetic */ File $file;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05382(File file) {
            super(0);
            this.$file = file;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, "Unable to write data to file: %s", Arrays.copyOf(new Object[]{this.$file.getPath()}, 1));
        }
    }

    public PlainFileReaderWriter(InternalLogger internalLogger) {
        internalLogger.getClass();
        this.internalLogger = internalLogger;
    }

    private final void lockFileAndWriteData(File file, boolean append, byte[] data) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file, append);
        try {
            FileLock fileLockLock = fileOutputStream.getChannel().lock();
            fileLockLock.getClass();
            try {
                fileOutputStream.write(data);
                j6g j6gVar = j6g.a;
                fileOutputStream.close();
            } finally {
                fileLockLock.release();
            }
        } finally {
        }
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileReader
    public byte[] readData(File file) {
        file.getClass();
        try {
            if (!file.exists()) {
                InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) new AnonymousClass1(file), (Throwable) null, false, (Map) null, 56, (Object) null);
                return EMPTY_BYTE_ARRAY;
            }
            if (!file.isDirectory()) {
                return hb5.S(file);
            }
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) new AnonymousClass2(file), (Throwable) null, false, (Map) null, 56, (Object) null);
            return EMPTY_BYTE_ARRAY;
        } catch (IOException e) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) new AnonymousClass3(file), (Throwable) e, false, (Map) null, 48, (Object) null);
            return EMPTY_BYTE_ARRAY;
        } catch (SecurityException e2) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) new AnonymousClass4(file), (Throwable) e2, false, (Map) null, 48, (Object) null);
            return EMPTY_BYTE_ARRAY;
        }
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileWriter
    public boolean writeData(File file, byte[] data, boolean append) {
        file.getClass();
        data.getClass();
        try {
            lockFileAndWriteData(file, append, data);
            return true;
        } catch (IOException e) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) new C05371(file), (Throwable) e, false, (Map) null, 48, (Object) null);
            return false;
        } catch (SecurityException e2) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) new C05382(file), (Throwable) e2, false, (Map) null, 48, (Object) null);
            return false;
        }
    }
}
