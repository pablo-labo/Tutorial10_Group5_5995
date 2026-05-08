package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class yn {
    public final hva<String> a;
    public final String b;
    public final String c;
    public final hva<String> d;
    public final hva<String> e;
    public final hva<String> f;
    public final hva<a18> g;

    public yn() {
        throw null;
    }

    public yn(String str, String str2, hva hvaVar, hva hvaVar2, hva hvaVar3) {
        hva.a aVar = hva.a.a;
        aVar.getClass();
        hvaVar.getClass();
        aVar.getClass();
        hvaVar2.getClass();
        hvaVar3.getClass();
        this.a = aVar;
        this.b = str;
        this.c = str2;
        this.d = hvaVar;
        this.e = aVar;
        this.f = hvaVar2;
        this.g = hvaVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yn)) {
            return false;
        }
        yn ynVar = (yn) obj;
        return wl7.b(this.a, ynVar.a) && wl7.b(this.b, ynVar.b) && wl7.b(this.c, ynVar.c) && wl7.b(this.d, ynVar.d) && wl7.b(this.e, ynVar.e) && wl7.b(this.f, ynVar.f) && wl7.b(this.g, ynVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + b0.e(this.f, b0.e(this.e, b0.e(this.d, akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddJobSeekerProfileResumeMilitaryItemInput(serviceCode=");
        sb.append(this.a);
        sb.append(", branch=");
        sb.append(this.b);
        sb.append(", rank=");
        sb.append(this.c);
        sb.append(", country=");
        sb.append(this.d);
        sb.append(", commendations=");
        w40.o(sb, this.e, ", description=", this.f, ", dateRange=");
        return akb.l(sb, this.g, ")");
    }
}
