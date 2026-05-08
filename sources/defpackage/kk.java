package defpackage;

import defpackage.ha;
import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class kk implements ga<jk> {
    public static final kk a = new kk();

    @Override // defpackage.ga
    public final jk a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, jk jkVar) {
        jk jkVar2 = jkVar;
        hc8Var.getClass();
        lb3Var.getClass();
        jkVar2.getClass();
        hva<List<k18>> hvaVar = jkVar2.f;
        hva<String> hvaVar2 = jkVar2.e;
        hva<String> hvaVar3 = jkVar2.d;
        hva<p38> hvaVar4 = jkVar2.c;
        hva<a18> hvaVar5 = jkVar2.a;
        if (hvaVar5 instanceof hva.c) {
            hc8Var.u0("dateRange");
            ha.g gVar = ha.a;
            ena enaVar = new ena(b18.a, false);
            V v = ((hva.c) hvaVar5).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                enaVar.b(hc8Var, lb3Var, v);
            }
        }
        hc8Var.u0("degree");
        ha.g gVar2 = ha.a;
        hk hkVar = jkVar2.b;
        hc8Var.j();
        ik.a.b(hc8Var, lb3Var, hkVar);
        hc8Var.t();
        if (hvaVar4 instanceof hva.c) {
            hc8Var.u0("location");
            ena enaVar2 = new ena(q38.a, false);
            V v2 = ((hva.c) hvaVar4).a;
            if (v2 == 0) {
                hc8Var.H1();
            } else {
                enaVar2.b(hc8Var, lb3Var, v2);
            }
        }
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("school");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar3);
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("additionalDetails");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar2);
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("customFields");
            hy8 hy8Var = new hy8(new ena(yo.d, false));
            Object obj = ((hva.c) hvaVar).a;
            if (obj == null) {
                hc8Var.H1();
            } else {
                hy8Var.b(hc8Var, lb3Var, obj);
            }
        }
    }
}
