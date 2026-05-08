package defpackage;

import defpackage.bq;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fq implements ga<bq.c> {
    public static final fq a = new fq();
    public static final List<String> b = u63.a0("amount", "amountExists", "currency", "salaryType");

    @Override // defpackage.ga
    public final bq.c a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        Double dA = null;
        Boolean boolA = null;
        String strA = null;
        f68 f68Var = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                dA = ha.j.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                boolA = ha.l.a(mb8Var, lb3Var);
            } else if (iD1 == 2) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 3) {
                    return new bq.c(f68Var, boolA, dA, strA);
                }
                ha.g gVar = ha.a;
                g68 g68Var = g68.a;
                if (mb8Var.peek() == mb8.a.Y) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = g68Var.a(mb8Var, lb3Var);
                }
                f68Var = (f68) objA;
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, bq.c cVar) {
        bq.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("amount");
        ha.j.b(hc8Var, lb3Var, cVar2.a);
        hc8Var.u0("amountExists");
        ha.l.b(hc8Var, lb3Var, cVar2.b);
        hc8Var.u0("currency");
        ha.i.b(hc8Var, lb3Var, cVar2.c);
        hc8Var.u0("salaryType");
        g68 g68Var = g68.a;
        f68 f68Var = cVar2.d;
        if (f68Var == null) {
            hc8Var.H1();
        } else {
            g68Var.b(hc8Var, lb3Var, f68Var);
        }
    }
}
