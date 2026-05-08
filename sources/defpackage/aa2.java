package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class aa2 {
    public static final <T> List<T> a(List<? extends T> list) {
        int size = list.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(z92.O0(list)) : zr4.a;
    }

    public static final <K, V> Map<K, V> b(Map<K, ? extends V> map) {
        int size = map.size();
        if (size == 0) {
            return bs4.a;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) z92.N0(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}
