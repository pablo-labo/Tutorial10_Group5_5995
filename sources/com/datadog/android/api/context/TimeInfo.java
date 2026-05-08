package com.datadog.android.api.context;

import defpackage.ia;
import defpackage.o6;
import defpackage.r6;
import defpackage.w40;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/datadog/android/api/context/TimeInfo;", "", "deviceTimeNs", "", "serverTimeNs", "serverTimeOffsetNs", "serverTimeOffsetMs", "(JJJJ)V", "getDeviceTimeNs", "()J", "getServerTimeNs", "getServerTimeOffsetMs", "getServerTimeOffsetNs", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class TimeInfo {
    private final long deviceTimeNs;
    private final long serverTimeNs;
    private final long serverTimeOffsetMs;
    private final long serverTimeOffsetNs;

    public TimeInfo(long j, long j2, long j3, long j4) {
        this.deviceTimeNs = j;
        this.serverTimeNs = j2;
        this.serverTimeOffsetNs = j3;
        this.serverTimeOffsetMs = j4;
    }

    public static /* synthetic */ TimeInfo copy$default(TimeInfo timeInfo, long j, long j2, long j3, long j4, int i, Object obj) {
        if ((i & 1) != 0) {
            j = timeInfo.deviceTimeNs;
        }
        long j5 = j;
        if ((i & 2) != 0) {
            j2 = timeInfo.serverTimeNs;
        }
        long j6 = j2;
        if ((i & 4) != 0) {
            j3 = timeInfo.serverTimeOffsetNs;
        }
        return timeInfo.copy(j5, j6, j3, (i & 8) != 0 ? timeInfo.serverTimeOffsetMs : j4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getDeviceTimeNs() {
        return this.deviceTimeNs;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getServerTimeNs() {
        return this.serverTimeNs;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getServerTimeOffsetNs() {
        return this.serverTimeOffsetNs;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getServerTimeOffsetMs() {
        return this.serverTimeOffsetMs;
    }

    public final TimeInfo copy(long deviceTimeNs, long serverTimeNs, long serverTimeOffsetNs, long serverTimeOffsetMs) {
        return new TimeInfo(deviceTimeNs, serverTimeNs, serverTimeOffsetNs, serverTimeOffsetMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeInfo)) {
            return false;
        }
        TimeInfo timeInfo = (TimeInfo) other;
        return this.deviceTimeNs == timeInfo.deviceTimeNs && this.serverTimeNs == timeInfo.serverTimeNs && this.serverTimeOffsetNs == timeInfo.serverTimeOffsetNs && this.serverTimeOffsetMs == timeInfo.serverTimeOffsetMs;
    }

    public final long getDeviceTimeNs() {
        return this.deviceTimeNs;
    }

    public final long getServerTimeNs() {
        return this.serverTimeNs;
    }

    public final long getServerTimeOffsetMs() {
        return this.serverTimeOffsetMs;
    }

    public final long getServerTimeOffsetNs() {
        return this.serverTimeOffsetNs;
    }

    public int hashCode() {
        return Long.hashCode(this.serverTimeOffsetMs) + ia.d(ia.d(Long.hashCode(this.deviceTimeNs) * 31, 31, this.serverTimeNs), 31, this.serverTimeOffsetNs);
    }

    public String toString() {
        long j = this.deviceTimeNs;
        long j2 = this.serverTimeNs;
        long j3 = this.serverTimeOffsetNs;
        long j4 = this.serverTimeOffsetMs;
        StringBuilder sbI = w40.i(j, "TimeInfo(deviceTimeNs=", ", serverTimeNs=");
        sbI.append(j2);
        o6.p(sbI, ", serverTimeOffsetNs=", j3, ", serverTimeOffsetMs=");
        return r6.d(j4, ")", sbI);
    }
}
