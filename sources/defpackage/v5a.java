package defpackage;

import defpackage.p5a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class v5a implements ga<p5a.e> {
    public static final v5a a = new v5a();
    public static final List<String> b = u63.Z("name");

    @Override // defpackage.ga
    public final p5a.e a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        while (mb8Var.D1(b) == 0) {
            strA = ha.i.a(mb8Var, lb3Var);
        }
        return new p5a.e(strA);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, p5a.e eVar) {
        p5a.e eVar2 = eVar;
        hc8Var.getClass();
        lb3Var.getClass();
        eVar2.getClass();
        hc8Var.u0("name");
        ha.i.b(hc8Var, lb3Var, eVar2.a);
    }
}
