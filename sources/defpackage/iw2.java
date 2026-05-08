package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes2.dex */
public final class iw2 implements ga<hw2> {
    public static final iw2 a = new iw2();

    @Override // defpackage.ga
    public final hw2 a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, hw2 hw2Var) {
        hw2 hw2Var2 = hw2Var;
        hc8Var.getClass();
        lb3Var.getClass();
        hw2Var2.getClass();
        hva<String> hvaVar = hw2Var2.b;
        hva<String> hvaVar2 = hw2Var2.a;
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("accountKey");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar2);
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("externalParticipantId");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
    }
}
