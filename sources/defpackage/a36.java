package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import com.datadog.android.rum.internal.RumFeature;
import defpackage.ha;
import defpackage.v26;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a36 implements ga<v26.d> {
    public static final a36 a = new a36();
    public static final List<String> b = u63.Z(RumFeature.EVENT_ATTRIBUTES_PROPERTY);

    @Override // defpackage.ga
    public final v26.d a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        ArrayList arrayList = null;
        while (mb8Var.D1(b) == 0) {
            x26 x26Var = x26.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(x26Var, false);
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
            return new v26.d(arrayList);
        }
        mh2.q(mb8Var, RumFeature.EVENT_ATTRIBUTES_PROPERTY);
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, v26.d dVar) {
        v26.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0(RumFeature.EVENT_ATTRIBUTES_PROPERTY);
        x26 x26Var = x26.a;
        ha.g gVar = ha.a;
        ArrayList arrayList = dVar2.a;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            x26Var.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
    }
}
