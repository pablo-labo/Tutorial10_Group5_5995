package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public class nc9 extends mc9 {
    public static List j0(HashMap map) {
        map.getClass();
        if (map.size() != 0) {
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!it.hasNext()) {
                    return u63.Z(new Pair(entry.getKey(), entry.getValue()));
                }
                ArrayList arrayList = new ArrayList(map.size());
                arrayList.add(new Pair(entry.getKey(), entry.getValue()));
                do {
                    Map.Entry entry2 = (Map.Entry) it.next();
                    arrayList.add(new Pair(entry2.getKey(), entry2.getValue()));
                } while (it.hasNext());
                return arrayList;
            }
        }
        return zr4.a;
    }
}
