package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.vcg;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xcg implements ga<vcg.a> {
    public static final xcg a = new xcg();
    public static final List<String> b = u63.Z("updateJobSeekerProfileResumeLinks");

    @Override // defpackage.ga
    public final vcg.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        vcg.c cVar = null;
        while (mb8Var.D1(b) == 0) {
            zcg zcgVar = zcg.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(zcgVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            cVar = (vcg.c) objA;
        }
        return new vcg.a(cVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, vcg.a aVar) {
        vcg.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("updateJobSeekerProfileResumeLinks");
        zcg zcgVar = zcg.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(zcgVar, false);
        vcg.c cVar = aVar2.a;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
    }
}
