package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.tdg;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vdg implements ga<tdg.a> {
    public static final vdg a = new vdg();
    public static final List<String> b = u63.Z("updateJobSeekerProfileResumePublications");

    @Override // defpackage.ga
    public final tdg.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        tdg.c cVar = null;
        while (mb8Var.D1(b) == 0) {
            xdg xdgVar = xdg.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(xdgVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            cVar = (tdg.c) objA;
        }
        return new tdg.a(cVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, tdg.a aVar) {
        tdg.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("updateJobSeekerProfileResumePublications");
        xdg xdgVar = xdg.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(xdgVar, false);
        tdg.c cVar = aVar2.a;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
    }
}
