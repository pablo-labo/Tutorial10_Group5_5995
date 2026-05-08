package defpackage;

import defpackage.ha;
import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vk implements ga<uk> {
    public static final vk a = new vk();

    @Override // defpackage.ga
    public final uk a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, uk ukVar) {
        uk ukVar2 = ukVar;
        hc8Var.getClass();
        lb3Var.getClass();
        ukVar2.getClass();
        hva<k38> hvaVar = ukVar2.e;
        hva<iq> hvaVar2 = ukVar2.d;
        hva<p38> hvaVar3 = ukVar2.c;
        hva<List<String>> hvaVar4 = ukVar2.b;
        hva<a18> hvaVar5 = ukVar2.a;
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
        if (hvaVar4 instanceof hva.c) {
            hc8Var.u0("endorsements");
            hy8 hy8Var = new hy8(ha.a);
            V v2 = ((hva.c) hvaVar4).a;
            if (v2 == 0) {
                hc8Var.H1();
            } else {
                hy8Var.b(hc8Var, lb3Var, v2);
            }
        }
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("location");
            ha.g gVar2 = ha.a;
            ena enaVar2 = new ena(q38.a, false);
            V v3 = ((hva.c) hvaVar3).a;
            if (v3 == 0) {
                hc8Var.H1();
            } else {
                enaVar2.b(hc8Var, lb3Var, v3);
            }
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("taxonomyConceptTitle");
            ha.g gVar3 = ha.a;
            ena enaVar3 = new ena(jq.a, false);
            V v4 = ((hva.c) hvaVar2).a;
            if (v4 == 0) {
                hc8Var.H1();
            } else {
                enaVar3.b(hc8Var, lb3Var, v4);
            }
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("type");
            ha.g gVar4 = ha.a;
            l38 l38Var = l38.a;
            V v5 = ((hva.c) hvaVar).a;
            if (v5 == 0) {
                hc8Var.H1();
            } else {
                l38Var.b(hc8Var, lb3Var, v5);
            }
        }
        hc8Var.u0("title");
        ha.a.b(hc8Var, lb3Var, ukVar2.f);
    }
}
