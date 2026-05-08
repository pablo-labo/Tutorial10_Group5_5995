package defpackage;

import defpackage.ha;
import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class iag implements ga<hag> {
    public static final iag a = new iag();

    @Override // defpackage.ga
    public final hag a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, hag hagVar) {
        hag hagVar2 = hagVar;
        hc8Var.getClass();
        lb3Var.getClass();
        hagVar2.getClass();
        hva<String> hvaVar = hagVar2.g;
        hva<k38> hvaVar2 = hagVar2.f;
        hva<xeg> hvaVar3 = hagVar2.e;
        hva<p38> hvaVar4 = hagVar2.d;
        hva<List<String>> hvaVar5 = hagVar2.c;
        hc8Var.u0("id");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, hagVar2.a);
        hva<a18> hvaVar6 = hagVar2.b;
        if (hvaVar6 instanceof hva.c) {
            hc8Var.u0("dateRange");
            ena enaVar = new ena(b18.a, false);
            V v = ((hva.c) hvaVar6).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                enaVar.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar5 instanceof hva.c) {
            hc8Var.u0("endorsements");
            hy8 hy8Var = new hy8(gVar);
            V v2 = ((hva.c) hvaVar5).a;
            if (v2 == 0) {
                hc8Var.H1();
            } else {
                hy8Var.b(hc8Var, lb3Var, v2);
            }
        }
        if (hvaVar4 instanceof hva.c) {
            hc8Var.u0("location");
            ena enaVar2 = new ena(q38.a, false);
            V v3 = ((hva.c) hvaVar4).a;
            if (v3 == 0) {
                hc8Var.H1();
            } else {
                enaVar2.b(hc8Var, lb3Var, v3);
            }
        }
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("taxonomyConceptTitle");
            ena enaVar3 = new ena(yeg.a, false);
            V v4 = ((hva.c) hvaVar3).a;
            if (v4 == 0) {
                hc8Var.H1();
            } else {
                enaVar3.b(hc8Var, lb3Var, v4);
            }
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("type");
            l38 l38Var = l38.a;
            V v5 = ((hva.c) hvaVar2).a;
            if (v5 == 0) {
                hc8Var.H1();
            } else {
                l38Var.b(hc8Var, lb3Var, v5);
            }
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("title");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
    }
}
