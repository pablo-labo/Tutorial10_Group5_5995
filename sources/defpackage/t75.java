package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.o75;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class t75 implements ga<o75.d> {
    public static final t75 a = new t75();
    public static final List<String> b = u63.Z("conversation");

    @Override // defpackage.ga
    public final o75.d a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        o75.c cVar = null;
        while (mb8Var.D1(b) == 0) {
            s75 s75Var = s75.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(s75Var, true);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            cVar = (o75.c) objA;
        }
        return new o75.d(cVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, o75.d dVar) {
        o75.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("conversation");
        s75 s75Var = s75.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(s75Var, true);
        o75.c cVar = dVar2.a;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
    }
}
