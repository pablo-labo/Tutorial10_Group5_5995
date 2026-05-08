package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.rx7;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class by7 implements ga<rx7.i> {
    public static final by7 a = new by7();
    public static final List<String> b = u63.Z("overallRating");

    @Override // defpackage.ga
    public final rx7.i a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        rx7.h hVar = null;
        while (mb8Var.D1(b) == 0) {
            ay7 ay7Var = ay7.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(ay7Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            hVar = (rx7.h) objA;
        }
        return new rx7.i(hVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, rx7.i iVar) {
        rx7.i iVar2 = iVar;
        hc8Var.getClass();
        lb3Var.getClass();
        iVar2.getClass();
        hc8Var.u0("overallRating");
        ay7 ay7Var = ay7.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(ay7Var, false);
        rx7.h hVar = iVar2.a;
        if (hVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, hVar);
        }
    }
}
