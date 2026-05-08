package defpackage;

import defpackage.ha;

/* JADX INFO: loaded from: classes3.dex */
public final class o9c implements ga<n9c> {
    public static final o9c a = new o9c();

    @Override // defpackage.ga
    public final n9c a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, n9c n9cVar) {
        hc8Var.getClass();
        lb3Var.getClass();
        n9cVar.getClass();
        hc8Var.u0("label");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, null);
        hc8Var.u0("suid");
        gVar.b(hc8Var, lb3Var, null);
    }
}
