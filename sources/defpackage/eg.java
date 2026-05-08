package defpackage;

import defpackage.ag;
import defpackage.ha;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class eg implements ga<ag.b> {
    public static final eg a = new eg();
    public static final List<String> b = u63.a0("id", "__typename");

    @Override // defpackage.ga
    public final ag.b a(mb8 mb8Var, lb3 lb3Var) {
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
            return new ag.b(str, str2);
        }
        mh2.q(mb8Var, "__typename");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ag.b bVar) {
        ag.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("id");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, bVar2.a);
        hc8Var.u0("__typename");
        gVar.b(hc8Var, lb3Var, bVar2.b);
    }
}
