package defpackage;

import defpackage.ha;
import defpackage.rx7;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class wx7 implements ga<rx7.e> {
    public static final wx7 a = new wx7();
    public static final List<String> b = u63.a0("short", "long");

    @Override // defpackage.ga
    public final rx7.e a(mb8 mb8Var, lb3 lb3Var) {
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
            mh2.q(mb8Var, "short");
            throw null;
        }
        if (str2 != null) {
            return new rx7.e(str, str2);
        }
        mh2.q(mb8Var, "long");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, rx7.e eVar) {
        rx7.e eVar2 = eVar;
        hc8Var.getClass();
        lb3Var.getClass();
        eVar2.getClass();
        hc8Var.u0("short");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, eVar2.a);
        hc8Var.u0("long");
        gVar.b(hc8Var, lb3Var, eVar2.b);
    }
}
