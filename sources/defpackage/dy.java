package defpackage;

import defpackage.ha;
import defpackage.ux;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class dy implements ga<ux.g> {
    public static final dy a = new dy();
    public static final List<String> b = u63.a0("userInteractionType", "userInteractionTarget", "contextKey");

    @Override // defpackage.ga
    public final ux.g a(mb8 mb8Var, lb3 lb3Var) {
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
            return new ux.g(str, str2, str3);
        }
        mh2.q(mb8Var, "contextKey");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ux.g gVar) {
        ux.g gVar2 = gVar;
        hc8Var.getClass();
        lb3Var.getClass();
        gVar2.getClass();
        hc8Var.u0("userInteractionType");
        ha.g gVar3 = ha.a;
        gVar3.b(hc8Var, lb3Var, gVar2.a);
        hc8Var.u0("userInteractionTarget");
        gVar3.b(hc8Var, lb3Var, gVar2.b);
        hc8Var.u0("contextKey");
        gVar3.b(hc8Var, lb3Var, gVar2.c);
    }
}
