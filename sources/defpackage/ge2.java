package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes2.dex */
public final class ge2 {
    public final hva<String> a;
    public final hva<ke2> b;

    public ge2(hva.c cVar, int i) {
        hva.a aVar = hva.a.a;
        hva<ke2> hvaVar = (i & 2) != 0 ? aVar : cVar;
        aVar.getClass();
        hvaVar.getClass();
        this.a = aVar;
        this.b = hvaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge2)) {
            return false;
        }
        ge2 ge2Var = (ge2) obj;
        return wl7.b(this.a, ge2Var.a) && wl7.b(this.b, ge2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CompleteButtonParameterIndeedApplyInterviewMetaInput(applicationId=" + this.a + ", interview=" + this.b + ")";
    }

    public ge2() {
        this(null, 3);
    }
}
