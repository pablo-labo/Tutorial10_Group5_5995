package defpackage;

import defpackage.g16;
import defpackage.ha;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i16 implements ga<g16.a> {
    public static final i16 a = new i16();
    public static final List<String> b = u63.Z("jobSeekerProfileDualResumesEnabled");

    @Override // defpackage.ga
    public final g16.a a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        g16.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            j16 j16Var = j16.a;
            ha.g gVar = ha.a;
            bVar = (g16.b) new ena(j16Var, false).a(mb8Var, lb3Var);
        }
        if (bVar != null) {
            return new g16.a(bVar);
        }
        mh2.q(mb8Var, "jobSeekerProfileDualResumesEnabled");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, g16.a aVar) {
        g16.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("jobSeekerProfileDualResumesEnabled");
        j16 j16Var = j16.a;
        ha.g gVar = ha.a;
        g16.b bVar = aVar2.a;
        hc8Var.j();
        j16Var.b(hc8Var, lb3Var, bVar);
        hc8Var.t();
    }
}
