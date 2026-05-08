package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.ha;
import defpackage.mb8;
import defpackage.vag;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zag implements ga<vag.c> {
    public static final zag a = new zag();
    public static final List<String> b = u63.a0("id", "relocation", "locations");

    @Override // defpackage.ga
    public final vag.c a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        vag.d dVar = null;
        ArrayList arrayList = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                abg abgVar = abg.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(abgVar, false);
                if (mb8Var.peek() == mb8.a.Y) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = enaVar.a(mb8Var, lb3Var);
                }
                dVar = (vag.d) objA;
            } else {
                if (iD1 != 2) {
                    break;
                }
                yag yagVar = yag.a;
                ha.g gVar2 = ha.a;
                ena enaVar2 = new ena(yagVar, false);
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
            return new vag.c(strA, dVar, arrayList);
        }
        mh2.q(mb8Var, "locations");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, vag.c cVar) {
        vag.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("id");
        ha.i.b(hc8Var, lb3Var, cVar2.a);
        hc8Var.u0("relocation");
        ena enaVar = new ena(abg.a, false);
        vag.d dVar = cVar2.b;
        if (dVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, dVar);
        }
        hc8Var.u0("locations");
        yag yagVar = yag.a;
        ArrayList arrayList = cVar2.c;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            yagVar.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
    }
}
