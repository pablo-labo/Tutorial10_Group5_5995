package defpackage;

import defpackage.ha;
import defpackage.k43;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class p43 implements ga<k43.b> {
    public static final p43 a = new p43();
    public static final List<String> b = u63.a0("url", "iaUid");

    @Override // defpackage.ga
    public final k43.b a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        Object objA = null;
        String str = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                objA = ha.g.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 1) {
                    break;
                }
                str = (String) ha.a.a(mb8Var, lb3Var);
            }
        }
        if (objA == null) {
            mh2.q(mb8Var, "url");
            throw null;
        }
        if (str != null) {
            return new k43.b(objA, str);
        }
        mh2.q(mb8Var, "iaUid");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, k43.b bVar) {
        k43.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("url");
        ha.g gVar = ha.a;
        f.a(hc8Var, bVar2.a);
        hc8Var.u0("iaUid");
        ha.a.b(hc8Var, lb3Var, bVar2.b);
    }
}
