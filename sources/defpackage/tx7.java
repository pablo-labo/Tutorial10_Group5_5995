package defpackage;

import defpackage.rx7;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class tx7 implements ga<rx7.b> {
    public static final tx7 a = new tx7();
    public static final List<String> b = u63.Z("formattedText");

    @Override // defpackage.ga
    public final rx7.b a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        while (mb8Var.D1(b) == 0) {
            strA = ha.i.a(mb8Var, lb3Var);
        }
        return new rx7.b(strA);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, rx7.b bVar) {
        rx7.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("formattedText");
        ha.i.b(hc8Var, lb3Var, bVar2.a);
    }
}
