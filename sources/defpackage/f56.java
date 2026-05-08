package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.y46;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f56 implements ga<y46.f> {
    public static final f56 a = new f56();
    public static final List<String> b = u63.a0("id", "amount", "salaryType", "currency", "amountExists");

    @Override // defpackage.ga
    public final y46.f a(mb8 mb8Var, lb3 lb3Var) {
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
                dA = ha.j.a(mb8Var, lb3Var);
            } else if (iD1 == 2) {
                ha.g gVar = ha.a;
                g68 g68Var = g68.a;
                if (mb8Var.peek() == mb8.a.Y) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = g68Var.a(mb8Var, lb3Var);
                }
                f68Var = (f68) objA;
            } else if (iD1 == 3) {
                strA2 = ha.i.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 4) {
                    return new y46.f(f68Var, boolA, dA, strA, strA2);
                }
                boolA = ha.l.a(mb8Var, lb3Var);
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, y46.f fVar) {
        y46.f fVar2 = fVar;
        hc8Var.getClass();
        lb3Var.getClass();
        fVar2.getClass();
        hc8Var.u0("id");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, fVar2.a);
        hc8Var.u0("amount");
        ha.j.b(hc8Var, lb3Var, fVar2.b);
        hc8Var.u0("salaryType");
        g68 g68Var = g68.a;
        f68 f68Var = fVar2.c;
        if (f68Var == null) {
            hc8Var.H1();
        } else {
            g68Var.b(hc8Var, lb3Var, f68Var);
        }
        hc8Var.u0("currency");
        nmaVar.b(hc8Var, lb3Var, fVar2.d);
        hc8Var.u0("amountExists");
        ha.l.b(hc8Var, lb3Var, fVar2.e);
    }
}
