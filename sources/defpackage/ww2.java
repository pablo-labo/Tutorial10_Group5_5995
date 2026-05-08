package defpackage;

import defpackage.ha;
import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ww2 implements ga<vw2> {
    public static final ww2 a = new ww2();

    @Override // defpackage.ga
    public final vw2 a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, vw2 vw2Var) {
        vw2 vw2Var2 = vw2Var;
        hc8Var.getClass();
        lb3Var.getClass();
        vw2Var2.getClass();
        hva<String> hvaVar = vw2Var2.f;
        hva<List<ey2>> hvaVar2 = vw2Var2.e;
        hva<List<String>> hvaVar3 = vw2Var2.d;
        hva<List<String>> hvaVar4 = vw2Var2.c;
        hva<List<py2>> hvaVar5 = vw2Var2.b;
        hva<List<av2>> hvaVar6 = vw2Var2.a;
        if (hvaVar6 instanceof hva.c) {
            hc8Var.u0("contexts");
            ha.g gVar = ha.a;
            hy8 hy8Var = new hy8(dv2.a);
            V v = ((hva.c) hvaVar6).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                hy8Var.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar5 instanceof hva.c) {
            hc8Var.u0("scope");
            ip ipVar = ip.d;
            ha.g gVar2 = ha.a;
            hy8 hy8Var2 = new hy8(new ena(ipVar, false));
            V v2 = ((hva.c) hvaVar5).a;
            if (v2 == 0) {
                hc8Var.H1();
            } else {
                hy8Var2.b(hc8Var, lb3Var, v2);
            }
        }
        if (hvaVar4 instanceof hva.c) {
            hc8Var.u0("includedLabels");
            hy8 hy8Var3 = new hy8(ha.a);
            V v3 = ((hva.c) hvaVar4).a;
            if (v3 == 0) {
                hc8Var.H1();
            } else {
                hy8Var3.b(hc8Var, lb3Var, v3);
            }
        }
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("excludedLabels");
            hy8 hy8Var4 = new hy8(ha.a);
            V v4 = ((hva.c) hvaVar3).a;
            if (v4 == 0) {
                hc8Var.H1();
            } else {
                hy8Var4.b(hc8Var, lb3Var, v4);
            }
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("metadata");
            hn hnVar = hn.c;
            ha.g gVar3 = ha.a;
            hy8 hy8Var5 = new hy8(new ena(hnVar, false));
            V v5 = ((hva.c) hvaVar2).a;
            if (v5 == 0) {
                hc8Var.H1();
            } else {
                hy8Var5.b(hc8Var, lb3Var, v5);
            }
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("employerJobId");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
    }
}
