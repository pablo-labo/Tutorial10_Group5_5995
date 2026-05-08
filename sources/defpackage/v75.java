package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.ha;
import defpackage.o75;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class v75 implements ga<o75.f> {
    public static final v75 a = new v75();
    public static final List<String> b = u63.a0("events", "pageInfo");

    @Override // defpackage.ga
    public final o75.f a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        ArrayList arrayList = null;
        o75.j jVar = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                u75 u75Var = u75.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(u75Var, false);
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
                z75 z75Var = z75.a;
                ha.g gVar2 = ha.a;
                jVar = (o75.j) new ena(z75Var, false).a(mb8Var, lb3Var);
            }
        }
        if (arrayList == null) {
            mh2.q(mb8Var, "events");
            throw null;
        }
        if (jVar != null) {
            return new o75.f(arrayList, jVar);
        }
        mh2.q(mb8Var, "pageInfo");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, o75.f fVar) {
        o75.f fVar2 = fVar;
        hc8Var.getClass();
        lb3Var.getClass();
        fVar2.getClass();
        hc8Var.u0("events");
        u75 u75Var = u75.a;
        ha.g gVar = ha.a;
        ArrayList arrayList = fVar2.a;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            u75Var.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
        hc8Var.u0("pageInfo");
        z75 z75Var = z75.a;
        o75.j jVar = fVar2.b;
        hc8Var.j();
        z75Var.b(hc8Var, lb3Var, jVar);
        hc8Var.t();
    }
}
