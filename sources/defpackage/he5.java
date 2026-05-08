package defpackage;

import defpackage.sd5;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class he5 implements ga<sd5.n> {
    public static final he5 a = new he5();
    public static final List<String> b = u63.Z("value");

    @Override // defpackage.ga
    public final sd5.n a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        Double dA = null;
        while (mb8Var.D1(b) == 0) {
            dA = ha.j.a(mb8Var, lb3Var);
        }
        return new sd5.n(dA);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, sd5.n nVar) {
        sd5.n nVar2 = nVar;
        hc8Var.getClass();
        lb3Var.getClass();
        nVar2.getClass();
        hc8Var.u0("value");
        ha.j.b(hc8Var, lb3Var, nVar2.a);
    }
}
