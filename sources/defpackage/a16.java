package defpackage;

import defpackage.ha;
import defpackage.t06;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a16 implements ga<t06.f> {
    public static final a16 a = new a16();
    public static final List<String> b = u63.Z("job");

    @Override // defpackage.ga
    public final t06.f a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        t06.d dVar = null;
        while (mb8Var.D1(b) == 0) {
            y06 y06Var = y06.a;
            ha.g gVar = ha.a;
            dVar = (t06.d) new ena(y06Var, false).a(mb8Var, lb3Var);
        }
        if (dVar != null) {
            return new t06.f(dVar);
        }
        mh2.q(mb8Var, "job");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, t06.f fVar) {
        t06.f fVar2 = fVar;
        hc8Var.getClass();
        lb3Var.getClass();
        fVar2.getClass();
        hc8Var.u0("job");
        y06 y06Var = y06.a;
        ha.g gVar = ha.a;
        t06.d dVar = fVar2.a;
        hc8Var.j();
        y06Var.b(hc8Var, lb3Var, dVar);
        hc8Var.t();
    }
}
