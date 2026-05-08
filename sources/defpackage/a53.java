package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a53 implements ga<z43> {
    public static final a53 a = new a53();

    @Override // defpackage.ga
    public final z43 a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, z43 z43Var) {
        z43 z43Var2 = z43Var;
        hc8Var.getClass();
        lb3Var.getClass();
        z43Var2.getClass();
        hva<List<s85>> hvaVar = z43Var2.d;
        hva<Boolean> hvaVar2 = z43Var2.c;
        hc8Var.u0("resumeId");
        ha.a.b(hc8Var, lb3Var, z43Var2.a);
        hva<String> hvaVar3 = z43Var2.b;
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("emailOverride");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar3);
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("showLocationDetails");
            ha.a(ha.l).b(hc8Var, lb3Var, (hva.c) hvaVar2);
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("allFidelityContext");
            hy8 hy8Var = new hy8(new ena(gu3.c, false));
            V v = ((hva.c) hvaVar).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                hy8Var.b(hc8Var, lb3Var, v);
            }
        }
    }
}
