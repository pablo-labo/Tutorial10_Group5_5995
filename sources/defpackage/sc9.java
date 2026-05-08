package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.qc9;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class sc9 implements ga<qc9.a> {
    public static final sc9 a = new sc9();
    public static final List<String> b = u63.Z("markAutoMergeReviewed");

    @Override // defpackage.ga
    public final qc9.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        qc9.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            tc9 tc9Var = tc9.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(tc9Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            bVar = (qc9.b) objA;
        }
        return new qc9.a(bVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, qc9.a aVar) {
        qc9.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("markAutoMergeReviewed");
        tc9 tc9Var = tc9.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(tc9Var, false);
        qc9.b bVar = aVar2.a;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
    }
}
