package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.n1d;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class p1d implements ga<n1d.a> {
    public static final p1d a = new p1d();
    public static final List<String> b = u63.Z("deleteJobSeekerProfileStructuredDataPreferenceAttributes");

    @Override // defpackage.ga
    public final n1d.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        n1d.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            q1d q1dVar = q1d.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(q1dVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            bVar = (n1d.b) objA;
        }
        return new n1d.a(bVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, n1d.a aVar) {
        n1d.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("deleteJobSeekerProfileStructuredDataPreferenceAttributes");
        q1d q1dVar = q1d.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(q1dVar, false);
        n1d.b bVar = aVar2.a;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
    }
}
