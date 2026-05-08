package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class utf<K, V> extends ttf<K, V, Map.Entry<? extends K, ? extends V>> {
    @Override // java.util.Iterator
    public final Object next() {
        int i = this.c;
        this.c = i + 2;
        Object[] objArr = this.a;
        return new nb9(objArr[i], objArr[i + 1]);
    }
}
