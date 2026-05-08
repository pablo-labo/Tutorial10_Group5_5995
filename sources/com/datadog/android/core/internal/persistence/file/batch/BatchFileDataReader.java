package com.datadog.android.core.internal.persistence.file.batch;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.storage.RawBatchEvent;
import com.datadog.android.core.internal.persistence.Batch;
import com.datadog.android.core.internal.persistence.DataReader;
import com.datadog.android.core.internal.persistence.PayloadDecoration;
import com.datadog.android.core.internal.persistence.file.FileExtKt;
import com.datadog.android.core.internal.persistence.file.FileMover;
import com.datadog.android.core.internal.persistence.file.FileOrchestrator;
import com.datadog.android.core.internal.utils.ByteArrayExtKt;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.mj8;
import defpackage.t92;
import defpackage.wl7;
import defpackage.z92;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010!\n\u0002\b\u0004\b\u0000\u0018\u0000 72\u00020\u0001:\u00017B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0016\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001cH\u0017¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u0015H\u0017¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\u000b\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u00103R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u000e048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00068"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileDataReader;", "Lcom/datadog/android/core/internal/persistence/DataReader;", "Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "fileOrchestrator", "Lcom/datadog/android/core/internal/persistence/PayloadDecoration;", "decoration", "Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileReader;", "fileReader", "Lcom/datadog/android/core/internal/persistence/file/FileMover;", "fileMover", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;Lcom/datadog/android/core/internal/persistence/PayloadDecoration;Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileReader;Lcom/datadog/android/core/internal/persistence/file/FileMover;Lcom/datadog/android/api/InternalLogger;)V", "Ljava/io/File;", "getAndLockReadableFile", "()Ljava/io/File;", "", "fileName", "", "delete", "Lj6g;", "releaseFile", "(Ljava/lang/String;Z)V", "file", "(Ljava/io/File;Z)V", "deleteFile", "(Ljava/io/File;)V", "Lcom/datadog/android/core/internal/persistence/Batch;", "lockAndReadNext", "()Lcom/datadog/android/core/internal/persistence/Batch;", "data", "release", "(Lcom/datadog/android/core/internal/persistence/Batch;)V", "drop", "dropAll", "()V", "Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "getFileOrchestrator$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "Lcom/datadog/android/core/internal/persistence/PayloadDecoration;", "getDecoration$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/PayloadDecoration;", "Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileReader;", "getFileReader$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileReader;", "Lcom/datadog/android/core/internal/persistence/file/FileMover;", "getFileMover$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/FileMover;", "Lcom/datadog/android/api/InternalLogger;", "getInternalLogger$dd_sdk_android_core_release", "()Lcom/datadog/android/api/InternalLogger;", "", "lockedFiles", "Ljava/util/List;", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class BatchFileDataReader implements DataReader {
    public static final String WARNING_DELETE_FAILED = "Unable to delete file: %s";
    public static final String WARNING_UNKNOWN_BATCH_ID = "Attempting to unlock or delete an unknown file: %s";
    private final PayloadDecoration decoration;
    private final FileMover fileMover;
    private final FileOrchestrator fileOrchestrator;
    private final BatchFileReader fileReader;
    private final InternalLogger internalLogger;
    private final List<File> lockedFiles;

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.batch.BatchFileDataReader$deleteFile$1, reason: invalid class name */
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
            return String.format(Locale.US, "Unable to delete file: %s", Arrays.copyOf(new Object[]{this.$file.getPath()}, 1));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.batch.BatchFileDataReader$releaseFile$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05391 extends mj8 implements gu5<String> {
        final /* synthetic */ String $fileName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05391(String str) {
            super(0);
            this.$fileName = str;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, BatchFileDataReader.WARNING_UNKNOWN_BATCH_ID, Arrays.copyOf(new Object[]{this.$fileName}, 1));
        }
    }

    public BatchFileDataReader(FileOrchestrator fileOrchestrator, PayloadDecoration payloadDecoration, BatchFileReader batchFileReader, FileMover fileMover, InternalLogger internalLogger) {
        fileOrchestrator.getClass();
        payloadDecoration.getClass();
        batchFileReader.getClass();
        fileMover.getClass();
        internalLogger.getClass();
        this.fileOrchestrator = fileOrchestrator;
        this.decoration = payloadDecoration;
        this.fileReader = batchFileReader;
        this.fileMover = fileMover;
        this.internalLogger = internalLogger;
        this.lockedFiles = new ArrayList();
    }

    private final void deleteFile(File file) {
        if (this.fileMover.delete(file)) {
            return;
        }
        InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, (gu5) new AnonymousClass1(file), (Throwable) null, false, (Map) null, 56, (Object) null);
    }

    private final File getAndLockReadableFile() {
        File readableFile;
        synchronized (this.lockedFiles) {
            readableFile = this.fileOrchestrator.getReadableFile(z92.E1(this.lockedFiles));
            if (readableFile != null) {
                this.lockedFiles.add(readableFile);
            }
        }
        return readableFile;
    }

    private final void releaseFile(String fileName, boolean delete) {
        Object next;
        File file;
        synchronized (this.lockedFiles) {
            try {
                Iterator<T> it = this.lockedFiles.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (wl7.b(((File) next).getName(), fileName)) {
                            break;
                        }
                    }
                }
                file = (File) next;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (file != null) {
            releaseFile(file, delete);
        } else {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, (gu5) new C05391(fileName), (Throwable) null, false, (Map) null, 56, (Object) null);
        }
    }

    @Override // com.datadog.android.core.internal.persistence.DataReader
    public void drop(Batch data) {
        data.getClass();
        releaseFile(data.getId(), true);
    }

    @Override // com.datadog.android.core.internal.persistence.DataReader
    public void dropAll() {
        synchronized (this.lockedFiles) {
            try {
                for (Object obj : this.lockedFiles.toArray(new File[0])) {
                    releaseFile((File) obj, true);
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        for (File file : this.fileOrchestrator.getAllFiles()) {
            File metadataFile = this.fileOrchestrator.getMetadataFile(file);
            deleteFile(file);
            if (metadataFile != null && FileExtKt.existsSafe(metadataFile, this.internalLogger)) {
                deleteFile(metadataFile);
            }
        }
    }

    /* JADX INFO: renamed from: getDecoration$dd_sdk_android_core_release, reason: from getter */
    public final PayloadDecoration getDecoration() {
        return this.decoration;
    }

    /* JADX INFO: renamed from: getFileMover$dd_sdk_android_core_release, reason: from getter */
    public final FileMover getFileMover() {
        return this.fileMover;
    }

    /* JADX INFO: renamed from: getFileOrchestrator$dd_sdk_android_core_release, reason: from getter */
    public final FileOrchestrator getFileOrchestrator() {
        return this.fileOrchestrator;
    }

    /* JADX INFO: renamed from: getFileReader$dd_sdk_android_core_release, reason: from getter */
    public final BatchFileReader getFileReader() {
        return this.fileReader;
    }

    /* JADX INFO: renamed from: getInternalLogger$dd_sdk_android_core_release, reason: from getter */
    public final InternalLogger getInternalLogger() {
        return this.internalLogger;
    }

    @Override // com.datadog.android.core.internal.persistence.DataReader
    public Batch lockAndReadNext() {
        File andLockReadableFile = getAndLockReadableFile();
        if (andLockReadableFile == null) {
            return null;
        }
        List<RawBatchEvent> data = this.fileReader.readData(andLockReadableFile);
        ArrayList arrayList = new ArrayList(t92.r0(data, 10));
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            arrayList.add(((RawBatchEvent) it.next()).getData());
        }
        byte[] bArrJoin = ByteArrayExtKt.join(arrayList, this.decoration.getSeparatorBytes(), this.decoration.getPrefixBytes(), this.decoration.getSuffixBytes(), this.internalLogger);
        String name = andLockReadableFile.getName();
        name.getClass();
        return new Batch(name, bArrJoin);
    }

    @Override // com.datadog.android.core.internal.persistence.DataReader
    public void release(Batch data) {
        data.getClass();
        releaseFile(data.getId(), false);
    }

    private final void releaseFile(File file, boolean delete) {
        if (delete) {
            File metadataFile = this.fileOrchestrator.getMetadataFile(file);
            deleteFile(file);
            if (metadataFile != null && FileExtKt.existsSafe(metadataFile, this.internalLogger)) {
                deleteFile(metadataFile);
            }
        }
        synchronized (this.lockedFiles) {
            this.lockedFiles.remove(file);
        }
    }
}
