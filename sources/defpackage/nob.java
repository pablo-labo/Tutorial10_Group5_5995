package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.mob;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class nob implements ga<mob.a> {
    public static final nob a = new nob();
    public static final List<String> b = u63.a0("value", "description", "payload");

    @Override // defpackage.ga
    public final mob.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        Integer num = null;
        String strA = null;
        mob.b bVar = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                num = (Integer) ha.b.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 2) {
                    break;
                }
                oob oobVar = oob.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(oobVar, false);
                if (mb8Var.peek() == mb8.a.Y) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = enaVar.a(mb8Var, lb3Var);
                }
                bVar = (mob.b) objA;
            }
        }
        if (num != null) {
            return new mob.a(num.intValue(), strA, bVar);
        }
        mh2.q(mb8Var, "value");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, mob.a aVar) {
        mob.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("value");
        ha.b.b(hc8Var, lb3Var, Integer.valueOf(aVar2.a));
        hc8Var.u0("description");
        ha.i.b(hc8Var, lb3Var, aVar2.b);
        hc8Var.u0("payload");
        ena enaVar = new ena(oob.a, false);
        mob.b bVar = aVar2.c;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
    }
}
