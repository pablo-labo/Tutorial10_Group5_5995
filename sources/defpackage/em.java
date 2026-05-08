package defpackage;

import defpackage.am;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class em implements ga<am.c> {
    public static final em a = new em();
    public static final List<String> b = u63.Z("addJobSeekerProfileResumeCertifications");

    @Override // defpackage.ga
    public final am.c a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        am.a aVar = null;
        while (mb8Var.D1(b) == 0) {
            cm cmVar = cm.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(cmVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            aVar = (am.a) objA;
        }
        return new am.c(aVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, am.c cVar) {
        am.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("addJobSeekerProfileResumeCertifications");
        cm cmVar = cm.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(cmVar, false);
        am.a aVar = cVar2.a;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
    }
}
