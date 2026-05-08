package defpackage;

import defpackage.an;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class dn implements ga<an.b> {
    public static final dn a = new dn();
    public static final List<String> b = u63.Z("addJobSeekerProfileResumeLanguages");

    @Override // defpackage.ga
    public final an.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        an.a aVar = null;
        while (mb8Var.D1(b) == 0) {
            cn cnVar = cn.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(cnVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            aVar = (an.a) objA;
        }
        return new an.b(aVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, an.b bVar) {
        an.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("addJobSeekerProfileResumeLanguages");
        cn cnVar = cn.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(cnVar, false);
        an.a aVar = bVar2.a;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
    }
}
