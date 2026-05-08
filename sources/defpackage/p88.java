package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.ha;
import defpackage.j88;
import defpackage.mb8;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class p88 implements ga<j88.e> {
    public static final p88 a = new p88();
    public static final List<String> b = u63.a0("ctk", "services", "proctorResult", "ipCountry", "ipLookupCountry", "attributionParametersPayload", "showBlockingTOSBanner", "showForceUpgradeModal");

    @Override // defpackage.ga
    public final j88.e a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        ArrayList arrayList = null;
        j88.f fVar = null;
        Object objA2 = null;
        Object objA3 = null;
        j88.b bVar = null;
        Boolean boolA = null;
        Boolean boolA2 = null;
        while (true) {
            switch (mb8Var.D1(b)) {
                case 0:
                    strA = ha.i.a(mb8Var, lb3Var);
                    break;
                case 1:
                    r88 r88Var = r88.a;
                    ha.g gVar = ha.a;
                    ena enaVar = new ena(r88Var, false);
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
                        break;
                    }
                    mb8Var.l();
                    arrayList = arrayList2;
                    break;
                case 2:
                    q88 q88Var = q88.a;
                    ha.g gVar2 = ha.a;
                    fVar = (j88.f) new ena(q88Var, false).a(mb8Var, lb3Var);
                    break;
                case 3:
                    objA2 = ha.m.a(mb8Var, lb3Var);
                    break;
                case 4:
                    objA3 = ha.m.a(mb8Var, lb3Var);
                    break;
                case 5:
                    m88 m88Var = m88.a;
                    ha.g gVar3 = ha.a;
                    ena enaVar2 = new ena(m88Var, false);
                    if (mb8Var.peek() == mb8.a.Y) {
                        mb8Var.I();
                        objA = null;
                    } else {
                        objA = enaVar2.a(mb8Var, lb3Var);
                    }
                    bVar = (j88.b) objA;
                    break;
                case 6:
                    boolA = ha.l.a(mb8Var, lb3Var);
                    break;
                case 7:
                    boolA2 = ha.l.a(mb8Var, lb3Var);
                    break;
                default:
                    if (arrayList == null) {
                        mh2.q(mb8Var, "services");
                        throw null;
                    }
                    if (fVar != null) {
                        return new j88.e(strA, arrayList, fVar, objA2, objA3, bVar, boolA, boolA2);
                    }
                    mh2.q(mb8Var, "proctorResult");
                    throw null;
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, j88.e eVar) {
        j88.e eVar2 = eVar;
        hc8Var.getClass();
        lb3Var.getClass();
        eVar2.getClass();
        hc8Var.u0("ctk");
        ha.i.b(hc8Var, lb3Var, eVar2.a);
        hc8Var.u0("services");
        r88 r88Var = r88.a;
        ArrayList arrayList = eVar2.b;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            r88Var.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
        hc8Var.u0("proctorResult");
        q88 q88Var = q88.a;
        j88.f fVar = eVar2.c;
        hc8Var.j();
        q88Var.b(hc8Var, lb3Var, fVar);
        hc8Var.t();
        hc8Var.u0("ipCountry");
        nma<Object> nmaVar = ha.m;
        nmaVar.b(hc8Var, lb3Var, eVar2.d);
        hc8Var.u0("ipLookupCountry");
        nmaVar.b(hc8Var, lb3Var, eVar2.e);
        hc8Var.u0("attributionParametersPayload");
        ena enaVar = new ena(m88.a, false);
        j88.b bVar = eVar2.f;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
        hc8Var.u0("showBlockingTOSBanner");
        nma<Boolean> nmaVar2 = ha.l;
        nmaVar2.b(hc8Var, lb3Var, eVar2.g);
        hc8Var.u0("showForceUpgradeModal");
        nmaVar2.b(hc8Var, lb3Var, eVar2.h);
    }
}
