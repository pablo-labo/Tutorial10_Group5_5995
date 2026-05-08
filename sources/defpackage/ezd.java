package defpackage;

import defpackage.ha;
import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ezd implements ga<dzd> {
    public static final ezd a = new ezd();

    @Override // defpackage.ga
    public final dzd a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, dzd dzdVar) {
        dzd dzdVar2 = dzdVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dzdVar2.getClass();
        hva<zyd> hvaVar = dzdVar2.c;
        hc8Var.u0("segmentTargetingContextInput");
        ha.g gVar = ha.a;
        gzd gzdVar = dzdVar2.a;
        hc8Var.j();
        hzd.a.b(hc8Var, lb3Var, gzdVar);
        hc8Var.t();
        hc8Var.u0("leverExperimentInput");
        List<wyd> list = dzdVar2.b;
        list.getClass();
        hc8Var.m();
        for (Object obj : list) {
            hc8Var.j();
            wyd wydVar = (wyd) obj;
            wydVar.getClass();
            hc8Var.u0("leverId");
            ha.a.b(hc8Var, lb3Var, wydVar.a);
            hc8Var.t();
        }
        hc8Var.l();
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("requestOptions");
            ena enaVar = new ena(azd.a, false);
            V v = ((hva.c) hvaVar).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                enaVar.b(hc8Var, lb3Var, v);
            }
        }
    }
}
