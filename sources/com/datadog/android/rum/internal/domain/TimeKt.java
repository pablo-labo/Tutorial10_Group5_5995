package com.datadog.android.rum.internal.domain;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"asTime", "Lcom/datadog/android/rum/internal/domain/Time;", "", "dd-sdk-android-rum_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class TimeKt {
    public static final Time asTime(long j) {
        Time time = new Time(0L, 0L, 3, null);
        return new Time(j, time.getNanoTime() + TimeUnit.MILLISECONDS.toNanos(j - time.getTimestamp()));
    }
}
