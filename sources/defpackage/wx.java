package defpackage;

import defpackage.ha;
import defpackage.ux;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wx implements ga<ux.a> {
    public static final wx a = new wx();
    public static final List<String> b = u63.Z("userDisplayPreference");

    @Override // defpackage.ga
    public final ux.a a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        ux.e eVar = null;
        while (mb8Var.D1(b) == 0) {
            ay ayVar = ay.a;
            ha.g gVar = ha.a;
            eVar = (ux.e) new ena(ayVar, false).a(mb8Var, lb3Var);
        }
        if (eVar != null) {
            return new ux.a(eVar);
        }
        mh2.q(mb8Var, "userDisplayPreference");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ux.a aVar) {
        ux.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("userDisplayPreference");
        ay ayVar = ay.a;
        ha.g gVar = ha.a;
        ux.e eVar = aVar2.a;
        hc8Var.j();
        ayVar.b(hc8Var, lb3Var, eVar);
        hc8Var.t();
    }
}
