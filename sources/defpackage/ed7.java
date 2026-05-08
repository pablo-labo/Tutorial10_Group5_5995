package defpackage;

import defpackage.wc7;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ed7 implements ga<wc7.g> {
    public static final ed7 a = new ed7();
    public static final List<String> b = u63.Z("globalUnreadEventCount");

    @Override // defpackage.ga
    public final wc7.g a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        Integer num = null;
        while (mb8Var.D1(b) == 0) {
            num = (Integer) ha.b.a(mb8Var, lb3Var);
        }
        if (num != null) {
            return new wc7.g(num.intValue());
        }
        mh2.q(mb8Var, "globalUnreadEventCount");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, wc7.g gVar) {
        wc7.g gVar2 = gVar;
        hc8Var.getClass();
        lb3Var.getClass();
        gVar2.getClass();
        hc8Var.u0("globalUnreadEventCount");
        ha.b.b(hc8Var, lb3Var, Integer.valueOf(gVar2.a));
    }
}
