package defpackage;

import defpackage.ha;
import defpackage.s1h;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class u1h implements ga<s1h.b> {
    public static final u1h a = new u1h();
    public static final List<String> b = u63.a0("id", "label");

    @Override // defpackage.ga
    public final s1h.b a(mb8 mb8Var, lb3 lb3Var) {
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
            return new s1h.b(str, str2);
        }
        mh2.q(mb8Var, "label");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, s1h.b bVar) {
        s1h.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("id");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, bVar2.a);
        hc8Var.u0("label");
        gVar.b(hc8Var, lb3Var, bVar2.b);
    }
}
