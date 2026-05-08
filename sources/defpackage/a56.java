package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.y46;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a56 implements ga<y46.a> {
    public static final a56 a = new a56();
    public static final List<String> b = u63.Z("jobSeekerProfileStructuredData");

    @Override // defpackage.ga
    public final y46.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        y46.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            b56 b56Var = b56.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(b56Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            bVar = (y46.b) objA;
        }
        return new y46.a(bVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, y46.a aVar) {
        y46.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("jobSeekerProfileStructuredData");
        b56 b56Var = b56.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(b56Var, false);
        y46.b bVar = aVar2.a;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
    }
}
