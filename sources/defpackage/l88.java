package defpackage;

import defpackage.j88;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l88 implements ga<j88.a> {
    public static final l88 a = new l88();
    public static final List<String> b = u63.Z("__typename");

    @Override // defpackage.ga
    public final j88.a a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        mb8Var.k();
        mob mobVarC = pob.c(mb8Var, lb3Var);
        if (str != null) {
            return new j88.a(str, mobVarC);
        }
        mh2.q(mb8Var, "__typename");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, j88.a aVar) {
        j88.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("__typename");
        ha.a.b(hc8Var, lb3Var, aVar2.a);
        List<String> list = pob.a;
        pob.d(hc8Var, lb3Var, aVar2.b);
    }
}
