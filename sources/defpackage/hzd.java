package defpackage;

import defpackage.ha;
import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hzd implements ga<gzd> {
    public static final hzd a = new hzd();

    @Override // defpackage.ga
    public final gzd a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, gzd gzdVar) {
        gzd gzdVar2 = gzdVar;
        hc8Var.getClass();
        lb3Var.getClass();
        gzdVar2.getClass();
        hva<List<String>> hvaVar = gzdVar2.g;
        hva<List<String>> hvaVar2 = gzdVar2.f;
        hva<List<String>> hvaVar3 = gzdVar2.e;
        hva<List<tyd>> hvaVar4 = gzdVar2.d;
        hva<List<String>> hvaVar5 = gzdVar2.b;
        hva<List<bzd>> hvaVar6 = gzdVar2.a;
        if (hvaVar6 instanceof hva.c) {
            hc8Var.u0("searchContext");
            ha.g gVar = ha.a;
            hy8 hy8Var = new hy8(new ena(czd.a, false));
            Object obj = ((hva.c) hvaVar6).a;
            if (obj == null) {
                hc8Var.H1();
            } else {
                hy8Var.b(hc8Var, lb3Var, obj);
            }
        }
        if (hvaVar5 instanceof hva.c) {
            hc8Var.u0("occupations");
            hy8 hy8Var2 = new hy8(ha.a);
            Object obj2 = ((hva.c) hvaVar5).a;
            if (obj2 == null) {
                hc8Var.H1();
            } else {
                hy8Var2.b(hc8Var, lb3Var, obj2);
            }
        }
        hc8Var.u0("market");
        gu3 gu3Var = gu3.d;
        ha.g gVar2 = ha.a;
        yyd yydVar = gzdVar2.c;
        hc8Var.j();
        gu3Var.b(hc8Var, lb3Var, yydVar);
        hc8Var.t();
        if (hvaVar4 instanceof hva.c) {
            hc8Var.u0("jobDetails");
            hy8 hy8Var3 = new hy8(new ena(uyd.a, false));
            Object obj3 = ((hva.c) hvaVar4).a;
            if (obj3 == null) {
                hc8Var.H1();
            } else {
                hy8Var3.b(hc8Var, lb3Var, obj3);
            }
        }
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("workAreas");
            hy8 hy8Var4 = new hy8(ha.a);
            Object obj4 = ((hva.c) hvaVar3).a;
            if (obj4 == null) {
                hc8Var.H1();
            } else {
                hy8Var4.b(hc8Var, lb3Var, obj4);
            }
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("administrativeDivisions");
            hy8 hy8Var5 = new hy8(ha.a);
            Object obj5 = ((hva.c) hvaVar2).a;
            if (obj5 == null) {
                hc8Var.H1();
            } else {
                hy8Var5.b(hc8Var, lb3Var, obj5);
            }
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("canonicalTitles");
            hy8 hy8Var6 = new hy8(ha.a);
            Object obj6 = ((hva.c) hvaVar).a;
            if (obj6 == null) {
                hc8Var.H1();
            } else {
                hy8Var6.b(hc8Var, lb3Var, obj6);
            }
        }
    }
}
