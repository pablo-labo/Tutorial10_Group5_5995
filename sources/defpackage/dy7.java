package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.rx7;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class dy7 implements ga<rx7.k> {
    public static final dy7 a = new dy7();
    public static final List<String> b = u63.Z("ratings");

    @Override // defpackage.ga
    public final rx7.k a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        rx7.i iVar = null;
        while (mb8Var.D1(b) == 0) {
            by7 by7Var = by7.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(by7Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            iVar = (rx7.i) objA;
        }
        return new rx7.k(iVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, rx7.k kVar) {
        rx7.k kVar2 = kVar;
        hc8Var.getClass();
        lb3Var.getClass();
        kVar2.getClass();
        hc8Var.u0("ratings");
        by7 by7Var = by7.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(by7Var, false);
        rx7.i iVar = kVar2.a;
        if (iVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, iVar);
        }
    }
}
