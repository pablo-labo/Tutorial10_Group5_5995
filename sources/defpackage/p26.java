package defpackage;

import defpackage.ha;
import defpackage.m26;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class p26 implements ga<m26.b> {
    public static final p26 a = new p26();
    public static final List<String> b = u63.Z("onlineStatuses");

    @Override // defpackage.ga
    public final m26.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        m26.g gVar = null;
        while (mb8Var.D1(b) == 0) {
            u26 u26Var = u26.a;
            ha.g gVar2 = ha.a;
            ena enaVar = new ena(u26Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            gVar = (m26.g) objA;
        }
        return new m26.b(gVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, m26.b bVar) {
        m26.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("onlineStatuses");
        u26 u26Var = u26.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(u26Var, false);
        m26.g gVar2 = bVar2.a;
        if (gVar2 == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, gVar2);
        }
    }
}
