package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class nf2 implements ga<lf2> {
    public static final nf2 a = new nf2();

    @Override // defpackage.ga
    public final lf2 a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, lf2 lf2Var) {
        lf2 lf2Var2 = lf2Var;
        hc8Var.getClass();
        lb3Var.getClass();
        lf2Var2.getClass();
        hva<Object> hvaVar = lf2Var2.d;
        hva<Object> hvaVar2 = lf2Var2.c;
        hva<Object> hvaVar3 = lf2Var2.b;
        hva<Object> hvaVar4 = lf2Var2.a;
        if (hvaVar4 instanceof hva.c) {
            hc8Var.u0("pingbackUrl");
            ha.a(ha.m).b(hc8Var, lb3Var, (hva.c) hvaVar4);
        }
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("continueUrl");
            ha.a(ha.m).b(hc8Var, lb3Var, (hva.c) hvaVar3);
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("finishAppUrl");
            ha.a(ha.m).b(hc8Var, lb3Var, (hva.c) hvaVar2);
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("exitUrl");
            ha.a(ha.m).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
    }
}
