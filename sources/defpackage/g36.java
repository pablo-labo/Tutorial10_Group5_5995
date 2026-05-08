package defpackage;

import defpackage.d36;
import defpackage.ha;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g36 implements ga<d36.b> {
    public static final g36 a = new g36();
    public static final List<String> b = u63.Z("rawActivities");

    @Override // defpackage.ga
    public final d36.b a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        d36.d dVar = null;
        while (mb8Var.D1(b) == 0) {
            i36 i36Var = i36.a;
            ha.g gVar = ha.a;
            dVar = (d36.d) new ena(i36Var, false).a(mb8Var, lb3Var);
        }
        if (dVar != null) {
            return new d36.b(dVar);
        }
        mh2.q(mb8Var, "rawActivities");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, d36.b bVar) {
        d36.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("rawActivities");
        i36 i36Var = i36.a;
        ha.g gVar = ha.a;
        d36.d dVar = bVar2.a;
        hc8Var.j();
        i36Var.b(hc8Var, lb3Var, dVar);
        hc8Var.t();
    }
}
