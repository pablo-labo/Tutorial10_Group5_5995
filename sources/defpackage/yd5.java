package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.ha;
import defpackage.sd5;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yd5 implements ga<sd5.e> {
    public static final yd5 a = new yd5();
    public static final List<String> b = u63.a0("trackingKey", "results");

    @Override // defpackage.ga
    public final sd5.e a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        ArrayList arrayList = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                str = (String) ha.a.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 1) {
                    break;
                }
                je5 je5Var = je5.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(je5Var, false);
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
        if (str == null) {
            mh2.q(mb8Var, "trackingKey");
            throw null;
        }
        if (arrayList != null) {
            return new sd5.e(str, arrayList);
        }
        mh2.q(mb8Var, "results");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, sd5.e eVar) {
        sd5.e eVar2 = eVar;
        hc8Var.getClass();
        lb3Var.getClass();
        eVar2.getClass();
        hc8Var.u0("trackingKey");
        ha.a.b(hc8Var, lb3Var, eVar2.a);
        hc8Var.u0("results");
        je5 je5Var = je5.a;
        ArrayList arrayList = eVar2.b;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            je5Var.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
    }
}
