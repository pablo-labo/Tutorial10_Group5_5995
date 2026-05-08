package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes2.dex */
public final class uye implements ga<tye> {
    public static final uye a = new uye();

    @Override // defpackage.ga
    public final tye a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, tye tyeVar) {
        tye tyeVar2 = tyeVar;
        hc8Var.getClass();
        lb3Var.getClass();
        tyeVar2.getClass();
        hva<String> hvaVar = tyeVar2.a;
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("messageDraft");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
    }
}
