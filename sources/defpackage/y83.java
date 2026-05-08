package defpackage;

import defpackage.ha;
import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class y83 implements ga<x83> {
    public static final y83 a = new y83();

    @Override // defpackage.ga
    public final x83 a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, x83 x83Var) {
        x83 x83Var2 = x83Var;
        hc8Var.getClass();
        lb3Var.getClass();
        x83Var2.getClass();
        hva<m9c> hvaVar = x83Var2.a;
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("timeWindow");
            hn hnVar = hn.d;
            ha.g gVar = ha.a;
            ena enaVar = new ena(hnVar, false);
            V v = ((hva.c) hvaVar).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                enaVar.b(hc8Var, lb3Var, v);
            }
        }
    }
}
