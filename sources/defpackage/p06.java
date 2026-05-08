package defpackage;

import defpackage.ha;
import defpackage.l06;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class p06 implements ga<l06.c> {
    public static final p06 a = new p06();
    public static final List<String> b = u63.Z("node");

    @Override // defpackage.ga
    public final l06.c a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        l06.f fVar = null;
        while (mb8Var.D1(b) == 0) {
            s06 s06Var = s06.a;
            ha.g gVar = ha.a;
            fVar = (l06.f) new ena(s06Var, false).a(mb8Var, lb3Var);
        }
        if (fVar != null) {
            return new l06.c(fVar);
        }
        mh2.q(mb8Var, "node");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, l06.c cVar) {
        l06.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("node");
        s06 s06Var = s06.a;
        ha.g gVar = ha.a;
        l06.f fVar = cVar2.a;
        hc8Var.j();
        s06Var.b(hc8Var, lb3Var, fVar);
        hc8Var.t();
    }
}
