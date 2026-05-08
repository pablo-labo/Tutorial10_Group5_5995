package defpackage;

import defpackage.bq;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gq implements ga<bq.d> {
    public static final gq a = new gq();
    public static final List<String> b = u63.a0("id", "minimumPay");

    @Override // defpackage.ga
    public final bq.d a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        bq.c cVar = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 1) {
                    return new bq.d(strA, cVar);
                }
                fq fqVar = fq.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(fqVar, false);
                if (mb8Var.peek() == mb8.a.Y) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = enaVar.a(mb8Var, lb3Var);
                }
                cVar = (bq.c) objA;
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, bq.d dVar) {
        bq.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("id");
        ha.i.b(hc8Var, lb3Var, dVar2.a);
        hc8Var.u0("minimumPay");
        ena enaVar = new ena(fq.a, false);
        bq.c cVar = dVar2.b;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
    }
}
