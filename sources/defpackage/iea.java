package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.ha;
import defpackage.yda;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class iea implements ga<yda.i> {
    public static final iea a = new iea();
    public static final List<String> b = u63.a0("countryCode", "countryName", "baseIndeedUrl", "supportedLanguages");

    @Override // defpackage.ga
    public final yda.i a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        Object objA = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                objA = ha.g.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                str = (String) ha.a.a(mb8Var, lb3Var);
            } else if (iD1 == 2) {
                str2 = (String) ha.a.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 3) {
                    break;
                }
                ha.a aVar = ha.g;
                ArrayList arrayListH = v40.h(mb8Var);
                while (mb8Var.hasNext()) {
                    try {
                        arrayListH.add(aVar.a(mb8Var, lb3Var));
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
        if (objA == null) {
            mh2.q(mb8Var, "countryCode");
            throw null;
        }
        if (str == null) {
            mh2.q(mb8Var, "countryName");
            throw null;
        }
        if (str2 == null) {
            mh2.q(mb8Var, "baseIndeedUrl");
            throw null;
        }
        if (arrayList != null) {
            return new yda.i(objA, str, str2, arrayList);
        }
        mh2.q(mb8Var, "supportedLanguages");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, yda.i iVar) {
        yda.i iVar2 = iVar;
        hc8Var.getClass();
        lb3Var.getClass();
        iVar2.getClass();
        hc8Var.u0("countryCode");
        ha.a aVar = ha.g;
        f.a(hc8Var, iVar2.a);
        hc8Var.u0("countryName");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, iVar2.b);
        hc8Var.u0("baseIndeedUrl");
        gVar.b(hc8Var, lb3Var, iVar2.c);
        hc8Var.u0("supportedLanguages");
        ArrayList arrayList = iVar2.d;
        hc8Var.m();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            aVar.b(hc8Var, lb3Var, it.next());
        }
        hc8Var.l();
    }
}
