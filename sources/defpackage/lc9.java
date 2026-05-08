package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public class lc9 extends kc9 {
    public static Object Y(Object obj, Map map) {
        map.getClass();
        if (map instanceof ac9) {
            return ((ac9) map).e();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        s6.j(v40.e(obj, "Key ", " is missing in the map."));
        return null;
    }

    public static <K, V> HashMap<K, V> Z(Pair<? extends K, ? extends V>... pairArr) {
        HashMap<K, V> map = new HashMap<>(kc9.V(pairArr.length));
        e0(map, pairArr);
        return map;
    }

    public static <K, V> Map<K, V> a0(Pair<? extends K, ? extends V>... pairArr) {
        if (pairArr.length <= 0) {
            return bs4.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(kc9.V(pairArr.length));
        e0(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static LinkedHashMap b0(Pair... pairArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kc9.V(pairArr.length));
        e0(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static LinkedHashMap c0(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static <K, V> Map<K, V> d0(Map<? extends K, ? extends V> map, Pair<? extends K, ? extends V> pair) {
        map.getClass();
        if (map.isEmpty()) {
            return kc9.W(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.d(), pair.e());
        return linkedHashMap;
    }

    public static final void e0(HashMap map, Pair[] pairArr) {
        for (Pair pair : pairArr) {
            map.put(pair.a(), pair.b());
        }
    }

    public static <K, V> Map<K, V> f0(Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return kc9.W((Pair) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(kc9.V(collection.size()));
                h0(iterable, linkedHashMap);
                return linkedHashMap;
            }
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            h0(iterable, linkedHashMap2);
            int size2 = linkedHashMap2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashMap2;
                }
                Map.Entry<K, V> next = linkedHashMap2.entrySet().iterator().next();
                Map<K, V> mapSingletonMap = Collections.singletonMap(next.getKey(), next.getValue());
                mapSingletonMap.getClass();
                return mapSingletonMap;
            }
        }
        return bs4.a;
    }

    public static <K, V> Map<K, V> g0(Map<? extends K, ? extends V> map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            return bs4.a;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> mapSingletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static void h0(Iterable iterable, LinkedHashMap linkedHashMap) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            linkedHashMap.put(pair.a(), pair.b());
        }
    }

    public static LinkedHashMap i0(Map map) {
        map.getClass();
        return new LinkedHashMap(map);
    }
}
