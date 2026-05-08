package defpackage;

import defpackage.dx3;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fx3 implements ga<dx3.a> {
    public static final fx3 a = new fx3();
    public static final List<String> b = u63.Z("deleteJobSeekerProfileResumeWorkExperiences");

    @Override // defpackage.ga
    public final dx3.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        dx3.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            gx3 gx3Var = gx3.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(gx3Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            bVar = (dx3.b) objA;
        }
        return new dx3.a(bVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, dx3.a aVar) {
        dx3.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("deleteJobSeekerProfileResumeWorkExperiences");
        gx3 gx3Var = gx3.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(gx3Var, false);
        dx3.b bVar = aVar2.a;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
    }
}
