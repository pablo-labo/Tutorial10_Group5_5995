package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import defpackage.ha;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bbf implements ga<xaf> {
    public static final List<String> a = u63.a0("label", "sectionIds", "suid", "taxonomyConceptId", "type", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX);

    public static xaf c(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        ArrayList arrayList = null;
        String strA2 = null;
        String strA3 = null;
        String strA4 = null;
        ArrayList arrayList2 = null;
        while (true) {
            int iD1 = mb8Var.D1(a);
            if (iD1 == 0) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                abf abfVar = abf.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(abfVar, false);
                mb8Var.m();
                ArrayList arrayList3 = new ArrayList();
                while (mb8Var.hasNext()) {
                    try {
                        arrayList3.add(enaVar.a(mb8Var, lb3Var));
                    } catch (ApolloGraphQLException e) {
                        while (mb8Var.hasNext()) {
                            mb8Var.I();
                        }
                        mb8Var.l();
                        throw e;
                    }
                }
                mb8Var.l();
                arrayList = arrayList3;
            } else if (iD1 == 2) {
                strA2 = ha.i.a(mb8Var, lb3Var);
            } else if (iD1 == 3) {
                strA3 = ha.i.a(mb8Var, lb3Var);
            } else if (iD1 == 4) {
                strA4 = ha.i.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 5) {
                    break;
                }
                zaf zafVar = zaf.a;
                ha.g gVar2 = ha.a;
                ena enaVar2 = new ena(zafVar, false);
                mb8Var.m();
                ArrayList arrayList4 = new ArrayList();
                while (mb8Var.hasNext()) {
                    try {
                        arrayList4.add(enaVar2.a(mb8Var, lb3Var));
                    } catch (ApolloGraphQLException e2) {
                        while (mb8Var.hasNext()) {
                            mb8Var.I();
                        }
                        mb8Var.l();
                        throw e2;
                    }
                }
                mb8Var.l();
                arrayList2 = arrayList4;
            }
        }
        if (arrayList == null) {
            mh2.q(mb8Var, "sectionIds");
            throw null;
        }
        if (arrayList2 != null) {
            return new xaf(strA, arrayList, strA2, strA3, strA4, arrayList2);
        }
        mh2.q(mb8Var, RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX);
        throw null;
    }
}
