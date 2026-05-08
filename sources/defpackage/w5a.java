package defpackage;

import defpackage.p5a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w5a implements ga<p5a.f> {
    public static final w5a a = new w5a();
    public static final List<String> b = u63.Z("long");

    @Override // defpackage.ga
    public final p5a.f a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        while (mb8Var.D1(b) == 0) {
            strA = ha.i.a(mb8Var, lb3Var);
        }
        return new p5a.f(strA);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, p5a.f fVar) {
        p5a.f fVar2 = fVar;
        hc8Var.getClass();
        lb3Var.getClass();
        fVar2.getClass();
        hc8Var.u0("long");
        ha.i.b(hc8Var, lb3Var, fVar2.a);
    }
}
