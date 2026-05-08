package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class d18 {
    public final hva<s38> a;
    public final hva<Integer> b;

    /* JADX WARN: Multi-variable type inference failed */
    public d18(hva<? extends s38> hvaVar, hva<Integer> hvaVar2) {
        hvaVar.getClass();
        hvaVar2.getClass();
        this.a = hvaVar;
        this.b = hvaVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d18)) {
            return false;
        }
        d18 d18Var = (d18) obj;
        return wl7.b(this.a, d18Var.a) && wl7.b(this.b, d18Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "JobSeekerProfileDateTypeInput(month=" + this.a + ", year=" + this.b + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d18() {
        hva.a aVar = hva.a.a;
        this(aVar, aVar);
    }
}
