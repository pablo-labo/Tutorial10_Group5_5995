package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.xj8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class dk8 implements ga<xj8.e> {
    public static final dk8 a = new dk8();
    public static final List<String> b = u63.a0("name", "taxonomyConceptName");

    @Override // defpackage.ga
    public final xj8.e a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        xj8.g gVar = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 1) {
                    return new xj8.e(strA, gVar);
                }
                fk8 fk8Var = fk8.a;
                ha.g gVar2 = ha.a;
                ena enaVar = new ena(fk8Var, false);
                if (mb8Var.peek() == mb8.a.Y) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = enaVar.a(mb8Var, lb3Var);
                }
                gVar = (xj8.g) objA;
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, xj8.e eVar) {
        xj8.e eVar2 = eVar;
        hc8Var.getClass();
        lb3Var.getClass();
        eVar2.getClass();
        hc8Var.u0("name");
        ha.i.b(hc8Var, lb3Var, eVar2.a);
        hc8Var.u0("taxonomyConceptName");
        ena enaVar = new ena(fk8.a, false);
        xj8.g gVar = eVar2.b;
        if (gVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, gVar);
        }
    }
}
