package com.indeed.android.myjobs.data.model;

import defpackage.akb;
import defpackage.ia;
import defpackage.l6;
import defpackage.wl7;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006$"}, d2 = {"Lcom/indeed/android/myjobs/data/model/UpdateJobsStatusUsecase;", "", "statuses", "Lcom/indeed/android/myjobs/data/model/Statuses;", "cause", "", "prevAppStatusState", "prevAppStatusSource", "prevUserJobStatusState", "newAppStatusState", "newAppStatusSource", "<init>", "(Lcom/indeed/android/myjobs/data/model/Statuses;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStatuses", "()Lcom/indeed/android/myjobs/data/model/Statuses;", "getCause", "()Ljava/lang/String;", "getPrevAppStatusState", "getPrevAppStatusSource", "getPrevUserJobStatusState", "getNewAppStatusState", "getNewAppStatusSource", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UpdateJobsStatusUsecase {
    public static final int $stable = 0;
    private final String cause;
    private final String newAppStatusSource;
    private final String newAppStatusState;
    private final String prevAppStatusSource;
    private final String prevAppStatusState;
    private final String prevUserJobStatusState;
    private final Statuses statuses;

    public UpdateJobsStatusUsecase(Statuses statuses, String str, String str2, String str3, String str4, String str5, String str6) {
        statuses.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        this.statuses = statuses;
        this.cause = str;
        this.prevAppStatusState = str2;
        this.prevAppStatusSource = str3;
        this.prevUserJobStatusState = str4;
        this.newAppStatusState = str5;
        this.newAppStatusSource = str6;
    }

    public static /* synthetic */ UpdateJobsStatusUsecase copy$default(UpdateJobsStatusUsecase updateJobsStatusUsecase, Statuses statuses, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            statuses = updateJobsStatusUsecase.statuses;
        }
        if ((i & 2) != 0) {
            str = updateJobsStatusUsecase.cause;
        }
        if ((i & 4) != 0) {
            str2 = updateJobsStatusUsecase.prevAppStatusState;
        }
        if ((i & 8) != 0) {
            str3 = updateJobsStatusUsecase.prevAppStatusSource;
        }
        if ((i & 16) != 0) {
            str4 = updateJobsStatusUsecase.prevUserJobStatusState;
        }
        if ((i & 32) != 0) {
            str5 = updateJobsStatusUsecase.newAppStatusState;
        }
        if ((i & 64) != 0) {
            str6 = updateJobsStatusUsecase.newAppStatusSource;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        String str10 = str2;
        return updateJobsStatusUsecase.copy(statuses, str, str10, str3, str9, str7, str8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Statuses getStatuses() {
        return this.statuses;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCause() {
        return this.cause;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPrevAppStatusState() {
        return this.prevAppStatusState;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPrevAppStatusSource() {
        return this.prevAppStatusSource;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPrevUserJobStatusState() {
        return this.prevUserJobStatusState;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNewAppStatusState() {
        return this.newAppStatusState;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getNewAppStatusSource() {
        return this.newAppStatusSource;
    }

    public final UpdateJobsStatusUsecase copy(Statuses statuses, String cause, String prevAppStatusState, String prevAppStatusSource, String prevUserJobStatusState, String newAppStatusState, String newAppStatusSource) {
        statuses.getClass();
        cause.getClass();
        prevAppStatusState.getClass();
        prevAppStatusSource.getClass();
        prevUserJobStatusState.getClass();
        newAppStatusState.getClass();
        newAppStatusSource.getClass();
        return new UpdateJobsStatusUsecase(statuses, cause, prevAppStatusState, prevAppStatusSource, prevUserJobStatusState, newAppStatusState, newAppStatusSource);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateJobsStatusUsecase)) {
            return false;
        }
        UpdateJobsStatusUsecase updateJobsStatusUsecase = (UpdateJobsStatusUsecase) other;
        return wl7.b(this.statuses, updateJobsStatusUsecase.statuses) && wl7.b(this.cause, updateJobsStatusUsecase.cause) && wl7.b(this.prevAppStatusState, updateJobsStatusUsecase.prevAppStatusState) && wl7.b(this.prevAppStatusSource, updateJobsStatusUsecase.prevAppStatusSource) && wl7.b(this.prevUserJobStatusState, updateJobsStatusUsecase.prevUserJobStatusState) && wl7.b(this.newAppStatusState, updateJobsStatusUsecase.newAppStatusState) && wl7.b(this.newAppStatusSource, updateJobsStatusUsecase.newAppStatusSource);
    }

    public final String getCause() {
        return this.cause;
    }

    public final String getNewAppStatusSource() {
        return this.newAppStatusSource;
    }

    public final String getNewAppStatusState() {
        return this.newAppStatusState;
    }

    public final String getPrevAppStatusSource() {
        return this.prevAppStatusSource;
    }

    public final String getPrevAppStatusState() {
        return this.prevAppStatusState;
    }

    public final String getPrevUserJobStatusState() {
        return this.prevUserJobStatusState;
    }

    public final Statuses getStatuses() {
        return this.statuses;
    }

    public int hashCode() {
        return this.newAppStatusSource.hashCode() + akb.d(akb.d(akb.d(akb.d(akb.d(this.statuses.hashCode() * 31, 31, this.cause), 31, this.prevAppStatusState), 31, this.prevAppStatusSource), 31, this.prevUserJobStatusState), 31, this.newAppStatusState);
    }

    public String toString() {
        Statuses statuses = this.statuses;
        String str = this.cause;
        String str2 = this.prevAppStatusState;
        String str3 = this.prevAppStatusSource;
        String str4 = this.prevUserJobStatusState;
        String str5 = this.newAppStatusState;
        String str6 = this.newAppStatusSource;
        StringBuilder sb = new StringBuilder("UpdateJobsStatusUsecase(statuses=");
        sb.append(statuses);
        sb.append(", cause=");
        sb.append(str);
        sb.append(", prevAppStatusState=");
        ia.r(sb, str2, ", prevAppStatusSource=", str3, ", prevUserJobStatusState=");
        ia.r(sb, str4, ", newAppStatusState=", str5, ", newAppStatusSource=");
        return l6.i(sb, str6, ")");
    }
}
