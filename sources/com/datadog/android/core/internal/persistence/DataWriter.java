package com.datadog.android.core.internal.persistence;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\ba\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H'¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H'¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lcom/datadog/android/core/internal/persistence/DataWriter;", "", "T", "element", "Lj6g;", "write", "(Ljava/lang/Object;)V", "", "data", "(Ljava/util/List;)V", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface DataWriter<T> {
    void write(T element);

    void write(List<? extends T> data);
}
