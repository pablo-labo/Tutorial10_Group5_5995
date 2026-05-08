package defpackage;

import defpackage.ha;
import defpackage.lag;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class oag implements ga<lag.b> {
    public static final oag a = new oag();
    public static final List<String> b = u63.a0("id", "salaryType", "currency", "amount", "amountExists");

    @Override // defpackage.ga
    public final lag.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        f68 f68Var = null;
        Boolean boolA = null;
        Double dA = null;
        String strA = null;
        String strA2 = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                ha.g gVar = ha.a;
                g68 g68Var = g68.a;
                if (mb8Var.peek() == mb8.a.Y) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = g68Var.a(mb8Var, lb3Var);
                }
                f68Var = (f68) objA;
            } else if (iD1 == 2) {
                strA2 = ha.i.a(mb8Var, lb3Var);
            } else if (iD1 == 3) {
                dA = ha.j.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 4) {
                    return new lag.b(f68Var, boolA, dA, strA, strA2);
                }
                boolA = ha.l.a(mb8Var, lb3Var);
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, lag.b bVar) {
        lag.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("id");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, bVar2.a);
        hc8Var.u0("salaryType");
        g68 g68Var = g68.a;
        f68 f68Var = bVar2.b;
        if (f68Var == null) {
            hc8Var.H1();
        } else {
            g68Var.b(hc8Var, lb3Var, f68Var);
        }
        hc8Var.u0("currency");
        nmaVar.b(hc8Var, lb3Var, bVar2.c);
        hc8Var.u0("amount");
        ha.j.b(hc8Var, lb3Var, bVar2.d);
        hc8Var.u0("amountExists");
        ha.l.b(hc8Var, lb3Var, bVar2.e);
    }
}
