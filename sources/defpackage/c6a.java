package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.ha;
import defpackage.p5a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c6a implements ga<p5a.l> {
    public static final c6a a = new c6a();
    public static final List<String> b = u63.Z("invitedJobs");

    @Override // defpackage.ga
    public final p5a.l a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        ArrayList arrayList = null;
        while (mb8Var.D1(b) == 0) {
            y5a y5aVar = y5a.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(y5aVar, false);
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
            return new p5a.l(arrayList);
        }
        mh2.q(mb8Var, "invitedJobs");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, p5a.l lVar) {
        p5a.l lVar2 = lVar;
        hc8Var.getClass();
        lb3Var.getClass();
        lVar2.getClass();
        hc8Var.u0("invitedJobs");
        y5a y5aVar = y5a.a;
        ha.g gVar = ha.a;
        ArrayList arrayList = lVar2.a;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            y5aVar.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
    }
}
