package defpackage;

import defpackage.e46;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g46 implements ga<e46.a> {
    public static final g46 a = new g46();
    public static final List<String> b = u63.Z("__typename");

    @Override // defpackage.ga
    public final e46.a a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        mb8Var.k();
        mu0 mu0VarC = nu0.c(mb8Var, lb3Var);
        if (str != null) {
            return new e46.a(str, mu0VarC);
        }
        mh2.q(mb8Var, "__typename");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, e46.a aVar) {
        e46.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("__typename");
        ha.a.b(hc8Var, lb3Var, aVar2.a);
        List<String> list = nu0.a;
        nu0.d(hc8Var, lb3Var, aVar2.b);
    }
}
