package defpackage;

import defpackage.w8d;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class z8d implements ga<w8d.b> {
    public static final z8d a = new z8d();
    public static final List<String> b = u63.Z("__typename");

    @Override // defpackage.ga
    public final w8d.b a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        mb8Var.k();
        gbf gbfVarC = ibf.c(mb8Var, lb3Var);
        if (str != null) {
            return new w8d.b(str, gbfVarC);
        }
        mh2.q(mb8Var, "__typename");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, w8d.b bVar) {
        w8d.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("__typename");
        ha.a.b(hc8Var, lb3Var, bVar2.a);
        List<String> list = ibf.a;
        ibf.d(hc8Var, lb3Var, bVar2.b);
    }
}
