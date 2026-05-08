package defpackage;

import defpackage.ha;
import defpackage.hva;

/* JADX INFO: loaded from: classes2.dex */
public final class u7d implements ga<t7d> {
    public static final u7d a = new u7d();

    @Override // defpackage.ga
    public final t7d a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, t7d t7dVar) {
        t7d t7dVar2 = t7dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        t7dVar2.getClass();
        hva<String> hvaVar = t7dVar2.f;
        hva<String> hvaVar2 = t7dVar2.e;
        hva<String> hvaVar3 = t7dVar2.d;
        hva<String> hvaVar4 = t7dVar2.c;
        hva<String> hvaVar5 = t7dVar2.b;
        hva<String> hvaVar6 = t7dVar2.a;
        if (hvaVar6 instanceof hva.c) {
            hc8Var.u0("jobSeekerEmail");
            ga gaVarE = lb3Var.e(cq4.a);
            ha.g gVar = ha.a;
            if (gaVarE instanceof nma) {
                r6.g("The adapter is already nullable");
                return;
            }
            V v = ((hva.c) hvaVar6).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                gaVarE.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar5 instanceof hva.c) {
            hc8Var.u0("advertiserEmail");
            ga gaVarE2 = lb3Var.e(cq4.a);
            ha.g gVar2 = ha.a;
            if (gaVarE2 instanceof nma) {
                r6.g("The adapter is already nullable");
                return;
            }
            V v2 = ((hva.c) hvaVar5).a;
            if (v2 == 0) {
                hc8Var.H1();
            } else {
                gaVarE2.b(hc8Var, lb3Var, v2);
            }
        }
        if (hvaVar4 instanceof hva.c) {
            hc8Var.u0("advertiserKey");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar4);
        }
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("employerAccountKey");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar3);
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("jobSeekerAccountKey");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar2);
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("contactTrackingKey");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
    }
}
