package defpackage;

import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class gtc implements Map<String, Object>, ze8 {
    public final String a;
    public final Map<String, Object> b;
    public final LinkedHashMap c;

    public gtc(String str, Map map) {
        str.getClass();
        map.getClass();
        this.a = str;
        this.b = map;
    }

    public final Set<String> a() {
        Set<String> setKeySet = this.b.keySet();
        ArrayList arrayList = new ArrayList(t92.r0(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(this.a + JwtParser.SEPARATOR_CHAR + ((String) it.next()));
        }
        return z92.E1(arrayList);
    }

    public final Pair<gtc, Set<String>> b(gtc gtcVar, Long l) {
        gtcVar.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Map<String, Object> map = this.b;
        LinkedHashMap linkedHashMapI0 = lc9.i0(map);
        LinkedHashMap linkedHashMap = this.c;
        LinkedHashMap linkedHashMap2 = linkedHashMap != null ? new LinkedHashMap(linkedHashMap) : new LinkedHashMap();
        Iterator<Map.Entry<String, Object>> it = gtcVar.b.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String str = this.a;
            if (!zHasNext) {
                return new Pair<>(new gtc(str, linkedHashMapI0, linkedHashMap2), linkedHashSet);
            }
            Map.Entry<String, Object> next = it.next();
            String key = next.getKey();
            Object value = next.getValue();
            boolean zContainsKey = map.containsKey(key);
            Object obj = map.get(key);
            if (!zContainsKey || !wl7.b(obj, value)) {
                linkedHashMapI0.put(key, value);
                linkedHashSet.add(str + JwtParser.SEPARATOR_CHAR + key);
            }
            if (l != null) {
                linkedHashMap2.put(key, l);
            }
        }
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object compute(String str, BiFunction<? super String, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfAbsent(String str, Function<? super String, ? extends Object> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfPresent(String str, BiFunction<? super String, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.b.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.b.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, Object>> entrySet() {
        return this.b.entrySet();
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return this.b.get((String) obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.b.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object merge(String str, Object obj, BiFunction<? super Object, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object put(String str, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends Object> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object putIfAbsent(String str, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object replace(String str, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.b.size();
    }

    @Override // java.util.Map
    public final Collection<Object> values() {
        return this.b.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gtc(String str, Map map, LinkedHashMap linkedHashMap) {
        this(str, map);
        str.getClass();
        map.getClass();
        this.c = linkedHashMap;
    }
}
