package com.indeed.android.myjobs.data.model;

import defpackage.akb;
import defpackage.ia;
import defpackage.u40;
import defpackage.w20;
import defpackage.wl7;
import defpackage.z3;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/indeed/android/myjobs/data/model/DeleteSavedJobRequest;", "", "cause", "", "prevAppStatusState", "prevAppStatusSource", "prevUserJobStatusState", "newAppStatusState", "newAppStatusSource", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCause", "()Ljava/lang/String;", "getPrevAppStatusState", "getPrevAppStatusSource", "getPrevUserJobStatusState", "getNewAppStatusState", "getNewAppStatusSource", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeleteSavedJobRequest {
    public static final int $stable = 0;
    private final String cause;
    private final String newAppStatusSource;
    private final String newAppStatusState;
    private final String prevAppStatusSource;
    private final String prevAppStatusState;
    private final String prevUserJobStatusState;

    public DeleteSavedJobRequest(String str, String str2, String str3, String str4, String str5, String str6) {
        w20.p(str, str2, str3, str4, str5);
        str6.getClass();
        this.cause = str;
        this.prevAppStatusState = str2;
        this.prevAppStatusSource = str3;
        this.prevUserJobStatusState = str4;
        this.newAppStatusState = str5;
        this.newAppStatusSource = str6;
    }

    public static /* synthetic */ DeleteSavedJobRequest copy$default(DeleteSavedJobRequest deleteSavedJobRequest, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deleteSavedJobRequest.cause;
        }
        if ((i & 2) != 0) {
            str2 = deleteSavedJobRequest.prevAppStatusState;
        }
        if ((i & 4) != 0) {
            str3 = deleteSavedJobRequest.prevAppStatusSource;
        }
        if ((i & 8) != 0) {
            str4 = deleteSavedJobRequest.prevUserJobStatusState;
        }
        if ((i & 16) != 0) {
            str5 = deleteSavedJobRequest.newAppStatusState;
        }
        if ((i & 32) != 0) {
            str6 = deleteSavedJobRequest.newAppStatusSource;
        }
        String str7 = str5;
        String str8 = str6;
        return deleteSavedJobRequest.copy(str, str2, str3, str4, str7, str8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCause() {
        return this.cause;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPrevAppStatusState() {
        return this.prevAppStatusState;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPrevAppStatusSource() {
        return this.prevAppStatusSource;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPrevUserJobStatusState() {
        return this.prevUserJobStatusState;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNewAppStatusState() {
        return this.newAppStatusState;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNewAppStatusSource() {
        return this.newAppStatusSource;
    }

    public final DeleteSavedJobRequest copy(String cause, String prevAppStatusState, String prevAppStatusSource, String prevUserJobStatusState, String newAppStatusState, String newAppStatusSource) {
        w20.p(cause, prevAppStatusState, prevAppStatusSource, prevUserJobStatusState, newAppStatusState);
        newAppStatusSource.getClass();
        return new DeleteSavedJobRequest(cause, prevAppStatusState, prevAppStatusSource, prevUserJobStatusState, newAppStatusState, newAppStatusSource);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteSavedJobRequest)) {
            return false;
        }
        DeleteSavedJobRequest deleteSavedJobRequest = (DeleteSavedJobRequest) other;
        return wl7.b(this.cause, deleteSavedJobRequest.cause) && wl7.b(this.prevAppStatusState, deleteSavedJobRequest.prevAppStatusState) && wl7.b(this.prevAppStatusSource, deleteSavedJobRequest.prevAppStatusSource) && wl7.b(this.prevUserJobStatusState, deleteSavedJobRequest.prevUserJobStatusState) && wl7.b(this.newAppStatusState, deleteSavedJobRequest.newAppStatusState) && wl7.b(this.newAppStatusSource, deleteSavedJobRequest.newAppStatusSource);
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

    public int hashCode() {
        return this.newAppStatusSource.hashCode() + akb.d(akb.d(akb.d(akb.d(this.cause.hashCode() * 31, 31, this.prevAppStatusState), 31, this.prevAppStatusSource), 31, this.prevUserJobStatusState), 31, this.newAppStatusState);
    }

    public String toString() {
        String str = this.cause;
        String str2 = this.prevAppStatusState;
        String str3 = this.prevAppStatusSource;
        String str4 = this.prevUserJobStatusState;
        String str5 = this.newAppStatusState;
        String str6 = this.newAppStatusSource;
        StringBuilder sbF = u40.f("DeleteSavedJobRequest(cause=", str, ", prevAppStatusState=", str2, ", prevAppStatusSource=");
        ia.r(sbF, str3, ", prevUserJobStatusState=", str4, ", newAppStatusState=");
        return z3.n(sbF, str5, ", newAppStatusSource=", str6, ")");
    }
}
