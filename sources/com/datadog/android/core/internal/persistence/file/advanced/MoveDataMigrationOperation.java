package com.datadog.android.core.internal.persistence.file.advanced;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.persistence.file.FileMover;
import com.datadog.android.core.internal.utils.MiscUtilsKt;
import defpackage.gu5;
import defpackage.mj8;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/advanced/MoveDataMigrationOperation;", "Lcom/datadog/android/core/internal/persistence/file/advanced/DataMigrationOperation;", "Ljava/io/File;", "fromDir", "toDir", "Lcom/datadog/android/core/internal/persistence/file/FileMover;", "fileMover", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Ljava/io/File;Ljava/io/File;Lcom/datadog/android/core/internal/persistence/file/FileMover;Lcom/datadog/android/api/InternalLogger;)V", "Lj6g;", "run", "()V", "Ljava/io/File;", "getFromDir$dd_sdk_android_core_release", "()Ljava/io/File;", "getToDir$dd_sdk_android_core_release", "Lcom/datadog/android/core/internal/persistence/file/FileMover;", "getFileMover$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/FileMover;", "Lcom/datadog/android/api/InternalLogger;", "getInternalLogger$dd_sdk_android_core_release", "()Lcom/datadog/android/api/InternalLogger;", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class MoveDataMigrationOperation implements DataMigrationOperation {
    private static final int MAX_RETRY = 3;
    public static final String WARN_NULL_DEST_DIR = "Can't move data to a null directory";
    public static final String WARN_NULL_SOURCE_DIR = "Can't move data from a null directory";
    private final FileMover fileMover;
    private final File fromDir;
    private final InternalLogger internalLogger;
    private final File toDir;
    private static final long RETRY_DELAY_NS = 500000000;

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.advanced.MoveDataMigrationOperation$run$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass3 extends mj8 implements gu5<Boolean> {
        public AnonymousClass3() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // defpackage.gu5
        public final Boolean invoke() {
            return Boolean.valueOf(MoveDataMigrationOperation.this.getFileMover().moveFiles(MoveDataMigrationOperation.this.getFromDir(), MoveDataMigrationOperation.this.getToDir()));
        }
    }

    public MoveDataMigrationOperation(File file, File file2, FileMover fileMover, InternalLogger internalLogger) {
        fileMover.getClass();
        internalLogger.getClass();
        this.fromDir = file;
        this.toDir = file2;
        this.fileMover = fileMover;
        this.internalLogger = internalLogger;
    }

    /* JADX INFO: renamed from: getFileMover$dd_sdk_android_core_release, reason: from getter */
    public final FileMover getFileMover() {
        return this.fileMover;
    }

    /* JADX INFO: renamed from: getFromDir$dd_sdk_android_core_release, reason: from getter */
    public final File getFromDir() {
        return this.fromDir;
    }

    /* JADX INFO: renamed from: getInternalLogger$dd_sdk_android_core_release, reason: from getter */
    public final InternalLogger getInternalLogger() {
        return this.internalLogger;
    }

    /* JADX INFO: renamed from: getToDir$dd_sdk_android_core_release, reason: from getter */
    public final File getToDir() {
        return this.toDir;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.fromDir == null) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, (gu5) AnonymousClass1.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
            return;
        }
        File file = this.toDir;
        InternalLogger internalLogger = this.internalLogger;
        if (file == null) {
            InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, (gu5) AnonymousClass2.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
        } else {
            MiscUtilsKt.retryWithDelay(3, RETRY_DELAY_NS, internalLogger, new AnonymousClass3());
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.advanced.MoveDataMigrationOperation$run$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return MoveDataMigrationOperation.WARN_NULL_SOURCE_DIR;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.advanced.MoveDataMigrationOperation$run$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements gu5<String> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return MoveDataMigrationOperation.WARN_NULL_DEST_DIR;
        }
    }
}
