package defpackage;

import defpackage.wbg;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ybg implements ga<wbg.a> {
    public static final ybg a = new ybg();
    public static final List<String> b = u63.Z("__typename");

    @Override // defpackage.ga
    public final wbg.a a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        mb8Var.k();
        nz1 nz1VarC = oz1.c(mb8Var, lb3Var);
        if (str != null) {
            return new wbg.a(str, nz1VarC);
        }
        mh2.q(mb8Var, "__typename");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, wbg.a aVar) {
        wbg.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("__typename");
        ha.a.b(hc8Var, lb3Var, aVar2.a);
        List<String> list = oz1.a;
        oz1.d(hc8Var, lb3Var, aVar2.b);
    }
}
