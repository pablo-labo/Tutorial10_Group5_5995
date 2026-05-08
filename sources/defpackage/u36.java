package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.s36;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class u36 implements ga<s36.a> {
    public static final u36 a = new u36();
    public static final List<String> b = u63.a0("firstName", "lastName", "phoneNumber", "location");

    @Override // defpackage.ga
    public final s36.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        String strA2 = null;
        String strA3 = null;
        s36.f fVar = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                strA2 = ha.i.a(mb8Var, lb3Var);
            } else if (iD1 == 2) {
                strA3 = ha.i.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 3) {
                    return new s36.a(strA, strA2, strA3, fVar);
                }
                z36 z36Var = z36.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(z36Var, false);
                if (mb8Var.peek() == mb8.a.Y) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = enaVar.a(mb8Var, lb3Var);
                }
                fVar = (s36.f) objA;
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, s36.a aVar) {
        s36.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("firstName");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, aVar2.a);
        hc8Var.u0("lastName");
        nmaVar.b(hc8Var, lb3Var, aVar2.b);
        hc8Var.u0("phoneNumber");
        nmaVar.b(hc8Var, lb3Var, aVar2.c);
        hc8Var.u0("location");
        ena enaVar = new ena(z36.a, false);
        s36.f fVar = aVar2.d;
        if (fVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, fVar);
        }
    }
}
