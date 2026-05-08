package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.sd5;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ke5 implements ga<sd5.q> {
    public static final ke5 a = new ke5();
    public static final List<String> b = u63.Z("ratings");

    @Override // defpackage.ga
    public final sd5.q a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        sd5.o oVar = null;
        while (mb8Var.D1(b) == 0) {
            ie5 ie5Var = ie5.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(ie5Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            oVar = (sd5.o) objA;
        }
        return new sd5.q(oVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, sd5.q qVar) {
        sd5.q qVar2 = qVar;
        hc8Var.getClass();
        lb3Var.getClass();
        qVar2.getClass();
        hc8Var.u0("ratings");
        ie5 ie5Var = ie5.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(ie5Var, false);
        sd5.o oVar = qVar2.a;
        if (oVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, oVar);
        }
    }
}
