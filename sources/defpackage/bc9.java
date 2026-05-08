package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public final class bc9<K, V> implements Map<K, V>, ze8 {
    public final knd<K, V> a;
    public sv4<K, V> b;
    public rh8<K, V> c;
    public ulg<K, V> d;

    public bc9(knd<K, V> kndVar) {
        kndVar.getClass();
        this.a = kndVar;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V compute(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V computeIfAbsent(K k, Function<? super K, ? extends V> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V computeIfPresent(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.b(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.a.c(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        sv4<K, V> sv4Var = this.b;
        if (sv4Var != null) {
            return sv4Var;
        }
        sv4<K, V> sv4Var2 = new sv4<>(this.a);
        this.b = sv4Var2;
        return sv4Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bc9.class != obj.getClass()) {
            return false;
        }
        return wl7.b(this.a, ((bc9) obj).a);
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return this.a.d(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.a.e();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        rh8<K, V> rh8Var = this.c;
        if (rh8Var != null) {
            return rh8Var;
        }
        rh8<K, V> rh8Var2 = new rh8<>(this.a);
        this.c = rh8Var2;
        return rh8Var2;
    }

    @Override // java.util.Map
    public final V merge(K k, V v, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V putIfAbsent(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V replace(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.a.e;
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        ulg<K, V> ulgVar = this.d;
        if (ulgVar != null) {
            return ulgVar;
        }
        ulg<K, V> ulgVar2 = new ulg<>(this.a);
        this.d = ulgVar2;
        return ulgVar2;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(K k, V v, V v2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
