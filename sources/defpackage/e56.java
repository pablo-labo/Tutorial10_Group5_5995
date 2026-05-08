package defpackage;

import defpackage.y46;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e56 implements ga<y46.e> {
    public static final e56 a = new e56();
    public static final List<String> b = u63.Z("timeMinutes");

    @Override // defpackage.ga
    public final y46.e a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        Integer numA = null;
        while (mb8Var.D1(b) == 0) {
            numA = ha.k.a(mb8Var, lb3Var);
        }
        return new y46.e(numA);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, y46.e eVar) {
        y46.e eVar2 = eVar;
        hc8Var.getClass();
        lb3Var.getClass();
        eVar2.getClass();
        hc8Var.u0("timeMinutes");
        ha.k.b(hc8Var, lb3Var, eVar2.a);
    }
}
