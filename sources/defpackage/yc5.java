package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.vc5;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class yc5 implements ga<vc5.b> {
    public static final yc5 a = new yc5();
    public static final List<String> b = u63.Z("findConversations");

    @Override // defpackage.ga
    public final vc5.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        vc5.c cVar = null;
        while (mb8Var.D1(b) == 0) {
            zc5 zc5Var = zc5.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(zc5Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            cVar = (vc5.c) objA;
        }
        return new vc5.b(cVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, vc5.b bVar) {
        vc5.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("findConversations");
        zc5 zc5Var = zc5.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(zc5Var, false);
        vc5.c cVar = bVar2.a;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
    }
}
