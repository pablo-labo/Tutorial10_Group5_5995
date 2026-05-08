package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.wc7;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bd7 implements ga<wc7.d> {
    public static final bd7 a = new bd7();
    public static final List<String> b = u63.Z("account");

    @Override // defpackage.ga
    public final wc7.d a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        wc7.a aVar = null;
        while (mb8Var.D1(b) == 0) {
            yc7 yc7Var = yc7.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(yc7Var, true);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            aVar = (wc7.a) objA;
        }
        return new wc7.d(aVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, wc7.d dVar) {
        wc7.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("account");
        yc7 yc7Var = yc7.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(yc7Var, true);
        wc7.a aVar = dVar2.a;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
    }
}
