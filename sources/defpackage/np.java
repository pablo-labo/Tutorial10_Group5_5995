package defpackage;

import defpackage.jp;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class np implements ga<jp.c> {
    public static final np a = new np();
    public static final List<String> b = u63.Z("__typename");

    @Override // defpackage.ga
    public final jp.c a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        mb8Var.k();
        j2h j2hVarC = m2h.c(mb8Var, lb3Var);
        if (str != null) {
            return new jp.c(str, j2hVarC);
        }
        mh2.q(mb8Var, "__typename");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, jp.c cVar) {
        jp.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("__typename");
        ha.a.b(hc8Var, lb3Var, cVar2.a);
        List<String> list = m2h.a;
        m2h.d(hc8Var, lb3Var, cVar2.b);
    }
}
