package defpackage;

import defpackage.ha;
import defpackage.j88;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class n88 implements ga<j88.c> {
    public static final n88 a = new n88();
    public static final List<String> b = u63.Z("jobseekerMobileAppInit");

    @Override // defpackage.ga
    public final j88.c a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        j88.e eVar = null;
        while (mb8Var.D1(b) == 0) {
            p88 p88Var = p88.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(p88Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            eVar = (j88.e) objA;
        }
        return new j88.c(eVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, j88.c cVar) {
        j88.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("jobseekerMobileAppInit");
        p88 p88Var = p88.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(p88Var, false);
        j88.e eVar = cVar2.a;
        if (eVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, eVar);
        }
    }
}
