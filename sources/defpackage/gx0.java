package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class gx0 {
    public final hva<String> a;
    public final hva<String> b;
    public final hva<String> c;
    public final hva<String> d;
    public final hva<String> e;
    public final hva<String> f;

    public gx0(hva<String> hvaVar, hva<String> hvaVar2, hva<String> hvaVar3, hva<String> hvaVar4, hva<String> hvaVar5, hva<String> hvaVar6) {
        hvaVar.getClass();
        hvaVar2.getClass();
        hvaVar3.getClass();
        hvaVar4.getClass();
        hvaVar5.getClass();
        hvaVar6.getClass();
        this.a = hvaVar;
        this.b = hvaVar2;
        this.c = hvaVar3;
        this.d = hvaVar4;
        this.e = hvaVar5;
        this.f = hvaVar6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx0)) {
            return false;
        }
        gx0 gx0Var = (gx0) obj;
        return wl7.b(this.a, gx0Var.a) && wl7.b(this.b, gx0Var.b) && wl7.b(this.c, gx0Var.c) && wl7.b(this.d, gx0Var.d) && wl7.b(this.e, gx0Var.e) && wl7.b(this.f, gx0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + b0.e(this.e, b0.e(this.d, b0.e(this.c, b0.e(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbG = v40.g("AttributionParametersInput(sid=", this.a, ", kw=", this.b, ", pub=");
        w40.o(sbG, this.c, ", existingCookieValue=", this.d, ", referrer=");
        return uz.e(sbG, this.e, ", host=", this.f, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public gx0() {
        hva.a aVar = hva.a.a;
        this(aVar, aVar, aVar, aVar, aVar, aVar);
    }
}
