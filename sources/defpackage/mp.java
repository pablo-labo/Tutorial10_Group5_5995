package defpackage;

import defpackage.ha;
import defpackage.jp;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mp implements ga<jp.b> {
    public static final mp a = new mp();
    public static final List<String> b = u63.Z("addJobSeekerProfileResumeWorkExperiences");

    @Override // defpackage.ga
    public final jp.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        jp.a aVar = null;
        while (mb8Var.D1(b) == 0) {
            lp lpVar = lp.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(lpVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            aVar = (jp.a) objA;
        }
        return new jp.b(aVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, jp.b bVar) {
        jp.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("addJobSeekerProfileResumeWorkExperiences");
        lp lpVar = lp.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(lpVar, false);
        jp.a aVar = bVar2.a;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
    }
}
