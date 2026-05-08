package com.datadog.android.core.internal.persistence.file;

import com.datadog.android.api.InternalLogger;
import defpackage.gu5;
import defpackage.hb5;
import defpackage.mj8;
import defpackage.u63;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/FileMover;", "", "internalLogger", "Lcom/datadog/android/api/InternalLogger;", "(Lcom/datadog/android/api/InternalLogger;)V", "getInternalLogger", "()Lcom/datadog/android/api/InternalLogger;", "delete", "", "target", "Ljava/io/File;", "moveFile", "file", "destDir", "moveFiles", "srcDir", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class FileMover {
    public static final String ERROR_DELETE = "Unable to delete file: %s";
    public static final String ERROR_MOVE_NOT_DIR = "Unable to move files; file is not a directory: %s";
    public static final String ERROR_MOVE_NO_DST = "Unable to move files; could not create directory: %s";
    public static final String INFO_MOVE_NO_SRC = "Unable to move files; source directory does not exist: %s";
    private final InternalLogger internalLogger;

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.FileMover$delete$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        final /* synthetic */ File $target;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(File file) {
            super(0);
            this.$target = file;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, "Unable to delete file: %s", Arrays.copyOf(new Object[]{this.$target.getPath()}, 1));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.FileMover$delete$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements gu5<String> {
        final /* synthetic */ File $target;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(File file) {
            super(0);
            this.$target = file;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, "Unable to delete file: %s", Arrays.copyOf(new Object[]{this.$target.getPath()}, 1));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.FileMover$moveFiles$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05351 extends mj8 implements gu5<String> {
        final /* synthetic */ File $srcDir;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05351(File file) {
            super(0);
            this.$srcDir = file;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, FileMover.INFO_MOVE_NO_SRC, Arrays.copyOf(new Object[]{this.$srcDir.getPath()}, 1));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.FileMover$moveFiles$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05362 extends mj8 implements gu5<String> {
        final /* synthetic */ File $srcDir;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05362(File file) {
            super(0);
            this.$srcDir = file;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, FileMover.ERROR_MOVE_NOT_DIR, Arrays.copyOf(new Object[]{this.$srcDir.getPath()}, 1));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.FileMover$moveFiles$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass3 extends mj8 implements gu5<String> {
        final /* synthetic */ File $srcDir;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(File file) {
            super(0);
            this.$srcDir = file;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, FileMover.ERROR_MOVE_NO_DST, Arrays.copyOf(new Object[]{this.$srcDir.getPath()}, 1));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.FileMover$moveFiles$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass4 extends mj8 implements gu5<String> {
        final /* synthetic */ File $destDir;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(File file) {
            super(0);
            this.$destDir = file;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, FileMover.ERROR_MOVE_NOT_DIR, Arrays.copyOf(new Object[]{this.$destDir.getPath()}, 1));
        }
    }

    public FileMover(InternalLogger internalLogger) {
        internalLogger.getClass();
        this.internalLogger = internalLogger;
    }

    private final boolean moveFile(File file, File destDir) {
        return FileExtKt.renameToSafe(file, new File(destDir, file.getName()), this.internalLogger);
    }

    public final boolean delete(File target) {
        target.getClass();
        try {
            return hb5.P(target);
        } catch (FileNotFoundException e) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) new AnonymousClass1(target), (Throwable) e, false, (Map) null, 48, (Object) null);
            return false;
        } catch (SecurityException e2) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) new AnonymousClass2(target), (Throwable) e2, false, (Map) null, 48, (Object) null);
            return false;
        }
    }

    public final InternalLogger getInternalLogger() {
        return this.internalLogger;
    }

    public final boolean moveFiles(File srcDir, File destDir) {
        srcDir.getClass();
        destDir.getClass();
        boolean zExistsSafe = FileExtKt.existsSafe(srcDir, this.internalLogger);
        InternalLogger internalLogger = this.internalLogger;
        if (!zExistsSafe) {
            InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.INFO, InternalLogger.Target.MAINTAINER, (gu5) new C05351(srcDir), (Throwable) null, false, (Map) null, 56, (Object) null);
            return true;
        }
        boolean zIsDirectorySafe = FileExtKt.isDirectorySafe(srcDir, internalLogger);
        InternalLogger internalLogger2 = this.internalLogger;
        if (!zIsDirectorySafe) {
            InternalLogger.DefaultImpls.log$default(internalLogger2, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) new C05362(srcDir), (Throwable) null, false, (Map) null, 56, (Object) null);
            return false;
        }
        boolean zExistsSafe2 = FileExtKt.existsSafe(destDir, internalLogger2);
        InternalLogger internalLogger3 = this.internalLogger;
        if (zExistsSafe2) {
            if (!FileExtKt.isDirectorySafe(destDir, internalLogger3)) {
                InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) new AnonymousClass4(destDir), (Throwable) null, false, (Map) null, 56, (Object) null);
                return false;
            }
        } else if (!FileExtKt.mkdirsSafe(destDir, internalLogger3)) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) new AnonymousClass3(srcDir), (Throwable) null, false, (Map) null, 56, (Object) null);
            return false;
        }
        File[] fileArrListFilesSafe = FileExtKt.listFilesSafe(srcDir, this.internalLogger);
        if (fileArrListFilesSafe == null) {
            fileArrListFilesSafe = new File[0];
        }
        for (File file : fileArrListFilesSafe) {
            if (!moveFile(file, destDir)) {
                return false;
            }
        }
        return true;
    }
}
