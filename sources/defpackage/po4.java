package defpackage;

import defpackage.jo4;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class po4 implements ga<jo4.e> {
    public static final po4 a = new po4();
    public static final List<String> b = u63.Z("sectionId");

    @Override // defpackage.ga
    public final jo4.e a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        while (mb8Var.D1(b) == 0) {
            strA = ha.i.a(mb8Var, lb3Var);
        }
        return new jo4.e(strA);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, jo4.e eVar) {
        jo4.e eVar2 = eVar;
        hc8Var.getClass();
        lb3Var.getClass();
        eVar2.getClass();
        hc8Var.u0("sectionId");
        ha.i.b(hc8Var, lb3Var, eVar2.a);
    }
}
