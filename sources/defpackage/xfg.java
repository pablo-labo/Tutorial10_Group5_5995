package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.ha;
import defpackage.mb8;
import defpackage.sfg;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xfg implements ga<sfg.d> {
    public static final xfg a = new xfg();
    public static final List<String> b = u63.a0("id", "firstName", "lastName", "headline", "phoneNumber", "showPhoneNumber", "location", "employmentEligibilities");

    @Override // defpackage.ga
    public final sfg.d a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        String strA = null;
        String strA2 = null;
        String strA3 = null;
        String strA4 = null;
        Boolean boolA = null;
        sfg.c cVar = null;
        ArrayList arrayList = null;
        while (true) {
            switch (mb8Var.D1(b)) {
                case 0:
                    str = (String) ha.a.a(mb8Var, lb3Var);
                    break;
                case 1:
                    strA = ha.i.a(mb8Var, lb3Var);
                    break;
                case 2:
                    strA2 = ha.i.a(mb8Var, lb3Var);
                    break;
                case 3:
                    strA3 = ha.i.a(mb8Var, lb3Var);
                    break;
                case 4:
                    strA4 = ha.i.a(mb8Var, lb3Var);
                    break;
                case 5:
                    boolA = ha.l.a(mb8Var, lb3Var);
                    break;
                case 6:
                    wfg wfgVar = wfg.a;
                    ha.g gVar = ha.a;
                    ena enaVar = new ena(wfgVar, false);
                    if (mb8Var.peek() == mb8.a.Y) {
                        mb8Var.I();
                        objA = null;
                    } else {
                        objA = enaVar.a(mb8Var, lb3Var);
                    }
                    cVar = (sfg.c) objA;
                    break;
                case 7:
                    vfg vfgVar = vfg.a;
                    ha.g gVar2 = ha.a;
                    ena enaVar2 = new ena(vfgVar, false);
                    mb8Var.m();
                    ArrayList arrayList2 = new ArrayList();
                    while (mb8Var.hasNext()) {
                        try {
                            arrayList2.add(enaVar2.a(mb8Var, lb3Var));
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
                    arrayList = arrayList2;
                    break;
                default:
                    if (str == null) {
                        mh2.q(mb8Var, "id");
                        throw null;
                    }
                    if (arrayList != null) {
                        return new sfg.d(str, strA, strA2, strA3, strA4, boolA, cVar, arrayList);
                    }
                    mh2.q(mb8Var, "employmentEligibilities");
                    throw null;
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, sfg.d dVar) {
        sfg.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, dVar2.a);
        hc8Var.u0("firstName");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, dVar2.b);
        hc8Var.u0("lastName");
        nmaVar.b(hc8Var, lb3Var, dVar2.c);
        hc8Var.u0("headline");
        nmaVar.b(hc8Var, lb3Var, dVar2.d);
        hc8Var.u0("phoneNumber");
        nmaVar.b(hc8Var, lb3Var, dVar2.e);
        hc8Var.u0("showPhoneNumber");
        ha.l.b(hc8Var, lb3Var, dVar2.f);
        hc8Var.u0("location");
        ena enaVar = new ena(wfg.a, false);
        sfg.c cVar = dVar2.g;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
        hc8Var.u0("employmentEligibilities");
        vfg vfgVar = vfg.a;
        ArrayList arrayList = dVar2.h;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            vfgVar.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
    }
}
