package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.ha;
import defpackage.k16;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class p16 implements ga<k16.d> {
    public static final p16 a = new p16();
    public static final List<String> b = u63.Z("fileInformation");

    @Override // defpackage.ga
    public final k16.d a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        ArrayList arrayList = null;
        while (mb8Var.D1(b) == 0) {
            n16 n16Var = n16.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(n16Var, false);
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
            return new k16.d(arrayList);
        }
        mh2.q(mb8Var, "fileInformation");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, k16.d dVar) {
        k16.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("fileInformation");
        n16 n16Var = n16.a;
        ha.g gVar = ha.a;
        ArrayList arrayList = dVar2.a;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            n16Var.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
    }
}
