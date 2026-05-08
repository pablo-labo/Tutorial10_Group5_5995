package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.ha;
import defpackage.te5;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xe5 implements ga<te5.c> {
    public static final xe5 a = new xe5();
    public static final List<String> b = u63.Z("leverConfigurations");

    @Override // defpackage.ga
    public final te5.c a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        ArrayList arrayList = null;
        while (mb8Var.D1(b) == 0) {
            ze5 ze5Var = ze5.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(ze5Var, true);
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
            return new te5.c(arrayList);
        }
        mh2.q(mb8Var, "leverConfigurations");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, te5.c cVar) {
        te5.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("leverConfigurations");
        ze5 ze5Var = ze5.a;
        ha.g gVar = ha.a;
        ArrayList arrayList = cVar2.a;
        hc8Var.m();
        for (Object obj : arrayList) {
            if (hc8Var instanceof ub9) {
                hc8Var.j();
                ze5Var.b(hc8Var, lb3Var, obj);
                hc8Var.t();
            } else {
                ub9 ub9Var = new ub9();
                ub9Var.j();
                ze5Var.b(ub9Var, lb3Var, obj);
                ub9Var.t();
                Object objH = ub9Var.h();
                objH.getClass();
                f.a(hc8Var, objH);
            }
        }
        hc8Var.l();
    }
}
