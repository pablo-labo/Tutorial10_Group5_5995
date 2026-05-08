package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class ik implements ga<hk> {
    public static final ik a = new ik();

    @Override // defpackage.ga
    public final hk a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, hk hkVar) {
        hk hkVar2 = hkVar;
        hc8Var.getClass();
        lb3Var.getClass();
        hkVar2.getClass();
        hva<String> hvaVar = hkVar2.i;
        hva<iq> hvaVar2 = hkVar2.h;
        hva<kq> hvaVar3 = hkVar2.g;
        hva<kq> hvaVar4 = hkVar2.f;
        hva<kq> hvaVar5 = hkVar2.e;
        hva<iq> hvaVar6 = hkVar2.d;
        hva<iq> hvaVar7 = hkVar2.c;
        hc8Var.u0("degreeName");
        ha.a.b(hc8Var, lb3Var, hkVar2.a);
        hva<String> hvaVar8 = hkVar2.b;
        if (hvaVar8 instanceof hva.c) {
            hc8Var.u0("field");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar8);
        }
        boolean z = hvaVar7 instanceof hva.c;
        jq jqVar = jq.a;
        if (z) {
            hc8Var.u0("taxonomyConceptDegree");
            ena enaVar = new ena(jqVar, false);
            V v = ((hva.c) hvaVar7).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                enaVar.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar6 instanceof hva.c) {
            hc8Var.u0("taxonomyConceptField");
            ena enaVar2 = new ena(jqVar, false);
            V v2 = ((hva.c) hvaVar6).a;
            if (v2 == 0) {
                hc8Var.H1();
            } else {
                enaVar2.b(hc8Var, lb3Var, v2);
            }
        }
        boolean z2 = hvaVar5 instanceof hva.c;
        lq lqVar = lq.a;
        if (z2) {
            hc8Var.u0("board");
            ena enaVar3 = new ena(lqVar, false);
            V v3 = ((hva.c) hvaVar5).a;
            if (v3 == 0) {
                hc8Var.H1();
            } else {
                enaVar3.b(hc8Var, lb3Var, v3);
            }
        }
        if (hvaVar4 instanceof hva.c) {
            hc8Var.u0("mediumOfEducation");
            ena enaVar4 = new ena(lqVar, false);
            V v4 = ((hva.c) hvaVar4).a;
            if (v4 == 0) {
                hc8Var.H1();
            } else {
                enaVar4.b(hc8Var, lb3Var, v4);
            }
        }
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("courseName");
            ena enaVar5 = new ena(lqVar, false);
            V v5 = ((hva.c) hvaVar3).a;
            if (v5 == 0) {
                hc8Var.H1();
            } else {
                enaVar5.b(hc8Var, lb3Var, v5);
            }
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("courseType");
            ena enaVar6 = new ena(jqVar, false);
            V v6 = ((hva.c) hvaVar2).a;
            if (v6 == 0) {
                hc8Var.H1();
            } else {
                enaVar6.b(hc8Var, lb3Var, v6);
            }
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("courseScore");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
    }
}
