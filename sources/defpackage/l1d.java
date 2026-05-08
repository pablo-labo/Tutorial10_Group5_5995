package defpackage;

import defpackage.ha;
import defpackage.j1d;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l1d implements ga<j1d.a> {
    public static final l1d a = new l1d();
    public static final List<String> b = u63.Z("removeOffsiteCtkDeviceIdMap");

    @Override // defpackage.ga
    public final j1d.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        j1d.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            m1d m1dVar = m1d.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(m1dVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            bVar = (j1d.b) objA;
        }
        return new j1d.a(bVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, j1d.a aVar) {
        j1d.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("removeOffsiteCtkDeviceIdMap");
        m1d m1dVar = m1d.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(m1dVar, false);
        j1d.b bVar = aVar2.a;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
    }
}
