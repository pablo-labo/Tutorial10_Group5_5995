package defpackage;

import defpackage.f52;
import defpackage.ha;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h52 implements ga<f52.a> {
    public static final h52 a = new h52();
    public static final List<String> b = u63.Z("slug");

    @Override // defpackage.ga
    public final f52.a a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        Object objA = null;
        while (mb8Var.D1(b) == 0) {
            objA = ha.g.a(mb8Var, lb3Var);
        }
        if (objA != null) {
            return new f52.a(objA);
        }
        mh2.q(mb8Var, "slug");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, f52.a aVar) {
        f52.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("slug");
        ha.g gVar = ha.a;
        f.a(hc8Var, aVar2.a);
    }
}
