package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.bl;
import defpackage.ha;
import defpackage.mb8;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gl implements ga<bl.d> {
    public static final gl a = new gl();
    public static final List<String> b = u63.a0("id", "relocation", "locations");

    @Override // defpackage.ga
    public final bl.d a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        bl.e eVar = null;
        ArrayList arrayList = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                hl hlVar = hl.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(hlVar, false);
                if (mb8Var.peek() == mb8.a.Y) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = enaVar.a(mb8Var, lb3Var);
                }
                eVar = (bl.e) objA;
            } else {
                if (iD1 != 2) {
                    break;
                }
                fl flVar = fl.a;
                ha.g gVar2 = ha.a;
                ena enaVar2 = new ena(flVar, false);
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
            return new bl.d(strA, eVar, arrayList);
        }
        mh2.q(mb8Var, "locations");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, bl.d dVar) {
        bl.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("id");
        ha.i.b(hc8Var, lb3Var, dVar2.a);
        hc8Var.u0("relocation");
        ena enaVar = new ena(hl.a, false);
        bl.e eVar = dVar2.b;
        if (eVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, eVar);
        }
        hc8Var.u0("locations");
        fl flVar = fl.a;
        ArrayList arrayList = dVar2.c;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            flVar.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
    }
}
