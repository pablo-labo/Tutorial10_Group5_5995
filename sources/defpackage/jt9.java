package defpackage;

import defpackage.it9;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jt9 implements ga<it9.a> {
    public static final jt9 a = new jt9();
    public static final List<String> b = u63.Z("__typename");

    @Override // defpackage.ga
    public final it9.a a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        mb8Var.k();
        ig3 ig3VarC = jg3.c(mb8Var, lb3Var);
        if (str != null) {
            return new it9.a(str, ig3VarC);
        }
        mh2.q(mb8Var, "__typename");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, it9.a aVar) {
        it9.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("__typename");
        ha.a.b(hc8Var, lb3Var, aVar2.a);
        List<String> list = jg3.a;
        jg3.d(hc8Var, lb3Var, aVar2.b);
    }
}
