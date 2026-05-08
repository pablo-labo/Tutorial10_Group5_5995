package defpackage;

import defpackage.e8g;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g8g implements ga<e8g.a> {
    public static final g8g a = new g8g();
    public static final List<String> b = u63.Z("updateConversationReadCursor");

    @Override // defpackage.ga
    public final e8g.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        e8g.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            h8g h8gVar = h8g.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(h8gVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            bVar = (e8g.b) objA;
        }
        return new e8g.a(bVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, e8g.a aVar) {
        e8g.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("updateConversationReadCursor");
        h8g h8gVar = h8g.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(h8gVar, false);
        e8g.b bVar = aVar2.a;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
    }
}
