package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class y9g implements ga<x9g> {
    public static final y9g a = new y9g();

    @Override // defpackage.ga
    public final x9g a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, x9g x9gVar) {
        x9g x9gVar2 = x9gVar;
        hc8Var.getClass();
        lb3Var.getClass();
        x9gVar2.getClass();
        hva<List<k18>> hvaVar = x9gVar2.g;
        hva<String> hvaVar2 = x9gVar2.f;
        hva<String> hvaVar3 = x9gVar2.e;
        hva<p38> hvaVar4 = x9gVar2.d;
        hva<v9g> hvaVar5 = x9gVar2.c;
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, x9gVar2.a);
        hva<a18> hvaVar6 = x9gVar2.b;
        if (hvaVar6 instanceof hva.c) {
            hc8Var.u0("dateRange");
            ena enaVar = new ena(b18.a, false);
            V v = ((hva.c) hvaVar6).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                enaVar.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar5 instanceof hva.c) {
            hc8Var.u0("degree");
            ena enaVar2 = new ena(w9g.a, false);
            V v2 = ((hva.c) hvaVar5).a;
            if (v2 == 0) {
                hc8Var.H1();
            } else {
                enaVar2.b(hc8Var, lb3Var, v2);
            }
        }
        if (hvaVar4 instanceof hva.c) {
            hc8Var.u0("location");
            ena enaVar3 = new ena(q38.a, false);
            V v3 = ((hva.c) hvaVar4).a;
            if (v3 == 0) {
                hc8Var.H1();
            } else {
                enaVar3.b(hc8Var, lb3Var, v3);
            }
        }
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("school");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar3);
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("additionalDetails");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar2);
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("customFields");
            hy8 hy8Var = new hy8(new ena(yo.d, false));
            V v4 = ((hva.c) hvaVar).a;
            if (v4 == 0) {
                hc8Var.H1();
            } else {
                hy8Var.b(hc8Var, lb3Var, v4);
            }
        }
    }
}
