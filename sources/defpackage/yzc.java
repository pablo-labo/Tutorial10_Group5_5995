package defpackage;

import defpackage.vzc;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yzc implements ga<vzc.b> {
    public static final yzc a = new yzc();
    public static final List<String> b = u63.a0("amount", "nextAvailableTimestamp");

    @Override // defpackage.ga
    public final vzc.b a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        Integer num = null;
        Object objA = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                num = (Integer) ha.b.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 1) {
                    break;
                }
                objA = ha.m.a(mb8Var, lb3Var);
            }
        }
        if (num != null) {
            return new vzc.b(num.intValue(), objA);
        }
        mh2.q(mb8Var, "amount");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, vzc.b bVar) {
        vzc.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("amount");
        ha.b.b(hc8Var, lb3Var, Integer.valueOf(bVar2.a));
        hc8Var.u0("nextAvailableTimestamp");
        ha.m.b(hc8Var, lb3Var, bVar2.b);
    }
}
