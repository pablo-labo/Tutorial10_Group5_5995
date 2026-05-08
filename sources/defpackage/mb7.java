package defpackage;

import defpackage.ha;
import defpackage.kb7;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mb7 implements ga<kb7.a> {
    public static final mb7 a = new mb7();
    public static final List<String> b = u63.Z("inferredApplicationStatusForJobs");

    @Override // defpackage.ga
    public final kb7.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        kb7.c cVar = null;
        while (mb8Var.D1(b) == 0) {
            ob7 ob7Var = ob7.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(ob7Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            cVar = (kb7.c) objA;
        }
        return new kb7.a(cVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, kb7.a aVar) {
        kb7.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("inferredApplicationStatusForJobs");
        ob7 ob7Var = ob7.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(ob7Var, false);
        kb7.c cVar = aVar2.a;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
    }
}
