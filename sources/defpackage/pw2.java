package defpackage;

import defpackage.ha;
import defpackage.hva;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pw2 implements ga<ow2> {
    public static final pw2 a = new pw2();

    @Override // defpackage.ga
    public final ow2 a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ow2 ow2Var) {
        ow2 ow2Var2 = ow2Var;
        hc8Var.getClass();
        lb3Var.getClass();
        ow2Var2.getClass();
        hva<Boolean> hvaVar = ow2Var2.c;
        hva<List<Date>> hvaVar2 = ow2Var2.b;
        hva<Boolean> hvaVar3 = ow2Var2.a;
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("enabled");
            ha.a(ha.l).b(hc8Var, lb3Var, (hva.c) hvaVar3);
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("reminderTimes");
            ga gaVarE = lb3Var.e(qg3.a);
            ha.g gVar = ha.a;
            hy8 hy8Var = new hy8(gaVarE);
            V v = ((hva.c) hvaVar2).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                hy8Var.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("suppress");
            ha.a(ha.l).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
    }
}
