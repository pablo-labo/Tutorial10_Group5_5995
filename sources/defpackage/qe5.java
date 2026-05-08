package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.ne5;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qe5 implements ga<ne5.b> {
    public static final qe5 a = new qe5();
    public static final List<String> b = u63.Z("resumeFileSuggestion");

    @Override // defpackage.ga
    public final ne5.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        ne5.c cVar = null;
        while (mb8Var.D1(b) == 0) {
            re5 re5Var = re5.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(re5Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            cVar = (ne5.c) objA;
        }
        return new ne5.b(cVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ne5.b bVar) {
        ne5.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("resumeFileSuggestion");
        re5 re5Var = re5.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(re5Var, false);
        ne5.c cVar = bVar2.a;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
    }
}
