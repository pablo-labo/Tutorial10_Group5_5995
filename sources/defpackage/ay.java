package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.ha;
import defpackage.ux;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ay implements ga<ux.e> {
    public static final ay a = new ay();
    public static final List<String> b = u63.Z("interactions");

    @Override // defpackage.ga
    public final ux.e a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        ArrayList arrayList = null;
        while (mb8Var.D1(b) == 0) {
            yx yxVar = yx.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(yxVar, false);
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
            return new ux.e(arrayList);
        }
        mh2.q(mb8Var, "interactions");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ux.e eVar) {
        ux.e eVar2 = eVar;
        hc8Var.getClass();
        lb3Var.getClass();
        eVar2.getClass();
        hc8Var.u0("interactions");
        yx yxVar = yx.a;
        ha.g gVar = ha.a;
        ArrayList arrayList = eVar2.a;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            yxVar.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
    }
}
