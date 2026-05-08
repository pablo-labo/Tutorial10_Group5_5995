package defpackage;

import defpackage.s1h;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t1h implements ga<s1h.a> {
    public static final t1h a = new t1h();
    public static final List<String> b = u63.Z("leverId");

    @Override // defpackage.ga
    public final s1h.a a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        if (str != null) {
            return new s1h.a(str);
        }
        mh2.q(mb8Var, "leverId");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, s1h.a aVar) {
        s1h.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("leverId");
        ha.a.b(hc8Var, lb3Var, aVar2.a);
    }
}
