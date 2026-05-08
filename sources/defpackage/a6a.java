package defpackage;

import defpackage.p5a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a6a implements ga<p5a.j> {
    public static final a6a a = new a6a();
    public static final List<String> b = u63.a0("key", "label");

    @Override // defpackage.ga
    public final p5a.j a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        String strA2 = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 1) {
                    return new p5a.j(strA, strA2);
                }
                strA2 = ha.i.a(mb8Var, lb3Var);
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, p5a.j jVar) {
        p5a.j jVar2 = jVar;
        hc8Var.getClass();
        lb3Var.getClass();
        jVar2.getClass();
        hc8Var.u0("key");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, jVar2.a);
        hc8Var.u0("label");
        nmaVar.b(hc8Var, lb3Var, jVar2.b);
    }
}
