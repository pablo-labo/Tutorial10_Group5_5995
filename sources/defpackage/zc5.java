package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.ha;
import defpackage.vc5;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zc5 implements ga<vc5.c> {
    public static final zc5 a = new zc5();
    public static final List<String> b = u63.a0("conversations", "pageInfo");

    @Override // defpackage.ga
    public final vc5.c a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        ArrayList arrayList = null;
        vc5.d dVar = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                xc5 xc5Var = xc5.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(xc5Var, true);
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
                ad5 ad5Var = ad5.a;
                ha.g gVar2 = ha.a;
                dVar = (vc5.d) new ena(ad5Var, false).a(mb8Var, lb3Var);
            }
        }
        if (arrayList == null) {
            mh2.q(mb8Var, "conversations");
            throw null;
        }
        if (dVar != null) {
            return new vc5.c(arrayList, dVar);
        }
        mh2.q(mb8Var, "pageInfo");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, vc5.c cVar) {
        vc5.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("conversations");
        xc5 xc5Var = xc5.a;
        ha.g gVar = ha.a;
        ArrayList arrayList = cVar2.a;
        hc8Var.m();
        for (Object obj : arrayList) {
            if (hc8Var instanceof ub9) {
                ub9 ub9Var = (ub9) hc8Var;
                ub9Var.j();
                xc5Var.b(hc8Var, lb3Var, obj);
                ub9Var.t();
            } else {
                ub9 ub9Var2 = new ub9();
                ub9Var2.j();
                xc5Var.b(ub9Var2, lb3Var, obj);
                ub9Var2.t();
                Object objH = ub9Var2.h();
                objH.getClass();
                f.a(hc8Var, objH);
            }
        }
        hc8Var.l();
        hc8Var.u0("pageInfo");
        ad5 ad5Var = ad5.a;
        vc5.d dVar = cVar2.b;
        hc8Var.j();
        ad5Var.b(hc8Var, lb3Var, dVar);
        hc8Var.t();
    }
}
