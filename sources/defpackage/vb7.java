package defpackage;

import defpackage.qb7;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vb7 implements ga<qb7.d> {
    public static final vb7 a = new vb7();
    public static final List<String> b = u63.Z("key");

    @Override // defpackage.ga
    public final qb7.d a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        if (str != null) {
            return new qb7.d(str);
        }
        mh2.q(mb8Var, "key");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, qb7.d dVar) {
        qb7.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("key");
        ha.a.b(hc8Var, lb3Var, dVar2.a);
    }
}
