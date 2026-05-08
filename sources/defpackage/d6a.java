package defpackage;

import defpackage.p5a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d6a implements ga<p5a.m> {
    public static final d6a a = new d6a();
    public static final List<String> b = u63.Z("id");

    @Override // defpackage.ga
    public final p5a.m a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        if (str != null) {
            return new p5a.m(str);
        }
        mh2.q(mb8Var, "id");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, p5a.m mVar) {
        p5a.m mVar2 = mVar;
        hc8Var.getClass();
        lb3Var.getClass();
        mVar2.getClass();
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, mVar2.a);
    }
}
