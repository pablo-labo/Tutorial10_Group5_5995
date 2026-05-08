package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class kbf {
    public final hva<ebf> a;
    public final zr4 b;
    public final fa3 c;
    public final hva<Boolean> d;
    public final hva<Object> e;
    public final hva<Object> f;
    public final hva<Boolean> g;

    public kbf() {
        throw null;
    }

    public kbf(hva.c cVar, fa3 fa3Var) {
        hva.a aVar = hva.a.a;
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        this.a = cVar;
        this.b = zr4.a;
        this.c = fa3Var;
        this.d = aVar;
        this.e = aVar;
        this.f = aVar;
        this.g = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbf)) {
            return false;
        }
        kbf kbfVar = (kbf) obj;
        return wl7.b(this.a, kbfVar.a) && wl7.b(this.b, kbfVar.b) && wl7.b(this.c, kbfVar.c) && wl7.b(this.d, kbfVar.d) && wl7.b(this.e, kbfVar.e) && wl7.b(this.f, kbfVar.f) && wl7.b(this.g, kbfVar.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        this.b.getClass();
        return this.g.hashCode() + b0.e(this.f, b0.e(this.e, b0.e(this.d, (this.c.hashCode() + ((1 + iHashCode) * 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxonomyConceptsInput(conceptTypeFilter=");
        sb.append(this.a);
        sb.append(", conceptIdFilter=");
        sb.append(this.b);
        sb.append(", customClassFilter=");
        sb.append(this.c);
        sb.append(", global=");
        sb.append(this.d);
        sb.append(", countryCode=");
        w40.o(sb, this.e, ", languageCode=", this.f, ", includeDeprecated=");
        return akb.l(sb, this.g, ")");
    }
}
