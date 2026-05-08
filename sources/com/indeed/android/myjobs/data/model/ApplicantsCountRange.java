package com.indeed.android.myjobs.data.model;

import defpackage.r6;
import defpackage.w40;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/indeed/android/myjobs/data/model/ApplicantsCountRange;", "", "lowerEndApplicantsCountRange", "", "upperEndApplicantsCountRange", "<init>", "(JJ)V", "getLowerEndApplicantsCountRange", "()J", "getUpperEndApplicantsCountRange", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApplicantsCountRange {
    public static final int $stable = 0;
    private final long lowerEndApplicantsCountRange;
    private final long upperEndApplicantsCountRange;

    public ApplicantsCountRange(long j, long j2) {
        this.lowerEndApplicantsCountRange = j;
        this.upperEndApplicantsCountRange = j2;
    }

    public static /* synthetic */ ApplicantsCountRange copy$default(ApplicantsCountRange applicantsCountRange, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = applicantsCountRange.lowerEndApplicantsCountRange;
        }
        if ((i & 2) != 0) {
            j2 = applicantsCountRange.upperEndApplicantsCountRange;
        }
        return applicantsCountRange.copy(j, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getLowerEndApplicantsCountRange() {
        return this.lowerEndApplicantsCountRange;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getUpperEndApplicantsCountRange() {
        return this.upperEndApplicantsCountRange;
    }

    public final ApplicantsCountRange copy(long lowerEndApplicantsCountRange, long upperEndApplicantsCountRange) {
        return new ApplicantsCountRange(lowerEndApplicantsCountRange, upperEndApplicantsCountRange);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplicantsCountRange)) {
            return false;
        }
        ApplicantsCountRange applicantsCountRange = (ApplicantsCountRange) other;
        return this.lowerEndApplicantsCountRange == applicantsCountRange.lowerEndApplicantsCountRange && this.upperEndApplicantsCountRange == applicantsCountRange.upperEndApplicantsCountRange;
    }

    public final long getLowerEndApplicantsCountRange() {
        return this.lowerEndApplicantsCountRange;
    }

    public final long getUpperEndApplicantsCountRange() {
        return this.upperEndApplicantsCountRange;
    }

    public int hashCode() {
        return Long.hashCode(this.upperEndApplicantsCountRange) + (Long.hashCode(this.lowerEndApplicantsCountRange) * 31);
    }

    public String toString() {
        return r6.d(this.upperEndApplicantsCountRange, ")", w40.i(this.lowerEndApplicantsCountRange, "ApplicantsCountRange(lowerEndApplicantsCountRange=", ", upperEndApplicantsCountRange="));
    }
}
