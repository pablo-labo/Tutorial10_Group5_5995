package defpackage;

import com.datadog.android.rum.internal.RumFeature;
import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cfg implements ga<bfg> {
    public static final cfg a = new cfg();

    @Override // defpackage.ga
    public final bfg a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, bfg bfgVar) {
        bfg bfgVar2 = bfgVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bfgVar2.getClass();
        hva<xeg> hvaVar = bfgVar2.n;
        hva<xeg> hvaVar2 = bfgVar2.m;
        hva<List<v38>> hvaVar3 = bfgVar2.l;
        hva<List<w38>> hvaVar4 = bfgVar2.k;
        hva<List<t68>> hvaVar5 = bfgVar2.j;
        hva<a18> hvaVar6 = bfgVar2.i;
        hva<p38> hvaVar7 = bfgVar2.h;
        hva<t9g> hvaVar8 = bfgVar2.g;
        hva<Object> hvaVar9 = bfgVar2.f;
        hva<String> hvaVar10 = bfgVar2.e;
        hva<String> hvaVar11 = bfgVar2.d;
        hva<String> hvaVar12 = bfgVar2.c;
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, bfgVar2.a);
        hva<String> hvaVar13 = bfgVar2.b;
        if (hvaVar13 instanceof hva.c) {
            hc8Var.u0("title");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar13);
        }
        if (hvaVar12 instanceof hva.c) {
            hc8Var.u0("description");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar12);
        }
        if (hvaVar11 instanceof hva.c) {
            hc8Var.u0("commonSkills");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar11);
        }
        if (hvaVar10 instanceof hva.c) {
            hc8Var.u0("company");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar10);
        }
        if (hvaVar9 instanceof hva.c) {
            hc8Var.u0("companyFccid");
            ha.a(ha.m).b(hc8Var, lb3Var, (hva.c) hvaVar9);
        }
        if (hvaVar8 instanceof hva.c) {
            hc8Var.u0("companySector");
            ena enaVar = new ena(u9g.a, false);
            V v = ((hva.c) hvaVar8).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                enaVar.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar7 instanceof hva.c) {
            hc8Var.u0("location");
            ena enaVar2 = new ena(q38.a, false);
            V v2 = ((hva.c) hvaVar7).a;
            if (v2 == 0) {
                hc8Var.H1();
            } else {
                enaVar2.b(hc8Var, lb3Var, v2);
            }
        }
        if (hvaVar6 instanceof hva.c) {
            hc8Var.u0("dateRange");
            ena enaVar3 = new ena(b18.a, false);
            V v3 = ((hva.c) hvaVar6).a;
            if (v3 == 0) {
                hc8Var.H1();
            } else {
                enaVar3.b(hc8Var, lb3Var, v3);
            }
        }
        if (hvaVar5 instanceof hva.c) {
            hc8Var.u0("customFields");
            hy8 hy8Var = new hy8(new ena(u68.a, false));
            V v4 = ((hva.c) hvaVar5).a;
            if (v4 == 0) {
                hc8Var.H1();
            } else {
                hy8Var.b(hc8Var, lb3Var, v4);
            }
        }
        if (hvaVar4 instanceof hva.c) {
            hc8Var.u0("occupations");
            hy8 hy8Var2 = new hy8(new ena(x38.a, false));
            V v5 = ((hva.c) hvaVar4).a;
            if (v5 == 0) {
                hc8Var.H1();
            } else {
                hy8Var2.b(hc8Var, lb3Var, v5);
            }
        }
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0(RumFeature.EVENT_ATTRIBUTES_PROPERTY);
            hy8 hy8Var3 = new hy8(new ena(ip.e, false));
            V v6 = ((hva.c) hvaVar3).a;
            if (v6 == 0) {
                hc8Var.H1();
            } else {
                hy8Var3.b(hc8Var, lb3Var, v6);
            }
        }
        boolean z = hvaVar2 instanceof hva.c;
        yeg yegVar = yeg.a;
        if (z) {
            hc8Var.u0("jobType");
            ena enaVar4 = new ena(yegVar, false);
            V v7 = ((hva.c) hvaVar2).a;
            if (v7 == 0) {
                hc8Var.H1();
            } else {
                enaVar4.b(hc8Var, lb3Var, v7);
            }
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("noticePeriod");
            ena enaVar5 = new ena(yegVar, false);
            V v8 = ((hva.c) hvaVar).a;
            if (v8 == 0) {
                hc8Var.H1();
            } else {
                enaVar5.b(hc8Var, lb3Var, v8);
            }
        }
    }
}
