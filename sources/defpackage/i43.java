package defpackage;

import defpackage.ha;
import defpackage.hva;

/* JADX INFO: loaded from: classes2.dex */
public final class i43 implements ga<g43> {
    public static final i43 a = new i43();

    @Override // defpackage.ga
    public final g43 a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, g43 g43Var) {
        g43 g43Var2 = g43Var;
        hc8Var.getClass();
        lb3Var.getClass();
        g43Var2.getClass();
        hva<String> hvaVar = g43Var2.r;
        hva<String> hvaVar2 = g43Var2.q;
        hva<ge2> hvaVar3 = g43Var2.p;
        hva<ye2> hvaVar4 = g43Var2.o;
        hva<String> hvaVar5 = g43Var2.n;
        hva<String> hvaVar6 = g43Var2.m;
        hva<String> hvaVar7 = g43Var2.l;
        hva<String> hvaVar8 = g43Var2.k;
        hva<String> hvaVar9 = g43Var2.j;
        hva<ue2> hvaVar10 = g43Var2.i;
        hva<if2> hvaVar11 = g43Var2.h;
        hva<mf2> hvaVar12 = g43Var2.g;
        hva<String> hvaVar13 = g43Var2.f;
        hva<String> hvaVar14 = g43Var2.e;
        hva<Boolean> hvaVar15 = g43Var2.c;
        hc8Var.u0("applyDomain");
        ne2 ne2Var = g43Var2.a;
        ne2Var.getClass();
        hc8Var.T0(ne2Var.a());
        hva<String> hvaVar16 = g43Var2.b;
        if (hvaVar16 instanceof hva.c) {
            hc8Var.u0("source");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar16);
        }
        if (hvaVar15 instanceof hva.c) {
            hc8Var.u0("isSponsored");
            ha.a(ha.l).b(hc8Var, lb3Var, (hva.c) hvaVar15);
        }
        hc8Var.u0("jobTitle");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, g43Var2.d);
        if (hvaVar14 instanceof hva.c) {
            hc8Var.u0("jobCompanyName");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar14);
        }
        if (hvaVar13 instanceof hva.c) {
            hc8Var.u0("advertiserNumber");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar13);
        }
        if (hvaVar12 instanceof hva.c) {
            hc8Var.u0("smartApplyIntegration");
            ena enaVar = new ena(of2.a, false);
            V v = ((hva.c) hvaVar12).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                enaVar.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar11 instanceof hva.c) {
            hc8Var.u0("standardFields");
            ena enaVar2 = new ena(kf2.a, false);
            V v2 = ((hva.c) hvaVar11).a;
            if (v2 == 0) {
                hc8Var.H1();
            } else {
                enaVar2.b(hc8Var, lb3Var, v2);
            }
        }
        if (hvaVar10 instanceof hva.c) {
            hc8Var.u0("jobIntegration");
            ena enaVar3 = new ena(we2.a, false);
            V v3 = ((hva.c) hvaVar10).a;
            if (v3 == 0) {
                hc8Var.H1();
            } else {
                enaVar3.b(hc8Var, lb3Var, v3);
            }
        }
        if (hvaVar9 instanceof hva.c) {
            hc8Var.u0("jobKey");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar9);
        }
        if (hvaVar8 instanceof hva.c) {
            hc8Var.u0("jobId");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar8);
        }
        if (hvaVar7 instanceof hva.c) {
            hc8Var.u0("jobCountry");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar7);
        }
        if (hvaVar6 instanceof hva.c) {
            hc8Var.u0("jobLocation");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar6);
        }
        if (hvaVar5 instanceof hva.c) {
            hc8Var.u0("jobUri");
            ga gaVarE = lb3Var.e(qwg.a);
            if (gaVarE instanceof nma) {
                r6.g("The adapter is already nullable");
                return;
            }
            V v4 = ((hva.c) hvaVar5).a;
            if (v4 == 0) {
                hc8Var.H1();
            } else {
                gaVarE.b(hc8Var, lb3Var, v4);
            }
        }
        if (hvaVar4 instanceof hva.c) {
            hc8Var.u0("screenerQuestions");
            ena enaVar4 = new ena(af2.a, false);
            V v5 = ((hva.c) hvaVar4).a;
            if (v5 == 0) {
                hc8Var.H1();
            } else {
                enaVar4.b(hc8Var, lb3Var, v5);
            }
        }
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("indeedApplyInterviewMeta");
            ena enaVar5 = new ena(ie2.a, false);
            V v6 = ((hva.c) hvaVar3).a;
            if (v6 == 0) {
                hc8Var.H1();
            } else {
                enaVar5.b(hc8Var, lb3Var, v6);
            }
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("from");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar2);
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("href");
            ga gaVarE2 = lb3Var.e(qwg.a);
            if (gaVarE2 instanceof nma) {
                r6.g("The adapter is already nullable");
                return;
            }
            V v7 = ((hva.c) hvaVar).a;
            if (v7 == 0) {
                hc8Var.H1();
            } else {
                gaVarE2.b(hc8Var, lb3Var, v7);
            }
        }
        hc8Var.u0("apiToken");
        gVar.b(hc8Var, lb3Var, g43Var2.s);
    }
}
