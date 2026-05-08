package defpackage;

import defpackage.ha;
import defpackage.j6e;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class l6e implements ga<j6e.a> {
    public static final l6e a = new l6e();
    public static final List<String> b = u63.Z("sendConversationEvent");

    @Override // defpackage.ga
    public final j6e.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        j6e.c cVar = null;
        while (mb8Var.D1(b) == 0) {
            n6e n6eVar = n6e.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(n6eVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            cVar = (j6e.c) objA;
        }
        return new j6e.a(cVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, j6e.a aVar) {
        j6e.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("sendConversationEvent");
        n6e n6eVar = n6e.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(n6eVar, false);
        j6e.c cVar = aVar2.a;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
    }
}
