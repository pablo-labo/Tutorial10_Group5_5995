package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class hk {
    public final String a;
    public final hva<String> b;
    public final hva<iq> c;
    public final hva<iq> d;
    public final hva<kq> e;
    public final hva<kq> f;
    public final hva<kq> g;
    public final hva<iq> h;
    public final hva<String> i;

    public hk() {
        throw null;
    }

    public hk(hva hvaVar, hva hvaVar2, hva hvaVar3, String str) {
        hva.a aVar = hva.a.a;
        str.getClass();
        hvaVar.getClass();
        hvaVar2.getClass();
        hvaVar3.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        this.a = str;
        this.b = hvaVar;
        this.c = hvaVar2;
        this.d = hvaVar3;
        this.e = aVar;
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
        this.i = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk)) {
            return false;
        }
        hk hkVar = (hk) obj;
        return wl7.b(this.a, hkVar.a) && wl7.b(this.b, hkVar.b) && wl7.b(this.c, hkVar.c) && wl7.b(this.d, hkVar.d) && wl7.b(this.e, hkVar.e) && wl7.b(this.f, hkVar.f) && wl7.b(this.g, hkVar.g) && wl7.b(this.h, hkVar.h) && wl7.b(this.i, hkVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + b0.e(this.h, b0.e(this.g, b0.e(this.f, b0.e(this.e, b0.e(this.d, b0.e(this.c, b0.e(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddJobSeekerProfileDegreeInput(degreeName=");
        sb.append(this.a);
        sb.append(", field=");
        sb.append(this.b);
        sb.append(", taxonomyConceptDegree=");
        w40.o(sb, this.c, ", taxonomyConceptField=", this.d, ", board=");
        w40.o(sb, this.e, ", mediumOfEducation=", this.f, ", courseName=");
        w40.o(sb, this.g, ", courseType=", this.h, ", courseScore=");
        return akb.l(sb, this.i, ")");
    }
}
