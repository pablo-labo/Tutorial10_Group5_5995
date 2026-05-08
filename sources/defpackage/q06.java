package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.ha;
import defpackage.l06;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class q06 implements ga<l06.d> {
    public static final q06 a = new q06();
    public static final List<String> b = u63.Z("edges");

    @Override // defpackage.ga
    public final l06.d a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        ArrayList arrayList = null;
        while (mb8Var.D1(b) == 0) {
            p06 p06Var = p06.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(p06Var, false);
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
            return new l06.d(arrayList);
        }
        mh2.q(mb8Var, "edges");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, l06.d dVar) {
        l06.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("edges");
        p06 p06Var = p06.a;
        ha.g gVar = ha.a;
        ArrayList arrayList = dVar2.a;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            p06Var.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
    }
}
