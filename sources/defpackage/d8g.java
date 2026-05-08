package defpackage;

import defpackage.hva;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class d8g implements ga<c8g> {
    public static final d8g a = new d8g();

    @Override // defpackage.ga
    public final c8g a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, c8g c8gVar) {
        c8g c8gVar2 = c8gVar;
        hc8Var.getClass();
        lb3Var.getClass();
        c8gVar2.getClass();
        hva<String> hvaVar = c8gVar2.c;
        hc8Var.u0("conversationId");
        ha.a.b(hc8Var, lb3Var, c8gVar2.a);
        hva<Date> hvaVar2 = c8gVar2.b;
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("readCursor");
            ga gaVarE = lb3Var.e(qg3.a);
            if (gaVarE instanceof nma) {
                r6.g("The adapter is already nullable");
                return;
            }
            V v = ((hva.c) hvaVar2).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                gaVarE.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("conversationEventId");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
    }
}
