package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jk {
    public final hva<a18> a;
    public final hk b;
    public final hva<p38> c;
    public final hva<String> d;
    public final hva<String> e;
    public final hva<List<k18>> f;

    public jk() {
        throw null;
    }

    public jk(hva hvaVar, hk hkVar, hva hvaVar2, hva hvaVar3) {
        hva.a aVar = hva.a.a;
        hvaVar.getClass();
        hvaVar2.getClass();
        hvaVar3.getClass();
        aVar.getClass();
        aVar.getClass();
        this.a = hvaVar;
        this.b = hkVar;
        this.c = hvaVar2;
        this.d = hvaVar3;
        this.e = aVar;
        this.f = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk)) {
            return false;
        }
        jk jkVar = (jk) obj;
        return wl7.b(this.a, jkVar.a) && wl7.b(this.b, jkVar.b) && wl7.b(this.c, jkVar.c) && wl7.b(this.d, jkVar.d) && wl7.b(this.e, jkVar.e) && wl7.b(this.f, jkVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + b0.e(this.e, b0.e(this.d, b0.e(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddJobSeekerProfileEducationInput(dateRange=");
        sb.append(this.a);
        sb.append(", degree=");
        sb.append(this.b);
        sb.append(", location=");
        w40.o(sb, this.c, ", school=", this.d, ", additionalDetails=");
        return uz.e(sb, this.e, ", customFields=", this.f, ")");
    }
}
