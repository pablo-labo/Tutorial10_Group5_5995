package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.mob;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class oob implements ga<mob.b> {
    public static final oob a = new oob();
    public static final List<String> b = u63.a0("value", "type");

    @Override // defpackage.ga
    public final mob.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        uu9 uu9Var = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                str = (String) ha.a.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 1) {
                    break;
                }
                ha.g gVar = ha.a;
                vu9 vu9Var = vu9.a;
                if (mb8Var.peek() == mb8.a.Y) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = vu9Var.a(mb8Var, lb3Var);
                }
                uu9Var = (uu9) objA;
            }
        }
        if (str != null) {
            return new mob.b(str, uu9Var);
        }
        mh2.q(mb8Var, "value");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, mob.b bVar) {
        mob.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("value");
        ha.a.b(hc8Var, lb3Var, bVar2.a);
        hc8Var.u0("type");
        vu9 vu9Var = vu9.a;
        uu9 uu9Var = bVar2.b;
        if (uu9Var == null) {
            hc8Var.H1();
        } else {
            vu9Var.b(hc8Var, lb3Var, uu9Var);
        }
    }
}
