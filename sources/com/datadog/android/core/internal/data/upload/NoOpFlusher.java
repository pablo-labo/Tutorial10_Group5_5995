package com.datadog.android.core.internal.data.upload;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/NoOpFlusher;", "Lcom/datadog/android/core/internal/data/upload/Flusher;", "<init>", "()V", "Lcom/datadog/android/core/internal/data/upload/DataUploader;", "uploader", "Lj6g;", "flush", "(Lcom/datadog/android/core/internal/data/upload/DataUploader;)V", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class NoOpFlusher implements Flusher {
    @Override // com.datadog.android.core.internal.data.upload.Flusher
    public void flush(DataUploader uploader) {
        uploader.getClass();
    }
}
