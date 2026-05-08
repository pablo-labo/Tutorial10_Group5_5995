package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.p56;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class s56 implements ga<p56.b> {
    public static final s56 a = new s56();
    public static final List<String> b = u63.Z("taxonomyConcepts");

    @Override // defpackage.ga
    public final p56.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        p56.e eVar = null;
        while (mb8Var.D1(b) == 0) {
            v56 v56Var = v56.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(v56Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            eVar = (p56.e) objA;
        }
        return new p56.b(eVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, p56.b bVar) {
        p56.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("taxonomyConcepts");
        v56 v56Var = v56.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(v56Var, false);
        p56.e eVar = bVar2.a;
        if (eVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, eVar);
        }
    }
}
