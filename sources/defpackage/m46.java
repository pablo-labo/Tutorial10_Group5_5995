package defpackage;

import defpackage.e46;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class m46 implements ga<e46.g> {
    public static final m46 a = new m46();
    public static final List<String> b = u63.Z("profile");

    @Override // defpackage.ga
    public final e46.g a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        e46.m mVar = null;
        while (mb8Var.D1(b) == 0) {
            s46 s46Var = s46.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(s46Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            mVar = (e46.m) objA;
        }
        return new e46.g(mVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, e46.g gVar) {
        e46.g gVar2 = gVar;
        hc8Var.getClass();
        lb3Var.getClass();
        gVar2.getClass();
        hc8Var.u0("profile");
        s46 s46Var = s46.a;
        ha.g gVar3 = ha.a;
        ena enaVar = new ena(s46Var, false);
        e46.m mVar = gVar2.a;
        if (mVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, mVar);
        }
    }
}
