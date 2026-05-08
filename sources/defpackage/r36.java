package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.ha;
import defpackage.m36;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r36 implements ga<m36.d> {
    public static final r36 a = new r36();
    public static final List<String> b = u63.a0("id", "tags");

    @Override // defpackage.ga
    public final m36.d a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        ArrayList arrayList = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                str = (String) ha.a.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 1) {
                    break;
                }
                ha.g gVar = ha.a;
                ArrayList arrayListH = v40.h(mb8Var);
                while (mb8Var.hasNext()) {
                    try {
                        arrayListH.add(gVar.a(mb8Var, lb3Var));
                    } catch (ApolloGraphQLException e) {
                        while (mb8Var.hasNext()) {
                            mb8Var.I();
                        }
                        mb8Var.l();
                        throw e;
                    }
                }
                mb8Var.l();
                arrayList = arrayListH;
            }
        }
        if (str == null) {
            mh2.q(mb8Var, "id");
            throw null;
        }
        if (arrayList != null) {
            return new m36.d(str, arrayList);
        }
        mh2.q(mb8Var, "tags");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, m36.d dVar) {
        m36.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("id");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, dVar2.a);
        hc8Var.u0("tags");
        ArrayList arrayList = dVar2.b;
        hc8Var.m();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            gVar.b(hc8Var, lb3Var, it.next());
        }
        hc8Var.l();
    }
}
