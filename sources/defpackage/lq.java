package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class lq implements ga<kq> {
    public static final lq a = new lq();

    @Override // defpackage.ga
    public final kq a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, kq kqVar) {
        kq kqVar2 = kqVar;
        hc8Var.getClass();
        lb3Var.getClass();
        kqVar2.getClass();
        hc8Var.u0("name");
        ha.a.b(hc8Var, lb3Var, kqVar2.a);
        hva<iq> hvaVar = kqVar2.b;
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("taxonomyConceptName");
            ena enaVar = new ena(jq.a, false);
            V v = ((hva.c) hvaVar).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                enaVar.b(hc8Var, lb3Var, v);
            }
        }
    }
}
