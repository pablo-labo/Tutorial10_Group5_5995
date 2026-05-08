package defpackage;

import defpackage.au3;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class du3 implements ga<au3.b> {
    public static final du3 a = new du3();
    public static final List<String> b = u63.Z("id");

    @Override // defpackage.ga
    public final au3.b a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        while (mb8Var.D1(b) == 0) {
            strA = ha.i.a(mb8Var, lb3Var);
        }
        return new au3.b(strA);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, au3.b bVar) {
        au3.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("id");
        ha.i.b(hc8Var, lb3Var, bVar2.a);
    }
}
