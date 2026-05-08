package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.rx7;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ux7 implements ga<rx7.c> {
    public static final ux7 a = new ux7();
    public static final List<String> b = u63.Z("images");

    @Override // defpackage.ga
    public final rx7.c a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        rx7.f fVar = null;
        while (mb8Var.D1(b) == 0) {
            xx7 xx7Var = xx7.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(xx7Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            fVar = (rx7.f) objA;
        }
        return new rx7.c(fVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, rx7.c cVar) {
        rx7.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("images");
        xx7 xx7Var = xx7.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(xx7Var, false);
        rx7.f fVar = cVar2.a;
        if (fVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, fVar);
        }
    }
}
