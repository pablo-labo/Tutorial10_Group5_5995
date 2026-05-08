package defpackage;

import defpackage.rx7;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ay7 implements ga<rx7.h> {
    public static final ay7 a = new ay7();
    public static final List<String> b = u63.Z("value");

    @Override // defpackage.ga
    public final rx7.h a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        Double dA = null;
        while (mb8Var.D1(b) == 0) {
            dA = ha.j.a(mb8Var, lb3Var);
        }
        return new rx7.h(dA);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, rx7.h hVar) {
        rx7.h hVar2 = hVar;
        hc8Var.getClass();
        lb3Var.getClass();
        hVar2.getClass();
        hc8Var.u0("value");
        ha.j.b(hc8Var, lb3Var, hVar2.a);
    }
}
