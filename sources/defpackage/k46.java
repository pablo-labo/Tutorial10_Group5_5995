package defpackage;

import defpackage.e46;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class k46 implements ga<e46.e> {
    public static final k46 a = new k46();
    public static final List<String> b = u63.Z("__typename");

    @Override // defpackage.ga
    public final e46.e a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        mb8Var.k();
        jo4 jo4VarC = mo4.c(mb8Var, lb3Var);
        if (str != null) {
            return new e46.e(str, jo4VarC);
        }
        mh2.q(mb8Var, "__typename");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, e46.e eVar) {
        e46.e eVar2 = eVar;
        hc8Var.getClass();
        lb3Var.getClass();
        eVar2.getClass();
        hc8Var.u0("__typename");
        ha.a.b(hc8Var, lb3Var, eVar2.a);
        List<String> list = mo4.a;
        mo4.d(hc8Var, lb3Var, eVar2.b);
    }
}
