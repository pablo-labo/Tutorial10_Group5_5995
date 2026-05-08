package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class y58 {
    public final hva<Boolean> a;
    public final hva<c58> b;
    public final hva<Double> c;

    public y58(hva.c cVar, hva.c cVar2, int i) {
        hva<Boolean> hvaVar = (i & 1) != 0 ? hva.a.a : cVar;
        hva<c58> hvaVar2 = (i & 2) != 0 ? hva.a.a : cVar2;
        hva.a aVar = hva.a.a;
        hvaVar.getClass();
        hvaVar2.getClass();
        aVar.getClass();
        this.a = hvaVar;
        this.b = hvaVar2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y58)) {
            return false;
        }
        y58 y58Var = (y58) obj;
        return wl7.b(this.a, y58Var.a) && wl7.b(this.b, y58Var.b) && wl7.b(this.c, y58Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b0.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return akb.l(v40.g("JobSeekerProfileStructuredDataRelocationInput(ableToRelocate=", this.a, ", source=", this.b, ", collectionTime="), this.c, ")");
    }

    public y58() {
        this(null, null, 7);
    }
}
