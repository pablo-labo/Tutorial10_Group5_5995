package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.y46;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h56 implements ga<y46.h> {
    public static final h56 a = new h56();
    public static final List<String> b = u63.a0("ableToRelocate", "source");

    @Override // defpackage.ga
    public final y46.h a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        Boolean boolA = null;
        c58 c58Var = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                boolA = ha.l.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 1) {
                    return new y46.h(boolA, c58Var);
                }
                ha.g gVar = ha.a;
                f58 f58Var = f58.a;
                if (mb8Var.peek() == mb8.a.Y) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = f58Var.a(mb8Var, lb3Var);
                }
                c58Var = (c58) objA;
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, y46.h hVar) {
        y46.h hVar2 = hVar;
        hc8Var.getClass();
        lb3Var.getClass();
        hVar2.getClass();
        hc8Var.u0("ableToRelocate");
        ha.l.b(hc8Var, lb3Var, hVar2.a);
        hc8Var.u0("source");
        f58 f58Var = f58.a;
        c58 c58Var = hVar2.b;
        if (c58Var == null) {
            hc8Var.H1();
        } else {
            f58Var.b(hc8Var, lb3Var, c58Var);
        }
    }
}
