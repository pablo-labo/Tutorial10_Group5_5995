package defpackage;

import defpackage.mu0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ou0 implements ga<mu0.a> {
    public static final ou0 a = new ou0();
    public static final List<String> b = u63.Z("__typename");

    @Override // defpackage.ga
    public final mu0.a a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        mb8Var.k();
        ig3 ig3VarC = jg3.c(mb8Var, lb3Var);
        if (str != null) {
            return new mu0.a(str, ig3VarC);
        }
        mh2.q(mb8Var, "__typename");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, mu0.a aVar) {
        mu0.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("__typename");
        ha.a.b(hc8Var, lb3Var, aVar2.a);
        List<String> list = jg3.a;
        jg3.d(hc8Var, lb3Var, aVar2.b);
    }
}
