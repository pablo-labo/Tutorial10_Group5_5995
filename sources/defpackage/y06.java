package defpackage;

import defpackage.ha;
import defpackage.t06;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class y06 implements ga<t06.d> {
    public static final y06 a = new y06();
    public static final List<String> b = u63.Z("indeedApply");

    @Override // defpackage.ga
    public final t06.d a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        t06.c cVar = null;
        while (mb8Var.D1(b) == 0) {
            x06 x06Var = x06.a;
            ha.g gVar = ha.a;
            cVar = (t06.c) new ena(x06Var, false).a(mb8Var, lb3Var);
        }
        if (cVar != null) {
            return new t06.d(cVar);
        }
        mh2.q(mb8Var, "indeedApply");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, t06.d dVar) {
        t06.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("indeedApply");
        x06 x06Var = x06.a;
        ha.g gVar = ha.a;
        t06.c cVar = dVar2.a;
        hc8Var.j();
        x06Var.b(hc8Var, lb3Var, cVar);
        hc8Var.t();
    }
}
