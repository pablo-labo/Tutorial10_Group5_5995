package defpackage;

import defpackage.ha;
import defpackage.k43;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class n43 implements ga<k43.a> {
    public static final n43 a = new n43();
    public static final List<String> b = u63.Z("createApplyUrlFullParams");

    @Override // defpackage.ga
    public final k43.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        k43.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            p43 p43Var = p43.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(p43Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            bVar = (k43.b) objA;
        }
        return new k43.a(bVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, k43.a aVar) {
        k43.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("createApplyUrlFullParams");
        p43 p43Var = p43.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(p43Var, false);
        k43.b bVar = aVar2.a;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
    }
}
