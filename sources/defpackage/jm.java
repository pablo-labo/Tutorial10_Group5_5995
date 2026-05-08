package defpackage;

import defpackage.gm;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jm implements ga<gm.b> {
    public static final jm a = new jm();
    public static final List<String> b = u63.Z("addJobSeekerProfileResumeEducations");

    @Override // defpackage.ga
    public final gm.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        gm.a aVar = null;
        while (mb8Var.D1(b) == 0) {
            im imVar = im.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(imVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            aVar = (gm.a) objA;
        }
        return new gm.b(aVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, gm.b bVar) {
        gm.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("addJobSeekerProfileResumeEducations");
        im imVar = im.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(imVar, false);
        gm.a aVar = bVar2.a;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
    }
}
