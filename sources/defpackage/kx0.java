package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class kx0 implements ga<jx0> {
    public static final kx0 a = new kx0();

    @Override // defpackage.ga
    public final jx0 a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, jx0 jx0Var) {
        jx0 jx0Var2 = jx0Var;
        hc8Var.getClass();
        lb3Var.getClass();
        jx0Var2.getClass();
        hva<String> hvaVar = jx0Var2.e;
        hva<String> hvaVar2 = jx0Var2.d;
        hva<String> hvaVar3 = jx0Var2.c;
        hva<String> hvaVar4 = jx0Var2.b;
        hva<String> hvaVar5 = jx0Var2.a;
        if (hvaVar5 instanceof hva.c) {
            hc8Var.u0("SID");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar5);
        }
        if (hvaVar4 instanceof hva.c) {
            hc8Var.u0("KW");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar4);
        }
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("PUB");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar3);
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("REF");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar2);
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("REFERRER");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
    }
}
