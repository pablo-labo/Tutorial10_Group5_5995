package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class x9g {
    public final String a;
    public final hva<a18> b;
    public final hva<v9g> c;
    public final hva<p38> d;
    public final hva<String> e;
    public final hva<String> f;
    public final hva<List<k18>> g;

    public x9g() {
        throw null;
    }

    public x9g(hva hvaVar, hva hvaVar2, hva hvaVar3, hva hvaVar4, hva hvaVar5, String str) {
        hva.a aVar = hva.a.a;
        hvaVar.getClass();
        hvaVar2.getClass();
        hvaVar3.getClass();
        hvaVar4.getClass();
        hvaVar5.getClass();
        aVar.getClass();
        this.a = str;
        this.b = hvaVar;
        this.c = hvaVar2;
        this.d = hvaVar3;
        this.e = hvaVar4;
        this.f = hvaVar5;
        this.g = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9g)) {
            return false;
        }
        x9g x9gVar = (x9g) obj;
        return wl7.b(this.a, x9gVar.a) && wl7.b(this.b, x9gVar.b) && wl7.b(this.c, x9gVar.c) && wl7.b(this.d, x9gVar.d) && wl7.b(this.e, x9gVar.e) && wl7.b(this.f, x9gVar.f) && wl7.b(this.g, x9gVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + b0.e(this.f, b0.e(this.e, b0.e(this.d, b0.e(this.c, b0.e(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateJobSeekerProfileEducationInput(id=");
        sb.append(this.a);
        sb.append(", dateRange=");
        sb.append(this.b);
        sb.append(", degree=");
        w40.o(sb, this.c, ", location=", this.d, ", school=");
        w40.o(sb, this.e, ", additionalDetails=", this.f, ", customFields=");
        return akb.l(sb, this.g, ")");
    }
}
