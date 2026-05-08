package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class oc1 extends InheritableThreadLocal<Map<String, String>> {
    @Override // java.lang.InheritableThreadLocal
    public final Map<String, String> childValue(Map<String, String> map) {
        Map<String, String> map2 = map;
        if (map2 == null) {
            return null;
        }
        return new HashMap(map2);
    }
}
