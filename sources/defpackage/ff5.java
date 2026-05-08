package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.cf5;
import defpackage.ha;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ff5 implements ga<cf5.b> {
    public static final ff5 a = new ff5();
    public static final List<String> b = u63.Z("leverConfigurations");

    @Override // defpackage.ga
    public final cf5.b a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        ArrayList arrayList = null;
        while (mb8Var.D1(b) == 0) {
            gf5 gf5Var = gf5.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(gf5Var, true);
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
            return new cf5.b(arrayList);
        }
        mh2.q(mb8Var, "leverConfigurations");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, cf5.b bVar) {
        cf5.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("leverConfigurations");
        gf5 gf5Var = gf5.a;
        ha.g gVar = ha.a;
        ArrayList arrayList = bVar2.a;
        hc8Var.m();
        for (Object obj : arrayList) {
            if (hc8Var instanceof ub9) {
                hc8Var.j();
                gf5Var.b(hc8Var, lb3Var, obj);
                hc8Var.t();
            } else {
                ub9 ub9Var = new ub9();
                ub9Var.j();
                gf5Var.b(ub9Var, lb3Var, obj);
                ub9Var.t();
                Object objH = ub9Var.h();
                objH.getClass();
                f.a(hc8Var, objH);
            }
        }
        hc8Var.l();
    }
}
