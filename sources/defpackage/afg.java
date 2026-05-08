package defpackage;

import defpackage.ha;
import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class afg implements ga<zeg> {
    public static final afg a = new afg();

    @Override // defpackage.ga
    public final zeg a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, zeg zegVar) {
        zeg zegVar2 = zegVar;
        hc8Var.getClass();
        lb3Var.getClass();
        zegVar2.getClass();
        hva<xeg> hvaVar = zegVar2.b;
        hva<String> hvaVar2 = zegVar2.a;
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
