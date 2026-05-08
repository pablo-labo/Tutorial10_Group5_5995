package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.z9g;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bag implements ga<z9g.a> {
    public static final bag a = new bag();
    public static final List<String> b = u63.Z("updateJobSeekerProfileStructuredDataPreference");

    @Override // defpackage.ga
    public final z9g.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        z9g.d dVar = null;
        while (mb8Var.D1(b) == 0) {
            eag eagVar = eag.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(eagVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            dVar = (z9g.d) objA;
        }
        return new z9g.a(dVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, z9g.a aVar) {
        z9g.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("updateJobSeekerProfileStructuredDataPreference");
        eag eagVar = eag.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(eagVar, false);
        z9g.d dVar = aVar2.a;
        if (dVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, dVar);
        }
    }
}
