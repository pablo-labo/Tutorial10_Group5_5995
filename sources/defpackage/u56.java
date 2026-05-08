package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.ha;
import defpackage.p56;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class u56 implements ga<p56.d> {
    public static final u56 a = new u56();
    public static final List<String> b = u63.a0("uuid", "key", "label", "customClasses");

    @Override // defpackage.ga
    public final p56.d a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                str = (String) ha.a.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                str2 = (String) ha.a.a(mb8Var, lb3Var);
            } else if (iD1 == 2) {
                str3 = (String) ha.a.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 3) {
                    break;
                }
                r56 r56Var = r56.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(r56Var, false);
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
            mh2.q(mb8Var, "uuid");
            throw null;
        }
        if (str2 == null) {
            mh2.q(mb8Var, "key");
            throw null;
        }
        if (str3 == null) {
            mh2.q(mb8Var, "label");
            throw null;
        }
        if (arrayList != null) {
            return new p56.d(str, str2, str3, arrayList);
        }
        mh2.q(mb8Var, "customClasses");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, p56.d dVar) {
        p56.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("uuid");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, dVar2.a);
        hc8Var.u0("key");
        gVar.b(hc8Var, lb3Var, dVar2.b);
        hc8Var.u0("label");
        gVar.b(hc8Var, lb3Var, dVar2.c);
        hc8Var.u0("customClasses");
        r56 r56Var = r56.a;
        ArrayList arrayList = dVar2.d;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            r56Var.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
    }
}
