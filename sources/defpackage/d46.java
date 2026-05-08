package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.ha;
import defpackage.mb8;
import defpackage.s36;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d46 implements ga<s36.j> {
    public static final d46 a = new d46();
    public static final List<String> b = u63.a0("id", "firstName", "lastName", "headline", "phoneNumber", "employmentEligibilities", "showPhoneNumber", "location");

    @Override // defpackage.ga
    public final s36.j a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        String strA = null;
        String strA2 = null;
        String strA3 = null;
        String strA4 = null;
        ArrayList arrayList = null;
        Boolean boolA = null;
        s36.g gVar = null;
        while (true) {
            switch (mb8Var.D1(b)) {
                case 0:
                    str = (String) ha.a.a(mb8Var, lb3Var);
                    break;
                case 1:
                    strA = ha.i.a(mb8Var, lb3Var);
                    break;
                case 2:
                    strA2 = ha.i.a(mb8Var, lb3Var);
                    break;
                case 3:
                    strA3 = ha.i.a(mb8Var, lb3Var);
                    break;
                case 4:
                    strA4 = ha.i.a(mb8Var, lb3Var);
                    break;
                case 5:
                    x36 x36Var = x36.a;
                    ha.g gVar2 = ha.a;
                    ena enaVar = new ena(x36Var, false);
                    mb8Var.m();
                    ArrayList arrayList2 = new ArrayList();
                    while (mb8Var.hasNext()) {
                        try {
                            arrayList2.add(enaVar.a(mb8Var, lb3Var));
                        } catch (ApolloGraphQLException e) {
                            while (mb8Var.hasNext()) {
                                mb8Var.I();
                            }
                            mb8Var.l();
                            throw e;
                        }
                    }
                    mb8Var.l();
                    arrayList = arrayList2;
                    break;
                case 6:
                    boolA = ha.l.a(mb8Var, lb3Var);
                    break;
                case 7:
                    a46 a46Var = a46.a;
                    ha.g gVar3 = ha.a;
                    ena enaVar2 = new ena(a46Var, false);
                    if (mb8Var.peek() == mb8.a.Y) {
                        mb8Var.I();
                        objA = null;
                    } else {
                        objA = enaVar2.a(mb8Var, lb3Var);
                    }
                    gVar = (s36.g) objA;
                    break;
                default:
                    if (str == null) {
                        mh2.q(mb8Var, "id");
                        throw null;
                    }
                    if (arrayList != null) {
                        return new s36.j(str, strA, strA2, strA3, strA4, arrayList, boolA, gVar);
                    }
                    mh2.q(mb8Var, "employmentEligibilities");
                    throw null;
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, s36.j jVar) {
        s36.j jVar2 = jVar;
        hc8Var.getClass();
        lb3Var.getClass();
        jVar2.getClass();
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, jVar2.a);
        hc8Var.u0("firstName");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, jVar2.b);
        hc8Var.u0("lastName");
        nmaVar.b(hc8Var, lb3Var, jVar2.c);
        hc8Var.u0("headline");
        nmaVar.b(hc8Var, lb3Var, jVar2.d);
        hc8Var.u0("phoneNumber");
        nmaVar.b(hc8Var, lb3Var, jVar2.e);
        hc8Var.u0("employmentEligibilities");
        x36 x36Var = x36.a;
        ArrayList arrayList = jVar2.f;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            x36Var.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
        hc8Var.u0("showPhoneNumber");
        ha.l.b(hc8Var, lb3Var, jVar2.g);
        hc8Var.u0("location");
        ena enaVar = new ena(a46.a, false);
        s36.g gVar = jVar2.h;
        if (gVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, gVar);
        }
    }
}
