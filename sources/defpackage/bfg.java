package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bfg {
    public final String a;
    public final hva<String> b;
    public final hva<String> c;
    public final hva<String> d;
    public final hva<String> e;
    public final hva<Object> f;
    public final hva<t9g> g;
    public final hva<p38> h;
    public final hva<a18> i;
    public final hva<List<t68>> j;
    public final hva<List<w38>> k;
    public final hva<List<v38>> l;
    public final hva<xeg> m;
    public final hva<xeg> n;

    public bfg() {
        throw null;
    }

    public bfg(String str, hva hvaVar, hva hvaVar2, hva hvaVar3, hva hvaVar4, hva.c cVar, hva hvaVar5) {
        hva.a aVar = hva.a.a;
        str.getClass();
        hvaVar.getClass();
        hvaVar2.getClass();
        aVar.getClass();
        hvaVar3.getClass();
        hvaVar4.getClass();
        aVar.getClass();
        hvaVar5.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        this.a = str;
        this.b = hvaVar;
        this.c = hvaVar2;
        this.d = aVar;
        this.e = hvaVar3;
        this.f = hvaVar4;
        this.g = aVar;
        this.h = cVar;
        this.i = hvaVar5;
        this.j = aVar;
        this.k = aVar;
        this.l = aVar;
        this.m = aVar;
        this.n = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfg)) {
            return false;
        }
        bfg bfgVar = (bfg) obj;
        return wl7.b(this.a, bfgVar.a) && wl7.b(this.b, bfgVar.b) && wl7.b(this.c, bfgVar.c) && wl7.b(this.d, bfgVar.d) && wl7.b(this.e, bfgVar.e) && wl7.b(this.f, bfgVar.f) && wl7.b(this.g, bfgVar.g) && wl7.b(this.h, bfgVar.h) && wl7.b(this.i, bfgVar.i) && wl7.b(this.j, bfgVar.j) && wl7.b(this.k, bfgVar.k) && wl7.b(this.l, bfgVar.l) && wl7.b(this.m, bfgVar.m) && wl7.b(this.n, bfgVar.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + b0.e(this.m, b0.e(this.l, b0.e(this.k, b0.e(this.j, b0.e(this.i, b0.e(this.h, b0.e(this.g, b0.e(this.f, b0.e(this.e, b0.e(this.d, b0.e(this.c, b0.e(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateJobSeekerProfileWorkExperienceInput(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", description=");
        w40.o(sb, this.c, ", commonSkills=", this.d, ", company=");
        w40.o(sb, this.e, ", companyFccid=", this.f, ", companySector=");
        w40.o(sb, this.g, ", location=", this.h, ", dateRange=");
        w40.o(sb, this.i, ", customFields=", this.j, ", occupations=");
        w40.o(sb, this.k, ", attributes=", this.l, ", jobType=");
        return uz.e(sb, this.m, ", noticePeriod=", this.n, ")");
    }
}
