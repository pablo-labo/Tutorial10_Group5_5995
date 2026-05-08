package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.ha;
import defpackage.wv3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zv3 implements ga<wv3.b> {
    public static final zv3 a = new zv3();
    public static final List<String> b = u63.Z("linkIds");

    @Override // defpackage.ga
    public final wv3.b a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        ArrayList arrayList = null;
        while (mb8Var.D1(b) == 0) {
            ha.g gVar = ha.a;
            ArrayList arrayListH = v40.h(mb8Var);
            while (mb8Var.hasNext()) {
                try {
                    arrayListH.add(gVar.a(mb8Var, lb3Var));
                } catch (ApolloGraphQLException e) {
                    while (mb8Var.hasNext()) {
                        mb8Var.I();
                    }
                    mb8Var.l();
                    throw e;
                }
            }
            mb8Var.l();
            arrayList = arrayListH;
        }
        if (arrayList != null) {
            return new wv3.b(arrayList);
        }
        mh2.q(mb8Var, "linkIds");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, wv3.b bVar) {
        wv3.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("linkIds");
        ha.g gVar = ha.a;
        ArrayList arrayList = bVar2.a;
        hc8Var.m();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            gVar.b(hc8Var, lb3Var, it.next());
        }
        hc8Var.l();
    }
}
