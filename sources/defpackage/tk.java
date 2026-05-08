package defpackage;

import defpackage.ha;
import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class tk implements ga<sk> {
    public static final tk a = new tk();

    @Override // defpackage.ga
    public final sk a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, sk skVar) {
        sk skVar2 = skVar;
        hc8Var.getClass();
        lb3Var.getClass();
        skVar2.getClass();
        hva<kq> hvaVar = skVar2.b;
        hva<kq> hvaVar2 = skVar2.a;
        boolean z = hvaVar2 instanceof hva.c;
        lq lqVar = lq.a;
        if (z) {
            hc8Var.u0("taxonomyConceptLanguage");
            ha.g gVar = ha.a;
            ena enaVar = new ena(lqVar, false);
            V v = ((hva.c) hvaVar2).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                enaVar.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("taxonomyConceptProficiency");
            ha.g gVar2 = ha.a;
            ena enaVar2 = new ena(lqVar, false);
            V v2 = ((hva.c) hvaVar).a;
            if (v2 == 0) {
                hc8Var.H1();
            } else {
                enaVar2.b(hc8Var, lb3Var, v2);
            }
        }
    }
}
