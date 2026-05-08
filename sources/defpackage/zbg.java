package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.wbg;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zbg implements ga<wbg.b> {
    public static final zbg a = new zbg();
    public static final List<String> b = u63.Z("updateJobSeekerProfileResumeCertifications");

    @Override // defpackage.ga
    public final wbg.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        wbg.c cVar = null;
        while (mb8Var.D1(b) == 0) {
            acg acgVar = acg.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(acgVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            cVar = (wbg.c) objA;
        }
        return new wbg.b(cVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, wbg.b bVar) {
        wbg.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("updateJobSeekerProfileResumeCertifications");
        acg acgVar = acg.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(acgVar, false);
        wbg.c cVar = bVar2.a;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
    }
}
