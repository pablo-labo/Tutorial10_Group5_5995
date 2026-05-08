package defpackage;

import defpackage.ha;
import defpackage.j43;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o43 implements ga<j43.a> {
    public static final o43 a = new o43();
    public static final List<String> b = u63.Z("createApplyUrlFullParams");

    @Override // defpackage.ga
    public final j43.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        j43.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            q43 q43Var = q43.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(q43Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            bVar = (j43.b) objA;
        }
        return new j43.a(bVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, j43.a aVar) {
        j43.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("createApplyUrlFullParams");
        q43 q43Var = q43.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(q43Var, false);
        j43.b bVar = aVar2.a;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
    }
}
