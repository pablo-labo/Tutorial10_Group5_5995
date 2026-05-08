package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class ze2 implements ga<xe2> {
    public static final ze2 a = new ze2();

    @Override // defpackage.ga
    public final xe2 a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, xe2 xe2Var) {
        xe2 xe2Var2 = xe2Var;
        hc8Var.getClass();
        lb3Var.getClass();
        xe2Var2.getClass();
        hva<String> hvaVar = xe2Var2.a;
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("sourceUrl");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
    }
}
