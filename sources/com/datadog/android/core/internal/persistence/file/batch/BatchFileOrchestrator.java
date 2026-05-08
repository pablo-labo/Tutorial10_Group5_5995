package com.datadog.android.core.internal.persistence.file.batch;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.metrics.BatchClosedMetadata;
import com.datadog.android.core.internal.metrics.MetricsDispatcher;
import com.datadog.android.core.internal.metrics.RemovalReason;
import com.datadog.android.core.internal.persistence.file.FileExtKt;
import com.datadog.android.core.internal.persistence.file.FileOrchestrator;
import com.datadog.android.core.internal.persistence.file.FilePersistenceConfig;
import defpackage.gf9;
import defpackage.gu5;
import defpackage.mj8;
import defpackage.t40;
import defpackage.u63;
import defpackage.ut0;
import defpackage.vve;
import defpackage.wl7;
import defpackage.z92;
import defpackage.zr4;
import defpackage.zve;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u0000 O2\u00020\u0001:\u0002POB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0002¢\u0006\u0004\b%\u0010$J\u000f\u0010&\u001a\u00020\fH\u0002¢\u0006\u0004\b&\u0010\u000eJ\u0019\u0010(\u001a\u0004\u0018\u00010\u00022\u0006\u0010'\u001a\u00020\fH\u0017¢\u0006\u0004\b(\u0010\u0011J\u001f\u0010+\u001a\u0004\u0018\u00010\u00022\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020)H\u0017¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0017¢\u0006\u0004\b-\u0010$J\u0015\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0017¢\u0006\u0004\b.\u0010$J\u0011\u0010/\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b/\u0010\u0013J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u0019\u00103\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u0002H\u0017¢\u0006\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00105R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u00108R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00109R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010:R\u0018\u0010<\u001a\u00060;R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010>\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\f\n\u0004\b>\u0010?\u0012\u0004\b@\u0010AR\u001a\u0010B\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\f\n\u0004\bB\u0010?\u0012\u0004\bC\u0010AR\u0018\u0010D\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u00105R\u0016\u0010E\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010?R\u0016\u0010F\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010?R\u0016\u0010G\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010?R\u0018\u0010I\u001a\u00020\u0002*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u00104R\u0018\u0010J\u001a\u00020\f*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR \u0010N\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006Q"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileOrchestrator;", "Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "Ljava/io/File;", "rootDir", "Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;", "config", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/core/internal/metrics/MetricsDispatcher;", "metricsDispatcher", "<init>", "(Ljava/io/File;Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/core/internal/metrics/MetricsDispatcher;)V", "", "isRootDirValid", "()Z", "wasForced", "createNewFile", "(Z)Ljava/io/File;", "getReusableWritableFile", "()Ljava/io/File;", "file", "", "delayMs", "isFileRecent", "(Ljava/io/File;J)Z", "", "files", "deleteObsoleteFiles", "(Ljava/util/List;)Ljava/util/List;", "Lj6g;", "freeSpaceIfNeeded", "(Ljava/util/List;)V", "sendMetric", "deleteFile", "(Ljava/io/File;Z)J", "listBatchFiles", "()Ljava/util/List;", "listSortedBatchFiles", "canDoCleanup", "forceNewFile", "getWritableFile", "", "excludeFiles", "getReadableFile", "(Ljava/util/Set;)Ljava/io/File;", "getAllFiles", "getFlushableFiles", "getRootDir", "", "getRootDirName", "()Ljava/lang/String;", "getMetadataFile", "(Ljava/io/File;)Ljava/io/File;", "Ljava/io/File;", "Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;", "getConfig$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;", "Lcom/datadog/android/api/InternalLogger;", "Lcom/datadog/android/core/internal/metrics/MetricsDispatcher;", "Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileOrchestrator$BatchFileFilter;", "fileFilter", "Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileOrchestrator$BatchFileFilter;", "recentReadDelayMs", "J", "getRecentReadDelayMs$annotations", "()V", "recentWriteDelayMs", "getRecentWriteDelayMs$annotations", "previousFile", "previousFileItemCount", "lastFileAccessTimestamp", "lastCleanupTimestamp", "getMetadata", "metadata", "isBatchFile", "(Ljava/io/File;)Z", "getLatestBatchFile", "(Ljava/util/List;)Ljava/io/File;", "latestBatchFile", "Companion", "BatchFileFilter", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class BatchFileOrchestrator implements FileOrchestrator {
    public static final String DEBUG_DIFFERENT_ROOT = "The file provided (%s) doesn't belong to the current folder (%s)";
    public static final double DECREASE_PERCENT = 0.95d;
    public static final String ERROR_CANT_CREATE_ROOT = "The provided root dir can't be created: %s";
    public static final String ERROR_DISK_FULL = "Too much disk space used (%d/%d): cleaning up to free %d bytes…";
    public static final String ERROR_NOT_BATCH_FILE = "The file provided is not a batch file: %s";
    public static final String ERROR_ROOT_NOT_DIR = "The provided root file is not a directory: %s";
    public static final String ERROR_ROOT_NOT_WRITABLE = "The provided root dir is not writable: %s";
    public static final double INCREASE_PERCENT = 1.05d;
    private final FilePersistenceConfig config;
    private final BatchFileFilter fileFilter;
    private final InternalLogger internalLogger;
    private long lastCleanupTimestamp;
    private long lastFileAccessTimestamp;
    private final MetricsDispatcher metricsDispatcher;
    private File previousFile;
    private long previousFileItemCount;
    private final long recentReadDelayMs;
    private final long recentWriteDelayMs;
    private final File rootDir;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileOrchestrator$BatchFileFilter;", "Ljava/io/FileFilter;", "(Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileOrchestrator;)V", "accept", "", "file", "Ljava/io/File;", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public final class BatchFileFilter implements FileFilter {
        public BatchFileFilter() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            if (file == null) {
                return false;
            }
            return BatchFileOrchestrator.this.isBatchFile(file);
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator$freeSpaceIfNeeded$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        final /* synthetic */ long $maxDiskSpace;
        final /* synthetic */ long $sizeOnDisk;
        final /* synthetic */ long $sizeToFree;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, long j2, long j3) {
            super(0);
            this.$sizeOnDisk = j;
            this.$maxDiskSpace = j2;
            this.$sizeToFree = j3;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, BatchFileOrchestrator.ERROR_DISK_FULL, Arrays.copyOf(new Object[]{Long.valueOf(this.$sizeOnDisk), Long.valueOf(this.$maxDiskSpace), Long.valueOf(this.$sizeToFree)}, 3));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator$getMetadataFile$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05401 extends mj8 implements gu5<String> {
        final /* synthetic */ File $file;
        final /* synthetic */ BatchFileOrchestrator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05401(File file, BatchFileOrchestrator batchFileOrchestrator) {
            super(0);
            this.$file = file;
            this.this$0 = batchFileOrchestrator;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, BatchFileOrchestrator.DEBUG_DIFFERENT_ROOT, Arrays.copyOf(new Object[]{this.$file.getPath(), this.this$0.rootDir.getPath()}, 2));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator$getMetadataFile$2, reason: invalid class name */
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
            return String.format(Locale.US, BatchFileOrchestrator.ERROR_NOT_BATCH_FILE, Arrays.copyOf(new Object[]{this.$file.getPath()}, 1));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator$isRootDirValid$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05411 extends mj8 implements gu5<String> {
        public C05411() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, BatchFileOrchestrator.ERROR_ROOT_NOT_WRITABLE, Arrays.copyOf(new Object[]{BatchFileOrchestrator.this.rootDir.getPath()}, 1));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator$isRootDirValid$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05422 extends mj8 implements gu5<String> {
        public C05422() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, BatchFileOrchestrator.ERROR_ROOT_NOT_DIR, Arrays.copyOf(new Object[]{BatchFileOrchestrator.this.rootDir.getPath()}, 1));
        }
    }

    public BatchFileOrchestrator(File file, FilePersistenceConfig filePersistenceConfig, InternalLogger internalLogger, MetricsDispatcher metricsDispatcher) {
        file.getClass();
        filePersistenceConfig.getClass();
        internalLogger.getClass();
        metricsDispatcher.getClass();
        this.rootDir = file;
        this.config = filePersistenceConfig;
        this.internalLogger = internalLogger;
        this.metricsDispatcher = metricsDispatcher;
        this.fileFilter = new BatchFileFilter();
        this.recentReadDelayMs = gf9.c(filePersistenceConfig.getRecentDelayMs() * 1.05d);
        this.recentWriteDelayMs = gf9.c(filePersistenceConfig.getRecentDelayMs() * 0.95d);
    }

    private final boolean canDoCleanup() {
        return System.currentTimeMillis() - this.lastCleanupTimestamp > this.config.getCleanupFrequencyThreshold();
    }

    private final File createNewFile(boolean wasForced) {
        File file = new File(this.rootDir, String.valueOf(System.currentTimeMillis()));
        File file2 = this.previousFile;
        long j = this.lastFileAccessTimestamp;
        if (file2 != null) {
            this.metricsDispatcher.sendBatchClosedMetric(file2, new BatchClosedMetadata(j, wasForced, this.previousFileItemCount));
        }
        this.previousFile = file;
        this.previousFileItemCount = 1L;
        this.lastFileAccessTimestamp = System.currentTimeMillis();
        return file;
    }

    public static /* synthetic */ File createNewFile$default(BatchFileOrchestrator batchFileOrchestrator, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return batchFileOrchestrator.createNewFile(z);
    }

    private final long deleteFile(File file, boolean sendMetric) {
        if (!FileExtKt.existsSafe(file, this.internalLogger)) {
            return 0L;
        }
        long jLengthSafe = FileExtKt.lengthSafe(file, this.internalLogger);
        if (!FileExtKt.deleteSafe(file, this.internalLogger)) {
            return 0L;
        }
        if (sendMetric) {
            this.metricsDispatcher.sendBatchDeletedMetric(file, RemovalReason.Purged.INSTANCE);
        }
        return jLengthSafe;
    }

    public static /* synthetic */ long deleteFile$default(BatchFileOrchestrator batchFileOrchestrator, File file, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return batchFileOrchestrator.deleteFile(file, z);
    }

    private final List<File> deleteObsoleteFiles(List<? extends File> files) {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.config.getOldFileThreshold();
        ArrayList arrayList = new ArrayList();
        for (File file : files) {
            String name = file.getName();
            name.getClass();
            Long lC = vve.C(name);
            if ((lC != null ? lC.longValue() : 0L) < jCurrentTimeMillis) {
                if (FileExtKt.deleteSafe(file, this.internalLogger)) {
                    this.metricsDispatcher.sendBatchDeletedMetric(file, RemovalReason.Obsolete.INSTANCE);
                }
                if (FileExtKt.existsSafe(getMetadata(file), this.internalLogger)) {
                    FileExtKt.deleteSafe(getMetadata(file), this.internalLogger);
                }
                file = null;
            }
            if (file != null) {
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    private final void freeSpaceIfNeeded(List<? extends File> files) {
        List<? extends File> list = files;
        Iterator<T> it = list.iterator();
        long jLengthSafe = 0;
        while (it.hasNext()) {
            jLengthSafe += FileExtKt.lengthSafe((File) it.next(), this.internalLogger);
        }
        long maxDiskSpace = this.config.getMaxDiskSpace();
        long jDeleteFile = jLengthSafe - maxDiskSpace;
        if (jDeleteFile > 0) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) new AnonymousClass1(jLengthSafe, maxDiskSpace, jDeleteFile), (Throwable) null, false, (Map) null, 56, (Object) null);
            for (File file : z92.o1(list)) {
                if (jDeleteFile > 0) {
                    jDeleteFile = (jDeleteFile - deleteFile(file, true)) - deleteFile$default(this, getMetadata(file), false, 2, null);
                }
            }
        }
    }

    private final File getLatestBatchFile(List<? extends File> list) {
        return (File) z92.a1(list);
    }

    private final File getMetadata(File file) {
        return new File(t40.k(file.getPath(), "_metadata"));
    }

    private static /* synthetic */ void getRecentReadDelayMs$annotations() {
    }

    private static /* synthetic */ void getRecentWriteDelayMs$annotations() {
    }

    private final File getReusableWritableFile() {
        File latestBatchFile = getLatestBatchFile(listBatchFiles());
        if (latestBatchFile == null) {
            return null;
        }
        File file = this.previousFile;
        long j = this.previousFileItemCount;
        if (!wl7.b(file, latestBatchFile)) {
            return null;
        }
        boolean zIsFileRecent = isFileRecent(latestBatchFile, this.recentWriteDelayMs);
        boolean z = FileExtKt.lengthSafe(latestBatchFile, this.internalLogger) < this.config.getMaxBatchSize();
        boolean z2 = j < ((long) this.config.getMaxItemsPerBatch());
        if (!zIsFileRecent || !z || !z2) {
            return null;
        }
        this.previousFileItemCount = j + 1;
        this.lastFileAccessTimestamp = System.currentTimeMillis();
        return latestBatchFile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isBatchFile(File file) {
        String name = file.getName();
        name.getClass();
        return vve.C(name) != null;
    }

    private final boolean isFileRecent(File file, long delayMs) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String name = file.getName();
        name.getClass();
        Long lC = vve.C(name);
        return (lC != null ? lC.longValue() : 0L) >= jCurrentTimeMillis - delayMs;
    }

    private final boolean isRootDirValid() {
        boolean zExistsSafe = FileExtKt.existsSafe(this.rootDir, this.internalLogger);
        File file = this.rootDir;
        if (zExistsSafe) {
            if (!file.isDirectory()) {
                InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) new C05422(), (Throwable) null, false, (Map) null, 56, (Object) null);
                return false;
            }
            if (FileExtKt.canWriteSafe(this.rootDir, this.internalLogger)) {
                return true;
            }
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) new C05411(), (Throwable) null, false, (Map) null, 56, (Object) null);
            return false;
        }
        synchronized (file) {
            if (FileExtKt.existsSafe(this.rootDir, this.internalLogger)) {
                return true;
            }
            if (FileExtKt.mkdirsSafe(this.rootDir, this.internalLogger)) {
                return true;
            }
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) new BatchFileOrchestrator$isRootDirValid$3$1(this), (Throwable) null, false, (Map) null, 56, (Object) null);
            return false;
        }
    }

    private final List<File> listBatchFiles() {
        File[] fileArrListFilesSafe = FileExtKt.listFilesSafe(this.rootDir, this.fileFilter, this.internalLogger);
        if (fileArrListFilesSafe == null) {
            fileArrListFilesSafe = new File[0];
        }
        return ut0.E0(fileArrListFilesSafe);
    }

    private final List<File> listSortedBatchFiles() {
        return z92.o1(listBatchFiles());
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public List<File> getAllFiles() {
        return !isRootDirValid() ? zr4.a : listSortedBatchFiles();
    }

    /* JADX INFO: renamed from: getConfig$dd_sdk_android_core_release, reason: from getter */
    public final FilePersistenceConfig getConfig() {
        return this.config;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public List<File> getFlushableFiles() {
        return getAllFiles();
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public File getMetadataFile(File file) {
        file.getClass();
        if (!wl7.b(file.getParent(), this.rootDir.getPath())) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.DEBUG, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) new C05401(file, this), (Throwable) null, false, (Map) null, 56, (Object) null);
        }
        if (isBatchFile(file)) {
            return getMetadata(file);
        }
        InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) new AnonymousClass2(file), (Throwable) null, false, (Map) null, 56, (Object) null);
        return null;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public File getReadableFile(Set<? extends File> excludeFiles) {
        excludeFiles.getClass();
        Object obj = null;
        if (!isRootDirValid()) {
            return null;
        }
        List<File> listDeleteObsoleteFiles = deleteObsoleteFiles(listSortedBatchFiles());
        this.lastCleanupTimestamp = System.currentTimeMillis();
        Iterator<T> it = listDeleteObsoleteFiles.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            File file = (File) next;
            if (!excludeFiles.contains(file) && !isFileRecent(file, this.recentReadDelayMs)) {
                obj = next;
                break;
            }
        }
        return (File) obj;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public File getRootDir() {
        if (isRootDirValid()) {
            return this.rootDir;
        }
        return null;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public String getRootDirName() {
        File file = this.rootDir;
        file.getClass();
        String name = file.getName();
        name.getClass();
        int iW = zve.W(name, 0, 6, ".");
        return iW == -1 ? name : name.substring(0, iW);
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public File getWritableFile(boolean forceNewFile) {
        if (!isRootDirValid()) {
            return null;
        }
        if (canDoCleanup()) {
            freeSpaceIfNeeded(deleteObsoleteFiles(listBatchFiles()));
            this.lastCleanupTimestamp = System.currentTimeMillis();
        }
        if (forceNewFile) {
            return createNewFile(true);
        }
        File reusableWritableFile = getReusableWritableFile();
        return reusableWritableFile == null ? createNewFile$default(this, false, 1, null) : reusableWritableFile;
    }
}
