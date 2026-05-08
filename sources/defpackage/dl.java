package defpackage;

import defpackage.bl;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class dl implements ga<bl.a> {
    public static final dl a = new dl();
    public static final List<String> b = u63.Z("preference");

    @Override // defpackage.ga
    public final bl.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        bl.d dVar = null;
        while (mb8Var.D1(b) == 0) {
            gl glVar = gl.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(glVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            dVar = (bl.d) objA;
        }
        return new bl.a(dVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, bl.a aVar) {
        bl.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("preference");
        gl glVar = gl.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(glVar, false);
        bl.d dVar = aVar2.a;
        if (dVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, dVar);
        }
    }
}
