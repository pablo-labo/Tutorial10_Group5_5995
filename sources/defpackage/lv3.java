package defpackage;

import defpackage.ha;
import defpackage.jv3;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lv3 implements ga<jv3.a> {
    public static final lv3 a = new lv3();
    public static final List<String> b = u63.Z("deleteJobSeekerProfileResumeLanguages");

    @Override // defpackage.ga
    public final jv3.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        jv3.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            mv3 mv3Var = mv3.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(mv3Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            bVar = (jv3.b) objA;
        }
        return new jv3.a(bVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, jv3.a aVar) {
        jv3.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("deleteJobSeekerProfileResumeLanguages");
        mv3 mv3Var = mv3.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(mv3Var, false);
        jv3.b bVar = aVar2.a;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
    }
}
