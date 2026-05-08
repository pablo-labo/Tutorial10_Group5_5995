package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class ve2 implements ga<te2> {
    public static final ve2 a = new ve2();

    @Override // defpackage.ga
    public final te2 a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, te2 te2Var) {
        te2 te2Var2 = te2Var;
        hc8Var.getClass();
        lb3Var.getClass();
        te2Var2.getClass();
        hva<Object> hvaVar = te2Var2.c;
        hva<Object> hvaVar2 = te2Var2.b;
        hva<String> hvaVar3 = te2Var2.a;
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("jobMeta");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar3);
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("postCallUrl");
            ha.a(ha.m).b(hc8Var, lb3Var, (hva.c) hvaVar2);
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("emailAddress");
            ha.a(ha.m).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
    }
}
