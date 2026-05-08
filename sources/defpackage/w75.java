package defpackage;

import defpackage.o75;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class w75 implements ga<o75.g> {
    public static final w75 a = new w75();
    public static final List<String> b = u63.a0("iflColorReference", "iflIconName");

    @Override // defpackage.ga
    public final o75.g a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        String str = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 1) {
                    break;
                }
                str = (String) ha.a.a(mb8Var, lb3Var);
            }
        }
        if (str != null) {
            return new o75.g(strA, str);
        }
        mh2.q(mb8Var, "iflIconName");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, o75.g gVar) {
        o75.g gVar2 = gVar;
        hc8Var.getClass();
        lb3Var.getClass();
        gVar2.getClass();
        hc8Var.u0("iflColorReference");
        ha.i.b(hc8Var, lb3Var, gVar2.a);
        hc8Var.u0("iflIconName");
        ha.a.b(hc8Var, lb3Var, gVar2.b);
    }
}
