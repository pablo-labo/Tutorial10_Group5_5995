package defpackage;

import defpackage.ha;
import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class zn implements ga<yn> {
    public static final zn a = new zn();

    @Override // defpackage.ga
    public final yn a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, yn ynVar) {
        yn ynVar2 = ynVar;
        hc8Var.getClass();
        lb3Var.getClass();
        ynVar2.getClass();
        hva<a18> hvaVar = ynVar2.g;
        hva<String> hvaVar2 = ynVar2.f;
        hva<String> hvaVar3 = ynVar2.e;
        hva<String> hvaVar4 = ynVar2.d;
        hva<String> hvaVar5 = ynVar2.a;
        if (hvaVar5 instanceof hva.c) {
            hc8Var.u0("serviceCode");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar5);
        }
        hc8Var.u0("branch");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, ynVar2.b);
        hc8Var.u0("rank");
        gVar.b(hc8Var, lb3Var, ynVar2.c);
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
