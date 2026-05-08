package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.pw3;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class rw3 implements ga<pw3.a> {
    public static final rw3 a = new rw3();
    public static final List<String> b = u63.Z("deleteJobSeekerProfileResumePublications");

    @Override // defpackage.ga
    public final pw3.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        pw3.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            sw3 sw3Var = sw3.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(sw3Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            bVar = (pw3.b) objA;
        }
        return new pw3.a(bVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, pw3.a aVar) {
        pw3.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("deleteJobSeekerProfileResumePublications");
        sw3 sw3Var = sw3.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(sw3Var, false);
        pw3.b bVar = aVar2.a;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
    }
}
