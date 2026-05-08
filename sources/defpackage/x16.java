package defpackage;

import defpackage.ha;
import defpackage.q16;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class x16 implements ga<q16.f> {
    public static final x16 a = new x16();
    public static final List<String> b = u63.a0("url", "metadata");

    @Override // defpackage.ga
    public final q16.f a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        q16.d dVar = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                str = (String) ha.a.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 1) {
                    break;
                }
                v16 v16Var = v16.a;
                ha.g gVar = ha.a;
                dVar = (q16.d) new ena(v16Var, false).a(mb8Var, lb3Var);
            }
        }
        if (str == null) {
            mh2.q(mb8Var, "url");
            throw null;
        }
        if (dVar != null) {
            return new q16.f(str, dVar);
        }
        mh2.q(mb8Var, "metadata");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, q16.f fVar) {
        q16.f fVar2 = fVar;
        hc8Var.getClass();
        lb3Var.getClass();
        fVar2.getClass();
        hc8Var.u0("url");
        ha.a.b(hc8Var, lb3Var, fVar2.a);
        hc8Var.u0("metadata");
        v16 v16Var = v16.a;
        q16.d dVar = fVar2.b;
        hc8Var.j();
        v16Var.b(hc8Var, lb3Var, dVar);
        hc8Var.t();
    }
}
