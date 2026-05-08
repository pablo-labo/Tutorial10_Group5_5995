package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class fe2 {
    public final hva<String> a;
    public final hva<je2> b;

    public fe2(hva.c cVar, int i) {
        hva.a aVar = hva.a.a;
        hva<je2> hvaVar = (i & 2) != 0 ? aVar : cVar;
        aVar.getClass();
        hvaVar.getClass();
        this.a = aVar;
        this.b = hvaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fe2)) {
            return false;
        }
        fe2 fe2Var = (fe2) obj;
        return wl7.b(this.a, fe2Var.a) && wl7.b(this.b, fe2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CompleteButtonParameterIndeedApplyInterviewMetaInput(applicationId=" + this.a + ", interview=" + this.b + ")";
    }

    public fe2() {
        this(null, 3);
    }
}
