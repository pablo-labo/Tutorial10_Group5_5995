package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class l9g {
    public final String a;
    public final hva<a18> b;
    public final hva<String> c;
    public final hva<xeg> d;
    public final hva<String> e;

    public l9g() {
        throw null;
    }

    public l9g(hva hvaVar, hva hvaVar2, hva hvaVar3, String str) {
        hva.a aVar = hva.a.a;
        hvaVar.getClass();
        hvaVar2.getClass();
        aVar.getClass();
        hvaVar3.getClass();
        this.a = str;
        this.b = hvaVar;
        this.c = hvaVar2;
        this.d = aVar;
        this.e = hvaVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9g)) {
            return false;
        }
        l9g l9gVar = (l9g) obj;
        return wl7.b(this.a, l9gVar.a) && wl7.b(this.b, l9gVar.b) && wl7.b(this.c, l9gVar.c) && wl7.b(this.d, l9gVar.d) && wl7.b(this.e, l9gVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + b0.e(this.d, b0.e(this.c, b0.e(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateJobSeekerProfileCertificationInput(id=");
        sb.append(this.a);
        sb.append(", dateRange=");
        sb.append(this.b);
        sb.append(", description=");
        w40.o(sb, this.c, ", taxonomyConceptTitle=", this.d, ", title=");
        return akb.l(sb, this.e, ")");
    }
}
