package defpackage;

import defpackage.gje;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jje implements ga<gje> {
    public static final List<String> a = u63.a0("id", "text", "experience", "timeUnit", "isParentCrowtaxoAttribute", "childAchievementSkill", "taxonomyConceptTitle", "skillBucket");

    public static gje c(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        Object objA2;
        Object objA3;
        Object objA4;
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        String strA = null;
        Object objA5 = null;
        q68 q68Var = null;
        Boolean boolA = null;
        gje.a aVar = null;
        gje.c cVar = null;
        gje.b bVar = null;
        while (true) {
            int iD1 = mb8Var.D1(a);
            mb8.a aVar2 = mb8.a.Y;
            switch (iD1) {
                case 0:
                    str = (String) ha.a.a(mb8Var, lb3Var);
                    break;
                case 1:
                    strA = ha.i.a(mb8Var, lb3Var);
                    break;
                case 2:
                    objA5 = ha.m.a(mb8Var, lb3Var);
                    break;
                case 3:
                    ha.g gVar = ha.a;
                    r68 r68Var = r68.a;
                    if (mb8Var.peek() == aVar2) {
                        mb8Var.I();
                        objA2 = null;
                    } else {
                        objA2 = r68Var.a(mb8Var, lb3Var);
                    }
                    q68Var = (q68) objA2;
                    break;
                case 4:
                    boolA = ha.l.a(mb8Var, lb3Var);
                    break;
                case 5:
                    hje hjeVar = hje.a;
                    ha.g gVar2 = ha.a;
                    ena enaVar = new ena(hjeVar, false);
                    if (mb8Var.peek() == aVar2) {
                        mb8Var.I();
                        objA3 = null;
                    } else {
                        objA3 = enaVar.a(mb8Var, lb3Var);
                    }
                    aVar = (gje.a) objA3;
                    break;
                case 6:
                    kje kjeVar = kje.a;
                    ha.g gVar3 = ha.a;
                    ena enaVar2 = new ena(kjeVar, false);
                    if (mb8Var.peek() == aVar2) {
                        mb8Var.I();
                        objA4 = null;
                    } else {
                        objA4 = enaVar2.a(mb8Var, lb3Var);
                    }
                    cVar = (gje.c) objA4;
                    break;
                case 7:
                    ije ijeVar = ije.a;
                    ha.g gVar4 = ha.a;
                    ena enaVar3 = new ena(ijeVar, false);
                    if (mb8Var.peek() == aVar2) {
                        mb8Var.I();
                        objA = null;
                    } else {
                        objA = enaVar3.a(mb8Var, lb3Var);
                    }
                    bVar = (gje.b) objA;
                    break;
                default:
                    if (str != null) {
                        return new gje(str, strA, objA5, q68Var, boolA, aVar, cVar, bVar);
                    }
                    mh2.q(mb8Var, "id");
                    throw null;
            }
        }
    }

    public static void d(hc8 hc8Var, lb3 lb3Var, gje gjeVar) {
        hc8Var.getClass();
        lb3Var.getClass();
        gjeVar.getClass();
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, gjeVar.a);
        hc8Var.u0("text");
        ha.i.b(hc8Var, lb3Var, gjeVar.b);
        hc8Var.u0("experience");
        ha.m.b(hc8Var, lb3Var, gjeVar.c);
        hc8Var.u0("timeUnit");
        r68 r68Var = r68.a;
        q68 q68Var = gjeVar.d;
        if (q68Var == null) {
            hc8Var.H1();
        } else {
            r68Var.b(hc8Var, lb3Var, q68Var);
        }
        hc8Var.u0("isParentCrowtaxoAttribute");
        ha.l.b(hc8Var, lb3Var, gjeVar.e);
        hc8Var.u0("childAchievementSkill");
        ena enaVar = new ena(hje.a, false);
        gje.a aVar = gjeVar.f;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
        hc8Var.u0("taxonomyConceptTitle");
        ena enaVar2 = new ena(kje.a, false);
        gje.c cVar = gjeVar.g;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar2.b(hc8Var, lb3Var, cVar);
        }
        hc8Var.u0("skillBucket");
        ena enaVar3 = new ena(ije.a, false);
        gje.b bVar = gjeVar.h;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar3.b(hc8Var, lb3Var, bVar);
        }
    }
}
