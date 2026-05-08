package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class f1i<K> implements Iterator<Map.Entry<K, Object>> {
    public Iterator<Map.Entry<K, Object>> a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry<K, Object> next = this.a.next();
        if (!(next.getValue() instanceof b1i)) {
            return next;
        }
        g1i g1iVar = new g1i();
        g1iVar.a = next;
        return g1iVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
