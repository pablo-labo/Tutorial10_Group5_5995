package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.ha;
import defpackage.mb8;
import defpackage.y46;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g56 implements ga<y46.g> {
    public static final g56 a = new g56();
    public static final List<String> b = u63.a0("uuid", "id", "minimumPay", "jobTitles", "relocation", "locations", "maximumCommute");

    @Override // defpackage.ga
    public final y46.g a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        Object objA2;
        Object objA3;
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        String strA2 = null;
        y46.f fVar = null;
        ArrayList arrayList = null;
        y46.h hVar = null;
        ArrayList arrayList2 = null;
        y46.e eVar = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            mb8.a aVar = mb8.a.Y;
            switch (iD1) {
                case 0:
                    strA = ha.i.a(mb8Var, lb3Var);
                    break;
                case 1:
                    strA2 = ha.i.a(mb8Var, lb3Var);
                    break;
                case 2:
                    f56 f56Var = f56.a;
                    ha.g gVar = ha.a;
                    ena enaVar = new ena(f56Var, false);
                    if (mb8Var.peek() == aVar) {
                        mb8Var.I();
                        objA2 = null;
                    } else {
                        objA2 = enaVar.a(mb8Var, lb3Var);
                    }
                    fVar = (y46.f) objA2;
                    break;
                case 3:
                    c56 c56Var = c56.a;
                    ha.g gVar2 = ha.a;
                    ena enaVar2 = new ena(c56Var, false);
                    mb8Var.m();
                    ArrayList arrayList3 = new ArrayList();
                    while (mb8Var.hasNext()) {
                        try {
                            arrayList3.add(enaVar2.a(mb8Var, lb3Var));
                        } catch (ApolloGraphQLException e) {
                            while (mb8Var.hasNext()) {
                                mb8Var.I();
                            }
                            mb8Var.l();
                            throw e;
                        }
                    }
                    mb8Var.l();
                    arrayList = arrayList3;
                    break;
                case 4:
                    h56 h56Var = h56.a;
                    ha.g gVar3 = ha.a;
                    ena enaVar3 = new ena(h56Var, false);
                    if (mb8Var.peek() == aVar) {
                        mb8Var.I();
                        objA3 = null;
                    } else {
                        objA3 = enaVar3.a(mb8Var, lb3Var);
                    }
                    hVar = (y46.h) objA3;
                    break;
                case 5:
                    d56 d56Var = d56.a;
                    ha.g gVar4 = ha.a;
                    ena enaVar4 = new ena(d56Var, false);
                    mb8Var.m();
                    ArrayList arrayList4 = new ArrayList();
                    while (mb8Var.hasNext()) {
                        try {
                            arrayList4.add(enaVar4.a(mb8Var, lb3Var));
                        } catch (ApolloGraphQLException e2) {
                            while (mb8Var.hasNext()) {
                                mb8Var.I();
                            }
                            mb8Var.l();
                            throw e2;
                        }
                    }
                    mb8Var.l();
                    arrayList2 = arrayList4;
                    break;
                case 6:
                    e56 e56Var = e56.a;
                    ha.g gVar5 = ha.a;
                    ena enaVar5 = new ena(e56Var, false);
                    if (mb8Var.peek() == aVar) {
                        mb8Var.I();
                        objA = null;
                    } else {
                        objA = enaVar5.a(mb8Var, lb3Var);
                    }
                    eVar = (y46.e) objA;
                    break;
                default:
                    if (arrayList == null) {
                        mh2.q(mb8Var, "jobTitles");
                        throw null;
                    }
                    if (arrayList2 != null) {
                        return new y46.g(strA, strA2, fVar, arrayList, hVar, arrayList2, eVar);
                    }
                    mh2.q(mb8Var, "locations");
                    throw null;
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, y46.g gVar) {
        y46.g gVar2 = gVar;
        hc8Var.getClass();
        lb3Var.getClass();
        gVar2.getClass();
        hc8Var.u0("uuid");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, gVar2.a);
        hc8Var.u0("id");
        nmaVar.b(hc8Var, lb3Var, gVar2.b);
        hc8Var.u0("minimumPay");
        ena enaVar = new ena(f56.a, false);
        y46.f fVar = gVar2.c;
        if (fVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, fVar);
        }
        hc8Var.u0("jobTitles");
        c56 c56Var = c56.a;
        ArrayList arrayList = gVar2.d;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            c56Var.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
        hc8Var.u0("relocation");
        ena enaVar2 = new ena(h56.a, false);
        y46.h hVar = gVar2.e;
        if (hVar == null) {
            hc8Var.H1();
        } else {
            enaVar2.b(hc8Var, lb3Var, hVar);
        }
        hc8Var.u0("locations");
        d56 d56Var = d56.a;
        ArrayList arrayList2 = gVar2.f;
        hc8Var.m();
        for (Object obj2 : arrayList2) {
            hc8Var.j();
            d56Var.b(hc8Var, lb3Var, obj2);
            hc8Var.t();
        }
        hc8Var.l();
        hc8Var.u0("maximumCommute");
        ena enaVar3 = new ena(e56.a, false);
        y46.e eVar = gVar2.g;
        if (eVar == null) {
            hc8Var.H1();
        } else {
            enaVar3.b(hc8Var, lb3Var, eVar);
        }
    }
}
