package defpackage;

import defpackage.m26;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class s26 implements ga<m26.e> {
    public static final s26 a = new s26();
    public static final List<String> b = u63.a0("offlineSeconds", "status");

    @Override // defpackage.ga
    public final m26.e a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        Integer numA = null;
        String str = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                numA = ha.k.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 1) {
                    break;
                }
                str = (String) ha.a.a(mb8Var, lb3Var);
            }
        }
        if (str != null) {
            return new m26.e(numA, str);
        }
        mh2.q(mb8Var, "status");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, m26.e eVar) {
        m26.e eVar2 = eVar;
        hc8Var.getClass();
        lb3Var.getClass();
        eVar2.getClass();
        hc8Var.u0("offlineSeconds");
        ha.k.b(hc8Var, lb3Var, eVar2.a);
        hc8Var.u0("status");
        ha.a.b(hc8Var, lb3Var, eVar2.b);
    }
}
