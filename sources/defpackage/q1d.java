package defpackage;

import defpackage.mb8;
import defpackage.n1d;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class q1d implements ga<n1d.b> {
    public static final q1d a = new q1d();
    public static final List<String> b = u63.Z("positivePreferenceAttributeIds");

    @Override // defpackage.ga
    public final n1d.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        List list = null;
        while (mb8Var.D1(b) == 0) {
            hy8 hy8Var = new hy8(ha.a);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = hy8Var.a(mb8Var, lb3Var);
            }
            list = (List) objA;
        }
        return new n1d.b(list);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, n1d.b bVar) {
        n1d.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("positivePreferenceAttributeIds");
        hy8 hy8Var = new hy8(ha.a);
        List<String> list = bVar2.a;
        if (list == null) {
            hc8Var.H1();
        } else {
            hy8Var.b(hc8Var, lb3Var, list);
        }
    }
}
