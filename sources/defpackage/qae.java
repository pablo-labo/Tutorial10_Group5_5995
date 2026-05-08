package defpackage;

import defpackage.ha;
import defpackage.lae;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class qae implements ga<lae.d> {
    public static final qae a = new qae();
    public static final List<String> b = u63.Z("onlineStatusPreference");

    @Override // defpackage.ga
    public final lae.d a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        lae.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            oae oaeVar = oae.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(oaeVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            bVar = (lae.b) objA;
        }
        return new lae.d(bVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, lae.d dVar) {
        lae.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("onlineStatusPreference");
        oae oaeVar = oae.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(oaeVar, false);
        lae.b bVar = dVar2.a;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
    }
}
