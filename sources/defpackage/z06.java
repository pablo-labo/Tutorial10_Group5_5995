package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.ha;
import defpackage.t06;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class z06 implements ga<t06.e> {
    public static final z06 a = new z06();
    public static final List<String> b = u63.Z("results");

    @Override // defpackage.ga
    public final t06.e a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        ArrayList arrayList = null;
        while (mb8Var.D1(b) == 0) {
            a16 a16Var = a16.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(a16Var, false);
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
            return new t06.e(arrayList);
        }
        mh2.q(mb8Var, "results");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, t06.e eVar) {
        t06.e eVar2 = eVar;
        hc8Var.getClass();
        lb3Var.getClass();
        eVar2.getClass();
        hc8Var.u0("results");
        a16 a16Var = a16.a;
        ha.g gVar = ha.a;
        ArrayList arrayList = eVar2.a;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            a16Var.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
    }
}
