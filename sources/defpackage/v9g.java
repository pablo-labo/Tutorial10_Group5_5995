package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class v9g {
    public final String a;
    public final hva<String> b;
    public final hva<String> c;
    public final hva<xeg> d;
    public final hva<xeg> e;
    public final hva<zeg> f;
    public final hva<zeg> g;
    public final hva<zeg> h;
    public final hva<xeg> i;
    public final hva<String> j;

    public v9g() {
        throw null;
    }

    public v9g(String str, hva hvaVar, hva hvaVar2, hva hvaVar3, hva hvaVar4) {
        hva.a aVar = hva.a.a;
        hvaVar.getClass();
        hvaVar2.getClass();
        hvaVar3.getClass();
        hvaVar4.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        this.a = str;
        this.b = hvaVar;
        this.c = hvaVar2;
        this.d = hvaVar3;
        this.e = hvaVar4;
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
        this.i = aVar;
        this.j = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9g)) {
            return false;
        }
        v9g v9gVar = (v9g) obj;
        return wl7.b(this.a, v9gVar.a) && wl7.b(this.b, v9gVar.b) && wl7.b(this.c, v9gVar.c) && wl7.b(this.d, v9gVar.d) && wl7.b(this.e, v9gVar.e) && wl7.b(this.f, v9gVar.f) && wl7.b(this.g, v9gVar.g) && wl7.b(this.h, v9gVar.h) && wl7.b(this.i, v9gVar.i) && wl7.b(this.j, v9gVar.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + b0.e(this.i, b0.e(this.h, b0.e(this.g, b0.e(this.f, b0.e(this.e, b0.e(this.d, b0.e(this.c, b0.e(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateJobSeekerProfileDegreeInput(id=");
        sb.append(this.a);
        sb.append(", degreeName=");
        sb.append(this.b);
        sb.append(", field=");
        w40.o(sb, this.c, ", taxonomyConceptDegree=", this.d, ", taxonomyConceptField=");
        w40.o(sb, this.e, ", board=", this.f, ", mediumOfEducation=");
        w40.o(sb, this.g, ", courseName=", this.h, ", courseType=");
        return uz.e(sb, this.i, ", courseScore=", this.j, ")");
    }
}
