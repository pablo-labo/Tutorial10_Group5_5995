package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.sd5;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vd5 implements ga<sd5.b> {
    public static final vd5 a = new vd5();
    public static final List<String> b = u63.Z("findRelevantJobs");

    @Override // defpackage.ga
    public final sd5.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        sd5.e eVar = null;
        while (mb8Var.D1(b) == 0) {
            yd5 yd5Var = yd5.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(yd5Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            eVar = (sd5.e) objA;
        }
        return new sd5.b(eVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, sd5.b bVar) {
        sd5.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("findRelevantJobs");
        yd5 yd5Var = yd5.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(yd5Var, false);
        sd5.e eVar = bVar2.a;
        if (eVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, eVar);
        }
    }
}
