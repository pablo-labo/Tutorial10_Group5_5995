package defpackage;

import defpackage.ha;
import defpackage.ldg;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ndg implements ga<ldg.a> {
    public static final ndg a = new ndg();
    public static final List<String> b = u63.Z("updateJobSeekerProfileResumePatents");

    @Override // defpackage.ga
    public final ldg.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        ldg.c cVar = null;
        while (mb8Var.D1(b) == 0) {
            pdg pdgVar = pdg.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(pdgVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            cVar = (ldg.c) objA;
        }
        return new ldg.a(cVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ldg.a aVar) {
        ldg.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("updateJobSeekerProfileResumePatents");
        pdg pdgVar = pdg.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(pdgVar, false);
        ldg.c cVar = aVar2.a;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
    }
}
