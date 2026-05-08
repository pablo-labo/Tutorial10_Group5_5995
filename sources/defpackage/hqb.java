package defpackage;

import defpackage.fqb;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hqb implements ga<fqb.a> {
    public static final hqb a = new hqb();
    public static final List<String> b = u63.Z("location");

    @Override // defpackage.ga
    public final fqb.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        fqb.f fVar = null;
        while (mb8Var.D1(b) == 0) {
            mqb mqbVar = mqb.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(mqbVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            fVar = (fqb.f) objA;
        }
        return new fqb.a(fVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, fqb.a aVar) {
        fqb.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("location");
        mqb mqbVar = mqb.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(mqbVar, false);
        fqb.f fVar = aVar2.a;
        if (fVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, fVar);
        }
    }
}
