package defpackage;

import defpackage.ha;
import defpackage.y56;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e66 implements ga<y56.e> {
    public static final e66 a = new e66();
    public static final List<String> b = u63.a0("userInteractionType", "userInteractionTarget", "contextKey");

    @Override // defpackage.ga
    public final y56.e a(mb8 mb8Var, lb3 lb3Var) {
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
            mh2.q(mb8Var, "userInteractionType");
            throw null;
        }
        if (str2 == null) {
            mh2.q(mb8Var, "userInteractionTarget");
            throw null;
        }
        if (str3 != null) {
            return new y56.e(str, str2, str3);
        }
        mh2.q(mb8Var, "contextKey");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, y56.e eVar) {
        y56.e eVar2 = eVar;
        hc8Var.getClass();
        lb3Var.getClass();
        eVar2.getClass();
        hc8Var.u0("userInteractionType");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, eVar2.a);
        hc8Var.u0("userInteractionTarget");
        gVar.b(hc8Var, lb3Var, eVar2.b);
        hc8Var.u0("contextKey");
        gVar.b(hc8Var, lb3Var, eVar2.c);
    }
}
