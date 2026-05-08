package defpackage;

import com.datadog.android.rum.internal.RumFeature;
import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class nq implements ga<mq> {
    public static final nq a = new nq();

    @Override // defpackage.ga
    public final mq a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, mq mqVar) {
        mq mqVar2 = mqVar;
        hc8Var.getClass();
        lb3Var.getClass();
        mqVar2.getClass();
        hva<iq> hvaVar = mqVar2.m;
        hva<iq> hvaVar2 = mqVar2.l;
        hva<List<v38>> hvaVar3 = mqVar2.k;
        hva<List<w38>> hvaVar4 = mqVar2.j;
        hva<List<t68>> hvaVar5 = mqVar2.i;
        hva<a18> hvaVar6 = mqVar2.h;
        hva<p38> hvaVar7 = mqVar2.g;
        hva<fk> hvaVar8 = mqVar2.f;
        hva<Object> hvaVar9 = mqVar2.e;
        hva<String> hvaVar10 = mqVar2.d;
        hva<String> hvaVar11 = mqVar2.c;
        hc8Var.u0("title");
        ha.a.b(hc8Var, lb3Var, mqVar2.a);
        hva<String> hvaVar12 = mqVar2.b;
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
            ena enaVar = new ena(gk.a, false);
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
        jq jqVar = jq.a;
        if (z) {
            hc8Var.u0("jobType");
            ena enaVar4 = new ena(jqVar, false);
            V v7 = ((hva.c) hvaVar2).a;
            if (v7 == 0) {
                hc8Var.H1();
            } else {
                enaVar4.b(hc8Var, lb3Var, v7);
            }
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("noticePeriod");
            ena enaVar5 = new ena(jqVar, false);
            V v8 = ((hva.c) hvaVar).a;
            if (v8 == 0) {
                hc8Var.H1();
            } else {
                enaVar5.b(hc8Var, lb3Var, v8);
            }
        }
    }
}
