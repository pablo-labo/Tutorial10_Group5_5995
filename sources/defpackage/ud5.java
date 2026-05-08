package defpackage;

import defpackage.sd5;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ud5 implements ga<sd5.a> {
    public static final ud5 a = new ud5();
    public static final List<String> b = u63.a0("key", "formattedText");

    @Override // defpackage.ga
    public final sd5.a a(mb8 mb8Var, lb3 lb3Var) {
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
            return new sd5.a(str, strA);
        }
        mh2.q(mb8Var, "key");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, sd5.a aVar) {
        sd5.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("key");
        ha.a.b(hc8Var, lb3Var, aVar2.a);
        hc8Var.u0("formattedText");
        ha.i.b(hc8Var, lb3Var, aVar2.b);
    }
}
