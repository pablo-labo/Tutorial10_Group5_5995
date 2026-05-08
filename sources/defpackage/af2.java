package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes2.dex */
public final class af2 implements ga<ye2> {
    public static final af2 a = new af2();

    @Override // defpackage.ga
    public final ye2 a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ye2 ye2Var) {
        ye2 ye2Var2 = ye2Var;
        hc8Var.getClass();
        lb3Var.getClass();
        ye2Var2.getClass();
        hva<String> hvaVar = ye2Var2.a;
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("sourceUrl");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
    }
}
