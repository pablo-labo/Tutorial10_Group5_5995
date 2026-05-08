package defpackage;

import defpackage.gbf;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ibf implements ga<gbf> {
    public static final List<String> a = u63.a0("name", "taxonomyConceptName");

    public static gbf c(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        gbf.a aVar = null;
        while (true) {
            int iD1 = mb8Var.D1(a);
            if (iD1 == 0) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 1) {
                    return new gbf(strA, aVar);
                }
                hbf hbfVar = hbf.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(hbfVar, true);
                if (mb8Var.peek() == mb8.a.Y) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = enaVar.a(mb8Var, lb3Var);
                }
                aVar = (gbf.a) objA;
            }
        }
    }

    public static void d(hc8 hc8Var, lb3 lb3Var, gbf gbfVar) {
        hc8Var.getClass();
        lb3Var.getClass();
        gbfVar.getClass();
        hc8Var.u0("name");
        ha.i.b(hc8Var, lb3Var, gbfVar.a);
        hc8Var.u0("taxonomyConceptName");
        ena enaVar = new ena(hbf.a, true);
        gbf.a aVar = gbfVar.b;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
    }
}
