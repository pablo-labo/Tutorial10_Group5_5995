package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class t96 implements do2 {
    private final Map<String, q96> contextGenerators;

    public t96(LinkedHashMap linkedHashMap) {
        this.contextGenerators = linkedHashMap;
    }

    public final ArrayList a() {
        Map<String, q96> map = this.contextGenerators;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, q96> entry : map.entrySet()) {
            arrayList.add(new s96(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }
}
