package defpackage;

import defpackage.om;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vm implements ga<om.f> {
    public static final vm a = new vm();
    public static final List<String> b = u63.Z("id");

    @Override // defpackage.ga
    public final om.f a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        if (str != null) {
            return new om.f(str);
        }
        mh2.q(mb8Var, "id");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, om.f fVar) {
        om.f fVar2 = fVar;
        hc8Var.getClass();
        lb3Var.getClass();
        fVar2.getClass();
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, fVar2.a);
    }
}
