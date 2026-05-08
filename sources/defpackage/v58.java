package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class v58 implements ga<u58> {
    public static final v58 a = new v58();

    @Override // defpackage.ga
    public final u58 a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, u58 u58Var) {
        u58 u58Var2 = u58Var;
        hc8Var.getClass();
        lb3Var.getClass();
        u58Var2.getClass();
        hva<List<String>> hvaVar = u58Var2.a;
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("customClassSuids");
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
