package defpackage;

import defpackage.ha;
import defpackage.ic5;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class kc5 implements ga<ic5.a> {
    public static final kc5 a = new kc5();
    public static final List<String> b = u63.Z("findCategoricalOQVTTaxonomies");

    @Override // defpackage.ga
    public final ic5.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        ic5.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            lc5 lc5Var = lc5.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(lc5Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            bVar = (ic5.b) objA;
        }
        return new ic5.a(bVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ic5.a aVar) {
        ic5.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("findCategoricalOQVTTaxonomies");
        lc5 lc5Var = lc5.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(lc5Var, false);
        ic5.b bVar = aVar2.a;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
    }
}
