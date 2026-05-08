package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mq {
    public final String a;
    public final hva<String> b;
    public final hva<String> c;
    public final hva<String> d;
    public final hva<Object> e;
    public final hva<fk> f;
    public final hva<p38> g;
    public final hva<a18> h;
    public final hva<List<t68>> i;
    public final hva<List<w38>> j;
    public final hva<List<v38>> k;
    public final hva<iq> l;
    public final hva<iq> m;

    public mq() {
        throw null;
    }

    public mq(hva hvaVar, hva hvaVar2, hva hvaVar3, hva hvaVar4, hva hvaVar5, String str) {
        hva.a aVar = hva.a.a;
        str.getClass();
        hvaVar.getClass();
        aVar.getClass();
        hvaVar2.getClass();
        hvaVar3.getClass();
        aVar.getClass();
        hvaVar4.getClass();
        hvaVar5.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        this.a = str;
        this.b = hvaVar;
        this.c = aVar;
        this.d = hvaVar2;
        this.e = hvaVar3;
        this.f = aVar;
        this.g = hvaVar4;
        this.h = hvaVar5;
        this.i = aVar;
        this.j = aVar;
        this.k = aVar;
        this.l = aVar;
        this.m = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mq)) {
            return false;
        }
        mq mqVar = (mq) obj;
        return wl7.b(this.a, mqVar.a) && wl7.b(this.b, mqVar.b) && wl7.b(this.c, mqVar.c) && wl7.b(this.d, mqVar.d) && wl7.b(this.e, mqVar.e) && wl7.b(this.f, mqVar.f) && wl7.b(this.g, mqVar.g) && wl7.b(this.h, mqVar.h) && wl7.b(this.i, mqVar.i) && wl7.b(this.j, mqVar.j) && wl7.b(this.k, mqVar.k) && wl7.b(this.l, mqVar.l) && wl7.b(this.m, mqVar.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + b0.e(this.l, b0.e(this.k, b0.e(this.j, b0.e(this.i, b0.e(this.h, b0.e(this.g, b0.e(this.f, b0.e(this.e, b0.e(this.d, b0.e(this.c, b0.e(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddJobSeekerProfileWorkExperienceInput(title=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", commonSkills=");
        w40.o(sb, this.c, ", company=", this.d, ", companyFccid=");
        w40.o(sb, this.e, ", companySector=", this.f, ", location=");
        w40.o(sb, this.g, ", dateRange=", this.h, ", customFields=");
        w40.o(sb, this.i, ", occupations=", this.j, ", attributes=");
        w40.o(sb, this.k, ", jobType=", this.l, ", noticePeriod=");
        return akb.l(sb, this.m, ")");
    }
}
