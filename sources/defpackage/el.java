package defpackage;

import defpackage.bl;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class el implements ga<bl.b> {
    public static final el a = new el();
    public static final List<String> b = u63.Z("addJobSeekerProfileStructuredDataPreference");

    @Override // defpackage.ga
    public final bl.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        bl.a aVar = null;
        while (mb8Var.D1(b) == 0) {
            dl dlVar = dl.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(dlVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            aVar = (bl.a) objA;
        }
        return new bl.b(aVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, bl.b bVar) {
        bl.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("addJobSeekerProfileStructuredDataPreference");
        dl dlVar = dl.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(dlVar, false);
        bl.a aVar = bVar2.a;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
    }
}
