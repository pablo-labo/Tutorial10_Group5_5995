package defpackage;

import defpackage.ha;
import defpackage.m36;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class p36 implements ga<m36.b> {
    public static final p36 a = new p36();
    public static final List<String> b = u63.Z("profile");

    @Override // defpackage.ga
    public final m36.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        m36.c cVar = null;
        while (mb8Var.D1(b) == 0) {
            q36 q36Var = q36.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(q36Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            cVar = (m36.c) objA;
        }
        return new m36.b(cVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, m36.b bVar) {
        m36.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("profile");
        q36 q36Var = q36.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(q36Var, false);
        m36.c cVar = bVar2.a;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
    }
}
