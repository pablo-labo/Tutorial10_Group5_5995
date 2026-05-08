package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.eb7;
import defpackage.ha;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ib7 implements ga<eb7.c> {
    public static final ib7 a = new ib7();
    public static final List<String> b = u63.Z("inferredApplicationStatus");

    @Override // defpackage.ga
    public final eb7.c a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        ArrayList arrayList = null;
        while (mb8Var.D1(b) == 0) {
            hb7 hb7Var = hb7.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(hb7Var, false);
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
            return new eb7.c(arrayList);
        }
        mh2.q(mb8Var, "inferredApplicationStatus");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, eb7.c cVar) {
        eb7.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("inferredApplicationStatus");
        hb7 hb7Var = hb7.a;
        ha.g gVar = ha.a;
        ArrayList arrayList = cVar2.a;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            hb7Var.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
    }
}
