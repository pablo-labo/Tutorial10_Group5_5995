package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.o75;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class x75 implements ga<o75.h> {
    public static final List<String> a = u63.a0("telContent", "timelineModuleType", "overrides", "data");

    public static o75.h c(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        String strA2 = null;
        o75.i iVar = null;
        String strA3 = null;
        while (true) {
            int iD1 = mb8Var.D1(a);
            if (iD1 == 0) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                strA2 = ha.i.a(mb8Var, lb3Var);
            } else if (iD1 == 2) {
                y75 y75Var = y75.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(y75Var, false);
                if (mb8Var.peek() == mb8.a.Y) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = enaVar.a(mb8Var, lb3Var);
                }
                iVar = (o75.i) objA;
            } else {
                if (iD1 != 3) {
                    return new o75.h(strA, strA2, iVar, strA3);
                }
                strA3 = ha.i.a(mb8Var, lb3Var);
            }
        }
    }

    public static void d(hc8 hc8Var, lb3 lb3Var, o75.h hVar) {
        hc8Var.getClass();
        lb3Var.getClass();
        hVar.getClass();
        hc8Var.u0("telContent");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, hVar.a);
        hc8Var.u0("timelineModuleType");
        nmaVar.b(hc8Var, lb3Var, hVar.b);
        hc8Var.u0("overrides");
        ena enaVar = new ena(y75.a, false);
        o75.i iVar = hVar.c;
        if (iVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, iVar);
        }
        hc8Var.u0("data");
        nmaVar.b(hc8Var, lb3Var, hVar.d);
    }
}
