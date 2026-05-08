package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.nfg;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pfg implements ga<nfg.a> {
    public static final pfg a = new pfg();
    public static final List<String> b = u63.Z("updateJobSeekerProfileResumeLanguages");

    @Override // defpackage.ga
    public final nfg.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        nfg.c cVar = null;
        while (mb8Var.D1(b) == 0) {
            rfg rfgVar = rfg.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(rfgVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            cVar = (nfg.c) objA;
        }
        return new nfg.a(cVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, nfg.a aVar) {
        nfg.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("updateJobSeekerProfileResumeLanguages");
        rfg rfgVar = rfg.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(rfgVar, false);
        nfg.c cVar = aVar2.a;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
    }
}
