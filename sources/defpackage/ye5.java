package defpackage;

import defpackage.te5;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ye5 implements ga<te5.d> {
    public static final ye5 a = new ye5();
    public static final List<String> b = u63.Z("leverId");

    @Override // defpackage.ga
    public final te5.d a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        if (str != null) {
            return new te5.d(str);
        }
        mh2.q(mb8Var, "leverId");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, te5.d dVar) {
        te5.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("leverId");
        ha.a.b(hc8Var, lb3Var, dVar2.a);
    }
}
