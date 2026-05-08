package defpackage;

import defpackage.ha;
import defpackage.lag;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class nag implements ga<lag.a> {
    public static final nag a = new nag();
    public static final List<String> b = u63.Z("updateJobSeekerProfileStructuredDataPreference");

    @Override // defpackage.ga
    public final lag.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        lag.d dVar = null;
        while (mb8Var.D1(b) == 0) {
            qag qagVar = qag.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(qagVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            dVar = (lag.d) objA;
        }
        return new lag.a(dVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, lag.a aVar) {
        lag.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("updateJobSeekerProfileStructuredDataPreference");
        qag qagVar = qag.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(qagVar, false);
        lag.d dVar = aVar2.a;
        if (dVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, dVar);
        }
    }
}
