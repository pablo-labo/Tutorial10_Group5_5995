package defpackage;

import defpackage.e46;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class v46 implements ga<e46.p> {
    public static final v46 a = new v46();
    public static final List<String> b = u63.Z("__typename");

    @Override // defpackage.ga
    public final e46.p a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        mb8Var.k();
        gje gjeVarC = jje.c(mb8Var, lb3Var);
        if (str != null) {
            return new e46.p(str, gjeVarC);
        }
        mh2.q(mb8Var, "__typename");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, e46.p pVar) {
        e46.p pVar2 = pVar;
        hc8Var.getClass();
        lb3Var.getClass();
        pVar2.getClass();
        hc8Var.u0("__typename");
        ha.a.b(hc8Var, lb3Var, pVar2.a);
        List<String> list = jje.a;
        jje.d(hc8Var, lb3Var, pVar2.b);
    }
}
