package defpackage;

import defpackage.agg;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cgg implements ga<agg.a> {
    public static final cgg a = new cgg();
    public static final List<String> b = u63.Z("jobSeekerProfileMutations");

    @Override // defpackage.ga
    public final agg.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        agg.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            dgg dggVar = dgg.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(dggVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            bVar = (agg.b) objA;
        }
        return new agg.a(bVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, agg.a aVar) {
        agg.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("jobSeekerProfileMutations");
        dgg dggVar = dgg.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(dggVar, false);
        agg.b bVar = aVar2.a;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
    }
}
