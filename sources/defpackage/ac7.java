package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.yb7;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ac7 implements ga<yb7.a> {
    public static final ac7 a = new ac7();
    public static final List<String> b = u63.Z("inferredApplicationStatusForJobs");

    @Override // defpackage.ga
    public final yb7.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        yb7.c cVar = null;
        while (mb8Var.D1(b) == 0) {
            cc7 cc7Var = cc7.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(cc7Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            cVar = (yb7.c) objA;
        }
        return new yb7.a(cVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, yb7.a aVar) {
        yb7.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("inferredApplicationStatusForJobs");
        cc7 cc7Var = cc7.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(cc7Var, false);
        yb7.c cVar = aVar2.a;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
    }
}
