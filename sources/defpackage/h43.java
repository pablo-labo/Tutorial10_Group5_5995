package defpackage;

import defpackage.ha;
import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class h43 implements ga<f43> {
    public static final h43 a = new h43();

    @Override // defpackage.ga
    public final f43 a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, f43 f43Var) {
        f43 f43Var2 = f43Var;
        hc8Var.getClass();
        lb3Var.getClass();
        f43Var2.getClass();
        hva<Object> hvaVar = f43Var2.r;
        hva<String> hvaVar2 = f43Var2.q;
        hva<fe2> hvaVar3 = f43Var2.p;
        hva<xe2> hvaVar4 = f43Var2.o;
        hva<Object> hvaVar5 = f43Var2.n;
        hva<String> hvaVar6 = f43Var2.m;
        hva<String> hvaVar7 = f43Var2.l;
        hva<String> hvaVar8 = f43Var2.k;
        hva<String> hvaVar9 = f43Var2.j;
        hva<te2> hvaVar10 = f43Var2.i;
        hva<hf2> hvaVar11 = f43Var2.h;
        hva<lf2> hvaVar12 = f43Var2.g;
        hva<String> hvaVar13 = f43Var2.f;
        hva<String> hvaVar14 = f43Var2.e;
        hva<Boolean> hvaVar15 = f43Var2.c;
        hc8Var.u0("applyDomain");
        oe2 oe2Var = f43Var2.a;
        oe2Var.getClass();
        hc8Var.T0(oe2Var.a());
        hva<String> hvaVar16 = f43Var2.b;
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
        gVar.b(hc8Var, lb3Var, f43Var2.d);
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
            ena enaVar = new ena(nf2.a, false);
            V v = ((hva.c) hvaVar12).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                enaVar.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar11 instanceof hva.c) {
            hc8Var.u0("standardFields");
            ena enaVar2 = new ena(jf2.a, false);
            V v2 = ((hva.c) hvaVar11).a;
            if (v2 == 0) {
                hc8Var.H1();
            } else {
                enaVar2.b(hc8Var, lb3Var, v2);
            }
        }
        if (hvaVar10 instanceof hva.c) {
            hc8Var.u0("jobIntegration");
            ena enaVar3 = new ena(ve2.a, false);
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
            ha.a(ha.m).b(hc8Var, lb3Var, (hva.c) hvaVar5);
        }
        if (hvaVar4 instanceof hva.c) {
            hc8Var.u0("screenerQuestions");
            ena enaVar4 = new ena(ze2.a, false);
            V v4 = ((hva.c) hvaVar4).a;
            if (v4 == 0) {
                hc8Var.H1();
            } else {
                enaVar4.b(hc8Var, lb3Var, v4);
            }
        }
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("indeedApplyInterviewMeta");
            ena enaVar5 = new ena(he2.a, false);
            V v5 = ((hva.c) hvaVar3).a;
            if (v5 == 0) {
                hc8Var.H1();
            } else {
                enaVar5.b(hc8Var, lb3Var, v5);
            }
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("from");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar2);
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("href");
            ha.a(ha.m).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
        hc8Var.u0("apiToken");
        gVar.b(hc8Var, lb3Var, f43Var2.s);
    }
}
