package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class g6i<K> implements Map.Entry<K, Object> {
    public Map.Entry<K, b6i> a;

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.a.getValue() == null) {
            return null;
        }
        int i = b6i.b;
        throw new NoSuchMethodError();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof x8i)) {
            l5.q("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            return null;
        }
        b6i value = this.a.getValue();
        x8i x8iVar = value.a;
        value.a = (x8i) obj;
        return x8iVar;
    }
}
