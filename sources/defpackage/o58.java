package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class o58 {
    public final h68 a;
    public final hva<Double> b;
    public final hva<l58> c;
    public final hva<String> d;
    public final hva<String> e;
    public final hva<Double> f;
    public final hva<Double> g;
    public final hva<String> h;
    public final hva<String> i;
    public final hva<String> j;
    public final hva<String> k;
    public final hva<String> l;
    public final hva<String> m;
    public final hva<String> n;
    public final hva<String> o;
    public final hva<c58> p;
    public final hva<Double> q;

    public o58() {
        throw null;
    }

    public o58(hva.c cVar) {
        h68 h68Var = h68.c;
        hva.a aVar = hva.a.a;
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        this.a = h68Var;
        this.b = aVar;
        this.c = aVar;
        this.d = aVar;
        this.e = cVar;
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
        this.i = aVar;
        this.j = aVar;
        this.k = aVar;
        this.l = aVar;
        this.m = aVar;
        this.n = aVar;
        this.o = aVar;
        this.p = aVar;
        this.q = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o58)) {
            return false;
        }
        o58 o58Var = (o58) obj;
        return this.a == o58Var.a && wl7.b(this.b, o58Var.b) && wl7.b(this.c, o58Var.c) && wl7.b(this.d, o58Var.d) && wl7.b(this.e, o58Var.e) && wl7.b(this.f, o58Var.f) && wl7.b(this.g, o58Var.g) && wl7.b(this.h, o58Var.h) && wl7.b(this.i, o58Var.i) && wl7.b(this.j, o58Var.j) && wl7.b(this.k, o58Var.k) && wl7.b(this.l, o58Var.l) && wl7.b(this.m, o58Var.m) && wl7.b(this.n, o58Var.n) && wl7.b(this.o, o58Var.o) && wl7.b(this.p, o58Var.p) && wl7.b(this.q, o58Var.q);
    }

    public final int hashCode() {
        return this.q.hashCode() + b0.e(this.p, b0.e(this.o, b0.e(this.n, b0.e(this.m, b0.e(this.l, b0.e(this.k, b0.e(this.j, b0.e(this.i, b0.e(this.h, b0.e(this.g, b0.e(this.f, b0.e(this.e, b0.e(this.d, b0.e(this.c, b0.e(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JobSeekerProfileStructuredDataLocationInput(sentiment=");
        sb.append(this.a);
        sb.append(", weight=");
        sb.append(this.b);
        sb.append(", latlngPrecision=");
        w40.o(sb, this.c, ", geoHash=", this.d, ", raw=");
        w40.o(sb, this.e, ", latitude=", this.f, ", longitude=");
        w40.o(sb, this.g, ", country=", this.h, ", city=");
        w40.o(sb, this.i, ", postalCode=", this.j, ", address=");
        w40.o(sb, this.k, ", admin1=", this.l, ", admin2=");
        w40.o(sb, this.m, ", admin3=", this.n, ", admin4=");
        w40.o(sb, this.o, ", source=", this.p, ", collectionTime=");
        return akb.l(sb, this.q, ")");
    }
}
