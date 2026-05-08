package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kq {
    public final String a;
    public final hva<iq> b;

    public kq(String str, hva<iq> hvaVar) {
        str.getClass();
        hvaVar.getClass();
        this.a = str;
        this.b = hvaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kq)) {
            return false;
        }
        kq kqVar = (kq) obj;
        return wl7.b(this.a, kqVar.a) && wl7.b(this.b, kqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AddJobSeekerProfileTaxonomyConceptNameInput(name=" + this.a + ", taxonomyConceptName=" + this.b + ")";
    }
}
