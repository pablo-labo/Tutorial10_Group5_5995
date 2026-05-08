package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xeg {
    public final hva<String> a;
    public final hva<String> b;
    public final hva<String> c;
    public final hva<List<o48>> d;
    public final hva<List<y08>> e;

    public xeg(hva hvaVar, hva hvaVar2, int i) {
        hvaVar = (i & 1) != 0 ? hva.a.a : hvaVar;
        hvaVar2 = (i & 2) != 0 ? hva.a.a : hvaVar2;
        hva.a aVar = hva.a.a;
        hvaVar.getClass();
        hvaVar2.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        this.a = hvaVar;
        this.b = hvaVar2;
        this.c = aVar;
        this.d = aVar;
        this.e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xeg)) {
            return false;
        }
        xeg xegVar = (xeg) obj;
        return wl7.b(this.a, xegVar.a) && wl7.b(this.b, xegVar.b) && wl7.b(this.c, xegVar.c) && wl7.b(this.d, xegVar.d) && wl7.b(this.e, xegVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + b0.e(this.d, b0.e(this.c, b0.e(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbG = v40.g("UpdateJobSeekerProfileTaxonomyConceptInput(label=", this.a, ", suid=", this.b, ", type=");
        w40.o(sbG, this.c, ", sectionIds=", this.d, ", context=");
        return akb.l(sbG, this.e, ")");
    }

    public xeg() {
        this(null, null, 31);
    }
}
