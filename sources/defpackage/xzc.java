package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.vzc;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xzc implements ga<vzc.a> {
    public static final xzc a = new xzc();
    public static final List<String> b = u63.Z("remainingTopChoices");

    @Override // defpackage.ga
    public final vzc.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        vzc.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            yzc yzcVar = yzc.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(yzcVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            bVar = (vzc.b) objA;
        }
        return new vzc.a(bVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, vzc.a aVar) {
        vzc.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("remainingTopChoices");
        yzc yzcVar = yzc.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(yzcVar, false);
        vzc.b bVar = aVar2.a;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
    }
}
