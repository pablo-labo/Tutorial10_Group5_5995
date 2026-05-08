package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.e46;
import defpackage.ha;
import defpackage.mb8;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class s46 implements ga<e46.m> {
    public static final s46 a = new s46();
    public static final List<String> b = u63.a0("resume", "fraudMetadata");

    @Override // defpackage.ga
    public final e46.m a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        ArrayList arrayList = null;
        e46.f fVar = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                u46 u46Var = u46.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(u46Var, false);
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
                if (iD1 != 1) {
                    break;
                }
                l46 l46Var = l46.a;
                ha.g gVar2 = ha.a;
                ena enaVar2 = new ena(l46Var, false);
                if (mb8Var.peek() == mb8.a.Y) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = enaVar2.a(mb8Var, lb3Var);
                }
                fVar = (e46.f) objA;
            }
        }
        if (arrayList != null) {
            return new e46.m(arrayList, fVar);
        }
        mh2.q(mb8Var, "resume");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, e46.m mVar) {
        e46.m mVar2 = mVar;
        hc8Var.getClass();
        lb3Var.getClass();
        mVar2.getClass();
        hc8Var.u0("resume");
        u46 u46Var = u46.a;
        ha.g gVar = ha.a;
        ArrayList arrayList = mVar2.a;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            u46Var.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
        hc8Var.u0("fraudMetadata");
        ena enaVar = new ena(l46.a, false);
        e46.f fVar = mVar2.b;
        if (fVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, fVar);
        }
    }
}
