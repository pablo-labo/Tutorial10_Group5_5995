package defpackage;

import defpackage.ha;
import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class x48 implements ga<w48> {
    public static final x48 a = new x48();

    @Override // defpackage.ga
    public final w48 a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, w48 w48Var) {
        w48 w48Var2 = w48Var;
        hc8Var.getClass();
        lb3Var.getClass();
        w48Var2.getClass();
        hva<Double> hvaVar = w48Var2.c;
        hva<c58> hvaVar2 = w48Var2.b;
        hva<Integer> hvaVar3 = w48Var2.a;
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("timeMinutes");
            ha.a(ha.k).b(hc8Var, lb3Var, (hva.c) hvaVar3);
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("source");
            ha.g gVar = ha.a;
            f58 f58Var = f58.a;
            V v = ((hva.c) hvaVar2).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                f58Var.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("collectionTime");
            ha.a(ha.j).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
    }
}
