package defpackage;

import defpackage.ha;
import defpackage.hu3;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ju3 implements ga<hu3.a> {
    public static final ju3 a = new ju3();
    public static final List<String> b = u63.Z("deleteJobSeekerProfileResumeAssociations");

    @Override // defpackage.ga
    public final hu3.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        hu3.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            ku3 ku3Var = ku3.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(ku3Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            bVar = (hu3.b) objA;
        }
        return new hu3.a(bVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, hu3.a aVar) {
        hu3.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("deleteJobSeekerProfileResumeAssociations");
        ku3 ku3Var = ku3.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(ku3Var, false);
        hu3.b bVar = aVar2.a;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
    }
}
