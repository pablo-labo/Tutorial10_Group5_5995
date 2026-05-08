package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.zj;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ck implements ga<zj.b> {
    public static final ck a = new ck();
    public static final List<String> b = u63.Z("addJobSeekerProfileStructuredDataPreference");

    @Override // defpackage.ga
    public final zj.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        zj.a aVar = null;
        while (mb8Var.D1(b) == 0) {
            bk bkVar = bk.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(bkVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            aVar = (zj.a) objA;
        }
        return new zj.b(aVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, zj.b bVar) {
        zj.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("addJobSeekerProfileStructuredDataPreference");
        bk bkVar = bk.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(bkVar, false);
        zj.a aVar = bVar2.a;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
    }
}
