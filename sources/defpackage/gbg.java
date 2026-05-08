package defpackage;

import defpackage.cbg;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gbg implements ga<cbg.c> {
    public static final gbg a = new gbg();
    public static final List<String> b = u63.Z("resume");

    @Override // defpackage.ga
    public final cbg.c a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        cbg.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            fbg fbgVar = fbg.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(fbgVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            bVar = (cbg.b) objA;
        }
        return new cbg.c(bVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, cbg.c cVar) {
        cbg.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("resume");
        fbg fbgVar = fbg.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(fbgVar, false);
        cbg.b bVar = cVar2.a;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
    }
}
