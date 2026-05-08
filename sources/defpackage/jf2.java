package defpackage;

import defpackage.ha;
import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class jf2 implements ga<hf2> {
    public static final jf2 a = new jf2();

    @Override // defpackage.ga
    public final hf2 a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, hf2 hf2Var) {
        hf2 hf2Var2 = hf2Var;
        hc8Var.getClass();
        lb3Var.getClass();
        hf2Var2.getClass();
        hva<df2> hvaVar = hf2Var2.e;
        hva<qe2> hvaVar2 = hf2Var2.d;
        hva<qe2> hvaVar3 = hf2Var2.c;
        hva<qe2> hvaVar4 = hf2Var2.b;
        hva<bf2> hvaVar5 = hf2Var2.a;
        if (hvaVar5 instanceof hva.c) {
            hc8Var.u0("name");
            jl jlVar = jl.c;
            ha.g gVar = ha.a;
            ena enaVar = new ena(jlVar, false);
            V v = ((hva.c) hvaVar5).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                enaVar.b(hc8Var, lb3Var, v);
            }
        }
        boolean z = hvaVar4 instanceof hva.c;
        re2 re2Var = re2.a;
        if (z) {
            hc8Var.u0("resume");
            ha.g gVar2 = ha.a;
            V v2 = ((hva.c) hvaVar4).a;
            if (v2 == 0) {
                hc8Var.H1();
            } else {
                re2Var.b(hc8Var, lb3Var, v2);
            }
        }
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("coverLetter");
            ha.g gVar3 = ha.a;
            V v3 = ((hva.c) hvaVar3).a;
            if (v3 == 0) {
                hc8Var.H1();
            } else {
                re2Var.b(hc8Var, lb3Var, v3);
            }
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("phone");
            ha.g gVar4 = ha.a;
            V v4 = ((hva.c) hvaVar2).a;
            if (v4 == 0) {
                hc8Var.H1();
            } else {
                re2Var.b(hc8Var, lb3Var, v4);
            }
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("resumeFields");
            ha.g gVar5 = ha.a;
            ena enaVar2 = new ena(ff2.a, false);
            V v5 = ((hva.c) hvaVar).a;
            if (v5 == 0) {
                hc8Var.H1();
            } else {
                enaVar2.b(hc8Var, lb3Var, v5);
            }
        }
    }
}
