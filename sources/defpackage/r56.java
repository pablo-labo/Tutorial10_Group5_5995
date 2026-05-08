package defpackage;

import defpackage.p56;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r56 implements ga<p56.a> {
    public static final r56 a = new r56();
    public static final List<String> b = u63.Z("key");

    @Override // defpackage.ga
    public final p56.a a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        if (str != null) {
            return new p56.a(str);
        }
        mh2.q(mb8Var, "key");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, p56.a aVar) {
        p56.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("key");
        ha.a.b(hc8Var, lb3Var, aVar2.a);
    }
}
