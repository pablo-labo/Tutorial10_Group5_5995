package com.indeed.android.myjobs.data.model;

import defpackage.ia;
import defpackage.w40;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/indeed/android/myjobs/data/model/TimeSlot;", "", "timeStart", "", "timeEnd", "confirmed", "", "<init>", "(JJZ)V", "getTimeStart", "()J", "getTimeEnd", "getConfirmed", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TimeSlot {
    public static final int $stable = 0;
    private final boolean confirmed;
    private final long timeEnd;
    private final long timeStart;

    public TimeSlot(long j, long j2, boolean z) {
        this.timeStart = j;
        this.timeEnd = j2;
        this.confirmed = z;
    }

    public static /* synthetic */ TimeSlot copy$default(TimeSlot timeSlot, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = timeSlot.timeStart;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = timeSlot.timeEnd;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            z = timeSlot.confirmed;
        }
        return timeSlot.copy(j3, j4, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimeStart() {
        return this.timeStart;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTimeEnd() {
        return this.timeEnd;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getConfirmed() {
        return this.confirmed;
    }

    public final TimeSlot copy(long timeStart, long timeEnd, boolean confirmed) {
        return new TimeSlot(timeStart, timeEnd, confirmed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeSlot)) {
            return false;
        }
        TimeSlot timeSlot = (TimeSlot) other;
        return this.timeStart == timeSlot.timeStart && this.timeEnd == timeSlot.timeEnd && this.confirmed == timeSlot.confirmed;
    }

    public final boolean getConfirmed() {
        return this.confirmed;
    }

    public final long getTimeEnd() {
        return this.timeEnd;
    }

    public final long getTimeStart() {
        return this.timeStart;
    }

    public int hashCode() {
        return Boolean.hashCode(this.confirmed) + ia.d(Long.hashCode(this.timeStart) * 31, 31, this.timeEnd);
    }

    public String toString() {
        long j = this.timeStart;
        long j2 = this.timeEnd;
        boolean z = this.confirmed;
        StringBuilder sbI = w40.i(j, "TimeSlot(timeStart=", ", timeEnd=");
        sbI.append(j2);
        sbI.append(", confirmed=");
        sbI.append(z);
        sbI.append(")");
        return sbI.toString();
    }
}
