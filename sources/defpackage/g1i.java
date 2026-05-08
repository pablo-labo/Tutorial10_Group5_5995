package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class g1i<K> implements Map.Entry<K, Object> {
    public Map.Entry<K, b1i> a;

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.a.getValue() == null) {
            return null;
        }
        int i = b1i.c;
        throw new NoSuchMethodError();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof l3i)) {
            l5.q("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            return null;
        }
        b1i value = this.a.getValue();
        l3i l3iVar = value.a;
        value.b = null;
        value.a = (l3i) obj;
        return l3iVar;
    }
}
