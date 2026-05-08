package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.vag;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class abg implements ga<vag.d> {
    public static final abg a = new abg();
    public static final List<String> b = u63.a0("ableToRelocate", "source");

    @Override // defpackage.ga
    public final vag.d a(mb8 mb8Var, lb3 lb3Var) {
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
                    return new vag.d(boolA, c58Var);
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
    public final void b(hc8 hc8Var, lb3 lb3Var, vag.d dVar) {
        vag.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("ableToRelocate");
        ha.l.b(hc8Var, lb3Var, dVar2.a);
        hc8Var.u0("source");
        f58 f58Var = f58.a;
        c58 c58Var = dVar2.b;
        if (c58Var == null) {
            hc8Var.H1();
        } else {
            f58Var.b(hc8Var, lb3Var, c58Var);
        }
    }
}
