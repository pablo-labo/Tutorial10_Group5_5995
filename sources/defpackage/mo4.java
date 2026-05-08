package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.ha;
import defpackage.jo4;
import defpackage.mb8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mo4 implements ga<jo4> {
    public static final List<String> a = u63.a0("id", "school", "degree", "location", "dateRange", "additionalDetails");

    public static jo4 c(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        Object objA2;
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        String strA = null;
        ArrayList arrayList = null;
        jo4.c cVar = null;
        jo4.a aVar = null;
        String strA2 = null;
        while (true) {
            int iD1 = mb8Var.D1(a);
            if (iD1 == 0) {
                str = (String) ha.a.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else if (iD1 != 2) {
                mb8.a aVar2 = mb8.a.Y;
                if (iD1 == 3) {
                    no4 no4Var = no4.a;
                    ha.g gVar = ha.a;
                    ena enaVar = new ena(no4Var, false);
                    if (mb8Var.peek() == aVar2) {
                        mb8Var.I();
                        objA2 = null;
                    } else {
                        objA2 = enaVar.a(mb8Var, lb3Var);
                    }
                    cVar = (jo4.c) objA2;
                } else if (iD1 == 4) {
                    ko4 ko4Var = ko4.a;
                    ha.g gVar2 = ha.a;
                    ena enaVar2 = new ena(ko4Var, true);
                    if (mb8Var.peek() == aVar2) {
                        mb8Var.I();
                        objA = null;
                    } else {
                        objA = enaVar2.a(mb8Var, lb3Var);
                    }
                    aVar = (jo4.a) objA;
                } else {
                    if (iD1 != 5) {
                        break;
                    }
                    strA2 = ha.i.a(mb8Var, lb3Var);
                }
            } else {
                lo4 lo4Var = lo4.a;
                ha.g gVar3 = ha.a;
                ena enaVar3 = new ena(lo4Var, false);
                mb8Var.m();
                ArrayList arrayList2 = new ArrayList();
                while (mb8Var.hasNext()) {
                    try {
                        arrayList2.add(enaVar3.a(mb8Var, lb3Var));
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
            }
        }
        if (str == null) {
            mh2.q(mb8Var, "id");
            throw null;
        }
        if (arrayList != null) {
            return new jo4(str, strA, arrayList, cVar, aVar, strA2);
        }
        mh2.q(mb8Var, "degree");
        throw null;
    }

    public static void d(hc8 hc8Var, lb3 lb3Var, jo4 jo4Var) {
        hc8Var.getClass();
        lb3Var.getClass();
        jo4Var.getClass();
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, jo4Var.a);
        hc8Var.u0("school");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, jo4Var.b);
        hc8Var.u0("degree");
        ena enaVar = new ena(lo4.a, false);
        List<jo4.b> list = jo4Var.c;
        hc8Var.m();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            enaVar.b(hc8Var, lb3Var, it.next());
        }
        hc8Var.l();
        hc8Var.u0("location");
        ena enaVar2 = new ena(no4.a, false);
        jo4.c cVar = jo4Var.d;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar2.b(hc8Var, lb3Var, cVar);
        }
        hc8Var.u0("dateRange");
        ena enaVar3 = new ena(ko4.a, true);
        jo4.a aVar = jo4Var.e;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar3.b(hc8Var, lb3Var, aVar);
        }
        hc8Var.u0("additionalDetails");
        nmaVar.b(hc8Var, lb3Var, jo4Var.f);
    }
}
