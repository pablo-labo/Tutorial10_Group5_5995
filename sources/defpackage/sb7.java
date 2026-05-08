package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.qb7;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class sb7 implements ga<qb7.a> {
    public static final sb7 a = new sb7();
    public static final List<String> b = u63.Z("inferredApplicationStatusForJobs");

    @Override // defpackage.ga
    public final qb7.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        qb7.c cVar = null;
        while (mb8Var.D1(b) == 0) {
            ub7 ub7Var = ub7.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(ub7Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            cVar = (qb7.c) objA;
        }
        return new qb7.a(cVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, qb7.a aVar) {
        qb7.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("inferredApplicationStatusForJobs");
        ub7 ub7Var = ub7.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(ub7Var, false);
        qb7.c cVar = aVar2.a;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
    }
}
