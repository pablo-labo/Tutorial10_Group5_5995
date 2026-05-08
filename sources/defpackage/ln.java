package defpackage;

import defpackage.ha;
import defpackage.in;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ln implements ga<in.b> {
    public static final ln a = new ln();
    public static final List<String> b = u63.Z("addJobSeekerProfileResumeLicenses");

    @Override // defpackage.ga
    public final in.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        in.a aVar = null;
        while (mb8Var.D1(b) == 0) {
            kn knVar = kn.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(knVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            aVar = (in.a) objA;
        }
        return new in.b(aVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, in.b bVar) {
        in.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("addJobSeekerProfileResumeLicenses");
        kn knVar = kn.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(knVar, false);
        in.a aVar = bVar2.a;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
    }
}
