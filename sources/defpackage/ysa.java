package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes2.dex */
public final class ysa implements ga<xsa> {
    public static final ysa a = new ysa();

    @Override // defpackage.ga
    public final xsa a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, xsa xsaVar) {
        xsa xsaVar2 = xsaVar;
        hc8Var.getClass();
        lb3Var.getClass();
        xsaVar2.getClass();
        hc8Var.u0("accountType");
        hc8Var.T0(zsa.EMPLOYER.a());
        hc8Var.u0("accountKey");
        ha.a.b(hc8Var, lb3Var, xsaVar2.a);
        hva.c cVar = xsaVar2.b;
        hc8Var.u0("advertiserKey");
        ha.a(ha.i).b(hc8Var, lb3Var, cVar);
    }
}
