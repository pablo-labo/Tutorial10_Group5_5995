package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.ha;
import defpackage.mk;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class rk implements ga<mk.d> {
    public static final rk a = new rk();
    public static final List<String> b = u63.a0("id", "jobTitles");

    @Override // defpackage.ga
    public final mk.d a(mb8 mb8Var, lb3 lb3Var) {
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
                qk qkVar = qk.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(qkVar, false);
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
            return new mk.d(strA, arrayList);
        }
        mh2.q(mb8Var, "jobTitles");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, mk.d dVar) {
        mk.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("id");
        ha.i.b(hc8Var, lb3Var, dVar2.a);
        hc8Var.u0("jobTitles");
        qk qkVar = qk.a;
        ArrayList arrayList = dVar2.b;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            qkVar.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
    }
}
