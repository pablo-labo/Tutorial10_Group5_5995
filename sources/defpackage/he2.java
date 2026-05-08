package defpackage;

import defpackage.ha;
import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class he2 implements ga<fe2> {
    public static final he2 a = new he2();

    @Override // defpackage.ga
    public final fe2 a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, fe2 fe2Var) {
        fe2 fe2Var2 = fe2Var;
        hc8Var.getClass();
        lb3Var.getClass();
        fe2Var2.getClass();
        hva<je2> hvaVar = fe2Var2.b;
        hva<String> hvaVar2 = fe2Var2.a;
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("applicationId");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar2);
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("interview");
            ha.g gVar = ha.a;
            ena enaVar = new ena(le2.a, false);
            V v = ((hva.c) hvaVar).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                enaVar.b(hc8Var, lb3Var, v);
            }
        }
    }
}
