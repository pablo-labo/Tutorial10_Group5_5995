package defpackage;

import defpackage.cbg;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ebg implements ga<cbg.a> {
    public static final ebg a = new ebg();
    public static final List<String> b = u63.Z("updateJobSeekerProfileResume");

    @Override // defpackage.ga
    public final cbg.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        cbg.c cVar = null;
        while (mb8Var.D1(b) == 0) {
            gbg gbgVar = gbg.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(gbgVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            cVar = (cbg.c) objA;
        }
        return new cbg.a(cVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, cbg.a aVar) {
        cbg.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("updateJobSeekerProfileResume");
        gbg gbgVar = gbg.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(gbgVar, false);
        cbg.c cVar = aVar2.a;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
    }
}
