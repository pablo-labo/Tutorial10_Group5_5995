package com.datadog.android.core.internal.metrics;

import defpackage.ia;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u000e\u0010\r\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u000eJ\u000e\u0010\u000f\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u0010J\u000e\u0010\u0011\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0012J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/datadog/android/core/internal/metrics/BatchClosedMetadata;", "", "lastTimeWasUsedInMs", "", "forcedNew", "", "eventsCount", "(JZJ)V", "getEventsCount$dd_sdk_android_core_release", "()J", "getForcedNew$dd_sdk_android_core_release", "()Z", "getLastTimeWasUsedInMs$dd_sdk_android_core_release", "component1", "component1$dd_sdk_android_core_release", "component2", "component2$dd_sdk_android_core_release", "component3", "component3$dd_sdk_android_core_release", "copy", "equals", "other", "hashCode", "", "toString", "", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class BatchClosedMetadata {
    private final long eventsCount;
    private final boolean forcedNew;
    private final long lastTimeWasUsedInMs;

    public BatchClosedMetadata(long j, boolean z, long j2) {
        this.lastTimeWasUsedInMs = j;
        this.forcedNew = z;
        this.eventsCount = j2;
    }

    public static /* synthetic */ BatchClosedMetadata copy$default(BatchClosedMetadata batchClosedMetadata, long j, boolean z, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = batchClosedMetadata.lastTimeWasUsedInMs;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            z = batchClosedMetadata.forcedNew;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            j2 = batchClosedMetadata.eventsCount;
        }
        return batchClosedMetadata.copy(j3, z2, j2);
    }

    /* JADX INFO: renamed from: component1$dd_sdk_android_core_release, reason: from getter */
    public final long getLastTimeWasUsedInMs() {
        return this.lastTimeWasUsedInMs;
    }

    /* JADX INFO: renamed from: component2$dd_sdk_android_core_release, reason: from getter */
    public final boolean getForcedNew() {
        return this.forcedNew;
    }

    /* JADX INFO: renamed from: component3$dd_sdk_android_core_release, reason: from getter */
    public final long getEventsCount() {
        return this.eventsCount;
    }

    public final BatchClosedMetadata copy(long lastTimeWasUsedInMs, boolean forcedNew, long eventsCount) {
        return new BatchClosedMetadata(lastTimeWasUsedInMs, forcedNew, eventsCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BatchClosedMetadata)) {
            return false;
        }
        BatchClosedMetadata batchClosedMetadata = (BatchClosedMetadata) other;
        return this.lastTimeWasUsedInMs == batchClosedMetadata.lastTimeWasUsedInMs && this.forcedNew == batchClosedMetadata.forcedNew && this.eventsCount == batchClosedMetadata.eventsCount;
    }

    public final long getEventsCount$dd_sdk_android_core_release() {
        return this.eventsCount;
    }

    public final boolean getForcedNew$dd_sdk_android_core_release() {
        return this.forcedNew;
    }

    public final long getLastTimeWasUsedInMs$dd_sdk_android_core_release() {
        return this.lastTimeWasUsedInMs;
    }

    public int hashCode() {
        return Long.hashCode(this.eventsCount) + ia.f(Long.hashCode(this.lastTimeWasUsedInMs) * 31, 31, this.forcedNew);
    }

    public String toString() {
        return "BatchClosedMetadata(lastTimeWasUsedInMs=" + this.lastTimeWasUsedInMs + ", forcedNew=" + this.forcedNew + ", eventsCount=" + this.eventsCount + ")";
    }
}
