package defpackage;

import defpackage.ha;
import defpackage.hva;

/* JADX INFO: loaded from: classes2.dex */
public final class ie2 implements ga<ge2> {
    public static final ie2 a = new ie2();

    @Override // defpackage.ga
    public final ge2 a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ge2 ge2Var) {
        ge2 ge2Var2 = ge2Var;
        hc8Var.getClass();
        lb3Var.getClass();
        ge2Var2.getClass();
        hva<ke2> hvaVar = ge2Var2.b;
        hva<String> hvaVar2 = ge2Var2.a;
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("applicationId");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar2);
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("interview");
            ha.g gVar = ha.a;
            ena enaVar = new ena(me2.a, false);
            V v = ((hva.c) hvaVar).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                enaVar.b(hc8Var, lb3Var, v);
            }
        }
    }
}
