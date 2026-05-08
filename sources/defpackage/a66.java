package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.y56;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a66 implements ga<y56.a> {
    public static final a66 a = new a66();
    public static final List<String> b = u63.Z("findUserDisplayPreference");

    @Override // defpackage.ga
    public final y56.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        y56.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            b66 b66Var = b66.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(b66Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            bVar = (y56.b) objA;
        }
        return new y56.a(bVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, y56.a aVar) {
        y56.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("findUserDisplayPreference");
        b66 b66Var = b66.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(b66Var, false);
        y56.b bVar = aVar2.a;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
    }
}
