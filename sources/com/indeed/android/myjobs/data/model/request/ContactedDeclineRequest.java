package com.indeed.android.myjobs.data.model.request;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.akb;
import defpackage.ia;
import defpackage.l6;
import defpackage.u40;
import defpackage.w20;
import defpackage.wl7;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003Jk\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006("}, d2 = {"Lcom/indeed/android/myjobs/data/model/request/ContactedDeclineRequest;", "", "rAKey", "", "sAKey", "uid", "h", "ecmi", "hl", "co", "mailAgent", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRAKey", "()Ljava/lang/String;", "getSAKey", "getUid", "getH", "getEcmi", "getHl", "getCo", "getMailAgent", "getSource", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ContactedDeclineRequest {
    public static final int $stable = 0;
    private final String co;
    private final String ecmi;
    private final String h;
    private final String hl;
    private final String mailAgent;
    private final String rAKey;
    private final String sAKey;
    private final String source;
    private final String uid;

    public ContactedDeclineRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        w20.p(str, str2, str3, str4, str5);
        this.rAKey = str;
        this.sAKey = str2;
        this.uid = str3;
        this.h = str4;
        this.ecmi = str5;
        this.hl = str6;
        this.co = str7;
        this.mailAgent = str8;
        this.source = str9;
    }

    public static /* synthetic */ ContactedDeclineRequest copy$default(ContactedDeclineRequest contactedDeclineRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contactedDeclineRequest.rAKey;
        }
        if ((i & 2) != 0) {
            str2 = contactedDeclineRequest.sAKey;
        }
        if ((i & 4) != 0) {
            str3 = contactedDeclineRequest.uid;
        }
        if ((i & 8) != 0) {
            str4 = contactedDeclineRequest.h;
        }
        if ((i & 16) != 0) {
            str5 = contactedDeclineRequest.ecmi;
        }
        if ((i & 32) != 0) {
            str6 = contactedDeclineRequest.hl;
        }
        if ((i & 64) != 0) {
            str7 = contactedDeclineRequest.co;
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            str8 = contactedDeclineRequest.mailAgent;
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            str9 = contactedDeclineRequest.source;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str5;
        String str15 = str3;
        return contactedDeclineRequest.copy(str, str2, str15, str4, str14, str12, str13, str10, str11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRAKey() {
        return this.rAKey;
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
    public final String getEcmi() {
        return this.ecmi;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getHl() {
        return this.hl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCo() {
        return this.co;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMailAgent() {
        return this.mailAgent;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final ContactedDeclineRequest copy(String rAKey, String sAKey, String uid, String h, String ecmi, String hl, String co, String mailAgent, String source) {
        rAKey.getClass();
        sAKey.getClass();
        uid.getClass();
        h.getClass();
        ecmi.getClass();
        return new ContactedDeclineRequest(rAKey, sAKey, uid, h, ecmi, hl, co, mailAgent, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactedDeclineRequest)) {
            return false;
        }
        ContactedDeclineRequest contactedDeclineRequest = (ContactedDeclineRequest) other;
        return wl7.b(this.rAKey, contactedDeclineRequest.rAKey) && wl7.b(this.sAKey, contactedDeclineRequest.sAKey) && wl7.b(this.uid, contactedDeclineRequest.uid) && wl7.b(this.h, contactedDeclineRequest.h) && wl7.b(this.ecmi, contactedDeclineRequest.ecmi) && wl7.b(this.hl, contactedDeclineRequest.hl) && wl7.b(this.co, contactedDeclineRequest.co) && wl7.b(this.mailAgent, contactedDeclineRequest.mailAgent) && wl7.b(this.source, contactedDeclineRequest.source);
    }

    public final String getCo() {
        return this.co;
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

    public final String getMailAgent() {
        return this.mailAgent;
    }

    public final String getRAKey() {
        return this.rAKey;
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
        int iD = akb.d(akb.d(akb.d(akb.d(this.rAKey.hashCode() * 31, 31, this.sAKey), 31, this.uid), 31, this.h), 31, this.ecmi);
        String str = this.hl;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.co;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mailAgent;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.source;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.rAKey;
        String str2 = this.sAKey;
        String str3 = this.uid;
        String str4 = this.h;
        String str5 = this.ecmi;
        String str6 = this.hl;
        String str7 = this.co;
        String str8 = this.mailAgent;
        String str9 = this.source;
        StringBuilder sbF = u40.f("ContactedDeclineRequest(rAKey=", str, ", sAKey=", str2, ", uid=");
        ia.r(sbF, str3, ", h=", str4, ", ecmi=");
        ia.r(sbF, str5, ", hl=", str6, ", co=");
        ia.r(sbF, str7, ", mailAgent=", str8, ", source=");
        return l6.i(sbF, str9, ")");
    }

    public /* synthetic */ ContactedDeclineRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : str8, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : str9);
    }
}
