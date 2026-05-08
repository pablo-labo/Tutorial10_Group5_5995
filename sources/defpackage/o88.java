package defpackage;

import defpackage.j88;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class o88 implements ga<j88.d> {
    public static final o88 a = new o88();
    public static final List<String> b = u63.Z("__typename");

    @Override // defpackage.ga
    public final j88.d a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        mb8Var.k();
        mob mobVarC = pob.c(mb8Var, lb3Var);
        if (str != null) {
            return new j88.d(str, mobVarC);
        }
        mh2.q(mb8Var, "__typename");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, j88.d dVar) {
        j88.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("__typename");
        ha.a.b(hc8Var, lb3Var, dVar2.a);
        List<String> list = pob.a;
        pob.d(hc8Var, lb3Var, dVar2.b);
    }
}
