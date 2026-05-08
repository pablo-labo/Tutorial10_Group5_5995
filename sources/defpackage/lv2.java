package defpackage;

import defpackage.jv2;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lv2 implements ga<jv2.a> {
    public static final lv2 a = new lv2();
    public static final List<String> b = u63.Z("__typename");

    @Override // defpackage.ga
    public final jv2.a a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        mb8Var.k();
        rx7 rx7VarC = yx7.c(mb8Var, lb3Var);
        if (str != null) {
            return new jv2.a(str, rx7VarC);
        }
        mh2.q(mb8Var, "__typename");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, jv2.a aVar) {
        jv2.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("__typename");
        ha.a.b(hc8Var, lb3Var, aVar2.a);
        List<String> list = yx7.a;
        yx7.d(hc8Var, lb3Var, aVar2.b);
    }
}
