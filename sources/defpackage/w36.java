package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.s36;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w36 implements ga<s36.c> {
    public static final w36 a = new w36();
    public static final List<String> b = u63.a0("contactInformation", "privacy");

    @Override // defpackage.ga
    public final s36.c a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        Object objA2;
        mb8Var.getClass();
        lb3Var.getClass();
        s36.a aVar = null;
        s36.h hVar = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            mb8.a aVar2 = mb8.a.Y;
            if (iD1 == 0) {
                u36 u36Var = u36.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(u36Var, false);
                if (mb8Var.peek() == aVar2) {
                    mb8Var.I();
                    objA2 = null;
                } else {
                    objA2 = enaVar.a(mb8Var, lb3Var);
                }
                aVar = (s36.a) objA2;
            } else {
                if (iD1 != 1) {
                    return new s36.c(aVar, hVar);
                }
                b46 b46Var = b46.a;
                ha.g gVar2 = ha.a;
                ena enaVar2 = new ena(b46Var, false);
                if (mb8Var.peek() == aVar2) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = enaVar2.a(mb8Var, lb3Var);
                }
                hVar = (s36.h) objA;
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, s36.c cVar) {
        s36.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("contactInformation");
        u36 u36Var = u36.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(u36Var, false);
        s36.a aVar = cVar2.a;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
        hc8Var.u0("privacy");
        ena enaVar2 = new ena(b46.a, false);
        s36.h hVar = cVar2.b;
        if (hVar == null) {
            hc8Var.H1();
        } else {
            enaVar2.b(hc8Var, lb3Var, hVar);
        }
    }
}
