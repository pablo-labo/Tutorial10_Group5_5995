package com.datadog.android.core.internal.data.upload;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.storage.RawBatchEvent;
import com.datadog.android.core.internal.ContextProvider;
import com.datadog.android.core.internal.data.upload.DataUploader;
import com.datadog.android.core.internal.persistence.file.FileExtKt;
import com.datadog.android.core.internal.persistence.file.FileMover;
import com.datadog.android.core.internal.persistence.file.FileOrchestrator;
import com.datadog.android.core.internal.persistence.file.FileReader;
import com.datadog.android.core.internal.persistence.file.batch.BatchFileReader;
import java.io.File;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\f\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010%¨\u0006&"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/DataFlusher;", "Lcom/datadog/android/core/internal/data/upload/Flusher;", "Lcom/datadog/android/core/internal/ContextProvider;", "contextProvider", "Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "fileOrchestrator", "Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileReader;", "fileReader", "Lcom/datadog/android/core/internal/persistence/file/FileReader;", "", "metadataFileReader", "Lcom/datadog/android/core/internal/persistence/file/FileMover;", "fileMover", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/core/internal/ContextProvider;Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileReader;Lcom/datadog/android/core/internal/persistence/file/FileReader;Lcom/datadog/android/core/internal/persistence/file/FileMover;Lcom/datadog/android/api/InternalLogger;)V", "Lcom/datadog/android/core/internal/data/upload/DataUploader;", "uploader", "Lj6g;", "flush", "(Lcom/datadog/android/core/internal/data/upload/DataUploader;)V", "Lcom/datadog/android/core/internal/ContextProvider;", "getContextProvider$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/ContextProvider;", "Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "getFileOrchestrator$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileReader;", "getFileReader$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileReader;", "Lcom/datadog/android/core/internal/persistence/file/FileReader;", "getMetadataFileReader$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/FileReader;", "Lcom/datadog/android/core/internal/persistence/file/FileMover;", "getFileMover$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/FileMover;", "Lcom/datadog/android/api/InternalLogger;", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class DataFlusher implements Flusher {
    private final ContextProvider contextProvider;
    private final FileMover fileMover;
    private final FileOrchestrator fileOrchestrator;
    private final BatchFileReader fileReader;
    private final InternalLogger internalLogger;
    private final FileReader<byte[]> metadataFileReader;

    public DataFlusher(ContextProvider contextProvider, FileOrchestrator fileOrchestrator, BatchFileReader batchFileReader, FileReader<byte[]> fileReader, FileMover fileMover, InternalLogger internalLogger) {
        contextProvider.getClass();
        fileOrchestrator.getClass();
        batchFileReader.getClass();
        fileReader.getClass();
        fileMover.getClass();
        internalLogger.getClass();
        this.contextProvider = contextProvider;
        this.fileOrchestrator = fileOrchestrator;
        this.fileReader = batchFileReader;
        this.metadataFileReader = fileReader;
        this.fileMover = fileMover;
        this.internalLogger = internalLogger;
    }

    @Override // com.datadog.android.core.internal.data.upload.Flusher
    public void flush(DataUploader uploader) {
        uploader.getClass();
        DatadogContext context = this.contextProvider.getContext();
        for (File file : this.fileOrchestrator.getFlushableFiles()) {
            List<RawBatchEvent> data = this.fileReader.readData(file);
            File metadataFile = this.fileOrchestrator.getMetadataFile(file);
            DataUploader dataUploader = uploader;
            DataUploader.DefaultImpls.upload$default(dataUploader, context, data, (metadataFile == null || !FileExtKt.existsSafe(metadataFile, this.internalLogger)) ? null : this.metadataFileReader.readData(metadataFile), null, 8, null);
            this.fileMover.delete(file);
            if (metadataFile != null && FileExtKt.existsSafe(metadataFile, this.internalLogger)) {
                this.fileMover.delete(metadataFile);
            }
            uploader = dataUploader;
        }
    }

    /* JADX INFO: renamed from: getContextProvider$dd_sdk_android_core_release, reason: from getter */
    public final ContextProvider getContextProvider() {
        return this.contextProvider;
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

    public final FileReader<byte[]> getMetadataFileReader$dd_sdk_android_core_release() {
        return this.metadataFileReader;
    }
}
