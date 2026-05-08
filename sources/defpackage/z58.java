package defpackage;

import defpackage.ha;
import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class z58 implements ga<y58> {
    public static final z58 a = new z58();

    @Override // defpackage.ga
    public final y58 a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, y58 y58Var) {
        y58 y58Var2 = y58Var;
        hc8Var.getClass();
        lb3Var.getClass();
        y58Var2.getClass();
        hva<Double> hvaVar = y58Var2.c;
        hva<c58> hvaVar2 = y58Var2.b;
        hva<Boolean> hvaVar3 = y58Var2.a;
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("ableToRelocate");
            ha.a(ha.l).b(hc8Var, lb3Var, (hva.c) hvaVar3);
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
