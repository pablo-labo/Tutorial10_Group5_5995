package defpackage;

import defpackage.j43;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class q43 implements ga<j43.b> {
    public static final q43 a = new q43();
    public static final List<String> b = u63.a0("url", "iaUid");

    @Override // defpackage.ga
    public final j43.b a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        String str2 = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                str = (String) lb3Var.e(qwg.a).a(mb8Var, lb3Var);
            } else {
                if (iD1 != 1) {
                    break;
                }
                str2 = (String) ha.a.a(mb8Var, lb3Var);
            }
        }
        if (str == null) {
            mh2.q(mb8Var, "url");
            throw null;
        }
        if (str2 != null) {
            return new j43.b(str, str2);
        }
        mh2.q(mb8Var, "iaUid");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, j43.b bVar) {
        j43.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("url");
        lb3Var.e(qwg.a).b(hc8Var, lb3Var, bVar2.a);
        hc8Var.u0("iaUid");
        ha.a.b(hc8Var, lb3Var, bVar2.b);
    }
}
