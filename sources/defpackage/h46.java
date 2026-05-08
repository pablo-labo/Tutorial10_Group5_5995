package defpackage;

import defpackage.e46;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h46 implements ga<e46.b> {
    public static final h46 a = new h46();
    public static final List<String> b = u63.Z("__typename");

    @Override // defpackage.ga
    public final e46.b a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        mb8Var.k();
        s61 s61VarC = t61.c(mb8Var, lb3Var);
        if (str != null) {
            return new e46.b(str, s61VarC);
        }
        mh2.q(mb8Var, "__typename");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, e46.b bVar) {
        e46.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("__typename");
        ha.a.b(hc8Var, lb3Var, bVar2.a);
        List<String> list = t61.a;
        t61.d(hc8Var, lb3Var, bVar2.b);
    }
}
