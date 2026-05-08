package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class p38 {
    public final hva<String> a;
    public final hva<String> b;
    public final hva<String> c;
    public final hva<String> d;
    public final hva<String> e;
    public final hva<String> f;
    public final hva<String> g;
    public final hva<String> h;
    public final hva<a28> i;
    public final hva<Double> j;
    public final hva<String> k;
    public final hva<Double> l;
    public final hva<String> m;
    public final hva<String> n;
    public final hva<String> o;

    public p38(hva hvaVar, hva hvaVar2, hva hvaVar3, hva hvaVar4, hva hvaVar5, int i) {
        hvaVar = (i & 1) != 0 ? hva.a.a : hvaVar;
        hva.a aVar = hva.a.a;
        hvaVar2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? aVar : hvaVar2;
        hvaVar3 = (i & 4096) != 0 ? aVar : hvaVar3;
        hvaVar4 = (i & 8192) != 0 ? aVar : hvaVar4;
        hvaVar5 = (i & 16384) != 0 ? aVar : hvaVar5;
        hvaVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        hvaVar2.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        hvaVar3.getClass();
        hvaVar4.getClass();
        hvaVar5.getClass();
        this.a = hvaVar;
        this.b = aVar;
        this.c = aVar;
        this.d = aVar;
        this.e = aVar;
        this.f = aVar;
        this.g = aVar;
        this.h = hvaVar2;
        this.i = aVar;
        this.j = aVar;
        this.k = aVar;
        this.l = aVar;
        this.m = hvaVar3;
        this.n = hvaVar4;
        this.o = hvaVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p38)) {
            return false;
        }
        p38 p38Var = (p38) obj;
        return wl7.b(this.a, p38Var.a) && wl7.b(this.b, p38Var.b) && wl7.b(this.c, p38Var.c) && wl7.b(this.d, p38Var.d) && wl7.b(this.e, p38Var.e) && wl7.b(this.f, p38Var.f) && wl7.b(this.g, p38Var.g) && wl7.b(this.h, p38Var.h) && wl7.b(this.i, p38Var.i) && wl7.b(this.j, p38Var.j) && wl7.b(this.k, p38Var.k) && wl7.b(this.l, p38Var.l) && wl7.b(this.m, p38Var.m) && wl7.b(this.n, p38Var.n) && wl7.b(this.o, p38Var.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + b0.e(this.n, b0.e(this.m, b0.e(this.l, b0.e(this.k, b0.e(this.j, b0.e(this.i, b0.e(this.h, b0.e(this.g, b0.e(this.f, b0.e(this.e, b0.e(this.d, b0.e(this.c, b0.e(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbG = v40.g("JobSeekerProfileLocationTypeInput(address=", this.a, ", address2=", this.b, ", admin1=");
        w40.o(sbG, this.c, ", admin2=", this.d, ", admin3=");
        w40.o(sbG, this.e, ", admin4=", this.f, ", city=");
        w40.o(sbG, this.g, ", country=", this.h, ", geocodePrecision=");
        w40.o(sbG, this.i, ", latitude=", this.j, ", location=");
        w40.o(sbG, this.k, ", longitude=", this.l, ", postalCode=");
        w40.o(sbG, this.m, ", state=", this.n, ", unknownLocation=");
        return akb.l(sbG, this.o, ")");
    }

    public p38() {
        this(null, null, null, null, null, 32767);
    }
}
