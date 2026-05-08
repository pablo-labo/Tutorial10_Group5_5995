package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class i9g implements ga<h9g> {
    public static final i9g a = new i9g();

    @Override // defpackage.ga
    public final h9g a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, h9g h9gVar) {
        h9g h9gVar2 = h9gVar;
        hc8Var.getClass();
        lb3Var.getClass();
        h9gVar2.getClass();
        hva<String> hvaVar = h9gVar2.d;
        hva<String> hvaVar2 = h9gVar2.c;
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, h9gVar2.a);
        hva<a18> hvaVar3 = h9gVar2.b;
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("dateRange");
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
            hc8Var.u0("title");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
    }
}
