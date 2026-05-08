package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class um1 {
    public static final ra8 a = sa8.a(new tb(2));
    public static final LinkedHashMap b;

    static {
        ic2[] ic2VarArrValues = ic2.values();
        int iV = kc9.V(ic2VarArrValues.length);
        if (iV < 16) {
            iV = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iV);
        for (ic2 ic2Var : ic2VarArrValues) {
            linkedHashMap.put(ic2Var.a(), ic2Var);
        }
        b = linkedHashMap;
    }
}
