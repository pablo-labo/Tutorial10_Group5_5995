package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.p5a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class u5a implements ga<p5a.d> {
    public static final u5a a = new u5a();
    public static final List<String> b = u63.Z("myJobsInvitedJobs");

    @Override // defpackage.ga
    public final p5a.d a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        p5a.l lVar = null;
        while (mb8Var.D1(b) == 0) {
            c6a c6aVar = c6a.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(c6aVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            lVar = (p5a.l) objA;
        }
        return new p5a.d(lVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, p5a.d dVar) {
        p5a.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("myJobsInvitedJobs");
        c6a c6aVar = c6a.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(c6aVar, false);
        p5a.l lVar = dVar2.a;
        if (lVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, lVar);
        }
    }
}
