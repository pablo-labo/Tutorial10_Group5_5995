package defpackage;

import defpackage.ha;
import defpackage.i08;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class n08 implements ga<i08.d> {
    public static final n08 a = new n08();
    public static final List<String> b = u63.Z("jobSeekerPro");

    @Override // defpackage.ga
    public final i08.d a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        i08.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            l08 l08Var = l08.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(l08Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            bVar = (i08.b) objA;
        }
        return new i08.d(bVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, i08.d dVar) {
        i08.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("jobSeekerPro");
        l08 l08Var = l08.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(l08Var, false);
        i08.b bVar = dVar2.a;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
    }
}
