package defpackage;

import defpackage.jo4;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class oo4 implements ga<jo4.d> {
    public static final oo4 a = new oo4();
    public static final List<String> b = u63.Z("sectionId");

    @Override // defpackage.ga
    public final jo4.d a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        while (mb8Var.D1(b) == 0) {
            strA = ha.i.a(mb8Var, lb3Var);
        }
        return new jo4.d(strA);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, jo4.d dVar) {
        jo4.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("sectionId");
        ha.i.b(hc8Var, lb3Var, dVar2.a);
    }
}
