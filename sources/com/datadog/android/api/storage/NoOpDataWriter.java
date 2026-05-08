package com.datadog.android.api.storage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J%\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/datadog/android/api/storage/NoOpDataWriter;", "T", "Lcom/datadog/android/api/storage/DataWriter;", "()V", "write", "", "writer", "Lcom/datadog/android/api/storage/EventBatchWriter;", "element", "eventType", "Lcom/datadog/android/api/storage/EventType;", "(Lcom/datadog/android/api/storage/EventBatchWriter;Ljava/lang/Object;Lcom/datadog/android/api/storage/EventType;)Z", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class NoOpDataWriter<T> implements DataWriter<T> {
    @Override // com.datadog.android.api.storage.DataWriter
    public boolean write(EventBatchWriter writer, T element, EventType eventType) {
        writer.getClass();
        eventType.getClass();
        return false;
    }
}
