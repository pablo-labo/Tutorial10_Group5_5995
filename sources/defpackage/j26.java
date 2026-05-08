package defpackage;

import defpackage.h26;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j26 implements ga<h26.a> {
    public static final j26 a = new j26();
    public static final List<String> b = u63.Z("onlineActivityPreferences");

    @Override // defpackage.ga
    public final h26.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        h26.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            k26 k26Var = k26.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(k26Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            bVar = (h26.b) objA;
        }
        return new h26.a(bVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, h26.a aVar) {
        h26.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("onlineActivityPreferences");
        k26 k26Var = k26.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(k26Var, false);
        h26.b bVar = aVar2.a;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
    }
}
