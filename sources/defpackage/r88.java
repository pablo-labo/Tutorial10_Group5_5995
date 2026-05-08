package defpackage;

import defpackage.ha;
import defpackage.j88;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r88 implements ga<j88.g> {
    public static final r88 a = new r88();
    public static final List<String> b = u63.a0("name", "url");

    @Override // defpackage.ga
    public final j88.g a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        Object objA = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                str = (String) ha.a.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 1) {
                    break;
                }
                objA = ha.g.a(mb8Var, lb3Var);
            }
        }
        if (str == null) {
            mh2.q(mb8Var, "name");
            throw null;
        }
        if (objA != null) {
            return new j88.g(objA, str);
        }
        mh2.q(mb8Var, "url");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, j88.g gVar) {
        j88.g gVar2 = gVar;
        hc8Var.getClass();
        lb3Var.getClass();
        gVar2.getClass();
        hc8Var.u0("name");
        ha.a.b(hc8Var, lb3Var, gVar2.a);
        hc8Var.u0("url");
        ha.g gVar3 = ha.a;
        f.a(hc8Var, gVar2.b);
    }
}
