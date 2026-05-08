package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.fqb;
import defpackage.ha;
import defpackage.mb8;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class nqb implements ga<fqb.g> {
    public static final nqb a = new nqb();
    public static final List<String> b = u63.a0("defaultInfo", "resume");

    @Override // defpackage.ga
    public final fqb.g a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        fqb.c cVar = null;
        ArrayList arrayList = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                jqb jqbVar = jqb.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(jqbVar, false);
                if (mb8Var.peek() == mb8.a.Y) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = enaVar.a(mb8Var, lb3Var);
                }
                cVar = (fqb.c) objA;
            } else {
                if (iD1 != 1) {
                    break;
                }
                oqb oqbVar = oqb.a;
                ha.g gVar2 = ha.a;
                ena enaVar2 = new ena(oqbVar, false);
                mb8Var.m();
                arrayList = new ArrayList();
                while (mb8Var.hasNext()) {
                    try {
                        arrayList.add(enaVar2.a(mb8Var, lb3Var));
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
        if (arrayList != null) {
            return new fqb.g(cVar, arrayList);
        }
        mh2.q(mb8Var, "resume");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, fqb.g gVar) {
        fqb.g gVar2 = gVar;
        hc8Var.getClass();
        lb3Var.getClass();
        gVar2.getClass();
        hc8Var.u0("defaultInfo");
        jqb jqbVar = jqb.a;
        ha.g gVar3 = ha.a;
        ena enaVar = new ena(jqbVar, false);
        fqb.c cVar = gVar2.a;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
        hc8Var.u0("resume");
        oqb oqbVar = oqb.a;
        ArrayList arrayList = gVar2.b;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            oqbVar.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
    }
}
