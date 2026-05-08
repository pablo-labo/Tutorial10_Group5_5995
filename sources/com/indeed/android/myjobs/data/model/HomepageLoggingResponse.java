package com.indeed.android.myjobs.data.model;

import defpackage.l5;
import defpackage.wl7;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/indeed/android/myjobs/data/model/HomepageLoggingResponse;", "", "success", "", "body", "Lcom/indeed/android/myjobs/data/model/HomepageLoggingResponse$Body;", "<init>", "(ZLcom/indeed/android/myjobs/data/model/HomepageLoggingResponse$Body;)V", "getSuccess", "()Z", "getBody", "()Lcom/indeed/android/myjobs/data/model/HomepageLoggingResponse$Body;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "Body", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HomepageLoggingResponse {
    public static final int $stable = 0;
    private final Body body;
    private final boolean success;

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/indeed/android/myjobs/data/model/HomepageLoggingResponse$Body;", "", "pageTk", "", "<init>", "(Ljava/lang/String;)V", "getPageTk", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Body {
        public static final int $stable = 0;
        private final String pageTk;

        public Body(String str) {
            this.pageTk = str;
        }

        public static /* synthetic */ Body copy$default(Body body, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = body.pageTk;
            }
            return body.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPageTk() {
            return this.pageTk;
        }

        public final Body copy(String pageTk) {
            return new Body(pageTk);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Body) && wl7.b(this.pageTk, ((Body) other).pageTk);
        }

        public final String getPageTk() {
            return this.pageTk;
        }

        public int hashCode() {
            String str = this.pageTk;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return l5.m("Body(pageTk=", this.pageTk, ")");
        }
    }

    public HomepageLoggingResponse(boolean z, Body body) {
        this.success = z;
        this.body = body;
    }

    public static /* synthetic */ HomepageLoggingResponse copy$default(HomepageLoggingResponse homepageLoggingResponse, boolean z, Body body, int i, Object obj) {
        if ((i & 1) != 0) {
            z = homepageLoggingResponse.success;
        }
        if ((i & 2) != 0) {
            body = homepageLoggingResponse.body;
        }
        return homepageLoggingResponse.copy(z, body);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Body getBody() {
        return this.body;
    }

    public final HomepageLoggingResponse copy(boolean success, Body body) {
        return new HomepageLoggingResponse(success, body);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomepageLoggingResponse)) {
            return false;
        }
        HomepageLoggingResponse homepageLoggingResponse = (HomepageLoggingResponse) other;
        return this.success == homepageLoggingResponse.success && wl7.b(this.body, homepageLoggingResponse.body);
    }

    public final Body getBody() {
        return this.body;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.success) * 31;
        Body body = this.body;
        return iHashCode + (body == null ? 0 : body.hashCode());
    }

    public String toString() {
        return "HomepageLoggingResponse(success=" + this.success + ", body=" + this.body + ")";
    }
}
