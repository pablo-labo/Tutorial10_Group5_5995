package defpackage;

import defpackage.ha;
import defpackage.ig3;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lg3 implements ga<ig3.b> {
    public static final lg3 a = new lg3();
    public static final List<String> b = u63.a0("isCurrent", "month", "year");

    @Override // defpackage.ga
    public final ig3.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        Boolean boolA = null;
        s38 s38Var = null;
        Integer numA = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                boolA = ha.l.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                ha.g gVar = ha.a;
                t38 t38Var = t38.a;
                if (mb8Var.peek() == mb8.a.Y) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = t38Var.a(mb8Var, lb3Var);
                }
                s38Var = (s38) objA;
            } else {
                if (iD1 != 2) {
                    return new ig3.b(boolA, s38Var, numA);
                }
                numA = ha.k.a(mb8Var, lb3Var);
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ig3.b bVar) {
        ig3.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("isCurrent");
        ha.l.b(hc8Var, lb3Var, bVar2.a);
        hc8Var.u0("month");
        t38 t38Var = t38.a;
        s38 s38Var = bVar2.b;
        if (s38Var == null) {
            hc8Var.H1();
        } else {
            t38Var.b(hc8Var, lb3Var, s38Var);
        }
        hc8Var.u0("year");
        ha.k.b(hc8Var, lb3Var, bVar2.c);
    }
}
