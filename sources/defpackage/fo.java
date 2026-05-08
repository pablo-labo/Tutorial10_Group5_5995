package defpackage;

import defpackage.bo;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fo implements ga<bo.b> {
    public static final fo a = new fo();
    public static final List<String> b = u63.Z("addJobSeekerProfileResumeMilitary");

    @Override // defpackage.ga
    public final bo.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        bo.a aVar = null;
        while (mb8Var.D1(b) == 0) {
            eo eoVar = eo.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(eoVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            aVar = (bo.a) objA;
        }
        return new bo.b(aVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, bo.b bVar) {
        bo.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("addJobSeekerProfileResumeMilitary");
        eo eoVar = eo.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(eoVar, false);
        bo.a aVar = bVar2.a;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
    }
}
