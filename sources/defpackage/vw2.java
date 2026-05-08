package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class vw2 {
    public final hva<List<av2>> a;
    public final hva<List<py2>> b;
    public final hva<List<String>> c;
    public final hva<List<String>> d;
    public final hva<List<ey2>> e;
    public final hva<String> f;

    public vw2(hva.c cVar, hva.c cVar2, int i) {
        hva.a aVar = hva.a.a;
        hva<List<String>> hvaVar = (i & 4) != 0 ? aVar : cVar;
        hva<List<String>> hvaVar2 = (i & 8) != 0 ? aVar : cVar2;
        aVar.getClass();
        aVar.getClass();
        hvaVar.getClass();
        hvaVar2.getClass();
        aVar.getClass();
        aVar.getClass();
        this.a = aVar;
        this.b = aVar;
        this.c = hvaVar;
        this.d = hvaVar2;
        this.e = aVar;
        this.f = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vw2)) {
            return false;
        }
        vw2 vw2Var = (vw2) obj;
        return wl7.b(this.a, vw2Var.a) && wl7.b(this.b, vw2Var.b) && wl7.b(this.c, vw2Var.c) && wl7.b(this.d, vw2Var.d) && wl7.b(this.e, vw2Var.e) && wl7.b(this.f, vw2Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + b0.e(this.e, b0.e(this.d, b0.e(this.c, b0.e(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbG = v40.g("ConversationFilterInput(contexts=", this.a, ", scope=", this.b, ", includedLabels=");
        w40.o(sbG, this.c, ", excludedLabels=", this.d, ", metadata=");
        return uz.e(sbG, this.e, ", employerJobId=", this.f, ")");
    }

    public vw2() {
        this(null, null, 63);
    }
}
