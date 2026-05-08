package defpackage;

import defpackage.ha;
import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class uj implements ga<tj> {
    public static final uj a = new uj();

    @Override // defpackage.ga
    public final tj a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, tj tjVar) {
        tj tjVar2 = tjVar;
        hc8Var.getClass();
        lb3Var.getClass();
        tjVar2.getClass();
        hva<String> hvaVar = tjVar2.b;
        hva<a18> hvaVar2 = tjVar2.a;
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("dateRange");
            ha.g gVar = ha.a;
            ena enaVar = new ena(b18.a, false);
            V v = ((hva.c) hvaVar2).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                enaVar.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("description");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
        hc8Var.u0("title");
        ha.a.b(hc8Var, lb3Var, tjVar2.c);
    }
}
