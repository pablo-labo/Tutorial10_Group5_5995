package defpackage;

import java.util.Map;
import java.util.Map.Entry;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f3<E extends Map.Entry<? extends K, ? extends V>, K, V> extends n3<E> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return ((ib9) this).a.o((Map.Entry) obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return ((ib9) this).a.w((Map.Entry) obj);
    }
}
