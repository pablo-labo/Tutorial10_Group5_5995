package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.ha;
import defpackage.ic5;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pc5 implements ga<ic5.f> {
    public static final pc5 a = new pc5();
    public static final List<String> b = u63.Z("genericAttributes");

    @Override // defpackage.ga
    public final ic5.f a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        ArrayList arrayList = null;
        while (mb8Var.D1(b) == 0) {
            mc5 mc5Var = mc5.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(mc5Var, false);
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
            return new ic5.f(arrayList);
        }
        mh2.q(mb8Var, "genericAttributes");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ic5.f fVar) {
        ic5.f fVar2 = fVar;
        hc8Var.getClass();
        lb3Var.getClass();
        fVar2.getClass();
        hc8Var.u0("genericAttributes");
        mc5 mc5Var = mc5.a;
        ha.g gVar = ha.a;
        ArrayList arrayList = fVar2.a;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            mc5Var.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
    }
}
