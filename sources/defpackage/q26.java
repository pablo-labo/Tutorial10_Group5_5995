package defpackage;

import defpackage.ha;
import defpackage.m26;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class q26 implements ga<m26.c> {
    public static final List<String> a = u63.Z("onlineStatus");

    public static m26.c c(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        m26.f fVar = null;
        while (mb8Var.D1(a) == 0) {
            t26 t26Var = t26.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(t26Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            fVar = (m26.f) objA;
        }
        return new m26.c(fVar);
    }

    public static void d(hc8 hc8Var, lb3 lb3Var, m26.c cVar) {
        hc8Var.getClass();
        lb3Var.getClass();
        cVar.getClass();
        hc8Var.u0("onlineStatus");
        t26 t26Var = t26.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(t26Var, false);
        m26.f fVar = cVar.a;
        if (fVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, fVar);
        }
    }
}
