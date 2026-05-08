package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.wv3;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yv3 implements ga<wv3.a> {
    public static final yv3 a = new yv3();
    public static final List<String> b = u63.Z("deleteJobSeekerProfileResumeLinks");

    @Override // defpackage.ga
    public final wv3.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        wv3.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            zv3 zv3Var = zv3.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(zv3Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            bVar = (wv3.b) objA;
        }
        return new wv3.a(bVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, wv3.a aVar) {
        wv3.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("deleteJobSeekerProfileResumeLinks");
        zv3 zv3Var = zv3.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(zv3Var, false);
        wv3.b bVar = aVar2.a;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
    }
}
