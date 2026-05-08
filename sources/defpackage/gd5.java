package defpackage;

import defpackage.dd5;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gd5 implements ga<dd5.b> {
    public static final gd5 a = new gd5();
    public static final List<String> b = u63.Z("images");

    @Override // defpackage.ga
    public final dd5.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        dd5.f fVar = null;
        while (mb8Var.D1(b) == 0) {
            kd5 kd5Var = kd5.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(kd5Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            fVar = (dd5.f) objA;
        }
        return new dd5.b(fVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, dd5.b bVar) {
        dd5.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("images");
        kd5 kd5Var = kd5.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(kd5Var, false);
        dd5.f fVar = bVar2.a;
        if (fVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, fVar);
        }
    }
}
