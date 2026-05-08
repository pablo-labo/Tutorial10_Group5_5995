package defpackage;

import defpackage.ha;
import defpackage.ic5;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class oc5 implements ga<ic5.e> {
    public static final oc5 a = new oc5();
    public static final List<String> b = u63.a0("id", "label");

    @Override // defpackage.ga
    public final ic5.e a(mb8 mb8Var, lb3 lb3Var) {
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
            mh2.q(mb8Var, "id");
            throw null;
        }
        if (str2 != null) {
            return new ic5.e(str, str2);
        }
        mh2.q(mb8Var, "label");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ic5.e eVar) {
        ic5.e eVar2 = eVar;
        hc8Var.getClass();
        lb3Var.getClass();
        eVar2.getClass();
        hc8Var.u0("id");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, eVar2.a);
        hc8Var.u0("label");
        gVar.b(hc8Var, lb3Var, eVar2.b);
    }
}
