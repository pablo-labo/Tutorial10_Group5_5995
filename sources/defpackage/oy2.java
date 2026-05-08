package defpackage;

import defpackage.ha;
import defpackage.hva;

/* JADX INFO: loaded from: classes2.dex */
public final class oy2 implements ga<ny2> {
    public static final oy2 a = new oy2();

    @Override // defpackage.ga
    public final ny2 a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ny2 ny2Var) {
        ny2 ny2Var2 = ny2Var;
        hc8Var.getClass();
        lb3Var.getClass();
        ny2Var2.getClass();
        hva<t7d> hvaVar = ny2Var2.b;
        hva<aib> hvaVar2 = ny2Var2.a;
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("preOrPostApply");
            ha.g gVar = ha.a;
            ena enaVar = new ena(bib.a, false);
            V v = ((hva.c) hvaVar2).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                enaVar.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("resume");
            ha.g gVar2 = ha.a;
            ena enaVar2 = new ena(u7d.a, false);
            V v2 = ((hva.c) hvaVar).a;
            if (v2 == 0) {
                hc8Var.H1();
            } else {
                enaVar2.b(hc8Var, lb3Var, v2);
            }
        }
    }
}
