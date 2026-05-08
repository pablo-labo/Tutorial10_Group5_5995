package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes2.dex */
public final class g43 {
    public final ne2 a;
    public final hva<String> b;
    public final hva<Boolean> c;
    public final String d;
    public final hva<String> e;
    public final hva<String> f;
    public final hva<mf2> g;
    public final hva<if2> h;
    public final hva<ue2> i;
    public final hva<String> j;
    public final hva<String> k;
    public final hva<String> l;
    public final hva<String> m;
    public final hva<String> n;
    public final hva<ye2> o;
    public final hva<ge2> p;
    public final hva<String> q;
    public final hva<String> r;
    public final String s;

    public g43() {
        throw null;
    }

    public g43(String str, hva.c cVar, hva.c cVar2, hva.c cVar3, String str2) {
        ne2 ne2Var = ne2.INDEED;
        hva.a aVar = hva.a.a;
        aVar.getClass();
        aVar.getClass();
        str.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        str2.getClass();
        this.a = ne2Var;
        this.b = aVar;
        this.c = aVar;
        this.d = str;
        this.e = cVar;
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
        this.i = cVar2;
        this.j = aVar;
        this.k = aVar;
        this.l = aVar;
        this.m = aVar;
        this.n = aVar;
        this.o = aVar;
        this.p = cVar3;
        this.q = aVar;
        this.r = aVar;
        this.s = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g43)) {
            return false;
        }
        g43 g43Var = (g43) obj;
        return this.a == g43Var.a && wl7.b(this.b, g43Var.b) && wl7.b(this.c, g43Var.c) && wl7.b(this.d, g43Var.d) && wl7.b(this.e, g43Var.e) && wl7.b(this.f, g43Var.f) && wl7.b(this.g, g43Var.g) && wl7.b(this.h, g43Var.h) && wl7.b(this.i, g43Var.i) && wl7.b(this.j, g43Var.j) && wl7.b(this.k, g43Var.k) && wl7.b(this.l, g43Var.l) && wl7.b(this.m, g43Var.m) && wl7.b(this.n, g43Var.n) && wl7.b(this.o, g43Var.o) && wl7.b(this.p, g43Var.p) && wl7.b(this.q, g43Var.q) && wl7.b(this.r, g43Var.r) && wl7.b(this.s, g43Var.s);
    }

    public final int hashCode() {
        return this.s.hashCode() + b0.e(this.r, b0.e(this.q, b0.e(this.p, b0.e(this.o, b0.e(this.n, b0.e(this.m, b0.e(this.l, b0.e(this.k, b0.e(this.j, b0.e(this.i, b0.e(this.h, b0.e(this.g, b0.e(this.f, b0.e(this.e, akb.d(b0.e(this.c, b0.e(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreateApplyUrlFullParamsInput(applyDomain=");
        sb.append(this.a);
        sb.append(", source=");
        sb.append(this.b);
        sb.append(", isSponsored=");
        sb.append(this.c);
        sb.append(", jobTitle=");
        sb.append(this.d);
        sb.append(", jobCompanyName=");
        w40.o(sb, this.e, ", advertiserNumber=", this.f, ", smartApplyIntegration=");
        w40.o(sb, this.g, ", standardFields=", this.h, ", jobIntegration=");
        w40.o(sb, this.i, ", jobKey=", this.j, ", jobId=");
        w40.o(sb, this.k, ", jobCountry=", this.l, ", jobLocation=");
        w40.o(sb, this.m, ", jobUri=", this.n, ", screenerQuestions=");
        w40.o(sb, this.o, ", indeedApplyInterviewMeta=", this.p, ", from=");
        w40.o(sb, this.q, ", href=", this.r, ", apiToken=");
        return l6.i(sb, this.s, ")");
    }
}
