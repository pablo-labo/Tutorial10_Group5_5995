package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import com.datadog.android.rum.internal.RumFeature;
import defpackage.ha;
import defpackage.ow;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tw implements ga<ow.d> {
    public static final tw a = new tw();
    public static final List<String> b = u63.a0("id", RumFeature.EVENT_ATTRIBUTES_PROPERTY);

    @Override // defpackage.ga
    public final ow.d a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        ArrayList arrayList = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                str = (String) ha.a.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 1) {
                    break;
                }
                rw rwVar = rw.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(rwVar, false);
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
            mh2.q(mb8Var, "id");
            throw null;
        }
        if (arrayList != null) {
            return new ow.d(str, arrayList);
        }
        mh2.q(mb8Var, RumFeature.EVENT_ATTRIBUTES_PROPERTY);
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ow.d dVar) {
        ow.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, dVar2.a);
        hc8Var.u0(RumFeature.EVENT_ATTRIBUTES_PROPERTY);
        rw rwVar = rw.a;
        ArrayList arrayList = dVar2.b;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            rwVar.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
    }
}
