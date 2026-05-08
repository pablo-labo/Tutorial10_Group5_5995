package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes2.dex */
public final class ue2 {
    public final hva<String> a;
    public final hva<String> b;
    public final hva<String> c;

    public ue2(hva.c cVar, int i) {
        hva.a aVar = hva.a.a;
        hva<String> hvaVar = (i & 4) != 0 ? aVar : cVar;
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
        if (!(obj instanceof ue2)) {
            return false;
        }
        ue2 ue2Var = (ue2) obj;
        return wl7.b(this.a, ue2Var.a) && wl7.b(this.b, ue2Var.b) && wl7.b(this.c, ue2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b0.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return akb.l(v40.g("CompleteButtonParametersJobIntegrationInput(jobMeta=", this.a, ", postCallUrl=", this.b, ", emailAddress="), this.c, ")");
    }

    public ue2() {
        this(null, 7);
    }
}
