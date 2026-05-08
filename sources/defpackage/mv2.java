package defpackage;

import defpackage.ha;
import defpackage.jv2;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mv2 implements ga<jv2.b> {
    public static final mv2 a = new mv2();
    public static final List<String> b = u63.a0("__typename", "id");

    @Override // defpackage.ga
    public final jv2.b a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        String str2 = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                str = (String) ha.a.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 1) {
                    break;
                }
                str2 = (String) ha.a.a(mb8Var, lb3Var);
            }
        }
        mb8Var.k();
        jk8 jk8VarC = mk8.c(mb8Var, lb3Var);
        if (str == null) {
            mh2.q(mb8Var, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new jv2.b(str, str2, jk8VarC);
        }
        mh2.q(mb8Var, "id");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, jv2.b bVar) {
        jv2.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("__typename");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, bVar2.a);
        hc8Var.u0("id");
        gVar.b(hc8Var, lb3Var, bVar2.b);
        List<String> list = mk8.a;
        mk8.d(hc8Var, lb3Var, bVar2.c);
    }
}
