package defpackage;

import defpackage.ro;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vo implements ga<ro.c> {
    public static final vo a = new vo();
    public static final List<String> b = u63.Z("__typename");

    @Override // defpackage.ga
    public final ro.c a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        mb8Var.k();
        r6c r6cVarC = t6c.c(mb8Var, lb3Var);
        if (str != null) {
            return new ro.c(str, r6cVarC);
        }
        mh2.q(mb8Var, "__typename");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ro.c cVar) {
        ro.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("__typename");
        ha.a.b(hc8Var, lb3Var, cVar2.a);
        List<String> list = t6c.a;
        t6c.d(hc8Var, lb3Var, cVar2.b);
    }
}
