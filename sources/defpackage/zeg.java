package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class zeg {
    public final hva<String> a;
    public final hva<xeg> b;

    public zeg(hva<String> hvaVar, hva<xeg> hvaVar2) {
        hvaVar.getClass();
        hvaVar2.getClass();
        this.a = hvaVar;
        this.b = hvaVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zeg)) {
            return false;
        }
        zeg zegVar = (zeg) obj;
        return wl7.b(this.a, zegVar.a) && wl7.b(this.b, zegVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdateJobSeekerProfileTaxonomyConceptNameInput(name=" + this.a + ", taxonomyConceptName=" + this.b + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zeg() {
        hva.a aVar = hva.a.a;
        this(aVar, aVar);
    }
}
