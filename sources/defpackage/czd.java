package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class czd implements ga<bzd> {
    public static final czd a = new czd();

    @Override // defpackage.ga
    public final bzd a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, bzd bzdVar) {
        bzd bzdVar2 = bzdVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bzdVar2.getClass();
        hva<String> hvaVar = bzdVar2.b;
        hva<String> hvaVar2 = bzdVar2.a;
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("queryWhat");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar2);
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("queryLocation");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
    }
}
