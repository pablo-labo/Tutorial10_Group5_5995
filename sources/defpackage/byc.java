package defpackage;

import defpackage.ha;
import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class byc implements ga<ayc> {
    public static final byc a = new byc();

    @Override // defpackage.ga
    public final ayc a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ayc aycVar) {
        ayc aycVar2 = aycVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aycVar2.getClass();
        hva.c cVar = aycVar2.b;
        hc8Var.u0("accounts");
        ha.g gVar = ha.a;
        List<xsa> list = aycVar2.a;
        list.getClass();
        hc8Var.m();
        for (Object obj : list) {
            hc8Var.j();
            ysa.a.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
        hc8Var.u0("listenerAccountType");
        hc8Var.T0(zsa.JOBSEEKER.a());
        hc8Var.u0("listenDurationSeconds");
        ha.a(ha.k).b(hc8Var, lb3Var, cVar);
    }
}
