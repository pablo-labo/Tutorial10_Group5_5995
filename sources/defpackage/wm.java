package defpackage;

import defpackage.om;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wm implements ga<om.g> {
    public static final wm a = new wm();
    public static final List<String> b = u63.Z("id");

    @Override // defpackage.ga
    public final om.g a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        if (str != null) {
            return new om.g(str);
        }
        mh2.q(mb8Var, "id");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, om.g gVar) {
        om.g gVar2 = gVar;
        hc8Var.getClass();
        lb3Var.getClass();
        gVar2.getClass();
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, gVar2.a);
    }
}
