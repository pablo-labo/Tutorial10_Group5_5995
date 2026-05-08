package defpackage;

import defpackage.e46;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j46 implements ga<e46.d> {
    public static final j46 a = new j46();
    public static final List<String> b = u63.Z("jobSeekerProfile");

    @Override // defpackage.ga
    public final e46.d a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        e46.g gVar = null;
        while (mb8Var.D1(b) == 0) {
            m46 m46Var = m46.a;
            ha.g gVar2 = ha.a;
            ena enaVar = new ena(m46Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            gVar = (e46.g) objA;
        }
        return new e46.d(gVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, e46.d dVar) {
        e46.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("jobSeekerProfile");
        m46 m46Var = m46.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(m46Var, false);
        e46.g gVar2 = dVar2.a;
        if (gVar2 == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, gVar2);
        }
    }
}
