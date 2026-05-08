package defpackage;

import defpackage.e46;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w46 implements ga<e46.q> {
    public static final w46 a = new w46();
    public static final List<String> b = u63.Z("__typename");

    @Override // defpackage.ga
    public final e46.q a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        mb8Var.k();
        j2h j2hVarC = m2h.c(mb8Var, lb3Var);
        if (str != null) {
            return new e46.q(str, j2hVarC);
        }
        mh2.q(mb8Var, "__typename");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, e46.q qVar) {
        e46.q qVar2 = qVar;
        hc8Var.getClass();
        lb3Var.getClass();
        qVar2.getClass();
        hc8Var.u0("__typename");
        ha.a.b(hc8Var, lb3Var, qVar2.a);
        List<String> list = m2h.a;
        m2h.d(hc8Var, lb3Var, qVar2.b);
    }
}
