package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class m6i<K> implements Iterator<Map.Entry<K, Object>> {
    public Iterator<Map.Entry<K, Object>> a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry<K, Object> next = this.a.next();
        if (!(next.getValue() instanceof b6i)) {
            return next;
        }
        g6i g6iVar = new g6i();
        g6iVar.a = next;
        return g6iVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
