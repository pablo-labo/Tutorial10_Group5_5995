package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public class kc9 extends zkd {
    public static int V(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static <K, V> Map<K, V> W(Pair<? extends K, ? extends V> pair) {
        pair.getClass();
        Map<K, V> mapSingletonMap = Collections.singletonMap(pair.d(), pair.e());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static TreeMap X(LinkedHashMap linkedHashMap, Comparator comparator) {
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(linkedHashMap);
        return treeMap;
    }
}
