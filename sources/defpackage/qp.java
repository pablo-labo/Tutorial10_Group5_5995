package defpackage;

import defpackage.ha;
import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class qp implements ga<pp> {
    public static final qp a = new qp();

    @Override // defpackage.ga
    public final pp a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, pp ppVar) {
        pp ppVar2 = ppVar;
        hc8Var.getClass();
        lb3Var.getClass();
        ppVar2.getClass();
        hva<q68> hvaVar = ppVar2.d;
        hva<iq> hvaVar2 = ppVar2.b;
        hva<Object> hvaVar3 = ppVar2.a;
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("experience");
            ha.a(ha.m).b(hc8Var, lb3Var, (hva.c) hvaVar3);
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("taxonomyConceptTitle");
            ha.g gVar = ha.a;
            ena enaVar = new ena(jq.a, false);
            V v = ((hva.c) hvaVar2).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                enaVar.b(hc8Var, lb3Var, v);
            }
        }
        hc8Var.u0("text");
        ha.a.b(hc8Var, lb3Var, ppVar2.c);
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("timeUnit");
            r68 r68Var = r68.a;
            V v2 = ((hva.c) hvaVar).a;
            if (v2 == 0) {
                hc8Var.H1();
            } else {
                r68Var.b(hc8Var, lb3Var, v2);
            }
        }
    }
}
