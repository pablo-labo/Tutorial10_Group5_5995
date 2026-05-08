package com.datadog.android.core.internal.persistence;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.storage.EventBatchWriter;
import com.datadog.android.core.internal.metrics.MetricsDispatcher;
import com.datadog.android.core.internal.metrics.RemovalReason;
import com.datadog.android.core.internal.persistence.ConsentAwareStorage;
import com.datadog.android.core.internal.persistence.file.FileExtKt;
import com.datadog.android.core.internal.persistence.file.FileMover;
import com.datadog.android.core.internal.persistence.file.FileOrchestrator;
import com.datadog.android.core.internal.persistence.file.FilePersistenceConfig;
import com.datadog.android.core.internal.persistence.file.FileReaderWriter;
import com.datadog.android.core.internal.persistence.file.batch.BatchFileReaderWriter;
import com.datadog.android.core.internal.privacy.ConsentProvider;
import com.datadog.android.core.internal.utils.ConcurrencyExtKt;
import com.datadog.android.core.metrics.MethodCallSamplingRate;
import com.datadog.android.core.metrics.PerformanceMetric;
import com.datadog.android.core.metrics.TelemetryMetricType;
import com.datadog.android.privacy.TrackingConsent;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.l;
import defpackage.l5;
import defpackage.ly1;
import defpackage.mj8;
import defpackage.t92;
import defpackage.wl7;
import defpackage.z92;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u0000 R2\u00020\u0001:\u0002SRB_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0003¢\u0006\u0004\b \u0010!J)\u0010 \u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001e\u001a\u00020\u001dH\u0003¢\u0006\u0004\b \u0010%J\u001f\u0010&\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u001dH\u0003¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\"H\u0003¢\u0006\u0004\b)\u0010*J3\u00102\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u001f0/H\u0017¢\u0006\u0004\b2\u00103J\u0011\u00105\u001a\u0004\u0018\u000104H\u0017¢\u0006\u0004\b5\u00106J'\u0010:\u001a\u00020\u001f2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020-H\u0017¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u001fH\u0017¢\u0006\u0004\b<\u0010=R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010>R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010?\u001a\u0004\b@\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010?\u001a\u0004\bA\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010BR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010CR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010DR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010ER\u001a\u0010\u0010\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010F\u001a\u0004\bG\u0010HR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010IR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010JR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010KR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020\u001b0L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010Q¨\u0006T"}, d2 = {"Lcom/datadog/android/core/internal/persistence/ConsentAwareStorage;", "Lcom/datadog/android/core/internal/persistence/Storage;", "Ljava/util/concurrent/ExecutorService;", "executorService", "Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "grantedOrchestrator", "pendingOrchestrator", "Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileReaderWriter;", "batchEventsReaderWriter", "Lcom/datadog/android/core/internal/persistence/file/FileReaderWriter;", "batchMetadataReaderWriter", "Lcom/datadog/android/core/internal/persistence/file/FileMover;", "fileMover", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;", "filePersistenceConfig", "Lcom/datadog/android/core/internal/metrics/MetricsDispatcher;", "metricsDispatcher", "Lcom/datadog/android/core/internal/privacy/ConsentProvider;", "consentProvider", "", "featureName", "<init>", "(Ljava/util/concurrent/ExecutorService;Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileReaderWriter;Lcom/datadog/android/core/internal/persistence/file/FileReaderWriter;Lcom/datadog/android/core/internal/persistence/file/FileMover;Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;Lcom/datadog/android/core/internal/metrics/MetricsDispatcher;Lcom/datadog/android/core/internal/privacy/ConsentProvider;Ljava/lang/String;)V", "resolveOrchestrator", "()Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "Lcom/datadog/android/core/internal/persistence/ConsentAwareStorage$Batch;", "batch", "Lcom/datadog/android/core/internal/metrics/RemovalReason;", "reason", "Lj6g;", "deleteBatch", "(Lcom/datadog/android/core/internal/persistence/ConsentAwareStorage$Batch;Lcom/datadog/android/core/internal/metrics/RemovalReason;)V", "Ljava/io/File;", "batchFile", "metaFile", "(Ljava/io/File;Ljava/io/File;Lcom/datadog/android/core/internal/metrics/RemovalReason;)V", "deleteBatchFile", "(Ljava/io/File;Lcom/datadog/android/core/internal/metrics/RemovalReason;)V", "metadataFile", "deleteBatchMetadataFile", "(Ljava/io/File;)V", "Lcom/datadog/android/api/context/DatadogContext;", "datadogContext", "", "forceNewBatch", "Lkotlin/Function1;", "Lcom/datadog/android/api/storage/EventBatchWriter;", "callback", "writeCurrentBatch", "(Lcom/datadog/android/api/context/DatadogContext;ZLkotlin/jvm/functions/Function1;)V", "Lcom/datadog/android/core/internal/persistence/BatchData;", "readNextBatch", "()Lcom/datadog/android/core/internal/persistence/BatchData;", "Lcom/datadog/android/core/internal/persistence/BatchId;", "batchId", "removalReason", "confirmBatchRead", "(Lcom/datadog/android/core/internal/persistence/BatchId;Lcom/datadog/android/core/internal/metrics/RemovalReason;Z)V", "dropAll", "()V", "Ljava/util/concurrent/ExecutorService;", "Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "getGrantedOrchestrator$dd_sdk_android_core_release", "getPendingOrchestrator$dd_sdk_android_core_release", "Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileReaderWriter;", "Lcom/datadog/android/core/internal/persistence/file/FileReaderWriter;", "Lcom/datadog/android/core/internal/persistence/file/FileMover;", "Lcom/datadog/android/api/InternalLogger;", "Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;", "getFilePersistenceConfig$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;", "Lcom/datadog/android/core/internal/metrics/MetricsDispatcher;", "Lcom/datadog/android/core/internal/privacy/ConsentProvider;", "Ljava/lang/String;", "", "lockedBatches", "Ljava/util/Set;", "", "writeLock", "Ljava/lang/Object;", "Companion", "Batch", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class ConsentAwareStorage implements Storage {
    public static final String WARNING_DELETE_FAILED = "Unable to delete file: %s";
    private final BatchFileReaderWriter batchEventsReaderWriter;
    private final FileReaderWriter batchMetadataReaderWriter;
    private final ConsentProvider consentProvider;
    private final ExecutorService executorService;
    private final String featureName;
    private final FileMover fileMover;
    private final FilePersistenceConfig filePersistenceConfig;
    private final FileOrchestrator grantedOrchestrator;
    private final InternalLogger internalLogger;
    private final Set<Batch> lockedBatches;
    private final MetricsDispatcher metricsDispatcher;
    private final FileOrchestrator pendingOrchestrator;
    private final Object writeLock;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/datadog/android/core/internal/persistence/ConsentAwareStorage$Batch;", "", "file", "Ljava/io/File;", "metaFile", "(Ljava/io/File;Ljava/io/File;)V", "getFile", "()Ljava/io/File;", "getMetaFile", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Batch {
        private final File file;
        private final File metaFile;

        public Batch(File file, File file2) {
            file.getClass();
            this.file = file;
            this.metaFile = file2;
        }

        public static /* synthetic */ Batch copy$default(Batch batch, File file, File file2, int i, Object obj) {
            if ((i & 1) != 0) {
                file = batch.file;
            }
            if ((i & 2) != 0) {
                file2 = batch.metaFile;
            }
            return batch.copy(file, file2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final File getFile() {
            return this.file;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final File getMetaFile() {
            return this.metaFile;
        }

        public final Batch copy(File file, File metaFile) {
            file.getClass();
            return new Batch(file, metaFile);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Batch)) {
                return false;
            }
            Batch batch = (Batch) other;
            return wl7.b(this.file, batch.file) && wl7.b(this.metaFile, batch.metaFile);
        }

        public final File getFile() {
            return this.file;
        }

        public final File getMetaFile() {
            return this.metaFile;
        }

        public int hashCode() {
            int iHashCode = this.file.hashCode() * 31;
            File file = this.metaFile;
            return iHashCode + (file == null ? 0 : file.hashCode());
        }

        public String toString() {
            return "Batch(file=" + this.file + ", metaFile=" + this.metaFile + ")";
        }
    }

    @Metadata(k = 3, mv = {1, 7, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrackingConsent.values().length];
            try {
                iArr[TrackingConsent.GRANTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrackingConsent.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TrackingConsent.NOT_GRANTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.ConsentAwareStorage$deleteBatchFile$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        final /* synthetic */ File $batchFile;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(File file) {
            super(0);
            this.$batchFile = file;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, "Unable to delete file: %s", Arrays.copyOf(new Object[]{this.$batchFile.getPath()}, 1));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.ConsentAwareStorage$deleteBatchMetadataFile$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05171 extends mj8 implements gu5<String> {
        final /* synthetic */ File $metadataFile;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05171(File file) {
            super(0);
            this.$metadataFile = file;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, "Unable to delete file: %s", Arrays.copyOf(new Object[]{this.$metadataFile.getPath()}, 1));
        }
    }

    public ConsentAwareStorage(ExecutorService executorService, FileOrchestrator fileOrchestrator, FileOrchestrator fileOrchestrator2, BatchFileReaderWriter batchFileReaderWriter, FileReaderWriter fileReaderWriter, FileMover fileMover, InternalLogger internalLogger, FilePersistenceConfig filePersistenceConfig, MetricsDispatcher metricsDispatcher, ConsentProvider consentProvider, String str) {
        executorService.getClass();
        fileOrchestrator.getClass();
        fileOrchestrator2.getClass();
        batchFileReaderWriter.getClass();
        fileReaderWriter.getClass();
        fileMover.getClass();
        internalLogger.getClass();
        filePersistenceConfig.getClass();
        metricsDispatcher.getClass();
        consentProvider.getClass();
        str.getClass();
        this.executorService = executorService;
        this.grantedOrchestrator = fileOrchestrator;
        this.pendingOrchestrator = fileOrchestrator2;
        this.batchEventsReaderWriter = batchFileReaderWriter;
        this.batchMetadataReaderWriter = fileReaderWriter;
        this.fileMover = fileMover;
        this.internalLogger = internalLogger;
        this.filePersistenceConfig = filePersistenceConfig;
        this.metricsDispatcher = metricsDispatcher;
        this.consentProvider = consentProvider;
        this.featureName = str;
        this.lockedBatches = new LinkedHashSet();
        this.writeLock = new Object();
    }

    private final void deleteBatch(File batchFile, File metaFile, RemovalReason reason) {
        deleteBatchFile(batchFile, reason);
        if (metaFile == null || !FileExtKt.existsSafe(metaFile, this.internalLogger)) {
            return;
        }
        deleteBatchMetadataFile(metaFile);
    }

    private final void deleteBatchFile(File batchFile, RemovalReason reason) {
        if (this.fileMover.delete(batchFile)) {
            this.metricsDispatcher.sendBatchDeletedMetric(batchFile, reason);
        } else {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, (gu5) new AnonymousClass1(batchFile), (Throwable) null, false, (Map) null, 56, (Object) null);
        }
    }

    private final void deleteBatchMetadataFile(File metadataFile) {
        if (this.fileMover.delete(metadataFile)) {
            return;
        }
        InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, (gu5) new C05171(metadataFile), (Throwable) null, false, (Map) null, 56, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dropAll$lambda$11(ConsentAwareStorage consentAwareStorage) {
        consentAwareStorage.getClass();
        synchronized (consentAwareStorage.lockedBatches) {
            try {
                Iterator<T> it = consentAwareStorage.lockedBatches.iterator();
                while (it.hasNext()) {
                    consentAwareStorage.deleteBatch((Batch) it.next(), RemovalReason.Flushed.INSTANCE);
                }
                consentAwareStorage.lockedBatches.clear();
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        FileOrchestrator[] fileOrchestratorArr = {consentAwareStorage.pendingOrchestrator, consentAwareStorage.grantedOrchestrator};
        for (int i = 0; i < 2; i++) {
            FileOrchestrator fileOrchestrator = fileOrchestratorArr[i];
            for (File file : fileOrchestrator.getAllFiles()) {
                consentAwareStorage.deleteBatch(file, fileOrchestrator.getMetadataFile(file), RemovalReason.Flushed.INSTANCE);
            }
        }
    }

    private final FileOrchestrator resolveOrchestrator() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.consentProvider.getConsent().ordinal()];
        if (i == 1) {
            return this.grantedOrchestrator;
        }
        if (i == 2) {
            return this.pendingOrchestrator;
        }
        if (i == 3) {
            return null;
        }
        l.g();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void writeCurrentBatch$lambda$1(ConsentAwareStorage consentAwareStorage, Function1 function1, PerformanceMetric performanceMetric, boolean z) {
        consentAwareStorage.getClass();
        function1.getClass();
        FileOrchestrator fileOrchestratorResolveOrchestrator = consentAwareStorage.resolveOrchestrator();
        if (fileOrchestratorResolveOrchestrator == null) {
            function1.invoke(new NoOpEventBatchWriter());
            if (performanceMetric != null) {
                performanceMetric.stopAndSend(false);
                return;
            }
            return;
        }
        synchronized (consentAwareStorage.writeLock) {
            try {
                File writableFile = fileOrchestratorResolveOrchestrator.getWritableFile(z);
                function1.invoke(writableFile == null ? new NoOpEventBatchWriter() : new FileEventBatchWriter(writableFile, writableFile != null ? fileOrchestratorResolveOrchestrator.getMetadataFile(writableFile) : null, consentAwareStorage.batchEventsReaderWriter, consentAwareStorage.batchMetadataReaderWriter, consentAwareStorage.filePersistenceConfig, consentAwareStorage.internalLogger));
                if (performanceMetric != null) {
                    performanceMetric.stopAndSend(!(r9 instanceof NoOpEventBatchWriter));
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.datadog.android.core.internal.persistence.Storage
    public void confirmBatchRead(BatchId batchId, RemovalReason removalReason, boolean deleteBatch) {
        Object next;
        Batch batch;
        batchId.getClass();
        removalReason.getClass();
        synchronized (this.lockedBatches) {
            try {
                Iterator<T> it = this.lockedBatches.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (batchId.matchesFile(((Batch) next).getFile())) {
                            break;
                        }
                    }
                }
                batch = (Batch) next;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (batch == null) {
            return;
        }
        if (deleteBatch) {
            deleteBatch(batch, removalReason);
        }
        synchronized (this.lockedBatches) {
            this.lockedBatches.remove(batch);
        }
    }

    @Override // com.datadog.android.core.internal.persistence.Storage
    public void dropAll() {
        ConcurrencyExtKt.submitSafe(this.executorService, "ConsentAwareStorage.dropAll", this.internalLogger, new ly1(this, 1));
    }

    /* JADX INFO: renamed from: getFilePersistenceConfig$dd_sdk_android_core_release, reason: from getter */
    public final FilePersistenceConfig getFilePersistenceConfig() {
        return this.filePersistenceConfig;
    }

    /* JADX INFO: renamed from: getGrantedOrchestrator$dd_sdk_android_core_release, reason: from getter */
    public final FileOrchestrator getGrantedOrchestrator() {
        return this.grantedOrchestrator;
    }

    /* JADX INFO: renamed from: getPendingOrchestrator$dd_sdk_android_core_release, reason: from getter */
    public final FileOrchestrator getPendingOrchestrator() {
        return this.pendingOrchestrator;
    }

    @Override // com.datadog.android.core.internal.persistence.Storage
    public BatchData readNextBatch() {
        synchronized (this.lockedBatches) {
            try {
                FileOrchestrator fileOrchestrator = this.grantedOrchestrator;
                Set<Batch> set = this.lockedBatches;
                ArrayList arrayList = new ArrayList(t92.r0(set, 10));
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Batch) it.next()).getFile());
                }
                File readableFile = fileOrchestrator.getReadableFile(z92.E1(arrayList));
                byte[] data = null;
                if (readableFile == null) {
                    return null;
                }
                File metadataFile = this.grantedOrchestrator.getMetadataFile(readableFile);
                this.lockedBatches.add(new Batch(readableFile, metadataFile));
                Pair pair = new Pair(readableFile, metadataFile);
                File file = (File) pair.a();
                File file2 = (File) pair.b();
                BatchId batchIdFromFile = BatchId.INSTANCE.fromFile(file);
                if (file2 != null && FileExtKt.existsSafe(file2, this.internalLogger)) {
                    data = this.batchMetadataReaderWriter.readData(file2);
                }
                return new BatchData(batchIdFromFile, this.batchEventsReaderWriter.readData(file), data);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.datadog.android.core.internal.persistence.Storage
    public void writeCurrentBatch(DatadogContext datadogContext, final boolean forceNewBatch, final Function1<? super EventBatchWriter, j6g> callback) {
        datadogContext.getClass();
        callback.getClass();
        final PerformanceMetric performanceMetricStartPerformanceMeasure = this.internalLogger.startPerformanceMeasure(ConsentAwareStorage.class.getName(), TelemetryMetricType.MethodCalled, MethodCallSamplingRate.RARE.getRate(), l5.m("writeCurrentBatch[", this.featureName, "]"));
        ConcurrencyExtKt.submitSafe(this.executorService, "Data write", this.internalLogger, new Runnable() { // from class: lp2
            @Override // java.lang.Runnable
            public final void run() {
                ConsentAwareStorage.writeCurrentBatch$lambda$1(this.a, callback, performanceMetricStartPerformanceMeasure, forceNewBatch);
            }
        });
    }

    private final void deleteBatch(Batch batch, RemovalReason reason) {
        deleteBatch(batch.getFile(), batch.getMetaFile(), reason);
    }
}
