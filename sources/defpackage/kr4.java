package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kr4 {
    public final String a;
    public final c8f b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final gu5<j6g> o;
    public final gu5<j6g> p;
    public final gu5<j6g> q;
    public final gu5<j6g> r;
    public final gu5<j6g> s;
    public final boolean t;

    public kr4(String str, c8f c8fVar, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2, boolean z3, boolean z4, gu5 gu5Var, gu5 gu5Var2, gu5 gu5Var3, gu5 gu5Var4, gu5 gu5Var5, boolean z5) {
        str.getClass();
        str2.getClass();
        str6.getClass();
        gu5Var.getClass();
        gu5Var2.getClass();
        gu5Var3.getClass();
        gu5Var4.getClass();
        gu5Var5.getClass();
        this.a = str;
        this.b = c8fVar;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.n = z4;
        this.o = gu5Var;
        this.p = gu5Var2;
        this.q = gu5Var3;
        this.r = gu5Var4;
        this.s = gu5Var5;
        this.t = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kr4)) {
            return false;
        }
        kr4 kr4Var = (kr4) obj;
        return wl7.b(this.a, kr4Var.a) && this.b == kr4Var.b && wl7.b(this.c, kr4Var.c) && wl7.b(this.d, kr4Var.d) && wl7.b(this.e, kr4Var.e) && wl7.b(this.f, kr4Var.f) && wl7.b(this.g, kr4Var.g) && wl7.b(this.h, kr4Var.h) && wl7.b(this.i, kr4Var.i) && wl7.b(this.j, kr4Var.j) && this.k == kr4Var.k && this.l == kr4Var.l && this.m == kr4Var.m && this.n == kr4Var.n && wl7.b(this.o, kr4Var.o) && wl7.b(this.p, kr4Var.p) && wl7.b(this.q, kr4Var.q) && wl7.b(this.r, kr4Var.r) && wl7.b(this.s, kr4Var.s) && this.t == kr4Var.t;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.t) + w40.d(w40.d(w40.d(w40.d(w40.d(ia.f(ia.f(ia.f(ia.f(ia.f(akb.d(akb.d(akb.d(akb.d(akb.d(akb.d(akb.d(akb.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, false), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmployerInvitedJobCardState(statusLabel=");
        sb.append(this.a);
        sb.append(", statusTagVariant=");
        sb.append(this.b);
        sb.append(", invitedTimeAgo=");
        ia.r(sb, this.c, ", jobTitle=", this.d, ", companyName=");
        ia.r(sb, this.e, ", location=", this.f, ", jobType=");
        ia.r(sb, this.g, ", salaryRange=", this.h, ", employerName=");
        ia.r(sb, this.i, ", employerMessage=", this.j, ", isContactInfoShared=false, showAcceptDeclineButtons=");
        p6.j(sb, this.k, ", showMessageButton=", this.l, ", isAcceptLoading=");
        p6.j(sb, this.m, ", isDeclineLoading=", this.n, ", onMessageEmployerClick=");
        sb.append(this.o);
        sb.append(", onDeclineClick=");
        sb.append(this.p);
        sb.append(", onAcceptClick=");
        sb.append(this.q);
        sb.append(", onCardClick=");
        sb.append(this.r);
        sb.append(", onInvitationCardVisibleOnScreen=");
        sb.append(this.s);
        sb.append(", shouldShowRedDot=");
        sb.append(this.t);
        sb.append(")");
        return sb.toString();
    }
}
