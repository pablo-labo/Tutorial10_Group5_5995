package com.datadog.android.core.internal.persistence;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/core/internal/persistence/NoOpDataWriter;", "", "T", "Lcom/datadog/android/core/internal/persistence/DataWriter;", "<init>", "()V", "element", "Lj6g;", "write", "(Ljava/lang/Object;)V", "", "data", "(Ljava/util/List;)V", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class NoOpDataWriter<T> implements DataWriter<T> {
    @Override // com.datadog.android.core.internal.persistence.DataWriter
    public void write(T element) {
        element.getClass();
    }

    @Override // com.datadog.android.core.internal.persistence.DataWriter
    public void write(List<? extends T> data) {
        data.getClass();
    }
}
