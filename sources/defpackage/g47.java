package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class g47<K, V> extends HashMap<K, V> {
    public g47() {
        throw null;
    }

    public static Map d(String str, String str2) {
        HashMap map = new HashMap(1);
        map.put(str, str2);
        return Collections.unmodifiableMap(map);
    }

    public static Map f(String str, String str2, String str3, String str4) {
        HashMap map = new HashMap(2);
        map.put(str, str2);
        map.put(str3, str4);
        return Collections.unmodifiableMap(map);
    }
}
