package com.indeed.android.myjobs.data.model;

import defpackage.akb;
import defpackage.l6;
import defpackage.u40;
import defpackage.wl7;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/indeed/android/myjobs/data/model/IaMeta;", "", "interview", "Lcom/indeed/android/myjobs/data/model/IaMeta$Interview;", "<init>", "(Lcom/indeed/android/myjobs/data/model/IaMeta$Interview;)V", "getInterview", "()Lcom/indeed/android/myjobs/data/model/IaMeta$Interview;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Interview", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IaMeta {
    public static final int $stable = 0;
    private final Interview interview;

    public IaMeta(Interview interview) {
        interview.getClass();
        this.interview = interview;
    }

    public static /* synthetic */ IaMeta copy$default(IaMeta iaMeta, Interview interview, int i, Object obj) {
        if ((i & 1) != 0) {
            interview = iaMeta.interview;
        }
        return iaMeta.copy(interview);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Interview getInterview() {
        return this.interview;
    }

    public final IaMeta copy(Interview interview) {
        interview.getClass();
        return new IaMeta(interview);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IaMeta) && wl7.b(this.interview, ((IaMeta) other).interview);
    }

    public final Interview getInterview() {
        return this.interview;
    }

    public int hashCode() {
        return this.interview.hashCode();
    }

    public String toString() {
        return "IaMeta(interview=" + this.interview + ")";
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/indeed/android/myjobs/data/model/IaMeta$Interview;", "", "rsvpUUID", "", "destination", "interviewKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRsvpUUID", "()Ljava/lang/String;", "getDestination", "getInterviewKey", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Interview {
        public static final int $stable = 0;
        private final String destination;
        private final String interviewKey;
        private final String rsvpUUID;

        public /* synthetic */ Interview(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, str2, (i & 4) != 0 ? null : str3);
        }

        public static /* synthetic */ Interview copy$default(Interview interview, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = interview.rsvpUUID;
            }
            if ((i & 2) != 0) {
                str2 = interview.destination;
            }
            if ((i & 4) != 0) {
                str3 = interview.interviewKey;
            }
            return interview.copy(str, str2, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getRsvpUUID() {
            return this.rsvpUUID;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDestination() {
            return this.destination;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getInterviewKey() {
            return this.interviewKey;
        }

        public final Interview copy(String rsvpUUID, String destination, String interviewKey) {
            destination.getClass();
            return new Interview(rsvpUUID, destination, interviewKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Interview)) {
                return false;
            }
            Interview interview = (Interview) other;
            return wl7.b(this.rsvpUUID, interview.rsvpUUID) && wl7.b(this.destination, interview.destination) && wl7.b(this.interviewKey, interview.interviewKey);
        }

        public final String getDestination() {
            return this.destination;
        }

        public final String getInterviewKey() {
            return this.interviewKey;
        }

        public final String getRsvpUUID() {
            return this.rsvpUUID;
        }

        public int hashCode() {
            String str = this.rsvpUUID;
            int iD = akb.d((str == null ? 0 : str.hashCode()) * 31, 31, this.destination);
            String str2 = this.interviewKey;
            return iD + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.rsvpUUID;
            String str2 = this.destination;
            return l6.i(u40.f("Interview(rsvpUUID=", str, ", destination=", str2, ", interviewKey="), this.interviewKey, ")");
        }

        public Interview(String str, String str2, String str3) {
            str2.getClass();
            this.rsvpUUID = str;
            this.destination = str2;
            this.interviewKey = str3;
        }
    }
}
