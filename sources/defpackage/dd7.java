package defpackage;

import defpackage.ha;
import defpackage.wc7;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class dd7 implements ga<wc7.f> {
    public static final dd7 a = new dd7();
    public static final List<String> b = u63.a0("emailAddress", "isVerified");

    @Override // defpackage.ga
    public final wc7.f a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        Object objA = null;
        Boolean bool = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                objA = ha.g.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 1) {
                    break;
                }
                bool = (Boolean) ha.f.a(mb8Var, lb3Var);
            }
        }
        if (objA == null) {
            mh2.q(mb8Var, "emailAddress");
            throw null;
        }
        if (bool != null) {
            return new wc7.f(objA, bool.booleanValue());
        }
        mh2.q(mb8Var, "isVerified");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, wc7.f fVar) {
        wc7.f fVar2 = fVar;
        hc8Var.getClass();
        lb3Var.getClass();
        fVar2.getClass();
        hc8Var.u0("emailAddress");
        ha.g gVar = ha.a;
        f.a(hc8Var, fVar2.a);
        hc8Var.u0("isVerified");
        ha.f.b(hc8Var, lb3Var, Boolean.valueOf(fVar2.b));
    }
}
