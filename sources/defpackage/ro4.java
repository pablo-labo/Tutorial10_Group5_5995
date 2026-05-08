package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.ha;
import defpackage.jo4;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ro4 implements ga<jo4.g> {
    public static final ro4 a = new ro4();
    public static final List<String> b = u63.a0("label", "sectionIds", "suid", "taxonomyConceptId", "type", "uuid");

    @Override // defpackage.ga
    public final jo4.g a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        ArrayList arrayList = null;
        String strA2 = null;
        String strA3 = null;
        String strA4 = null;
        String strA5 = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                oo4 oo4Var = oo4.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(oo4Var, false);
                mb8Var.m();
                ArrayList arrayList2 = new ArrayList();
                while (mb8Var.hasNext()) {
                    try {
                        arrayList2.add(enaVar.a(mb8Var, lb3Var));
                    } catch (ApolloGraphQLException e) {
                        while (mb8Var.hasNext()) {
                            mb8Var.I();
                        }
                        mb8Var.l();
                        throw e;
                    }
                }
                mb8Var.l();
                arrayList = arrayList2;
            } else if (iD1 == 2) {
                strA2 = ha.i.a(mb8Var, lb3Var);
            } else if (iD1 == 3) {
                strA3 = ha.i.a(mb8Var, lb3Var);
            } else if (iD1 == 4) {
                strA4 = ha.i.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 5) {
                    break;
                }
                strA5 = ha.i.a(mb8Var, lb3Var);
            }
        }
        if (arrayList != null) {
            return new jo4.g(strA, arrayList, strA2, strA3, strA4, strA5);
        }
        mh2.q(mb8Var, "sectionIds");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, jo4.g gVar) {
        jo4.g gVar2 = gVar;
        hc8Var.getClass();
        lb3Var.getClass();
        gVar2.getClass();
        hc8Var.u0("label");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, gVar2.a);
        hc8Var.u0("sectionIds");
        oo4 oo4Var = oo4.a;
        ArrayList arrayList = gVar2.b;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            oo4Var.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
        hc8Var.u0("suid");
        nmaVar.b(hc8Var, lb3Var, gVar2.c);
        hc8Var.u0("taxonomyConceptId");
        nmaVar.b(hc8Var, lb3Var, gVar2.d);
        hc8Var.u0("type");
        nmaVar.b(hc8Var, lb3Var, gVar2.e);
        hc8Var.u0("uuid");
        nmaVar.b(hc8Var, lb3Var, gVar2.f);
    }
}
