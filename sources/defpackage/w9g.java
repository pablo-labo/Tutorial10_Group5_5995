package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class w9g implements ga<v9g> {
    public static final w9g a = new w9g();

    @Override // defpackage.ga
    public final v9g a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, v9g v9gVar) {
        v9g v9gVar2 = v9gVar;
        hc8Var.getClass();
        lb3Var.getClass();
        v9gVar2.getClass();
        hva<String> hvaVar = v9gVar2.j;
        hva<xeg> hvaVar2 = v9gVar2.i;
        hva<zeg> hvaVar3 = v9gVar2.h;
        hva<zeg> hvaVar4 = v9gVar2.g;
        hva<zeg> hvaVar5 = v9gVar2.f;
        hva<xeg> hvaVar6 = v9gVar2.e;
        hva<xeg> hvaVar7 = v9gVar2.d;
        hva<String> hvaVar8 = v9gVar2.c;
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, v9gVar2.a);
        hva<String> hvaVar9 = v9gVar2.b;
        if (hvaVar9 instanceof hva.c) {
            hc8Var.u0("degreeName");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar9);
        }
        if (hvaVar8 instanceof hva.c) {
            hc8Var.u0("field");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar8);
        }
        boolean z = hvaVar7 instanceof hva.c;
        yeg yegVar = yeg.a;
        if (z) {
            hc8Var.u0("taxonomyConceptDegree");
            ena enaVar = new ena(yegVar, false);
            V v = ((hva.c) hvaVar7).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                enaVar.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar6 instanceof hva.c) {
            hc8Var.u0("taxonomyConceptField");
            ena enaVar2 = new ena(yegVar, false);
            V v2 = ((hva.c) hvaVar6).a;
            if (v2 == 0) {
                hc8Var.H1();
            } else {
                enaVar2.b(hc8Var, lb3Var, v2);
            }
        }
        boolean z2 = hvaVar5 instanceof hva.c;
        afg afgVar = afg.a;
        if (z2) {
            hc8Var.u0("board");
            ena enaVar3 = new ena(afgVar, false);
            V v3 = ((hva.c) hvaVar5).a;
            if (v3 == 0) {
                hc8Var.H1();
            } else {
                enaVar3.b(hc8Var, lb3Var, v3);
            }
        }
        if (hvaVar4 instanceof hva.c) {
            hc8Var.u0("mediumOfEducation");
            ena enaVar4 = new ena(afgVar, false);
            V v4 = ((hva.c) hvaVar4).a;
            if (v4 == 0) {
                hc8Var.H1();
            } else {
                enaVar4.b(hc8Var, lb3Var, v4);
            }
        }
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("courseName");
            ena enaVar5 = new ena(afgVar, false);
            V v5 = ((hva.c) hvaVar3).a;
            if (v5 == 0) {
                hc8Var.H1();
            } else {
                enaVar5.b(hc8Var, lb3Var, v5);
            }
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("courseType");
            ena enaVar6 = new ena(yegVar, false);
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
