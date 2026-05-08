package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.ha;
import defpackage.yda;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bea implements ga<yda.b> {
    public static final bea a = new bea();
    public static final List<String> b = u63.a0("id", "label", "items");

    @Override // defpackage.ga
    public final yda.b a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        mb8Var.getClass();
        lb3Var.getClass();
        tca tcaVar = null;
        String strA = null;
        ArrayList arrayList = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                String strI0 = mb8Var.I0();
                strI0.getClass();
                tca.a.getClass();
                Iterator<T> it = tca.e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (wl7.b(((tca) next).a(), strI0)) {
                        break;
                    }
                }
                tca tcaVar2 = (tca) next;
                tcaVar = tcaVar2 == null ? tca.c : tcaVar2;
            } else if (iD1 == 1) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 2) {
                    break;
                }
                eea eeaVar = eea.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(eeaVar, false);
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
        if (tcaVar == null) {
            mh2.q(mb8Var, "id");
            throw null;
        }
        if (arrayList != null) {
            return new yda.b(tcaVar, strA, arrayList);
        }
        mh2.q(mb8Var, "items");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, yda.b bVar) {
        yda.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("id");
        hc8Var.T0(bVar2.a.a());
        hc8Var.u0("label");
        ha.i.b(hc8Var, lb3Var, bVar2.b);
        hc8Var.u0("items");
        eea eeaVar = eea.a;
        ArrayList arrayList = bVar2.c;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            eeaVar.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
    }
}
