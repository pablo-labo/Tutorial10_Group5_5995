package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.ynf;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class aof implements ga<ynf.a> {
    public static final aof a = new aof();
    public static final List<String> b = u63.Z("topChoicesAfterDate");

    @Override // defpackage.ga
    public final ynf.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        ynf.c cVar = null;
        while (mb8Var.D1(b) == 0) {
            cof cofVar = cof.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(cofVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            cVar = (ynf.c) objA;
        }
        return new ynf.a(cVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ynf.a aVar) {
        ynf.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("topChoicesAfterDate");
        cof cofVar = cof.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(cofVar, false);
        ynf.c cVar = aVar2.a;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
    }
}
