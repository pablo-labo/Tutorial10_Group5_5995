package defpackage;

import defpackage.sd5;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wd5 implements ga<sd5.c> {
    public static final wd5 a = new wd5();
    public static final List<String> b = u63.Z("text");

    @Override // defpackage.ga
    public final sd5.c a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        if (str != null) {
            return new sd5.c(str);
        }
        mh2.q(mb8Var, "text");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, sd5.c cVar) {
        sd5.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("text");
        ha.a.b(hc8Var, lb3Var, cVar2.a);
    }
}
