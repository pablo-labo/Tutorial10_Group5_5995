package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.sl;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wl implements ga<sl.c> {
    public static final wl a = new wl();
    public static final List<String> b = u63.Z("addJobSeekerProfileResumeAwards");

    @Override // defpackage.ga
    public final sl.c a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        sl.a aVar = null;
        while (mb8Var.D1(b) == 0) {
            ul ulVar = ul.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(ulVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            aVar = (sl.a) objA;
        }
        return new sl.c(aVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, sl.c cVar) {
        sl.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("addJobSeekerProfileResumeAwards");
        ul ulVar = ul.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(ulVar, false);
        sl.a aVar = cVar2.a;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
    }
}
