package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.nx3;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class px3 implements ga<nx3.a> {
    public static final px3 a = new px3();
    public static final List<String> b = u63.Z("deleteResumeBundle");

    @Override // defpackage.ga
    public final nx3.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        nx3.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            qx3 qx3Var = qx3.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(qx3Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            bVar = (nx3.b) objA;
        }
        return new nx3.a(bVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, nx3.a aVar) {
        nx3.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("deleteResumeBundle");
        qx3 qx3Var = qx3.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(qx3Var, false);
        nx3.b bVar = aVar2.a;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
    }
}
