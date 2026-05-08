package defpackage;

import defpackage.au3;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cu3 implements ga<au3.a> {
    public static final cu3 a = new cu3();
    public static final List<String> b = u63.Z("deleteJobSeekerProfileFile");

    @Override // defpackage.ga
    public final au3.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        au3.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            du3 du3Var = du3.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(du3Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            bVar = (au3.b) objA;
        }
        return new au3.a(bVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, au3.a aVar) {
        au3.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("deleteJobSeekerProfileFile");
        du3 du3Var = du3.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(du3Var, false);
        au3.b bVar = aVar2.a;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
    }
}
