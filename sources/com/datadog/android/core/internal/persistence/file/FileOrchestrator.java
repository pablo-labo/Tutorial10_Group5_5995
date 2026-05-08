package com.datadog.android.core.internal.persistence.file;

import defpackage.b0;
import java.io.File;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\ba\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0004H'J\u0018\u0010\b\u001a\u0004\u0018\u00010\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nH'J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0004H'J\n\u0010\f\u001a\u0004\u0018\u00010\rH&J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0010H'¨\u0006\u0011"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "", "getAllFiles", "", "Ljava/io/File;", "getFlushableFiles", "getMetadataFile", "file", "getReadableFile", "excludeFiles", "", "getRootDir", "getRootDirName", "", "getWritableFile", "forceNewFile", "", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface FileOrchestrator {

    @Metadata(k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ File getWritableFile$default(FileOrchestrator fileOrchestrator, boolean z, int i, Object obj) {
            if (obj != null) {
                b0.u("Super calls with default arguments not supported in this target, function: getWritableFile");
                return null;
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return fileOrchestrator.getWritableFile(z);
        }
    }

    List<File> getAllFiles();

    List<File> getFlushableFiles();

    File getMetadataFile(File file);

    File getReadableFile(Set<? extends File> excludeFiles);

    File getRootDir();

    String getRootDirName();

    File getWritableFile(boolean forceNewFile);
}
