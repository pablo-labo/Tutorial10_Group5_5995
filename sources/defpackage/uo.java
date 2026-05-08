package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.ro;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class uo implements ga<ro.b> {
    public static final uo a = new uo();
    public static final List<String> b = u63.Z("addJobSeekerProfileResumePublications");

    @Override // defpackage.ga
    public final ro.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        ro.a aVar = null;
        while (mb8Var.D1(b) == 0) {
            to toVar = to.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(toVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            aVar = (ro.a) objA;
        }
        return new ro.b(aVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ro.b bVar) {
        ro.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("addJobSeekerProfileResumePublications");
        to toVar = to.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(toVar, false);
        ro.a aVar = bVar2.a;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
    }
}
