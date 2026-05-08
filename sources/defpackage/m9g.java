package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class m9g implements ga<l9g> {
    public static final m9g a = new m9g();

    @Override // defpackage.ga
    public final l9g a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, l9g l9gVar) {
        l9g l9gVar2 = l9gVar;
        hc8Var.getClass();
        lb3Var.getClass();
        l9gVar2.getClass();
        hva<String> hvaVar = l9gVar2.e;
        hva<xeg> hvaVar2 = l9gVar2.d;
        hva<String> hvaVar3 = l9gVar2.c;
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, l9gVar2.a);
        hva<a18> hvaVar4 = l9gVar2.b;
        if (hvaVar4 instanceof hva.c) {
            hc8Var.u0("dateRange");
            ena enaVar = new ena(b18.a, false);
            V v = ((hva.c) hvaVar4).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                enaVar.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("description");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar3);
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("taxonomyConceptTitle");
            ena enaVar2 = new ena(yeg.a, false);
            V v2 = ((hva.c) hvaVar2).a;
            if (v2 == 0) {
                hc8Var.H1();
            } else {
                enaVar2.b(hc8Var, lb3Var, v2);
            }
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("title");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
    }
}
