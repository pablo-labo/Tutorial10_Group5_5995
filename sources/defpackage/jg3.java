package defpackage;

import defpackage.ha;
import defpackage.ig3;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jg3 implements ga<ig3> {
    public static final List<String> a = u63.a0("fromDate", "isCurrent", "toDate");

    public static ig3 c(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        Object objA2;
        mb8Var.getClass();
        lb3Var.getClass();
        ig3.a aVar = null;
        Boolean boolA = null;
        ig3.b bVar = null;
        while (true) {
            int iD1 = mb8Var.D1(a);
            mb8.a aVar2 = mb8.a.Y;
            if (iD1 == 0) {
                kg3 kg3Var = kg3.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(kg3Var, false);
                if (mb8Var.peek() == aVar2) {
                    mb8Var.I();
                    objA2 = null;
                } else {
                    objA2 = enaVar.a(mb8Var, lb3Var);
                }
                aVar = (ig3.a) objA2;
            } else if (iD1 == 1) {
                boolA = ha.l.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 2) {
                    return new ig3(aVar, boolA, bVar);
                }
                lg3 lg3Var = lg3.a;
                ha.g gVar2 = ha.a;
                ena enaVar2 = new ena(lg3Var, false);
                if (mb8Var.peek() == aVar2) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = enaVar2.a(mb8Var, lb3Var);
                }
                bVar = (ig3.b) objA;
            }
        }
    }

    public static void d(hc8 hc8Var, lb3 lb3Var, ig3 ig3Var) {
        hc8Var.getClass();
        lb3Var.getClass();
        ig3Var.getClass();
        hc8Var.u0("fromDate");
        kg3 kg3Var = kg3.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(kg3Var, false);
        ig3.a aVar = ig3Var.a;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
        hc8Var.u0("isCurrent");
        ha.l.b(hc8Var, lb3Var, ig3Var.b);
        hc8Var.u0("toDate");
        ena enaVar2 = new ena(lg3.a, false);
        ig3.b bVar = ig3Var.c;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar2.b(hc8Var, lb3Var, bVar);
        }
    }
}
