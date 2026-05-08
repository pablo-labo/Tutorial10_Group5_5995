package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class t9g {
    public final hva<String> a;
    public final hva<xeg> b;

    public t9g() {
        hva.a aVar = hva.a.a;
        aVar.getClass();
        aVar.getClass();
        this.a = aVar;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9g)) {
            return false;
        }
        t9g t9gVar = (t9g) obj;
        return wl7.b(this.a, t9gVar.a) && wl7.b(this.b, t9gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdateJobSeekerProfileCompanySectorInput(name=" + this.a + ", taxonomyConceptName=" + this.b + ")";
    }
}
