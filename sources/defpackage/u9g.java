package defpackage;

import defpackage.ha;
import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class u9g implements ga<t9g> {
    public static final u9g a = new u9g();

    @Override // defpackage.ga
    public final t9g a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, t9g t9gVar) {
        t9g t9gVar2 = t9gVar;
        hc8Var.getClass();
        lb3Var.getClass();
        t9gVar2.getClass();
        hva<xeg> hvaVar = t9gVar2.b;
        hva<String> hvaVar2 = t9gVar2.a;
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("name");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar2);
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("taxonomyConceptName");
            ha.g gVar = ha.a;
            ena enaVar = new ena(yeg.a, false);
            V v = ((hva.c) hvaVar).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                enaVar.b(hc8Var, lb3Var, v);
            }
        }
    }
}
