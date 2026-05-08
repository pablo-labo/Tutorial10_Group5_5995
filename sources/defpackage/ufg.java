package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.sfg;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ufg implements ga<sfg.a> {
    public static final ufg a = new ufg();
    public static final List<String> b = u63.Z("updateJobSeekerProfileResume");

    @Override // defpackage.ga
    public final sfg.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        sfg.e eVar = null;
        while (mb8Var.D1(b) == 0) {
            yfg yfgVar = yfg.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(yfgVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            eVar = (sfg.e) objA;
        }
        return new sfg.a(eVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, sfg.a aVar) {
        sfg.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("updateJobSeekerProfileResume");
        yfg yfgVar = yfg.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(yfgVar, false);
        sfg.e eVar = aVar2.a;
        if (eVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, eVar);
        }
    }
}
