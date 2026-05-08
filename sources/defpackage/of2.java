package defpackage;

import defpackage.ha;
import defpackage.hva;

/* JADX INFO: loaded from: classes2.dex */
public final class of2 implements ga<mf2> {
    public static final of2 a = new of2();

    @Override // defpackage.ga
    public final mf2 a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, mf2 mf2Var) {
        mf2 mf2Var2 = mf2Var;
        hc8Var.getClass();
        lb3Var.getClass();
        mf2Var2.getClass();
        hva<String> hvaVar = mf2Var2.d;
        hva<String> hvaVar2 = mf2Var2.c;
        hva<String> hvaVar3 = mf2Var2.b;
        hva<String> hvaVar4 = mf2Var2.a;
        if (hvaVar4 instanceof hva.c) {
            hc8Var.u0("pingbackUrl");
            ga gaVarE = lb3Var.e(qwg.a);
            ha.g gVar = ha.a;
            if (gaVarE instanceof nma) {
                r6.g("The adapter is already nullable");
                return;
            }
            V v = ((hva.c) hvaVar4).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                gaVarE.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("continueUrl");
            ga gaVarE2 = lb3Var.e(qwg.a);
            ha.g gVar2 = ha.a;
            if (gaVarE2 instanceof nma) {
                r6.g("The adapter is already nullable");
                return;
            }
            V v2 = ((hva.c) hvaVar3).a;
            if (v2 == 0) {
                hc8Var.H1();
            } else {
                gaVarE2.b(hc8Var, lb3Var, v2);
            }
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("finishAppUrl");
            ga gaVarE3 = lb3Var.e(qwg.a);
            ha.g gVar3 = ha.a;
            if (gaVarE3 instanceof nma) {
                r6.g("The adapter is already nullable");
                return;
            }
            V v3 = ((hva.c) hvaVar2).a;
            if (v3 == 0) {
                hc8Var.H1();
            } else {
                gaVarE3.b(hc8Var, lb3Var, v3);
            }
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("exitUrl");
            ga gaVarE4 = lb3Var.e(qwg.a);
            ha.g gVar4 = ha.a;
            if (gaVarE4 instanceof nma) {
                r6.g("The adapter is already nullable");
                return;
            }
            V v4 = ((hva.c) hvaVar).a;
            if (v4 == 0) {
                hc8Var.H1();
            } else {
                gaVarE4.b(hc8Var, lb3Var, v4);
            }
        }
    }
}
