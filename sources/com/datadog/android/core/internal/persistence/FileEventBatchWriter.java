package com.datadog.android.core.internal.persistence;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.storage.EventBatchWriter;
import com.datadog.android.api.storage.EventType;
import com.datadog.android.api.storage.RawBatchEvent;
import com.datadog.android.core.internal.persistence.file.FileExtKt;
import com.datadog.android.core.internal.persistence.file.FilePersistenceConfig;
import com.datadog.android.core.internal.persistence.file.FileReaderWriter;
import com.datadog.android.core.internal.persistence.file.FileWriter;
import defpackage.gu5;
import defpackage.mj8;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001'B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0015H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010 \u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\"R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010&¨\u0006("}, d2 = {"Lcom/datadog/android/core/internal/persistence/FileEventBatchWriter;", "Lcom/datadog/android/api/storage/EventBatchWriter;", "Ljava/io/File;", "batchFile", "metadataFile", "Lcom/datadog/android/core/internal/persistence/file/FileWriter;", "Lcom/datadog/android/api/storage/RawBatchEvent;", "eventsWriter", "Lcom/datadog/android/core/internal/persistence/file/FileReaderWriter;", "metadataReaderWriter", "Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;", "filePersistenceConfig", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Ljava/io/File;Ljava/io/File;Lcom/datadog/android/core/internal/persistence/file/FileWriter;Lcom/datadog/android/core/internal/persistence/file/FileReaderWriter;Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;Lcom/datadog/android/api/InternalLogger;)V", "", "eventSize", "", "checkEventSize", "(I)Z", "", "metadata", "Lj6g;", "writeBatchMetadata", "(Ljava/io/File;[B)V", "currentMetadata", "()[B", "event", "batchMetadata", "Lcom/datadog/android/api/storage/EventType;", "eventType", "write", "(Lcom/datadog/android/api/storage/RawBatchEvent;[BLcom/datadog/android/api/storage/EventType;)Z", "Ljava/io/File;", "Lcom/datadog/android/core/internal/persistence/file/FileWriter;", "Lcom/datadog/android/core/internal/persistence/file/FileReaderWriter;", "Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;", "Lcom/datadog/android/api/InternalLogger;", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class FileEventBatchWriter implements EventBatchWriter {
    public static final String ERROR_LARGE_DATA = "Can't write data with size %d (max item size is %d)";
    public static final String WARNING_METADATA_WRITE_FAILED = "Unable to write metadata file: %s";
    private final File batchFile;
    private final FileWriter<RawBatchEvent> eventsWriter;
    private final FilePersistenceConfig filePersistenceConfig;
    private final InternalLogger internalLogger;
    private final File metadataFile;
    private final FileReaderWriter metadataReaderWriter;

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.FileEventBatchWriter$checkEventSize$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        final /* synthetic */ int $eventSize;
        final /* synthetic */ FileEventBatchWriter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, FileEventBatchWriter fileEventBatchWriter) {
            super(0);
            this.$eventSize = i;
            this.this$0 = fileEventBatchWriter;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, "Can't write data with size %d (max item size is %d)", Arrays.copyOf(new Object[]{Integer.valueOf(this.$eventSize), Long.valueOf(this.this$0.filePersistenceConfig.getMaxItemSize())}, 2));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.FileEventBatchWriter$writeBatchMetadata$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05181 extends mj8 implements gu5<String> {
        final /* synthetic */ File $metadataFile;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05181(File file) {
            super(0);
            this.$metadataFile = file;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, FileEventBatchWriter.WARNING_METADATA_WRITE_FAILED, Arrays.copyOf(new Object[]{this.$metadataFile.getPath()}, 1));
        }
    }

    public FileEventBatchWriter(File file, File file2, FileWriter<RawBatchEvent> fileWriter, FileReaderWriter fileReaderWriter, FilePersistenceConfig filePersistenceConfig, InternalLogger internalLogger) {
        file.getClass();
        fileWriter.getClass();
        fileReaderWriter.getClass();
        filePersistenceConfig.getClass();
        internalLogger.getClass();
        this.batchFile = file;
        this.metadataFile = file2;
        this.eventsWriter = fileWriter;
        this.metadataReaderWriter = fileReaderWriter;
        this.filePersistenceConfig = filePersistenceConfig;
        this.internalLogger = internalLogger;
    }

    private final boolean checkEventSize(int eventSize) {
        if (eventSize <= this.filePersistenceConfig.getMaxItemSize()) {
            return true;
        }
        InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) new AnonymousClass1(eventSize, this), (Throwable) null, false, (Map) null, 56, (Object) null);
        return false;
    }

    private final void writeBatchMetadata(File metadataFile, byte[] metadata) {
        if (this.metadataReaderWriter.writeData(metadataFile, metadata, false)) {
            return;
        }
        InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) new C05181(metadataFile), (Throwable) null, false, (Map) null, 56, (Object) null);
    }

    @Override // com.datadog.android.api.storage.EventBatchWriter
    public byte[] currentMetadata() {
        File file = this.metadataFile;
        if (file == null || !FileExtKt.existsSafe(file, this.internalLogger)) {
            return null;
        }
        return this.metadataReaderWriter.readData(this.metadataFile);
    }

    @Override // com.datadog.android.api.storage.EventBatchWriter
    public boolean write(RawBatchEvent event, byte[] batchMetadata, EventType eventType) {
        File file;
        event.getClass();
        eventType.getClass();
        if (event.getData().length == 0) {
            return true;
        }
        if (!checkEventSize(event.getData().length) || !this.eventsWriter.writeData(this.batchFile, event, true)) {
            return false;
        }
        if (batchMetadata != null) {
            if ((!(batchMetadata.length == 0)) && (file = this.metadataFile) != null) {
                writeBatchMetadata(file, batchMetadata);
            }
        }
        return true;
    }
}
