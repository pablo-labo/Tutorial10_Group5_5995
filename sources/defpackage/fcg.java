package defpackage;

import defpackage.ccg;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fcg implements ga<ccg.b> {
    public static final fcg a = new fcg();
    public static final List<String> b = u63.Z("__typename");

    @Override // defpackage.ga
    public final ccg.b a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        mb8Var.k();
        jo4 jo4VarC = mo4.c(mb8Var, lb3Var);
        if (str != null) {
            return new ccg.b(str, jo4VarC);
        }
        mh2.q(mb8Var, "__typename");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ccg.b bVar) {
        ccg.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("__typename");
        ha.a.b(hc8Var, lb3Var, bVar2.a);
        List<String> list = mo4.a;
        mo4.d(hc8Var, lb3Var, bVar2.b);
    }
}
