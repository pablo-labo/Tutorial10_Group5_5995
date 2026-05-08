package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.w83;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a93 implements ga<w83.a> {
    public static final a93 a = new a93();
    public static final List<String> b = u63.Z("responsiveness");

    @Override // defpackage.ga
    public final w83.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        w83.c cVar = null;
        while (mb8Var.D1(b) == 0) {
            c93 c93Var = c93.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(c93Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            cVar = (w83.c) objA;
        }
        return new w83.a(cVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, w83.a aVar) {
        w83.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("responsiveness");
        c93 c93Var = c93.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(c93Var, false);
        w83.c cVar = aVar2.a;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
    }
}
