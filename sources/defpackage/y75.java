package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.o75;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class y75 implements ga<o75.i> {
    public static final y75 a = new y75();
    public static final List<String> b = u63.a0("message", "sender", "icon");

    @Override // defpackage.ga
    public final o75.i a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        String strA2 = null;
        o75.g gVar = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                strA2 = ha.i.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 2) {
                    return new o75.i(strA, strA2, gVar);
                }
                w75 w75Var = w75.a;
                ha.g gVar2 = ha.a;
                ena enaVar = new ena(w75Var, false);
                if (mb8Var.peek() == mb8.a.Y) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = enaVar.a(mb8Var, lb3Var);
                }
                gVar = (o75.g) objA;
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, o75.i iVar) {
        o75.i iVar2 = iVar;
        hc8Var.getClass();
        lb3Var.getClass();
        iVar2.getClass();
        hc8Var.u0("message");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, iVar2.a);
        hc8Var.u0("sender");
        nmaVar.b(hc8Var, lb3Var, iVar2.b);
        hc8Var.u0("icon");
        ena enaVar = new ena(w75.a, false);
        o75.g gVar = iVar2.c;
        if (gVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, gVar);
        }
    }
}
