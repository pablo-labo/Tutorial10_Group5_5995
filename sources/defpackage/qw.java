package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.ow;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qw implements ga<ow.a> {
    public static final qw a = new qw();
    public static final List<String> b = u63.Z("preference");

    @Override // defpackage.ga
    public final ow.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        ow.d dVar = null;
        while (mb8Var.D1(b) == 0) {
            tw twVar = tw.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(twVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            dVar = (ow.d) objA;
        }
        return new ow.a(dVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ow.a aVar) {
        ow.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("preference");
        tw twVar = tw.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(twVar, false);
        ow.d dVar = aVar2.a;
        if (dVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, dVar);
        }
    }
}
