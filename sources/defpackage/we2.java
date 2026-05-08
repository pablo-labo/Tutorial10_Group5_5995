package defpackage;

import defpackage.ha;
import defpackage.hva;

/* JADX INFO: loaded from: classes2.dex */
public final class we2 implements ga<ue2> {
    public static final we2 a = new we2();

    @Override // defpackage.ga
    public final ue2 a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ue2 ue2Var) {
        ue2 ue2Var2 = ue2Var;
        hc8Var.getClass();
        lb3Var.getClass();
        ue2Var2.getClass();
        hva<String> hvaVar = ue2Var2.c;
        hva<String> hvaVar2 = ue2Var2.b;
        hva<String> hvaVar3 = ue2Var2.a;
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("jobMeta");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar3);
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("postCallUrl");
            ga gaVarE = lb3Var.e(qwg.a);
            ha.g gVar = ha.a;
            if (gaVarE instanceof nma) {
                r6.g("The adapter is already nullable");
                return;
            }
            V v = ((hva.c) hvaVar2).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                gaVarE.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("emailAddress");
            ga gaVarE2 = lb3Var.e(cq4.a);
            ha.g gVar2 = ha.a;
            if (gaVarE2 instanceof nma) {
                r6.g("The adapter is already nullable");
                return;
            }
            V v2 = ((hva.c) hvaVar).a;
            if (v2 == 0) {
                hc8Var.H1();
            } else {
                gaVarE2.b(hc8Var, lb3Var, v2);
            }
        }
    }
}
