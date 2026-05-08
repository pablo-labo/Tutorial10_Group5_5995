package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.ocg;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qcg implements ga<ocg.a> {
    public static final qcg a = new qcg();
    public static final List<String> b = u63.Z("updateJobSeekerProfileResumeLicenses");

    @Override // defpackage.ga
    public final ocg.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        ocg.c cVar = null;
        while (mb8Var.D1(b) == 0) {
            scg scgVar = scg.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(scgVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            cVar = (ocg.c) objA;
        }
        return new ocg.a(cVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ocg.a aVar) {
        ocg.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("updateJobSeekerProfileResumeLicenses");
        scg scgVar = scg.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(scgVar, false);
        ocg.c cVar = aVar2.a;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
    }
}
