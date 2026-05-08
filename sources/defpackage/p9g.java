package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.n9g;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class p9g implements ga<n9g.a> {
    public static final p9g a = new p9g();
    public static final List<String> b = u63.Z("updateJobSeekerProfileStructuredDataPreference");

    @Override // defpackage.ga
    public final n9g.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        n9g.d dVar = null;
        while (mb8Var.D1(b) == 0) {
            s9g s9gVar = s9g.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(s9gVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            dVar = (n9g.d) objA;
        }
        return new n9g.a(dVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, n9g.a aVar) {
        n9g.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("updateJobSeekerProfileStructuredDataPreference");
        s9g s9gVar = s9g.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(s9gVar, false);
        n9g.d dVar = aVar2.a;
        if (dVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, dVar);
        }
    }
}
