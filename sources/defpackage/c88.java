package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class c88 {
    public final boolean A;
    public final ggg B;
    public final boolean C;
    public final yj7 D;
    public final gu5<j6g> E;
    public final boolean F;
    public final String G;
    public final gu5<j6g> H;
    public final gu5<j6g> I;
    public final boolean J;
    public final boolean K;
    public final String L;
    public final String M;
    public final String N;
    public final boolean O;
    public final String P;
    public final gu5<j6g> Q;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final ox7 f;
    public final boolean g;
    public final boolean h;
    public final gu5<j6g> i;
    public final gu5<j6g> j;
    public final gu5<j6g> k;
    public final gu5<j6g> l;
    public final gu5<j6g> m;
    public final Function1<String, j6g> n;
    public final String o;
    public final Integer p;
    public final String q;
    public final boolean r;
    public final boolean s;
    public final gu5<j6g> t;
    public final gu5<j6g> u;
    public final boolean v;
    public final String w;
    public final boolean x;
    public final gu5<j6g> y;
    public final gu5<j6g> z;

    public c88(String str, String str2, String str3, String str4, String str5, ox7 ox7Var, boolean z, boolean z2, gu5 gu5Var, gu5 gu5Var2, gu5 gu5Var3, gu5 gu5Var4, gu5 gu5Var5, Function1 function1, String str6, Integer num, String str7, boolean z3, boolean z4, gu5 gu5Var6, gu5 gu5Var7, boolean z5, String str8, boolean z6, gu5 gu5Var8, gu5 gu5Var9, boolean z7, ggg gggVar, boolean z8, yj7 yj7Var, gu5 gu5Var10, boolean z9, String str9, gu5 gu5Var11, gu5 gu5Var12, boolean z10, boolean z11, String str10, String str11, String str12, boolean z12, String str13, gu5 gu5Var13, int i, int i2) {
        gu5 gu5Var14;
        gu5 gu5Var15;
        String str14;
        yj7 yj7Var2;
        gu5 gu5Var16;
        gu5 ag3Var;
        String str15;
        gu5 j7Var;
        boolean z13 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? false : z2;
        int i3 = 9;
        gu5 k7Var = (i & 2048) != 0 ? new k7(9) : gu5Var4;
        gu5 l7Var = (i & 4096) != 0 ? new l7(12) : gu5Var5;
        Integer num2 = (32768 & i) != 0 ? null : num;
        String str16 = (65536 & i) != 0 ? null : str7;
        boolean z14 = (131072 & i) != 0 ? false : z3;
        boolean z15 = (262144 & i) != 0 ? false : z4;
        gu5 n7Var = (524288 & i) != 0 ? new n7(5) : gu5Var6;
        gu5 o7Var = (1048576 & i) != 0 ? new o7(i3) : gu5Var7;
        boolean z16 = (2097152 & i) != 0 ? false : z5;
        String str17 = (i & 4194304) != 0 ? null : str8;
        boolean z17 = (i & 8388608) != 0 ? false : z6;
        gu5 zwVar = (i & 16777216) != 0 ? new zw(14) : gu5Var8;
        gu5 lzVar = (33554432 & i) != 0 ? new lz(12) : gu5Var9;
        boolean z18 = (i & 67108864) != 0 ? false : z7;
        ggg gggVar2 = (i & 134217728) != 0 ? new ggg(false, 0, 0, null, 1022) : gggVar;
        boolean z19 = (i & 268435456) != 0 ? false : z8;
        boolean z20 = z18;
        if ((i & 536870912) != 0) {
            gu5Var15 = lzVar;
            gu5Var14 = zwVar;
            str14 = str17;
            yj7Var2 = new yj7(false, "", new vg(16));
        } else {
            gu5Var14 = zwVar;
            gu5Var15 = lzVar;
            str14 = str17;
            yj7Var2 = yj7Var;
        }
        gu5 mzVar = (i & 1073741824) != 0 ? new mz(11) : gu5Var10;
        boolean z21 = (i & Integer.MIN_VALUE) != 0 ? false : z9;
        String str18 = (i2 & 1) != 0 ? "" : str9;
        gu5 cp0Var = (i2 & 2) != 0 ? new cp0(11) : gu5Var11;
        if ((i2 & 4) != 0) {
            gu5Var16 = cp0Var;
            ag3Var = new ag3(7);
        } else {
            gu5Var16 = cp0Var;
            ag3Var = gu5Var12;
        }
        boolean z22 = (i2 & 8) != 0 ? false : z10;
        boolean z23 = (i2 & 16) != 0 ? false : z11;
        String str19 = (i2 & 32) != 0 ? "" : str10;
        String str20 = (i2 & 64) != 0 ? null : str11;
        boolean z24 = z22;
        String str21 = (i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : str12;
        boolean z25 = (i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? false : z12;
        String str22 = (i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? "" : str13;
        if ((i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
            str15 = str22;
            j7Var = new j7(8);
        } else {
            str15 = str22;
            j7Var = gu5Var13;
        }
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        gu5Var.getClass();
        gu5Var2.getClass();
        gu5Var3.getClass();
        k7Var.getClass();
        l7Var.getClass();
        function1.getClass();
        str6.getClass();
        n7Var.getClass();
        o7Var.getClass();
        gu5Var14.getClass();
        gu5Var15.getClass();
        mzVar.getClass();
        str18.getClass();
        gu5Var16.getClass();
        ag3Var.getClass();
        str19.getClass();
        j7Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = ox7Var;
        this.g = z;
        this.h = z13;
        this.i = gu5Var;
        this.j = gu5Var2;
        this.k = gu5Var3;
        this.l = k7Var;
        this.m = l7Var;
        this.n = function1;
        this.o = str6;
        this.p = num2;
        this.q = str16;
        this.r = z14;
        this.s = z15;
        this.t = n7Var;
        this.u = o7Var;
        this.v = z16;
        this.w = str14;
        this.x = z17;
        this.y = gu5Var14;
        this.z = gu5Var15;
        this.A = z20;
        this.B = gggVar2;
        this.C = z19;
        this.D = yj7Var2;
        this.E = mzVar;
        this.F = z21;
        this.G = str18;
        this.H = gu5Var16;
        this.I = ag3Var;
        this.J = z24;
        this.K = z23;
        this.L = str19;
        this.M = str20;
        this.N = str21;
        this.O = z25;
        this.P = str15;
        this.Q = j7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c88)) {
            return false;
        }
        c88 c88Var = (c88) obj;
        return wl7.b(this.a, c88Var.a) && wl7.b(this.b, c88Var.b) && wl7.b(this.c, c88Var.c) && wl7.b(this.d, c88Var.d) && wl7.b(this.e, c88Var.e) && this.f == c88Var.f && this.g == c88Var.g && this.h == c88Var.h && wl7.b(this.i, c88Var.i) && wl7.b(this.j, c88Var.j) && wl7.b(this.k, c88Var.k) && wl7.b(this.l, c88Var.l) && wl7.b(this.m, c88Var.m) && wl7.b(this.n, c88Var.n) && wl7.b(this.o, c88Var.o) && wl7.b(this.p, c88Var.p) && wl7.b(this.q, c88Var.q) && this.r == c88Var.r && this.s == c88Var.s && wl7.b(this.t, c88Var.t) && wl7.b(this.u, c88Var.u) && this.v == c88Var.v && wl7.b(this.w, c88Var.w) && this.x == c88Var.x && wl7.b(this.y, c88Var.y) && wl7.b(this.z, c88Var.z) && this.A == c88Var.A && wl7.b(this.B, c88Var.B) && this.C == c88Var.C && wl7.b(this.D, c88Var.D) && wl7.b(this.E, c88Var.E) && this.F == c88Var.F && wl7.b(this.G, c88Var.G) && wl7.b(this.H, c88Var.H) && wl7.b(this.I, c88Var.I) && this.J == c88Var.J && this.K == c88Var.K && wl7.b(this.L, c88Var.L) && wl7.b(this.M, c88Var.M) && wl7.b(this.N, c88Var.N) && this.O == c88Var.O && wl7.b(this.P, c88Var.P) && wl7.b(this.Q, c88Var.Q);
    }

    public final int hashCode() {
        int iD = akb.d((this.n.hashCode() + w40.d(w40.d(w40.d(w40.d(w40.d(ia.f(ia.f((this.f.hashCode() + akb.d(akb.d(akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m)) * 31, 31, this.o);
        Integer num = this.p;
        int iHashCode = (iD + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.q;
        int iF = ia.f(w40.d(w40.d(ia.f(ia.f((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v);
        String str2 = this.w;
        int iD2 = akb.d(ia.f(ia.f(w40.d(w40.d(akb.d(ia.f(w40.d((this.D.hashCode() + ia.f((this.B.hashCode() + ia.f(w40.d(w40.d(ia.f((iF + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.x), 31, this.y), 31, this.z), 31, this.A)) * 31, 31, this.C)) * 31, 31, this.E), 31, this.F), 31, this.G), 31, this.H), 31, this.I), 31, this.J), 31, this.K), 31, this.L);
        String str3 = this.M;
        int iHashCode2 = (iD2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.N;
        return this.Q.hashCode() + akb.d(ia.f((iHashCode2 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.O), 31, this.P);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("JobsCardState(jobKey=", this.a, ", title=", this.b, ", company=");
        ia.r(sbF, this.c, ", location=", this.d, ", savedOn=");
        sbF.append(this.e);
        sbF.append(", jobsCardState=");
        sbF.append(this.f);
        sbF.append(", isJobExpiredOrClosed=");
        p6.j(sbF, this.g, ", isJobWithDrawn=", this.h, ", onApplyClick=");
        sbF.append(this.i);
        sbF.append(", onCardClick=");
        sbF.append(this.j);
        sbF.append(", onMoreInfoClick=");
        sbF.append(this.k);
        sbF.append(", onUpdateStatusClick=");
        sbF.append(this.l);
        sbF.append(", onContinueApplicationClick=");
        sbF.append(this.m);
        sbF.append(", onUnsaveClick=");
        sbF.append(this.n);
        sbF.append(", currentJobApplicationStatus=");
        sbF.append(this.o);
        sbF.append(", employerResponseTime=");
        sbF.append(this.p);
        sbF.append(", applicationRange=");
        akb.q(this.q, ", isApplyUpdateStatusInProgress=", ", isJobUnsave=", sbF, this.r);
        sbF.append(this.s);
        sbF.append(", onClose=");
        sbF.append(this.t);
        sbF.append(", undoJobClick=");
        sbF.append(this.u);
        sbF.append(", hasApplicationDraft=");
        sbF.append(this.v);
        sbF.append(", event5722DTOErrorMessage=");
        akb.q(this.w, ", isJobMayBeApplied=", ", onActionTextClick=", sbF, this.x);
        sbF.append(this.y);
        sbF.append(", onPromptClose=");
        sbF.append(this.z);
        sbF.append(", shoudShowCloseBubble=");
        sbF.append(this.A);
        sbF.append(", shouldShowUpdateStatusSuggestionBubble=");
        sbF.append(this.B);
        sbF.append(", showHiredBadge=");
        sbF.append(this.C);
        sbF.append(", interviewNowData=");
        sbF.append(this.D);
        sbF.append(", onHiredBadgeClick=");
        sbF.append(this.E);
        sbF.append(", employerStartedReview=");
        sbF.append(this.F);
        sbF.append(", employerReplyLikelihood=");
        sbF.append(this.G);
        sbF.append(", onEmployerReplyLikelihoodClick=");
        sbF.append(this.H);
        sbF.append(", onJobCardVisibleOnScreen=");
        sbF.append(this.I);
        sbF.append(", shouldShowRedDot=");
        sbF.append(this.J);
        sbF.append(", shouldShowGhostedAppStatusPhase3=");
        k6.k(", replyLikelihoodAdjusted=", this.L, ", isEmployerOftenReviewedEnabled=", sbF, this.K);
        ia.r(sbF, this.M, ", percentageOfEmpViewed=", this.N, ", isNexusWorkflow=");
        k6.k(", nexusTimeRemainingText=", this.P, ", onCompleteAiRecruiterClick=", sbF, this.O);
        sbF.append(this.Q);
        sbF.append(")");
        return sbF.toString();
    }
}
