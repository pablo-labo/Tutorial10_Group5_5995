package defpackage;

import defpackage.bq;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class dq implements ga<bq.a> {
    public static final dq a = new dq();
    public static final List<String> b = u63.Z("preference");

    @Override // defpackage.ga
    public final bq.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        bq.d dVar = null;
        while (mb8Var.D1(b) == 0) {
            gq gqVar = gq.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(gqVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            dVar = (bq.d) objA;
        }
        return new bq.a(dVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, bq.a aVar) {
        bq.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("preference");
        gq gqVar = gq.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(gqVar, false);
        bq.d dVar = aVar2.a;
        if (dVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, dVar);
        }
    }
}
