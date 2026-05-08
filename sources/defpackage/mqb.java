package defpackage;

import defpackage.fqb;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mqb implements ga<fqb.f> {
    public static final mqb a = new mqb();
    public static final List<String> b = u63.Z("formattedLocation");

    @Override // defpackage.ga
    public final fqb.f a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        while (mb8Var.D1(b) == 0) {
            strA = ha.i.a(mb8Var, lb3Var);
        }
        return new fqb.f(strA);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, fqb.f fVar) {
        fqb.f fVar2 = fVar;
        hc8Var.getClass();
        lb3Var.getClass();
        fVar2.getClass();
        hc8Var.u0("formattedLocation");
        ha.i.b(hc8Var, lb3Var, fVar2.a);
    }
}
