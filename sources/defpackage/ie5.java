package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.sd5;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ie5 implements ga<sd5.o> {
    public static final ie5 a = new ie5();
    public static final List<String> b = u63.Z("overallRating");

    @Override // defpackage.ga
    public final sd5.o a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        sd5.n nVar = null;
        while (mb8Var.D1(b) == 0) {
            he5 he5Var = he5.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(he5Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            nVar = (sd5.n) objA;
        }
        return new sd5.o(nVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, sd5.o oVar) {
        sd5.o oVar2 = oVar;
        hc8Var.getClass();
        lb3Var.getClass();
        oVar2.getClass();
        hc8Var.u0("overallRating");
        he5 he5Var = he5.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(he5Var, false);
        sd5.n nVar = oVar2.a;
        if (nVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, nVar);
        }
    }
}
