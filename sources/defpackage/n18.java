package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class n18 implements ga<m18> {
    public static final n18 a = new n18();

    @Override // defpackage.ga
    public final m18 a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, m18 m18Var) {
        m18 m18Var2 = m18Var;
        hc8Var.getClass();
        lb3Var.getClass();
        m18Var2.getClass();
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, m18Var2.a);
        hva<o18> hvaVar = m18Var2.b;
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("employmentEligibility");
            p18 p18Var = p18.a;
            V v = ((hva.c) hvaVar).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                p18Var.b(hc8Var, lb3Var, v);
            }
        }
    }
}
