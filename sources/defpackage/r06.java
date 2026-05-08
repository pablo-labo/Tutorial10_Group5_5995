package defpackage;

import defpackage.ha;
import defpackage.l06;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class r06 implements ga<l06.e> {
    public static final r06 a = new r06();
    public static final List<String> b = u63.a0("strippedHtml", "subject");

    @Override // defpackage.ga
    public final l06.e a(mb8 mb8Var, lb3 lb3Var) {
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
            mh2.q(mb8Var, "strippedHtml");
            throw null;
        }
        if (str2 != null) {
            return new l06.e(str, str2);
        }
        mh2.q(mb8Var, "subject");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, l06.e eVar) {
        l06.e eVar2 = eVar;
        hc8Var.getClass();
        lb3Var.getClass();
        eVar2.getClass();
        hc8Var.u0("strippedHtml");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, eVar2.a);
        hc8Var.u0("subject");
        gVar.b(hc8Var, lb3Var, eVar2.b);
    }
}
