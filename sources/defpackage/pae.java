package defpackage;

import defpackage.ha;
import defpackage.lae;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pae implements ga<lae.c> {
    public static final pae a = new pae();
    public static final List<String> b = u63.Z("setOnlineStatusPreference");

    @Override // defpackage.ga
    public final lae.c a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        lae.d dVar = null;
        while (mb8Var.D1(b) == 0) {
            qae qaeVar = qae.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(qaeVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            dVar = (lae.d) objA;
        }
        return new lae.c(dVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, lae.c cVar) {
        lae.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("setOnlineStatusPreference");
        qae qaeVar = qae.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(qaeVar, false);
        lae.d dVar = cVar2.a;
        if (dVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, dVar);
        }
    }
}
