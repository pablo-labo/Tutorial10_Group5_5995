package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import defpackage.ha;
import defpackage.jv2;
import defpackage.mb8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kv2 implements ga<jv2> {
    public static final List<String> a = u63.a0("id", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "userContext", "userReadsInfo", "userLabelInfo", "participants", "job", "lastEvent", "locks", "scope", "__typename");

    public static jv2 c(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        Object objA;
        Object objA2;
        Object objA3;
        Object objA4;
        Object objA5;
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        av2 av2Var = null;
        jv2.g gVar = null;
        jv2.i iVar = null;
        jv2.h hVar = null;
        ArrayList arrayList = null;
        jv2.a aVar = null;
        jv2.b bVar = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        String str2 = null;
        while (true) {
            int iD1 = mb8Var.D1(a);
            mb8.a aVar2 = mb8.a.Y;
            switch (iD1) {
                case 0:
                    str = (String) ha.a.a(mb8Var, lb3Var);
                    break;
                case 1:
                    String strI0 = mb8Var.I0();
                    strI0.getClass();
                    av2.a.getClass();
                    Iterator<T> it = av2.W.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (wl7.b(((av2) next).a(), strI0)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    av2Var = (av2) next;
                    if (av2Var == null) {
                        av2Var = av2.f;
                    }
                    break;
                case 2:
                    rv2 rv2Var = rv2.a;
                    ha.g gVar2 = ha.a;
                    ena enaVar = new ena(rv2Var, false);
                    if (mb8Var.peek() == aVar2) {
                        mb8Var.I();
                        objA = null;
                    } else {
                        objA = enaVar.a(mb8Var, lb3Var);
                    }
                    gVar = (jv2.g) objA;
                    break;
                case 3:
                    tv2 tv2Var = tv2.a;
                    ha.g gVar3 = ha.a;
                    ena enaVar2 = new ena(tv2Var, false);
                    if (mb8Var.peek() == aVar2) {
                        mb8Var.I();
                        objA2 = null;
                    } else {
                        objA2 = enaVar2.a(mb8Var, lb3Var);
                    }
                    iVar = (jv2.i) objA2;
                    break;
                case 4:
                    sv2 sv2Var = sv2.a;
                    ha.g gVar4 = ha.a;
                    ena enaVar3 = new ena(sv2Var, false);
                    if (mb8Var.peek() == aVar2) {
                        mb8Var.I();
                        objA3 = null;
                    } else {
                        objA3 = enaVar3.a(mb8Var, lb3Var);
                    }
                    hVar = (jv2.h) objA3;
                    break;
                case 5:
                    ov2 ov2Var = ov2.a;
                    ha.g gVar5 = ha.a;
                    ena enaVar4 = new ena(ov2Var, false);
                    mb8Var.m();
                    arrayList = new ArrayList();
                    while (mb8Var.hasNext()) {
                        try {
                            arrayList.add(enaVar4.a(mb8Var, lb3Var));
                        } catch (ApolloGraphQLException e) {
                            while (mb8Var.hasNext()) {
                                mb8Var.I();
                            }
                            mb8Var.l();
                            throw e;
                        }
                    }
                    mb8Var.l();
                    break;
                case 6:
                    lv2 lv2Var = lv2.a;
                    ha.g gVar6 = ha.a;
                    ena enaVar5 = new ena(lv2Var, true);
                    if (mb8Var.peek() == aVar2) {
                        mb8Var.I();
                        objA4 = null;
                    } else {
                        objA4 = enaVar5.a(mb8Var, lb3Var);
                    }
                    aVar = (jv2.a) objA4;
                    break;
                case 7:
                    mv2 mv2Var = mv2.a;
                    ha.g gVar7 = ha.a;
                    ena enaVar6 = new ena(mv2Var, true);
                    if (mb8Var.peek() == aVar2) {
                        mb8Var.I();
                        objA5 = null;
                    } else {
                        objA5 = enaVar6.a(mb8Var, lb3Var);
                    }
                    bVar = (jv2.b) objA5;
                    break;
                case 8:
                    nv2 nv2Var = nv2.a;
                    ha.g gVar8 = ha.a;
                    ena enaVar7 = new ena(nv2Var, false);
                    mb8Var.m();
                    arrayList2 = new ArrayList();
                    while (mb8Var.hasNext()) {
                        try {
                            arrayList2.add(enaVar7.a(mb8Var, lb3Var));
                        } catch (ApolloGraphQLException e2) {
                            while (mb8Var.hasNext()) {
                                mb8Var.I();
                            }
                            mb8Var.l();
                            throw e2;
                        }
                        break;
                    }
                    mb8Var.l();
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    qv2 qv2Var = qv2.a;
                    ha.g gVar9 = ha.a;
                    ena enaVar8 = new ena(qv2Var, false);
                    mb8Var.m();
                    arrayList3 = new ArrayList();
                    while (mb8Var.hasNext()) {
                        try {
                            arrayList3.add(enaVar8.a(mb8Var, lb3Var));
                        } catch (ApolloGraphQLException e3) {
                            while (mb8Var.hasNext()) {
                                mb8Var.I();
                            }
                            mb8Var.l();
                            throw e3;
                        }
                        break;
                    }
                    mb8Var.l();
                    break;
                case 10:
                    str2 = (String) ha.a.a(mb8Var, lb3Var);
                    break;
                default:
                    if (str == null) {
                        mh2.q(mb8Var, "id");
                        throw null;
                    }
                    if (av2Var == null) {
                        mh2.q(mb8Var, RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX);
                        throw null;
                    }
                    if (arrayList == null) {
                        mh2.q(mb8Var, "participants");
                        throw null;
                    }
                    if (arrayList2 == null) {
                        mh2.q(mb8Var, "locks");
                        throw null;
                    }
                    if (arrayList3 == null) {
                        mh2.q(mb8Var, "scope");
                        throw null;
                    }
                    if (str2 != null) {
                        return new jv2(str, av2Var, gVar, iVar, hVar, arrayList, aVar, bVar, arrayList2, arrayList3, str2);
                    }
                    mh2.q(mb8Var, "__typename");
                    throw null;
            }
        }
    }

    public static void d(hc8 hc8Var, lb3 lb3Var, jv2 jv2Var) {
        hc8Var.getClass();
        lb3Var.getClass();
        jv2Var.getClass();
        hc8Var.u0("id");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, jv2Var.a);
        hc8Var.u0(RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX);
        hc8Var.T0(jv2Var.b.a());
        hc8Var.u0("userContext");
        ena enaVar = new ena(rv2.a, false);
        jv2.g gVar2 = jv2Var.c;
        if (gVar2 == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, gVar2);
        }
        hc8Var.u0("userReadsInfo");
        ena enaVar2 = new ena(tv2.a, false);
        jv2.i iVar = jv2Var.d;
        if (iVar == null) {
            hc8Var.H1();
        } else {
            enaVar2.b(hc8Var, lb3Var, iVar);
        }
        hc8Var.u0("userLabelInfo");
        ena enaVar3 = new ena(sv2.a, false);
        jv2.h hVar = jv2Var.e;
        if (hVar == null) {
            hc8Var.H1();
        } else {
            enaVar3.b(hc8Var, lb3Var, hVar);
        }
        hc8Var.u0("participants");
        ov2 ov2Var = ov2.a;
        ArrayList arrayList = jv2Var.f;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            ov2Var.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
        hc8Var.u0("job");
        ena enaVar4 = new ena(lv2.a, true);
        jv2.a aVar = jv2Var.g;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar4.b(hc8Var, lb3Var, aVar);
        }
        hc8Var.u0("lastEvent");
        ena enaVar5 = new ena(mv2.a, true);
        jv2.b bVar = jv2Var.h;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar5.b(hc8Var, lb3Var, bVar);
        }
        hc8Var.u0("locks");
        nv2 nv2Var = nv2.a;
        ArrayList arrayList2 = jv2Var.i;
        hc8Var.m();
        for (Object obj2 : arrayList2) {
            hc8Var.j();
            nv2Var.b(hc8Var, lb3Var, obj2);
            hc8Var.t();
        }
        hc8Var.l();
        hc8Var.u0("scope");
        qv2 qv2Var = qv2.a;
        ArrayList arrayList3 = jv2Var.j;
        hc8Var.m();
        for (Object obj3 : arrayList3) {
            hc8Var.j();
            qv2Var.b(hc8Var, lb3Var, obj3);
            hc8Var.t();
        }
        hc8Var.l();
        hc8Var.u0("__typename");
        gVar.b(hc8Var, lb3Var, jv2Var.k);
    }
}
