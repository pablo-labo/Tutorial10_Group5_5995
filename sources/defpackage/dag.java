package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.ha;
import defpackage.z9g;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class dag implements ga<z9g.c> {
    public static final dag a = new dag();
    public static final List<String> b = u63.a0("id", "jobTitles");

    @Override // defpackage.ga
    public final z9g.c a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        ArrayList arrayList = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 1) {
                    break;
                }
                cag cagVar = cag.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(cagVar, false);
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
        if (arrayList != null) {
            return new z9g.c(strA, arrayList);
        }
        mh2.q(mb8Var, "jobTitles");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, z9g.c cVar) {
        z9g.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("id");
        ha.i.b(hc8Var, lb3Var, cVar2.a);
        hc8Var.u0("jobTitles");
        cag cagVar = cag.a;
        ArrayList arrayList = cVar2.b;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            cagVar.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
    }
}
