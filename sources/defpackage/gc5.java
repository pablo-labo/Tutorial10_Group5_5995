package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class gc5 implements ga<fc5> {
    public static final gc5 a = new gc5();

    @Override // defpackage.ga
    public final fc5 a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, fc5 fc5Var) {
        fc5 fc5Var2 = fc5Var;
        hc8Var.getClass();
        lb3Var.getClass();
        fc5Var2.getClass();
        hc8Var.u0("marketCountry");
        ha.g.b(hc8Var, lb3Var, fc5Var2.a);
        hva<Object> hvaVar = fc5Var2.b;
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("marketLanguage");
            ha.a(ha.m).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
    }
}
