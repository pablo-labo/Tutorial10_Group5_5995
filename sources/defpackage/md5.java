package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class md5 {
    public final hva<String> a;
    public final hva<String> b;
    public final hva<Integer> c;
    public final hva<Integer> d;

    public md5(hva hvaVar, int i) {
        hvaVar = (i & 1) != 0 ? hva.a.a : hvaVar;
        hva.a aVar = hva.a.a;
        hvaVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        this.a = hvaVar;
        this.b = aVar;
        this.c = aVar;
        this.d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof md5)) {
            return false;
        }
        md5 md5Var = (md5) obj;
        return wl7.b(this.a, md5Var.a) && wl7.b(this.b, md5Var.b) && wl7.b(this.c, md5Var.c) && wl7.b(this.d, md5Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + b0.e(this.c, b0.e(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return uz.e(v40.g("FindEmployersInput(what=", this.a, ", where=", this.b, ", limit="), this.c, ", offset=", this.d, ")");
    }

    public md5() {
        this(null, 15);
    }
}
