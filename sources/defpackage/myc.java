package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.dyc;
import defpackage.ha;
import defpackage.mb8;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class myc implements ga<dyc.h> {
    public static final myc a = new myc();
    public static final List<String> b = u63.Z("accounts");

    @Override // defpackage.ga
    public final dyc.h a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        ArrayList arrayListH = null;
        while (mb8Var.D1(b) == 0) {
            fyc fycVar = fyc.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(fycVar, true);
            arrayListH = v40.h(mb8Var);
            while (mb8Var.hasNext()) {
                try {
                    if (mb8Var.peek() == mb8.a.Y) {
                        mb8Var.I();
                        objA = null;
                    } else {
                        objA = enaVar.a(mb8Var, lb3Var);
                    }
                    arrayListH.add(objA);
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
        if (arrayListH != null) {
            return new dyc.h(arrayListH);
        }
        mh2.q(mb8Var, "accounts");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, dyc.h hVar) {
        dyc.h hVar2 = hVar;
        hc8Var.getClass();
        lb3Var.getClass();
        hVar2.getClass();
        hc8Var.u0("accounts");
        fyc fycVar = fyc.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(fycVar, true);
        ArrayList arrayList = hVar2.a;
        hc8Var.m();
        for (Object obj : arrayList) {
            if (obj == null) {
                hc8Var.H1();
            } else {
                enaVar.b(hc8Var, lb3Var, obj);
            }
        }
        hc8Var.l();
    }
}
