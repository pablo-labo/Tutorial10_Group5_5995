package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class cdg {
    public final String a;
    public final hva<String> b;
    public final hva<String> c;
    public final hva<String> d;
    public final hva<String> e;
    public final hva<String> f;
    public final hva<String> g;
    public final hva<a18> h;

    public cdg() {
        throw null;
    }

    public cdg(hva hvaVar, hva hvaVar2, hva hvaVar3, hva hvaVar4, hva hvaVar5, String str) {
        hva.a aVar = hva.a.a;
        aVar.getClass();
        hvaVar.getClass();
        hvaVar2.getClass();
        hvaVar3.getClass();
        aVar.getClass();
        hvaVar4.getClass();
        hvaVar5.getClass();
        this.a = str;
        this.b = aVar;
        this.c = hvaVar;
        this.d = hvaVar2;
        this.e = hvaVar3;
        this.f = aVar;
        this.g = hvaVar4;
        this.h = hvaVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdg)) {
            return false;
        }
        cdg cdgVar = (cdg) obj;
        return wl7.b(this.a, cdgVar.a) && wl7.b(this.b, cdgVar.b) && wl7.b(this.c, cdgVar.c) && wl7.b(this.d, cdgVar.d) && wl7.b(this.e, cdgVar.e) && wl7.b(this.f, cdgVar.f) && wl7.b(this.g, cdgVar.g) && wl7.b(this.h, cdgVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + b0.e(this.g, b0.e(this.f, b0.e(this.e, b0.e(this.d, b0.e(this.c, b0.e(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateJobSeekerProfileResumeMilitaryItemInput(id=");
        sb.append(this.a);
        sb.append(", serviceCode=");
        sb.append(this.b);
        sb.append(", branch=");
        w40.o(sb, this.c, ", rank=", this.d, ", country=");
        w40.o(sb, this.e, ", commendations=", this.f, ", description=");
        return uz.e(sb, this.g, ", dateRange=", this.h, ")");
    }
}
