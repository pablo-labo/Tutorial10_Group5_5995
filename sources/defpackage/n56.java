package defpackage;

import defpackage.j56;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class n56 implements ga<j56.c> {
    public static final n56 a = new n56();
    public static final List<String> b = u63.a0("messageBody", "label");

    @Override // defpackage.ga
    public final j56.c a(mb8 mb8Var, lb3 lb3Var) {
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
            return new j56.c(str, strA);
        }
        mh2.q(mb8Var, "messageBody");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, j56.c cVar) {
        j56.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("messageBody");
        ha.a.b(hc8Var, lb3Var, cVar2.a);
        hc8Var.u0("label");
        ha.i.b(hc8Var, lb3Var, cVar2.b);
    }
}
