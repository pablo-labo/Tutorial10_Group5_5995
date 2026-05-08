package com.indeed.android.myjobs.data.model;

import defpackage.wl7;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/indeed/android/myjobs/data/model/InterviewLinkGenerationResponse;", "", "success", "", "errorCode", "", "result", "Lcom/indeed/android/myjobs/data/model/Result;", "<init>", "(ZLjava/lang/String;Lcom/indeed/android/myjobs/data/model/Result;)V", "getSuccess", "()Z", "getErrorCode", "()Ljava/lang/String;", "getResult", "()Lcom/indeed/android/myjobs/data/model/Result;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InterviewLinkGenerationResponse {
    public static final int $stable = 0;
    private final String errorCode;
    private final Result result;
    private final boolean success;

    public InterviewLinkGenerationResponse(boolean z, String str, Result result) {
        this.success = z;
        this.errorCode = str;
        this.result = result;
    }

    public static /* synthetic */ InterviewLinkGenerationResponse copy$default(InterviewLinkGenerationResponse interviewLinkGenerationResponse, boolean z, String str, Result result, int i, Object obj) {
        if ((i & 1) != 0) {
            z = interviewLinkGenerationResponse.success;
        }
        if ((i & 2) != 0) {
            str = interviewLinkGenerationResponse.errorCode;
        }
        if ((i & 4) != 0) {
            result = interviewLinkGenerationResponse.result;
        }
        return interviewLinkGenerationResponse.copy(z, str, result);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Result getResult() {
        return this.result;
    }

    public final InterviewLinkGenerationResponse copy(boolean success, String errorCode, Result result) {
        return new InterviewLinkGenerationResponse(success, errorCode, result);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InterviewLinkGenerationResponse)) {
            return false;
        }
        InterviewLinkGenerationResponse interviewLinkGenerationResponse = (InterviewLinkGenerationResponse) other;
        return this.success == interviewLinkGenerationResponse.success && wl7.b(this.errorCode, interviewLinkGenerationResponse.errorCode) && wl7.b(this.result, interviewLinkGenerationResponse.result);
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final Result getResult() {
        return this.result;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.success) * 31;
        String str = this.errorCode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Result result = this.result;
        return iHashCode2 + (result != null ? result.hashCode() : 0);
    }

    public String toString() {
        return "InterviewLinkGenerationResponse(success=" + this.success + ", errorCode=" + this.errorCode + ", result=" + this.result + ")";
    }
}
