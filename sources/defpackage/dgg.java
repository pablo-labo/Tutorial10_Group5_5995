package defpackage;

import defpackage.agg;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class dgg implements ga<agg.b> {
    public static final dgg a = new dgg();
    public static final List<String> b = u63.Z("updateSourcingElection");

    @Override // defpackage.ga
    public final agg.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        agg.c cVar = null;
        while (mb8Var.D1(b) == 0) {
            egg eggVar = egg.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(eggVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            cVar = (agg.c) objA;
        }
        return new agg.b(cVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, agg.b bVar) {
        agg.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("updateSourcingElection");
        egg eggVar = egg.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(eggVar, false);
        agg.c cVar = bVar2.a;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
    }
}
