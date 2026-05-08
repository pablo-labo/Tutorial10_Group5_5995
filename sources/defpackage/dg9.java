package defpackage;

import defpackage.j4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dg9 {
    public static final ArrayList a(ql7 ql7Var) {
        ql7Var.getClass();
        pm8 pm8VarH1 = ((cg9) ql7Var).H1();
        boolean zB = b(pm8VarH1);
        List<pm8> listE = pm8VarH1.E();
        j4a.a aVar = (j4a.a) listE;
        ArrayList arrayList = new ArrayList(aVar.a.c);
        int size = listE.size();
        for (int i = 0; i < size; i++) {
            pm8 pm8Var = (pm8) aVar.get(i);
            arrayList.add(zB ? pm8Var.B() : pm8Var.C());
        }
        return arrayList;
    }

    public static final boolean b(pm8 pm8Var) {
        int iOrdinal = pm8Var.u0.d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            l.g();
                            return false;
                        }
                        pm8 pm8VarK = pm8Var.K();
                        if (pm8VarK != null) {
                            return b(pm8VarK);
                        }
                        l5.q("no parent for idle node");
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
}
