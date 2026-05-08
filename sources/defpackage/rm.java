package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.om;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class rm implements ga<om.b> {
    public static final rm a = new rm();
    public static final List<String> b = u63.Z("addJobSeekerProfileResumeFile");

    @Override // defpackage.ga
    public final om.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        om.a aVar = null;
        while (mb8Var.D1(b) == 0) {
            qm qmVar = qm.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(qmVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            aVar = (om.a) objA;
        }
        return new om.b(aVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, om.b bVar) {
        om.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("addJobSeekerProfileResumeFile");
        qm qmVar = qm.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(qmVar, false);
        om.a aVar = bVar2.a;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
    }
}
