package defpackage;

import defpackage.ha;
import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class e18 implements ga<d18> {
    public static final e18 a = new e18();

    @Override // defpackage.ga
    public final d18 a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, d18 d18Var) {
        d18 d18Var2 = d18Var;
        hc8Var.getClass();
        lb3Var.getClass();
        d18Var2.getClass();
        hva<Integer> hvaVar = d18Var2.b;
        hva<s38> hvaVar2 = d18Var2.a;
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("month");
            ha.g gVar = ha.a;
            t38 t38Var = t38.a;
            V v = ((hva.c) hvaVar2).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                t38Var.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("year");
            ha.a(ha.k).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
    }
}
