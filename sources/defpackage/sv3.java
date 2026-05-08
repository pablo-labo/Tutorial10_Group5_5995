package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.qv3;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class sv3 implements ga<qv3.a> {
    public static final sv3 a = new sv3();
    public static final List<String> b = u63.Z("deleteJobSeekerProfileResumeLicenses");

    @Override // defpackage.ga
    public final qv3.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        qv3.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            tv3 tv3Var = tv3.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(tv3Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            bVar = (qv3.b) objA;
        }
        return new qv3.a(bVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, qv3.a aVar) {
        qv3.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("deleteJobSeekerProfileResumeLicenses");
        tv3 tv3Var = tv3.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(tv3Var, false);
        qv3.b bVar = aVar2.a;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
    }
}
