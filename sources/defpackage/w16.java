package defpackage;

import defpackage.ha;
import defpackage.q16;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w16 implements ga<q16.e> {
    public static final w16 a = new w16();
    public static final List<String> b = u63.a0("url", "metadata");

    @Override // defpackage.ga
    public final q16.e a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        q16.c cVar = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                str = (String) ha.a.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 1) {
                    break;
                }
                u16 u16Var = u16.a;
                ha.g gVar = ha.a;
                cVar = (q16.c) new ena(u16Var, false).a(mb8Var, lb3Var);
            }
        }
        if (str == null) {
            mh2.q(mb8Var, "url");
            throw null;
        }
        if (cVar != null) {
            return new q16.e(str, cVar);
        }
        mh2.q(mb8Var, "metadata");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, q16.e eVar) {
        q16.e eVar2 = eVar;
        hc8Var.getClass();
        lb3Var.getClass();
        eVar2.getClass();
        hc8Var.u0("url");
        ha.a.b(hc8Var, lb3Var, eVar2.a);
        hc8Var.u0("metadata");
        u16 u16Var = u16.a;
        q16.c cVar = eVar2.b;
        hc8Var.j();
        u16Var.b(hc8Var, lb3Var, cVar);
        hc8Var.t();
    }
}
