package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.te5;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class we5 implements ga<te5.b> {
    public static final we5 a = new we5();
    public static final List<String> b = u63.Z("findSegmentationTargetedLeverExperiments");

    @Override // defpackage.ga
    public final te5.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        te5.c cVar = null;
        while (mb8Var.D1(b) == 0) {
            xe5 xe5Var = xe5.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(xe5Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            cVar = (te5.c) objA;
        }
        return new te5.b(cVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, te5.b bVar) {
        te5.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("findSegmentationTargetedLeverExperiments");
        xe5 xe5Var = xe5.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(xe5Var, false);
        te5.c cVar = bVar2.a;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
    }
}
