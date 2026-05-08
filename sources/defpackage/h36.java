package defpackage;

import defpackage.d36;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h36 implements ga<d36.c> {
    public static final h36 a = new h36();
    public static final List<String> b = u63.Z("currentJobSeekerPortrait");

    @Override // defpackage.ga
    public final d36.c a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        d36.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            g36 g36Var = g36.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(g36Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            bVar = (d36.b) objA;
        }
        return new d36.c(bVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, d36.c cVar) {
        d36.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("currentJobSeekerPortrait");
        g36 g36Var = g36.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(g36Var, false);
        d36.b bVar = cVar2.a;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
    }
}
