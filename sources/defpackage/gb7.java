package defpackage;

import defpackage.eb7;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gb7 implements ga<eb7.a> {
    public static final gb7 a = new gb7();
    public static final List<String> b = u63.Z("inferredApplicationStatusForJobs");

    @Override // defpackage.ga
    public final eb7.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        eb7.c cVar = null;
        while (mb8Var.D1(b) == 0) {
            ib7 ib7Var = ib7.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(ib7Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            cVar = (eb7.c) objA;
        }
        return new eb7.a(cVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, eb7.a aVar) {
        eb7.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("inferredApplicationStatusForJobs");
        ib7 ib7Var = ib7.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(ib7Var, false);
        eb7.c cVar = aVar2.a;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
    }
}
