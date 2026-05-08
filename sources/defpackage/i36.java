package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.d36;
import defpackage.ha;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i36 implements ga<d36.d> {
    public static final i36 a = new i36();
    public static final List<String> b = u63.Z("recentJobSearches");

    @Override // defpackage.ga
    public final d36.d a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        ArrayList arrayList = null;
        while (mb8Var.D1(b) == 0) {
            j36 j36Var = j36.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(j36Var, false);
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
            return new d36.d(arrayList);
        }
        mh2.q(mb8Var, "recentJobSearches");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, d36.d dVar) {
        d36.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("recentJobSearches");
        j36 j36Var = j36.a;
        ha.g gVar = ha.a;
        ArrayList arrayList = dVar2.a;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            j36Var.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
    }
}
