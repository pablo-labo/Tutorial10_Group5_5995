package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class teg implements ga<seg> {
    public static final teg a = new teg();

    @Override // defpackage.ga
    public final seg a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, seg segVar) {
        seg segVar2 = segVar;
        hc8Var.getClass();
        lb3Var.getClass();
        segVar2.getClass();
        hva<q68> hvaVar = segVar2.e;
        hva<String> hvaVar2 = segVar2.d;
        hva.c cVar = segVar2.c;
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, segVar2.a);
        hva<Object> hvaVar3 = segVar2.b;
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("experience");
            ha.a(ha.m).b(hc8Var, lb3Var, (hva.c) hvaVar3);
        }
        hc8Var.u0("taxonomyConceptTitle");
        ena enaVar = new ena(yeg.a, false);
        V v = cVar.a;
        if (v == 0) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, v);
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("text");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar2);
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("timeUnit");
            r68 r68Var = r68.a;
            V v2 = ((hva.c) hvaVar).a;
            if (v2 == 0) {
                hc8Var.H1();
            } else {
                r68Var.b(hc8Var, lb3Var, v2);
            }
        }
    }
}
