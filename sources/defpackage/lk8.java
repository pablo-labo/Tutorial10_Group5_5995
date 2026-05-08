package defpackage;

import defpackage.ha;
import defpackage.jk8;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lk8 implements ga<jk8.b> {
    public static final lk8 a = new lk8();
    public static final List<String> b = u63.Z("role");

    @Override // defpackage.ga
    public final jk8.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        gy2 gy2Var = null;
        while (mb8Var.D1(b) == 0) {
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
        return new jk8.b(gy2Var);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, jk8.b bVar) {
        jk8.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("role");
        ha.g gVar = ha.a;
        hy2 hy2Var = hy2.a;
        gy2 gy2Var = bVar2.a;
        if (gy2Var == null) {
            hc8Var.H1();
        } else {
            hy2Var.b(hc8Var, lb3Var, gy2Var);
        }
    }
}
