package defpackage;

import defpackage.ha;
import defpackage.i08;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class m08 implements ga<i08.c> {
    public static final m08 a = new m08();
    public static final List<String> b = u63.Z("profile");

    @Override // defpackage.ga
    public final i08.c a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        i08.d dVar = null;
        while (mb8Var.D1(b) == 0) {
            n08 n08Var = n08.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(n08Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            dVar = (i08.d) objA;
        }
        return new i08.c(dVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, i08.c cVar) {
        i08.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("profile");
        n08 n08Var = n08.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(n08Var, false);
        i08.d dVar = cVar2.a;
        if (dVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, dVar);
        }
    }
}
