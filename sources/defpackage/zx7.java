package defpackage;

import defpackage.ha;
import defpackage.rx7;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zx7 implements ga<rx7.g> {
    public static final zx7 a = new zx7();
    public static final List<String> b = u63.Z("formatted");

    @Override // defpackage.ga
    public final rx7.g a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        rx7.e eVar = null;
        while (mb8Var.D1(b) == 0) {
            wx7 wx7Var = wx7.a;
            ha.g gVar = ha.a;
            eVar = (rx7.e) new ena(wx7Var, false).a(mb8Var, lb3Var);
        }
        if (eVar != null) {
            return new rx7.g(eVar);
        }
        mh2.q(mb8Var, "formatted");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, rx7.g gVar) {
        rx7.g gVar2 = gVar;
        hc8Var.getClass();
        lb3Var.getClass();
        gVar2.getClass();
        hc8Var.u0("formatted");
        wx7 wx7Var = wx7.a;
        ha.g gVar3 = ha.a;
        rx7.e eVar = gVar2.a;
        hc8Var.j();
        wx7Var.b(hc8Var, lb3Var, eVar);
        hc8Var.t();
    }
}
