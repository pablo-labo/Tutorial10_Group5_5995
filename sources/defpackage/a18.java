package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class a18 {
    public final hva<d18> a;
    public final hva<d18> b;
    public final hva<Boolean> c;

    public a18(hva<d18> hvaVar, hva<d18> hvaVar2, hva<Boolean> hvaVar3) {
        hvaVar.getClass();
        hvaVar2.getClass();
        hvaVar3.getClass();
        this.a = hvaVar;
        this.b = hvaVar2;
        this.c = hvaVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a18)) {
            return false;
        }
        a18 a18Var = (a18) obj;
        return wl7.b(this.a, a18Var.a) && wl7.b(this.b, a18Var.b) && wl7.b(this.c, a18Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b0.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return akb.l(v40.g("JobSeekerProfileDateRangeInput(fromDate=", this.a, ", toDate=", this.b, ", isCurrent="), this.c, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a18() {
        hva.a aVar = hva.a.a;
        this(aVar, aVar, aVar);
    }
}
