package com.indeed.android.myjobs.data.model;

import defpackage.wl7;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/indeed/android/myjobs/data/model/Statuses;", "", "candidateStatus", "Lcom/indeed/android/myjobs/data/model/SelfReportedStatus;", "selfReportedStatus", "employerJobStatus", "userJobStatus", "Lcom/indeed/android/myjobs/data/model/UserJobStatus;", "<init>", "(Lcom/indeed/android/myjobs/data/model/SelfReportedStatus;Lcom/indeed/android/myjobs/data/model/SelfReportedStatus;Lcom/indeed/android/myjobs/data/model/SelfReportedStatus;Lcom/indeed/android/myjobs/data/model/UserJobStatus;)V", "getCandidateStatus", "()Lcom/indeed/android/myjobs/data/model/SelfReportedStatus;", "getSelfReportedStatus", "getEmployerJobStatus", "getUserJobStatus", "()Lcom/indeed/android/myjobs/data/model/UserJobStatus;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Statuses {
    public static final int $stable = 0;
    private final SelfReportedStatus candidateStatus;
    private final SelfReportedStatus employerJobStatus;
    private final SelfReportedStatus selfReportedStatus;
    private final UserJobStatus userJobStatus;

    public /* synthetic */ Statuses(SelfReportedStatus selfReportedStatus, SelfReportedStatus selfReportedStatus2, SelfReportedStatus selfReportedStatus3, UserJobStatus userJobStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : selfReportedStatus, (i & 2) != 0 ? null : selfReportedStatus2, (i & 4) != 0 ? null : selfReportedStatus3, (i & 8) != 0 ? null : userJobStatus);
    }

    public static /* synthetic */ Statuses copy$default(Statuses statuses, SelfReportedStatus selfReportedStatus, SelfReportedStatus selfReportedStatus2, SelfReportedStatus selfReportedStatus3, UserJobStatus userJobStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            selfReportedStatus = statuses.candidateStatus;
        }
        if ((i & 2) != 0) {
            selfReportedStatus2 = statuses.selfReportedStatus;
        }
        if ((i & 4) != 0) {
            selfReportedStatus3 = statuses.employerJobStatus;
        }
        if ((i & 8) != 0) {
            userJobStatus = statuses.userJobStatus;
        }
        return statuses.copy(selfReportedStatus, selfReportedStatus2, selfReportedStatus3, userJobStatus);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SelfReportedStatus getCandidateStatus() {
        return this.candidateStatus;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SelfReportedStatus getSelfReportedStatus() {
        return this.selfReportedStatus;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SelfReportedStatus getEmployerJobStatus() {
        return this.employerJobStatus;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final UserJobStatus getUserJobStatus() {
        return this.userJobStatus;
    }

    public final Statuses copy(SelfReportedStatus candidateStatus, SelfReportedStatus selfReportedStatus, SelfReportedStatus employerJobStatus, UserJobStatus userJobStatus) {
        return new Statuses(candidateStatus, selfReportedStatus, employerJobStatus, userJobStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Statuses)) {
            return false;
        }
        Statuses statuses = (Statuses) other;
        return wl7.b(this.candidateStatus, statuses.candidateStatus) && wl7.b(this.selfReportedStatus, statuses.selfReportedStatus) && wl7.b(this.employerJobStatus, statuses.employerJobStatus) && wl7.b(this.userJobStatus, statuses.userJobStatus);
    }

    public final SelfReportedStatus getCandidateStatus() {
        return this.candidateStatus;
    }

    public final SelfReportedStatus getEmployerJobStatus() {
        return this.employerJobStatus;
    }

    public final SelfReportedStatus getSelfReportedStatus() {
        return this.selfReportedStatus;
    }

    public final UserJobStatus getUserJobStatus() {
        return this.userJobStatus;
    }

    public int hashCode() {
        SelfReportedStatus selfReportedStatus = this.candidateStatus;
        int iHashCode = (selfReportedStatus == null ? 0 : selfReportedStatus.hashCode()) * 31;
        SelfReportedStatus selfReportedStatus2 = this.selfReportedStatus;
        int iHashCode2 = (iHashCode + (selfReportedStatus2 == null ? 0 : selfReportedStatus2.hashCode())) * 31;
        SelfReportedStatus selfReportedStatus3 = this.employerJobStatus;
        int iHashCode3 = (iHashCode2 + (selfReportedStatus3 == null ? 0 : selfReportedStatus3.hashCode())) * 31;
        UserJobStatus userJobStatus = this.userJobStatus;
        return iHashCode3 + (userJobStatus != null ? userJobStatus.hashCode() : 0);
    }

    public String toString() {
        return "Statuses(candidateStatus=" + this.candidateStatus + ", selfReportedStatus=" + this.selfReportedStatus + ", employerJobStatus=" + this.employerJobStatus + ", userJobStatus=" + this.userJobStatus + ")";
    }

    public Statuses(SelfReportedStatus selfReportedStatus, SelfReportedStatus selfReportedStatus2, SelfReportedStatus selfReportedStatus3, UserJobStatus userJobStatus) {
        this.candidateStatus = selfReportedStatus;
        this.selfReportedStatus = selfReportedStatus2;
        this.employerJobStatus = selfReportedStatus3;
        this.userJobStatus = userJobStatus;
    }

    public Statuses() {
        this(null, null, null, null, 15, null);
    }
}
