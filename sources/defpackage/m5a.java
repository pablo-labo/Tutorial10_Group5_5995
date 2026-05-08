package defpackage;

import defpackage.ha;
import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class m5a implements ga<l5a> {
    public static final m5a a = new m5a();

    @Override // defpackage.ga
    public final l5a a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, l5a l5aVar) {
        l5a l5aVar2 = l5aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        l5aVar2.getClass();
        hva<List<xn7>> hvaVar = l5aVar2.b;
        hva<List<vn7>> hvaVar2 = l5aVar2.a;
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("statuses");
            ha.g gVar = ha.a;
            hy8 hy8Var = new hy8(wn7.a);
            V v = ((hva.c) hvaVar2).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                hy8Var.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("types");
            ha.g gVar2 = ha.a;
            hy8 hy8Var2 = new hy8(yn7.a);
            V v2 = ((hva.c) hvaVar).a;
            if (v2 == 0) {
                hc8Var.H1();
            } else {
                hy8Var2.b(hc8Var, lb3Var, v2);
            }
        }
    }
}
