package defpackage;

import defpackage.ha;
import defpackage.z16;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class e26 implements ga<z16.d> {
    public static final e26 a = new e26();
    public static final List<String> b = u63.Z("job");

    @Override // defpackage.ga
    public final z16.d a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        z16.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            c26 c26Var = c26.a;
            ha.g gVar = ha.a;
            bVar = (z16.b) new ena(c26Var, true).a(mb8Var, lb3Var);
        }
        if (bVar != null) {
            return new z16.d(bVar);
        }
        mh2.q(mb8Var, "job");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, z16.d dVar) {
        z16.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("job");
        c26 c26Var = c26.a;
        ha.g gVar = ha.a;
        z16.b bVar = dVar2.a;
        if (hc8Var instanceof ub9) {
            ub9 ub9Var = (ub9) hc8Var;
            ub9Var.j();
            c26Var.b(hc8Var, lb3Var, bVar);
            ub9Var.t();
            return;
        }
        ub9 ub9Var2 = new ub9();
        ub9Var2.j();
        c26Var.b(ub9Var2, lb3Var, bVar);
        ub9Var2.t();
        Object objH = ub9Var2.h();
        objH.getClass();
        f.a(hc8Var, objH);
    }
}
