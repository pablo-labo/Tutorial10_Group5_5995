package defpackage;

import defpackage.cf5;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ef5 implements ga<cf5.a> {
    public static final ef5 a = new ef5();
    public static final List<String> b = u63.Z("findSegmentationTargetedLeverExperiments");

    @Override // defpackage.ga
    public final cf5.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        cf5.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            ff5 ff5Var = ff5.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(ff5Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            bVar = (cf5.b) objA;
        }
        return new cf5.a(bVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, cf5.a aVar) {
        cf5.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("findSegmentationTargetedLeverExperiments");
        ff5 ff5Var = ff5.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(ff5Var, false);
        cf5.b bVar = aVar2.a;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
    }
}
