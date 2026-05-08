package defpackage;

import defpackage.ha;
import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class b18 implements ga<a18> {
    public static final b18 a = new b18();

    @Override // defpackage.ga
    public final a18 a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, a18 a18Var) {
        a18 a18Var2 = a18Var;
        hc8Var.getClass();
        lb3Var.getClass();
        a18Var2.getClass();
        hva<Boolean> hvaVar = a18Var2.c;
        hva<d18> hvaVar2 = a18Var2.b;
        hva<d18> hvaVar3 = a18Var2.a;
        boolean z = hvaVar3 instanceof hva.c;
        e18 e18Var = e18.a;
        if (z) {
            hc8Var.u0("fromDate");
            ha.g gVar = ha.a;
            ena enaVar = new ena(e18Var, false);
            V v = ((hva.c) hvaVar3).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                enaVar.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("toDate");
            ha.g gVar2 = ha.a;
            ena enaVar2 = new ena(e18Var, false);
            V v2 = ((hva.c) hvaVar2).a;
            if (v2 == 0) {
                hc8Var.H1();
            } else {
                enaVar2.b(hc8Var, lb3Var, v2);
            }
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("isCurrent");
            ha.a(ha.l).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
    }
}
