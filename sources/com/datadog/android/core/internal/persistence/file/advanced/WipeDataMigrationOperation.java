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
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/advanced/WipeDataMigrationOperation;", "Lcom/datadog/android/core/internal/persistence/file/advanced/DataMigrationOperation;", "Ljava/io/File;", "targetDir", "Lcom/datadog/android/core/internal/persistence/file/FileMover;", "fileMover", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Ljava/io/File;Lcom/datadog/android/core/internal/persistence/file/FileMover;Lcom/datadog/android/api/InternalLogger;)V", "Lj6g;", "run", "()V", "Ljava/io/File;", "getTargetDir$dd_sdk_android_core_release", "()Ljava/io/File;", "Lcom/datadog/android/core/internal/persistence/file/FileMover;", "getFileMover$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/FileMover;", "Lcom/datadog/android/api/InternalLogger;", "getInternalLogger$dd_sdk_android_core_release", "()Lcom/datadog/android/api/InternalLogger;", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class WipeDataMigrationOperation implements DataMigrationOperation {
    private static final int MAX_RETRY = 3;
    public static final String WARN_NULL_DIR = "Can't wipe data from a null directory";
    private final FileMover fileMover;
    private final InternalLogger internalLogger;
    private final File targetDir;
    private static final long RETRY_DELAY_NS = 500000000;

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.advanced.WipeDataMigrationOperation$run$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements gu5<Boolean> {
        public AnonymousClass2() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // defpackage.gu5
        public final Boolean invoke() {
            return Boolean.valueOf(WipeDataMigrationOperation.this.getFileMover().delete(WipeDataMigrationOperation.this.getTargetDir()));
        }
    }

    public WipeDataMigrationOperation(File file, FileMover fileMover, InternalLogger internalLogger) {
        fileMover.getClass();
        internalLogger.getClass();
        this.targetDir = file;
        this.fileMover = fileMover;
        this.internalLogger = internalLogger;
    }

    /* JADX INFO: renamed from: getFileMover$dd_sdk_android_core_release, reason: from getter */
    public final FileMover getFileMover() {
        return this.fileMover;
    }

    /* JADX INFO: renamed from: getInternalLogger$dd_sdk_android_core_release, reason: from getter */
    public final InternalLogger getInternalLogger() {
        return this.internalLogger;
    }

    /* JADX INFO: renamed from: getTargetDir$dd_sdk_android_core_release, reason: from getter */
    public final File getTargetDir() {
        return this.targetDir;
    }

    @Override // java.lang.Runnable
    public void run() {
        File file = this.targetDir;
        InternalLogger internalLogger = this.internalLogger;
        if (file == null) {
            InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, (gu5) AnonymousClass1.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
        } else {
            MiscUtilsKt.retryWithDelay(3, RETRY_DELAY_NS, internalLogger, new AnonymousClass2());
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.advanced.WipeDataMigrationOperation$run$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return WipeDataMigrationOperation.WARN_NULL_DIR;
        }
    }
}
