package defpackage;

import defpackage.ha;
import defpackage.z16;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b26 implements ga<z16.a> {
    public static final b26 a = new b26();
    public static final List<String> b = u63.Z("jobData");

    @Override // defpackage.ga
    public final z16.a a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        z16.c cVar = null;
        while (mb8Var.D1(b) == 0) {
            d26 d26Var = d26.a;
            ha.g gVar = ha.a;
            cVar = (z16.c) new ena(d26Var, false).a(mb8Var, lb3Var);
        }
        if (cVar != null) {
            return new z16.a(cVar);
        }
        mh2.q(mb8Var, "jobData");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, z16.a aVar) {
        z16.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("jobData");
        d26 d26Var = d26.a;
        ha.g gVar = ha.a;
        z16.c cVar = aVar2.a;
        hc8Var.j();
        d26Var.b(hc8Var, lb3Var, cVar);
        hc8Var.t();
    }
}
