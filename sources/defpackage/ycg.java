package defpackage;

import defpackage.vcg;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ycg implements ga<vcg.b> {
    public static final ycg a = new ycg();
    public static final List<String> b = u63.a0("id", "link");

    @Override // defpackage.ga
    public final vcg.b a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        String strA = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                str = (String) ha.a.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 1) {
                    break;
                }
                strA = ha.i.a(mb8Var, lb3Var);
            }
        }
        if (str != null) {
            return new vcg.b(str, strA);
        }
        mh2.q(mb8Var, "id");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, vcg.b bVar) {
        vcg.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, bVar2.a);
        hc8Var.u0("link");
        ha.i.b(hc8Var, lb3Var, bVar2.b);
    }
}
