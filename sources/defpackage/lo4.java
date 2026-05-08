package defpackage;

import defpackage.ha;
import defpackage.jo4;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lo4 implements ga<jo4.b> {
    public static final lo4 a = new lo4();
    public static final List<String> b = u63.a0("degreeName", "field", "id", "taxonomyConceptDegree", "taxonomyConceptField");

    @Override // defpackage.ga
    public final jo4.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        Object objA2;
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        String strA2 = null;
        String str = null;
        jo4.f fVar = null;
        jo4.g gVar = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                strA2 = ha.i.a(mb8Var, lb3Var);
            } else if (iD1 != 2) {
                mb8.a aVar = mb8.a.Y;
                if (iD1 == 3) {
                    qo4 qo4Var = qo4.a;
                    ha.g gVar2 = ha.a;
                    ena enaVar = new ena(qo4Var, false);
                    if (mb8Var.peek() == aVar) {
                        mb8Var.I();
                        objA2 = null;
                    } else {
                        objA2 = enaVar.a(mb8Var, lb3Var);
                    }
                    fVar = (jo4.f) objA2;
                } else {
                    if (iD1 != 4) {
                        break;
                    }
                    ro4 ro4Var = ro4.a;
                    ha.g gVar3 = ha.a;
                    ena enaVar2 = new ena(ro4Var, false);
                    if (mb8Var.peek() == aVar) {
                        mb8Var.I();
                        objA = null;
                    } else {
                        objA = enaVar2.a(mb8Var, lb3Var);
                    }
                    gVar = (jo4.g) objA;
                }
            } else {
                str = (String) ha.a.a(mb8Var, lb3Var);
            }
        }
        if (str != null) {
            return new jo4.b(strA, strA2, str, fVar, gVar);
        }
        mh2.q(mb8Var, "id");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, jo4.b bVar) {
        jo4.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("degreeName");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, bVar2.a);
        hc8Var.u0("field");
        nmaVar.b(hc8Var, lb3Var, bVar2.b);
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, bVar2.c);
        hc8Var.u0("taxonomyConceptDegree");
        ena enaVar = new ena(qo4.a, false);
        jo4.f fVar = bVar2.d;
        if (fVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, fVar);
        }
        hc8Var.u0("taxonomyConceptField");
        ena enaVar2 = new ena(ro4.a, false);
        jo4.g gVar = bVar2.e;
        if (gVar == null) {
            hc8Var.H1();
        } else {
            enaVar2.b(hc8Var, lb3Var, gVar);
        }
    }
}
