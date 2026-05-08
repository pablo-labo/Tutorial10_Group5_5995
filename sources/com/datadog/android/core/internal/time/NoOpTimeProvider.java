package com.datadog.android.core.internal.time;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/datadog/android/core/internal/time/NoOpTimeProvider;", "Lcom/datadog/android/core/internal/time/TimeProvider;", "()V", "getDeviceTimestamp", "", "getServerOffsetMillis", "getServerOffsetNanos", "getServerTimestamp", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class NoOpTimeProvider implements TimeProvider {
    @Override // com.datadog.android.core.internal.time.TimeProvider
    public long getDeviceTimestamp() {
        return System.currentTimeMillis();
    }

    @Override // com.datadog.android.core.internal.time.TimeProvider
    public long getServerOffsetMillis() {
        return 0L;
    }

    @Override // com.datadog.android.core.internal.time.TimeProvider
    public long getServerOffsetNanos() {
        return 0L;
    }

    @Override // com.datadog.android.core.internal.time.TimeProvider
    public long getServerTimestamp() {
        return System.currentTimeMillis();
    }
}
