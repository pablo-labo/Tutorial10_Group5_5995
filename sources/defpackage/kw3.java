package defpackage;

import defpackage.ha;
import defpackage.iw3;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class kw3 implements ga<iw3.a> {
    public static final kw3 a = new kw3();
    public static final List<String> b = u63.Z("deleteJobSeekerProfileResumePatents");

    @Override // defpackage.ga
    public final iw3.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        iw3.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            lw3 lw3Var = lw3.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(lw3Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            bVar = (iw3.b) objA;
        }
        return new iw3.a(bVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, iw3.a aVar) {
        iw3.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("deleteJobSeekerProfileResumePatents");
        lw3 lw3Var = lw3.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(lw3Var, false);
        iw3.b bVar = aVar2.a;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
    }
}
