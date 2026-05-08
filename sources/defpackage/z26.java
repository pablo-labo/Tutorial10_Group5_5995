package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.ha;
import defpackage.v26;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class z26 implements ga<v26.c> {
    public static final z26 a = new z26();
    public static final List<String> b = u63.Z("positivePreferenceAttributesByCustomClass");

    @Override // defpackage.ga
    public final v26.c a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        ArrayList arrayList = null;
        while (mb8Var.D1(b) == 0) {
            a36 a36Var = a36.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(a36Var, false);
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
        if (arrayList != null) {
            return new v26.c(arrayList);
        }
        mh2.q(mb8Var, "positivePreferenceAttributesByCustomClass");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, v26.c cVar) {
        v26.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("positivePreferenceAttributesByCustomClass");
        a36 a36Var = a36.a;
        ha.g gVar = ha.a;
        ArrayList arrayList = cVar2.a;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            a36Var.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
    }
}
