package com.datadog.android.core.internal.persistence.file;

import java.io.File;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0005H'¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/FileReader;", "T", "", "readData", "file", "Ljava/io/File;", "(Ljava/io/File;)Ljava/lang/Object;", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface FileReader<T> {
    T readData(File file);
}
