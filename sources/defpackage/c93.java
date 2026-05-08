package defpackage;

import defpackage.ha;
import defpackage.w83;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c93 implements ga<w83.c> {
    public static final c93 a = new c93();
    public static final List<String> b = u63.a0("messagingResponseRate", "outreachesReceivedCount", "outreachesRespondedCount");

    @Override // defpackage.ga
    public final w83.c a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        Double dA = null;
        Integer num = null;
        Integer num2 = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                dA = ha.j.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                num = (Integer) ha.b.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 2) {
                    break;
                }
                num2 = (Integer) ha.b.a(mb8Var, lb3Var);
            }
        }
        if (num == null) {
            mh2.q(mb8Var, "outreachesReceivedCount");
            throw null;
        }
        int iIntValue = num.intValue();
        if (num2 != null) {
            return new w83.c(dA, iIntValue, num2.intValue());
        }
        mh2.q(mb8Var, "outreachesRespondedCount");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, w83.c cVar) {
        w83.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("messagingResponseRate");
        ha.j.b(hc8Var, lb3Var, cVar2.a);
        hc8Var.u0("outreachesReceivedCount");
        ha.e eVar = ha.b;
        eVar.b(hc8Var, lb3Var, Integer.valueOf(cVar2.b));
        hc8Var.u0("outreachesRespondedCount");
        eVar.b(hc8Var, lb3Var, Integer.valueOf(cVar2.c));
    }
}
