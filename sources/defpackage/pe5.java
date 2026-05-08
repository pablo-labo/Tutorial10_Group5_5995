package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.ne5;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pe5 implements ga<ne5.a> {
    public static final pe5 a = new pe5();
    public static final List<String> b = u63.Z("resumeFileSuggestionQueries");

    @Override // defpackage.ga
    public final ne5.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        ne5.d dVar = null;
        while (mb8Var.D1(b) == 0) {
            se5 se5Var = se5.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(se5Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            dVar = (ne5.d) objA;
        }
        return new ne5.a(dVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ne5.a aVar) {
        ne5.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("resumeFileSuggestionQueries");
        se5 se5Var = se5.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(se5Var, false);
        ne5.d dVar = aVar2.a;
        if (dVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, dVar);
        }
    }
}
