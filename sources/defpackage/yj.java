package defpackage;

import defpackage.ha;
import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class yj implements ga<xj> {
    public static final yj a = new yj();

    @Override // defpackage.ga
    public final xj a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, xj xjVar) {
        xj xjVar2 = xjVar;
        hc8Var.getClass();
        lb3Var.getClass();
        xjVar2.getClass();
        hva<iq> hvaVar = xjVar2.c;
        hva<String> hvaVar2 = xjVar2.b;
        hva<a18> hvaVar3 = xjVar2.a;
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("dateRange");
            ha.g gVar = ha.a;
            ena enaVar = new ena(b18.a, false);
            V v = ((hva.c) hvaVar3).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                enaVar.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("description");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar2);
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("taxonomyConceptTitle");
            ha.g gVar2 = ha.a;
            ena enaVar2 = new ena(jq.a, false);
            V v2 = ((hva.c) hvaVar).a;
            if (v2 == 0) {
                hc8Var.H1();
            } else {
                enaVar2.b(hc8Var, lb3Var, v2);
            }
        }
        hc8Var.u0("title");
        ha.a.b(hc8Var, lb3Var, xjVar2.d);
    }
}
