package com.indeed.android.myjobs.data.model.request;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.akb;
import defpackage.ia;
import defpackage.u40;
import defpackage.w20;
import defpackage.wl7;
import defpackage.z3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b.\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¥\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014¨\u00067"}, d2 = {"Lcom/indeed/android/myjobs/data/model/request/ContactedDeclineSurveyRequest;", "", "rAKey", "", "sAKey", "uid", "h", "reason", "comment", "ecmi", "hl", "co", "mailAgent", "source", "jobId", "jt", "company", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRAKey", "()Ljava/lang/String;", "getSAKey", "getUid", "getH", "getReason", "getComment", "getEcmi", "getHl", "getCo", "getMailAgent", "getSource", "getJobId", "getJt", "getCompany", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "", "other", "hashCode", "", "toString", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ContactedDeclineSurveyRequest {
    public static final int $stable = 0;
    private final String co;
    private final String comment;
    private final String company;
    private final String ecmi;
    private final String h;
    private final String hl;
    private final String jobId;
    private final String jt;
    private final String mailAgent;
    private final String rAKey;
    private final String reason;
    private final String sAKey;
    private final String source;
    private final String uid;

    public /* synthetic */ ContactedDeclineSurveyRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, (i & 64) != 0 ? null : str7, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : str8, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : str9, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : str10, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRAKey() {
        return this.rAKey;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getMailAgent() {
        return this.mailAgent;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getJobId() {
        return this.jobId;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getJt() {
        return this.jt;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getCompany() {
        return this.company;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSAKey() {
        return this.sAKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getH() {
        return this.h;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getEcmi() {
        return this.ecmi;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getHl() {
        return this.hl;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCo() {
        return this.co;
    }

    public final ContactedDeclineSurveyRequest copy(String rAKey, String sAKey, String uid, String h, String reason, String comment, String ecmi, String hl, String co, String mailAgent, String source, String jobId, String jt, String company) {
        w20.p(rAKey, sAKey, uid, h, reason);
        comment.getClass();
        return new ContactedDeclineSurveyRequest(rAKey, sAKey, uid, h, reason, comment, ecmi, hl, co, mailAgent, source, jobId, jt, company);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactedDeclineSurveyRequest)) {
            return false;
        }
        ContactedDeclineSurveyRequest contactedDeclineSurveyRequest = (ContactedDeclineSurveyRequest) other;
        return wl7.b(this.rAKey, contactedDeclineSurveyRequest.rAKey) && wl7.b(this.sAKey, contactedDeclineSurveyRequest.sAKey) && wl7.b(this.uid, contactedDeclineSurveyRequest.uid) && wl7.b(this.h, contactedDeclineSurveyRequest.h) && wl7.b(this.reason, contactedDeclineSurveyRequest.reason) && wl7.b(this.comment, contactedDeclineSurveyRequest.comment) && wl7.b(this.ecmi, contactedDeclineSurveyRequest.ecmi) && wl7.b(this.hl, contactedDeclineSurveyRequest.hl) && wl7.b(this.co, contactedDeclineSurveyRequest.co) && wl7.b(this.mailAgent, contactedDeclineSurveyRequest.mailAgent) && wl7.b(this.source, contactedDeclineSurveyRequest.source) && wl7.b(this.jobId, contactedDeclineSurveyRequest.jobId) && wl7.b(this.jt, contactedDeclineSurveyRequest.jt) && wl7.b(this.company, contactedDeclineSurveyRequest.company);
    }

    public final String getCo() {
        return this.co;
    }

    public final String getComment() {
        return this.comment;
    }

    public final String getCompany() {
        return this.company;
    }

    public final String getEcmi() {
        return this.ecmi;
    }

    public final String getH() {
        return this.h;
    }

    public final String getHl() {
        return this.hl;
    }

    public final String getJobId() {
        return this.jobId;
    }

    public final String getJt() {
        return this.jt;
    }

    public final String getMailAgent() {
        return this.mailAgent;
    }

    public final String getRAKey() {
        return this.rAKey;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getSAKey() {
        return this.sAKey;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        int iD = akb.d(akb.d(akb.d(akb.d(akb.d(this.rAKey.hashCode() * 31, 31, this.sAKey), 31, this.uid), 31, this.h), 31, this.reason), 31, this.comment);
        String str = this.ecmi;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.hl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.co;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.mailAgent;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.source;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.jobId;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.jt;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.company;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public String toString() {
        String str = this.rAKey;
        String str2 = this.sAKey;
        String str3 = this.uid;
        String str4 = this.h;
        String str5 = this.reason;
        String str6 = this.comment;
        String str7 = this.ecmi;
        String str8 = this.hl;
        String str9 = this.co;
        String str10 = this.mailAgent;
        String str11 = this.source;
        String str12 = this.jobId;
        String str13 = this.jt;
        String str14 = this.company;
        StringBuilder sbF = u40.f("ContactedDeclineSurveyRequest(rAKey=", str, ", sAKey=", str2, ", uid=");
        ia.r(sbF, str3, ", h=", str4, ", reason=");
        ia.r(sbF, str5, ", comment=", str6, ", ecmi=");
        ia.r(sbF, str7, ", hl=", str8, ", co=");
        ia.r(sbF, str9, ", mailAgent=", str10, ", source=");
        ia.r(sbF, str11, ", jobId=", str12, ", jt=");
        return z3.n(sbF, str13, ", company=", str14, ")");
    }

    public ContactedDeclineSurveyRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        w20.p(str, str2, str3, str4, str5);
        str6.getClass();
        this.rAKey = str;
        this.sAKey = str2;
        this.uid = str3;
        this.h = str4;
        this.reason = str5;
        this.comment = str6;
        this.ecmi = str7;
        this.hl = str8;
        this.co = str9;
        this.mailAgent = str10;
        this.source = str11;
        this.jobId = str12;
        this.jt = str13;
        this.company = str14;
    }
}
