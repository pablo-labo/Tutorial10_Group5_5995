package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.ha;
import defpackage.qn;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class sn implements ga<qn.a> {
    public static final sn a = new sn();
    public static final List<String> b = u63.Z("links");

    @Override // defpackage.ga
    public final qn.a a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        ArrayList arrayList = null;
        while (mb8Var.D1(b) == 0) {
            un unVar = un.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(unVar, false);
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
        }
        if (arrayList != null) {
            return new qn.a(arrayList);
        }
        mh2.q(mb8Var, "links");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, qn.a aVar) {
        qn.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("links");
        un unVar = un.a;
        ha.g gVar = ha.a;
        ArrayList arrayList = aVar2.a;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            unVar.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
    }
}
