package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class f43 {
    public final oe2 a;
    public final hva<String> b;
    public final hva<Boolean> c;
    public final String d;
    public final hva<String> e;
    public final hva<String> f;
    public final hva<lf2> g;
    public final hva<hf2> h;
    public final hva<te2> i;
    public final hva<String> j;
    public final hva<String> k;
    public final hva<String> l;
    public final hva<String> m;
    public final hva<Object> n;
    public final hva<xe2> o;
    public final hva<fe2> p;
    public final hva<String> q;
    public final hva<Object> r;
    public final String s;

    public f43() {
        throw null;
    }

    public f43(oe2 oe2Var, hva hvaVar, hva hvaVar2, String str, hva hvaVar3, hva hvaVar4, hva hvaVar5, hva hvaVar6, hva hvaVar7, hva hvaVar8, hva hvaVar9, hva hvaVar10, hva hvaVar11, hva hvaVar12, hva hvaVar13, hva hvaVar14, hva hvaVar15, String str2) {
        hva.a aVar = hva.a.a;
        oe2Var.getClass();
        hvaVar.getClass();
        hvaVar2.getClass();
        str.getClass();
        hvaVar3.getClass();
        hvaVar4.getClass();
        hvaVar5.getClass();
        hvaVar6.getClass();
        hvaVar7.getClass();
        hvaVar8.getClass();
        hvaVar9.getClass();
        aVar.getClass();
        hvaVar10.getClass();
        hvaVar11.getClass();
        hvaVar12.getClass();
        hvaVar13.getClass();
        hvaVar14.getClass();
        hvaVar15.getClass();
        str2.getClass();
        this.a = oe2Var;
        this.b = hvaVar;
        this.c = hvaVar2;
        this.d = str;
        this.e = hvaVar3;
        this.f = hvaVar4;
        this.g = hvaVar5;
        this.h = hvaVar6;
        this.i = hvaVar7;
        this.j = hvaVar8;
        this.k = hvaVar9;
        this.l = aVar;
        this.m = hvaVar10;
        this.n = hvaVar11;
        this.o = hvaVar12;
        this.p = hvaVar13;
        this.q = hvaVar14;
        this.r = hvaVar15;
        this.s = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f43)) {
            return false;
        }
        f43 f43Var = (f43) obj;
        return this.a == f43Var.a && wl7.b(this.b, f43Var.b) && wl7.b(this.c, f43Var.c) && wl7.b(this.d, f43Var.d) && wl7.b(this.e, f43Var.e) && wl7.b(this.f, f43Var.f) && wl7.b(this.g, f43Var.g) && wl7.b(this.h, f43Var.h) && wl7.b(this.i, f43Var.i) && wl7.b(this.j, f43Var.j) && wl7.b(this.k, f43Var.k) && wl7.b(this.l, f43Var.l) && wl7.b(this.m, f43Var.m) && wl7.b(this.n, f43Var.n) && wl7.b(this.o, f43Var.o) && wl7.b(this.p, f43Var.p) && wl7.b(this.q, f43Var.q) && wl7.b(this.r, f43Var.r) && wl7.b(this.s, f43Var.s);
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
