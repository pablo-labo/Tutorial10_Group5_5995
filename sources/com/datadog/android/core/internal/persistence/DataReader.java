package com.datadog.android.core.internal.persistence;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\ba\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/datadog/android/core/internal/persistence/DataReader;", "", "Lcom/datadog/android/core/internal/persistence/Batch;", "lockAndReadNext", "()Lcom/datadog/android/core/internal/persistence/Batch;", "data", "Lj6g;", "release", "(Lcom/datadog/android/core/internal/persistence/Batch;)V", "drop", "dropAll", "()V", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface DataReader {
    void drop(Batch data);

    void dropAll();

    Batch lockAndReadNext();

    void release(Batch data);
}
