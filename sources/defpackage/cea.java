package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.yda;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cea implements ga<yda.c> {
    public static final cea a = new cea();
    public static final List<String> b = u63.a0("navigationMenu", "availableCountrySites");

    @Override // defpackage.ga
    public final yda.c a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        Object objA2;
        mb8Var.getClass();
        lb3Var.getClass();
        yda.h hVar = null;
        yda.a aVar = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            mb8.a aVar2 = mb8.a.Y;
            if (iD1 == 0) {
                hea heaVar = hea.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(heaVar, false);
                if (mb8Var.peek() == aVar2) {
                    mb8Var.I();
                    objA2 = null;
                } else {
                    objA2 = enaVar.a(mb8Var, lb3Var);
                }
                hVar = (yda.h) objA2;
            } else {
                if (iD1 != 1) {
                    return new yda.c(hVar, aVar);
                }
                aea aeaVar = aea.a;
                ha.g gVar2 = ha.a;
                ena enaVar2 = new ena(aeaVar, false);
                if (mb8Var.peek() == aVar2) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = enaVar2.a(mb8Var, lb3Var);
                }
                aVar = (yda.a) objA;
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, yda.c cVar) {
        yda.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("navigationMenu");
        hea heaVar = hea.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(heaVar, false);
        yda.h hVar = cVar2.a;
        if (hVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, hVar);
        }
        hc8Var.u0("availableCountrySites");
        ena enaVar2 = new ena(aea.a, false);
        yda.a aVar = cVar2.b;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar2.b(hc8Var, lb3Var, aVar);
        }
    }
}
