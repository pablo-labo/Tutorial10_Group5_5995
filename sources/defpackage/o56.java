package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.ha;
import defpackage.j56;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o56 implements ga<j56.d> {
    public static final o56 a = new o56();
    public static final List<String> b = u63.a0("suggestedMessages", "trackingKey");

    @Override // defpackage.ga
    public final j56.d a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        ArrayList arrayList = null;
        String strA = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                n56 n56Var = n56.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(n56Var, false);
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
                strA = ha.i.a(mb8Var, lb3Var);
            }
        }
        if (arrayList != null) {
            return new j56.d(strA, arrayList);
        }
        mh2.q(mb8Var, "suggestedMessages");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, j56.d dVar) {
        j56.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("suggestedMessages");
        n56 n56Var = n56.a;
        ha.g gVar = ha.a;
        ArrayList arrayList = dVar2.a;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            n56Var.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
        hc8Var.u0("trackingKey");
        ha.i.b(hc8Var, lb3Var, dVar2.b);
    }
}
