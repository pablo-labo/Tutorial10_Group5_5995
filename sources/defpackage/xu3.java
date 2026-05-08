package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.vu3;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xu3 implements ga<vu3.a> {
    public static final xu3 a = new xu3();
    public static final List<String> b = u63.Z("deleteJobSeekerProfileResumeCertifications");

    @Override // defpackage.ga
    public final vu3.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        vu3.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            yu3 yu3Var = yu3.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(yu3Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            bVar = (vu3.b) objA;
        }
        return new vu3.a(bVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, vu3.a aVar) {
        vu3.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("deleteJobSeekerProfileResumeCertifications");
        yu3 yu3Var = yu3.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(yu3Var, false);
        vu3.b bVar = aVar2.a;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
    }
}
