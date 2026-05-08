package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import defpackage.ha;
import defpackage.xj8;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fk8 implements ga<xj8.g> {
    public static final fk8 a = new fk8();
    public static final List<String> b = u63.a0("label", "sectionIds", "suid", "taxonomyConceptId", "type", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX);

    @Override // defpackage.ga
    public final xj8.g a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        ArrayList arrayList = null;
        String strA2 = null;
        String strA3 = null;
        String strA4 = null;
        ArrayList arrayList2 = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                ck8 ck8Var = ck8.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(ck8Var, false);
                mb8Var.m();
                ArrayList arrayList3 = new ArrayList();
                while (mb8Var.hasNext()) {
                    try {
                        arrayList3.add(enaVar.a(mb8Var, lb3Var));
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
                zj8 zj8Var = zj8.a;
                ha.g gVar2 = ha.a;
                ena enaVar2 = new ena(zj8Var, false);
                mb8Var.m();
                ArrayList arrayList4 = new ArrayList();
                while (mb8Var.hasNext()) {
                    try {
                        arrayList4.add(enaVar2.a(mb8Var, lb3Var));
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
            }
        }
        if (arrayList == null) {
            mh2.q(mb8Var, "sectionIds");
            throw null;
        }
        if (arrayList2 != null) {
            return new xj8.g(strA, arrayList, strA2, strA3, strA4, arrayList2);
        }
        mh2.q(mb8Var, RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX);
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, xj8.g gVar) {
        xj8.g gVar2 = gVar;
        hc8Var.getClass();
        lb3Var.getClass();
        gVar2.getClass();
        hc8Var.u0("label");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, gVar2.a);
        hc8Var.u0("sectionIds");
        ck8 ck8Var = ck8.a;
        ArrayList arrayList = gVar2.b;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            ck8Var.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
        hc8Var.u0("suid");
        nmaVar.b(hc8Var, lb3Var, gVar2.c);
        hc8Var.u0("taxonomyConceptId");
        nmaVar.b(hc8Var, lb3Var, gVar2.d);
        hc8Var.u0("type");
        nmaVar.b(hc8Var, lb3Var, gVar2.e);
        hc8Var.u0(RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX);
        zj8 zj8Var = zj8.a;
        ArrayList arrayList2 = gVar2.f;
        hc8Var.m();
        for (Object obj2 : arrayList2) {
            hc8Var.j();
            zj8Var.b(hc8Var, lb3Var, obj2);
            hc8Var.t();
        }
        hc8Var.l();
    }
}
