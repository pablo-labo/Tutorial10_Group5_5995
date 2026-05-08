package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.ha;
import defpackage.yda;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gea implements ga<yda.g> {
    public static final gea a = new gea();
    public static final List<String> b = u63.a0("leftItems", "rightItems");

    @Override // defpackage.ga
    public final yda.g a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                fea feaVar = fea.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(feaVar, false);
                mb8Var.m();
                arrayList = new ArrayList();
                while (mb8Var.hasNext()) {
                    try {
                        arrayList.add(enaVar.a(mb8Var, lb3Var));
                    } catch (ApolloGraphQLException e) {
                        while (mb8Var.hasNext()) {
                            mb8Var.I();
                        }
                        mb8Var.l();
                        throw e;
                    }
                }
                mb8Var.l();
            } else {
                if (iD1 != 1) {
                    break;
                }
                jea jeaVar = jea.a;
                ha.g gVar2 = ha.a;
                ena enaVar2 = new ena(jeaVar, false);
                mb8Var.m();
                arrayList2 = new ArrayList();
                while (mb8Var.hasNext()) {
                    try {
                        arrayList2.add(enaVar2.a(mb8Var, lb3Var));
                    } catch (ApolloGraphQLException e2) {
                        while (mb8Var.hasNext()) {
                            mb8Var.I();
                        }
                        mb8Var.l();
                        throw e2;
                    }
                }
                mb8Var.l();
            }
        }
        if (arrayList == null) {
            mh2.q(mb8Var, "leftItems");
            throw null;
        }
        if (arrayList2 != null) {
            return new yda.g(arrayList, arrayList2);
        }
        mh2.q(mb8Var, "rightItems");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, yda.g gVar) {
        yda.g gVar2 = gVar;
        hc8Var.getClass();
        lb3Var.getClass();
        gVar2.getClass();
        hc8Var.u0("leftItems");
        fea feaVar = fea.a;
        ha.g gVar3 = ha.a;
        ArrayList arrayList = gVar2.a;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            feaVar.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
        hc8Var.u0("rightItems");
        jea jeaVar = jea.a;
        ArrayList arrayList2 = gVar2.b;
        hc8Var.m();
        for (Object obj2 : arrayList2) {
            hc8Var.j();
            jeaVar.b(hc8Var, lb3Var, obj2);
            hc8Var.t();
        }
        hc8Var.l();
    }
}
