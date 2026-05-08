package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.cv8;
import defpackage.ha;
import defpackage.mb8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ev8 implements ga<cv8> {
    public static final List<String> a = u63.a0("title", "endorsements", "metadata", "location", "taxonomyConceptTitle", "type", "dateRange", "id");

    public static cv8 c(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        Object objA2;
        Object objA3;
        Object objA4;
        Object objA5;
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        ArrayList arrayListH = null;
        cv8.c cVar = null;
        cv8.b bVar = null;
        cv8.d dVar = null;
        k38 k38Var = null;
        cv8.a aVar = null;
        String str = null;
        while (true) {
            int iD1 = mb8Var.D1(a);
            mb8.a aVar2 = mb8.a.Y;
            switch (iD1) {
                case 0:
                    strA = ha.i.a(mb8Var, lb3Var);
                    break;
                case 1:
                    ha.g gVar = ha.a;
                    arrayListH = v40.h(mb8Var);
                    while (mb8Var.hasNext()) {
                        try {
                            arrayListH.add(gVar.a(mb8Var, lb3Var));
                        } catch (ApolloGraphQLException e) {
                            while (mb8Var.hasNext()) {
                                mb8Var.I();
                            }
                            mb8Var.l();
                            throw e;
                        }
                        break;
                    }
                    mb8Var.l();
                    break;
                case 2:
                    gv8 gv8Var = gv8.a;
                    ha.g gVar2 = ha.a;
                    ena enaVar = new ena(gv8Var, false);
                    if (mb8Var.peek() == aVar2) {
                        mb8Var.I();
                        objA = null;
                    } else {
                        objA = enaVar.a(mb8Var, lb3Var);
                    }
                    cVar = (cv8.c) objA;
                    break;
                case 3:
                    fv8 fv8Var = fv8.a;
                    ha.g gVar3 = ha.a;
                    ena enaVar2 = new ena(fv8Var, false);
                    if (mb8Var.peek() == aVar2) {
                        mb8Var.I();
                        objA2 = null;
                    } else {
                        objA2 = enaVar2.a(mb8Var, lb3Var);
                    }
                    bVar = (cv8.b) objA2;
                    break;
                case 4:
                    hv8 hv8Var = hv8.a;
                    ha.g gVar4 = ha.a;
                    ena enaVar3 = new ena(hv8Var, false);
                    if (mb8Var.peek() == aVar2) {
                        mb8Var.I();
                        objA3 = null;
                    } else {
                        objA3 = enaVar3.a(mb8Var, lb3Var);
                    }
                    dVar = (cv8.d) objA3;
                    break;
                case 5:
                    ha.g gVar5 = ha.a;
                    l38 l38Var = l38.a;
                    if (mb8Var.peek() == aVar2) {
                        mb8Var.I();
                        objA4 = null;
                    } else {
                        objA4 = l38Var.a(mb8Var, lb3Var);
                    }
                    k38Var = (k38) objA4;
                    break;
                case 6:
                    dv8 dv8Var = dv8.a;
                    ha.g gVar6 = ha.a;
                    ena enaVar4 = new ena(dv8Var, true);
                    if (mb8Var.peek() == aVar2) {
                        mb8Var.I();
                        objA5 = null;
                    } else {
                        objA5 = enaVar4.a(mb8Var, lb3Var);
                    }
                    aVar = (cv8.a) objA5;
                    break;
                case 7:
                    str = (String) ha.a.a(mb8Var, lb3Var);
                    break;
                default:
                    if (arrayListH == null) {
                        mh2.q(mb8Var, "endorsements");
                        throw null;
                    }
                    if (str != null) {
                        return new cv8(strA, arrayListH, cVar, bVar, dVar, k38Var, aVar, str);
                    }
                    mh2.q(mb8Var, "id");
                    throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(hc8 hc8Var, lb3 lb3Var, cv8 cv8Var) {
        hc8Var.getClass();
        lb3Var.getClass();
        cv8Var.getClass();
        hc8Var.u0("title");
        ha.i.b(hc8Var, lb3Var, cv8Var.a);
        hc8Var.u0("endorsements");
        ha.g gVar = ha.a;
        ArrayList arrayList = cv8Var.b;
        hc8Var.m();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            gVar.b(hc8Var, lb3Var, it.next());
        }
        hc8Var.l();
        hc8Var.u0("metadata");
        ena enaVar = new ena(gv8.a, false);
        cv8.c cVar = cv8Var.c;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
        hc8Var.u0("location");
        ena enaVar2 = new ena(fv8.a, false);
        cv8.b bVar = cv8Var.d;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar2.b(hc8Var, lb3Var, bVar);
        }
        hc8Var.u0("taxonomyConceptTitle");
        ena enaVar3 = new ena(hv8.a, false);
        cv8.d dVar = cv8Var.e;
        if (dVar == null) {
            hc8Var.H1();
        } else {
            enaVar3.b(hc8Var, lb3Var, dVar);
        }
        hc8Var.u0("type");
        l38 l38Var = l38.a;
        k38 k38Var = cv8Var.f;
        if (k38Var == null) {
            hc8Var.H1();
        } else {
            l38Var.b(hc8Var, lb3Var, k38Var);
        }
        hc8Var.u0("dateRange");
        ena enaVar4 = new ena(dv8.a, true);
        cv8.a aVar = cv8Var.g;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar4.b(hc8Var, lb3Var, aVar);
        }
        hc8Var.u0("id");
        gVar.b(hc8Var, lb3Var, cv8Var.h);
    }
}
