package defpackage;

import defpackage.t06;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class v06 implements ga<t06.a> {
    public static final v06 a = new v06();
    public static final List<String> b = u63.Z("url");

    @Override // defpackage.ga
    public final t06.a a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        if (str != null) {
            return new t06.a(str);
        }
        mh2.q(mb8Var, "url");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, t06.a aVar) {
        t06.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("url");
        ha.a.b(hc8Var, lb3Var, aVar2.a);
    }
}
