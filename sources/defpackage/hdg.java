package defpackage;

import defpackage.fdg;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hdg implements ga<fdg.a> {
    public static final hdg a = new hdg();
    public static final List<String> b = u63.Z("updateJobSeekerProfileResumeMilitary");

    @Override // defpackage.ga
    public final fdg.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        fdg.c cVar = null;
        while (mb8Var.D1(b) == 0) {
            jdg jdgVar = jdg.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(jdgVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            cVar = (fdg.c) objA;
        }
        return new fdg.a(cVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, fdg.a aVar) {
        fdg.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("updateJobSeekerProfileResumeMilitary");
        jdg jdgVar = jdg.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(jdgVar, false);
        fdg.c cVar = aVar2.a;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
    }
}
