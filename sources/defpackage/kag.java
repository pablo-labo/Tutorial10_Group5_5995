package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class kag implements ga<jag> {
    public static final kag a = new kag();

    @Override // defpackage.ga
    public final jag a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, jag jagVar) {
        jag jagVar2 = jagVar;
        hc8Var.getClass();
        lb3Var.getClass();
        jagVar2.getClass();
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, jagVar2.a);
        hva<String> hvaVar = jagVar2.b;
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("link");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
    }
}
