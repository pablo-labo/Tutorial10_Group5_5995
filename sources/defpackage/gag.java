package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class gag implements ga<fag> {
    public static final gag a = new gag();

    @Override // defpackage.ga
    public final fag a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, fag fagVar) {
        fag fagVar2 = fagVar;
        hc8Var.getClass();
        lb3Var.getClass();
        fagVar2.getClass();
        hva<zeg> hvaVar = fagVar2.c;
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, fagVar2.a);
        hva.c cVar = fagVar2.b;
        hc8Var.u0("taxonomyConceptLanguage");
        afg afgVar = afg.a;
        ena enaVar = new ena(afgVar, false);
        V v = cVar.a;
        if (v == 0) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, v);
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("taxonomyConceptProficiency");
            ena enaVar2 = new ena(afgVar, false);
            V v2 = ((hva.c) hvaVar).a;
            if (v2 == 0) {
                hc8Var.H1();
            } else {
                enaVar2.b(hc8Var, lb3Var, v2);
            }
        }
    }
}
