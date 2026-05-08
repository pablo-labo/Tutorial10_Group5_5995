package defpackage;

import defpackage.ha;
import defpackage.hva;

/* JADX INFO: loaded from: classes2.dex */
public final class uc5 implements ga<tc5> {
    public static final uc5 a = new uc5();

    @Override // defpackage.ga
    public final tc5 a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, tc5 tc5Var) {
        tc5 tc5Var2 = tc5Var;
        hc8Var.getClass();
        lb3Var.getClass();
        tc5Var2.getClass();
        hva<bd5> hvaVar = tc5Var2.b;
        hva<vw2> hvaVar2 = tc5Var2.a;
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("filter");
            ha.g gVar = ha.a;
            ena enaVar = new ena(ww2.a, false);
            V v = ((hva.c) hvaVar2).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                enaVar.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("options");
            ha.g gVar2 = ha.a;
            ena enaVar2 = new ena(cd5.a, false);
            V v2 = ((hva.c) hvaVar).a;
            if (v2 == 0) {
                hc8Var.H1();
            } else {
                enaVar2.b(hc8Var, lb3Var, v2);
            }
        }
    }
}
