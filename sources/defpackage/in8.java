package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class in8 extends jn8 {

    public static class a<K> implements Map.Entry<K, Object> {
        public Map.Entry<K, in8> a;

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.a.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            in8 value = this.a.getValue();
            if (value == null) {
                return null;
            }
            return value.a();
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof rp9)) {
                l5.q("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
                return null;
            }
            in8 value = this.a.getValue();
            rp9 rp9Var = value.a;
            value.a = (rp9) obj;
            return rp9Var;
        }
    }

    public static class b<K> implements Iterator<Map.Entry<K, Object>> {
        public Iterator<Map.Entry<K, Object>> a;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.a.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.a.next();
            if (!(next.getValue() instanceof in8)) {
                return next;
            }
            a aVar = new a();
            aVar.a = next;
            return aVar;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.a.remove();
        }
    }

    public final rp9 a() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = null;
                    } catch (IOException unused) {
                    }
                }
            }
        }
        return this.a;
    }

    public final boolean equals(Object obj) {
        return a().equals(obj);
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
