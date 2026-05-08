package defpackage;

import defpackage.dd5;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hd5 implements ga<dd5.c> {
    public static final hd5 a = new hd5();
    public static final List<String> b = u63.a0("dossier", "name", "key");

    @Override // defpackage.ga
    public final dd5.c a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        dd5.b bVar = null;
        String strA = null;
        String str = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                gd5 gd5Var = gd5.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(gd5Var, false);
                if (mb8Var.peek() == mb8.a.Y) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = enaVar.a(mb8Var, lb3Var);
                }
                bVar = (dd5.b) objA;
            } else if (iD1 == 1) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 2) {
                    break;
                }
                str = (String) ha.a.a(mb8Var, lb3Var);
            }
        }
        if (str != null) {
            return new dd5.c(bVar, strA, str);
        }
        mh2.q(mb8Var, "key");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, dd5.c cVar) {
        dd5.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("dossier");
        gd5 gd5Var = gd5.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(gd5Var, false);
        dd5.b bVar = cVar2.a;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
        hc8Var.u0("name");
        ha.i.b(hc8Var, lb3Var, cVar2.b);
        hc8Var.u0("key");
        ha.a.b(hc8Var, lb3Var, cVar2.c);
    }
}
