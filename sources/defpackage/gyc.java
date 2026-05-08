package defpackage;

import defpackage.dyc;
import defpackage.ha;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gyc implements ga<dyc.b> {
    public static final gyc a = new gyc();
    public static final List<String> b = u63.Z("onlineStatus");

    @Override // defpackage.ga
    public final dyc.b a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        dyc.g gVar = null;
        while (mb8Var.D1(b) == 0) {
            lyc lycVar = lyc.a;
            ha.g gVar2 = ha.a;
            gVar = (dyc.g) new ena(lycVar, false).a(mb8Var, lb3Var);
        }
        if (gVar != null) {
            return new dyc.b(gVar);
        }
        mh2.q(mb8Var, "onlineStatus");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, dyc.b bVar) {
        dyc.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("onlineStatus");
        lyc lycVar = lyc.a;
        ha.g gVar = ha.a;
        dyc.g gVar2 = bVar2.a;
        hc8Var.j();
        lycVar.b(hc8Var, lb3Var, gVar2);
        hc8Var.t();
    }
}
