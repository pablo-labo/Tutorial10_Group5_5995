package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.ya7;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ab7 implements ga<ya7.a> {
    public static final ab7 a = new ab7();
    public static final List<String> b = u63.Z("inferredApplicationStatusForJobs");

    @Override // defpackage.ga
    public final ya7.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        ya7.c cVar = null;
        while (mb8Var.D1(b) == 0) {
            cb7 cb7Var = cb7.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(cb7Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            cVar = (ya7.c) objA;
        }
        return new ya7.a(cVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ya7.a aVar) {
        ya7.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("inferredApplicationStatusForJobs");
        cb7 cb7Var = cb7.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(cb7Var, false);
        ya7.c cVar = aVar2.a;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
    }
}
