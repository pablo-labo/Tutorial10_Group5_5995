package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.s36;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class x36 implements ga<s36.d> {
    public static final x36 a = new x36();
    public static final List<String> b = u63.a0("employmentEligibility", "id");

    @Override // defpackage.ga
    public final s36.d a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        o18 o18Var = null;
        String str = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                ha.g gVar = ha.a;
                p18 p18Var = p18.a;
                if (mb8Var.peek() == mb8.a.Y) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = p18Var.a(mb8Var, lb3Var);
                }
                o18Var = (o18) objA;
            } else {
                if (iD1 != 1) {
                    break;
                }
                str = (String) ha.a.a(mb8Var, lb3Var);
            }
        }
        if (str != null) {
            return new s36.d(o18Var, str);
        }
        mh2.q(mb8Var, "id");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, s36.d dVar) {
        s36.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("employmentEligibility");
        ha.g gVar = ha.a;
        p18 p18Var = p18.a;
        o18 o18Var = dVar2.a;
        if (o18Var == null) {
            hc8Var.H1();
        } else {
            p18Var.b(hc8Var, lb3Var, o18Var);
        }
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, dVar2.b);
    }
}
