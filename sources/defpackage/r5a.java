package defpackage;

import defpackage.p5a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r5a implements ga<p5a.a> {
    public static final r5a a = new r5a();
    public static final List<String> b = u63.Z("formattedText");

    @Override // defpackage.ga
    public final p5a.a a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        while (mb8Var.D1(b) == 0) {
            strA = ha.i.a(mb8Var, lb3Var);
        }
        return new p5a.a(strA);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, p5a.a aVar) {
        p5a.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("formattedText");
        ha.i.b(hc8Var, lb3Var, aVar2.a);
    }
}
