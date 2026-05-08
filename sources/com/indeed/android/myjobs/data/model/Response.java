package com.indeed.android.myjobs.data.model;

import defpackage.wl7;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/indeed/android/myjobs/data/model/Response;", "", "success", "", "body", "Lcom/indeed/android/myjobs/data/model/InterviewBody;", "<init>", "(ZLcom/indeed/android/myjobs/data/model/InterviewBody;)V", "getSuccess", "()Z", "getBody", "()Lcom/indeed/android/myjobs/data/model/InterviewBody;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Response {
    public static final int $stable = 8;
    private final InterviewBody body;
    private final boolean success;

    public Response(boolean z, InterviewBody interviewBody) {
        this.success = z;
        this.body = interviewBody;
    }

    public static /* synthetic */ Response copy$default(Response response, boolean z, InterviewBody interviewBody, int i, Object obj) {
        if ((i & 1) != 0) {
            z = response.success;
        }
        if ((i & 2) != 0) {
            interviewBody = response.body;
        }
        return response.copy(z, interviewBody);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final InterviewBody getBody() {
        return this.body;
    }

    public final Response copy(boolean success, InterviewBody body) {
        return new Response(success, body);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Response)) {
            return false;
        }
        Response response = (Response) other;
        return this.success == response.success && wl7.b(this.body, response.body);
    }

    public final InterviewBody getBody() {
        return this.body;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.success) * 31;
        InterviewBody interviewBody = this.body;
        return iHashCode + (interviewBody == null ? 0 : interviewBody.hashCode());
    }

    public String toString() {
        return "Response(success=" + this.success + ", body=" + this.body + ")";
    }
}
