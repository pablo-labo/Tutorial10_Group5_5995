package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.ww3;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yw3 implements ga<ww3.a> {
    public static final yw3 a = new yw3();
    public static final List<String> b = u63.Z("deleteJobSeekerProfileResumeSkills");

    @Override // defpackage.ga
    public final ww3.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        ww3.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            zw3 zw3Var = zw3.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(zw3Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            bVar = (ww3.b) objA;
        }
        return new ww3.a(bVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ww3.a aVar) {
        ww3.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("deleteJobSeekerProfileResumeSkills");
        zw3 zw3Var = zw3.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(zw3Var, false);
        ww3.b bVar = aVar2.a;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
    }
}
