package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.ha;
import defpackage.q16;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t16 implements ga<q16.b> {
    public static final t16 a = new t16();
    public static final List<String> b = u63.Z("resumes");

    @Override // defpackage.ga
    public final q16.b a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        ArrayList arrayList = null;
        while (mb8Var.D1(b) == 0) {
            y16 y16Var = y16.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(y16Var, false);
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
            return new q16.b(arrayList);
        }
        mh2.q(mb8Var, "resumes");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, q16.b bVar) {
        q16.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("resumes");
        y16 y16Var = y16.a;
        ha.g gVar = ha.a;
        ArrayList arrayList = bVar2.a;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            y16Var.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
    }
}
