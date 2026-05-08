package defpackage;

import defpackage.g66;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i66 implements ga<g66.a> {
    public static final i66 a = new i66();
    public static final List<String> b = u63.Z("getUnreadConversationCount");

    @Override // defpackage.ga
    public final g66.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        g66.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            j66 j66Var = j66.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(j66Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            bVar = (g66.b) objA;
        }
        return new g66.a(bVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, g66.a aVar) {
        g66.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("getUnreadConversationCount");
        j66 j66Var = j66.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(j66Var, false);
        g66.b bVar = aVar2.a;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
    }
}
