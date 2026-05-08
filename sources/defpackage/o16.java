package defpackage;

import defpackage.ha;
import defpackage.k16;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class o16 implements ga<k16.c> {
    public static final o16 a = new o16();
    public static final List<String> b = u63.Z("profile");

    @Override // defpackage.ga
    public final k16.c a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        k16.d dVar = null;
        while (mb8Var.D1(b) == 0) {
            p16 p16Var = p16.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(p16Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            dVar = (k16.d) objA;
        }
        return new k16.c(dVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, k16.c cVar) {
        k16.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("profile");
        p16 p16Var = p16.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(p16Var, false);
        k16.d dVar = cVar2.a;
        if (dVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, dVar);
        }
    }
}
