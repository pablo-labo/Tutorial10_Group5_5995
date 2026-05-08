package com.datadog.android.api.storage.datastore;

import com.datadog.android.core.persistence.datastore.DataStoreContent;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/datadog/android/api/storage/datastore/DataStoreReadCallback;", "", "T", "Lcom/datadog/android/core/persistence/datastore/DataStoreContent;", "dataStoreContent", "Lj6g;", "onSuccess", "(Lcom/datadog/android/core/persistence/datastore/DataStoreContent;)V", "onFailure", "()V", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface DataStoreReadCallback<T> {
    void onFailure();

    void onSuccess(DataStoreContent<T> dataStoreContent);
}
