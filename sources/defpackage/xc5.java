package defpackage;

import defpackage.ha;
import defpackage.vc5;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class xc5 implements ga<vc5.a> {
    public static final xc5 a = new xc5();
    public static final List<String> b = u63.a0("__typename", "id");

    @Override // defpackage.ga
    public final vc5.a a(mb8 mb8Var, lb3 lb3Var) {
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
        jv2 jv2VarC = kv2.c(mb8Var, lb3Var);
        if (str == null) {
            mh2.q(mb8Var, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new vc5.a(str, str2, jv2VarC);
        }
        mh2.q(mb8Var, "id");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, vc5.a aVar) {
        vc5.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("__typename");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, aVar2.a);
        hc8Var.u0("id");
        gVar.b(hc8Var, lb3Var, aVar2.b);
        List<String> list = kv2.a;
        kv2.d(hc8Var, lb3Var, aVar2.c);
    }
}
