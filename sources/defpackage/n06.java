package defpackage;

import defpackage.ha;
import defpackage.l06;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class n06 implements ga<l06.a> {
    public static final n06 a = new n06();
    public static final List<String> b = u63.a0("id", "eventsConnection", "__typename");

    @Override // defpackage.ga
    public final l06.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        l06.d dVar = null;
        String str2 = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                str = (String) ha.a.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                q06 q06Var = q06.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(q06Var, false);
                if (mb8Var.peek() == mb8.a.Y) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = enaVar.a(mb8Var, lb3Var);
                }
                dVar = (l06.d) objA;
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
            return new l06.a(str, dVar, str2);
        }
        mh2.q(mb8Var, "__typename");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, l06.a aVar) {
        l06.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("id");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, aVar2.a);
        hc8Var.u0("eventsConnection");
        ena enaVar = new ena(q06.a, false);
        l06.d dVar = aVar2.b;
        if (dVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, dVar);
        }
        hc8Var.u0("__typename");
        gVar.b(hc8Var, lb3Var, aVar2.c);
    }
}
