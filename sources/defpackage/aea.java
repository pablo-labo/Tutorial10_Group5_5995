package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.ha;
import defpackage.yda;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class aea implements ga<yda.a> {
    public static final aea a = new aea();
    public static final List<String> b = u63.Z("results");

    @Override // defpackage.ga
    public final yda.a a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        ArrayList arrayList = null;
        while (mb8Var.D1(b) == 0) {
            iea ieaVar = iea.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(ieaVar, false);
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
            return new yda.a(arrayList);
        }
        mh2.q(mb8Var, "results");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, yda.a aVar) {
        yda.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("results");
        iea ieaVar = iea.a;
        ha.g gVar = ha.a;
        ArrayList arrayList = aVar2.a;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            ieaVar.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
    }
}
