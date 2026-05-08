package defpackage;

import defpackage.ccg;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ecg implements ga<ccg.a> {
    public static final ecg a = new ecg();
    public static final List<String> b = u63.Z("updateJobSeekerProfileResumeEducations");

    @Override // defpackage.ga
    public final ccg.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        ccg.c cVar = null;
        while (mb8Var.D1(b) == 0) {
            gcg gcgVar = gcg.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(gcgVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            cVar = (ccg.c) objA;
        }
        return new ccg.a(cVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ccg.a aVar) {
        ccg.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("updateJobSeekerProfileResumeEducations");
        gcg gcgVar = gcg.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(gcgVar, false);
        ccg.c cVar = aVar2.a;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
    }
}
