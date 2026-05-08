package defpackage;

import defpackage.ha;
import defpackage.lag;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pag implements ga<lag.c> {
    public static final pag a = new pag();
    public static final List<String> b = u63.Z("minimumPay");

    @Override // defpackage.ga
    public final lag.c a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        lag.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            oag oagVar = oag.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(oagVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            bVar = (lag.b) objA;
        }
        return new lag.c(bVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, lag.c cVar) {
        lag.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("minimumPay");
        oag oagVar = oag.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(oagVar, false);
        lag.b bVar = cVar2.a;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
    }
}
