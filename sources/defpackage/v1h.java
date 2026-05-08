package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.ha;
import defpackage.s1h;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class v1h implements ga<s1h.c> {
    public static final v1h a = new v1h();
    public static final List<String> b = u63.a0("label", "selectionLimit", "workAreas");

    @Override // defpackage.ga
    public final s1h.c a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        Integer num = null;
        ArrayList arrayList = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                str = (String) ha.a.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                num = (Integer) ha.b.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 2) {
                    break;
                }
                u1h u1hVar = u1h.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(u1hVar, false);
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
        if (str == null) {
            mh2.q(mb8Var, "label");
            throw null;
        }
        if (num == null) {
            mh2.q(mb8Var, "selectionLimit");
            throw null;
        }
        int iIntValue = num.intValue();
        if (arrayList != null) {
            return new s1h.c(iIntValue, str, arrayList);
        }
        mh2.q(mb8Var, "workAreas");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, s1h.c cVar) {
        s1h.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("label");
        ha.a.b(hc8Var, lb3Var, cVar2.a);
        hc8Var.u0("selectionLimit");
        ha.b.b(hc8Var, lb3Var, Integer.valueOf(cVar2.b));
        hc8Var.u0("workAreas");
        u1h u1hVar = u1h.a;
        ArrayList arrayList = cVar2.c;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            u1hVar.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
    }
}
