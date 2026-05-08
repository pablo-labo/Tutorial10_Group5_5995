package defpackage;

import defpackage.ha;
import defpackage.hva;

/* JADX INFO: loaded from: classes2.dex */
public final class gf2 implements ga<ef2> {
    public static final gf2 a = new gf2();

    @Override // defpackage.ga
    public final ef2 a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ef2 ef2Var) {
        ef2 ef2Var2 = ef2Var;
        hc8Var.getClass();
        lb3Var.getClass();
        ef2Var2.getClass();
        hva<pe2> hvaVar = ef2Var2.j;
        hva<pe2> hvaVar2 = ef2Var2.i;
        hva<pe2> hvaVar3 = ef2Var2.h;
        hva<pe2> hvaVar4 = ef2Var2.g;
        hva<pe2> hvaVar5 = ef2Var2.f;
        hva<pe2> hvaVar6 = ef2Var2.e;
        hva<pe2> hvaVar7 = ef2Var2.d;
        hva<pe2> hvaVar8 = ef2Var2.c;
        hva<pe2> hvaVar9 = ef2Var2.b;
        hva<pe2> hvaVar10 = ef2Var2.a;
        boolean z = hvaVar10 instanceof hva.c;
        se2 se2Var = se2.a;
        if (z) {
            hc8Var.u0("gender");
            ha.g gVar = ha.a;
            V v = ((hva.c) hvaVar10).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                se2Var.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar9 instanceof hva.c) {
            hc8Var.u0("dateOfBirth");
            ha.g gVar2 = ha.a;
            V v2 = ((hva.c) hvaVar9).a;
            if (v2 == 0) {
                hc8Var.H1();
            } else {
                se2Var.b(hc8Var, lb3Var, v2);
            }
        }
        if (hvaVar8 instanceof hva.c) {
            hc8Var.u0("location");
            ha.g gVar3 = ha.a;
            V v3 = ((hva.c) hvaVar8).a;
            if (v3 == 0) {
                hc8Var.H1();
            } else {
                se2Var.b(hc8Var, lb3Var, v3);
            }
        }
        if (hvaVar7 instanceof hva.c) {
            hc8Var.u0("workExperiences");
            ha.g gVar4 = ha.a;
            V v4 = ((hva.c) hvaVar7).a;
            if (v4 == 0) {
                hc8Var.H1();
            } else {
                se2Var.b(hc8Var, lb3Var, v4);
            }
        }
        if (hvaVar6 instanceof hva.c) {
            hc8Var.u0("educations");
            ha.g gVar5 = ha.a;
            V v5 = ((hva.c) hvaVar6).a;
            if (v5 == 0) {
                hc8Var.H1();
            } else {
                se2Var.b(hc8Var, lb3Var, v5);
            }
        }
        if (hvaVar5 instanceof hva.c) {
            hc8Var.u0("skills");
            ha.g gVar6 = ha.a;
            V v6 = ((hva.c) hvaVar5).a;
            if (v6 == 0) {
                hc8Var.H1();
            } else {
                se2Var.b(hc8Var, lb3Var, v6);
            }
        }
        if (hvaVar4 instanceof hva.c) {
            hc8Var.u0("languages");
            ha.g gVar7 = ha.a;
            V v7 = ((hva.c) hvaVar4).a;
            if (v7 == 0) {
                hc8Var.H1();
            } else {
                se2Var.b(hc8Var, lb3Var, v7);
            }
        }
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("certifications");
            ha.g gVar8 = ha.a;
            V v8 = ((hva.c) hvaVar3).a;
            if (v8 == 0) {
                hc8Var.H1();
            } else {
                se2Var.b(hc8Var, lb3Var, v8);
            }
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("namePronunciation");
            ha.g gVar9 = ha.a;
            V v9 = ((hva.c) hvaVar2).a;
            if (v9 == 0) {
                hc8Var.H1();
            } else {
                se2Var.b(hc8Var, lb3Var, v9);
            }
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("phone");
            ha.g gVar10 = ha.a;
            V v10 = ((hva.c) hvaVar).a;
            if (v10 == 0) {
                hc8Var.H1();
            } else {
                se2Var.b(hc8Var, lb3Var, v10);
            }
        }
    }
}
