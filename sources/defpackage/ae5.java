package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.ha;
import defpackage.sd5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ae5 implements ga<sd5.g> {
    public static final ae5 a = new ae5();
    public static final List<String> b = u63.Z("scopes");

    @Override // defpackage.ga
    public final sd5.g a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        mb8Var.getClass();
        lb3Var.getClass();
        ArrayList arrayListH = null;
        while (mb8Var.D1(b) == 0) {
            ha.g gVar = ha.a;
            arrayListH = v40.h(mb8Var);
            while (mb8Var.hasNext()) {
                try {
                    String strI0 = mb8Var.I0();
                    strI0.getClass();
                    ty7.a.getClass();
                    Iterator<T> it = ty7.f.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (wl7.b(((ty7) next).a(), strI0)) {
                            break;
                        }
                    }
                    ty7 ty7Var = (ty7) next;
                    if (ty7Var == null) {
                        ty7Var = ty7.d;
                    }
                    arrayListH.add(ty7Var);
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
            return new sd5.g(arrayListH);
        }
        mh2.q(mb8Var, "scopes");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, sd5.g gVar) {
        sd5.g gVar2 = gVar;
        hc8Var.getClass();
        lb3Var.getClass();
        gVar2.getClass();
        hc8Var.u0("scopes");
        ha.g gVar3 = ha.a;
        ArrayList<ty7> arrayList = gVar2.a;
        hc8Var.m();
        for (ty7 ty7Var : arrayList) {
            ty7Var.getClass();
            hc8Var.T0(ty7Var.a());
        }
        hc8Var.l();
    }
}
