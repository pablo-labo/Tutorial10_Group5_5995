package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.ha;
import defpackage.jo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lo implements ga<jo.a> {
    public static final lo a = new lo();
    public static final List<String> b = u63.Z("patents");

    @Override // defpackage.ga
    public final jo.a a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        ArrayList arrayList = null;
        while (mb8Var.D1(b) == 0) {
            no noVar = no.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(noVar, true);
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
            return new jo.a(arrayList);
        }
        mh2.q(mb8Var, "patents");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, jo.a aVar) {
        jo.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("patents");
        no noVar = no.a;
        ha.g gVar = ha.a;
        ArrayList arrayList = aVar2.a;
        hc8Var.m();
        for (Object obj : arrayList) {
            if (hc8Var instanceof ub9) {
                hc8Var.j();
                noVar.b(hc8Var, lb3Var, obj);
                hc8Var.t();
            } else {
                ub9 ub9Var = new ub9();
                ub9Var.j();
                noVar.b(ub9Var, lb3Var, obj);
                ub9Var.t();
                Object objH = ub9Var.h();
                objH.getClass();
                f.a(hc8Var, objH);
            }
        }
        hc8Var.l();
    }
}
