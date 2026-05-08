package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.w8d;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class x8d implements ga<w8d> {
    public static final List<String> a = u63.a0("id", "taxonomyConceptLanguage", "taxonomyConceptProficiency");

    public static w8d c(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        Object objA2;
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        w8d.a aVar = null;
        w8d.b bVar = null;
        while (true) {
            int iD1 = mb8Var.D1(a);
            if (iD1 != 0) {
                mb8.a aVar2 = mb8.a.Y;
                if (iD1 == 1) {
                    y8d y8dVar = y8d.a;
                    ha.g gVar = ha.a;
                    ena enaVar = new ena(y8dVar, true);
                    if (mb8Var.peek() == aVar2) {
                        mb8Var.I();
                        objA2 = null;
                    } else {
                        objA2 = enaVar.a(mb8Var, lb3Var);
                    }
                    aVar = (w8d.a) objA2;
                } else {
                    if (iD1 != 2) {
                        break;
                    }
                    z8d z8dVar = z8d.a;
                    ha.g gVar2 = ha.a;
                    ena enaVar2 = new ena(z8dVar, true);
                    if (mb8Var.peek() == aVar2) {
                        mb8Var.I();
                        objA = null;
                    } else {
                        objA = enaVar2.a(mb8Var, lb3Var);
                    }
                    bVar = (w8d.b) objA;
                }
            } else {
                str = (String) ha.a.a(mb8Var, lb3Var);
            }
        }
        if (str != null) {
            return new w8d(str, aVar, bVar);
        }
        mh2.q(mb8Var, "id");
        throw null;
    }

    public static void d(hc8 hc8Var, lb3 lb3Var, w8d w8dVar) {
        hc8Var.getClass();
        lb3Var.getClass();
        w8dVar.getClass();
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, w8dVar.a);
        hc8Var.u0("taxonomyConceptLanguage");
        ena enaVar = new ena(y8d.a, true);
        w8d.a aVar = w8dVar.b;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
        hc8Var.u0("taxonomyConceptProficiency");
        ena enaVar2 = new ena(z8d.a, true);
        w8d.b bVar = w8dVar.c;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar2.b(hc8Var, lb3Var, bVar);
        }
    }
}
