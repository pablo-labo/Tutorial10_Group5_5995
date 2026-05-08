package defpackage;

import defpackage.ha;
import defpackage.lag;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qag implements ga<lag.d> {
    public static final qag a = new qag();
    public static final List<String> b = u63.Z("preference");

    @Override // defpackage.ga
    public final lag.d a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        lag.c cVar = null;
        while (mb8Var.D1(b) == 0) {
            pag pagVar = pag.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(pagVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            cVar = (lag.c) objA;
        }
        return new lag.d(cVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, lag.d dVar) {
        lag.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("preference");
        pag pagVar = pag.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(pagVar, false);
        lag.c cVar = dVar2.a;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
    }
}
