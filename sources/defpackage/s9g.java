package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.n9g;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class s9g implements ga<n9g.d> {
    public static final s9g a = new s9g();
    public static final List<String> b = u63.Z("preference");

    @Override // defpackage.ga
    public final n9g.d a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        n9g.c cVar = null;
        while (mb8Var.D1(b) == 0) {
            r9g r9gVar = r9g.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(r9gVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            cVar = (n9g.c) objA;
        }
        return new n9g.d(cVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, n9g.d dVar) {
        n9g.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("preference");
        r9g r9gVar = r9g.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(r9gVar, false);
        n9g.c cVar = dVar2.a;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
    }
}
