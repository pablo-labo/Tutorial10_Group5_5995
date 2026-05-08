package defpackage;

import defpackage.ha;
import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class qz implements ga<pz> {
    public static final qz a = new qz();

    @Override // defpackage.ga
    public final pz a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, pz pzVar) {
        pz pzVar2 = pzVar;
        hc8Var.getClass();
        lb3Var.getClass();
        pzVar2.getClass();
        hva<List<fja>> hvaVar = pzVar2.b;
        hva<List<String>> hvaVar2 = pzVar2.a;
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("accountKeys");
            hy8 hy8Var = new hy8(ha.a);
            V v = ((hva.c) hvaVar2).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                hy8Var.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("nonAccountUsers");
            yo yoVar = yo.e;
            ha.g gVar = ha.a;
            hy8 hy8Var2 = new hy8(new ena(yoVar, false));
            V v2 = ((hva.c) hvaVar).a;
            if (v2 == 0) {
                hc8Var.H1();
            } else {
                hy8Var2.b(hc8Var, lb3Var, v2);
            }
        }
    }
}
