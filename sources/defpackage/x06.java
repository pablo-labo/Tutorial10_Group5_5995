package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.t06;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class x06 implements ga<t06.c> {
    public static final x06 a = new x06();
    public static final List<String> b = u63.Z("applyLink");

    @Override // defpackage.ga
    public final t06.c a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        t06.a aVar = null;
        while (mb8Var.D1(b) == 0) {
            v06 v06Var = v06.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(v06Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            aVar = (t06.a) objA;
        }
        return new t06.c(aVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, t06.c cVar) {
        t06.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("applyLink");
        v06 v06Var = v06.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(v06Var, false);
        t06.a aVar = cVar2.a;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
    }
}
