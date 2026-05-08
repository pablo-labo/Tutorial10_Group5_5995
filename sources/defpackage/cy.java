package defpackage;

import defpackage.ha;
import defpackage.ux;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cy implements ga<ux.f> {
    public static final cy a = new cy();
    public static final List<String> b = u63.Z("interactionMutations");

    @Override // defpackage.ga
    public final ux.f a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        ux.d dVar = null;
        while (mb8Var.D1(b) == 0) {
            zx zxVar = zx.a;
            ha.g gVar = ha.a;
            dVar = (ux.d) new ena(zxVar, false).a(mb8Var, lb3Var);
        }
        if (dVar != null) {
            return new ux.f(dVar);
        }
        mh2.q(mb8Var, "interactionMutations");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ux.f fVar) {
        ux.f fVar2 = fVar;
        hc8Var.getClass();
        lb3Var.getClass();
        fVar2.getClass();
        hc8Var.u0("interactionMutations");
        zx zxVar = zx.a;
        ha.g gVar = ha.a;
        ux.d dVar = fVar2.a;
        hc8Var.j();
        zxVar.b(hc8Var, lb3Var, dVar);
        hc8Var.t();
    }
}
