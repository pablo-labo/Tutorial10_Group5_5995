package defpackage;

import defpackage.s61;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class u61 implements ga<s61.a> {
    public static final u61 a = new u61();
    public static final List<String> b = u63.Z("__typename");

    @Override // defpackage.ga
    public final s61.a a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        mb8Var.k();
        tg3 tg3VarC = ug3.c(mb8Var, lb3Var);
        if (str != null) {
            return new s61.a(str, tg3VarC);
        }
        mh2.q(mb8Var, "__typename");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, s61.a aVar) {
        s61.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("__typename");
        ha.a.b(hc8Var, lb3Var, aVar2.a);
        List<String> list = ug3.a;
        ug3.d(hc8Var, lb3Var, aVar2.b);
    }
}
