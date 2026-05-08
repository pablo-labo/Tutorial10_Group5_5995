package defpackage;

import defpackage.ha;
import defpackage.ibg;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lbg implements ga<ibg.b> {
    public static final lbg a = new lbg();
    public static final List<String> b = u63.Z("updateJobSeekerProfileResumeAssociations");

    @Override // defpackage.ga
    public final ibg.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        ibg.c cVar = null;
        while (mb8Var.D1(b) == 0) {
            mbg mbgVar = mbg.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(mbgVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            cVar = (ibg.c) objA;
        }
        return new ibg.b(cVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ibg.b bVar) {
        ibg.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("updateJobSeekerProfileResumeAssociations");
        mbg mbgVar = mbg.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(mbgVar, false);
        ibg.c cVar = bVar2.a;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
    }
}
