package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.rx7;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class xx7 implements ga<rx7.f> {
    public static final xx7 a = new xx7();
    public static final List<String> b = u63.Z("squareLogoUrls");

    @Override // defpackage.ga
    public final rx7.f a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        rx7.j jVar = null;
        while (mb8Var.D1(b) == 0) {
            cy7 cy7Var = cy7.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(cy7Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            jVar = (rx7.j) objA;
        }
        return new rx7.f(jVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, rx7.f fVar) {
        rx7.f fVar2 = fVar;
        hc8Var.getClass();
        lb3Var.getClass();
        fVar2.getClass();
        hc8Var.u0("squareLogoUrls");
        cy7 cy7Var = cy7.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(cy7Var, false);
        rx7.j jVar = fVar2.a;
        if (jVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, jVar);
        }
    }
}
