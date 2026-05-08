package defpackage;

import defpackage.ha;
import defpackage.hva;

/* JADX INFO: loaded from: classes2.dex */
public final class kf2 implements ga<if2> {
    public static final kf2 a = new kf2();

    @Override // defpackage.ga
    public final if2 a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, if2 if2Var) {
        if2 if2Var2 = if2Var;
        hc8Var.getClass();
        lb3Var.getClass();
        if2Var2.getClass();
        hva<ef2> hvaVar = if2Var2.e;
        hva<pe2> hvaVar2 = if2Var2.d;
        hva<pe2> hvaVar3 = if2Var2.c;
        hva<pe2> hvaVar4 = if2Var2.b;
        hva<cf2> hvaVar5 = if2Var2.a;
        if (hvaVar5 instanceof hva.c) {
            hc8Var.u0("name");
            rl rlVar = rl.c;
            ha.g gVar = ha.a;
            ena enaVar = new ena(rlVar, false);
            V v = ((hva.c) hvaVar5).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                enaVar.b(hc8Var, lb3Var, v);
            }
        }
        boolean z = hvaVar4 instanceof hva.c;
        se2 se2Var = se2.a;
        if (z) {
            hc8Var.u0("resume");
            ha.g gVar2 = ha.a;
            V v2 = ((hva.c) hvaVar4).a;
            if (v2 == 0) {
                hc8Var.H1();
            } else {
                se2Var.b(hc8Var, lb3Var, v2);
            }
        }
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("coverLetter");
            ha.g gVar3 = ha.a;
            V v3 = ((hva.c) hvaVar3).a;
            if (v3 == 0) {
                hc8Var.H1();
            } else {
                se2Var.b(hc8Var, lb3Var, v3);
            }
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("phone");
            ha.g gVar4 = ha.a;
            V v4 = ((hva.c) hvaVar2).a;
            if (v4 == 0) {
                hc8Var.H1();
            } else {
                se2Var.b(hc8Var, lb3Var, v4);
            }
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("resumeFields");
            ha.g gVar5 = ha.a;
            ena enaVar2 = new ena(gf2.a, false);
            V v5 = ((hva.c) hvaVar).a;
            if (v5 == 0) {
                hc8Var.H1();
            } else {
                enaVar2.b(hc8Var, lb3Var, v5);
            }
        }
    }
}
