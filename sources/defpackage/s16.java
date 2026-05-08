package defpackage;

import defpackage.ha;
import defpackage.q16;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class s16 implements ga<q16.a> {
    public static final s16 a = new s16();
    public static final List<String> b = u63.Z("jobSeekerResumes");

    @Override // defpackage.ga
    public final q16.a a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        q16.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            t16 t16Var = t16.a;
            ha.g gVar = ha.a;
            bVar = (q16.b) new ena(t16Var, false).a(mb8Var, lb3Var);
        }
        if (bVar != null) {
            return new q16.a(bVar);
        }
        mh2.q(mb8Var, "jobSeekerResumes");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, q16.a aVar) {
        q16.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("jobSeekerResumes");
        t16 t16Var = t16.a;
        ha.g gVar = ha.a;
        q16.b bVar = aVar2.a;
        hc8Var.j();
        t16Var.b(hc8Var, lb3Var, bVar);
        hc8Var.t();
    }
}
