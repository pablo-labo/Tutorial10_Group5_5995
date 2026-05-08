package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes2.dex */
public final class mf2 {
    public final hva<String> a;
    public final hva<String> b;
    public final hva<String> c;
    public final hva<String> d;

    public mf2() {
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
        if (!(obj instanceof mf2)) {
            return false;
        }
        mf2 mf2Var = (mf2) obj;
        return wl7.b(this.a, mf2Var.a) && wl7.b(this.b, mf2Var.b) && wl7.b(this.c, mf2Var.c) && wl7.b(this.d, mf2Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + b0.e(this.c, b0.e(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return uz.e(v40.g("CompleteButtonParametersSmartApplyIntegrationInput(pingbackUrl=", this.a, ", continueUrl=", this.b, ", finishAppUrl="), this.c, ", exitUrl=", this.d, ")");
    }
}
