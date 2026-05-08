package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class uyd implements ga<tyd> {
    public static final uyd a = new uyd();

    @Override // defpackage.ga
    public final tyd a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, tyd tydVar) {
        tyd tydVar2 = tydVar;
        hc8Var.getClass();
        lb3Var.getClass();
        tydVar2.getClass();
        hva<String> hvaVar = tydVar2.c;
        hva<String> hvaVar2 = tydVar2.b;
        hva<String> hvaVar3 = tydVar2.a;
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("jobTitle");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar3);
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("jobDescription");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar2);
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("companyName");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
    }
}
