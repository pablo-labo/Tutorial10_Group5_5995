package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes3.dex */
public final class wj7 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final gu5<j6g> h;
    public final gu5<j6g> i;
    public final gu5<j6g> j;
    public final gu5<j6g> k;
    public final String l;
    public final nl7 m;
    public final String n;
    public final String o;
    public final rte p;
    public final lk7 q;
    public final gu5<j6g> r;
    public final boolean s;
    public final String t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final gu5<j6g> x;

    public wj7(String str, String str2, String str3, String str4, gu5 gu5Var, gu5 gu5Var2, gu5 gu5Var3, gu5 gu5Var4, String str5, nl7 nl7Var, String str6, String str7, rte rteVar, lk7 lk7Var, gu5 gu5Var5, boolean z, String str8, boolean z2, boolean z3, boolean z4, gu5 gu5Var6, int i) {
        gu5 gu5Var7 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : gu5Var4;
        rte rteVar2 = (32768 & i) != 0 ? null : rteVar;
        boolean z5 = (262144 & i) != 0 ? false : z;
        String str9 = (524288 & i) != 0 ? null : str8;
        boolean z6 = (1048576 & i) != 0 ? false : z2;
        boolean z7 = (2097152 & i) != 0 ? false : z3;
        boolean z8 = (4194304 & i) == 0 ? z4 : false;
        gu5 gu5Var8 = (i & 8388608) == 0 ? gu5Var6 : null;
        str.getClass();
        str2.getClass();
        gu5Var.getClass();
        gu5Var2.getClass();
        gu5Var3.getClass();
        nl7Var.getClass();
        gu5Var5.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = gu5Var;
        this.i = gu5Var2;
        this.j = gu5Var3;
        this.k = gu5Var7;
        this.l = str5;
        this.m = nl7Var;
        this.n = str6;
        this.o = str7;
        this.p = rteVar2;
        this.q = lk7Var;
        this.r = gu5Var5;
        this.s = z5;
        this.t = str9;
        this.u = z6;
        this.v = z7;
        this.w = z8;
        this.x = gu5Var8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj7)) {
            return false;
        }
        wj7 wj7Var = (wj7) obj;
        return wl7.b(this.a, wj7Var.a) && wl7.b(this.b, wj7Var.b) && wl7.b(this.c, wj7Var.c) && wl7.b(this.d, wj7Var.d) && wl7.b(this.e, wj7Var.e) && wl7.b(this.f, wj7Var.f) && wl7.b(this.g, wj7Var.g) && wl7.b(this.h, wj7Var.h) && wl7.b(this.i, wj7Var.i) && wl7.b(this.j, wj7Var.j) && wl7.b(this.k, wj7Var.k) && wl7.b(this.l, wj7Var.l) && this.m == wj7Var.m && wl7.b(this.n, wj7Var.n) && wl7.b(this.o, wj7Var.o) && wl7.b(this.p, wj7Var.p) && this.q == wj7Var.q && wl7.b(this.r, wj7Var.r) && this.s == wj7Var.s && wl7.b(this.t, wj7Var.t) && this.u == wj7Var.u && this.v == wj7Var.v && this.w == wj7Var.w && wl7.b(this.x, wj7Var.x);
    }

    public final int hashCode() {
        int iD = w40.d(w40.d(w40.d(akb.d(akb.d(akb.d(akb.d(akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        gu5<j6g> gu5Var = this.k;
        int iHashCode = (this.m.hashCode() + akb.d((iD + (gu5Var == null ? 0 : gu5Var.hashCode())) * 31, 31, this.l)) * 31;
        String str = this.n;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.o;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        rte rteVar = this.p;
        int iF = ia.f(w40.d((this.q.hashCode() + ((iHashCode3 + (rteVar == null ? 0 : rteVar.hashCode())) * 31)) * 31, 31, this.r), 31, this.s);
        String str3 = this.t;
        int iF2 = ia.f(ia.f(ia.f((iF + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.u), 31, this.v), 31, this.w);
        gu5<j6g> gu5Var2 = this.x;
        return iF2 + (gu5Var2 != null ? gu5Var2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("InterviewJobsCardState(title=", this.a, ", company=", this.b, ", location=");
        ia.r(sbF, this.c, ", interviewDate=", this.d, ", joinInterviewLink=");
        ia.r(sbF, this.e, ", cancelInterviewLink=", this.f, ", rescheduleInterviewLink=");
        sbF.append(this.g);
        sbF.append(", onJoinInterviewClick=");
        sbF.append(this.h);
        sbF.append(", onRescheduleClick=");
        sbF.append(this.i);
        sbF.append(", onCancelClick=");
        sbF.append(this.j);
        sbF.append(", onInterviewPrepCTAClick=");
        sbF.append(this.k);
        sbF.append(", interviewTimeRange=");
        sbF.append(this.l);
        sbF.append(", interviewType=");
        sbF.append(this.m);
        sbF.append(", phoneNumber=");
        sbF.append(this.n);
        sbF.append(", address=");
        sbF.append(this.o);
        sbF.append(", statusLabel=");
        sbF.append(this.p);
        sbF.append(", interviewState=");
        sbF.append(this.q);
        sbF.append(", onCardClick=");
        sbF.append(this.r);
        sbF.append(", enableJoinBtn=");
        k6.k(", interviewStatus=", this.t, ", isResheduleLinkGenInprogress=", sbF, this.s);
        p6.j(sbF, this.u, ", isCancelLinkGenInProgress=", this.v, ", showInterviewPrepCTA=");
        sbF.append(this.w);
        sbF.append(", logInterviewPrepCTAImpression=");
        sbF.append(this.x);
        sbF.append(")");
        return sbF.toString();
    }
}
