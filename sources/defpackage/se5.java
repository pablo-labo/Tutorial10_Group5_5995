package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.ne5;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class se5 implements ga<ne5.d> {
    public static final se5 a = new se5();
    public static final List<String> b = u63.Z("findResumeFileSuggestions");

    @Override // defpackage.ga
    public final ne5.d a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        ne5.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            qe5 qe5Var = qe5.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(qe5Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            bVar = (ne5.b) objA;
        }
        return new ne5.d(bVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ne5.d dVar) {
        ne5.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("findResumeFileSuggestions");
        qe5 qe5Var = qe5.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(qe5Var, false);
        ne5.b bVar = dVar2.a;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
    }
}
