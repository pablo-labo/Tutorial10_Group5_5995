package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.ux;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zx implements ga<ux.d> {
    public static final zx a = new zx();
    public static final List<String> b = u63.Z("addUDPInteraction");

    @Override // defpackage.ga
    public final ux.d a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        ux.a aVar = null;
        while (mb8Var.D1(b) == 0) {
            wx wxVar = wx.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(wxVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            aVar = (ux.a) objA;
        }
        return new ux.d(aVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ux.d dVar) {
        ux.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("addUDPInteraction");
        wx wxVar = wx.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(wxVar, false);
        ux.a aVar = dVar2.a;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
    }
}
