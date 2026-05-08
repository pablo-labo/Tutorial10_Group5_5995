package defpackage;

import defpackage.ha;
import defpackage.rx7;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class sx7 implements ga<rx7.a> {
    public static final sx7 a = new sx7();
    public static final List<String> b = u63.a0("key", "label");

    @Override // defpackage.ga
    public final rx7.a a(mb8 mb8Var, lb3 lb3Var) {
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
        if (str == null) {
            mh2.q(mb8Var, "key");
            throw null;
        }
        if (str2 != null) {
            return new rx7.a(str, str2);
        }
        mh2.q(mb8Var, "label");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, rx7.a aVar) {
        rx7.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("key");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, aVar2.a);
        hc8Var.u0("label");
        gVar.b(hc8Var, lb3Var, aVar2.b);
    }
}
