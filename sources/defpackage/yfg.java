package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.sfg;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yfg implements ga<sfg.e> {
    public static final yfg a = new yfg();
    public static final List<String> b = u63.Z("resume");

    @Override // defpackage.ga
    public final sfg.e a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        sfg.d dVar = null;
        while (mb8Var.D1(b) == 0) {
            xfg xfgVar = xfg.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(xfgVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            dVar = (sfg.d) objA;
        }
        return new sfg.e(dVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, sfg.e eVar) {
        sfg.e eVar2 = eVar;
        hc8Var.getClass();
        lb3Var.getClass();
        eVar2.getClass();
        hc8Var.u0("resume");
        xfg xfgVar = xfg.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(xfgVar, false);
        sfg.d dVar = eVar2.a;
        if (dVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, dVar);
        }
    }
}
