package defpackage;

import defpackage.qn9;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class un9 {
    public final xqc a;

    public un9(xqc xqcVar, i90 i90Var) {
        this.a = xqcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final qn9.c a(defpackage.w27 r16, qn9.b r17, defpackage.iie r18, defpackage.umd r19) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.un9.a(w27, qn9$b, iie, umd):qn9$c");
    }

    public final qn9.b b(w27 w27Var, Object obj, nva nvaVar, cz4 cz4Var) {
        String strA;
        Map<String, String> map = w27Var.e;
        List<Pair<jh8<? extends Object>, yd8<? extends Object>>> list = this.a.d.c;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                strA = null;
                break;
            }
            Pair<jh8<? extends Object>, yd8<? extends Object>> pair = list.get(i);
            jh8<? extends Object> jh8VarA = pair.a();
            if (pair.b().n(obj)) {
                jh8VarA.getClass();
                strA = jh8VarA.a(obj, nvaVar);
                if (strA != null) {
                    break;
                }
            }
            i++;
        }
        if (strA == null) {
            return null;
        }
        LinkedHashMap linkedHashMapI0 = lc9.i0(map);
        if (!((List) r55.a(w27Var, z27.a)).isEmpty()) {
            linkedHashMapI0.put("coil#size", nvaVar.b.toString());
        }
        return new qn9.b(strA, linkedHashMapI0);
    }
}
