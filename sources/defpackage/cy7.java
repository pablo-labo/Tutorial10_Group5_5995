package defpackage;

import defpackage.ha;
import defpackage.rx7;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class cy7 implements ga<rx7.j> {
    public static final cy7 a = new cy7();
    public static final List<String> b = u63.a0("url64", "url128");

    @Override // defpackage.ga
    public final rx7.j a(mb8 mb8Var, lb3 lb3Var) {
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
            mh2.q(mb8Var, "url64");
            throw null;
        }
        if (str2 != null) {
            return new rx7.j(str, str2);
        }
        mh2.q(mb8Var, "url128");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, rx7.j jVar) {
        rx7.j jVar2 = jVar;
        hc8Var.getClass();
        lb3Var.getClass();
        jVar2.getClass();
        hc8Var.u0("url64");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, jVar2.a);
        hc8Var.u0("url128");
        gVar.b(hc8Var, lb3Var, jVar2.b);
    }
}
