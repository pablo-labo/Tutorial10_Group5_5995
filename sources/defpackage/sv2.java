package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.ha;
import defpackage.jv2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class sv2 implements ga<jv2.h> {
    public static final sv2 a = new sv2();
    public static final List<String> b = u63.Z("labels");

    @Override // defpackage.ga
    public final jv2.h a(mb8 mb8Var, lb3 lb3Var) {
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
            return new jv2.h(arrayList);
        }
        mh2.q(mb8Var, "labels");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, jv2.h hVar) {
        jv2.h hVar2 = hVar;
        hc8Var.getClass();
        lb3Var.getClass();
        hVar2.getClass();
        hc8Var.u0("labels");
        ha.g gVar = ha.a;
        ArrayList arrayList = hVar2.a;
        hc8Var.m();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            gVar.b(hc8Var, lb3Var, it.next());
        }
        hc8Var.l();
    }
}
