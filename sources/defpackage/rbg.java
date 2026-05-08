package defpackage;

import defpackage.pbg;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class rbg implements ga<pbg.a> {
    public static final rbg a = new rbg();
    public static final List<String> b = u63.Z("__typename");

    @Override // defpackage.ga
    public final pbg.a a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        mb8Var.k();
        s61 s61VarC = t61.c(mb8Var, lb3Var);
        if (str != null) {
            return new pbg.a(str, s61VarC);
        }
        mh2.q(mb8Var, "__typename");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, pbg.a aVar) {
        pbg.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("__typename");
        ha.a.b(hc8Var, lb3Var, aVar2.a);
        List<String> list = t61.a;
        t61.d(hc8Var, lb3Var, aVar2.b);
    }
}
