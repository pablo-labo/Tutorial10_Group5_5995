package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.s36;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class v36 implements ga<s36.b> {
    public static final v36 a = new v36();
    public static final List<String> b = u63.Z("jobSeekerProfile");

    @Override // defpackage.ga
    public final s36.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        s36.e eVar = null;
        while (mb8Var.D1(b) == 0) {
            y36 y36Var = y36.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(y36Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            eVar = (s36.e) objA;
        }
        return new s36.b(eVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, s36.b bVar) {
        s36.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("jobSeekerProfile");
        y36 y36Var = y36.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(y36Var, false);
        s36.e eVar = bVar2.a;
        if (eVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, eVar);
        }
    }
}
