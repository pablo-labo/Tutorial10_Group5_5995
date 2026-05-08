package defpackage;

import defpackage.av3;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cv3 implements ga<av3.a> {
    public static final cv3 a = new cv3();
    public static final List<String> b = u63.Z("deleteJobSeekerProfileResumeEducations");

    @Override // defpackage.ga
    public final av3.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        av3.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            dv3 dv3Var = dv3.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(dv3Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            bVar = (av3.b) objA;
        }
        return new av3.a(bVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, av3.a aVar) {
        av3.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("deleteJobSeekerProfileResumeEducations");
        dv3 dv3Var = dv3.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(dv3Var, false);
        av3.b bVar = aVar2.a;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
    }
}
