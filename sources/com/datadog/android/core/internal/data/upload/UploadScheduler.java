package com.datadog.android.core.internal.data.upload;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/UploadScheduler;", "", "Lj6g;", "startScheduling", "()V", "stopScheduling", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface UploadScheduler {
    void startScheduling();

    void stopScheduling();
}
