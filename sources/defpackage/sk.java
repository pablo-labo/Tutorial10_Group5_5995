package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class sk {
    public final hva<kq> a;
    public final hva<kq> b;

    public sk(hva<kq> hvaVar, hva<kq> hvaVar2) {
        hvaVar.getClass();
        hvaVar2.getClass();
        this.a = hvaVar;
        this.b = hvaVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sk)) {
            return false;
        }
        sk skVar = (sk) obj;
        return wl7.b(this.a, skVar.a) && wl7.b(this.b, skVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AddJobSeekerProfileLanguageInput(taxonomyConceptLanguage=" + this.a + ", taxonomyConceptProficiency=" + this.b + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public sk() {
        hva.a aVar = hva.a.a;
        this(aVar, aVar);
    }
}
