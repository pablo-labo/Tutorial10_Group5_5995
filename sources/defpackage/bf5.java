package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import com.datadog.android.rum.internal.RumFeature;
import defpackage.ha;
import defpackage.te5;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bf5 implements ga<te5.g> {
    public static final bf5 a = new bf5();
    public static final List<String> b = u63.a0("id", "label", "questionAnswerLimit", RumFeature.EVENT_ATTRIBUTES_PROPERTY);

    @Override // defpackage.ga
    public final te5.g a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        String strA = null;
        Integer numA = null;
        ArrayList arrayList = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                str = (String) ha.a.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else if (iD1 == 2) {
                numA = ha.k.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 3) {
                    break;
                }
                ve5 ve5Var = ve5.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(ve5Var, false);
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
            return new te5.g(str, strA, numA, arrayList);
        }
        mh2.q(mb8Var, RumFeature.EVENT_ATTRIBUTES_PROPERTY);
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, te5.g gVar) {
        te5.g gVar2 = gVar;
        hc8Var.getClass();
        lb3Var.getClass();
        gVar2.getClass();
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, gVar2.a);
        hc8Var.u0("label");
        ha.i.b(hc8Var, lb3Var, gVar2.b);
        hc8Var.u0("questionAnswerLimit");
        ha.k.b(hc8Var, lb3Var, gVar2.c);
        hc8Var.u0(RumFeature.EVENT_ATTRIBUTES_PROPERTY);
        ve5 ve5Var = ve5.a;
        ArrayList arrayList = gVar2.d;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            ve5Var.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
    }
}
