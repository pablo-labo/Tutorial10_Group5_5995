package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class icg implements ga<hcg> {
    public static final icg a = new icg();

    @Override // defpackage.ga
    public final hcg a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, hcg hcgVar) {
        hcg hcgVar2 = hcgVar;
        hc8Var.getClass();
        lb3Var.getClass();
        hcgVar2.getClass();
        hva<List<k18>> hvaVar = hcgVar2.c;
        hc8Var.u0("resumeId");
        ha.a.b(hc8Var, lb3Var, hcgVar2.a);
        hc8Var.u0("educations");
        List<x9g> list = hcgVar2.b;
        list.getClass();
        hc8Var.m();
        for (Object obj : list) {
            hc8Var.j();
            y9g.a.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("customFields");
            hy8 hy8Var = new hy8(new ena(yo.d, false));
            Object obj2 = ((hva.c) hvaVar).a;
            if (obj2 == null) {
                hc8Var.H1();
            } else {
                hy8Var.b(hc8Var, lb3Var, obj2);
            }
        }
    }
}
