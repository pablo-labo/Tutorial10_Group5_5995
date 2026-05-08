package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.sd5;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xd5 implements ga<sd5.d> {
    public static final xd5 a = new xd5();
    public static final List<String> b = u63.a0("key", "ugcStats");

    @Override // defpackage.ga
    public final sd5.d a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        sd5.q qVar = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                str = (String) ha.a.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 1) {
                    break;
                }
                ke5 ke5Var = ke5.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(ke5Var, false);
                if (mb8Var.peek() == mb8.a.Y) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = enaVar.a(mb8Var, lb3Var);
                }
                qVar = (sd5.q) objA;
            }
        }
        if (str != null) {
            return new sd5.d(str, qVar);
        }
        mh2.q(mb8Var, "key");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, sd5.d dVar) {
        sd5.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("key");
        ha.a.b(hc8Var, lb3Var, dVar2.a);
        hc8Var.u0("ugcStats");
        ena enaVar = new ena(ke5.a, false);
        sd5.q qVar = dVar2.b;
        if (qVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, qVar);
        }
    }
}
