package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.o75;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class r75 implements ga<o75.b> {
    public static final r75 a = new r75();
    public static final List<String> b = u63.a0("accountKey", "role");

    @Override // defpackage.ga
    public final o75.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        gy2 gy2Var = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 1) {
                    return new o75.b(strA, gy2Var);
                }
                ha.g gVar = ha.a;
                hy2 hy2Var = hy2.a;
                if (mb8Var.peek() == mb8.a.Y) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = hy2Var.a(mb8Var, lb3Var);
                }
                gy2Var = (gy2) objA;
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, o75.b bVar) {
        o75.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("accountKey");
        ha.i.b(hc8Var, lb3Var, bVar2.a);
        hc8Var.u0("role");
        hy2 hy2Var = hy2.a;
        gy2 gy2Var = bVar2.b;
        if (gy2Var == null) {
            hc8Var.H1();
        } else {
            hy2Var.b(hc8Var, lb3Var, gy2Var);
        }
    }
}
