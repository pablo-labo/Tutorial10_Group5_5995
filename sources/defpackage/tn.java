package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.qn;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tn implements ga<qn.b> {
    public static final tn a = new tn();
    public static final List<String> b = u63.Z("addJobSeekerProfileResumeLinks");

    @Override // defpackage.ga
    public final qn.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        qn.a aVar = null;
        while (mb8Var.D1(b) == 0) {
            sn snVar = sn.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(snVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            aVar = (qn.a) objA;
        }
        return new qn.b(aVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, qn.b bVar) {
        qn.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("addJobSeekerProfileResumeLinks");
        sn snVar = sn.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(snVar, false);
        qn.a aVar = bVar2.a;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
    }
}
