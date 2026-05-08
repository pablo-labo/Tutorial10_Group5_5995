package com.datadog.android.core.internal.time;

import defpackage.c82;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/core/internal/time/KronosTimeProvider;", "Lcom/datadog/android/core/internal/time/TimeProvider;", "Lc82;", "clock", "<init>", "(Lc82;)V", "", "getDeviceTimestamp", "()J", "getServerTimestamp", "getServerOffsetMillis", "getServerOffsetNanos", "Lc82;", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class KronosTimeProvider implements TimeProvider {
    private final c82 clock;

    public KronosTimeProvider(c82 c82Var) {
        c82Var.getClass();
        this.clock = c82Var;
    }

    @Override // com.datadog.android.core.internal.time.TimeProvider
    public long getDeviceTimestamp() {
        return System.currentTimeMillis();
    }

    @Override // com.datadog.android.core.internal.time.TimeProvider
    public long getServerOffsetMillis() {
        return this.clock.i() - System.currentTimeMillis();
    }

    @Override // com.datadog.android.core.internal.time.TimeProvider
    public long getServerOffsetNanos() {
        return TimeUnit.MILLISECONDS.toNanos(getServerOffsetMillis());
    }

    @Override // com.datadog.android.core.internal.time.TimeProvider
    public long getServerTimestamp() {
        return this.clock.i();
    }
}
