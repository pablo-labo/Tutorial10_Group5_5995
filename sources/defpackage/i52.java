package defpackage;

import defpackage.f52;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i52 implements ga<f52.b> {
    public static final i52 a = new i52();
    public static final List<String> b = u63.Z("claimJobSeekerSlug");

    @Override // defpackage.ga
    public final f52.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        f52.a aVar = null;
        while (mb8Var.D1(b) == 0) {
            h52 h52Var = h52.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(h52Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            aVar = (f52.a) objA;
        }
        return new f52.b(aVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, f52.b bVar) {
        f52.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("claimJobSeekerSlug");
        h52 h52Var = h52.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(h52Var, false);
        f52.a aVar = bVar2.a;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
    }
}
