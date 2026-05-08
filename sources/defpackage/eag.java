package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.z9g;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class eag implements ga<z9g.d> {
    public static final eag a = new eag();
    public static final List<String> b = u63.Z("preference");

    @Override // defpackage.ga
    public final z9g.d a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        z9g.c cVar = null;
        while (mb8Var.D1(b) == 0) {
            dag dagVar = dag.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(dagVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            cVar = (z9g.c) objA;
        }
        return new z9g.d(cVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, z9g.d dVar) {
        z9g.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("preference");
        dag dagVar = dag.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(dagVar, false);
        z9g.c cVar = dVar2.a;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
    }
}
