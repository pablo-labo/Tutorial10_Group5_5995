package defpackage;

import defpackage.gwe;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class qb9<K, V> extends vg8<K, V, Map.Entry<? extends K, ? extends V>> {
    public final f7e c;

    public static final class a<K, V> implements Map.Entry<K, V>, ze8 {
        public final K a;
        public final V b;

        public a(K k, V v) {
            this.a = k;
            this.b = v;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return wl7.b(this.a, aVar.a) && wl7.b(this.b, aVar.b);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.a;
            int iHashCode = (k == null ? 0 : k.hashCode()) * 31;
            V v = this.b;
            return iHashCode + (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final String toString() {
            return "MapEntry(key=" + this.a + ", value=" + this.b + ')';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb9(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        super(kSerializer, kSerializer2);
        kSerializer.getClass();
        kSerializer2.getClass();
        this.c = i7e.b("kotlin.collections.Map.Entry", gwe.c.a, new SerialDescriptor[0], new bb3(3, kSerializer, kSerializer2));
    }

    @Override // defpackage.vg8
    public final Object a(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        return entry.getKey();
    }

    @Override // defpackage.vg8
    public final Object b(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        return entry.getValue();
    }

    @Override // defpackage.vg8
    public final Object c(Object obj, Object obj2) {
        return new a(obj, obj2);
    }

    @Override // defpackage.r7e, defpackage.i04
    /* JADX INFO: renamed from: getDescriptor */
    public final SerialDescriptor get$$serialDesc() {
        return this.c;
    }
}
