package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.ou3;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qu3 implements ga<ou3.a> {
    public static final qu3 a = new qu3();
    public static final List<String> b = u63.Z("deleteJobSeekerProfileResumeAwards");

    @Override // defpackage.ga
    public final ou3.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        ou3.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            ru3 ru3Var = ru3.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(ru3Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            bVar = (ou3.b) objA;
        }
        return new ou3.a(bVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ou3.a aVar) {
        ou3.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("deleteJobSeekerProfileResumeAwards");
        ru3 ru3Var = ru3.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(ru3Var, false);
        ou3.b bVar = aVar2.a;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
    }
}
