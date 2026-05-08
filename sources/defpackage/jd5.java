package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.dd5;
import defpackage.ha;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jd5 implements ga<dd5.e> {
    public static final jd5 a = new jd5();
    public static final List<String> b = u63.Z("employers");

    @Override // defpackage.ga
    public final dd5.e a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        ArrayList arrayList = null;
        while (mb8Var.D1(b) == 0) {
            id5 id5Var = id5.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(id5Var, false);
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
            return new dd5.e(arrayList);
        }
        mh2.q(mb8Var, "employers");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, dd5.e eVar) {
        dd5.e eVar2 = eVar;
        hc8Var.getClass();
        lb3Var.getClass();
        eVar2.getClass();
        hc8Var.u0("employers");
        id5 id5Var = id5.a;
        ha.g gVar = ha.a;
        ArrayList arrayList = eVar2.a;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            id5Var.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
    }
}
