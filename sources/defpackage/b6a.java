package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.p5a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class b6a implements ga<p5a.k> {
    public static final b6a a = new b6a();
    public static final List<String> b = u63.Z("formatted");

    @Override // defpackage.ga
    public final p5a.k a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        p5a.f fVar = null;
        while (mb8Var.D1(b) == 0) {
            w5a w5aVar = w5a.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(w5aVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            fVar = (p5a.f) objA;
        }
        return new p5a.k(fVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, p5a.k kVar) {
        p5a.k kVar2 = kVar;
        hc8Var.getClass();
        lb3Var.getClass();
        kVar2.getClass();
        hc8Var.u0("formatted");
        w5a w5aVar = w5a.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(w5aVar, false);
        p5a.f fVar = kVar2.a;
        if (fVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, fVar);
        }
    }
}
