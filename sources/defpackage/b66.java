package defpackage;

import defpackage.ha;
import defpackage.y56;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class b66 implements ga<y56.b> {
    public static final b66 a = new b66();
    public static final List<String> b = u63.Z("userDisplayPreference");

    @Override // defpackage.ga
    public final y56.b a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        y56.d dVar = null;
        while (mb8Var.D1(b) == 0) {
            d66 d66Var = d66.a;
            ha.g gVar = ha.a;
            dVar = (y56.d) new ena(d66Var, false).a(mb8Var, lb3Var);
        }
        if (dVar != null) {
            return new y56.b(dVar);
        }
        mh2.q(mb8Var, "userDisplayPreference");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, y56.b bVar) {
        y56.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("userDisplayPreference");
        d66 d66Var = d66.a;
        ha.g gVar = ha.a;
        y56.d dVar = bVar2.a;
        hc8Var.j();
        d66Var.b(hc8Var, lb3Var, dVar);
        hc8Var.t();
    }
}
