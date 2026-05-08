package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes2.dex */
public final class cd5 implements ga<bd5> {
    public static final cd5 a = new cd5();

    @Override // defpackage.ga
    public final bd5 a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, bd5 bd5Var) {
        bd5 bd5Var2 = bd5Var;
        hc8Var.getClass();
        lb3Var.getClass();
        bd5Var2.getClass();
        hva<Boolean> hvaVar = bd5Var2.b;
        hva<Boolean> hvaVar2 = bd5Var2.a;
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("adjacentContextSearch");
            ha.a(ha.l).b(hc8Var, lb3Var, (hva.c) hvaVar2);
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("allowUninitiatedConversationResults");
            ha.a(ha.l).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
    }
}
