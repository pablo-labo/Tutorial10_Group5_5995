package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class jx0 {
    public final hva<String> a;
    public final hva<String> b;
    public final hva<String> c;
    public final hva<String> d;
    public final hva<String> e;

    public jx0() {
        hva.a aVar = hva.a.a;
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        this.a = aVar;
        this.b = aVar;
        this.c = aVar;
        this.d = aVar;
        this.e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jx0)) {
            return false;
        }
        jx0 jx0Var = (jx0) obj;
        return wl7.b(this.a, jx0Var.a) && wl7.b(this.b, jx0Var.b) && wl7.b(this.c, jx0Var.c) && wl7.b(this.d, jx0Var.d) && wl7.b(this.e, jx0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + b0.e(this.d, b0.e(this.c, b0.e(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbG = v40.g("AttributionParamsInput(SID=", this.a, ", KW=", this.b, ", PUB=");
        w40.o(sbG, this.c, ", REF=", this.d, ", REFERRER=");
        return akb.l(sbG, this.e, ")");
    }
}
