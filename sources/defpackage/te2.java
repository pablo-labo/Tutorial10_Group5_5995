package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class te2 {
    public final hva<String> a;
    public final hva<Object> b;
    public final hva<Object> c;

    public te2(hva.c cVar, int i) {
        hva.a aVar = hva.a.a;
        hva<Object> hvaVar = (i & 4) != 0 ? aVar : cVar;
        aVar.getClass();
        aVar.getClass();
        hvaVar.getClass();
        this.a = aVar;
        this.b = aVar;
        this.c = hvaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te2)) {
            return false;
        }
        te2 te2Var = (te2) obj;
        return wl7.b(this.a, te2Var.a) && wl7.b(this.b, te2Var.b) && wl7.b(this.c, te2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b0.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return akb.l(v40.g("CompleteButtonParametersJobIntegrationInput(jobMeta=", this.a, ", postCallUrl=", this.b, ", emailAddress="), this.c, ")");
    }

    public te2() {
        this(null, 7);
    }
}
