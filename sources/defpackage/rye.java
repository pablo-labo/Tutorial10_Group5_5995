package defpackage;

import defpackage.ha;
import defpackage.hva;

/* JADX INFO: loaded from: classes2.dex */
public final class rye implements ga<qye> {
    public static final rye a = new rye();

    @Override // defpackage.ga
    public final qye a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, qye qyeVar) {
        qye qyeVar2 = qyeVar;
        hc8Var.getClass();
        lb3Var.getClass();
        qyeVar2.getClass();
        hva<wye> hvaVar = qyeVar2.b;
        hva<tye> hvaVar2 = qyeVar2.a;
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("newGenerationInput");
            ha.g gVar = ha.a;
            ena enaVar = new ena(uye.a, false);
            V v = ((hva.c) hvaVar2).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                enaVar.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("rewriteInput");
            hn hnVar = hn.e;
            ha.g gVar2 = ha.a;
            ena enaVar2 = new ena(hnVar, false);
            V v2 = ((hva.c) hvaVar).a;
            if (v2 == 0) {
                hc8Var.H1();
            } else {
                enaVar2.b(hc8Var, lb3Var, v2);
            }
        }
    }
}
