package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.ha;
import defpackage.yda;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hea implements ga<yda.h> {
    public static final hea a = new hea();
    public static final List<String> b = u63.a0("navigationBar", "hamburgerMenu", "categorizedHamburgerMenu");

    @Override // defpackage.ga
    public final yda.h a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        yda.g gVar = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                gea geaVar = gea.a;
                ha.g gVar2 = ha.a;
                gVar = (yda.g) new ena(geaVar, false).a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                dea deaVar = dea.a;
                ha.g gVar3 = ha.a;
                ena enaVar = new ena(deaVar, false);
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
                if (iD1 != 2) {
                    break;
                }
                bea beaVar = bea.a;
                ha.g gVar4 = ha.a;
                ena enaVar2 = new ena(beaVar, false);
                mb8Var.m();
                arrayList2 = new ArrayList();
                while (mb8Var.hasNext()) {
                    try {
                        arrayList2.add(enaVar2.a(mb8Var, lb3Var));
                    } catch (ApolloGraphQLException e2) {
                        while (mb8Var.hasNext()) {
                            mb8Var.I();
                        }
                        mb8Var.l();
                        throw e2;
                    }
                }
                mb8Var.l();
            }
        }
        if (gVar == null) {
            mh2.q(mb8Var, "navigationBar");
            throw null;
        }
        if (arrayList == null) {
            mh2.q(mb8Var, "hamburgerMenu");
            throw null;
        }
        if (arrayList2 != null) {
            return new yda.h(gVar, arrayList, arrayList2);
        }
        mh2.q(mb8Var, "categorizedHamburgerMenu");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, yda.h hVar) {
        yda.h hVar2 = hVar;
        hc8Var.getClass();
        lb3Var.getClass();
        hVar2.getClass();
        hc8Var.u0("navigationBar");
        gea geaVar = gea.a;
        ha.g gVar = ha.a;
        yda.g gVar2 = hVar2.a;
        hc8Var.j();
        geaVar.b(hc8Var, lb3Var, gVar2);
        hc8Var.t();
        hc8Var.u0("hamburgerMenu");
        dea deaVar = dea.a;
        ArrayList arrayList = hVar2.b;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            deaVar.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
        hc8Var.u0("categorizedHamburgerMenu");
        bea beaVar = bea.a;
        ArrayList arrayList2 = hVar2.c;
        hc8Var.m();
        for (Object obj2 : arrayList2) {
            hc8Var.j();
            beaVar.b(hc8Var, lb3Var, obj2);
            hc8Var.t();
        }
        hc8Var.l();
    }
}
