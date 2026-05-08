package defpackage;

import defpackage.ha;
import defpackage.j56;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class m56 implements ga<j56.b> {
    public static final m56 a = new m56();
    public static final List<String> b = u63.Z("AiMessaging");

    @Override // defpackage.ga
    public final j56.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        j56.a aVar = null;
        while (mb8Var.D1(b) == 0) {
            l56 l56Var = l56.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(l56Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            aVar = (j56.a) objA;
        }
        return new j56.b(aVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, j56.b bVar) {
        j56.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("AiMessaging");
        l56 l56Var = l56.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(l56Var, false);
        j56.a aVar = bVar2.a;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
    }
}
