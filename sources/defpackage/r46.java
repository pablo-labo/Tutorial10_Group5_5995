package defpackage;

import defpackage.e46;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r46 implements ga<e46.l> {
    public static final r46 a = new r46();
    public static final List<String> b = u63.Z("__typename");

    @Override // defpackage.ga
    public final e46.l a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        mb8Var.k();
        q5b q5bVarC = s5b.c(mb8Var, lb3Var);
        if (str != null) {
            return new e46.l(str, q5bVarC);
        }
        mh2.q(mb8Var, "__typename");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, e46.l lVar) {
        e46.l lVar2 = lVar;
        hc8Var.getClass();
        lb3Var.getClass();
        lVar2.getClass();
        hc8Var.u0("__typename");
        ha.a.b(hc8Var, lb3Var, lVar2.a);
        List<String> list = s5b.a;
        s5b.d(hc8Var, lb3Var, lVar2.b);
    }
}
