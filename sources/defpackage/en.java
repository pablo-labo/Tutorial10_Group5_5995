package defpackage;

import defpackage.an;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class en implements ga<an.c> {
    public static final en a = new en();
    public static final List<String> b = u63.Z("__typename");

    @Override // defpackage.ga
    public final an.c a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        mb8Var.k();
        w8d w8dVarC = x8d.c(mb8Var, lb3Var);
        if (str != null) {
            return new an.c(str, w8dVarC);
        }
        mh2.q(mb8Var, "__typename");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, an.c cVar) {
        an.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("__typename");
        ha.a.b(hc8Var, lb3Var, cVar2.a);
        List<String> list = x8d.a;
        x8d.d(hc8Var, lb3Var, cVar2.b);
    }
}
