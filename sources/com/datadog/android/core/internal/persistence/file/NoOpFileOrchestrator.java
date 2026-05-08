package com.datadog.android.core.internal.persistence.file;

import defpackage.zr4;
import java.io.File;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\t\u001a\u0004\u0018\u00010\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/NoOpFileOrchestrator;", "Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "()V", "getAllFiles", "", "Ljava/io/File;", "getFlushableFiles", "getMetadataFile", "file", "getReadableFile", "excludeFiles", "", "getRootDir", "getRootDirName", "", "getWritableFile", "forceNewFile", "", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class NoOpFileOrchestrator implements FileOrchestrator {
    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public List<File> getAllFiles() {
        return zr4.a;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public List<File> getFlushableFiles() {
        return zr4.a;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public File getMetadataFile(File file) {
        file.getClass();
        return null;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public File getReadableFile(Set<? extends File> excludeFiles) {
        excludeFiles.getClass();
        return null;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public File getRootDir() {
        return null;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public String getRootDirName() {
        return null;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public File getWritableFile(boolean forceNewFile) {
        return null;
    }
}
