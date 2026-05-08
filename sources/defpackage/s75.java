package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.o75;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class s75 implements ga<o75.c> {
    public static final s75 a = new s75();
    public static final List<String> b = u63.a0("__typename", "eventsConnection", "id");

    @Override // defpackage.ga
    public final o75.c a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        o75.f fVar = null;
        String str2 = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                str = (String) ha.a.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                v75 v75Var = v75.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(v75Var, false);
                if (mb8Var.peek() == mb8.a.Y) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = enaVar.a(mb8Var, lb3Var);
                }
                fVar = (o75.f) objA;
            } else {
                if (iD1 != 2) {
                    break;
                }
                str2 = (String) ha.a.a(mb8Var, lb3Var);
            }
        }
        mb8Var.k();
        jv2 jv2VarC = kv2.c(mb8Var, lb3Var);
        if (str == null) {
            mh2.q(mb8Var, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new o75.c(str, fVar, str2, jv2VarC);
        }
        mh2.q(mb8Var, "id");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, o75.c cVar) {
        o75.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("__typename");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, cVar2.a);
        hc8Var.u0("eventsConnection");
        ena enaVar = new ena(v75.a, false);
        o75.f fVar = cVar2.b;
        if (fVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, fVar);
        }
        hc8Var.u0("id");
        gVar.b(hc8Var, lb3Var, cVar2.c);
        List<String> list = kv2.a;
        kv2.d(hc8Var, lb3Var, cVar2.d);
    }
}
