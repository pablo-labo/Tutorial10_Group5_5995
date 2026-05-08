package defpackage;

import defpackage.g66;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j66 implements ga<g66.b> {
    public static final j66 a = new j66();
    public static final List<String> b = u63.Z("unreadConversationCount");

    @Override // defpackage.ga
    public final g66.b a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        Integer num = null;
        while (mb8Var.D1(b) == 0) {
            num = (Integer) ha.b.a(mb8Var, lb3Var);
        }
        if (num != null) {
            return new g66.b(num.intValue());
        }
        mh2.q(mb8Var, "unreadConversationCount");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, g66.b bVar) {
        g66.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("unreadConversationCount");
        ha.b.b(hc8Var, lb3Var, Integer.valueOf(bVar2.a));
    }
}
