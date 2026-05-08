package defpackage;

import defpackage.ha;
import defpackage.v26;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class x26 implements ga<v26.a> {
    public static final x26 a = new x26();
    public static final List<String> b = u63.a0("id", "label", "suid");

    @Override // defpackage.ga
    public final v26.a a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                str = (String) ha.a.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                str2 = (String) ha.a.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 2) {
                    break;
                }
                str3 = (String) ha.a.a(mb8Var, lb3Var);
            }
        }
        if (str == null) {
            mh2.q(mb8Var, "id");
            throw null;
        }
        if (str2 == null) {
            mh2.q(mb8Var, "label");
            throw null;
        }
        if (str3 != null) {
            return new v26.a(str, str2, str3);
        }
        mh2.q(mb8Var, "suid");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, v26.a aVar) {
        v26.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("id");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, aVar2.a);
        hc8Var.u0("label");
        gVar.b(hc8Var, lb3Var, aVar2.b);
        hc8Var.u0("suid");
        gVar.b(hc8Var, lb3Var, aVar2.c);
    }
}
