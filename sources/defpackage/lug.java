package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class lug<K, V> implements Map<K, V> {
    public final ReferenceQueue<K> a = new ReferenceQueue<>();
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public class a implements Map.Entry<K, V> {
        public final /* synthetic */ Object a;
        public final /* synthetic */ Object b;

        public a(Object obj, Object obj2) {
            this.a = obj;
            this.b = obj2;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return (K) this.a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return (V) this.b;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            throw new UnsupportedOperationException();
        }
    }

    public class b extends WeakReference<K> {
        public final int a;

        public b(lug lugVar, Object obj) {
            super(obj, lugVar.a);
            this.a = System.identityHashCode(obj);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && get() == ((b) obj).get();
        }

        public final int hashCode() {
            return this.a;
        }
    }

    public final synchronized void a() {
        Reference<? extends K> referencePoll = this.a.poll();
        while (referencePoll != null) {
            this.b.remove((b) referencePoll);
            referencePoll = this.a.poll();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        this.b.clear();
        a();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        a();
        return this.b.containsKey(new b(this, obj));
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        a();
        return this.b.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        a();
        HashSet hashSet = new HashSet();
        for (Map.Entry<K, V> entry : this.b.entrySet()) {
            hashSet.add(new a(((b) entry.getKey()).get(), entry.getValue()));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof lug)) {
            return false;
        }
        return this.b.equals(((lug) obj).b);
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        a();
        return (V) this.b.get(new b(this, obj));
    }

    @Override // java.util.Map
    public final int hashCode() {
        a();
        return this.b.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        a();
        return this.b.isEmpty();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        a();
        HashSet hashSet = new HashSet();
        Iterator<K> it = this.b.keySet().iterator();
        while (it.hasNext()) {
            hashSet.add(((b) it.next()).get());
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        a();
        return (V) this.b.put(new b(this, k), v);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        a();
        return (V) this.b.remove(new b(this, obj));
    }

    @Override // java.util.Map
    public final int size() {
        a();
        return this.b.size();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        a();
        return this.b.values();
    }
}
