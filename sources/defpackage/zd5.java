package defpackage;

import defpackage.sd5;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zd5 implements ga<sd5.f> {
    public static final zd5 a = new zd5();
    public static final List<String> b = u63.Z("short");

    @Override // defpackage.ga
    public final sd5.f a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        if (str != null) {
            return new sd5.f(str);
        }
        mh2.q(mb8Var, "short");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, sd5.f fVar) {
        sd5.f fVar2 = fVar;
        hc8Var.getClass();
        lb3Var.getClass();
        fVar2.getClass();
        hc8Var.u0("short");
        ha.a.b(hc8Var, lb3Var, fVar2.a);
    }
}
