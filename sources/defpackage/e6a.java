package defpackage;

import defpackage.ha;
import defpackage.p5a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e6a implements ga<p5a.n> {
    public static final e6a a = new e6a();
    public static final List<String> b = u63.a0("name", "id");

    @Override // defpackage.ga
    public final p5a.n a(mb8 mb8Var, lb3 lb3Var) {
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
            mh2.q(mb8Var, "name");
            throw null;
        }
        if (str2 != null) {
            return new p5a.n(str, str2);
        }
        mh2.q(mb8Var, "id");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, p5a.n nVar) {
        p5a.n nVar2 = nVar;
        hc8Var.getClass();
        lb3Var.getClass();
        nVar2.getClass();
        hc8Var.u0("name");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, nVar2.a);
        hc8Var.u0("id");
        gVar.b(hc8Var, lb3Var, nVar2.b);
    }
}
