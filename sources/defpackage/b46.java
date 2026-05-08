package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.s36;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class b46 implements ga<s36.h> {
    public static final b46 a = new b46();
    public static final List<String> b = u63.Z("sourcingElection");

    @Override // defpackage.ga
    public final s36.h a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        r48 r48Var = null;
        while (mb8Var.D1(b) == 0) {
            ha.g gVar = ha.a;
            s48 s48Var = s48.a;
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = s48Var.a(mb8Var, lb3Var);
            }
            r48Var = (r48) objA;
        }
        return new s36.h(r48Var);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, s36.h hVar) {
        s36.h hVar2 = hVar;
        hc8Var.getClass();
        lb3Var.getClass();
        hVar2.getClass();
        hc8Var.u0("sourcingElection");
        ha.g gVar = ha.a;
        s48 s48Var = s48.a;
        r48 r48Var = hVar2.a;
        if (r48Var == null) {
            hc8Var.H1();
        } else {
            s48Var.b(hc8Var, lb3Var, r48Var);
        }
    }
}
