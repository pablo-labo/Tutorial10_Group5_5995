package defpackage;

import defpackage.e46;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t46 implements ga<e46.n> {
    public static final t46 a = new t46();
    public static final List<String> b = u63.Z("__typename");

    @Override // defpackage.ga
    public final e46.n a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        mb8Var.k();
        r6c r6cVarC = t6c.c(mb8Var, lb3Var);
        if (str != null) {
            return new e46.n(str, r6cVarC);
        }
        mh2.q(mb8Var, "__typename");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, e46.n nVar) {
        e46.n nVar2 = nVar;
        hc8Var.getClass();
        lb3Var.getClass();
        nVar2.getClass();
        hc8Var.u0("__typename");
        ha.a.b(hc8Var, lb3Var, nVar2.a);
        List<String> list = t6c.a;
        t6c.d(hc8Var, lb3Var, nVar2.b);
    }
}
