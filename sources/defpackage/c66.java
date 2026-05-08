package defpackage;

import defpackage.ha;
import defpackage.y56;
import java.time.Instant;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c66 implements ga<y56.c> {
    public static final c66 a = new c66();
    public static final List<String> b = u63.a0("userInteraction", "interactionCount", "firstInteractionTimestamp", "lastInteractionTimestamp");

    @Override // defpackage.ga
    public final y56.c a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        y56.e eVar = null;
        Integer num = null;
        Instant instant = null;
        Instant instant2 = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                e66 e66Var = e66.a;
                ha.g gVar = ha.a;
                eVar = (y56.e) new ena(e66Var, false).a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                num = (Integer) ha.b.a(mb8Var, lb3Var);
            } else if (iD1 == 2) {
                instant = (Instant) lb3Var.e(nmf.a).a(mb8Var, lb3Var);
            } else {
                if (iD1 != 3) {
                    break;
                }
                instant2 = (Instant) lb3Var.e(nmf.a).a(mb8Var, lb3Var);
            }
        }
        if (eVar == null) {
            mh2.q(mb8Var, "userInteraction");
            throw null;
        }
        if (num == null) {
            mh2.q(mb8Var, "interactionCount");
            throw null;
        }
        int iIntValue = num.intValue();
        if (instant == null) {
            mh2.q(mb8Var, "firstInteractionTimestamp");
            throw null;
        }
        if (instant2 != null) {
            return new y56.c(eVar, iIntValue, instant, instant2);
        }
        mh2.q(mb8Var, "lastInteractionTimestamp");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, y56.c cVar) {
        y56.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("userInteraction");
        e66 e66Var = e66.a;
        ha.g gVar = ha.a;
        y56.e eVar = cVar2.a;
        hc8Var.j();
        e66Var.b(hc8Var, lb3Var, eVar);
        hc8Var.t();
        hc8Var.u0("interactionCount");
        ha.b.b(hc8Var, lb3Var, Integer.valueOf(cVar2.b));
        hc8Var.u0("firstInteractionTimestamp");
        mb3 mb3Var = nmf.a;
        lb3Var.e(mb3Var).b(hc8Var, lb3Var, cVar2.c);
        hc8Var.u0("lastInteractionTimestamp");
        lb3Var.e(mb3Var).b(hc8Var, lb3Var, cVar2.d);
    }
}
