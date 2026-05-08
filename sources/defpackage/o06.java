package defpackage;

import defpackage.ha;
import defpackage.l06;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o06 implements ga<l06.b> {
    public static final o06 a = new o06();
    public static final List<String> b = u63.Z("conversation");

    @Override // defpackage.ga
    public final l06.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        l06.a aVar = null;
        while (mb8Var.D1(b) == 0) {
            n06 n06Var = n06.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(n06Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            aVar = (l06.a) objA;
        }
        return new l06.b(aVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, l06.b bVar) {
        l06.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("conversation");
        n06 n06Var = n06.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(n06Var, false);
        l06.a aVar = bVar2.a;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
    }
}
