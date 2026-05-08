package com.datadog.android.core.internal.persistence.file;

import java.io.File;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0004H'¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/FileWriter;", "T", "", "writeData", "", "file", "Ljava/io/File;", "data", "append", "(Ljava/io/File;Ljava/lang/Object;Z)Z", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface FileWriter<T> {
    boolean writeData(File file, T data, boolean append);
}
