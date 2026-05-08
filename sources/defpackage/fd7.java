package defpackage;

import defpackage.wc7;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fd7 implements ga<wc7.h> {
    public static final fd7 a = new fd7();
    public static final List<String> b = u63.Z("unreadConversationCount");

    @Override // defpackage.ga
    public final wc7.h a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        Integer num = null;
        while (mb8Var.D1(b) == 0) {
            num = (Integer) ha.b.a(mb8Var, lb3Var);
        }
        if (num != null) {
            return new wc7.h(num.intValue());
        }
        mh2.q(mb8Var, "unreadConversationCount");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, wc7.h hVar) {
        wc7.h hVar2 = hVar;
        hc8Var.getClass();
        lb3Var.getClass();
        hVar2.getClass();
        hc8Var.u0("unreadConversationCount");
        ha.b.b(hc8Var, lb3Var, Integer.valueOf(hVar2.a));
    }
}
