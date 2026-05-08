package defpackage;

import defpackage.z16;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c26 implements ga<z16.b> {
    public static final c26 a = new c26();
    public static final List<String> b = u63.Z("__typename");

    @Override // defpackage.ga
    public final z16.b a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        mb8Var.k();
        rx7 rx7VarC = yx7.c(mb8Var, lb3Var);
        if (str != null) {
            return new z16.b(str, rx7VarC);
        }
        mh2.q(mb8Var, "__typename");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, z16.b bVar) {
        z16.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("__typename");
        ha.a.b(hc8Var, lb3Var, bVar2.a);
        List<String> list = yx7.a;
        yx7.d(hc8Var, lb3Var, bVar2.b);
    }
}
