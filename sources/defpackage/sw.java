package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.ow;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class sw implements ga<ow.c> {
    public static final sw a = new sw();
    public static final List<String> b = u63.Z("addJobSeekerProfileStructuredDataPreferenceAttributes");

    @Override // defpackage.ga
    public final ow.c a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        ow.a aVar = null;
        while (mb8Var.D1(b) == 0) {
            qw qwVar = qw.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(qwVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            aVar = (ow.a) objA;
        }
        return new ow.c(aVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ow.c cVar) {
        ow.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("addJobSeekerProfileStructuredDataPreferenceAttributes");
        qw qwVar = qw.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(qwVar, false);
        ow.a aVar = cVar2.a;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
    }
}
