package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.sfg;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vfg implements ga<sfg.b> {
    public static final vfg a = new vfg();
    public static final List<String> b = u63.a0("id", "employmentEligibility");

    @Override // defpackage.ga
    public final sfg.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        o18 o18Var = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                str = (String) ha.a.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 1) {
                    break;
                }
                ha.g gVar = ha.a;
                p18 p18Var = p18.a;
                if (mb8Var.peek() == mb8.a.Y) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = p18Var.a(mb8Var, lb3Var);
                }
                o18Var = (o18) objA;
            }
        }
        if (str != null) {
            return new sfg.b(o18Var, str);
        }
        mh2.q(mb8Var, "id");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, sfg.b bVar) {
        sfg.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, bVar2.a);
        hc8Var.u0("employmentEligibility");
        p18 p18Var = p18.a;
        o18 o18Var = bVar2.b;
        if (o18Var == null) {
            hc8Var.H1();
        } else {
            p18Var.b(hc8Var, lb3Var, o18Var);
        }
    }
}
