package defpackage;

import defpackage.ha;
import defpackage.j56;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class l56 implements ga<j56.a> {
    public static final l56 a = new l56();
    public static final List<String> b = u63.Z("suggestedMessages");

    @Override // defpackage.ga
    public final j56.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        j56.d dVar = null;
        while (mb8Var.D1(b) == 0) {
            o56 o56Var = o56.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(o56Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            dVar = (j56.d) objA;
        }
        return new j56.a(dVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, j56.a aVar) {
        j56.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("suggestedMessages");
        o56 o56Var = o56.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(o56Var, false);
        j56.d dVar = aVar2.a;
        if (dVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, dVar);
        }
    }
}
