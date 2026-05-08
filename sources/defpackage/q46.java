package defpackage;

import defpackage.e46;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class q46 implements ga<e46.k> {
    public static final q46 a = new q46();
    public static final List<String> b = u63.Z("__typename");

    @Override // defpackage.ga
    public final e46.k a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        mb8Var.k();
        it9 it9VarC = kt9.c(mb8Var, lb3Var);
        if (str != null) {
            return new e46.k(str, it9VarC);
        }
        mh2.q(mb8Var, "__typename");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, e46.k kVar) {
        e46.k kVar2 = kVar;
        hc8Var.getClass();
        lb3Var.getClass();
        kVar2.getClass();
        hc8Var.u0("__typename");
        ha.a.b(hc8Var, lb3Var, kVar2.a);
        List<String> list = kt9.a;
        kt9.d(hc8Var, lb3Var, kVar2.b);
    }
}
