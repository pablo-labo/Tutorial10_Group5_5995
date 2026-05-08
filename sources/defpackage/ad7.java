package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.wc7;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ad7 implements ga<wc7.c> {
    public static final ad7 a = new ad7();
    public static final List<String> b = u63.a0("accountName", "email");

    @Override // defpackage.ga
    public final wc7.c a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        Object objA2;
        mb8Var.getClass();
        lb3Var.getClass();
        wc7.b bVar = null;
        wc7.f fVar = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            mb8.a aVar = mb8.a.Y;
            if (iD1 == 0) {
                zc7 zc7Var = zc7.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(zc7Var, false);
                if (mb8Var.peek() == aVar) {
                    mb8Var.I();
                    objA2 = null;
                } else {
                    objA2 = enaVar.a(mb8Var, lb3Var);
                }
                bVar = (wc7.b) objA2;
            } else {
                if (iD1 != 1) {
                    return new wc7.c(bVar, fVar);
                }
                dd7 dd7Var = dd7.a;
                ha.g gVar2 = ha.a;
                ena enaVar2 = new ena(dd7Var, false);
                if (mb8Var.peek() == aVar) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = enaVar2.a(mb8Var, lb3Var);
                }
                fVar = (wc7.f) objA;
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, wc7.c cVar) {
        wc7.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("accountName");
        zc7 zc7Var = zc7.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(zc7Var, false);
        wc7.b bVar = cVar2.a;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
        hc8Var.u0("email");
        ena enaVar2 = new ena(dd7.a, false);
        wc7.f fVar = cVar2.b;
        if (fVar == null) {
            hc8Var.H1();
        } else {
            enaVar2.b(hc8Var, lb3Var, fVar);
        }
    }
}
