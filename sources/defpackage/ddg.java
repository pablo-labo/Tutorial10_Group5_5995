package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class ddg implements ga<cdg> {
    public static final ddg a = new ddg();

    @Override // defpackage.ga
    public final cdg a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, cdg cdgVar) {
        cdg cdgVar2 = cdgVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cdgVar2.getClass();
        hva<a18> hvaVar = cdgVar2.h;
        hva<String> hvaVar2 = cdgVar2.g;
        hva<String> hvaVar3 = cdgVar2.f;
        hva<String> hvaVar4 = cdgVar2.e;
        hva<String> hvaVar5 = cdgVar2.d;
        hva<String> hvaVar6 = cdgVar2.c;
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, cdgVar2.a);
        hva<String> hvaVar7 = cdgVar2.b;
        if (hvaVar7 instanceof hva.c) {
            hc8Var.u0("serviceCode");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar7);
        }
        if (hvaVar6 instanceof hva.c) {
            hc8Var.u0("branch");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar6);
        }
        if (hvaVar5 instanceof hva.c) {
            hc8Var.u0("rank");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar5);
        }
        if (hvaVar4 instanceof hva.c) {
            hc8Var.u0("country");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar4);
        }
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("commendations");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar3);
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("description");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar2);
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("dateRange");
            ena enaVar = new ena(b18.a, false);
            V v = ((hva.c) hvaVar).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                enaVar.b(hc8Var, lb3Var, v);
            }
        }
    }
}
