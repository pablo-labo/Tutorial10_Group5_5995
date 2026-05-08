package defpackage;

import defpackage.dw3;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fw3 implements ga<dw3.a> {
    public static final fw3 a = new fw3();
    public static final List<String> b = u63.Z("deleteJobSeekerProfileResumeMilitary");

    @Override // defpackage.ga
    public final dw3.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        dw3.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            gw3 gw3Var = gw3.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(gw3Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            bVar = (dw3.b) objA;
        }
        return new dw3.a(bVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, dw3.a aVar) {
        dw3.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("deleteJobSeekerProfileResumeMilitary");
        gw3 gw3Var = gw3.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(gw3Var, false);
        dw3.b bVar = aVar2.a;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
    }
}
