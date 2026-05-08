package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.ha;
import defpackage.te5;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class af5 implements ga<te5.f> {
    public static final List<String> a = u63.a0("lever", "workWellbeingQuestions");

    public static te5.f c(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        te5.d dVar = null;
        ArrayList arrayList = null;
        while (true) {
            int iD1 = mb8Var.D1(a);
            if (iD1 == 0) {
                ye5 ye5Var = ye5.a;
                ha.g gVar = ha.a;
                dVar = (te5.d) new ena(ye5Var, false).a(mb8Var, lb3Var);
            } else {
                if (iD1 != 1) {
                    break;
                }
                bf5 bf5Var = bf5.a;
                ha.g gVar2 = ha.a;
                ena enaVar = new ena(bf5Var, false);
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
        }
        if (dVar == null) {
            mh2.q(mb8Var, "lever");
            throw null;
        }
        if (arrayList != null) {
            return new te5.f(dVar, arrayList);
        }
        mh2.q(mb8Var, "workWellbeingQuestions");
        throw null;
    }

    public static void d(hc8 hc8Var, lb3 lb3Var, te5.f fVar) {
        hc8Var.getClass();
        lb3Var.getClass();
        fVar.getClass();
        hc8Var.u0("lever");
        ye5 ye5Var = ye5.a;
        ha.g gVar = ha.a;
        te5.d dVar = fVar.a;
        hc8Var.j();
        ye5Var.b(hc8Var, lb3Var, dVar);
        hc8Var.t();
        hc8Var.u0("workWellbeingQuestions");
        bf5 bf5Var = bf5.a;
        ArrayList arrayList = fVar.b;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            bf5Var.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
    }
}
