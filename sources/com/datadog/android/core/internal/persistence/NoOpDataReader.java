package com.datadog.android.core.internal.persistence;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u0003¨\u0006\r"}, d2 = {"Lcom/datadog/android/core/internal/persistence/NoOpDataReader;", "Lcom/datadog/android/core/internal/persistence/DataReader;", "<init>", "()V", "Lcom/datadog/android/core/internal/persistence/Batch;", "lockAndReadNext", "()Lcom/datadog/android/core/internal/persistence/Batch;", "data", "Lj6g;", "release", "(Lcom/datadog/android/core/internal/persistence/Batch;)V", "drop", "dropAll", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class NoOpDataReader implements DataReader {
    @Override // com.datadog.android.core.internal.persistence.DataReader
    public void drop(Batch data) {
        data.getClass();
    }

    @Override // com.datadog.android.core.internal.persistence.DataReader
    public void dropAll() {
    }

    @Override // com.datadog.android.core.internal.persistence.DataReader
    public Batch lockAndReadNext() {
        return null;
    }

    @Override // com.datadog.android.core.internal.persistence.DataReader
    public void release(Batch data) {
        data.getClass();
    }
}
