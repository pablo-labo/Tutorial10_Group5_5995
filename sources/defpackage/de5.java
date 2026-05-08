package defpackage;

import defpackage.ha;
import defpackage.sd5;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class de5 implements ga<sd5.j> {
    public static final de5 a = new de5();
    public static final List<String> b = u63.Z("formatted");

    @Override // defpackage.ga
    public final sd5.j a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        sd5.f fVar = null;
        while (mb8Var.D1(b) == 0) {
            zd5 zd5Var = zd5.a;
            ha.g gVar = ha.a;
            fVar = (sd5.f) new ena(zd5Var, false).a(mb8Var, lb3Var);
        }
        if (fVar != null) {
            return new sd5.j(fVar);
        }
        mh2.q(mb8Var, "formatted");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, sd5.j jVar) {
        sd5.j jVar2 = jVar;
        hc8Var.getClass();
        lb3Var.getClass();
        jVar2.getClass();
        hc8Var.u0("formatted");
        zd5 zd5Var = zd5.a;
        ha.g gVar = ha.a;
        sd5.f fVar = jVar2.a;
        hc8Var.j();
        zd5Var.b(hc8Var, lb3Var, fVar);
        hc8Var.t();
    }
}
