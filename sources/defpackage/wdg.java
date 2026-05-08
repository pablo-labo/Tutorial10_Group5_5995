package defpackage;

import defpackage.tdg;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wdg implements ga<tdg.b> {
    public static final wdg a = new wdg();
    public static final List<String> b = u63.Z("__typename");

    @Override // defpackage.ga
    public final tdg.b a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        mb8Var.k();
        r6c r6cVarC = t6c.c(mb8Var, lb3Var);
        if (str != null) {
            return new tdg.b(str, r6cVarC);
        }
        mh2.q(mb8Var, "__typename");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, tdg.b bVar) {
        tdg.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("__typename");
        ha.a.b(hc8Var, lb3Var, bVar2.a);
        List<String> list = t6c.a;
        t6c.d(hc8Var, lb3Var, bVar2.b);
    }
}
