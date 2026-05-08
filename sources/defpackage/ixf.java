package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ixf {
    public final LinkedHashMap a;

    public ixf(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public final ixf a() {
        LinkedHashMap linkedHashMap = this.a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(kc9.V(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            rw7 rw7Var = (rw7) entry.getValue();
            linkedHashMap2.put(key, new rw7(rw7Var.a, rw7Var.b, rw7Var.c, true));
        }
        return new ixf(linkedHashMap2);
    }
}
