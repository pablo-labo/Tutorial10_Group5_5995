package defpackage;

import defpackage.nx3;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qx3 implements ga<nx3.b> {
    public static final qx3 a = new qx3();
    public static final List<String> b = u63.Z("resumeId");

    @Override // defpackage.ga
    public final nx3.b a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        if (str != null) {
            return new nx3.b(str);
        }
        mh2.q(mb8Var, "resumeId");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, nx3.b bVar) {
        nx3.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("resumeId");
        ha.a.b(hc8Var, lb3Var, bVar2.a);
    }
}
