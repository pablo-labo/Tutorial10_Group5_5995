package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.vxc;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xxc implements ga<vxc.a> {
    public static final xxc a = new xxc();
    public static final List<String> b = u63.Z("registerDevice");

    @Override // defpackage.ga
    public final vxc.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        vxc.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            yxc yxcVar = yxc.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(yxcVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            bVar = (vxc.b) objA;
        }
        return new vxc.a(bVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, vxc.a aVar) {
        vxc.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("registerDevice");
        yxc yxcVar = yxc.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(yxcVar, false);
        vxc.b bVar = aVar2.a;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
    }
}
