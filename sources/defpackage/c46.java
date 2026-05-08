package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.ha;
import defpackage.mb8;
import defpackage.s36;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c46 implements ga<s36.i> {
    public static final c46 a = new c46();
    public static final List<String> b = u63.a0("resume", "defaultInfo");

    @Override // defpackage.ga
    public final s36.i a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        ArrayList arrayList = null;
        s36.c cVar = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                d46 d46Var = d46.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(d46Var, false);
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
                w36 w36Var = w36.a;
                ha.g gVar2 = ha.a;
                ena enaVar2 = new ena(w36Var, false);
                if (mb8Var.peek() == mb8.a.Y) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = enaVar2.a(mb8Var, lb3Var);
                }
                cVar = (s36.c) objA;
            }
        }
        if (arrayList != null) {
            return new s36.i(arrayList, cVar);
        }
        mh2.q(mb8Var, "resume");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, s36.i iVar) {
        s36.i iVar2 = iVar;
        hc8Var.getClass();
        lb3Var.getClass();
        iVar2.getClass();
        hc8Var.u0("resume");
        d46 d46Var = d46.a;
        ha.g gVar = ha.a;
        ArrayList arrayList = iVar2.a;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            d46Var.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
        hc8Var.u0("defaultInfo");
        ena enaVar = new ena(w36.a, false);
        s36.c cVar = iVar2.b;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
    }
}
