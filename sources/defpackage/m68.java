package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class m68 {
    public final hva<Integer> a;
    public final hva<c58> b;
    public final hva<Double> c;

    public m68() {
        hva.a aVar = hva.a.a;
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        this.a = aVar;
        this.b = aVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m68)) {
            return false;
        }
        m68 m68Var = (m68) obj;
        return wl7.b(this.a, m68Var.a) && wl7.b(this.b, m68Var.b) && wl7.b(this.c, m68Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b0.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return akb.l(v40.g("JobSeekerProfileStructuredDataWillingnessToTravelInput(willingnessToTravel=", this.a, ", source=", this.b, ", collectionTime="), this.c, ")");
    }
}
