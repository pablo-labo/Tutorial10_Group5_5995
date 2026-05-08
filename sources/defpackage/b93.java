package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.w83;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class b93 implements ga<w83.b> {
    public static final b93 a = new b93();
    public static final List<String> b = u63.Z("currentJobSeekerResponsiveness");

    @Override // defpackage.ga
    public final w83.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        w83.a aVar = null;
        while (mb8Var.D1(b) == 0) {
            a93 a93Var = a93.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(a93Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            aVar = (w83.a) objA;
        }
        return new w83.b(aVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, w83.b bVar) {
        w83.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("currentJobSeekerResponsiveness");
        a93 a93Var = a93.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(a93Var, false);
        w83.a aVar = bVar2.a;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
    }
}
