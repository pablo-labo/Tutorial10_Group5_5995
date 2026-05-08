package com.indeed.android.messaging.data.conversations;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.akb;
import defpackage.ia;
import defpackage.l6;
import defpackage.u40;
import defpackage.w20;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003Jc\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006("}, d2 = {"Lcom/indeed/android/messaging/data/conversations/InterviewLinkParams;", "", "apiToken", "", "email", "jobTitle", "jobCompany", "interviewId", "slotDuration", "timezoneId", "source", "destination", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApiToken", "()Ljava/lang/String;", "getEmail", "getJobTitle", "getJobCompany", "getInterviewId", "getSlotDuration", "getTimezoneId", "getSource", "getDestination", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InterviewLinkParams {
    public static final int $stable = 0;
    private final String apiToken;
    private final String destination;
    private final String email;
    private final String interviewId;
    private final String jobCompany;
    private final String jobTitle;
    private final String slotDuration;
    private final String source;
    private final String timezoneId;

    public InterviewLinkParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        w20.p(str, str2, str3, str4, str5);
        str6.getClass();
        str7.getClass();
        str8.getClass();
        str9.getClass();
        this.apiToken = str;
        this.email = str2;
        this.jobTitle = str3;
        this.jobCompany = str4;
        this.interviewId = str5;
        this.slotDuration = str6;
        this.timezoneId = str7;
        this.source = str8;
        this.destination = str9;
    }

    public static /* synthetic */ InterviewLinkParams copy$default(InterviewLinkParams interviewLinkParams, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = interviewLinkParams.apiToken;
        }
        if ((i & 2) != 0) {
            str2 = interviewLinkParams.email;
        }
        if ((i & 4) != 0) {
            str3 = interviewLinkParams.jobTitle;
        }
        if ((i & 8) != 0) {
            str4 = interviewLinkParams.jobCompany;
        }
        if ((i & 16) != 0) {
            str5 = interviewLinkParams.interviewId;
        }
        if ((i & 32) != 0) {
            str6 = interviewLinkParams.slotDuration;
        }
        if ((i & 64) != 0) {
            str7 = interviewLinkParams.timezoneId;
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            str8 = interviewLinkParams.source;
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            str9 = interviewLinkParams.destination;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str5;
        String str15 = str3;
        return interviewLinkParams.copy(str, str2, str15, str4, str14, str12, str13, str10, str11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApiToken() {
        return this.apiToken;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getJobTitle() {
        return this.jobTitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getJobCompany() {
        return this.jobCompany;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getInterviewId() {
        return this.interviewId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSlotDuration() {
        return this.slotDuration;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTimezoneId() {
        return this.timezoneId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDestination() {
        return this.destination;
    }

    public final InterviewLinkParams copy(String apiToken, String email, String jobTitle, String jobCompany, String interviewId, String slotDuration, String timezoneId, String source, String destination) {
        w20.p(apiToken, email, jobTitle, jobCompany, interviewId);
        slotDuration.getClass();
        timezoneId.getClass();
        source.getClass();
        destination.getClass();
        return new InterviewLinkParams(apiToken, email, jobTitle, jobCompany, interviewId, slotDuration, timezoneId, source, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InterviewLinkParams)) {
            return false;
        }
        InterviewLinkParams interviewLinkParams = (InterviewLinkParams) other;
        return wl7.b(this.apiToken, interviewLinkParams.apiToken) && wl7.b(this.email, interviewLinkParams.email) && wl7.b(this.jobTitle, interviewLinkParams.jobTitle) && wl7.b(this.jobCompany, interviewLinkParams.jobCompany) && wl7.b(this.interviewId, interviewLinkParams.interviewId) && wl7.b(this.slotDuration, interviewLinkParams.slotDuration) && wl7.b(this.timezoneId, interviewLinkParams.timezoneId) && wl7.b(this.source, interviewLinkParams.source) && wl7.b(this.destination, interviewLinkParams.destination);
    }

    public final String getApiToken() {
        return this.apiToken;
    }

    public final String getDestination() {
        return this.destination;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getInterviewId() {
        return this.interviewId;
    }

    public final String getJobCompany() {
        return this.jobCompany;
    }

    public final String getJobTitle() {
        return this.jobTitle;
    }

    public final String getSlotDuration() {
        return this.slotDuration;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getTimezoneId() {
        return this.timezoneId;
    }

    public int hashCode() {
        return this.destination.hashCode() + akb.d(akb.d(akb.d(akb.d(akb.d(akb.d(akb.d(this.apiToken.hashCode() * 31, 31, this.email), 31, this.jobTitle), 31, this.jobCompany), 31, this.interviewId), 31, this.slotDuration), 31, this.timezoneId), 31, this.source);
    }

    public String toString() {
        String str = this.apiToken;
        String str2 = this.email;
        String str3 = this.jobTitle;
        String str4 = this.jobCompany;
        String str5 = this.interviewId;
        String str6 = this.slotDuration;
        String str7 = this.timezoneId;
        String str8 = this.source;
        String str9 = this.destination;
        StringBuilder sbF = u40.f("InterviewLinkParams(apiToken=", str, ", email=", str2, ", jobTitle=");
        ia.r(sbF, str3, ", jobCompany=", str4, ", interviewId=");
        ia.r(sbF, str5, ", slotDuration=", str6, ", timezoneId=");
        ia.r(sbF, str7, ", source=", str8, ", destination=");
        return l6.i(sbF, str9, ")");
    }
}
