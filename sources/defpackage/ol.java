package defpackage;

import defpackage.ha;
import defpackage.kl;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ol implements ga<kl.c> {
    public static final ol a = new ol();
    public static final List<String> b = u63.Z("addJobSeekerProfileResumeAssociations");

    @Override // defpackage.ga
    public final kl.c a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        kl.a aVar = null;
        while (mb8Var.D1(b) == 0) {
            ml mlVar = ml.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(mlVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            aVar = (kl.a) objA;
        }
        return new kl.c(aVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, kl.c cVar) {
        kl.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("addJobSeekerProfileResumeAssociations");
        ml mlVar = ml.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(mlVar, false);
        kl.a aVar = cVar2.a;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
    }
}
