package defpackage;

import defpackage.dd5;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class kd5 implements ga<dd5.f> {
    public static final kd5 a = new kd5();
    public static final List<String> b = u63.Z("squareLogoUrls");

    @Override // defpackage.ga
    public final dd5.f a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        dd5.g gVar = null;
        while (mb8Var.D1(b) == 0) {
            ld5 ld5Var = ld5.a;
            ha.g gVar2 = ha.a;
            ena enaVar = new ena(ld5Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            gVar = (dd5.g) objA;
        }
        return new dd5.f(gVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, dd5.f fVar) {
        dd5.f fVar2 = fVar;
        hc8Var.getClass();
        lb3Var.getClass();
        fVar2.getClass();
        hc8Var.u0("squareLogoUrls");
        ld5 ld5Var = ld5.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(ld5Var, false);
        dd5.g gVar2 = fVar2.a;
        if (gVar2 == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, gVar2);
        }
    }
}
