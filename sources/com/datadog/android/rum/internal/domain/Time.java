package com.datadog.android.rum.internal.domain;

import com.datadog.android.ndk.internal.NdkCrashLog;
import defpackage.r6;
import defpackage.w40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/datadog/android/rum/internal/domain/Time;", "", NdkCrashLog.TIMESTAMP_KEY_NAME, "", "nanoTime", "(JJ)V", "getNanoTime", "()J", "getTimestamp", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class Time {
    private final long nanoTime;
    private final long timestamp;

    public /* synthetic */ Time(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? System.currentTimeMillis() : j, (i & 2) != 0 ? System.nanoTime() : j2);
    }

    public static /* synthetic */ Time copy$default(Time time, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = time.timestamp;
        }
        if ((i & 2) != 0) {
            j2 = time.nanoTime;
        }
        return time.copy(j, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getNanoTime() {
        return this.nanoTime;
    }

    public final Time copy(long timestamp, long nanoTime) {
        return new Time(timestamp, nanoTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Time)) {
            return false;
        }
        Time time = (Time) other;
        return this.timestamp == time.timestamp && this.nanoTime == time.nanoTime;
    }

    public final long getNanoTime() {
        return this.nanoTime;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Long.hashCode(this.nanoTime) + (Long.hashCode(this.timestamp) * 31);
    }

    public String toString() {
        return r6.d(this.nanoTime, ")", w40.i(this.timestamp, "Time(timestamp=", ", nanoTime="));
    }

    public Time(long j, long j2) {
        this.timestamp = j;
        this.nanoTime = j2;
    }

    public Time() {
        this(0L, 0L, 3, null);
    }
}
