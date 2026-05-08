package com.indeed.android.myjobs.data.model;

import defpackage.akb;
import defpackage.ia;
import defpackage.l6;
import defpackage.u40;
import defpackage.w20;
import defpackage.wl7;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JO\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\""}, d2 = {"Lcom/indeed/android/myjobs/data/model/InterviewLinkGenerationRequest;", "", "apiToken", "", "email", "source", "jobTitle", "jobCompanyName", "referer", "iaMeta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApiToken", "()Ljava/lang/String;", "getEmail", "getSource", "getJobTitle", "getJobCompanyName", "getReferer", "getIaMeta", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InterviewLinkGenerationRequest {
    public static final int $stable = 0;
    private final String apiToken;
    private final String email;
    private final String iaMeta;
    private final String jobCompanyName;
    private final String jobTitle;
    private final String referer;
    private final String source;

    public InterviewLinkGenerationRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        w20.p(str, str2, str3, str4, str5);
        str6.getClass();
        str7.getClass();
        this.apiToken = str;
        this.email = str2;
        this.source = str3;
        this.jobTitle = str4;
        this.jobCompanyName = str5;
        this.referer = str6;
        this.iaMeta = str7;
    }

    public static /* synthetic */ InterviewLinkGenerationRequest copy$default(InterviewLinkGenerationRequest interviewLinkGenerationRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = interviewLinkGenerationRequest.apiToken;
        }
        if ((i & 2) != 0) {
            str2 = interviewLinkGenerationRequest.email;
        }
        if ((i & 4) != 0) {
            str3 = interviewLinkGenerationRequest.source;
        }
        if ((i & 8) != 0) {
            str4 = interviewLinkGenerationRequest.jobTitle;
        }
        if ((i & 16) != 0) {
            str5 = interviewLinkGenerationRequest.jobCompanyName;
        }
        if ((i & 32) != 0) {
            str6 = interviewLinkGenerationRequest.referer;
        }
        if ((i & 64) != 0) {
            str7 = interviewLinkGenerationRequest.iaMeta;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return interviewLinkGenerationRequest.copy(str, str2, str11, str4, str10, str8, str9);
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
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getJobTitle() {
        return this.jobTitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getJobCompanyName() {
        return this.jobCompanyName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getReferer() {
        return this.referer;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getIaMeta() {
        return this.iaMeta;
    }

    public final InterviewLinkGenerationRequest copy(String apiToken, String email, String source, String jobTitle, String jobCompanyName, String referer, String iaMeta) {
        w20.p(apiToken, email, source, jobTitle, jobCompanyName);
        referer.getClass();
        iaMeta.getClass();
        return new InterviewLinkGenerationRequest(apiToken, email, source, jobTitle, jobCompanyName, referer, iaMeta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InterviewLinkGenerationRequest)) {
            return false;
        }
        InterviewLinkGenerationRequest interviewLinkGenerationRequest = (InterviewLinkGenerationRequest) other;
        return wl7.b(this.apiToken, interviewLinkGenerationRequest.apiToken) && wl7.b(this.email, interviewLinkGenerationRequest.email) && wl7.b(this.source, interviewLinkGenerationRequest.source) && wl7.b(this.jobTitle, interviewLinkGenerationRequest.jobTitle) && wl7.b(this.jobCompanyName, interviewLinkGenerationRequest.jobCompanyName) && wl7.b(this.referer, interviewLinkGenerationRequest.referer) && wl7.b(this.iaMeta, interviewLinkGenerationRequest.iaMeta);
    }

    public final String getApiToken() {
        return this.apiToken;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getIaMeta() {
        return this.iaMeta;
    }

    public final String getJobCompanyName() {
        return this.jobCompanyName;
    }

    public final String getJobTitle() {
        return this.jobTitle;
    }

    public final String getReferer() {
        return this.referer;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        return this.iaMeta.hashCode() + akb.d(akb.d(akb.d(akb.d(akb.d(this.apiToken.hashCode() * 31, 31, this.email), 31, this.source), 31, this.jobTitle), 31, this.jobCompanyName), 31, this.referer);
    }

    public String toString() {
        String str = this.apiToken;
        String str2 = this.email;
        String str3 = this.source;
        String str4 = this.jobTitle;
        String str5 = this.jobCompanyName;
        String str6 = this.referer;
        String str7 = this.iaMeta;
        StringBuilder sbF = u40.f("InterviewLinkGenerationRequest(apiToken=", str, ", email=", str2, ", source=");
        ia.r(sbF, str3, ", jobTitle=", str4, ", jobCompanyName=");
        ia.r(sbF, str5, ", referer=", str6, ", iaMeta=");
        return l6.i(sbF, str7, ")");
    }
}
