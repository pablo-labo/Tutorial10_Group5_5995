package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jx3 implements ga<ix3> {
    public static final jx3 a = new jx3();

    @Override // defpackage.ga
    public final ix3 a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ix3 ix3Var) {
        ix3 ix3Var2 = ix3Var;
        hc8Var.getClass();
        lb3Var.getClass();
        ix3Var2.getClass();
        hva<List<String>> hvaVar = ix3Var2.a;
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("ids");
            hy8 hy8Var = new hy8(ha.a);
            V v = ((hva.c) hvaVar).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                hy8Var.b(hc8Var, lb3Var, v);
            }
        }
    }
}
