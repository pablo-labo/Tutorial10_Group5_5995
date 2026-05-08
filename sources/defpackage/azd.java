package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class azd implements ga<zyd> {
    public static final azd a = new azd();

    @Override // defpackage.ga
    public final zyd a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, zyd zydVar) {
        zyd zydVar2 = zydVar;
        hc8Var.getClass();
        lb3Var.getClass();
        zydVar2.getClass();
        hva<Boolean> hvaVar = zydVar2.a;
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("useCrowtaxo");
            ha.a(ha.l).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
    }
}
