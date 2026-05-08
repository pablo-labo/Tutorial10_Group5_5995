package defpackage;

import defpackage.cv8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class dv8 implements ga<cv8.a> {
    public static final dv8 a = new dv8();
    public static final List<String> b = u63.Z("__typename");

    @Override // defpackage.ga
    public final cv8.a a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        mb8Var.k();
        ig3 ig3VarC = jg3.c(mb8Var, lb3Var);
        if (str != null) {
            return new cv8.a(str, ig3VarC);
        }
        mh2.q(mb8Var, "__typename");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, cv8.a aVar) {
        cv8.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("__typename");
        ha.a.b(hc8Var, lb3Var, aVar2.a);
        List<String> list = jg3.a;
        jg3.d(hc8Var, lb3Var, aVar2.b);
    }
}
