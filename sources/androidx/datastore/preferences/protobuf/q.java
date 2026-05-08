package androidx.datastore.preferences.protobuf;

import defpackage.kn8;
import defpackage.l5;
import defpackage.sp9;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class q extends kn8 {

    public static class a<K> implements Map.Entry<K, Object> {
        public Map.Entry<K, q> a;

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.a.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            q value = this.a.getValue();
            if (value == null) {
                return null;
            }
            return value.a(null);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof sp9)) {
                l5.q("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
                return null;
            }
            q value = this.a.getValue();
            sp9 sp9Var = value.a;
            value.b = null;
            value.a = (sp9) obj;
            return sp9Var;
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
            if (!(next.getValue() instanceof q)) {
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

    public final boolean equals(Object obj) {
        return a(null).equals(obj);
    }

    public final int hashCode() {
        return a(null).hashCode();
    }

    public final String toString() {
        return a(null).toString();
    }
}
