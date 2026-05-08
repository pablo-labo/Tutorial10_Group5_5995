package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.zo;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cp implements ga<zo.b> {
    public static final cp a = new cp();
    public static final List<String> b = u63.Z("addJobSeekerProfileResumeSkills");

    @Override // defpackage.ga
    public final zo.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        zo.a aVar = null;
        while (mb8Var.D1(b) == 0) {
            bp bpVar = bp.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(bpVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            aVar = (zo.a) objA;
        }
        return new zo.b(aVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, zo.b bVar) {
        zo.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("addJobSeekerProfileResumeSkills");
        bp bpVar = bp.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(bpVar, false);
        zo.a aVar = bVar2.a;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
    }
}
