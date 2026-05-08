package defpackage;

import defpackage.r6c;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class s6c implements ga<r6c.a> {
    public static final s6c a = new s6c();
    public static final List<String> b = u63.Z("__typename");

    @Override // defpackage.ga
    public final r6c.a a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        mb8Var.k();
        tg3 tg3VarC = ug3.c(mb8Var, lb3Var);
        if (str != null) {
            return new r6c.a(str, tg3VarC);
        }
        mh2.q(mb8Var, "__typename");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, r6c.a aVar) {
        r6c.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("__typename");
        ha.a.b(hc8Var, lb3Var, aVar2.a);
        List<String> list = ug3.a;
        ug3.d(hc8Var, lb3Var, aVar2.b);
    }
}
