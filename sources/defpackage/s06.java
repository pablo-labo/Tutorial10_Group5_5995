package defpackage;

import defpackage.ha;
import defpackage.l06;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class s06 implements ga<l06.f> {
    public static final s06 a = new s06();
    public static final List<String> b = u63.a0("inboundEmailData", "id", "__typename");

    @Override // defpackage.ga
    public final l06.f a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        l06.e eVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                r06 r06Var = r06.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(r06Var, false);
                if (mb8Var.peek() == mb8.a.Y) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = enaVar.a(mb8Var, lb3Var);
                }
                eVar = (l06.e) objA;
            } else if (iD1 == 1) {
                str = (String) ha.a.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 2) {
                    break;
                }
                str2 = (String) ha.a.a(mb8Var, lb3Var);
            }
        }
        if (str == null) {
            mh2.q(mb8Var, "id");
            throw null;
        }
        if (str2 != null) {
            return new l06.f(eVar, str, str2);
        }
        mh2.q(mb8Var, "__typename");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, l06.f fVar) {
        l06.f fVar2 = fVar;
        hc8Var.getClass();
        lb3Var.getClass();
        fVar2.getClass();
        hc8Var.u0("inboundEmailData");
        r06 r06Var = r06.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(r06Var, false);
        l06.e eVar = fVar2.a;
        if (eVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, eVar);
        }
        hc8Var.u0("id");
        ha.g gVar2 = ha.a;
        gVar2.b(hc8Var, lb3Var, fVar2.b);
        hc8Var.u0("__typename");
        gVar2.b(hc8Var, lb3Var, fVar2.c);
    }
}
