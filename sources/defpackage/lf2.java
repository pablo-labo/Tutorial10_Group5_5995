package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class lf2 {
    public final hva<Object> a;
    public final hva<Object> b;
    public final hva<Object> c;
    public final hva<Object> d;

    public lf2() {
        hva.a aVar = hva.a.a;
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        this.a = aVar;
        this.b = aVar;
        this.c = aVar;
        this.d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf2)) {
            return false;
        }
        lf2 lf2Var = (lf2) obj;
        return wl7.b(this.a, lf2Var.a) && wl7.b(this.b, lf2Var.b) && wl7.b(this.c, lf2Var.c) && wl7.b(this.d, lf2Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + b0.e(this.c, b0.e(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return uz.e(v40.g("CompleteButtonParametersSmartApplyIntegrationInput(pingbackUrl=", this.a, ", continueUrl=", this.b, ", finishAppUrl="), this.c, ", exitUrl=", this.d, ")");
    }
}
