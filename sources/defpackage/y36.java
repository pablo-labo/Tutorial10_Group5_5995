package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.s36;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class y36 implements ga<s36.e> {
    public static final y36 a = new y36();
    public static final List<String> b = u63.Z("profile");

    @Override // defpackage.ga
    public final s36.e a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        s36.i iVar = null;
        while (mb8Var.D1(b) == 0) {
            c46 c46Var = c46.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(c46Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            iVar = (s36.i) objA;
        }
        return new s36.e(iVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, s36.e eVar) {
        s36.e eVar2 = eVar;
        hc8Var.getClass();
        lb3Var.getClass();
        eVar2.getClass();
        hc8Var.u0("profile");
        c46 c46Var = c46.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(c46Var, false);
        s36.i iVar = eVar2.a;
        if (iVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, iVar);
        }
    }
}
