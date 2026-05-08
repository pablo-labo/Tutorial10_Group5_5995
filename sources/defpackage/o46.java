package defpackage;

import defpackage.e46;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class o46 implements ga<e46.i> {
    public static final o46 a = new o46();
    public static final List<String> b = u63.Z("__typename");

    @Override // defpackage.ga
    public final e46.i a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        mb8Var.k();
        cv8 cv8VarC = ev8.c(mb8Var, lb3Var);
        if (str != null) {
            return new e46.i(str, cv8VarC);
        }
        mh2.q(mb8Var, "__typename");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, e46.i iVar) {
        e46.i iVar2 = iVar;
        hc8Var.getClass();
        lb3Var.getClass();
        iVar2.getClass();
        hc8Var.u0("__typename");
        ha.a.b(hc8Var, lb3Var, iVar2.a);
        List<String> list = ev8.a;
        ev8.d(hc8Var, lb3Var, iVar2.b);
    }
}
