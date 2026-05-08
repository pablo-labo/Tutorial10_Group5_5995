package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class yf5 {
    public final Executor a;
    public final kwh b;

    public yf5(Executor executor, jvh jvhVar, jvh jvhVar2, jvh jvhVar3, kwh kwhVar) {
        this.a = executor;
        this.b = kwhVar;
    }

    public final HashMap a() {
        xxh xxhVar;
        HashSet<String> hashSet = new HashSet();
        kwh kwhVar = this.b;
        jvh jvhVar = kwhVar.a;
        hashSet.addAll(kwh.b(jvhVar));
        jvh jvhVar2 = kwhVar.b;
        hashSet.addAll(kwh.b(jvhVar2));
        HashMap map = new HashMap();
        for (String str : hashSet) {
            String strA = kwh.a(jvhVar, str);
            if (strA != null) {
                xxhVar = new xxh(strA, 2);
            } else {
                String strA2 = kwh.a(jvhVar2, str);
                xxhVar = strA2 != null ? new xxh(strA2, 1) : new xxh("", 0);
            }
            map.put(str, xxhVar);
        }
        return map;
    }
}
