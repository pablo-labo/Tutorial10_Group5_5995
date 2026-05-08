package defpackage;

import defpackage.ha;
import defpackage.t06;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w06 implements ga<t06.b> {
    public static final w06 a = new w06();
    public static final List<String> b = u63.Z("jobData");

    @Override // defpackage.ga
    public final t06.b a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        t06.e eVar = null;
        while (mb8Var.D1(b) == 0) {
            z06 z06Var = z06.a;
            ha.g gVar = ha.a;
            eVar = (t06.e) new ena(z06Var, false).a(mb8Var, lb3Var);
        }
        if (eVar != null) {
            return new t06.b(eVar);
        }
        mh2.q(mb8Var, "jobData");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, t06.b bVar) {
        t06.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("jobData");
        z06 z06Var = z06.a;
        ha.g gVar = ha.a;
        t06.e eVar = bVar2.a;
        hc8Var.j();
        z06Var.b(hc8Var, lb3Var, eVar);
        hc8Var.t();
    }
}
