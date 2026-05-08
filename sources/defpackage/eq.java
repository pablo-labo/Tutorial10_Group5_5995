package defpackage;

import defpackage.bq;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class eq implements ga<bq.b> {
    public static final eq a = new eq();
    public static final List<String> b = u63.Z("addJobSeekerProfileStructuredDataPreference");

    @Override // defpackage.ga
    public final bq.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        bq.a aVar = null;
        while (mb8Var.D1(b) == 0) {
            dq dqVar = dq.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(dqVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            aVar = (bq.a) objA;
        }
        return new bq.b(aVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, bq.b bVar) {
        bq.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("addJobSeekerProfileStructuredDataPreference");
        dq dqVar = dq.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(dqVar, false);
        bq.a aVar = bVar2.a;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
    }
}
