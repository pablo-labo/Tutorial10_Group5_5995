package defpackage;

import defpackage.e46;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l46 implements ga<e46.f> {
    public static final l46 a = new l46();
    public static final List<String> b = u63.Z("state");

    @Override // defpackage.ga
    public final e46.f a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        y18 y18Var = null;
        while (mb8Var.D1(b) == 0) {
            ha.g gVar = ha.a;
            z18 z18Var = z18.a;
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = z18Var.a(mb8Var, lb3Var);
            }
            y18Var = (y18) objA;
        }
        return new e46.f(y18Var);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, e46.f fVar) {
        e46.f fVar2 = fVar;
        hc8Var.getClass();
        lb3Var.getClass();
        fVar2.getClass();
        hc8Var.u0("state");
        ha.g gVar = ha.a;
        z18 z18Var = z18.a;
        y18 y18Var = fVar2.a;
        if (y18Var == null) {
            hc8Var.H1();
        } else {
            z18Var.b(hc8Var, lb3Var, y18Var);
        }
    }
}
